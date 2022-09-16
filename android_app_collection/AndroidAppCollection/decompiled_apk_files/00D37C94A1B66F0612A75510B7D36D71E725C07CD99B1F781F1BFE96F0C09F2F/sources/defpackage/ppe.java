package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: ppe  reason: default package */
/* loaded from: classes4.dex */
public final class ppe implements ppy, ppx {
    public final ppy a;
    long b;
    long c;
    private ppx d;
    private ppd[] e = new ppd[0];
    private long f;

    public ppe(ppy ppyVar, boolean z, long j, long j2) {
        this.a = ppyVar;
        this.f = true != z ? -9223372036854775807L : j;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        long j2 = this.b;
        if (j != j2) {
            long j3 = pxi.j(pkhVar.d, 0L, j - j2);
            long j4 = pkhVar.e;
            long j5 = this.c;
            long j6 = pxi.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
            if (j3 != pkhVar.d || j6 != pkhVar.e) {
                pkhVar = new pkh(j3, j6);
            }
            return this.a.a(j, pkhVar);
        }
        return j2;
    }

    @Override // defpackage.prj
    public final /* bridge */ /* synthetic */ void b(prk prkVar) {
        ppy ppyVar = (ppy) prkVar;
        ppx ppxVar = this.d;
        ptx.a(ppxVar);
        ppxVar.b(this);
    }

    @Override // defpackage.ppx
    public final void c(ppy ppyVar) {
        ppx ppxVar = this.d;
        ptx.a(ppxVar);
        ppxVar.c(this);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long d() {
        long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        long e = this.a.e();
        if (e != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ppy
    public final long f() {
        if (q()) {
            long j = this.f;
            this.f = -9223372036854775807L;
            long f = f();
            return f != -9223372036854775807L ? f : j;
        }
        long f2 = this.a.f();
        if (f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        ptx.e(f2 >= this.b);
        long j2 = this.c;
        if (j2 == Long.MIN_VALUE || f2 <= j2) {
            z = true;
        }
        ptx.e(z);
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // defpackage.ppy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f = r0
            ppd[] r0 = r7.e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            ppy r0 = r7.a
            long r0 = r0.g(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L34
            long r8 = r7.b
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L35
            long r8 = r7.c
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L35
        L34:
            r2 = 1
        L35:
            defpackage.ptx.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppe.g(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r1 > r4) goto L37;
     */
    @Override // defpackage.ppy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.pvf[] r16, boolean[] r17, defpackage.pri[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            ppd[] r2 = new defpackage.ppd[r1]
            r0.e = r2
            pri[] r10 = new defpackage.pri[r1]
            r11 = 0
            r1 = 0
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            ppd[] r2 = r0.e
            r3 = r9[r1]
            ppd r3 = (defpackage.ppd) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            pri r12 = r3.a
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            ppy r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.h(r2, r3, r4, r5, r6)
            boolean r3 = r15.q()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L64
            long r6 = r0.b
            int r3 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r3 != 0) goto L64
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L64
            int r3 = r8.length
            r6 = 0
        L4b:
            if (r6 >= r3) goto L64
            r7 = r8[r6]
            if (r7 == 0) goto L61
            com.google.android.exoplayer2.Format r7 = r7.o()
            java.lang.String r13 = r7.l
            java.lang.String r7 = r7.i
            boolean r7 = defpackage.pwl.i(r13, r7)
            if (r7 != 0) goto L61
            r4 = r1
            goto L64
        L61:
            int r6 = r6 + 1
            goto L4b
        L64:
            r0.f = r4
            r3 = 1
            int r4 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r4 == 0) goto L7f
            long r4 = r0.b
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L7e
            long r4 = r0.c
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L7f
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L7e
            goto L7f
        L7e:
            r3 = 0
        L7f:
            defpackage.ptx.e(r3)
        L82:
            int r3 = r9.length
            if (r11 >= r3) goto La8
            r3 = r10[r11]
            if (r3 != 0) goto L8e
            ppd[] r3 = r0.e
            r3[r11] = r12
            goto L9f
        L8e:
            ppd[] r4 = r0.e
            r5 = r4[r11]
            if (r5 == 0) goto L98
            pri r5 = r5.a
            if (r5 == r3) goto L9f
        L98:
            ppd r5 = new ppd
            r5.<init>(r15, r3)
            r4[r11] = r5
        L9f:
            ppd[] r3 = r0.e
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L82
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppe.h(pvf[], boolean[], pri[], boolean[], long):long");
    }

    @Override // defpackage.ppy
    public final TrackGroupArray i() {
        return this.a.i();
    }

    @Override // defpackage.ppy
    public final void j(long j, boolean z) {
        this.a.j(j, z);
    }

    @Override // defpackage.ppy
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.ppy
    public final void l(ppx ppxVar, long j) {
        this.d = ppxVar;
        this.a.l(this, j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
        this.a.m(j);
    }

    public final void n(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean p() {
        return this.a.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return this.f != -9223372036854775807L;
    }
}
