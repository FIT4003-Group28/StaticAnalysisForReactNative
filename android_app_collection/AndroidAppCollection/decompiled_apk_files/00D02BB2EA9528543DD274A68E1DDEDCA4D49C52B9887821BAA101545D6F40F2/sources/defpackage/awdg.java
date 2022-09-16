package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.offline.search.OfflineSearchNativeImpl;
import java.io.Closeable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awdg  reason: default package */
/* loaded from: classes3.dex */
public final class awdg extends awde implements Closeable {
    private static final dcqe a = dcqe.c("awdg");
    private final avze b;
    private final awda c;
    private long d;
    private final awdi e;
    @dzsi
    private final avrx instance;

    public awdg(awdb awdbVar, avrx avrxVar) {
        awdi awdiVar = OfflineSearchNativeImpl.a;
        this.d = 0L;
        avze a2 = avrxVar.a();
        this.b = a2;
        this.e = awdiVar;
        long b = avrxVar.b();
        this.d = b;
        this.instance = avrxVar;
        Application a3 = awdbVar.a.a();
        awdb.a(a3, 1);
        btrm a4 = awdbVar.b.a();
        awdb.a(a4, 2);
        Executor a5 = awdbVar.c.a();
        awdb.a(a5, 3);
        dxio a6 = ((dxjh) awdbVar.d).a();
        awdb.a(a6, 4);
        dxio a7 = ((dxjh) awdbVar.e).a();
        awdb.a(a7, 5);
        dxio a8 = ((dxjh) awdbVar.f).a();
        awdb.a(a8, 6);
        awdb.a(a2, 7);
        awdb.a(awdiVar, 8);
        this.c = new awda(a3, a4, a5, a6, a7, a8, a2, awdiVar, b);
    }

    private static byte[] j(byte[][] bArr) {
        awcx k = k(bArr);
        if (k == null) {
            return null;
        }
        return ((awcw) k).a;
    }

    @dzsi
    private static awcx k(byte[][] bArr) {
        if (bArr == null) {
            bvoo.h("Error parsing response proto.", new Object[0]);
            return null;
        }
        byte[] bArr2 = bArr[0];
        byte[] bArr3 = bArr[1];
        byte[] bArr4 = bArr[2];
        if (bArr4 == null) {
            return new awcw(bArr2, bArr3);
        }
        bvoo.h("Error message received: %s", new String(bArr4));
        return null;
    }

    @Override // defpackage.awcy
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return j(((OfflineSearchNativeImpl) this.e).nativeSearch(this.d, bArr, bArr2));
    }

    @Override // defpackage.awcy
    @dzsi
    public final awcx b(@dzsi btlu btluVar, byte[] bArr, byte[] bArr2) {
        if (!(btluVar == null && this.b.a() == null) && (btluVar == null || !btluVar.equals(this.b.a()))) {
            return null;
        }
        return k(((OfflineSearchNativeImpl) this.e).nativeSearch(this.d, bArr, bArr2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.d();
        if (this.d != 0) {
            this.d = 0L;
        }
    }

    @Override // defpackage.avoi
    public final synchronized void d(dspd dspdVar) {
        try {
            ((OfflineSearchNativeImpl) this.e).nativeDeleteRegion(this.d, dspdVar.G());
        } catch (anam e) {
            throw avoh.a(e, dluy.SEARCH);
        }
    }

    @Override // defpackage.awcy
    public final byte[] e(byte[] bArr, byte[] bArr2) {
        return j(((OfflineSearchNativeImpl) this.e).nativeSuggest(this.d, bArr, bArr2));
    }

    @Override // defpackage.awcy
    public final byte[] f(byte[] bArr, byte[] bArr2) {
        return j(((OfflineSearchNativeImpl) this.e).nativePlaceDetails(this.d, bArr, bArr2));
    }

    protected final void finalize() {
        close();
    }

    @Override // defpackage.awcy
    public final byte[] g(byte[] bArr, byte[] bArr2) {
        return j(((OfflineSearchNativeImpl) this.e).nativeLocationDetails(this.d, bArr, bArr2));
    }

    @Override // defpackage.awdd
    public final synchronized void h() {
        this.c.a();
    }

    @Override // defpackage.awdd
    public final synchronized void i() {
        this.c.b();
    }
}
