/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcFrontStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcFrontStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFrontStatusField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcFrontStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_FrontID_get(swigCPtr, this);
  }

  public void setLastReportDate(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_LastReportDate_set(swigCPtr, this, value);
  }

  public String getLastReportDate() {
    return jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_LastReportDate_get(swigCPtr, this);
  }

  public void setLastReportTime(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_LastReportTime_set(swigCPtr, this, value);
  }

  public String getLastReportTime() {
    return jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_LastReportTime_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpv6v3v13x64apiJNI.CThostFtdcFrontStatusField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcFrontStatusField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcFrontStatusField(), true);
  }

}
