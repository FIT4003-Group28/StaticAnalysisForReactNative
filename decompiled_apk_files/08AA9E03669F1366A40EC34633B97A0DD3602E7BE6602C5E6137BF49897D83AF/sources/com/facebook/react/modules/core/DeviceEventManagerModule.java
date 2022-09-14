package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ap;
import com.facebook.react.bridge.ar;
import com.google.android.gms.common.internal.ImagesContract;
/* loaded from: classes.dex */
public class DeviceEventManagerModule extends ReactContextBaseJavaModule {
    private final Runnable mInvokeDefaultBackPressRunnable;

    /* loaded from: classes.dex */
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DeviceEventManager";
    }

    public DeviceEventManagerModule(ah ahVar, final b bVar) {
        super(ahVar);
        this.mInvokeDefaultBackPressRunnable = new Runnable() { // from class: com.facebook.react.modules.core.DeviceEventManagerModule.1
            @Override // java.lang.Runnable
            public void run() {
                ap.b();
                bVar.c();
            }
        };
    }

    public void emitHardwareBackPressed() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().a(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null);
    }

    public void emitNewIntentReceived(Uri uri) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString(ImagesContract.URL, uri.toString());
        ((RCTDeviceEventEmitter) getReactApplicationContext().a(RCTDeviceEventEmitter.class)).emit(ImagesContract.URL, b2);
    }

    @al
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().a(this.mInvokeDefaultBackPressRunnable);
    }
}
