package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: clls  reason: default package */
/* loaded from: classes5.dex */
public abstract class clls implements clol, clon {
    public int a;
    public cmfk b;
    public boolean c;
    private final int d;
    private cloo f;
    private int g;
    private Format[] h;
    private long i;
    private boolean k;
    private final clng e = new clng();
    private long j = Long.MIN_VALUE;

    public clls(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final clng B() {
        this.e.a();
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Format[] C() {
        return (Format[]) cmmn.f(this.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cloo D() {
        cloo clooVar = this.f;
        cmmn.f(clooVar);
        return clooVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cllz E(Exception exc, Format format) {
        return F(exc, format, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cllz F(java.lang.Exception r13, com.google.android.exoplayer2.Format r14, boolean r15) {
        /*
            r12 = this;
            r0 = 4
            if (r14 == 0) goto L1c
            boolean r1 = r12.k
            if (r1 != 0) goto L1c
            r1 = 1
            r12.k = r1
            r1 = 0
            int r2 = r12.N(r14)     // Catch: java.lang.Throwable -> L16 defpackage.cllz -> L1a
            int r2 = defpackage.clom.a(r2)     // Catch: java.lang.Throwable -> L16 defpackage.cllz -> L1a
            r12.k = r1
            goto L1d
        L16:
            r13 = move-exception
            r12.k = r1
            throw r13
        L1a:
            r12.k = r1
        L1c:
            r2 = 4
        L1d:
            java.lang.String r6 = r12.J()
            int r7 = r12.g
            if (r14 != 0) goto L27
            r9 = 4
            goto L28
        L27:
            r9 = r2
        L28:
            cllz r0 = new cllz
            r4 = 1
            r10 = 0
            r3 = r0
            r5 = r13
            r8 = r14
            r11 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clls.F(java.lang.Exception, com.google.android.exoplayer2.Format, boolean):cllz");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int G(clng clngVar, cltg cltgVar, boolean z) {
        cmfk cmfkVar = this.b;
        cmmn.f(cmfkVar);
        int c = cmfkVar.c(clngVar, cltgVar, z);
        if (c == -4) {
            if (cltgVar.isEndOfStream()) {
                this.j = Long.MIN_VALUE;
                return this.c ? -4 : -3;
            }
            long j = cltgVar.d + this.i;
            cltgVar.d = j;
            this.j = Math.max(this.j, j);
            return c;
        } else if (c != -5) {
            return c;
        } else {
            Format format = clngVar.a;
            cmmn.f(format);
            if (format.p == Long.MAX_VALUE) {
                return -5;
            }
            clnf a = format.a();
            a.o = format.p + this.i;
            clngVar.a = a.a();
            return -5;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int H(long j) {
        cmfk cmfkVar = this.b;
        cmmn.f(cmfkVar);
        return cmfkVar.d(j - this.i);
    }

    @Override // defpackage.clol
    public void I(float f) {
    }

    @Override // defpackage.clol
    public final clon RQ() {
        return this;
    }

    @Override // defpackage.clol
    public final void RR(int i) {
        this.g = i;
    }

    @Override // defpackage.clol, defpackage.clon
    public final int a() {
        return this.d;
    }

    @Override // defpackage.clol
    public cmnc d() {
        return null;
    }

    @Override // defpackage.clol
    public final int e() {
        return this.a;
    }

    @Override // defpackage.clol
    public final void f(cloo clooVar, Format[] formatArr, cmfk cmfkVar, long j, boolean z, boolean z2, long j2, long j3) {
        cmmn.c(this.a == 0);
        this.f = clooVar;
        this.a = 1;
        u(z, z2);
        h(formatArr, cmfkVar, j2, j3);
        w(j, z);
    }

    @Override // defpackage.clol
    public final void g() {
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        cmmn.c(z);
        this.a = 2;
        x();
    }

    @Override // defpackage.clol
    public final void h(Format[] formatArr, cmfk cmfkVar, long j, long j2) {
        cmmn.c(!this.c);
        this.b = cmfkVar;
        this.j = j2;
        this.h = formatArr;
        this.i = j2;
        v(formatArr, j, j2);
    }

    @Override // defpackage.clol
    public final cmfk i() {
        return this.b;
    }

    @Override // defpackage.clol
    public final boolean j() {
        return this.j == Long.MIN_VALUE;
    }

    @Override // defpackage.clol
    public final long k() {
        return this.j;
    }

    @Override // defpackage.clol
    public final void l() {
        this.c = true;
    }

    @Override // defpackage.clol
    public final boolean m() {
        return this.c;
    }

    @Override // defpackage.clol
    public final void n() {
        cmfk cmfkVar = this.b;
        cmmn.f(cmfkVar);
        cmfkVar.b();
    }

    @Override // defpackage.clol
    public final void o(long j) {
        this.c = false;
        this.j = j;
        w(j, false);
    }

    @Override // defpackage.clol
    public final void p() {
        cmmn.c(this.a == 2);
        this.a = 1;
        y();
    }

    @Override // defpackage.clol
    public final void q() {
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        cmmn.c(z);
        this.e.a();
        this.a = 0;
        this.b = null;
        this.h = null;
        this.c = false;
        z();
    }

    @Override // defpackage.clol
    public final void r() {
        cmmn.c(this.a == 0);
        this.e.a();
        A();
    }

    @Override // defpackage.clon
    public int s() {
        return 0;
    }

    @Override // defpackage.cloi
    public void t(int i, Object obj) {
    }

    protected void u(boolean z, boolean z2) {
    }

    protected void v(Format[] formatArr, long j, long j2) {
        throw null;
    }

    protected void w(long j, boolean z) {
        throw null;
    }

    protected void x() {
    }

    protected void y() {
    }

    protected void z() {
        throw null;
    }
}
