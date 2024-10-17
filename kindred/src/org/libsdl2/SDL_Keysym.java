/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_Keysym {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_Keysym(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_Keysym obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_Keysym obj) {
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
        sdl2javaJNI.delete_SDL_Keysym(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setScancode(SDL_Scancode value) {
    sdl2javaJNI.SDL_Keysym_scancode_set(swigCPtr, this, value.swigValue());
  }

  public SDL_Scancode getScancode() {
    return SDL_Scancode.swigToEnum(sdl2javaJNI.SDL_Keysym_scancode_get(swigCPtr, this));
  }

  public void setSym(SWIGTYPE_p_int32_t value) {
    sdl2javaJNI.SDL_Keysym_sym_set(swigCPtr, this, SWIGTYPE_p_int32_t.getCPtr(value));
  }

  public SWIGTYPE_p_int32_t getSym() {
    return new SWIGTYPE_p_int32_t(sdl2javaJNI.SDL_Keysym_sym_get(swigCPtr, this), true);
  }

  public void setMod(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_Keysym_mod_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getMod() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_Keysym_mod_get(swigCPtr, this), true);
  }

  public void setUnused(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_Keysym_unused_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getUnused() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_Keysym_unused_get(swigCPtr, this), true);
  }

  public SDL_Keysym() {
    this(sdl2javaJNI.new_SDL_Keysym(), true);
  }

}