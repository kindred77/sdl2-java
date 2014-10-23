/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_QuitEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_QuitEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_QuitEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_QuitEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(long value) {
    sdl2javaJNI.SDL_QuitEvent_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return sdl2javaJNI.SDL_QuitEvent_type_get(swigCPtr, this);
  }

  public void setTimestamp(long value) {
    sdl2javaJNI.SDL_QuitEvent_timestamp_set(swigCPtr, this, value);
  }

  public long getTimestamp() {
    return sdl2javaJNI.SDL_QuitEvent_timestamp_get(swigCPtr, this);
  }

  public SDL_QuitEvent() {
    this(sdl2javaJNI.new_SDL_QuitEvent(), true);
  }

}
