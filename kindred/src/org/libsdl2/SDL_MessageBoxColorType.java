/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_MessageBoxColorType {
  public final static SDL_MessageBoxColorType SDL_MESSAGEBOX_COLOR_BACKGROUND = new SDL_MessageBoxColorType("SDL_MESSAGEBOX_COLOR_BACKGROUND");
  public final static SDL_MessageBoxColorType SDL_MESSAGEBOX_COLOR_TEXT = new SDL_MessageBoxColorType("SDL_MESSAGEBOX_COLOR_TEXT");
  public final static SDL_MessageBoxColorType SDL_MESSAGEBOX_COLOR_BUTTON_BORDER = new SDL_MessageBoxColorType("SDL_MESSAGEBOX_COLOR_BUTTON_BORDER");
  public final static SDL_MessageBoxColorType SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND = new SDL_MessageBoxColorType("SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND");
  public final static SDL_MessageBoxColorType SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED = new SDL_MessageBoxColorType("SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED");
  public final static SDL_MessageBoxColorType SDL_MESSAGEBOX_COLOR_MAX = new SDL_MessageBoxColorType("SDL_MESSAGEBOX_COLOR_MAX");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_MessageBoxColorType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_MessageBoxColorType.class + " with value " + swigValue);
  }

  private SDL_MessageBoxColorType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_MessageBoxColorType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_MessageBoxColorType(String swigName, SDL_MessageBoxColorType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_MessageBoxColorType[] swigValues = { SDL_MESSAGEBOX_COLOR_BACKGROUND, SDL_MESSAGEBOX_COLOR_TEXT, SDL_MESSAGEBOX_COLOR_BUTTON_BORDER, SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND, SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED, SDL_MESSAGEBOX_COLOR_MAX };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

