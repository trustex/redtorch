/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcQryTradeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTradeField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcQryTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_TradeID_get(swigCPtr, this);
  }

  public void setTradeTimeStart(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_TradeTimeStart_set(swigCPtr, this, value);
  }

  public String getTradeTimeStart() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_TradeTimeStart_get(swigCPtr, this);
  }

  public void setTradeTimeEnd(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_TradeTimeEnd_set(swigCPtr, this, value);
  }

  public String getTradeTimeEnd() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_TradeTimeEnd_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryTradeField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryTradeField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcQryTradeField(), true);
  }

}
