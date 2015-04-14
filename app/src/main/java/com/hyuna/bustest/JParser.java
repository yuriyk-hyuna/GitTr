package com.hyuna.bustest;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Iurii on 3/30/2015.
 */
public class JParser extends JsonParser {
    @Override
    public ObjectCodec getCodec() {
        return null;
    }

    @Override
    public void setCodec(ObjectCodec c) {

    }

    @Override
    public Version version() {
        return null;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public JsonToken nextToken() throws IOException, JsonParseException {
        return null;
    }

    @Override
    public JsonToken nextValue() throws IOException, JsonParseException {
        return null;
    }

    @Override
    public JsonParser skipChildren() throws IOException, JsonParseException {
        return null;
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public JsonToken getCurrentToken() {
        return null;
    }

    @Override
    public int getCurrentTokenId() {
        return 0;
    }

    @Override
    public boolean hasCurrentToken() {
        return false;
    }

    @Override
    public String getCurrentName() throws IOException {
        return null;
    }

    @Override
    public JsonStreamContext getParsingContext() {
        return null;
    }

    @Override
    public JsonLocation getTokenLocation() {
        return null;
    }

    @Override
    public JsonLocation getCurrentLocation() {
        return null;
    }

    @Override
    public void clearCurrentToken() {

    }

    @Override
    public JsonToken getLastClearedToken() {
        return null;
    }

    @Override
    public void overrideCurrentName(String name) {

    }

    @Override
    public String getText() throws IOException {
        return null;
    }

    @Override
    public char[] getTextCharacters() throws IOException {
        return new char[0];
    }

    @Override
    public int getTextLength() throws IOException {
        return 0;
    }

    @Override
    public int getTextOffset() throws IOException {
        return 0;
    }

    @Override
    public boolean hasTextCharacters() {
        return false;
    }

    @Override
    public Number getNumberValue() throws IOException {
        return null;
    }

    @Override
    public NumberType getNumberType() throws IOException {
        return null;
    }

    @Override
    public int getIntValue() throws IOException {
        return 0;
    }

    @Override
    public long getLongValue() throws IOException {
        return 0;
    }

    @Override
    public BigInteger getBigIntegerValue() throws IOException {
        return null;
    }

    @Override
    public float getFloatValue() throws IOException {
        return 0;
    }

    @Override
    public double getDoubleValue() throws IOException {
        return 0;
    }

    @Override
    public BigDecimal getDecimalValue() throws IOException {
        return null;
    }

    @Override
    public Object getEmbeddedObject() throws IOException {
        return null;
    }

    @Override
    public byte[] getBinaryValue(Base64Variant bv) throws IOException {
        return new byte[0];
    }

    @Override
    public String getValueAsString(String def) throws IOException {
        return null;
    }
}
