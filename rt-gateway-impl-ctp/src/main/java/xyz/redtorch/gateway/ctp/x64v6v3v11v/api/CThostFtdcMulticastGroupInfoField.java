/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcMulticastGroupInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMulticastGroupInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMulticastGroupInfoField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcMulticastGroupInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setGroupIP(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMulticastGroupInfoField_GroupIP_set(swigCPtr, this, value);
  }

  public String getGroupIP() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMulticastGroupInfoField_GroupIP_get(swigCPtr, this);
  }

  public void setGroupPort(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMulticastGroupInfoField_GroupPort_set(swigCPtr, this, value);
  }

  public int getGroupPort() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMulticastGroupInfoField_GroupPort_get(swigCPtr, this);
  }

  public void setSourceIP(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMulticastGroupInfoField_SourceIP_set(swigCPtr, this, value);
  }

  public String getSourceIP() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMulticastGroupInfoField_SourceIP_get(swigCPtr, this);
  }

  public CThostFtdcMulticastGroupInfoField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcMulticastGroupInfoField(), true);
  }

}
