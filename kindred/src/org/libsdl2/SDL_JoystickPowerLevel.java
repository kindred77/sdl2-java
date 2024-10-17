/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_JoystickPowerLevel {
  public final static SDL_JoystickPowerLevel SDL_JOYSTICK_POWER_UNKNOWN = new SDL_JoystickPowerLevel("SDL_JOYSTICK_POWER_UNKNOWN", sdl2javaJNI.SDL_JOYSTICK_POWER_UNKNOWN_get());
  public final static SDL_JoystickPowerLevel SDL_JOYSTICK_POWER_EMPTY = new SDL_JoystickPowerLevel("SDL_JOYSTICK_POWER_EMPTY");
  public final static SDL_JoystickPowerLevel SDL_JOYSTICK_POWER_LOW = new SDL_JoystickPowerLevel("SDL_JOYSTICK_POWER_LOW");
  public final static SDL_JoystickPowerLevel SDL_JOYSTICK_POWER_MEDIUM = new SDL_JoystickPowerLevel("SDL_JOYSTICK_POWER_MEDIUM");
  public final static SDL_JoystickPowerLevel SDL_JOYSTICK_POWER_FULL = new SDL_JoystickPowerLevel("SDL_JOYSTICK_POWER_FULL");
  public final static SDL_JoystickPowerLevel SDL_JOYSTICK_POWER_WIRED = new SDL_JoystickPowerLevel("SDL_JOYSTICK_POWER_WIRED");
  public final static SDL_JoystickPowerLevel SDL_JOYSTICK_POWER_MAX = new SDL_JoystickPowerLevel("SDL_JOYSTICK_POWER_MAX");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_JoystickPowerLevel swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_JoystickPowerLevel.class + " with value " + swigValue);
  }

  private SDL_JoystickPowerLevel(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_JoystickPowerLevel(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_JoystickPowerLevel(String swigName, SDL_JoystickPowerLevel swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_JoystickPowerLevel[] swigValues = { SDL_JOYSTICK_POWER_UNKNOWN, SDL_JOYSTICK_POWER_EMPTY, SDL_JOYSTICK_POWER_LOW, SDL_JOYSTICK_POWER_MEDIUM, SDL_JOYSTICK_POWER_FULL, SDL_JOYSTICK_POWER_WIRED, SDL_JOYSTICK_POWER_MAX };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
