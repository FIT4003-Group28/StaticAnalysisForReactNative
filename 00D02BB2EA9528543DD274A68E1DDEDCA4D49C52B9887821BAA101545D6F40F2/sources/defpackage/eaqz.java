package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaqz  reason: default package */
/* loaded from: classes6.dex */
public final class eaqz extends eate {
    private final eaqt b;

    public eaqz(eaqt eaqtVar, eaox eaoxVar) {
        super(eaop.m, eaoxVar);
        this.b = eaqtVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return 53;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int B(long j) {
        return this.b.X(this.b.ag(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int C(eapt eaptVar) {
        if (eaptVar.i(eaop.l)) {
            return this.b.X(eaptVar.h(eaop.l));
        }
        return 53;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        int e = eaptVar.e();
        for (int i = 0; i < e; i++) {
            if (eaptVar.x(i) == eaop.l) {
                return this.b.X(iArr[i]);
            }
        }
        return 53;
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final long F(long j) {
        return super.F(j + 259200000) - 259200000;
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final long G(long j) {
        return super.G(j + 259200000) - 259200000;
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return super.H(j + 259200000);
    }

    @Override // defpackage.eate
    protected final int K(long j, int i) {
        if (i > 52) {
            return B(j);
        }
        return 52;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        return this.b.ah(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.b.e;
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final int w() {
        return 1;
    }
}
