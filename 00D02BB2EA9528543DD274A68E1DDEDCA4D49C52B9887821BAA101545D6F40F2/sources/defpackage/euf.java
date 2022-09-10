package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: euf  reason: default package */
/* loaded from: classes6.dex */
final class euf<T> implements dzsj<T> {
    final /* synthetic */ eug a;
    private final int b;

    public euf(eug eugVar, int i) {
        this.a = eugVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                eug eugVar = this.a;
                dzsj<bvrb> R = eugVar.g.eW.R();
                dzsj<btrm> n = eugVar.g.eW.n();
                dzsj<akox> as = eugVar.g.as();
                dzsj<btvo> V = eugVar.g.eW.V();
                dzsj<cqkj> y = eugVar.g.y();
                ftt fttVar = eugVar.g;
                return (T) new brbh(R, n, as, V, y, fttVar.eV, fttVar.eW.il());
            case 1:
                eug eugVar2 = this.a;
                ivj fZ = eugVar2.g.fZ();
                gga wk = eugVar2.g.wk();
                btvo rp = eugVar2.g.eW.a.rp();
                dxjg.e(rp);
                return (T) aafz.b(fZ, wk, rp, dxjc.c(eugVar2.g.aK()), new aafu(eugVar2.g.eV));
            case 2:
                ftt fttVar2 = this.a.g;
                return (T) new aadj(fttVar2.eV, fttVar2.eW.il());
            case 3:
                eug eugVar3 = this.a;
                dzsj<bwqv> er = eugVar3.g.eW.er();
                ftt fttVar3 = eugVar3.g;
                dzsj dzsjVar = fttVar3.cE;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar3, 1296);
                    fttVar3.cE = dzsjVar;
                }
                dzsj dzsjVar2 = eugVar3.a;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new euf(eugVar3, 4);
                    eugVar3.a = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj<cbea> ro = eugVar3.g.ro();
                dzsj<cbqg> mL = eugVar3.g.eW.mL();
                dzsj dzsjVar4 = eugVar3.b;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new euf(eugVar3, 5);
                    eugVar3.b = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj dzsjVar6 = eugVar3.e;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new euf(eugVar3, 6);
                    eugVar3.e = dzsjVar6;
                }
                return (T) new aabz(er, dzsjVar, dzsjVar3, ro, mL, dzsjVar5, dzsjVar6);
            case 4:
                return (T) new aadg(dxjh.c(this.a.g.bh()));
            case 5:
                eug eugVar4 = this.a;
                return (T) new aacj(dxjc.c(eugVar4.g.rn()), eugVar4.g.eW.jh());
            case 6:
                eug eugVar5 = this.a;
                dzsj dzsjVar7 = eugVar5.c;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new euf(eugVar5, 7);
                    eugVar5.c = dzsjVar7;
                }
                dzsj dzsjVar8 = eugVar5.d;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new euf(eugVar5, 8);
                    eugVar5.d = dzsjVar8;
                }
                return (T) new bsne(dzsjVar7, dzsjVar8, eugVar5.g.jg());
            case 7:
                eug eugVar6 = this.a;
                return (T) new bsng(eugVar6.g.eW.V(), eugVar6.g.eW.fr(), eugVar6.g.rF());
            case 8:
                return (T) new bsnb(dxjh.c(this.a.g.J()));
            case 9:
                eug eugVar7 = this.a;
                dzsj<bskt> rY = eugVar7.g.rY();
                dzsj<aehr> lz = eugVar7.g.eW.lz();
                dzsj dzsjVar9 = eugVar7.f;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new euf(eugVar7, 10);
                    eugVar7.f = dzsjVar9;
                }
                return (T) new brze(rY, lz, dzsjVar9, eugVar7.g.eW.il());
            case 10:
                return (T) brzy.b(this.a.g.wk(), new cqhn());
            default:
                Application a = this.a.g.eW.a.a();
                dxjg.e(a);
                return (T) new aadk(a);
        }
    }
}
