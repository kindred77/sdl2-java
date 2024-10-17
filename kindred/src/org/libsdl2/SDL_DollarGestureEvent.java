/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_DollarGestureEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_DollarGestureEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_DollarGestureEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_DollarGestureEvent obj) {
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
        sdl2javaJNI.delete_SDL_DollarGestureEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_DollarGestureEvent_type_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getType() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_DollarGestureEvent_type_get(swigCPtr, this), true);
  }

  public void setTimestamp(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_DollarGestureEvent_timestamp_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getTimestamp() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_DollarGestureEvent_timestamp_get(swigCPtr, this), true);
  }

  public void setTouchId(SWIGTYPE_p_SDL_TouchID value) {
    sdl2javaJNI.SDL_DollarGestureEvent_touchId_set(swigCPtr, this, SWIGTYPE_p_SDL_TouchID.getCPtr(value));
  }

  public SWIGTYPE_p_SDL_TouchID getTouchId() {
    return new SWIGTYPE_p_SDL_TouchID(sdl2javaJNI.SDL_DollarGestureEvent_touchId_get(swigCPtr, this), true);
  }

  public void setGestureId(SWIGTYPE_p_SDL_GestureID value) {
    sdl2javaJNI.SDL_DollarGestureEvent_gestureId_set(swigCPtr, this, SWIGTYPE_p_SDL_GestureID.getCPtr(value));
  }

  public SWIGTYPE_p_SDL_GestureID getGestureId() {
    return new SWIGTYPE_p_SDL_GestureID(sdl2javaJNI.SDL_DollarGestureEvent_gestureId_get(swigCPtr, this), true);
  }

  public void setNumFingers(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_DollarGestureEvent_numFingers_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getNumFingers() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_DollarGestureEvent_numFingers_get(swigCPtr, this), true);
  }

  public void setError(float value) {
    sdl2javaJNI.SDL_DollarGestureEvent_error_set(swigCPtr, this, value);
  }

  public float getError() {
    return sdl2javaJNI.SDL_DollarGestureEvent_error_get(swigCPtr, this);
  }

  public void setX(float value) {
    sdl2javaJNI.SDL_DollarGestureEvent_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return sdl2javaJNI.SDL_DollarGestureEvent_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    sdl2javaJNI.SDL_DollarGestureEvent_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return sdl2javaJNI.SDL_DollarGestureEvent_y_get(swigCPtr, this);
  }

  public SDL_DollarGestureEvent() {
    this(sdl2javaJNI.new_SDL_DollarGestureEvent(), true);
  }

}