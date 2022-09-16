package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.d0.a.a;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.c;
import java.util.HashMap;
import java.util.Map;
@a(name = DeviceInfoModule.NAME)
/* loaded from: classes.dex */
public class DeviceInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, com.facebook.react.turbomodule.core.interfaces.a {
    public static final String NAME = "DeviceInfo";
    private float mFontScale;
    private ReactApplicationContext mReactApplicationContext;

    public DeviceInfoModule(Context context) {
        super(null);
        this.mReactApplicationContext = null;
        c.b(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        c.b(reactApplicationContext);
        this.mFontScale = reactApplicationContext.getResources().getConfiguration().fontScale;
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactApplicationContext.addLifecycleEventListener(this);
    }

    public void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        if (reactApplicationContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", c.b(this.mFontScale));
        } else {
            ReactSoftException.logSoftException(NAME, new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Dimensions", c.a(this.mFontScale));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            return;
        }
        float f2 = reactApplicationContext.getResources().getConfiguration().fontScale;
        if (this.mFontScale == f2) {
            return;
        }
        this.mFontScale = f2;
        emitUpdateDimensionsEvent();
    }
}
