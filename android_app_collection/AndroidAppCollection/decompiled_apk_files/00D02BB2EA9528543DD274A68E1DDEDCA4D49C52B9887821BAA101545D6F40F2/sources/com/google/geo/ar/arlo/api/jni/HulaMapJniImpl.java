package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class HulaMapJniImpl implements dffe {
    static {
        dffa.a();
    }

    public static native void nativeDestroy(long j);

    public static native void nativeSetFeatureParams(long j, byte[] bArr);

    public static native long nativeSetMapTexture(long j, int i);

    public static native void nativeUpdateSnapshotParams(long j, byte[] bArr);
}
