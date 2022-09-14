package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    @Override // java.lang.Runnable
    public native void run();

    @com.facebook.k.a.a
    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
