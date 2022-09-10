package com.google.android.apps.gmm.offline.routing;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineReroutingController implements awcb, awci {
    public boolean a = false;
    public long b;

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    public OfflineReroutingController(avpn avpnVar) {
        this.b = 0L;
        long nativeInitRerouting = nativeInitRerouting(avpnVar.a("rerouting", avze.a).getPath(), avpnVar.b("rerouting", avze.a).getPath());
        this.b = nativeInitRerouting;
        if (nativeInitRerouting != 0) {
            return;
        }
        throw new NullPointerException("Could not initialize native OfflineRerouting object.");
    }

    private native void nativeAddRoadGraphTile(long j, byte[] bArr, int i, long j2);

    private native void nativeDestroyRerouting(long j);

    private native void nativeExpireAllRoadGraphTilesOlderThan(long j, long j2);

    private native int[] nativeGetAvailableVersionsForSnaptile(long j, int i, int i2);

    private native byte[] nativeGetLocalizedSnaptile(long j, String str, String str2, int i, int i2, int i3);

    private native byte[] nativeGetReroute(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i);

    private native byte[] nativeGetSnaptile(long j, int i, int i2, int i3);

    private native byte[] nativeGetSnaptileMetadata(long j, int i);

    private static native boolean nativeInitClass();

    private static native long nativeInitRerouting(String str, String str2);

    private native byte[] nativeQuerySnaptiles(long j, byte[] bArr);

    private native void nativeTrimToSize(long j, long j2, long j3);

    @Override // defpackage.awck
    @dzsi
    public final <T> T Qu(dbty<T> dbtyVar) {
        return (T) awcj.a(this, this.b, dbtyVar);
    }

    @Override // defpackage.awcb
    public final void a(byte[] bArr, int i, long j) {
        nativeAddRoadGraphTile(this.b, bArr, i, j);
    }

    @Override // defpackage.awcb
    public final void b(long j) {
        nativeExpireAllRoadGraphTilesOlderThan(this.b, j);
    }

    @Override // defpackage.awcb
    public final void c(long j) {
        nativeTrimToSize(this.b, 52428800L, j);
    }

    @Override // defpackage.awck
    public final long e() {
        return this.b;
    }

    @Override // defpackage.awck
    public final int[] f(int i, int i2) {
        return nativeGetAvailableVersionsForSnaptile(this.b, i, i2);
    }

    protected final void finalize() {
        long j = this.b;
        if (j != 0) {
            nativeDestroyRerouting(j);
            this.b = 0L;
        }
    }

    @Override // defpackage.awck
    public final byte[] g(String str, String str2, int i, int i2, int i3) {
        try {
            return nativeGetLocalizedSnaptile(this.b, str, str2, i, i2, i3);
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
            return nativeGetSnaptile(this.b, i, i2, i3);
        } catch (anam e) {
            if (!e.a.equals(drtc.NOT_FOUND)) {
                throw e;
            }
            return null;
        }
    }

    @Override // defpackage.awck
    public final byte[] i(byte[] bArr) {
        return nativeQuerySnaptiles(this.b, bArr);
    }

    @Override // defpackage.awck
    public final byte[] j(int i) {
        return nativeGetSnaptileMetadata(this.b, i);
    }

    @Override // defpackage.awck
    public final byte[] k(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        try {
            return nativeGetReroute(this.b, bArr, bArr2, bArr3, bArr4, i);
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
