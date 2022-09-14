package com.facebook.react.bridge;

import c.d.l.a.a;
import com.facebook.jni.HybridData;
@a
/* loaded from: classes.dex */
class JSCJavaScriptExecutor extends JavaScriptExecutor {
    static {
        ReactBridge.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCJavaScriptExecutor";
    }
}
