package defpackage;
/* compiled from: PG */
/* renamed from: eatm  reason: default package */
/* loaded from: classes6.dex */
public final class eatm extends easu {
    public eatm(eaon eaonVar, eaop eaopVar) {
        super(eaonVar, eaopVar);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int A() {
        return this.b.A() + 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int B(long j) {
        return this.b.B(j) + 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int C(eapt eaptVar) {
        return this.b.C(eaptVar) + 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        return this.b.D(eaptVar, iArr) + 1;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long F(long j) {
        return this.b.F(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long G(long j) {
        return this.b.G(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return this.b.H(j);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int d(long j) {
        int d = this.b.d(j);
        return d == 0 ? A() : d;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        return this.b.k(j, i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        return this.b.l(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int n(long j, long j2) {
        return this.b.n(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        return this.b.o(j, j2);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        int A = A();
        easy.e(this, i, 1, A);
        if (i == A) {
            i = 0;
        }
        return this.b.p(j, i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final boolean u(long j) {
        return this.b.u(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox v() {
        return this.b.v();
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int w() {
        return 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int x(long j) {
        return 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int y(eapt eaptVar) {
        return 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int z(eapt eaptVar, int[] iArr) {
        return 1;
    }
}
