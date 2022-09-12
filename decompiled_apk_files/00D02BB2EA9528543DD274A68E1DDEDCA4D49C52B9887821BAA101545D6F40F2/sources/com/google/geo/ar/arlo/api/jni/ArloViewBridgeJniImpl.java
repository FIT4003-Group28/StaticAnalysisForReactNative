package com.google.geo.ar.arlo.api.jni;

import android.view.Surface;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArloViewBridgeJniImpl {
    public static final /* synthetic */ int a = 0;

    static {
        dffa.a();
    }

    public static native void nativeClearScene(long j);

    public static native void nativeClearSurface(long j);

    public static native void nativeSetScene(long j, long j2);

    public static native void nativeSetSurface(long j, Surface surface);

    public static native void nativeSetSurfaceDimensionsAndRotation(long j, int i, int i2, int i3);
}
