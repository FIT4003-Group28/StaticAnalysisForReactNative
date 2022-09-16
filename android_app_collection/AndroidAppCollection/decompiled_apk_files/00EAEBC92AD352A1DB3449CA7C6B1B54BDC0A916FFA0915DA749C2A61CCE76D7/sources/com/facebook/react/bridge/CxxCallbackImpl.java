package com.facebook.react.bridge;

import c.d.l.a.a;
import com.facebook.jni.HybridData;
@a
/* loaded from: classes.dex */
public class CxxCallbackImpl implements Callback {
    @a
    private final HybridData mHybridData;

    @a
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
