package com.google.android.apps.gmm.shared.tracing.process;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Jiffies {
    static {
        NativeHelper.a();
        nativeInitClass();
    }

    private static native boolean nativeInitClass();

    public static native long nativeJiffiesPerSecond();
}
