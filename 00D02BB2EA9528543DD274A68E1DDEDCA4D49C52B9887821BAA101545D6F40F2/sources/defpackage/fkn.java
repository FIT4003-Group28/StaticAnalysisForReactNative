package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: fkn  reason: default package */
/* loaded from: classes6.dex */
final class fkn<T> implements dzsj<T> {
    final /* synthetic */ fko a;
    private final int b;

    public fkn(fko fkoVar, int i) {
        this.a = fkoVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fko fkoVar = this.a;
                Context gK = fkoVar.a.gK();
                dxio c = dxjc.c(fkoVar.a.ai());
                btvo rp = fkoVar.a.eW.a.rp();
                dxjg.e(rp);
                akfa rK = fkoVar.a.eW.a.rK();
                dxjg.e(rK);
                cjqy tr = fkoVar.a.eW.a.tr();
                dxjg.e(tr);
                fkoVar.a.eW.fv();
                return (T) new btjc(gK, c, rp, rK, tr);
            case 1:
                fko fkoVar2 = this.a;
                Context gK2 = fkoVar2.a.gK();
                bvjj rB = fkoVar2.a.eW.a.rB();
                dxjg.e(rB);
                cjqy tr2 = fkoVar2.a.eW.a.tr();
                dxjg.e(tr2);
                bsvj am = fkoVar2.a.eW.am();
                akfa rK2 = fkoVar2.a.eW.a.rK();
                dxjg.e(rK2);
                return (T) new btke(gK2, rB, tr2, am, rK2);
            case 2:
                fko fkoVar3 = this.a;
                Context gK3 = fkoVar3.a.gK();
                bvjj rB2 = fkoVar3.a.eW.a.rB();
                dxjg.e(rB2);
                cjqy tr3 = fkoVar3.a.eW.a.tr();
                dxjg.e(tr3);
                return (T) new btkl(gK3, rB2, tr3, fkoVar3.a.eW.am());
            case 3:
                fko fkoVar4 = this.a;
                gga wk = fkoVar4.a.wk();
                Context gK4 = fkoVar4.a.gK();
                beya qy = fkoVar4.a.qy();
                cjqy tr4 = fkoVar4.a.eW.a.tr();
                dxjg.e(tr4);
                return (T) new btiu(wk, gK4, qy, tr4);
            case 4:
                fko fkoVar5 = this.a;
                Context gK5 = fkoVar5.a.gK();
                akfa rK3 = fkoVar5.a.eW.a.rK();
                dxjg.e(rK3);
                bvjj rB3 = fkoVar5.a.eW.a.rB();
                dxjg.e(rB3);
                return (T) new btjy(gK5, rK3, rB3, fkoVar5.a.eW.am(), fkoVar5.a.cO());
            case 5:
                fko fkoVar6 = this.a;
                Context gK6 = fkoVar6.a.gK();
                cklf cp = fkoVar6.a.cp();
                cjqy tr5 = fkoVar6.a.eW.a.tr();
                dxjg.e(tr5);
                return (T) new btkc(gK6, cp, tr5, fkoVar6.a.kk());
            case 6:
                fko fkoVar7 = this.a;
                Context gK7 = fkoVar7.a.gK();
                cjqy tr6 = fkoVar7.a.eW.a.tr();
                dxjg.e(tr6);
                return (T) new btin(gK7, tr6, fkoVar7.a.eW.qn());
            case 7:
                fko fkoVar8 = this.a;
                Context gK8 = fkoVar8.a.gK();
                cjqy tr7 = fkoVar8.a.eW.a.tr();
                dxjg.e(tr7);
                azql bD = fkoVar8.a.eW.bD();
                fkoVar8.a.eW.qw();
                return (T) new btjo(gK8, tr7, bD);
            case 8:
                fko fkoVar9 = this.a;
                Context gK9 = fkoVar9.a.gK();
                bvjj rB4 = fkoVar9.a.eW.a.rB();
                dxjg.e(rB4);
                akfa rK4 = fkoVar9.a.eW.a.rK();
                dxjg.e(rK4);
                cjqy tr8 = fkoVar9.a.eW.a.tr();
                dxjg.e(tr8);
                return (T) new btjl(gK9, rB4, rK4, tr8, fkoVar9.a.eW.am());
            default:
                fko fkoVar10 = this.a;
                Context gK10 = fkoVar10.a.gK();
                cjqy tr9 = fkoVar10.a.eW.a.tr();
                dxjg.e(tr9);
                bvjj rB5 = fkoVar10.a.eW.a.rB();
                dxjg.e(rB5);
                return (T) new btil(gK10, tr9, rB5);
        }
    }
}
