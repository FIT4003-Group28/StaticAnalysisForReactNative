package com.google.geo.ar.arlo.api.jni;

import android.content.Context;
import android.content.res.AssetManager;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArloSessionJniImpl implements dffb {
    static {
        dffa.a();
    }

    public static native long nativeCreateArloSession(Context context, ClassLoader classLoader, AssetManager assetManager, byte[] bArr, @dzsi AssetFetcherJni assetFetcherJni);

    public static native long nativeCreateScene(long j);

    public static native void nativeDestroy(long j);

    public static native boolean nativeDoFrame(long j, NativeObserver nativeObserver);

    public static native long nativeGetArloViewBridgePointer(long j);

    public static native long nativeGetExplorationManagerPointer(long j);

    public static native long nativeGetLocalizationStateManagerPointer(long j);

    public static native int nativeGetSessionState(long j);

    public static native long nativeGetSituationalAwarenessPointer(long j);

    public static native long nativeGetTextureRegistryPointer(long j);

    public static native void nativeInitialize(long j, long j2);

    public static native void nativeSetSessionState(long j, int i);
}
