package com.airbnb.android.react.maps;

import com.facebook.react.bridge.ReactApplicationContext;

import com.amap.api.maps2d.AMapOptions;

public class AirMapLiteManager extends AirMapManager {

  private static final String REACT_CLASS = "AIRMapLite";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  public AirMapLiteManager(ReactApplicationContext context) {
    super(context);
    this.googleMapOptions = new AMapOptions();
  }

}
