/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_Rect {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_Rect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_Rect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        sdl2javaJNI.delete_SDL_Rect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(int value) {
    sdl2javaJNI.SDL_Rect_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return sdl2javaJNI.SDL_Rect_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    sdl2javaJNI.SDL_Rect_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return sdl2javaJNI.SDL_Rect_y_get(swigCPtr, this);
  }

  public void setW(int value) {
    sdl2javaJNI.SDL_Rect_w_set(swigCPtr, this, value);
  }

  public int getW() {
    return sdl2javaJNI.SDL_Rect_w_get(swigCPtr, this);
  }

  public void setH(int value) {
    sdl2javaJNI.SDL_Rect_h_set(swigCPtr, this, value);
  }

  public int getH() {
    return sdl2javaJNI.SDL_Rect_h_get(swigCPtr, this);
  }

  public SDL_Rect() {
    this(sdl2javaJNI.new_SDL_Rect(), true);
  }

}
