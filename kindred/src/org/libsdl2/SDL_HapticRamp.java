/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public class SDL_HapticRamp {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SDL_HapticRamp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_HapticRamp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SDL_HapticRamp obj) {
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
        sdl2javaJNI.delete_SDL_HapticRamp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_type_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getType() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_type_get(swigCPtr, this), true);
  }

  public void setDirection(SDL_HapticDirection value) {
    sdl2javaJNI.SDL_HapticRamp_direction_set(swigCPtr, this, SDL_HapticDirection.getCPtr(value), value);
  }

  public SDL_HapticDirection getDirection() {
    long cPtr = sdl2javaJNI.SDL_HapticRamp_direction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SDL_HapticDirection(cPtr, false);
  }

  public void setLength(SWIGTYPE_p_uint32_t value) {
    sdl2javaJNI.SDL_HapticRamp_length_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getLength() {
    return new SWIGTYPE_p_uint32_t(sdl2javaJNI.SDL_HapticRamp_length_get(swigCPtr, this), true);
  }

  public void setDelay(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_delay_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getDelay() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_delay_get(swigCPtr, this), true);
  }

  public void setButton(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_button_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getButton() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_button_get(swigCPtr, this), true);
  }

  public void setInterval(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_interval_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getInterval() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_interval_get(swigCPtr, this), true);
  }

  public void setStart(SWIGTYPE_p_int16_t value) {
    sdl2javaJNI.SDL_HapticRamp_start_set(swigCPtr, this, SWIGTYPE_p_int16_t.getCPtr(value));
  }

  public SWIGTYPE_p_int16_t getStart() {
    return new SWIGTYPE_p_int16_t(sdl2javaJNI.SDL_HapticRamp_start_get(swigCPtr, this), true);
  }

  public void setEnd(SWIGTYPE_p_int16_t value) {
    sdl2javaJNI.SDL_HapticRamp_end_set(swigCPtr, this, SWIGTYPE_p_int16_t.getCPtr(value));
  }

  public SWIGTYPE_p_int16_t getEnd() {
    return new SWIGTYPE_p_int16_t(sdl2javaJNI.SDL_HapticRamp_end_get(swigCPtr, this), true);
  }

  public void setAttack_length(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_attack_length_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getAttack_length() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_attack_length_get(swigCPtr, this), true);
  }

  public void setAttack_level(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_attack_level_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getAttack_level() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_attack_level_get(swigCPtr, this), true);
  }

  public void setFade_length(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_fade_length_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getFade_length() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_fade_length_get(swigCPtr, this), true);
  }

  public void setFade_level(SWIGTYPE_p_uint16_t value) {
    sdl2javaJNI.SDL_HapticRamp_fade_level_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getFade_level() {
    return new SWIGTYPE_p_uint16_t(sdl2javaJNI.SDL_HapticRamp_fade_level_get(swigCPtr, this), true);
  }

  public SDL_HapticRamp() {
    this(sdl2javaJNI.new_SDL_HapticRamp(), true);
  }

}