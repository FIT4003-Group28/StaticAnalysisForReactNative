package com.google.android.apps.gmm.map.util.jni;
/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeVersion {
    static {
        NativeHelper.a();
        nativeInitClass();
    }

    public static native String nativeGetVersion();

    private static native boolean nativeInitClass();
}
