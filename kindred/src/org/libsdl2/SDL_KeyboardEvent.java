/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_KeyboardEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_KeyboardEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_KeyboardEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_KeyboardEvent obj) {
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
        sdl2javaJNI.delete_SDL_KeyboardEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_KeyboardEvent_type_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getType() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_KeyboardEvent_type_get(swigCPtr, this), true);
  }

  public void setTimestamp(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_KeyboardEvent_timestamp_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getTimestamp() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_KeyboardEvent_timestamp_get(swigCPtr, this), true);
  }

  public void setWindowID(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_KeyboardEvent_windowID_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getWindowID() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_KeyboardEvent_windowID_get(swigCPtr, this), true);
  }

  public void setState(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_KeyboardEvent_state_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getState() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_KeyboardEvent_state_get(swigCPtr, this), true);
  }

  public void setRepeat(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_KeyboardEvent_repeat_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getRepeat() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_KeyboardEvent_repeat_get(swigCPtr, this), true);
  }

  public void setPadding2(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_KeyboardEvent_padding2_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getPadding2() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_KeyboardEvent_padding2_get(swigCPtr, this), true);
  }

  public void setPadding3(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_KeyboardEvent_padding3_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getPadding3() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_KeyboardEvent_padding3_get(swigCPtr, this), true);
  }

  public void setKeysym(SDL_Keysym value) {
    sdl2javaJNI.SDL_KeyboardEvent_keysym_set(swigCPtr, this, SDL_Keysym.getCPtr(value), value);
  }

  public SDL_Keysym getKeysym() {
    long cPtr = sdl2javaJNI.SDL_KeyboardEvent_keysym_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_Keysym(cPtr, false);
  }

  public SDL_KeyboardEvent() {
    this(sdl2javaJNI.new_SDL_KeyboardEvent(), true);
  }

}
