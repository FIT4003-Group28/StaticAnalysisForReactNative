package com.facebook.react.modules.appstate;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.d;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.teslamotors.TeslaApp.a;
import com.teslamotors.TeslaApp.b;
/* loaded from: classes.dex */
public class TMAppStateModule extends ReactContextBaseJavaModule implements x, a {
    protected static final String NAME = "AppState";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
    }

    public TMAppStateModule(ah ahVar) {
        super(ahVar);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().a(this);
        b.a().a(this);
    }

    @al
    public void getCurrentAppState(d dVar, d dVar2) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString("app_state", b.a().b());
        dVar.a(b2);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        b.a().a(b.a.BACKGROUND);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
        b.a().a(b.a.UNINITIALIZED);
    }

    @Override // com.teslamotors.TeslaApp.a
    public void appStateDidChange(String str) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString("app_state", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("appStateDidChange", b2);
    }
}
