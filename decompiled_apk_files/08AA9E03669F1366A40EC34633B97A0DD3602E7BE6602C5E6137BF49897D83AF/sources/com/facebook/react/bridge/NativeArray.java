package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public abstract class NativeArray {
    @com.facebook.k.a.a
    private HybridData mHybridData;

    public native String toString();

    static {
        ai.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
