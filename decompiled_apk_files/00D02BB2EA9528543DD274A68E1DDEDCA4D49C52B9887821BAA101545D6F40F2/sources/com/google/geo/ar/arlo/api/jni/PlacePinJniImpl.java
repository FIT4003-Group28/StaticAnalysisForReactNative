package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlacePinJniImpl implements dffi {
    static {
        dffa.a();
    }

    public static native long nativeAddIndicatorScreenPositionObserver(long j, NativeObserver nativeObserver);

    public static native long nativeAddPlacePinStateObserver(long j, NativeObserver nativeObserver);

    public static native void nativeDestroy(long j);

    public static native void nativeRemoveObserver(long j);

    public static native long nativeShowIcon(long j, int i);

    public static native long nativeShowLabel(long j, int i);

    public static native void nativeUpdatePin(long j, byte[] bArr);
}
