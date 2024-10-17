/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_GameControllerType {
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_UNKNOWN = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_UNKNOWN", sdl2javaJNI.SDL_CONTROLLER_TYPE_UNKNOWN_get());
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_XBOX360 = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_XBOX360");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_XBOXONE = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_XBOXONE");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_PS3 = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_PS3");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_PS4 = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_PS4");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_PRO = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_PRO");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_VIRTUAL = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_VIRTUAL");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_PS5 = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_PS5");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_AMAZON_LUNA = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_AMAZON_LUNA");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_GOOGLE_STADIA = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_GOOGLE_STADIA");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_NVIDIA_SHIELD = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_NVIDIA_SHIELD");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_LEFT = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_LEFT");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_PAIR = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_PAIR");
  public final static SDL_GameControllerType SDL_CONTROLLER_TYPE_MAX = new SDL_GameControllerType("SDL_CONTROLLER_TYPE_MAX");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_GameControllerType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_GameControllerType.class + " with value " + swigValue);
  }

  private SDL_GameControllerType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_GameControllerType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_GameControllerType(String swigName, SDL_GameControllerType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_GameControllerType[] swigValues = { SDL_CONTROLLER_TYPE_UNKNOWN, SDL_CONTROLLER_TYPE_XBOX360, SDL_CONTROLLER_TYPE_XBOXONE, SDL_CONTROLLER_TYPE_PS3, SDL_CONTROLLER_TYPE_PS4, SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_PRO, SDL_CONTROLLER_TYPE_VIRTUAL, SDL_CONTROLLER_TYPE_PS5, SDL_CONTROLLER_TYPE_AMAZON_LUNA, SDL_CONTROLLER_TYPE_GOOGLE_STADIA, SDL_CONTROLLER_TYPE_NVIDIA_SHIELD, SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_LEFT, SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT, SDL_CONTROLLER_TYPE_NINTENDO_SWITCH_JOYCON_PAIR, SDL_CONTROLLER_TYPE_MAX };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

