package org.wonday.orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class OrientationModule extends ReactContextBaseJavaModule implements org.wonday.orientation.b {
    final ReactApplicationContext ctx;
    private boolean isLocked;
    private String lastDeviceOrientationValue;
    private String lastOrientationValue;
    final OrientationEventListener mOrientationListener;
    final BroadcastReceiver mReceiver;

    /* loaded from: classes.dex */
    class a extends OrientationEventListener {
        a(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            c.d.d.e.a.a("ReactNative", "DeviceOrientation changed to " + i);
            String str = OrientationModule.this.lastDeviceOrientationValue;
            if (i == -1) {
                str = "UNKNOWN";
            } else if (i > 355 || i < 5) {
                str = "PORTRAIT";
            } else if (i > 85 && i < 95) {
                str = "LANDSCAPE-RIGHT";
            } else if (i > 175 && i < 185) {
                str = "PORTRAIT-UPSIDEDOWN";
            } else if (i > 265 && i < 275) {
                str = "LANDSCAPE-LEFT";
            }
            if (!OrientationModule.this.lastDeviceOrientationValue.equals(str)) {
                OrientationModule.this.lastDeviceOrientationValue = str;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("deviceOrientation", str);
                if (!OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                    return;
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("deviceOrientationDidChange", createMap);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String currentOrientation = OrientationModule.this.getCurrentOrientation();
            OrientationModule.this.lastOrientationValue = currentOrientation;
            c.d.d.e.a.a("ReactNative", "Orientation changed to " + currentOrientation);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("orientation", currentOrientation);
            if (OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
            }
        }
    }

    public OrientationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isLocked = false;
        this.lastOrientationValue = "";
        this.lastDeviceOrientationValue = "";
        this.ctx = reactApplicationContext;
        this.mOrientationListener = new a(reactApplicationContext, 2);
        if (this.mOrientationListener.canDetectOrientation()) {
            c.d.d.e.a.a("ReactNative", "orientation detect enabled.");
            this.mOrientationListener.enable();
        } else {
            c.d.d.e.a.a("ReactNative", "orientation detect disabled.");
            this.mOrientationListener.disable();
        }
        this.mReceiver = new b();
        org.wonday.orientation.a.a().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentOrientation() {
        int rotation = ((WindowManager) getReactApplicationContext().getSystemService("window")).getDefaultDisplay().getRotation();
        return rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "UNKNOWN" : "LANDSCAPE-RIGHT" : "PORTRAIT-UPSIDEDOWN" : "LANDSCAPE-LEFT" : "PORTRAIT";
    }

    @ReactMethod
    public void getAutoRotateState(Callback callback) {
        callback.invoke(Boolean.valueOf(Settings.System.getInt(this.ctx.getContentResolver(), "accelerometer_rotation", 0) == 1));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("initialOrientation", getCurrentOrientation());
        return hashMap;
    }

    @ReactMethod
    public void getDeviceOrientation(Callback callback) {
        callback.invoke(this.lastDeviceOrientationValue);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public void getOrientation(Callback callback) {
        callback.invoke(getCurrentOrientation());
    }

    @ReactMethod
    public void lockToLandscape() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(6);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-LEFT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (!this.ctx.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
    }

    @ReactMethod
    public void lockToLandscapeLeft() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(0);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-LEFT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (!this.ctx.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
    }

    @ReactMethod
    public void lockToLandscapeRight() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(8);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-RIGHT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (!this.ctx.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
    }

    @ReactMethod
    public void lockToPortrait() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(1);
        this.isLocked = true;
        this.lastOrientationValue = "PORTRAIT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (!this.ctx.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
    }

    @ReactMethod
    public void lockToPortraitUpsideDown() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(9);
        this.isLocked = true;
        this.lastOrientationValue = "PORTRAIT-UPSIDEDOWN";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (!this.ctx.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
    }

    @Override // org.wonday.orientation.b
    public void release() {
        c.d.d.e.a.a("ReactNative", "orientation detect disabled.");
        this.mOrientationListener.disable();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            currentActivity.unregisterReceiver(this.mReceiver);
        } catch (IllegalArgumentException e2) {
            c.d.d.e.a.c("ReactNative", "Receiver already unregistered", e2);
        }
    }

    @Override // org.wonday.orientation.b
    public void start() {
        c.d.d.e.a.c("ReactNative", "orientation detect enabled.");
        this.mOrientationListener.enable();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.registerReceiver(this.mReceiver, new IntentFilter("onConfigurationChanged"));
    }

    @Override // org.wonday.orientation.b
    public void stop() {
        c.d.d.e.a.a("ReactNative", "orientation detect disabled.");
        this.mOrientationListener.disable();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            currentActivity.unregisterReceiver(this.mReceiver);
        } catch (IllegalArgumentException e2) {
            c.d.d.e.a.c("ReactNative", "Receiver already unregistered", e2);
        }
    }

    @ReactMethod
    public void unlockAllOrientations() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(4);
        this.isLocked = false;
        this.lastOrientationValue = this.lastDeviceOrientationValue;
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", "UNKNOWN");
        if (!this.ctx.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
    }
}
