package defpackage;
/* compiled from: PG */
/* renamed from: easx  reason: default package */
/* loaded from: classes6.dex */
public final class easx extends easu {
    final int a;
    final eaox c;
    private final int d;
    private final int e;

    public easx(eaon eaonVar, eaop eaopVar) {
        super(eaonVar, eaopVar);
        eaox s = eaonVar.s();
        if (s == null) {
            this.c = null;
        } else {
            this.c = new eath(s, ((eaoo) eaopVar).a);
        }
        this.a = 100;
        int w = eaonVar.w();
        int i = w >= 0 ? w / 100 : ((w + 1) / 100) - 1;
        int A = eaonVar.A();
        int i2 = A >= 0 ? A / 100 : ((A + 1) / 100) - 1;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int A() {
        return this.e;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long F(long j) {
        eaon eaonVar = this.b;
        return eaonVar.F(eaonVar.p(j, d(j) * 100));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return p(j, d(this.b.H(j)));
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int d(long j) {
        int d = this.b.d(j);
        return d >= 0 ? d / 100 : ((d + 1) / 100) - 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        return this.b.k(j, i * 100);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        return this.b.l(j, j2 * 100);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int n(long j, long j2) {
        return this.b.n(j, j2) / 100;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        return this.b.o(j, j2) / 100;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, this.d, this.e);
        int d = this.b.d(j);
        return this.b.p(j, (i * 100) + (d >= 0 ? d % 100 : ((d + 1) % 100) + 99));
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final eaox s() {
        return this.c;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int w() {
        return this.d;
    }
}
