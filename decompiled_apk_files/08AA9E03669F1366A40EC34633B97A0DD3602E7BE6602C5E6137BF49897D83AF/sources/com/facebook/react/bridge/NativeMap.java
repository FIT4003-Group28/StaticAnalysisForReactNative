package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public abstract class NativeMap {
    @com.facebook.k.a.a
    private HybridData mHybridData;

    public native String toString();

    static {
        ai.a();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
