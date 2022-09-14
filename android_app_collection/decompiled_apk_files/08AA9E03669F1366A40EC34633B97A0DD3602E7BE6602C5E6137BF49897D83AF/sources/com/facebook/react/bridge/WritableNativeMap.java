package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class WritableNativeMap extends ReadableNativeMap implements ar {
    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.ar
    public native void putBoolean(String str, boolean z);

    @Override // com.facebook.react.bridge.ar
    public native void putDouble(String str, double d2);

    @Override // com.facebook.react.bridge.ar
    public native void putInt(String str, int i);

    @Override // com.facebook.react.bridge.ar
    public native void putNull(String str);

    @Override // com.facebook.react.bridge.ar
    public native void putString(String str, String str2);

    static {
        ai.a();
    }

    @Override // com.facebook.react.bridge.ar
    public void a(String str, ar arVar) {
        com.facebook.j.a.a.a(arVar == null || (arVar instanceof WritableNativeMap), "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) arVar);
    }

    @Override // com.facebook.react.bridge.ar
    public void a(String str, aq aqVar) {
        com.facebook.j.a.a.a(aqVar == null || (aqVar instanceof WritableNativeArray), "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) aqVar);
    }

    public WritableNativeMap() {
        super(initHybrid());
    }
}
