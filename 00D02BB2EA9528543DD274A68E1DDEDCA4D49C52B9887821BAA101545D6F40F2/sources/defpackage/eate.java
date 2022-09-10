package defpackage;
/* compiled from: PG */
/* renamed from: eate  reason: default package */
/* loaded from: classes6.dex */
public abstract class eate extends eass {
    final long a;
    private final eaox b;

    public eate(eaop eaopVar, eaox eaoxVar) {
        super(eaopVar);
        if (!eaoxVar.c()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long d = eaoxVar.d();
        this.a = d;
        if (d >= 1) {
            this.b = eaoxVar;
            return;
        }
        throw new IllegalArgumentException("The unit milliseconds must be at least 1");
    }

    @Override // defpackage.eass, defpackage.eaon
    public long F(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.eass, defpackage.eaon
    public long G(long j) {
        if (j > 0) {
            long j2 = j - 1;
            long j3 = this.a;
            return (j2 - (j2 % j3)) + j3;
        }
        return j - (j % this.a);
    }

    @Override // defpackage.eass, defpackage.eaon
    public long H(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    protected int K(long j, int i) {
        return B(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public long p(long j, int i) {
        easy.e(this, i, w(), K(j, i));
        return j + ((i - d(j)) * this.a);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox s() {
        return this.b;
    }

    @Override // defpackage.eass, defpackage.eaon
    public int w() {
        return 0;
    }
}
