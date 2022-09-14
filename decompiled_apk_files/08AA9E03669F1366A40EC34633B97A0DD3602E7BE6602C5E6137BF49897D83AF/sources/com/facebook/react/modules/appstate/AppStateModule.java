package com.facebook.react.modules.appstate;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.b;
import com.facebook.react.bridge.d;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.DeviceEventManagerModule;
/* loaded from: classes.dex */
public class AppStateModule extends ReactContextBaseJavaModule implements x {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    protected static final String NAME = "AppState";
    private String mAppState;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
    }

    public AppStateModule(ah ahVar) {
        super(ahVar);
        this.mAppState = "uninitialized";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().a(this);
    }

    @al
    public void getCurrentAppState(d dVar, d dVar2) {
        dVar.a(createAppStateEventMap());
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        this.mAppState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        this.mAppState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    private ar createAppStateEventMap() {
        ar b2 = b.b();
        b2.putString("app_state", this.mAppState);
        return b2;
    }

    private void sendAppStateChangeEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("appStateDidChange", createAppStateEventMap());
    }
}
