package defpackage;
/* compiled from: PG */
/* renamed from: aacs  reason: default package */
/* loaded from: classes2.dex */
final class aacs implements brpv {
    final dprx a;
    final akqs b;

    public aacs(dprx dprxVar, akqs akqsVar) {
        this.a = dprxVar;
        this.b = akqsVar;
    }

    @Override // defpackage.brpv
    public final brpu a(brpv brpvVar) {
        if (!(brpvVar instanceof aacs)) {
            return aacr.a;
        }
        aacs aacsVar = (aacs) brpvVar;
        if (!this.a.equals(aacsVar.a)) {
            return aacr.a;
        }
        double h = akqs.h(this.b, aacsVar.b);
        double max = Math.max((double) dcyn.a, Math.min(h / ((this.b.g() + aacsVar.b.g()) - h), 1.0d));
        return max < 0.14285714285714285d ? aacr.a : new aacr(dbsg.i(Double.valueOf(max)));
    }

    @Override // defpackage.brpv
    public final String b() {
        dprx dprxVar = this.a;
        int i = dprxVar.bC;
        if (i == 0) {
            i = dsst.a.b(dprxVar).c(dprxVar);
            dprxVar.bC = i;
        }
        return Integer.toString(i);
    }
}
