package defpackage;
/* compiled from: PG */
/* renamed from: fbe  reason: default package */
/* loaded from: classes6.dex */
final class fbe<T> implements dzsj<T> {
    final /* synthetic */ fbf a;
    private final int b;

    public fbe(fbf fbfVar, int i) {
        this.a = fbfVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fbf fbfVar = this.a;
                dzsj<efh> fN = fbfVar.d.fN();
                ftt fttVar = fbfVar.d;
                return (T) new bwow(fN, fttVar.eV, fttVar.cz(), fbfVar.d.aK(), fbfVar.d.bT());
            case 1:
                fbf fbfVar2 = this.a;
                cqat rR = fbfVar2.d.eW.a.rR();
                dxjg.e(rR);
                ftt fttVar2 = fbfVar2.d;
                return (T) new bwpz(rR, fttVar2.a, new bwqd(dxjh.c(fttVar2.ay())), new bwqb(dxjh.c(fbfVar2.d.ay())));
            case 2:
                fbf fbfVar3 = this.a;
                return (T) new vrg(fbfVar3.d.eW.il(), fbfVar3.d.fe(), fbfVar3.d.eW.ds(), fbfVar3.d.eW.n());
            case 3:
                fbf fbfVar4 = this.a;
                dzsj<cklf> fe = fbfVar4.d.fe();
                dzsj<vpd> ds = fbfVar4.d.eW.ds();
                dzsj<btrm> n = fbfVar4.d.eW.n();
                dzsj dzsjVar = fbfVar4.a;
                if (dzsjVar == null) {
                    dzsjVar = new fbe(fbfVar4, 4);
                    fbfVar4.a = dzsjVar;
                }
                return (T) new vrc(fe, ds, n, dzsjVar, fbfVar4.d.ad(), dxjh.c(fbfVar4.d.aV()));
            case 4:
                return (T) new vre(this.a.d.eV);
            case 5:
                fbf fbfVar5 = this.a;
                dzsj<cklf> fe2 = fbfVar5.d.fe();
                dzsj<vpd> ds2 = fbfVar5.d.eW.ds();
                dzsj<btrm> n2 = fbfVar5.d.eW.n();
                dzsj dzsjVar2 = fbfVar5.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fbe(fbfVar5, 6);
                    fbfVar5.b = dzsjVar2;
                }
                return (T) new vrp(fe2, ds2, n2, dzsjVar2, fbfVar5.d.ad(), dxjh.c(fbfVar5.d.aV()));
            case 6:
                return (T) new vrr(this.a.d.eV);
            case 7:
                fbf fbfVar6 = this.a;
                dzsj<cklf> fe3 = fbfVar6.d.fe();
                dzsj<vpd> ds3 = fbfVar6.d.eW.ds();
                dzsj<btrm> n3 = fbfVar6.d.eW.n();
                dzsj dzsjVar3 = fbfVar6.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fbe(fbfVar6, 8);
                    fbfVar6.c = dzsjVar3;
                }
                return (T) new vri(fe3, ds3, n3, dzsjVar3, fbfVar6.d.ad(), dxjh.c(fbfVar6.d.aV()));
            case 8:
                return (T) new vrk(this.a.d.eV);
            default:
                fbf fbfVar7 = this.a;
                return (T) new bwqg(fbfVar7.d.cC(), fbfVar7.d.eW.I());
        }
    }
}
