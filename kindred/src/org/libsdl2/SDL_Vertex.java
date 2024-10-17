/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_Vertex {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_Vertex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_Vertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_Vertex obj) {
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
        sdl2javaJNI.delete_SDL_Vertex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPosition(SDL_FPoint value) {
    sdl2javaJNI.SDL_Vertex_position_set(swigCPtr, this, SDL_FPoint.getCPtr(value), value);
  }

  public SDL_FPoint getPosition() {
    long cPtr = sdl2javaJNI.SDL_Vertex_position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_FPoint(cPtr, false);
  }

  public void setColor(SWIGTYPE_p_SDL_Color value) {
    sdl2javaJNI.SDL_Vertex_color_set(swigCPtr, this, SWIGTYPE_p_SDL_Color.getCPtr(value));
  }

  public SWIGTYPE_p_SDL_Color getColor() {
    return new SWIGTYPE_p_SDL_Color(sdl2javaJNI.SDL_Vertex_color_get(swigCPtr, this), true);
  }

  public void setTex_coord(SDL_FPoint value) {
    sdl2javaJNI.SDL_Vertex_tex_coord_set(swigCPtr, this, SDL_FPoint.getCPtr(value), value);
  }

  public SDL_FPoint getTex_coord() {
    long cPtr = sdl2javaJNI.SDL_Vertex_tex_coord_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_FPoint(cPtr, false);
  }

  public SDL_Vertex() {
    this(sdl2javaJNI.new_SDL_Vertex(), true);
  }

}
