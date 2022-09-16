package com.google.android.apps.gmm.offline.routing;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineRoutingControllerImpl extends awcf implements awci {
    private long a;
    @dzsi
    private final avrx instance;
    @dzsi
    private final awdd search = null;

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    public OfflineRoutingControllerImpl(avrx avrxVar) {
        this.a = 0L;
        this.instance = avrxVar;
        this.a = avrxVar.c();
    }

    @dzsi
    private native String nativeDeleteRegion(long j, byte[] bArr);

    private native int[] nativeGetAvailableVersionsForSnaptile(long j, int i, int i2);

    private native byte[] nativeGetDirections(long j, byte[] bArr, byte[] bArr2);

    private native byte[] nativeGetLocalizedSnaptile(long j, String str, String str2, int i, int i2, int i3);

    private native byte[] nativeGetReroute(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i);

    private native byte[] nativeGetSnaptile(long j, int i, int i2, int i3);

    private native byte[] nativeGetSnaptileMetadata(long j, int i);

    private static native boolean nativeInitClass();

    private native byte[] nativeQuerySnaptiles(long j, byte[] bArr);

    @Override // defpackage.awck
    @dzsi
    public final <T> T Qu(dbty<T> dbtyVar) {
        return (T) awcj.a(this, this.a, dbtyVar);
    }

    @Override // defpackage.awcd
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return nativeGetDirections(this.a, bArr, bArr2);
        } catch (RuntimeException e) {
            bvoo.f(e);
            return awcj.a;
        }
    }

    @Override // defpackage.avoi
    public final void d(dspd dspdVar) {
        String nativeDeleteRegion = nativeDeleteRegion(this.a, dspdVar.G());
        if (nativeDeleteRegion == null) {
            return;
        }
        avog avogVar = new avog();
        avogVar.d = nativeDeleteRegion;
        avogVar.a = dluy.ROUTING;
        throw avogVar.a();
    }

    @Override // defpackage.awck
    public final long e() {
        return this.a;
    }

    @Override // defpackage.awck
    public final int[] f(int i, int i2) {
        return nativeGetAvailableVersionsForSnaptile(this.a, i, i2);
    }

    @Override // defpackage.awck
    public final byte[] g(String str, String str2, int i, int i2, int i3) {
        try {
            return nativeGetLocalizedSnaptile(this.a, str, str2, i, i2, i3);
        } catch (anam e) {
            if (!e.a.equals(drtc.NOT_FOUND)) {
                throw e;
            }
            return null;
        }
    }

    @Override // defpackage.awck
    public final byte[] h(int i, int i2, int i3) {
        try {
            return nativeGetSnaptile(this.a, i, i2, i3);
        } catch (anam e) {
            if (!e.a.equals(drtc.NOT_FOUND)) {
                throw e;
            }
            return null;
        }
    }

    @Override // defpackage.awck
    public final byte[] i(byte[] bArr) {
        return nativeQuerySnaptiles(this.a, bArr);
    }

    @Override // defpackage.awck
    public final byte[] j(int i) {
        return nativeGetSnaptileMetadata(this.a, i);
    }

    @Override // defpackage.awck
    public final byte[] k(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        try {
            return nativeGetReroute(this.a, bArr, bArr2, bArr3, bArr4, i);
        } catch (RuntimeException e) {
            bvoo.f(e);
            return awcj.a;
        }
    }

    @Override // defpackage.awci
    public native void nativeBeginRoadGraphTileWork(long j);

    @Override // defpackage.awci
    public native void nativeEndRoadGraphTileWork(long j);

    @Override // defpackage.awci
    public native boolean nativePerformExpensiveInitialization(long j);
}
