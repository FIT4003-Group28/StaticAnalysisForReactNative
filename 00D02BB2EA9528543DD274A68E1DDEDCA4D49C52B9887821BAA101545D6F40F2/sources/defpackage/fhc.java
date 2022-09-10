package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fhc  reason: default package */
/* loaded from: classes6.dex */
final class fhc<T> implements dzsj<T> {
    final /* synthetic */ fhd a;
    private final int b;

    public fhc(fhd fhdVar, int i) {
        this.a = fhdVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            fhd fhdVar = this.a;
            ckcw rU = fhdVar.b.eW.a.rU();
            dxjg.e(rU);
            qro bJ = fhdVar.b.eW.bJ();
            azql bD = fhdVar.b.eW.bD();
            qjk bK = fhdVar.b.eW.bK();
            axwe bE = fhdVar.b.eW.bE();
            sic bI = fhdVar.b.eW.bI();
            axwq qn = fhdVar.b.eW.qn();
            dxio c = dxjc.c(fhdVar.b.J());
            dehp tl = fhdVar.b.eW.a.tl();
            dxjg.e(tl);
            Executor sU = fhdVar.b.eW.a.sU();
            dxjg.e(sU);
            return (T) new sbz(rU, bJ, bD, bK, bE, bI, qn, c, tl, sU);
        } else if (i != 1) {
            fhd fhdVar2 = this.a;
            btrm rz = fhdVar2.b.eW.a.rz();
            dxjg.e(rz);
            return (T) new qsm(rz, fhdVar2.b.eW.dH(), fhdVar2.b.eW.ry());
        } else {
            fhd fhdVar3 = this.a;
            Application a = fhdVar3.b.eW.a.a();
            dxjg.e(a);
            Application a2 = fhdVar3.b.eW.a.a();
            dxjg.e(a2);
            qjk bK2 = fhdVar3.b.eW.bK();
            sic bI2 = fhdVar3.b.eW.bI();
            cqat rR = fhdVar3.b.eW.a.rR();
            dxjg.e(rR);
            shu shuVar = new shu(rR);
            Executor sU2 = fhdVar3.b.eW.a.sU();
            dxjg.e(sU2);
            shs shsVar = new shs(a2, bK2, bI2, shuVar, sU2);
            dzsj dzsjVar = fhdVar3.a;
            if (dzsjVar == null) {
                dzsjVar = new fhc(fhdVar3, 2);
                fhdVar3.a = dzsjVar;
            }
            dzsj dzsjVar2 = dzsjVar;
            sii vv = fhdVar3.b.vv();
            Executor sU3 = fhdVar3.b.eW.a.sU();
            dxjg.e(sU3);
            return (T) new sim(a, shsVar, dzsjVar2, vv, sU3);
        }
    }
}
