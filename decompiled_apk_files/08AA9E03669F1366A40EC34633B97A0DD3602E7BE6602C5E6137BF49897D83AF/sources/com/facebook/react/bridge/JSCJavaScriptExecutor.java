package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
class JSCJavaScriptExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    static {
        ai.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }
}
