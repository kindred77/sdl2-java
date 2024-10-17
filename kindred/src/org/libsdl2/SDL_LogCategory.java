/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_LogCategory {
  public final static SDL_LogCategory SDL_LOG_CATEGORY_APPLICATION = new SDL_LogCategory("SDL_LOG_CATEGORY_APPLICATION");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_ERROR = new SDL_LogCategory("SDL_LOG_CATEGORY_ERROR");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_ASSERT = new SDL_LogCategory("SDL_LOG_CATEGORY_ASSERT");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_SYSTEM = new SDL_LogCategory("SDL_LOG_CATEGORY_SYSTEM");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_AUDIO = new SDL_LogCategory("SDL_LOG_CATEGORY_AUDIO");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_VIDEO = new SDL_LogCategory("SDL_LOG_CATEGORY_VIDEO");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RENDER = new SDL_LogCategory("SDL_LOG_CATEGORY_RENDER");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_INPUT = new SDL_LogCategory("SDL_LOG_CATEGORY_INPUT");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_TEST = new SDL_LogCategory("SDL_LOG_CATEGORY_TEST");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED1 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED1");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED2 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED2");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED3 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED3");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED4 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED4");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED5 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED5");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED6 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED6");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED7 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED7");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED8 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED8");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED9 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED9");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_RESERVED10 = new SDL_LogCategory("SDL_LOG_CATEGORY_RESERVED10");
  public final static SDL_LogCategory SDL_LOG_CATEGORY_CUSTOM = new SDL_LogCategory("SDL_LOG_CATEGORY_CUSTOM");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_LogCategory swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_LogCategory.class + " with value " + swigValue);
  }

  private SDL_LogCategory(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_LogCategory(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_LogCategory(String swigName, SDL_LogCategory swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_LogCategory[] swigValues = { SDL_LOG_CATEGORY_APPLICATION, SDL_LOG_CATEGORY_ERROR, SDL_LOG_CATEGORY_ASSERT, SDL_LOG_CATEGORY_SYSTEM, SDL_LOG_CATEGORY_AUDIO, SDL_LOG_CATEGORY_VIDEO, SDL_LOG_CATEGORY_RENDER, SDL_LOG_CATEGORY_INPUT, SDL_LOG_CATEGORY_TEST, SDL_LOG_CATEGORY_RESERVED1, SDL_LOG_CATEGORY_RESERVED2, SDL_LOG_CATEGORY_RESERVED3, SDL_LOG_CATEGORY_RESERVED4, SDL_LOG_CATEGORY_RESERVED5, SDL_LOG_CATEGORY_RESERVED6, SDL_LOG_CATEGORY_RESERVED7, SDL_LOG_CATEGORY_RESERVED8, SDL_LOG_CATEGORY_RESERVED9, SDL_LOG_CATEGORY_RESERVED10, SDL_LOG_CATEGORY_CUSTOM };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

