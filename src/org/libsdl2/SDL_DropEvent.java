/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_DropEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_DropEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_DropEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_DropEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(long value) {
    sdl2javaJNI.SDL_DropEvent_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return sdl2javaJNI.SDL_DropEvent_type_get(swigCPtr, this);
  }

  public void setTimestamp(long value) {
    sdl2javaJNI.SDL_DropEvent_timestamp_set(swigCPtr, this, value);
  }

  public long getTimestamp() {
    return sdl2javaJNI.SDL_DropEvent_timestamp_get(swigCPtr, this);
  }

  public void setFile(String value) {
    sdl2javaJNI.SDL_DropEvent_file_set(swigCPtr, this, value);
  }

  public String getFile() {
    return sdl2javaJNI.SDL_DropEvent_file_get(swigCPtr, this);
  }

  public SDL_DropEvent() {
    this(sdl2javaJNI.new_SDL_DropEvent(), true);
  }

}