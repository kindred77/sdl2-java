/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_HintPriority {
  public final static SDL_HintPriority SDL_HINT_DEFAULT = new SDL_HintPriority("SDL_HINT_DEFAULT");
  public final static SDL_HintPriority SDL_HINT_NORMAL = new SDL_HintPriority("SDL_HINT_NORMAL");
  public final static SDL_HintPriority SDL_HINT_OVERRIDE = new SDL_HintPriority("SDL_HINT_OVERRIDE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_HintPriority swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_HintPriority.class + " with value " + swigValue);
  }

  private SDL_HintPriority(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_HintPriority(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_HintPriority(String swigName, SDL_HintPriority swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_HintPriority[] swigValues = { SDL_HINT_DEFAULT, SDL_HINT_NORMAL, SDL_HINT_OVERRIDE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

