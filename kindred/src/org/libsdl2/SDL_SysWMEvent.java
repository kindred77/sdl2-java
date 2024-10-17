/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_SysWMEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_SysWMEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_SysWMEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_SysWMEvent obj) {
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
        sdl2javaJNI.delete_SDL_SysWMEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_SysWMEvent_type_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getType() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_SysWMEvent_type_get(swigCPtr, this), true);
  }

  public void setTimestamp(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_SysWMEvent_timestamp_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getTimestamp() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_SysWMEvent_timestamp_get(swigCPtr, this), true);
  }

  public void setMsg(SWIGTYPE_p_SDL_SysWMmsg value) {
    sdl2javaJNI.SDL_SysWMEvent_msg_set(swigCPtr, this, SWIGTYPE_p_SDL_SysWMmsg.getCPtr(value));
  }

  public SWIGTYPE_p_SDL_SysWMmsg getMsg() {
    long cPtr = sdl2javaJNI.SDL_SysWMEvent_msg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SDL_SysWMmsg(cPtr, false);
  }

  public SDL_SysWMEvent() {
    this(sdl2javaJNI.new_SDL_SysWMEvent(), true);
  }

}