/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_ThreadPriority {
  public final static SDL_ThreadPriority SDL_THREAD_PRIORITY_LOW = new SDL_ThreadPriority("SDL_THREAD_PRIORITY_LOW");
  public final static SDL_ThreadPriority SDL_THREAD_PRIORITY_NORMAL = new SDL_ThreadPriority("SDL_THREAD_PRIORITY_NORMAL");
  public final static SDL_ThreadPriority SDL_THREAD_PRIORITY_HIGH = new SDL_ThreadPriority("SDL_THREAD_PRIORITY_HIGH");
  public final static SDL_ThreadPriority SDL_THREAD_PRIORITY_TIME_CRITICAL = new SDL_ThreadPriority("SDL_THREAD_PRIORITY_TIME_CRITICAL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_ThreadPriority swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_ThreadPriority.class + " with value " + swigValue);
  }

  private SDL_ThreadPriority(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_ThreadPriority(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_ThreadPriority(String swigName, SDL_ThreadPriority swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_ThreadPriority[] swigValues = { SDL_THREAD_PRIORITY_LOW, SDL_THREAD_PRIORITY_NORMAL, SDL_THREAD_PRIORITY_HIGH, SDL_THREAD_PRIORITY_TIME_CRITICAL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

