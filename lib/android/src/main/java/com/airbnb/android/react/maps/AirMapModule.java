package com.airbnb.android.react.maps;

import android.app.Activity;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

import java.io.Closeable;
import java.io.IOException;


public class AirMapModule extends ReactContextBaseJavaModule {


  public AirMapModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "AirMapModule";
  }

  public Activity getActivity() {
    return getCurrentActivity();
  }

  public static void closeQuietly(Closeable closeable) {
    if (closeable == null) return;
    try {
      closeable.close();
    } catch (IOException ignored) {
    }
  }

  @ReactMethod
  public void takeSnapshot(final int tag, final ReadableMap options, final Promise promise) {

  }
}
