/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_ControllerDeviceEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_ControllerDeviceEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_ControllerDeviceEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_ControllerDeviceEvent obj) {
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
        sdl2javaJNI.delete_SDL_ControllerDeviceEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_ControllerDeviceEvent_type_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getType() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_ControllerDeviceEvent_type_get(swigCPtr, this), true);
  }

  public void setTimestamp(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_ControllerDeviceEvent_timestamp_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getTimestamp() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_ControllerDeviceEvent_timestamp_get(swigCPtr, this), true);
  }

  public void setWhich(SWIGTYPE_p_int32_t value) {
    sdl2javaJNI.SDL_ControllerDeviceEvent_which_set(swigCPtr, this, SWIGTYPE_p_int32_t.getCPtr(value));
  }

  public SWIGTYPE_p_int32_t getWhich() {
    return new SWIGTYPE_p_int32_t(sdl2javaJNI.SDL_ControllerDeviceEvent_which_get(swigCPtr, this), true);
  }

  public SDL_ControllerDeviceEvent() {
    this(sdl2javaJNI.new_SDL_ControllerDeviceEvent(), true);
  }

}
