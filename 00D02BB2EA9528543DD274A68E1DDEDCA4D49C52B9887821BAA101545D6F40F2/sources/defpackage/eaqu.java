package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaqu  reason: default package */
/* loaded from: classes6.dex */
public final class eaqu extends eate {
    private final eaqt b;

    public eaqu(eaqt eaqtVar, eaox eaoxVar) {
        super(eaop.j, eaoxVar);
        this.b = eaqtVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return 31;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int B(long j) {
        return this.b.al(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int C(eapt eaptVar) {
        if (eaptVar.i(eaop.i)) {
            int h = eaptVar.h(eaop.i);
            if (eaptVar.i(eaop.g)) {
                return this.b.aq(eaptVar.h(eaop.g), h);
            }
            return this.b.ar(h);
        }
        return 31;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        int e = eaptVar.e();
        for (int i = 0; i < e; i++) {
            if (eaptVar.x(i) == eaop.i) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < e; i3++) {
                    if (eaptVar.x(i3) == eaop.g) {
                        return this.b.aq(iArr[i3], i2);
                    }
                }
                return this.b.ar(i2);
            }
        }
        return 31;
    }

    @Override // defpackage.eate
    protected final int K(long j, int i) {
        return this.b.am(j, i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        eaqt eaqtVar = this.b;
        int ac = eaqtVar.ac(j);
        return eaqtVar.ae(j, ac, eaqtVar.ad(j, ac));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.b.f;
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final int w() {
        return 1;
    }
}
