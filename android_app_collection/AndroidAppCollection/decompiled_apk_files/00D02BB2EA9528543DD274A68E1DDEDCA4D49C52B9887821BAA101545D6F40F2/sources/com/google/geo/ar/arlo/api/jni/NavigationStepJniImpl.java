package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationStepJniImpl implements dffh {
    static {
        dffa.a();
    }

    public static native long nativeAddIndicatorScreenPositionObserver(long j, NativeObserver nativeObserver);

    public static native long nativeAddNavigationStepStateObserver(long j, NativeObserver nativeObserver);

    public static native void nativeDestroy(long j);

    public static native void nativeRemoveObserver(long j);

    public static native void nativeSetCalloutTexture(long j, int i);

    public static native void nativeUpdateSnapshotParams(long j, byte[] bArr);
}
