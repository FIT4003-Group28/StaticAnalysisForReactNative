package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SituationalAwarenessJniImpl implements dffj {
    static {
        dffa.a();
    }

    public static native long nativeAddObserver(long j, NativeObserver nativeObserver);

    public static native void nativeConfigure(long j, byte[] bArr);

    public static native void nativeRemoveObserver(long j);

    public static native void nativeStart(long j);

    public static native void nativeStop(long j);
}
