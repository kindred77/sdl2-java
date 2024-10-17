/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_DisplayMode {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_DisplayMode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_DisplayMode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_DisplayMode obj) {
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
        sdl2javaJNI.delete_SDL_DisplayMode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFormat(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_DisplayMode_format_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getFormat() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_DisplayMode_format_get(swigCPtr, this), true);
  }

  public void setW(int value) {
    sdl2javaJNI.SDL_DisplayMode_w_set(swigCPtr, this, value);
  }

  public int getW() {
    return sdl2javaJNI.SDL_DisplayMode_w_get(swigCPtr, this);
  }

  public void setH(int value) {
    sdl2javaJNI.SDL_DisplayMode_h_set(swigCPtr, this, value);
  }

  public int getH() {
    return sdl2javaJNI.SDL_DisplayMode_h_get(swigCPtr, this);
  }

  public void setRefresh_rate(int value) {
    sdl2javaJNI.SDL_DisplayMode_refresh_rate_set(swigCPtr, this, value);
  }

  public int getRefresh_rate() {
    return sdl2javaJNI.SDL_DisplayMode_refresh_rate_get(swigCPtr, this);
  }

  public void setDriverdata(SWIGTYPE_p_void value) {
    sdl2javaJNI.SDL_DisplayMode_driverdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getDriverdata() {
    long cPtr = sdl2javaJNI.SDL_DisplayMode_driverdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SDL_DisplayMode() {
    this(sdl2javaJNI.new_SDL_DisplayMode(), true);
  }

}