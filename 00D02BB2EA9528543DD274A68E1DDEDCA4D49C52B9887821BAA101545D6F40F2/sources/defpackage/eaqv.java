package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaqv  reason: default package */
/* loaded from: classes6.dex */
public final class eaqv extends eate {
    private final eaqt b;

    public eaqv(eaqt eaqtVar, eaox eaoxVar) {
        super(eaop.h, eaoxVar);
        this.b = eaqtVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return 366;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int B(long j) {
        return this.b.W(this.b.ac(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int C(eapt eaptVar) {
        if (eaptVar.i(eaop.g)) {
            return this.b.W(eaptVar.h(eaop.g));
        }
        return 366;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        int e = eaptVar.e();
        for (int i = 0; i < e; i++) {
            if (eaptVar.x(i) == eaop.g) {
                return this.b.W(iArr[i]);
            }
        }
        return 366;
    }

    @Override // defpackage.eate
    protected final int K(long j, int i) {
        if (i > 365 || i <= 0) {
            return B(j);
        }
        return 365;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        eaqt eaqtVar = this.b;
        return eaqtVar.af(j, eaqtVar.ac(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.b.g;
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final int w() {
        return 1;
    }
}
