/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_MouseWheelEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_MouseWheelEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_MouseWheelEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_MouseWheelEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(long value) {
    sdl2javaJNI.SDL_MouseWheelEvent_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return sdl2javaJNI.SDL_MouseWheelEvent_type_get(swigCPtr, this);
  }

  public void setTimestamp(long value) {
    sdl2javaJNI.SDL_MouseWheelEvent_timestamp_set(swigCPtr, this, value);
  }

  public long getTimestamp() {
    return sdl2javaJNI.SDL_MouseWheelEvent_timestamp_get(swigCPtr, this);
  }

  public void setWindowID(long value) {
    sdl2javaJNI.SDL_MouseWheelEvent_windowID_set(swigCPtr, this, value);
  }

  public long getWindowID() {
    return sdl2javaJNI.SDL_MouseWheelEvent_windowID_get(swigCPtr, this);
  }

  public void setWhich(long value) {
    sdl2javaJNI.SDL_MouseWheelEvent_which_set(swigCPtr, this, value);
  }

  public long getWhich() {
    return sdl2javaJNI.SDL_MouseWheelEvent_which_get(swigCPtr, this);
  }

  public void setX(int value) {
    sdl2javaJNI.SDL_MouseWheelEvent_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return sdl2javaJNI.SDL_MouseWheelEvent_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    sdl2javaJNI.SDL_MouseWheelEvent_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return sdl2javaJNI.SDL_MouseWheelEvent_y_get(swigCPtr, this);
  }

  public SDL_MouseWheelEvent() {
    this(sdl2javaJNI.new_SDL_MouseWheelEvent(), true);
  }

}
