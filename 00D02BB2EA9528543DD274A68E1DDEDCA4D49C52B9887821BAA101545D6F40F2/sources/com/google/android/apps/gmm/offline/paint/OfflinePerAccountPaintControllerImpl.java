package com.google.android.apps.gmm.offline.paint;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
/* compiled from: PG */
/* loaded from: classes.dex */
public class OfflinePerAccountPaintControllerImpl extends awbr {
    private static final String a = "OfflinePerAccountPaintControllerImpl";
    private static final dcqe b = dcqe.c("com.google.android.apps.gmm.offline.paint.OfflinePerAccountPaintControllerImpl");
    private long c;
    @dzsi
    private final avrx instance;

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    public OfflinePerAccountPaintControllerImpl(avrx avrxVar) {
        this.c = 0L;
        this.c = avrxVar.d();
        avrxVar.a();
        this.instance = avrxVar;
    }

    private native void nativeDeleteRegion(long j, byte[] bArr);

    private native byte[] nativeFetchResource(long j, String str, String str2);

    private native byte[] nativeFetchTile(long j, byte[] bArr);

    private native long nativeGetMinFormatVersion(long j);

    private native boolean nativeHasResource(long j, String str, String str2);

    private static native boolean nativeInitClass();

    private native boolean nativeIsEmpty(long j);

    @Override // defpackage.akpf
    public final byte[] a(String str) {
        try {
            return nativeFetchResource(this.c, str, "");
        } catch (anam e) {
            e.getMessage();
            bvoo.j(e);
            return null;
        }
    }

    @Override // defpackage.akpf
    public final boolean b(String str) {
        try {
            return nativeHasResource(this.c, str, "");
        } catch (anam e) {
            bvoo.h("OfflinePaintClient::hasResource failed %s", e);
            return false;
        }
    }

    @Override // defpackage.awbq
    public final byte[] e(byte[] bArr) {
        try {
            return nativeFetchTile(this.c, bArr);
        } catch (anam e) {
            bvoo.j(e);
            return null;
        }
    }

    @Override // defpackage.awbq
    public final long f() {
        return nativeGetMinFormatVersion(this.c);
    }

    @Override // defpackage.awbq
    public final boolean g() {
        try {
            return nativeIsEmpty(this.c);
        } catch (anam e) {
            throw avoh.a(e, dluy.PAINT);
        }
    }

    @Override // defpackage.avoi
    public final void d(dspd dspdVar) {
        try {
            nativeDeleteRegion(this.c, dspdVar.G());
        } catch (anam e) {
            throw avoh.b(e, dluy.PAINT);
        }
    }
}
