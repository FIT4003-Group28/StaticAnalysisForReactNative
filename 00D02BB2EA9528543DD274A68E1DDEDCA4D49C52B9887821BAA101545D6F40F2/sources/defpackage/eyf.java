package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eyf  reason: default package */
/* loaded from: classes6.dex */
final class eyf<T> implements dzsj<T> {
    final /* synthetic */ eyg a;
    private final int b;

    public eyf(eyg eygVar, int i) {
        this.a = eygVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        int i = this.b;
        if (i == 0) {
            eyg eygVar = this.a;
            ckcw rU = eygVar.d.eW.a.rU();
            dxjg.e(rU);
            qro bJ = eygVar.d.eW.bJ();
            azql bD = eygVar.d.eW.bD();
            qjk bK = eygVar.d.eW.bK();
            axwe bE = eygVar.d.eW.bE();
            sic bI = eygVar.d.eW.bI();
            axwq qn = eygVar.d.eW.qn();
            dxio c = dxjc.c(eygVar.d.J());
            dehp tl = eygVar.d.eW.a.tl();
            dxjg.e(tl);
            Executor sU = eygVar.d.eW.a.sU();
            dxjg.e(sU);
            return (T) new sbz(rU, bJ, bD, bK, bE, bI, qn, c, tl, sU);
        } else if (i == 1) {
            eyg eygVar2 = this.a;
            Application a = eygVar2.d.eW.a.a();
            dxjg.e(a);
            Application a2 = eygVar2.d.eW.a.a();
            dxjg.e(a2);
            qjk bK2 = eygVar2.d.eW.bK();
            sic bI2 = eygVar2.d.eW.bI();
            cqat rR = eygVar2.d.eW.a.rR();
            dxjg.e(rR);
            shu shuVar = new shu(rR);
            Executor sU2 = eygVar2.d.eW.a.sU();
            dxjg.e(sU2);
            shs shsVar = new shs(a2, bK2, bI2, shuVar, sU2);
            dzsj dzsjVar = eygVar2.a;
            if (dzsjVar == null) {
                dzsjVar = new eyf(eygVar2, 2);
                eygVar2.a = dzsjVar;
            }
            sii vv = eygVar2.d.vv();
            Executor sU3 = eygVar2.d.eW.a.sU();
            dxjg.e(sU3);
            return (T) new sim(a, shsVar, dzsjVar, vv, sU3);
        } else if (i == 2) {
            eyg eygVar3 = this.a;
            btrm rz = eygVar3.d.eW.a.rz();
            dxjg.e(rz);
            return (T) new qsm(rz, eygVar3.d.eW.dH(), eygVar3.d.eW.ry());
        } else if (i != 3) {
            eyg eygVar4 = this.a;
            Object tv = eygVar4.d.tv();
            bvjj rB = eygVar4.d.eW.a.rB();
            dxjg.e(rB);
            return (T) new wbv((wbl) tv, rB);
        } else {
            eyg eygVar5 = this.a;
            Object obj2 = eygVar5.c;
            if (obj2 instanceof dxjf) {
                synchronized (obj2) {
                    obj = eygVar5.c;
                    if (obj instanceof dxjf) {
                        dzsj dzsjVar2 = eygVar5.b;
                        if (dzsjVar2 == null) {
                            dzsjVar2 = new eyf(eygVar5, 4);
                            eygVar5.b = dzsjVar2;
                        }
                        obj = (wbx) dxjc.c(dzsjVar2).a();
                        dxjc.d(eygVar5.c, obj);
                        eygVar5.c = obj;
                    }
                }
                obj2 = obj;
            }
            return (T) ((wbx) obj2);
        }
    }
}
