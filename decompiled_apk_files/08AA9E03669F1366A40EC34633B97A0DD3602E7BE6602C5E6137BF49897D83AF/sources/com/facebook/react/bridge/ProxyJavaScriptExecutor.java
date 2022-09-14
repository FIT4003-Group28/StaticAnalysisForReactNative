package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {

    /* renamed from: a  reason: collision with root package name */
    private JavaJSExecutor f3212a;

    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    static {
        ai.a();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public void close() {
        if (this.f3212a != null) {
            this.f3212a.a();
            this.f3212a = null;
        }
    }
}
