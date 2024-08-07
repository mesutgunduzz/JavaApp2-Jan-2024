// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: randomtextgenerator.proto

package org.csystem.generator.random.text;

/**
 * Protobuf type {@code org.csystem.generator.random.text.RandomTextGeneratorRequest}
 */
public final class RandomTextGeneratorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.csystem.generator.random.text.RandomTextGeneratorRequest)
    RandomTextGeneratorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RandomTextGeneratorRequest.newBuilder() to construct.
  private RandomTextGeneratorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RandomTextGeneratorRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RandomTextGeneratorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RandomTextGeneratorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            count_ = input.readSInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.csystem.generator.random.text.Randomtextgenerator.internal_static_org_csystem_generator_random_text_RandomTextGeneratorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.csystem.generator.random.text.Randomtextgenerator.internal_static_org_csystem_generator_random_text_RandomTextGeneratorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.csystem.generator.random.text.RandomTextGeneratorRequest.class, org.csystem.generator.random.text.RandomTextGeneratorRequest.Builder.class);
  }

  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;
  /**
   * <code>sint32 count = 1;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (count_ != 0) {
      output.writeSInt32(1, count_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(1, count_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.csystem.generator.random.text.RandomTextGeneratorRequest)) {
      return super.equals(obj);
    }
    org.csystem.generator.random.text.RandomTextGeneratorRequest other = (org.csystem.generator.random.text.RandomTextGeneratorRequest) obj;

    if (getCount()
        != other.getCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.csystem.generator.random.text.RandomTextGeneratorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.csystem.generator.random.text.RandomTextGeneratorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.csystem.generator.random.text.RandomTextGeneratorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.csystem.generator.random.text.RandomTextGeneratorRequest)
      org.csystem.generator.random.text.RandomTextGeneratorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.csystem.generator.random.text.Randomtextgenerator.internal_static_org_csystem_generator_random_text_RandomTextGeneratorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.csystem.generator.random.text.Randomtextgenerator.internal_static_org_csystem_generator_random_text_RandomTextGeneratorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.csystem.generator.random.text.RandomTextGeneratorRequest.class, org.csystem.generator.random.text.RandomTextGeneratorRequest.Builder.class);
    }

    // Construct using org.csystem.generator.random.text.RandomTextGeneratorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      count_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.csystem.generator.random.text.Randomtextgenerator.internal_static_org_csystem_generator_random_text_RandomTextGeneratorRequest_descriptor;
    }

    @java.lang.Override
    public org.csystem.generator.random.text.RandomTextGeneratorRequest getDefaultInstanceForType() {
      return org.csystem.generator.random.text.RandomTextGeneratorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.csystem.generator.random.text.RandomTextGeneratorRequest build() {
      org.csystem.generator.random.text.RandomTextGeneratorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.csystem.generator.random.text.RandomTextGeneratorRequest buildPartial() {
      org.csystem.generator.random.text.RandomTextGeneratorRequest result = new org.csystem.generator.random.text.RandomTextGeneratorRequest(this);
      result.count_ = count_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.csystem.generator.random.text.RandomTextGeneratorRequest) {
        return mergeFrom((org.csystem.generator.random.text.RandomTextGeneratorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.csystem.generator.random.text.RandomTextGeneratorRequest other) {
      if (other == org.csystem.generator.random.text.RandomTextGeneratorRequest.getDefaultInstance()) return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.csystem.generator.random.text.RandomTextGeneratorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.csystem.generator.random.text.RandomTextGeneratorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int count_ ;
    /**
     * <code>sint32 count = 1;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <code>sint32 count = 1;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.csystem.generator.random.text.RandomTextGeneratorRequest)
  }

  // @@protoc_insertion_point(class_scope:org.csystem.generator.random.text.RandomTextGeneratorRequest)
  private static final org.csystem.generator.random.text.RandomTextGeneratorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.csystem.generator.random.text.RandomTextGeneratorRequest();
  }

  public static org.csystem.generator.random.text.RandomTextGeneratorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RandomTextGeneratorRequest>
      PARSER = new com.google.protobuf.AbstractParser<RandomTextGeneratorRequest>() {
    @java.lang.Override
    public RandomTextGeneratorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RandomTextGeneratorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RandomTextGeneratorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RandomTextGeneratorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.csystem.generator.random.text.RandomTextGeneratorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

