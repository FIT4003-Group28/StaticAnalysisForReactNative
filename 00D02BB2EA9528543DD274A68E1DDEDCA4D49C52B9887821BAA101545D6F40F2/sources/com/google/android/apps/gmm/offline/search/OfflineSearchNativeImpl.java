package com.google.android.apps.gmm.offline.search;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineSearchNativeImpl implements awdi {
    public static final awdi a;

    static {
        NativeHelper.a();
        nativeInitClass();
        a = new OfflineSearchNativeImpl();
    }

    private static native boolean nativeInitClass();

    private native byte[] nativeLogOfflineState(long j, boolean z);

    public native void nativeDeleteCachedPlacesData(long j, byte[] bArr);

    public native void nativeDeleteRegion(long j, byte[] bArr);

    public native byte[][] nativeLocationDetails(long j, byte[] bArr, byte[] bArr2);

    public native byte[][] nativePlaceDetails(long j, byte[] bArr, byte[] bArr2);

    public native void nativeProcessCachedPlacesData(long j, byte[] bArr, byte[] bArr2);

    public native byte[][] nativeSearch(long j, byte[] bArr, byte[] bArr2);

    public native byte[][] nativeSuggest(long j, byte[] bArr, byte[] bArr2);
}
