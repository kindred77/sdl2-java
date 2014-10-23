/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_TextureAccess {
  public final static SDL_TextureAccess SDL_TEXTUREACCESS_STATIC = new SDL_TextureAccess("SDL_TEXTUREACCESS_STATIC");
  public final static SDL_TextureAccess SDL_TEXTUREACCESS_STREAMING = new SDL_TextureAccess("SDL_TEXTUREACCESS_STREAMING");
  public final static SDL_TextureAccess SDL_TEXTUREACCESS_TARGET = new SDL_TextureAccess("SDL_TEXTUREACCESS_TARGET");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_TextureAccess swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_TextureAccess.class + " with value " + swigValue);
  }

  private SDL_TextureAccess(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_TextureAccess(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_TextureAccess(String swigName, SDL_TextureAccess swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_TextureAccess[] swigValues = { SDL_TEXTUREACCESS_STATIC, SDL_TEXTUREACCESS_STREAMING, SDL_TEXTUREACCESS_TARGET };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

