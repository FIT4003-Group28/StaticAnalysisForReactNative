package defpackage;

import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.EOFException;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: prh  reason: default package */
/* loaded from: classes4.dex */
public final class prh implements bab {
    private boolean A;
    private Format D;
    private Format E;
    private boolean F;
    private boolean G;
    public prg a;
    public int b;
    public boolean d;
    public int e;
    public long f;
    private final prd g;
    private final pnp j;
    private final pnj k;
    private final Looper l;
    private Format m;
    private pne n;
    private int v;
    private int w;
    private int x;
    private final pre h = new pre();
    private int o = 1000;
    private int[] p = new int[1000];
    private long[] q = new long[1000];
    private long[] t = new long[1000];
    private int[] s = new int[1000];
    private int[] r = new int[1000];
    private baa[] u = new baa[1000];
    private final prn i = new prn(pee.e);
    public long c = Long.MIN_VALUE;
    private long y = Long.MIN_VALUE;
    private long z = Long.MIN_VALUE;
    private boolean C = true;
    private boolean B = true;

    public prh(axf axfVar, Looper looper, pnp pnpVar, pnj pnjVar) {
        this.l = looper;
        this.j = pnpVar;
        this.k = pnjVar;
        this.g = new prd(axfVar);
    }

    public static prh C(axf axfVar, Looper looper, pnp pnpVar, pnj pnjVar) {
        ptx.a(looper);
        ptx.a(pnpVar);
        return new prh(axfVar, looper, pnpVar, pnjVar);
    }

    private final int E(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.t[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.s[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.o) {
                i = 0;
            }
        }
        return i3;
    }

    private final int F(int i) {
        int i2 = this.w + i;
        int i3 = this.o;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int G(pit pitVar, pmv pmvVar, boolean z, boolean z2, pre preVar) {
        pmvVar.e = false;
        if (!P()) {
            if (!z2 && !this.A) {
                Format format = this.E;
                if (format == null || (!z && format == this.m)) {
                    return -3;
                }
                M(format, pitVar);
                return -5;
            }
            pmvVar.setFlags(4);
            return -4;
        }
        Format format2 = ((prf) this.i.a(g())).a;
        if (!z && format2 == this.m) {
            int F = F(this.x);
            if (!Q(F)) {
                pmvVar.e = true;
                return -3;
            }
            pmvVar.setFlags(this.s[F]);
            long j = this.t[F];
            pmvVar.f = j;
            if (j < this.c) {
                pmvVar.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            }
            preVar.a = this.r[F];
            preVar.b = this.q[F];
            preVar.c = this.u[F];
            return -4;
        }
        M(format2, pitVar);
        return -5;
    }

    private final synchronized long H(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.v;
        if (i2 != 0) {
            long[] jArr = this.t;
            int i3 = this.w;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.x) != i2) {
                    i2 = i + 1;
                }
                int E = E(i3, i2, j, z);
                if (E != -1) {
                    return J(E);
                }
                return -1L;
            }
        }
        return -1L;
    }

    private final synchronized long I() {
        int i = this.v;
        if (i == 0) {
            return -1L;
        }
        return J(i);
    }

    private final long J(int i) {
        int i2;
        this.y = Math.max(this.y, K(i));
        this.v -= i;
        int i3 = this.b + i;
        this.b = i3;
        int i4 = this.w + i;
        this.w = i4;
        int i5 = this.o;
        if (i4 >= i5) {
            this.w = i4 - i5;
        }
        int i6 = this.x - i;
        this.x = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.x = 0;
        }
        prn prnVar = this.i;
        while (i7 < prnVar.b.size() - 1) {
            int i8 = i7 + 1;
            if (i3 < prnVar.b.keyAt(i8)) {
                break;
            }
            prnVar.c.a(prnVar.b.valueAt(i7));
            prnVar.b.removeAt(i7);
            int i9 = prnVar.a;
            if (i9 > 0) {
                prnVar.a = i9 - 1;
            }
            i7 = i8;
        }
        if (this.v == 0) {
            int i10 = this.w;
            if (i10 == 0) {
                i10 = this.o;
            }
            return this.q[i10 - 1] + this.r[i2];
        }
        return this.q[this.w];
    }

    private final long K(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int F = F(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.t[F]);
            if ((this.s[F] & 1) != 0) {
                break;
            }
            F--;
            if (F == -1) {
                F = this.o - 1;
            }
        }
        return j;
    }

    private final synchronized void L(long j, int i, long j2, int i2, baa baaVar) {
        pno pnoVar;
        int i3 = this.v;
        if (i3 > 0) {
            int F = F(i3 - 1);
            ptx.c(this.q[F] + ((long) this.r[F]) <= j2);
        }
        this.A = (536870912 & i) != 0;
        this.z = Math.max(this.z, j);
        int F2 = F(this.v);
        this.t[F2] = j;
        this.q[F2] = j2;
        this.r[F2] = i2;
        this.s[F2] = i;
        this.u[F2] = baaVar;
        this.p[F2] = this.e;
        if (this.i.c() || !((prf) this.i.b()).a.equals(this.E)) {
            pnp pnpVar = this.j;
            if (pnpVar != null) {
                ptx.a(this.l);
                pnoVar = pnpVar.g();
            } else {
                pnoVar = pno.b;
            }
            prn prnVar = this.i;
            int i4 = i();
            Format format = this.E;
            ptx.a(format);
            prf prfVar = new prf(format, pnoVar);
            if (prnVar.a == -1) {
                ptx.e(prnVar.b.size() == 0);
                prnVar.a = 0;
            }
            if (prnVar.b.size() > 0) {
                SparseArray sparseArray = prnVar.b;
                int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                ptx.c(i4 >= keyAt);
                if (keyAt == i4) {
                    pvu pvuVar = prnVar.c;
                    SparseArray sparseArray2 = prnVar.b;
                    pvuVar.a(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            prnVar.b.append(i4, prfVar);
        }
        int i5 = this.v + 1;
        this.v = i5;
        int i6 = this.o;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            baa[] baaVarArr = new baa[i7];
            int i8 = this.w;
            int i9 = i6 - i8;
            System.arraycopy(this.q, i8, jArr, 0, i9);
            System.arraycopy(this.t, this.w, jArr2, 0, i9);
            System.arraycopy(this.s, this.w, iArr2, 0, i9);
            System.arraycopy(this.r, this.w, iArr3, 0, i9);
            System.arraycopy(this.u, this.w, baaVarArr, 0, i9);
            System.arraycopy(this.p, this.w, iArr, 0, i9);
            int i10 = this.w;
            System.arraycopy(this.q, 0, jArr, i9, i10);
            System.arraycopy(this.t, 0, jArr2, i9, i10);
            System.arraycopy(this.s, 0, iArr2, i9, i10);
            System.arraycopy(this.r, 0, iArr3, i9, i10);
            System.arraycopy(this.u, 0, baaVarArr, i9, i10);
            System.arraycopy(this.p, 0, iArr, i9, i10);
            this.q = jArr;
            this.t = jArr2;
            this.s = iArr2;
            this.r = iArr3;
            this.u = baaVarArr;
            this.p = iArr;
            this.w = 0;
            this.o = i7;
        }
    }

    private final void M(Format format, pit pitVar) {
        Format format2 = this.m;
        DrmInitData drmInitData = format2 == null ? null : format2.o;
        this.m = format;
        DrmInitData drmInitData2 = format.o;
        pnp pnpVar = this.j;
        pitVar.b = pnpVar != null ? format.c(pnpVar.c(format)) : format;
        pitVar.a = this.n;
        if (this.j == null) {
            return;
        }
        if (format2 != null && pxi.M(drmInitData, drmInitData2)) {
            return;
        }
        pne pneVar = this.n;
        pnp pnpVar2 = this.j;
        Looper looper = this.l;
        ptx.a(looper);
        pne b = pnpVar2.b(looper, this.k, format);
        this.n = b;
        pitVar.a = b;
        if (pneVar == null) {
            return;
        }
        pneVar.m(this.k);
    }

    private final void N() {
        pne pneVar = this.n;
        if (pneVar != null) {
            pneVar.m(this.k);
            this.n = null;
            this.m = null;
        }
    }

    private final synchronized void O() {
        this.x = 0;
        prd prdVar = this.g;
        prdVar.d = prdVar.c;
    }

    private final boolean P() {
        return this.x != this.v;
    }

    private final boolean Q(int i) {
        pne pneVar = this.n;
        if (pneVar == null || pneVar.a() == 4) {
            return true;
        }
        if ((this.s[i] & 1073741824) != 0) {
            return false;
        }
        this.n.s();
        return false;
    }

    private final synchronized boolean R(Format format) {
        this.C = false;
        if (pxi.M(format, this.E)) {
            return false;
        }
        if (!this.i.c() && ((prf) this.i.b()).a.equals(format)) {
            this.E = ((prf) this.i.b()).a;
        } else {
            this.E = format;
        }
        Format format2 = this.E;
        this.F = pwl.i(format2.l, format2.i);
        this.G = false;
        return true;
    }

    public final synchronized boolean A(int i) {
        boolean z;
        O();
        int i2 = this.b;
        if (i >= i2 && i <= this.v + i2) {
            this.c = Long.MIN_VALUE;
            this.x = i - i2;
            z = true;
        }
        z = false;
        return z;
    }

    public final synchronized boolean B(long j, boolean z) {
        O();
        int F = F(this.x);
        if (!P() || j < this.t[F] || (j > this.z && !z)) {
            return false;
        }
        int E = E(F, this.v - this.x, j, true);
        if (E == -1) {
            return false;
        }
        this.c = j;
        this.x += E;
        return true;
    }

    public final synchronized void D() {
        int F = F(this.x);
        if (P()) {
            int i = this.p[F];
        }
    }

    @Override // defpackage.bab
    public final /* synthetic */ int a(ast astVar, int i, boolean z) {
        return iy.d(this, astVar, i, z);
    }

    @Override // defpackage.bab
    public final /* synthetic */ void c(pwu pwuVar, int i) {
        iy.e(this, pwuVar, i);
    }

    @Override // defpackage.bab
    public final void d(pwu pwuVar, int i, int i2) {
        prd prdVar = this.g;
        while (i > 0) {
            int a = prdVar.a(i);
            prc prcVar = prdVar.e;
            pwuVar.B(prcVar.e.b, prcVar.a(prdVar.f), a);
            i -= a;
            prdVar.e(a);
        }
    }

    @Override // defpackage.bab
    public final void e(long j, int i, int i2, int i3, baa baaVar) {
        int i4;
        if (this.d) {
            Format format = this.D;
            ptx.b(format);
            rx(format);
        }
        int i5 = i & 1;
        if (this.B) {
            if (i5 == 0) {
                return;
            }
            this.B = false;
        }
        long j2 = this.f + j;
        if (this.F) {
            if (j2 < this.c) {
                return;
            }
            if (i5 == 0) {
                if (!this.G) {
                    String valueOf = String.valueOf(this.E);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(valueOf);
                    Log.w("SampleQueue", sb.toString());
                    this.G = true;
                }
                i4 = i | 1;
                L(j2, i4, (this.g.f - i2) - i3, i2, baaVar);
            }
        }
        i4 = i;
        L(j2, i4, (this.g.f - i2) - i3, i2, baaVar);
    }

    @Override // defpackage.bab
    public final int f(ast astVar, int i, boolean z) {
        prd prdVar = this.g;
        int a = prdVar.a(i);
        prc prcVar = prdVar.e;
        int g = astVar.g(prcVar.e.b, prcVar.a(prdVar.f), a);
        if (g != -1) {
            prdVar.e(g);
            return g;
        } else if (!z) {
            throw new EOFException();
        } else {
            return -1;
        }
    }

    public final int g() {
        return this.b + this.x;
    }

    public final synchronized int h(long j, boolean z) {
        int F = F(this.x);
        if (P() && j >= this.t[F]) {
            if (j > this.z && z) {
                return this.v - this.x;
            }
            int E = E(F, this.v - this.x, j, true);
            if (E != -1) {
                return E;
            }
            return 0;
        }
        return 0;
    }

    public final int i() {
        return this.b + this.v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(defpackage.pit r9, defpackage.pmv r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            pre r7 = r8.h
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.G(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L49
            boolean r9 = r10.isEndOfStream()
            if (r9 != 0) goto L48
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L3f
            if (r9 == 0) goto L30
            prd r9 = r8.g
            pre r11 = r8.h
            prc r0 = r9.d
            pwu r9 = r9.b
            defpackage.prd.b(r0, r10, r11, r9)
            goto L48
        L30:
            prd r9 = r8.g
            pre r11 = r8.h
            prc r0 = r9.d
            pwu r2 = r9.b
            prc r10 = defpackage.prd.b(r0, r10, r11, r2)
            r9.d = r10
            goto L42
        L3f:
            if (r9 == 0) goto L42
            goto L48
        L42:
            int r9 = r8.x
            int r9 = r9 + r1
            r8.x = r9
            return r12
        L48:
            r9 = -4
        L49:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prh.j(pit, pmv, int, boolean):int");
    }

    public final synchronized long k() {
        if (this.v == 0) {
            return Long.MIN_VALUE;
        }
        return this.t[this.w];
    }

    public final synchronized long l() {
        return this.z;
    }

    public final synchronized long m() {
        return Math.max(this.y, K(this.x));
    }

    public final synchronized Format n() {
        if (this.C) {
            return null;
        }
        return this.E;
    }

    public final void o(long j, boolean z, boolean z2) {
        this.g.d(H(j, z, z2));
    }

    public final void p() {
        this.g.d(I());
    }

    public final void q(long j) {
        if (this.v == 0) {
            return;
        }
        ptx.c(j > m());
        int i = this.v;
        int F = F(i - 1);
        while (i > this.x && this.t[F] >= j) {
            i--;
            F--;
            if (F == -1) {
                F = this.o - 1;
            }
        }
        r(this.b + i);
    }

    public final void r(int i) {
        int F;
        prd prdVar = this.g;
        int i2 = i() - i;
        boolean z = true;
        ptx.c(i2 >= 0 && i2 <= this.v - this.x);
        int i3 = this.v - i2;
        this.v = i3;
        this.z = Math.max(this.y, K(i3));
        if (i2 != 0 || !this.A) {
            z = false;
        }
        this.A = z;
        prn prnVar = this.i;
        for (int size = prnVar.b.size() - 1; size >= 0 && i < prnVar.b.keyAt(size); size--) {
            prnVar.c.a(prnVar.b.valueAt(size));
            prnVar.b.removeAt(size);
        }
        prnVar.a = prnVar.b.size() > 0 ? Math.min(prnVar.a, prnVar.b.size() - 1) : -1;
        int i4 = this.v;
        long j = i4 != 0 ? this.q[F(i4 - 1)] + this.r[F] : 0L;
        prdVar.f = j;
        if (j != 0) {
            prc prcVar = prdVar.c;
            if (j != prcVar.a) {
                while (prdVar.f > prcVar.b) {
                    prcVar = prcVar.d;
                }
                prc prcVar2 = prcVar.d;
                prdVar.c(prcVar2);
                prcVar.d = new prc(prcVar.b, prdVar.a);
                prdVar.e = prdVar.f == prcVar.b ? prcVar.d : prcVar;
                if (prdVar.d != prcVar2) {
                    return;
                }
                prdVar.d = prcVar.d;
                return;
            }
        }
        prdVar.c(prdVar.c);
        prdVar.c = new prc(prdVar.f, prdVar.a);
        prc prcVar3 = prdVar.c;
        prdVar.d = prcVar3;
        prdVar.e = prcVar3;
    }

    @Override // defpackage.bab
    public final void rx(Format format) {
        Format format2;
        if (this.f == 0 || format.p == Long.MAX_VALUE) {
            format2 = format;
        } else {
            pis b = format.b();
            b.o = format.p + this.f;
            format2 = b.a();
        }
        this.d = false;
        this.D = format;
        boolean R = R(format2);
        prg prgVar = this.a;
        if (prgVar == null || !R) {
            return;
        }
        pqx pqxVar = (pqx) prgVar;
        pqxVar.i.post(pqxVar.g);
    }

    public final void s() {
        pne pneVar = this.n;
        if (pneVar == null || pneVar.a() != 1) {
            return;
        }
        pnd c = this.n.c();
        ptx.a(c);
        throw c;
    }

    public final void t() {
        p();
        N();
    }

    public final void u() {
        w(true);
        N();
    }

    public final void v() {
        w(false);
    }

    public final void w(boolean z) {
        prd prdVar = this.g;
        prdVar.c(prdVar.c);
        prdVar.c = new prc(0L, prdVar.a);
        prc prcVar = prdVar.c;
        prdVar.d = prcVar;
        prdVar.e = prcVar;
        prdVar.f = 0L;
        prdVar.g.d();
        this.v = 0;
        this.b = 0;
        this.w = 0;
        this.x = 0;
        this.B = true;
        this.c = Long.MIN_VALUE;
        this.y = Long.MIN_VALUE;
        this.z = Long.MIN_VALUE;
        this.A = false;
        prn prnVar = this.i;
        for (int i = 0; i < prnVar.b.size(); i++) {
            prnVar.c.a(prnVar.b.valueAt(i));
        }
        prnVar.a = -1;
        prnVar.b.clear();
        if (z) {
            this.D = null;
            this.E = null;
            this.C = true;
        }
    }

    public final synchronized void x(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.x + i <= this.v) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ptx.c(z);
        this.x += i;
    }

    public final synchronized boolean y() {
        return this.A;
    }

    public final synchronized boolean z(boolean z) {
        boolean z2 = true;
        if (P()) {
            if (((prf) this.i.a(g())).a != this.m) {
                return true;
            }
            return Q(F(this.x));
        }
        if (!z && !this.A) {
            Format format = this.E;
            if (format == null) {
                z2 = false;
            } else if (format == this.m) {
                return false;
            }
        }
        return z2;
    }
}
