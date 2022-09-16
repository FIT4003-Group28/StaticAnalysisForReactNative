package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aezg  reason: default package */
/* loaded from: classes.dex */
public final class aezg extends aeyj {
    private volatile boolean A;
    private volatile boolean B;
    private final prt C;
    public final aezc s;
    volatile boolean t;
    private boolean u;
    private long v;
    private long w;
    private final ArrayList x;
    private long y;
    private volatile int z;

    public aezg(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, prt prtVar, aezc aezcVar) {
        super(asvVar, asyVar, format, i, obj, j, j2, j3, j4);
        this.x = new ArrayList();
        this.z = -1;
        this.C = prtVar;
        this.s = aezcVar;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.u = true;
    }

    private final synchronized void y() {
        this.y = 0L;
        this.x.clear();
        this.v = -9223372036854775807L;
        this.u = true;
    }

    @Override // defpackage.axv
    public final synchronized void a() {
        this.A = true;
    }

    @Override // defpackage.axv
    public final void b() {
        long j;
        long j2;
        long j3;
        synchronized (this) {
            j = this.y;
            j2 = this.w;
        }
        if (j != 0) {
            afki afkiVar = afki.ABR;
        }
        asy b = k().b(j);
        if (j2 != -9223372036854775807L) {
            zgp b2 = zgp.b(b.a);
            b2.g("min_lmt", String.valueOf(j2));
            b = b.d(b2.a());
        }
        try {
            ayf ayfVar = this.m;
            aza azaVar = new aza(ayfVar, b.g, ayfVar.h(b));
            if (j == 0) {
                this.C.e(new prv() { // from class: aezf
                    @Override // defpackage.prv
                    public final bab a(int i, int i2) {
                        aezg aezgVar = aezg.this;
                        aezgVar.s.g(aezgVar.d().a(i, i2));
                        return aezgVar.s;
                    }
                }, -9223372036854775807L, -9223372036854775807L);
            }
            while (!this.A && this.C.g(azaVar)) {
            }
            synchronized (this) {
                j3 = azaVar.c - k().g;
                this.y = j3;
            }
            if (j3 <= 0) {
                afkj.e(afki.MFL, "EmptyChunkException, sequence %d, httpStatus %d", Long.valueOf(i()), Integer.valueOf(this.z));
                throw new aeyn(this.z, i(), k());
            }
            synchronized (this) {
            }
            this.m.j();
            r();
        } catch (Throwable th) {
            this.m.j();
            throw th;
        }
    }

    @Override // defpackage.psb
    public final synchronized long f() {
        return m();
    }

    @Override // defpackage.psb
    public final synchronized boolean h() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long l() {
        return this.v;
    }

    public final synchronized long m() {
        long j = this.o;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void n(aeui aeuiVar) {
        this.x.add(aeuiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p() {
        if (k().a.getQueryParameter("headm") != null) {
            this.w = -9223372036854775807L;
            s(-1L);
            this.q = -9223372036854775807L;
            this.r = -9223372036854775807L;
        }
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q(long j) {
        this.v = j;
    }

    final synchronized void r() {
        this.B = !this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s(long j) {
        this.o = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t(long j, long j2, long j3, Uri uri) {
        s(j);
        this.q = j2;
        this.r = j3;
        u(uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void u(Uri uri) {
        this.p = this.p.d(uri);
        this.w = -9223372036854775807L;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean v() {
        return !this.x.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean w(long j) {
        this.r = j;
        if (this.u) {
            this.q = j;
            this.u = false;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aeui[] x() {
        return (aeui[]) this.x.toArray(new aeui[0]);
    }

    public final synchronized void o(int i, aflw aflwVar) {
        this.z = i;
        if (i == 204) {
            throw new afkb(204, "Chunk not available yet. Need to retry.", k());
        }
        Long d = aflwVar.d();
        long longValue = d != null ? d.longValue() : -9223372036854775807L;
        long j = this.w;
        if (j != -9223372036854775807L && j != longValue) {
            afkj.e(afki.MFL, "LastModifiedTime changed for sequence %d", Long.valueOf(i()));
            this.w = Math.max(this.w, longValue);
            throw new aeyo(k(), i());
        }
        this.w = longValue;
    }
}
