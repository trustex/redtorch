/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcDepositResultInformField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDepositResultInformField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDepositResultInformField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcDepositResultInformField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_Deposit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_RequestID_get(swigCPtr, this);
  }

  public void setReturnCode(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcDepositResultInformField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcDepositResultInformField(), true);
  }

}
