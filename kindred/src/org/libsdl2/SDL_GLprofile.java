/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_GLprofile {
  public final static SDL_GLprofile SDL_GL_CONTEXT_PROFILE_CORE = new SDL_GLprofile("SDL_GL_CONTEXT_PROFILE_CORE", sdl2javaJNI.SDL_GL_CONTEXT_PROFILE_CORE_get());
  public final static SDL_GLprofile SDL_GL_CONTEXT_PROFILE_COMPATIBILITY = new SDL_GLprofile("SDL_GL_CONTEXT_PROFILE_COMPATIBILITY", sdl2javaJNI.SDL_GL_CONTEXT_PROFILE_COMPATIBILITY_get());
  public final static SDL_GLprofile SDL_GL_CONTEXT_PROFILE_ES = new SDL_GLprofile("SDL_GL_CONTEXT_PROFILE_ES", sdl2javaJNI.SDL_GL_CONTEXT_PROFILE_ES_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_GLprofile swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_GLprofile.class + " with value " + swigValue);
  }

  private SDL_GLprofile(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_GLprofile(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_GLprofile(String swigName, SDL_GLprofile swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_GLprofile[] swigValues = { SDL_GL_CONTEXT_PROFILE_CORE, SDL_GL_CONTEXT_PROFILE_COMPATIBILITY, SDL_GL_CONTEXT_PROFILE_ES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

