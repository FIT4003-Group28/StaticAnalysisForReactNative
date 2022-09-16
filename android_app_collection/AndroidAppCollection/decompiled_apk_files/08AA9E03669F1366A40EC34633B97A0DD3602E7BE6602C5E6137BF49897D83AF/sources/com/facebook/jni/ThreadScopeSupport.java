package com.facebook.jni;

import com.facebook.l.g;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    static {
        g.a("fb");
    }

    @com.facebook.k.a.a
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
