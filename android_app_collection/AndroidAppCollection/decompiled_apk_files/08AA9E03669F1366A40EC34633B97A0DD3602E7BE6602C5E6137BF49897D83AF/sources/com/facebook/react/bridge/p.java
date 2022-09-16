package com.facebook.react.bridge;
/* compiled from: JSCJavaScriptExecutorFactory.java */
/* loaded from: classes.dex */
public class p implements v {

    /* renamed from: a  reason: collision with root package name */
    private final String f3256a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3257b;

    public p(String str, String str2) {
        this.f3256a = str;
        this.f3257b = str2;
    }

    @Override // com.facebook.react.bridge.v
    public JavaScriptExecutor a() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f3256a);
        writableNativeMap.putString("DeviceIdentity", this.f3257b);
        return new JSCJavaScriptExecutor(writableNativeMap);
    }
}
