/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.cas;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class Digest implements TBase, java.io.Serializable, Cloneable, Comparable<Digest> {
  private static final TStruct STRUCT_DESC = new TStruct("Digest");
  private static final TField HASH_FIELD_DESC = new TField("hash", TType.STRING, (short)1);
  private static final TField SIZE_BYTES_FIELD_DESC = new TField("size_bytes", TType.I64, (short)2);

  public String hash;
  public long size_bytes;
  public static final int HASH = 1;
  public static final int SIZE_BYTES = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SIZE_BYTES_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(HASH, new FieldMetaData("hash", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(SIZE_BYTES, new FieldMetaData("size_bytes", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Digest.class, metaDataMap);
  }

  public Digest() {
  }

  public Digest(
    String hash,
    long size_bytes)
  {
    this();
    this.hash = hash;
    this.size_bytes = size_bytes;
    setSize_bytesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Digest(Digest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetHash()) {
      this.hash = TBaseHelper.deepCopy(other.hash);
    }
    this.size_bytes = TBaseHelper.deepCopy(other.size_bytes);
  }

  public Digest deepCopy() {
    return new Digest(this);
  }

  @Deprecated
  public Digest clone() {
    return new Digest(this);
  }

  public String  getHash() {
    return this.hash;
  }

  public Digest setHash(String hash) {
    this.hash = hash;
    return this;
  }

  public void unsetHash() {
    this.hash = null;
  }

  // Returns true if field hash is set (has been assigned a value) and false otherwise
  public boolean isSetHash() {
    return this.hash != null;
  }

  public void setHashIsSet(boolean value) {
    if (!value) {
      this.hash = null;
    }
  }

  public long  getSize_bytes() {
    return this.size_bytes;
  }

  public Digest setSize_bytes(long size_bytes) {
    this.size_bytes = size_bytes;
    setSize_bytesIsSet(true);
    return this;
  }

  public void unsetSize_bytes() {
    __isset_bit_vector.clear(__SIZE_BYTES_ISSET_ID);
  }

  // Returns true if field size_bytes is set (has been assigned a value) and false otherwise
  public boolean isSetSize_bytes() {
    return __isset_bit_vector.get(__SIZE_BYTES_ISSET_ID);
  }

  public void setSize_bytesIsSet(boolean value) {
    __isset_bit_vector.set(__SIZE_BYTES_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case HASH:
      if (value == null) {
        unsetHash();
      } else {
        setHash((String)value);
      }
      break;

    case SIZE_BYTES:
      if (value == null) {
        unsetSize_bytes();
      } else {
        setSize_bytes((Long)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HASH:
      return getHash();

    case SIZE_BYTES:
      return new Long(getSize_bytes());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case HASH:
      return isSetHash();
    case SIZE_BYTES:
      return isSetSize_bytes();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Digest)
      return this.equals((Digest)that);
    return false;
  }

  public boolean equals(Digest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hash = true && this.isSetHash();
    boolean that_present_hash = true && that.isSetHash();
    if (this_present_hash || that_present_hash) {
      if (!(this_present_hash && that_present_hash))
        return false;
      if (!TBaseHelper.equalsNobinary(this.hash, that.hash))
        return false;
    }

    boolean this_present_size_bytes = true;
    boolean that_present_size_bytes = true;
    if (this_present_size_bytes || that_present_size_bytes) {
      if (!(this_present_size_bytes && that_present_size_bytes))
        return false;
      if (!TBaseHelper.equalsNobinary(this.size_bytes, that.size_bytes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Digest other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHash()).compareTo(other.isSetHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(hash, other.hash);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSize_bytes()).compareTo(other.isSetSize_bytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(size_bytes, other.size_bytes);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case HASH:
          if (field.type == TType.STRING) {
            this.hash = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SIZE_BYTES:
          if (field.type == TType.I64) {
            this.size_bytes = iprot.readI64();
            setSize_bytesIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.hash != null) {
      oprot.writeFieldBegin(HASH_FIELD_DESC);
      oprot.writeString(this.hash);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SIZE_BYTES_FIELD_DESC);
    oprot.writeI64(this.size_bytes);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("Digest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("hash");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getHash() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getHash(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("size_bytes");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSize_bytes(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
