package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fcd  reason: default package */
/* loaded from: classes6.dex */
final class fcd<T> implements dzsj<T> {
    final /* synthetic */ fce a;

    public fcd(fce fceVar) {
        this.a = fceVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        avuk avukVar;
        fce fceVar = this.a;
        avvz avvzVar = fceVar.a;
        bvjj rB = fceVar.c.eW.a.rB();
        dxjg.e(rB);
        cqat rR = fceVar.c.eW.a.rR();
        dxjg.e(rR);
        avij qO = fceVar.c.eW.qO();
        Executor sV = fceVar.c.eW.a.sV();
        dxjg.e(sV);
        Executor sU = fceVar.c.eW.a.sU();
        dxjg.e(sU);
        avvz avvzVar2 = fceVar.a;
        avij qO2 = fceVar.c.eW.qO();
        cjqy tr = fceVar.c.eW.a.tr();
        dxjg.e(tr);
        Executor sU2 = fceVar.c.eW.a.sU();
        dxjg.e(sU2);
        cqhn cqhnVar = new cqhn();
        crzm<avkc> qH = fceVar.c.eW.qH();
        akfa rK = fceVar.c.eW.a.rK();
        dxjg.e(rK);
        awfh qP = fceVar.c.eW.qP();
        cjqq tp = fceVar.c.eW.a.tp();
        dxjg.e(tp);
        avyr avyrVar = new avyr(avvzVar2, qO2, tr, sU2, cqhnVar, qH, rK, qP, tp);
        cklf cp = fceVar.c.cp();
        dxio c = dxjc.c(fceVar.c.aT());
        avzp il = fceVar.c.il();
        avuk avukVar2 = fceVar.b;
        if (avukVar2 == null) {
            dxjg.e(fceVar.c.eW.a.a());
            cjqy tr2 = fceVar.c.eW.a.tr();
            dxjg.e(tr2);
            avuk b = avul.b(tr2, fceVar.c.eW.de(), fceVar.c.eW.qO(), fceVar.c.aS(), fceVar.c.eD());
            fceVar.b = b;
            avukVar = b;
        } else {
            avukVar = avukVar2;
        }
        return (T) new avxz(avvzVar, rB, rR, qO, sV, sU, avyrVar, cp, c, il, avukVar, fceVar.c.eW.qP(), dxjc.c(fceVar.c.eW.p()), fceVar.c.eW.X(), fceVar.c.eW.dk());
    }
}
