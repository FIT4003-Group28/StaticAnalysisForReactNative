package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: cmdm  reason: default package */
/* loaded from: classes5.dex */
public final class cmdm implements cmeg, cmef {
    public final cmeg a;
    long b;
    long c;
    private cmef d;
    private cmdl[] e = new cmdl[0];
    private long f;

    public cmdm(cmeg cmegVar, long j, long j2) {
        this.a = cmegVar;
        this.f = j;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.cmeg
    public final void a(cmef cmefVar, long j) {
        this.d = cmefVar;
        this.a.a(this, j);
    }

    @Override // defpackage.cmef
    public final void b(cmeg cmegVar) {
        cmef cmefVar = this.d;
        cmmn.f(cmefVar);
        cmefVar.b(this);
    }

    @Override // defpackage.cmeg
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.cmeg
    public final TrackGroupArray d() {
        return this.a.d();
    }

    @Override // defpackage.cmfl
    public final /* bridge */ /* synthetic */ void e(cmeg cmegVar) {
        cmef cmefVar = this.d;
        cmmn.f(cmefVar);
        cmefVar.e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r1 > r4) goto L37;
     */
    @Override // defpackage.cmeg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(defpackage.cmjm[] r16, boolean[] r17, defpackage.cmfk[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            cmdl[] r2 = new defpackage.cmdl[r1]
            r0.e = r2
            cmfk[] r10 = new defpackage.cmfk[r1]
            r11 = 0
            r1 = 0
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            cmdl[] r2 = r0.e
            r3 = r9[r1]
            cmdl r3 = (defpackage.cmdl) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            cmfk r12 = r3.a
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            cmeg r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.f(r2, r3, r4, r5, r6)
            boolean r3 = r15.o()
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
            com.google.android.exoplayer2.Format r7 = r7.g()
            java.lang.String r13 = r7.l
            java.lang.String r7 = r7.i
            boolean r7 = defpackage.cmnf.d(r13, r7)
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
            defpackage.cmmn.c(r3)
        L82:
            int r3 = r9.length
            if (r11 >= r3) goto La8
            r3 = r10[r11]
            if (r3 != 0) goto L8e
            cmdl[] r3 = r0.e
            r3[r11] = r12
            goto L9f
        L8e:
            cmdl[] r4 = r0.e
            r5 = r4[r11]
            if (r5 == 0) goto L98
            cmfk r5 = r5.a
            if (r5 == r3) goto L9f
        L98:
            cmdl r5 = new cmdl
            r5.<init>(r15, r3)
            r4[r11] = r5
        L9f:
            cmdl[] r3 = r0.e
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L82
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmdm.f(cmjm[], boolean[], cmfk[], boolean[], long):long");
    }

    @Override // defpackage.cmeg
    public final void g(long j) {
        this.a.g(j);
    }

    @Override // defpackage.cmeg
    public final long h() {
        if (o()) {
            long j = this.f;
            this.f = -9223372036854775807L;
            long h = h();
            return h != -9223372036854775807L ? h : j;
        }
        long h2 = this.a.h();
        if (h2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        cmmn.c(h2 >= this.b);
        long j2 = this.c;
        if (j2 == Long.MIN_VALUE || h2 <= j2) {
            z = true;
        }
        cmmn.c(z);
        return h2;
    }

    @Override // defpackage.cmeg
    public final long i() {
        long i = this.a.i();
        if (i != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || i < j) {
                return i;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // defpackage.cmeg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f = r0
            cmdl[] r0 = r7.e
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
            cmeg r0 = r7.a
            long r0 = r0.j(r8)
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
            defpackage.cmmn.c(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmdm.j(long):long");
    }

    @Override // defpackage.cmeg
    public final long k(long j, cloq cloqVar) {
        long j2 = this.b;
        if (j != j2) {
            long C = cmny.C(cloqVar.c, 0L, j - j2);
            long j3 = cloqVar.d;
            long j4 = this.c;
            long C2 = cmny.C(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
            if (C != cloqVar.c || C2 != cloqVar.d) {
                cloqVar = new cloq(C, C2);
            }
            return this.a.k(j, cloqVar);
        }
        return j2;
    }

    @Override // defpackage.cmeg
    public final long l() {
        long l = this.a.l();
        if (l != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || l < j) {
                return l;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cmeg
    public final boolean m(long j) {
        return this.a.m(j);
    }

    @Override // defpackage.cmeg
    public final boolean n() {
        return this.a.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return this.f != -9223372036854775807L;
    }

    @Override // defpackage.cmeg
    public final void p(long j) {
        this.a.p(j);
    }
}
