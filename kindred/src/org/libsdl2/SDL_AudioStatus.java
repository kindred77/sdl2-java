/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libsdl2;

public final class SDL_AudioStatus {
  public final static SDL_AudioStatus SDL_AUDIO_STOPPED = new SDL_AudioStatus("SDL_AUDIO_STOPPED", sdl2javaJNI.SDL_AUDIO_STOPPED_get());
  public final static SDL_AudioStatus SDL_AUDIO_PLAYING = new SDL_AudioStatus("SDL_AUDIO_PLAYING");
  public final static SDL_AudioStatus SDL_AUDIO_PAUSED = new SDL_AudioStatus("SDL_AUDIO_PAUSED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDL_AudioStatus swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDL_AudioStatus.class + " with value " + swigValue);
  }

  private SDL_AudioStatus(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDL_AudioStatus(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SDL_AudioStatus(String swigName, SDL_AudioStatus swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SDL_AudioStatus[] swigValues = { SDL_AUDIO_STOPPED, SDL_AUDIO_PLAYING, SDL_AUDIO_PAUSED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

