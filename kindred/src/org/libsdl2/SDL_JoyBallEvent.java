/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_JoyBallEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_JoyBallEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_JoyBallEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_JoyBallEvent obj) {
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
        sdl2javaJNI.delete_SDL_JoyBallEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_type_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getType() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_JoyBallEvent_type_get(swigCPtr, this), true);
  }

  public void setTimestamp(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_timestamp_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getTimestamp() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_JoyBallEvent_timestamp_get(swigCPtr, this), true);
  }

  public void setWhich(SWIGTYPE_p_int32_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_which_set(swigCPtr, this, SWIGTYPE_p_int32_t.getCPtr(value));
  }

  public SWIGTYPE_p_int32_t getWhich() {
    return new SWIGTYPE_p_int32_t(sdl2javaJNI.SDL_JoyBallEvent_which_get(swigCPtr, this), true);
  }

  public void setBall(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_ball_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getBall() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_JoyBallEvent_ball_get(swigCPtr, this), true);
  }

  public void setPadding1(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_padding1_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getPadding1() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_JoyBallEvent_padding1_get(swigCPtr, this), true);
  }

  public void setPadding2(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_padding2_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getPadding2() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_JoyBallEvent_padding2_get(swigCPtr, this), true);
  }

  public void setPadding3(SWIGTYPE_p_uint8_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_padding3_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getPadding3() {
    return new SWIGTYPE_p_uint8_t(sdl2javaJNI.SDL_JoyBallEvent_padding3_get(swigCPtr, this), true);
  }

  public void setXrel(SWIGTYPE_p_int16_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_xrel_set(swigCPtr, this, SWIGTYPE_p_int16_t.getCPtr(value));
  }

  public SWIGTYPE_p_int16_t getXrel() {
    return new SWIGTYPE_p_int16_t(sdl2javaJNI.SDL_JoyBallEvent_xrel_get(swigCPtr, this), true);
  }

  public void setYrel(SWIGTYPE_p_int16_t value) {
    sdl2javaJNI.SDL_JoyBallEvent_yrel_set(swigCPtr, this, SWIGTYPE_p_int16_t.getCPtr(value));
  }

  public SWIGTYPE_p_int16_t getYrel() {
    return new SWIGTYPE_p_int16_t(sdl2javaJNI.SDL_JoyBallEvent_yrel_get(swigCPtr, this), true);
  }

  public SDL_JoyBallEvent() {
    this(sdl2javaJNI.new_SDL_JoyBallEvent(), true);
  }

}