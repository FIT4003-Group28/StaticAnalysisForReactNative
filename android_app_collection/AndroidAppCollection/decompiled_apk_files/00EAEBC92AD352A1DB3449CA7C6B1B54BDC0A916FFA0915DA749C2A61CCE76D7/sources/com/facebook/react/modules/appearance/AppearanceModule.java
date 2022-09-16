package com.facebook.react.modules.appearance;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.d0.a.a;
import com.facebook.react.modules.core.DeviceEventManagerModule;
@a(name = AppearanceModule.NAME)
/* loaded from: classes.dex */
public class AppearanceModule extends ReactContextBaseJavaModule {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final String NAME = "Appearance";
    private String mColorScheme;

    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mColorScheme = "light";
        this.mColorScheme = colorSchemeForCurrentConfiguration(reactApplicationContext);
    }

    private static String colorSchemeForCurrentConfiguration(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        return (i == 16 || i != 32) ? "light" : "dark";
    }

    @ReactMethod
    public void addListener(String str) {
    }

    public void emitAppearanceChanged(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("colorScheme", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(APPEARANCE_CHANGED_EVENT_NAME, createMap);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getColorScheme() {
        this.mColorScheme = colorSchemeForCurrentConfiguration(getReactApplicationContext());
        return this.mColorScheme;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public void onConfigurationChanged(Context context) {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (!this.mColorScheme.equals(colorSchemeForCurrentConfiguration)) {
            this.mColorScheme = colorSchemeForCurrentConfiguration;
            emitAppearanceChanged(this.mColorScheme);
        }
    }

    @ReactMethod
    public void removeListeners(double d2) {
    }
}
