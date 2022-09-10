package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: fmu  reason: default package */
/* loaded from: classes6.dex */
final class fmu<T> implements dzsj<T> {
    final /* synthetic */ fmv a;
    private final int b;

    public fmu(fmv fmvVar, int i) {
        this.a = fmvVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        switch (this.b) {
            case 0:
                fmv fmvVar = this.a;
                return (T) new ivg(fmvVar.c.fN(), fmvVar.c.eW.kb(), fmvVar.c.eW.o(), fmvVar.c.eW.K());
            case 1:
                fmv fmvVar2 = this.a;
                cqat rR = fmvVar2.c.eW.a.rR();
                dxjg.e(rR);
                ckcw rU = fmvVar2.c.eW.a.rU();
                dxjg.e(rU);
                return (T) new xcs(rR, rU);
            case 2:
                return (T) new jmn(wio.class);
            case 3:
                fmv fmvVar3 = this.a;
                Application a = fmvVar3.c.eW.a.a();
                dxjg.e(a);
                return (T) new wqj(a, fmvVar3.c.eW.g(), fmvVar3.c.jR());
            case 4:
                fmv fmvVar4 = this.a;
                return (T) new wqr(fmvVar4.c.eW.m(), fmvVar4.c.fN(), fmvVar4.c.eW.il(), fmvVar4.c.eW.jm(), fmvVar4.c.eW.bk());
            case 5:
                fmv fmvVar5 = this.a;
                return (T) new wkg(fmvVar5.c.eW.nD(), fmvVar5.c.eW.fr(), fmvVar5.c.eW.V());
            case 6:
                fmv fmvVar6 = this.a;
                dxio c = dxjc.c(fmvVar6.c.H());
                akto bG = fmvVar6.c.bG();
                akox ap = fmvVar6.c.ap();
                gle bM = fmvVar6.c.bM();
                ales alesVar = new ales(fmvVar6.c.ap());
                Object obj3 = fmvVar6.b;
                if (obj3 instanceof dxjf) {
                    synchronized (obj3) {
                        obj = fmvVar6.b;
                        if (obj instanceof dxjf) {
                            Application a2 = fmvVar6.c.eW.a.a();
                            dxjg.e(a2);
                            Object c2 = fmvVar6.c();
                            cqat rR2 = fmvVar6.c.eW.a.rR();
                            dxjg.e(rR2);
                            dxio c3 = dxjc.c(fmvVar6.c.bA());
                            btvo rp = fmvVar6.c.eW.a.rp();
                            dxjg.e(rp);
                            xlg b = xll.b(a2, c2, rR2, c3, rp, fmvVar6.d());
                            xlc b2 = fmvVar6.b();
                            Object c4 = fmvVar6.c();
                            xkw xkwVar = new xkw(fmvVar6.c.ap(), new alen(fmvVar6.c.ap()), fmvVar6.c.bJ());
                            cjqy tr = fmvVar6.c.eW.a.tr();
                            dxjg.e(tr);
                            cjqq tp = fmvVar6.c.eW.a.tp();
                            dxjg.e(tp);
                            xmn d = fmvVar6.d();
                            akox ap2 = fmvVar6.c.ap();
                            akzh au = fmvVar6.c.au();
                            alhv sr = fmvVar6.c.eW.sr();
                            Object obj4 = fmvVar6.a;
                            if (obj4 instanceof dxjf) {
                                synchronized (obj4) {
                                    obj2 = fmvVar6.a;
                                    if (obj2 instanceof dxjf) {
                                        Application a3 = fmvVar6.c.eW.a.a();
                                        dxjg.e(a3);
                                        obj2 = new xmg(a3, fmvVar6.c.bM(), fmvVar6.c.eW.wf(), fmvVar6.c.ap());
                                        dxjc.d(fmvVar6.a, obj2);
                                        fmvVar6.a = obj2;
                                    }
                                }
                                obj4 = obj2;
                            }
                            crzb sO = fmvVar6.c.eW.a.sO();
                            dxjg.e(sO);
                            bvrb tn = fmvVar6.c.eW.a.tn();
                            dxjg.e(tn);
                            cqba vu = fmvVar6.c.eW.a.vu();
                            dxjg.e(vu);
                            btvo rp2 = fmvVar6.c.eW.a.rp();
                            dxjg.e(rp2);
                            obj = xlv.b(b, b2, c4, xkwVar, tr, tp, d, ap2, au, sr, (xmg) obj4, sO, tn, vu, rp2);
                            dxjc.d(fmvVar6.b, obj);
                            fmvVar6.b = obj;
                        }
                    }
                    obj3 = obj;
                }
                akto bG2 = fmvVar6.c.bG();
                Application a4 = fmvVar6.c.eW.a.a();
                dxjg.e(a4);
                wsu wsuVar = new wsu(bG2, a4);
                wst wstVar = new wst(fmvVar6.c.bB(), fmvVar6.c.eW.g(), fmvVar6.c.lB(), dxjc.c(fmvVar6.c.H()));
                Application a5 = fmvVar6.c.eW.a.a();
                dxjg.e(a5);
                return (T) new wrc(c, bG, ap, bM, alesVar, (xlu) obj3, wsuVar, wstVar, a5);
            case 7:
                fmv fmvVar7 = this.a;
                btvo rp3 = fmvVar7.c.eW.a.rp();
                dxjg.e(rp3);
                return (T) new cjbh(rp3, dxjc.c(fmvVar7.c.eW.p()), fmvVar7.c.eW.qq());
            case 8:
                fmv fmvVar8 = this.a;
                return (T) new cjbt(fmvVar8.c.ad(), fmvVar8.c.eW.il());
            default:
                fmv fmvVar9 = this.a;
                ftt fttVar = fmvVar9.c;
                return (T) new wrp(fttVar.eV, dxjh.c(fttVar.H()), fmvVar9.c.az(), fmvVar9.c.J(), dxjh.c(fmvVar9.c.m()), fmvVar9.c.eW.jm(), fmvVar9.c.eW.V(), fmvVar9.c.iW());
        }
    }
}
