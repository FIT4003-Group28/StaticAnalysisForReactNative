package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
@com.facebook.react.d0.a.a(name = DeviceEventManagerModule.NAME)
/* loaded from: classes.dex */
public class DeviceEventManagerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DeviceEventManager";
    private final Runnable mInvokeDefaultBackPressRunnable;

    @c.d.l.a.a
    /* loaded from: classes.dex */
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f5593b;

        a(DeviceEventManagerModule deviceEventManagerModule, b bVar) {
            this.f5593b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            UiThreadUtil.assertOnUiThread();
            this.f5593b.e();
        }
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, b bVar) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new a(this, bVar);
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("url", uri.toString());
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit("url", createMap);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
