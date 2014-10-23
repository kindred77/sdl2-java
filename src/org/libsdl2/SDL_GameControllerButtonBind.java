/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_GameControllerButtonBind {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_GameControllerButtonBind(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_GameControllerButtonBind obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_GameControllerButtonBind(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBindType(SDL_GameControllerBindType value) {
    sdl2javaJNI.SDL_GameControllerButtonBind_bindType_set(swigCPtr, this, value.swigValue());
  }

  public SDL_GameControllerBindType getBindType() {
    return SDL_GameControllerBindType.swigToEnum(sdl2javaJNI.SDL_GameControllerButtonBind_bindType_get(swigCPtr, this));
  }

  public SDL_GameControllerButtonBind_value getValue() {
    long cPtr = sdl2javaJNI.SDL_GameControllerButtonBind_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_GameControllerButtonBind_value(cPtr, false);
  }

  public SDL_GameControllerButtonBind() {
    this(sdl2javaJNI.new_SDL_GameControllerButtonBind(), true);
  }

}
