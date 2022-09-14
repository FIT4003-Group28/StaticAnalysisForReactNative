package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class DeviceInfoModule extends BaseJavaModule implements x {
    private float mFontScale;
    private ah mReactApplicationContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DeviceInfo";
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
    }

    public DeviceInfoModule(ah ahVar) {
        this((Context) ahVar);
        this.mReactApplicationContext = ahVar;
    }

    public DeviceInfoModule(Context context) {
        this.mReactApplicationContext = null;
        b.a(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Dimensions", getDimensionsConstants());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        if (this.mReactApplicationContext == null) {
            return;
        }
        float f = this.mReactApplicationContext.getResources().getConfiguration().fontScale;
        if (this.mFontScale == f) {
            return;
        }
        this.mFontScale = f;
        emitUpdateDimensionsEvent();
    }

    public void emitUpdateDimensionsEvent() {
        if (this.mReactApplicationContext == null) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactApplicationContext.a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", getDimensionsConstants());
    }

    private ar getDimensionsConstants() {
        DisplayMetrics a2 = b.a();
        DisplayMetrics b2 = b.b();
        ar b3 = com.facebook.react.bridge.b.b();
        b3.putInt("width", a2.widthPixels);
        b3.putInt("height", a2.heightPixels);
        b3.putDouble("scale", a2.density);
        b3.putDouble("fontScale", this.mFontScale);
        b3.putDouble("densityDpi", a2.densityDpi);
        ar b4 = com.facebook.react.bridge.b.b();
        b4.putInt("width", b2.widthPixels);
        b4.putInt("height", b2.heightPixels);
        b4.putDouble("scale", b2.density);
        b4.putDouble("fontScale", this.mFontScale);
        b4.putDouble("densityDpi", b2.densityDpi);
        ar b5 = com.facebook.react.bridge.b.b();
        b5.a("windowPhysicalPixels", b3);
        b5.a("screenPhysicalPixels", b4);
        return b5;
    }
}
