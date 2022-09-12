package defpackage;
/* compiled from: PG */
/* renamed from: eatc  reason: default package */
/* loaded from: classes6.dex */
public final class eatc extends easu {
    private final int a;
    private final int c;
    private final int d;

    public eatc(eaon eaonVar, int i) {
        this(eaonVar, eaonVar == null ? null : eaonVar.a(), i);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int A() {
        return this.d;
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
        return this.b.d(j) + this.a;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        long k = super.k(j, i);
        easy.e(this, d(k), this.c, this.d);
        return k;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        long l = super.l(j, j2);
        easy.e(this, d(l), this.c, this.d);
        return l;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, this.c, this.d);
        return super.p(j, i - this.a);
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
        return this.c;
    }

    public eatc(eaon eaonVar, eaop eaopVar) {
        this(eaonVar, eaopVar, 1);
    }

    public eatc(eaon eaonVar, eaop eaopVar, int i) {
        super(eaonVar, eaopVar);
        this.a = i;
        if (eaonVar.w() + i > Integer.MIN_VALUE) {
            this.c = eaonVar.w() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (eaonVar.A() + i < Integer.MAX_VALUE) {
            this.d = eaonVar.A() + i;
        } else {
            this.d = Integer.MAX_VALUE;
        }
    }
}
