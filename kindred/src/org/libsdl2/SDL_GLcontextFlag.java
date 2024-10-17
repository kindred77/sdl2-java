/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_GLcontextFlag {
  public final static SDL_GLcontextFlag SDL_GL_CONTEXT_DEBUG_FLAG = new SDL_GLcontextFlag("SDL_GL_CONTEXT_DEBUG_FLAG", sdl2javaJNI.SDL_GL_CONTEXT_DEBUG_FLAG_get());
  public final static SDL_GLcontextFlag SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG = new SDL_GLcontextFlag("SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG", sdl2javaJNI.SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG_get());
  public final static SDL_GLcontextFlag SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG = new SDL_GLcontextFlag("SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG", sdl2javaJNI.SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG_get());
  public final static SDL_GLcontextFlag SDL_GL_CONTEXT_RESET_ISOLATION_FLAG = new SDL_GLcontextFlag("SDL_GL_CONTEXT_RESET_ISOLATION_FLAG", sdl2javaJNI.SDL_GL_CONTEXT_RESET_ISOLATION_FLAG_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_GLcontextFlag swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_GLcontextFlag.class + " with value " + swigValue);
  }

  private SDL_GLcontextFlag(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_GLcontextFlag(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_GLcontextFlag(String swigName, SDL_GLcontextFlag swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_GLcontextFlag[] swigValues = { SDL_GL_CONTEXT_DEBUG_FLAG, SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG, SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG, SDL_GL_CONTEXT_RESET_ISOLATION_FLAG };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

