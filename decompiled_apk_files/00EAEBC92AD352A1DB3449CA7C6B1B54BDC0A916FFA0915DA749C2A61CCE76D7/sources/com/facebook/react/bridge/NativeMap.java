package com.facebook.react.bridge;

import c.d.l.a.a;
import com.facebook.jni.HybridData;
@a
/* loaded from: classes.dex */
public abstract class NativeMap {
    @a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
