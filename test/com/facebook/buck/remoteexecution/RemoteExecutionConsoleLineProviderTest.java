/*
 * Copyright 2018-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.remoteexecution;

import com.facebook.buck.remoteexecution.RemoteExecutionActionEvent.State;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoteExecutionConsoleLineProviderTest {
  private TestStatsProvider statsProvider;

  @Before
  public void setUp() {
    this.statsProvider = new TestStatsProvider();
  }

  @Test
  public void testConsoleOutput() {
    statsProvider.casDownladedBytes = 42;
    statsProvider.casDownloads = 21;
    statsProvider.actionsPerState.put(State.ACTION_SUCCEEDED, 84);
    RemoteExecutionConsoleLineProvider provider =
        new RemoteExecutionConsoleLineProvider(true, true, statsProvider);
    List<String> lines = provider.createConsoleLinesAtTime(0);
    Assert.assertEquals(2, lines.size());
    Assert.assertEquals(
        "RE Actions: Local=0 Remote=[del=0 comp=0 upl=0 exec=0 dwl=0 suc=84 fail=0]", lines.get(0));
    Assert.assertEquals(
        "RE CAS: Upl=[Count:0 Size=0.00 bytes] Dwl=[Count:21 Size=42.00 bytes]", lines.get(1));
  }

  @Test
  public void testLoggingDisable() {
    RemoteExecutionConsoleLineProvider provider =
        new RemoteExecutionConsoleLineProvider(false, false, statsProvider);

    List<String> lines = provider.createConsoleLinesAtTime(0);
    Assert.assertEquals(0, lines.size());
  }

  private static final class TestStatsProvider implements RemoteExecutionStatsProvider {
    public Map<State, Integer> actionsPerState = Maps.newHashMap();
    public int casDownloads = 0;
    public int casDownladedBytes = 0;

    public TestStatsProvider() {
      for (State state : State.values()) {
        actionsPerState.put(state, new Integer(0));
      }
    }

    @Override
    public ImmutableMap<State, Integer> getActionsPerState() {
      return ImmutableMap.copyOf(actionsPerState);
    }

    @Override
    public int getCasDownloads() {
      return casDownloads;
    }

    @Override
    public long getCasDownloadSizeBytes() {
      return casDownladedBytes;
    }

    @Override
    public int getCasUploads() {
      return 0;
    }

    @Override
    public long getCasUploadSizeBytes() {
      return 0;
    }

    @Override
    public int getTotalRulesBuilt() {
      return 0;
    }
  }
}
