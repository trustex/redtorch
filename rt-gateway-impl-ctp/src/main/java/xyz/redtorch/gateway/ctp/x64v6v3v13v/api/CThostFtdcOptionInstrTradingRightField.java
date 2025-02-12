/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcOptionInstrTradingRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrTradingRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrTradingRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v13x64apiJNI.delete_CThostFtdcOptionInstrTradingRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_InvestorID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_Direction_get(swigCPtr, this);
  }

  public void setTradingRight(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_TradingRight_set(swigCPtr, this, value);
  }

  public char getTradingRight() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrTradingRightField_TradingRight_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrTradingRightField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcOptionInstrTradingRightField(), true);
  }

}
