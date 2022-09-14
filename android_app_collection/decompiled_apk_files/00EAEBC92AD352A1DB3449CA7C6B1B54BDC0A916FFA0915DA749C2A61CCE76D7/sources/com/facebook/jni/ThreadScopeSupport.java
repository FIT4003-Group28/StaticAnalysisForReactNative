package com.facebook.jni;
@com.facebook.jni.b.a
/* loaded from: classes.dex */
public class ThreadScopeSupport {
    static {
        com.facebook.soloader.o.a.a("fbjni");
    }

    @com.facebook.jni.b.a
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
