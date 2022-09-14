package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArloSceneJniImpl {
    public static final /* synthetic */ int a = 0;

    static {
        dffa.a();
    }

    public static native long nativeCreateCameraPreviewEffects(long j, byte[] bArr);

    public static native long nativeCreateHulaMap(long j, byte[] bArr);

    public static native long nativeCreateLocalizationStateDisplay(long j);

    public static native long nativeCreateNavigationStep(long j, byte[] bArr);

    public static native long nativeCreatePlacePin(long j, byte[] bArr);

    public static native void nativeDestroy(long j);
}
