/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class SupervisorWorkerHeartbeat implements org.apache.thrift.TBase<SupervisorWorkerHeartbeat, SupervisorWorkerHeartbeat._Fields>, java.io.Serializable, Cloneable, Comparable<SupervisorWorkerHeartbeat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SupervisorWorkerHeartbeat");

  private static final org.apache.thrift.protocol.TField STORM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("storm_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXECUTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("executors", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("time_secs", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SupervisorWorkerHeartbeatStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SupervisorWorkerHeartbeatTupleSchemeFactory());
  }

  private String storm_id; // required
  private List<ExecutorInfo> executors; // required
  private int time_secs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORM_ID((short)1, "storm_id"),
    EXECUTORS((short)2, "executors"),
    TIME_SECS((short)3, "time_secs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STORM_ID
          return STORM_ID;
        case 2: // EXECUTORS
          return EXECUTORS;
        case 3: // TIME_SECS
          return TIME_SECS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIME_SECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORM_ID, new org.apache.thrift.meta_data.FieldMetaData("storm_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTORS, new org.apache.thrift.meta_data.FieldMetaData("executors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ExecutorInfo.class))));
    tmpMap.put(_Fields.TIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("time_secs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SupervisorWorkerHeartbeat.class, metaDataMap);
  }

  public SupervisorWorkerHeartbeat() {
  }

  public SupervisorWorkerHeartbeat(
    String storm_id,
    List<ExecutorInfo> executors,
    int time_secs)
  {
    this();
    this.storm_id = storm_id;
    this.executors = executors;
    this.time_secs = time_secs;
    set_time_secs_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SupervisorWorkerHeartbeat(SupervisorWorkerHeartbeat other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_storm_id()) {
      this.storm_id = other.storm_id;
    }
    if (other.is_set_executors()) {
      List<ExecutorInfo> __this__executors = new ArrayList<ExecutorInfo>(other.executors.size());
      for (ExecutorInfo other_element : other.executors) {
        __this__executors.add(new ExecutorInfo(other_element));
      }
      this.executors = __this__executors;
    }
    this.time_secs = other.time_secs;
  }

  public SupervisorWorkerHeartbeat deepCopy() {
    return new SupervisorWorkerHeartbeat(this);
  }

  @Override
  public void clear() {
    this.storm_id = null;
    this.executors = null;
    set_time_secs_isSet(false);
    this.time_secs = 0;
  }

  public String get_storm_id() {
    return this.storm_id;
  }

  public void set_storm_id(String storm_id) {
    this.storm_id = storm_id;
  }

  public void unset_storm_id() {
    this.storm_id = null;
  }

  /** Returns true if field storm_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_storm_id() {
    return this.storm_id != null;
  }

  public void set_storm_id_isSet(boolean value) {
    if (!value) {
      this.storm_id = null;
    }
  }

  public int get_executors_size() {
    return (this.executors == null) ? 0 : this.executors.size();
  }

  public java.util.Iterator<ExecutorInfo> get_executors_iterator() {
    return (this.executors == null) ? null : this.executors.iterator();
  }

  public void add_to_executors(ExecutorInfo elem) {
    if (this.executors == null) {
      this.executors = new ArrayList<ExecutorInfo>();
    }
    this.executors.add(elem);
  }

  public List<ExecutorInfo> get_executors() {
    return this.executors;
  }

  public void set_executors(List<ExecutorInfo> executors) {
    this.executors = executors;
  }

  public void unset_executors() {
    this.executors = null;
  }

  /** Returns true if field executors is set (has been assigned a value) and false otherwise */
  public boolean is_set_executors() {
    return this.executors != null;
  }

  public void set_executors_isSet(boolean value) {
    if (!value) {
      this.executors = null;
    }
  }

  public int get_time_secs() {
    return this.time_secs;
  }

  public void set_time_secs(int time_secs) {
    this.time_secs = time_secs;
    set_time_secs_isSet(true);
  }

  public void unset_time_secs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_SECS_ISSET_ID);
  }

  /** Returns true if field time_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_time_secs() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_SECS_ISSET_ID);
  }

  public void set_time_secs_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_SECS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STORM_ID:
      if (value == null) {
        unset_storm_id();
      } else {
        set_storm_id((String)value);
      }
      break;

    case EXECUTORS:
      if (value == null) {
        unset_executors();
      } else {
        set_executors((List<ExecutorInfo>)value);
      }
      break;

    case TIME_SECS:
      if (value == null) {
        unset_time_secs();
      } else {
        set_time_secs((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STORM_ID:
      return get_storm_id();

    case EXECUTORS:
      return get_executors();

    case TIME_SECS:
      return get_time_secs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STORM_ID:
      return is_set_storm_id();
    case EXECUTORS:
      return is_set_executors();
    case TIME_SECS:
      return is_set_time_secs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SupervisorWorkerHeartbeat)
      return this.equals((SupervisorWorkerHeartbeat)that);
    return false;
  }

  public boolean equals(SupervisorWorkerHeartbeat that) {
    if (that == null)
      return false;

    boolean this_present_storm_id = true && this.is_set_storm_id();
    boolean that_present_storm_id = true && that.is_set_storm_id();
    if (this_present_storm_id || that_present_storm_id) {
      if (!(this_present_storm_id && that_present_storm_id))
        return false;
      if (!this.storm_id.equals(that.storm_id))
        return false;
    }

    boolean this_present_executors = true && this.is_set_executors();
    boolean that_present_executors = true && that.is_set_executors();
    if (this_present_executors || that_present_executors) {
      if (!(this_present_executors && that_present_executors))
        return false;
      if (!this.executors.equals(that.executors))
        return false;
    }

    boolean this_present_time_secs = true;
    boolean that_present_time_secs = true;
    if (this_present_time_secs || that_present_time_secs) {
      if (!(this_present_time_secs && that_present_time_secs))
        return false;
      if (this.time_secs != that.time_secs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_storm_id = true && (is_set_storm_id());
    list.add(present_storm_id);
    if (present_storm_id)
      list.add(storm_id);

    boolean present_executors = true && (is_set_executors());
    list.add(present_executors);
    if (present_executors)
      list.add(executors);

    boolean present_time_secs = true;
    list.add(present_time_secs);
    if (present_time_secs)
      list.add(time_secs);

    return list.hashCode();
  }

  @Override
  public int compareTo(SupervisorWorkerHeartbeat other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_storm_id()).compareTo(other.is_set_storm_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_storm_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storm_id, other.storm_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_executors()).compareTo(other.is_set_executors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executors, other.executors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_time_secs()).compareTo(other.is_set_time_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_time_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_secs, other.time_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SupervisorWorkerHeartbeat(");
    boolean first = true;

    sb.append("storm_id:");
    if (this.storm_id == null) {
      sb.append("null");
    } else {
      sb.append(this.storm_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executors:");
    if (this.executors == null) {
      sb.append("null");
    } else {
      sb.append(this.executors);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time_secs:");
    sb.append(this.time_secs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_storm_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'storm_id' is unset! Struct:" + toString());
    }

    if (!is_set_executors()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'executors' is unset! Struct:" + toString());
    }

    if (!is_set_time_secs()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'time_secs' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SupervisorWorkerHeartbeatStandardSchemeFactory implements SchemeFactory {
    public SupervisorWorkerHeartbeatStandardScheme getScheme() {
      return new SupervisorWorkerHeartbeatStandardScheme();
    }
  }

  private static class SupervisorWorkerHeartbeatStandardScheme extends StandardScheme<SupervisorWorkerHeartbeat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SupervisorWorkerHeartbeat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storm_id = iprot.readString();
              struct.set_storm_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXECUTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list870 = iprot.readListBegin();
                struct.executors = new ArrayList<ExecutorInfo>(_list870.size);
                ExecutorInfo _elem871;
                for (int _i872 = 0; _i872 < _list870.size; ++_i872)
                {
                  _elem871 = new ExecutorInfo();
                  _elem871.read(iprot);
                  struct.executors.add(_elem871);
                }
                iprot.readListEnd();
              }
              struct.set_executors_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.time_secs = iprot.readI32();
              struct.set_time_secs_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SupervisorWorkerHeartbeat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.storm_id != null) {
        oprot.writeFieldBegin(STORM_ID_FIELD_DESC);
        oprot.writeString(struct.storm_id);
        oprot.writeFieldEnd();
      }
      if (struct.executors != null) {
        oprot.writeFieldBegin(EXECUTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.executors.size()));
          for (ExecutorInfo _iter873 : struct.executors)
          {
            _iter873.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_SECS_FIELD_DESC);
      oprot.writeI32(struct.time_secs);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SupervisorWorkerHeartbeatTupleSchemeFactory implements SchemeFactory {
    public SupervisorWorkerHeartbeatTupleScheme getScheme() {
      return new SupervisorWorkerHeartbeatTupleScheme();
    }
  }

  private static class SupervisorWorkerHeartbeatTupleScheme extends TupleScheme<SupervisorWorkerHeartbeat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SupervisorWorkerHeartbeat struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.storm_id);
      {
        oprot.writeI32(struct.executors.size());
        for (ExecutorInfo _iter874 : struct.executors)
        {
          _iter874.write(oprot);
        }
      }
      oprot.writeI32(struct.time_secs);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SupervisorWorkerHeartbeat struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.storm_id = iprot.readString();
      struct.set_storm_id_isSet(true);
      {
        org.apache.thrift.protocol.TList _list875 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.executors = new ArrayList<ExecutorInfo>(_list875.size);
        ExecutorInfo _elem876;
        for (int _i877 = 0; _i877 < _list875.size; ++_i877)
        {
          _elem876 = new ExecutorInfo();
          _elem876.read(iprot);
          struct.executors.add(_elem876);
        }
      }
      struct.set_executors_isSet(true);
      struct.time_secs = iprot.readI32();
      struct.set_time_secs_isSet(true);
    }
  }

}

