package com.facebook.react.modules.core;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
@com.facebook.react.d0.a.a(name = ExceptionsManagerModule.NAME)
/* loaded from: classes.dex */
public class ExceptionsManagerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ExceptionsManager";
    private final com.facebook.react.devsupport.h.c mDevSupportManager;

    public ExceptionsManagerModule(com.facebook.react.devsupport.h.c cVar) {
        this.mDevSupportManager = cVar;
    }

    @ReactMethod
    public void dismissRedbox() {
        if (this.mDevSupportManager.a()) {
            this.mDevSupportManager.c();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void reportException(ReadableMap readableMap) {
        String string = readableMap.hasKey("message") ? readableMap.getString("message") : "";
        ReadableArray array = readableMap.hasKey("stack") ? readableMap.getArray("stack") : Arguments.createArray();
        int i = readableMap.hasKey("id") ? readableMap.getInt("id") : -1;
        boolean z = false;
        boolean z2 = readableMap.hasKey("isFatal") ? readableMap.getBoolean("isFatal") : false;
        if (this.mDevSupportManager.a()) {
            if (readableMap.mo210getMap("extraData") != null && readableMap.mo210getMap("extraData").hasKey("suppressRedBox")) {
                z = readableMap.mo210getMap("extraData").getBoolean("suppressRedBox");
            }
            if (z) {
                return;
            }
            this.mDevSupportManager.a(string, array, i);
            return;
        }
        String a2 = com.facebook.react.h0.a.a(readableMap);
        if (z2) {
            com.facebook.react.common.d dVar = new com.facebook.react.common.d(com.facebook.react.h0.b.a(string, array));
            dVar.a(a2);
            throw dVar;
        }
        c.d.d.e.a.b("ReactNative", com.facebook.react.h0.b.a(string, array));
        if (a2 == null) {
            return;
        }
        c.d.d.e.a.a("ReactNative", "extraData: %s", a2);
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, int i) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", i);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, int i) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", i);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.a()) {
            this.mDevSupportManager.b(str, readableArray, i);
        }
    }
}
