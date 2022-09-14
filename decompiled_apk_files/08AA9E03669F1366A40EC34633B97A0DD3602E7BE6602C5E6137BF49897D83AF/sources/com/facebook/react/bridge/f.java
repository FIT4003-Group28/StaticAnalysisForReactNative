package com.facebook.react.bridge;
/* compiled from: DefaultNativeModuleCallExceptionHandler.java */
/* loaded from: classes.dex */
public class f implements ab {
    @Override // com.facebook.react.bridge.ab
    public void a(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }
}
