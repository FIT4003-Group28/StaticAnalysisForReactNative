package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
/* loaded from: classes.dex */
public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void debugRemotely(boolean z);

    @ReactMethod
    public abstract void reload();

    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z);

    @ReactMethod
    public abstract void setProfilingEnabled(boolean z);

    @ReactMethod
    public abstract void show();
}
