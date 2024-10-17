/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_VirtualJoystickDesc {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_VirtualJoystickDesc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_VirtualJoystickDesc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_VirtualJoystickDesc obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_VirtualJoystickDesc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_version_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getVersion() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_version_get(swigCPtr, this), true);
  }

  public void setType(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_type_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getType() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_type_get(swigCPtr, this), true);
  }

  public void setNaxes(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_naxes_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getNaxes() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_naxes_get(swigCPtr, this), true);
  }

  public void setNbuttons(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_nbuttons_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getNbuttons() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_nbuttons_get(swigCPtr, this), true);
  }

  public void setNhats(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_nhats_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getNhats() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_nhats_get(swigCPtr, this), true);
  }

  public void setVendor_id(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_vendor_id_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getVendor_id() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_vendor_id_get(swigCPtr, this), true);
  }

  public void setProduct_id(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_product_id_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getProduct_id() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_product_id_get(swigCPtr, this), true);
  }

  public void setPadding(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_padding_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getPadding() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_VirtualJoystickDesc_padding_get(swigCPtr, this), true);
  }

  public void setButton_mask(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_button_mask_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getButton_mask() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_VirtualJoystickDesc_button_mask_get(swigCPtr, this), true);
  }

  public void setAxis_mask(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_axis_mask_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getAxis_mask() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_VirtualJoystickDesc_axis_mask_get(swigCPtr, this), true);
  }

  public void setName(String value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return sdl2javaJNI.SDL_VirtualJoystickDesc_name_get(swigCPtr, this);
  }

  public void setUserdata(SWIGTYPE_p_void value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_userdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserdata() {
    long cPtr = sdl2javaJNI.SDL_VirtualJoystickDesc_userdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setUpdate(SWIGTYPE_p_f_p_void__void value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_Update_set(swigCPtr, this, SWIGTYPE_p_f_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void__void getUpdate() {
    long cPtr = sdl2javaJNI.SDL_VirtualJoystickDesc_Update_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__void(cPtr, false);
  }

  public void setSetPlayerIndex(SWIGTYPE_p_f_p_void_int__void value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_SetPlayerIndex_set(swigCPtr, this, SWIGTYPE_p_f_p_void_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_int__void getSetPlayerIndex() {
    long cPtr = sdl2javaJNI.SDL_VirtualJoystickDesc_SetPlayerIndex_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_int__void(cPtr, false);
  }

  public void setRumble(SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_Rumble_set(swigCPtr, this, SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int getRumble() {
    long cPtr = sdl2javaJNI.SDL_VirtualJoystickDesc_Rumble_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int(cPtr, false);
  }

  public void setRumbleTriggers(SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_RumbleTriggers_set(swigCPtr, this, SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int getRumbleTriggers() {
    long cPtr = sdl2javaJNI.SDL_VirtualJoystickDesc_RumbleTriggers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_uint16_t_uint16_t__int(cPtr, false);
  }

  public void setSetLED(SWIGTYPE_p_f_p_void_uint8_t_uint8_t_uint8_t__int value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_SetLED_set(swigCPtr, this, SWIGTYPE_p_f_p_void_uint8_t_uint8_t_uint8_t__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_uint8_t_uint8_t_uint8_t__int getSetLED() {
    long cPtr = sdl2javaJNI.SDL_VirtualJoystickDesc_SetLED_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_uint8_t_uint8_t_uint8_t__int(cPtr, false);
  }

  public void setSendEffect(SWIGTYPE_p_f_p_void_p_q_const__void_int__int value) {
    sdl2javaJNI.SDL_VirtualJoystickDesc_SendEffect_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_q_const__void_int__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_q_const__void_int__int getSendEffect() {
    long cPtr = sdl2javaJNI.SDL_VirtualJoystickDesc_SendEffect_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_q_const__void_int__int(cPtr, false);
  }

  public SDL_VirtualJoystickDesc() {
    this(sdl2javaJNI.new_SDL_VirtualJoystickDesc(), true);
  }

}