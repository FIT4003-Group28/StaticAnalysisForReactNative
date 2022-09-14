package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class CxxCallbackImpl implements d {
    @com.facebook.k.a.a
    private final HybridData mHybridData;

    private native void nativeInvoke(NativeArray nativeArray);

    @com.facebook.k.a.a
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.d
    public void a(Object... objArr) {
        nativeInvoke(b.a(objArr));
    }
}
