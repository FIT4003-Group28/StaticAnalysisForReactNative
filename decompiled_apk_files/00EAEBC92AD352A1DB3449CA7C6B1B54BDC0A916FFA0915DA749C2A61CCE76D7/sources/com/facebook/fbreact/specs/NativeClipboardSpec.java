package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
/* loaded from: classes.dex */
public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
    public NativeClipboardSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void getString(Promise promise);

    @ReactMethod
    public abstract void setString(String str);
}
