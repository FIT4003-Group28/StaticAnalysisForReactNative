package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earb  reason: default package */
/* loaded from: classes6.dex */
public final class earb extends eata {
    protected final eaqt a;

    public earb(eaqt eaqtVar) {
        super(eaop.g, eaqtVar.aw());
        this.a = eaqtVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return this.a.av();
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long F(long j) {
        return this.a.Z(d(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long G(long j) {
        int d = d(j);
        return j != this.a.Z(d) ? this.a.Z(d + 1) : j;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return j - F(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        return this.a.ac(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        if (i == 0) {
            return j;
        }
        int d = d(j);
        int i2 = d + i;
        if ((d ^ i2) >= 0 || (d ^ i) < 0) {
            return p(j, i2);
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("The calculation caused an overflow: ");
        sb.append(d);
        sb.append(" + ");
        sb.append(i);
        throw new ArithmeticException(sb.toString());
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        return k(j, easy.d(j2));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        if (j < j2) {
            return -this.a.ao(j2, j);
        }
        return this.a.ao(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, this.a.au(), this.a.av());
        return this.a.aA(j, i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return null;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final boolean u(long j) {
        return this.a.ap(d(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox v() {
        return this.a.c;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int w() {
        return this.a.au();
    }
}
