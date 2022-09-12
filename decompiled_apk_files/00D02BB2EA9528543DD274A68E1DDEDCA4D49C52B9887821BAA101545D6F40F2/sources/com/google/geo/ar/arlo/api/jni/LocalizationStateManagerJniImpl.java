package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocalizationStateManagerJniImpl implements dffg {
    static {
        dffa.a();
    }

    public static native long nativeAddObserver(long j, NativeObserver nativeObserver);

    public static native void nativeRemoveObserver(long j);

    public static native long nativeReset(long j);

    public static native void nativeStart(long j);

    public static native void nativeStop(long j);
}
