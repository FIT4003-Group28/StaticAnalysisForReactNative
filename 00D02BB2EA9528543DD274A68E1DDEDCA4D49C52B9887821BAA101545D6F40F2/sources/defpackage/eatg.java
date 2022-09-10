package defpackage;
/* compiled from: PG */
/* renamed from: eatg  reason: default package */
/* loaded from: classes6.dex */
public final class eatg extends easu {
    final eaox a;

    public eatg(eaon eaonVar, eaop eaopVar) {
        super(eaonVar, eaopVar);
        eaox s = eaonVar.s();
        if (s == null) {
            this.a = null;
        } else {
            this.a = new eath(s, ((eaoo) eaopVar).b);
        }
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int A() {
        return 99;
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
        return d >= 0 ? d % 100 : ((d + 1) % 100) + 99;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, 0, 99);
        int d = this.b.d(j);
        return this.b.p(j, ((d >= 0 ? d / 100 : ((d + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.a;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int w() {
        return 0;
    }

    public eatg(easx easxVar) {
        this(easxVar, easxVar.i);
    }

    public eatg(easx easxVar, eaop eaopVar) {
        super(easxVar.b, eaopVar);
        int i = easxVar.a;
        this.a = easxVar.c;
    }
}
