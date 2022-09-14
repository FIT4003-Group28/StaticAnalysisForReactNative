package com.google.geo.ar.arlo.api.jni;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextureRegistryJniImpl implements dffk {
    static {
        dffa.a();
    }

    public static native void nativeDestroyTexture(long j);

    public static native int nativeGetTextureId(long j);

    public static native long nativeRegisterExternalTexture(long j, Object obj);

    public static native void nativeSetTextureSizePx(long j, int i, int i2);
}
