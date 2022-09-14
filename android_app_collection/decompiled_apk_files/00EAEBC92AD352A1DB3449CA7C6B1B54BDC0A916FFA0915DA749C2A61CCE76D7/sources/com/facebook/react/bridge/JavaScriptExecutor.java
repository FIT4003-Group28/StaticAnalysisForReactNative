package com.facebook.react.bridge;

import c.d.l.a.a;
import com.facebook.jni.HybridData;
@a
/* loaded from: classes.dex */
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.a();
    }

    public abstract String getName();
}
