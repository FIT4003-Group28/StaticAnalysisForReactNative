package com.google.android.apps.gmm.offline.backends;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineUtilNativeImpl implements avon {
    static {
        NativeHelper.a();
        nativeInitClass();
    }

    private native boolean nativeContainsPoint(byte[] bArr, double d, double d2);

    private native double nativeDistanceMeters(byte[] bArr, double d, double d2);

    private native byte[] nativeExteriorS2RectCovering(byte[] bArr, int i);

    private static native boolean nativeInitClass();

    private native byte[] nativeInteriorS2RectCovering(byte[] bArr, int i);

    @Override // defpackage.avon
    public final double a(byte[] bArr, double d, double d2) {
        return nativeDistanceMeters(bArr, d, d2);
    }

    @Override // defpackage.avon
    public final byte[] b(byte[] bArr) {
        return nativeExteriorS2RectCovering(bArr, 100);
    }

    @Override // defpackage.avon
    public final byte[] c(byte[] bArr) {
        return nativeInteriorS2RectCovering(bArr, 100);
    }
}
