package com.airbnb.android.react.maps;

import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
/* loaded from: classes.dex */
public class AirMapModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AirMapModule";
    }

    public AirMapModule(ah ahVar) {
        super(ahVar);
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }
}
