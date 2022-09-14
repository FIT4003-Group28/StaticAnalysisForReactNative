package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class WritableNativeArray extends ReadableNativeArray implements aq {
    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.aq
    public native void pushBoolean(boolean z);

    @Override // com.facebook.react.bridge.aq
    public native void pushDouble(double d2);

    @Override // com.facebook.react.bridge.aq
    public native void pushInt(int i);

    @Override // com.facebook.react.bridge.aq
    public native void pushNull();

    @Override // com.facebook.react.bridge.aq
    public native void pushString(String str);

    static {
        ai.a();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    @Override // com.facebook.react.bridge.aq
    public void a(aq aqVar) {
        com.facebook.j.a.a.a(aqVar == null || (aqVar instanceof WritableNativeArray), "Illegal type provided");
        pushNativeArray((WritableNativeArray) aqVar);
    }

    @Override // com.facebook.react.bridge.aq
    public void a(ar arVar) {
        com.facebook.j.a.a.a(arVar == null || (arVar instanceof WritableNativeMap), "Illegal type provided");
        pushNativeMap((WritableNativeMap) arVar);
    }
}
