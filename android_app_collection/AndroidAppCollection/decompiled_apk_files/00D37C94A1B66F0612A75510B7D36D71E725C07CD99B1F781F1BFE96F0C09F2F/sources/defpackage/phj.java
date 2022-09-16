package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: phj  reason: default package */
/* loaded from: classes4.dex */
public abstract class phj implements pkd, pke {
    private pkf b;
    private int c;
    private pri d;
    private Format[] e;
    private long f;
    private boolean h;
    public final int n;
    public int o;
    public boolean p;
    private final pit a = new pit();
    private long g = Long.MIN_VALUE;

    public phj(int i) {
        this.n = i;
    }

    @Override // defpackage.pkd
    public /* synthetic */ void D(float f, float f2) {
    }

    @Override // defpackage.pkd
    public pwj P() {
        return null;
    }

    @Override // defpackage.pkd
    public final int Q() {
        return this.o;
    }

    @Override // defpackage.pkd, defpackage.pke
    public final int R() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int S(pit pitVar, pmv pmvVar, int i) {
        pri priVar = this.d;
        ptx.a(priVar);
        int a = priVar.a(pitVar, pmvVar, i);
        if (a == -4) {
            if (pmvVar.isEndOfStream()) {
                this.g = Long.MIN_VALUE;
                return this.p ? -4 : -3;
            }
            long j = pmvVar.f + this.f;
            pmvVar.f = j;
            this.g = Math.max(this.g, j);
        } else if (a == -5) {
            Format format = pitVar.b;
            ptx.a(format);
            if (format.p != Long.MAX_VALUE) {
                pis b = format.b();
                b.o = format.p + this.f;
                pitVar.b = b.a();
                return -5;
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int T(long j) {
        pri priVar = this.d;
        ptx.a(priVar);
        return priVar.b(j - this.f);
    }

    @Override // defpackage.pkd
    public final long U() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final phr V(Throwable th, Format format, int i) {
        return W(th, format, false, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.phr W(java.lang.Throwable r14, com.google.android.exoplayer2.Format r15, boolean r16, int r17) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            r2 = 4
            if (r0 == 0) goto L1e
            boolean r3 = r1.h
            if (r3 != 0) goto L1e
            r3 = 1
            r1.h = r3
            r3 = 0
            int r4 = r13.a(r15)     // Catch: java.lang.Throwable -> L18 defpackage.phr -> L1c
            int r4 = defpackage.pku.c(r4)     // Catch: java.lang.Throwable -> L18 defpackage.phr -> L1c
            r1.h = r3
            goto L1f
        L18:
            r0 = move-exception
            r1.h = r3
            throw r0
        L1c:
            r1.h = r3
        L1e:
            r4 = 4
        L1f:
            java.lang.String r7 = r13.d()
            int r8 = r1.c
            if (r0 != 0) goto L29
            r10 = 4
            goto L2a
        L29:
            r10 = r4
        L2a:
            phr r12 = new phr
            r3 = 1
            r5 = 0
            r2 = r12
            r4 = r14
            r6 = r17
            r9 = r15
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.W(java.lang.Throwable, com.google.android.exoplayer2.Format, boolean, int):phr");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pit X() {
        this.a.a();
        return this.a;
    }

    @Override // defpackage.pkd
    public final pke Y() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pkf Z() {
        pkf pkfVar = this.b;
        ptx.a(pkfVar);
        return pkfVar;
    }

    @Override // defpackage.pkd
    public final pri aa() {
        return this.d;
    }

    @Override // defpackage.pkd
    public final void ab() {
        boolean z = true;
        if (this.o != 1) {
            z = false;
        }
        ptx.e(z);
        this.a.a();
        this.o = 0;
        this.d = null;
        this.e = null;
        this.p = false;
        p();
    }

    @Override // defpackage.pkd
    public final void ac(pkf pkfVar, Format[] formatArr, pri priVar, long j, boolean z, boolean z2, long j2, long j3) {
        ptx.e(this.o == 0);
        this.b = pkfVar;
        this.o = 1;
        q(z, z2);
        ah(formatArr, priVar, j2, j3);
        s(j, z);
    }

    @Override // defpackage.pkb
    public void ad(int i, Object obj) {
    }

    @Override // defpackage.pkd
    public final void ae() {
        pri priVar = this.d;
        ptx.a(priVar);
        priVar.c();
    }

    protected void af() {
    }

    protected void ag() {
    }

    @Override // defpackage.pkd
    public final void ah(Format[] formatArr, pri priVar, long j, long j2) {
        ptx.e(!this.p);
        this.d = priVar;
        if (this.g == Long.MIN_VALUE) {
            this.g = j;
        }
        this.e = formatArr;
        this.f = j2;
        x(formatArr, j, j2);
    }

    @Override // defpackage.pkd
    public final void ai() {
        ptx.e(this.o == 0);
        this.a.a();
        w();
    }

    @Override // defpackage.pkd
    public final void aj(long j) {
        this.p = false;
        this.g = j;
        s(j, false);
    }

    @Override // defpackage.pkd
    public final void ak() {
        this.p = true;
    }

    @Override // defpackage.pkd
    public final void al(int i) {
        this.c = i;
    }

    @Override // defpackage.pkd
    public final void am() {
        boolean z = true;
        if (this.o != 1) {
            z = false;
        }
        ptx.e(z);
        this.o = 2;
        af();
    }

    @Override // defpackage.pkd
    public final void an() {
        ptx.e(this.o == 2);
        this.o = 1;
        ag();
    }

    @Override // defpackage.pkd
    public final boolean ao() {
        return this.g == Long.MIN_VALUE;
    }

    @Override // defpackage.pkd
    public final boolean ap() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean aq() {
        if (ao()) {
            return this.p;
        }
        pri priVar = this.d;
        ptx.a(priVar);
        return priVar.pZ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Format[] ar() {
        return (Format[]) ptx.a(this.e);
    }

    public int jE() {
        return 0;
    }

    protected void p() {
        throw null;
    }

    protected void q(boolean z, boolean z2) {
    }

    protected void s(long j, boolean z) {
        throw null;
    }

    protected void w() {
    }

    protected void x(Format[] formatArr, long j, long j2) {
    }
}
