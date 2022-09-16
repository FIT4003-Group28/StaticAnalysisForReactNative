package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fpp  reason: default package */
/* loaded from: classes6.dex */
final class fpp<T> implements dzsj<T> {
    final /* synthetic */ fpq a;
    private final int b;

    public fpp(fpq fpqVar, int i) {
        this.a = fpqVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        int i = this.b;
        if (i == 0) {
            fpq fpqVar = this.a;
            return (T) new ivg(fpqVar.c.fN(), fpqVar.c.eW.kb(), fpqVar.c.eW.o(), fpqVar.c.eW.K());
        } else if (i == 1) {
            return (T) new jmn(ydq.class);
        } else {
            if (i == 2) {
                fpq fpqVar2 = this.a;
                buuf buufVar = fpqVar2.d;
                if (buufVar == null) {
                    dxio c = dxjc.c(fpqVar2.c.eW.h());
                    bvrb tn = fpqVar2.c.eW.a.tn();
                    dxjg.e(tn);
                    buufVar = new buuf(new buue(c, tn));
                    fpqVar2.d = buufVar;
                }
                Executor sU = fpqVar2.c.eW.a.sU();
                dxjg.e(sU);
                ckcw rU = fpqVar2.c.eW.a.rU();
                dxjg.e(rU);
                return (T) new ydu(buufVar, sU, rU);
            } else if (i == 3) {
                fpq fpqVar3 = this.a;
                ftt fttVar = fpqVar3.c;
                return (T) new ygu(fttVar.eV, fttVar.eW.K(), fpqVar3.c.to(), fpqVar3.c.sj(), fpqVar3.c.eW.il(), fpqVar3.c.jN());
            } else {
                fpq fpqVar4 = this.a;
                akto bG = fpqVar4.c.bG();
                akox ap = fpqVar4.c.ap();
                gle bM = fpqVar4.c.bM();
                yfv yfvVar = new yfv(fpqVar4.c.bG());
                alec bJ = fpqVar4.c.bJ();
                Object obj3 = fpqVar4.b;
                if (obj3 instanceof dxjf) {
                    synchronized (obj3) {
                        obj = fpqVar4.b;
                        if (obj instanceof dxjf) {
                            Application a = fpqVar4.c.eW.a.a();
                            dxjg.e(a);
                            Object c2 = fpqVar4.c();
                            cqat rR = fpqVar4.c.eW.a.rR();
                            dxjg.e(rR);
                            dxio c3 = dxjc.c(fpqVar4.c.bA());
                            btvo rp = fpqVar4.c.eW.a.rp();
                            dxjg.e(rp);
                            xlg b = xll.b(a, c2, rR, c3, rp, fpqVar4.d());
                            xlc b2 = fpqVar4.b();
                            Object c4 = fpqVar4.c();
                            xkw xkwVar = new xkw(fpqVar4.c.ap(), new alen(fpqVar4.c.ap()), fpqVar4.c.bJ());
                            cjqy tr = fpqVar4.c.eW.a.tr();
                            dxjg.e(tr);
                            cjqq tp = fpqVar4.c.eW.a.tp();
                            dxjg.e(tp);
                            xmn d = fpqVar4.d();
                            akox ap2 = fpqVar4.c.ap();
                            akzh au = fpqVar4.c.au();
                            alhv sr = fpqVar4.c.eW.sr();
                            Object obj4 = fpqVar4.a;
                            if (obj4 instanceof dxjf) {
                                synchronized (obj4) {
                                    obj2 = fpqVar4.a;
                                    if (obj2 instanceof dxjf) {
                                        Application a2 = fpqVar4.c.eW.a.a();
                                        dxjg.e(a2);
                                        obj2 = new xmg(a2, fpqVar4.c.bM(), fpqVar4.c.eW.wf(), fpqVar4.c.ap());
                                        dxjc.d(fpqVar4.a, obj2);
                                        fpqVar4.a = obj2;
                                    }
                                }
                                obj4 = obj2;
                            }
                            crzb sO = fpqVar4.c.eW.a.sO();
                            dxjg.e(sO);
                            bvrb tn2 = fpqVar4.c.eW.a.tn();
                            dxjg.e(tn2);
                            cqba vu = fpqVar4.c.eW.a.vu();
                            dxjg.e(vu);
                            btvo rp2 = fpqVar4.c.eW.a.rp();
                            dxjg.e(rp2);
                            obj = xlv.b(b, b2, c4, xkwVar, tr, tp, d, ap2, au, sr, (xmg) obj4, sO, tn2, vu, rp2);
                            dxjc.d(fpqVar4.b, obj);
                            fpqVar4.b = obj;
                        }
                    }
                    obj3 = obj;
                }
                bvrb tn3 = fpqVar4.c.eW.a.tn();
                dxjg.e(tn3);
                cqat rR2 = fpqVar4.c.eW.a.rR();
                dxjg.e(rR2);
                return (T) new yfu(bG, ap, bM, yfvVar, bJ, (xlu) obj3, tn3, rR2, fpqVar4.c.au(), fpqVar4.c.ty(), fpqVar4.c.jM());
            }
        }
    }
}
