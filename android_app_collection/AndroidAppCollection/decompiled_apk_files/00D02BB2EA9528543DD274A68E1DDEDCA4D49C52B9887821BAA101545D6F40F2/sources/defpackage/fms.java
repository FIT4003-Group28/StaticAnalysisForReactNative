package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fms  reason: default package */
/* loaded from: classes6.dex */
final class fms implements dxis {
    final /* synthetic */ ftt a;

    public fms(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wiq wiqVar = (wiq) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        wiqVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        wiqVar.aI = tr;
        wiqVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        wiqVar.aK = sU;
        wiqVar.aL = new cpv();
        wiqVar.aM = dxjc.c(this.a.eW.ie());
        wiqVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        wiqVar.a = rR;
        wiqVar.b = this.a.wl();
        wiqVar.c = this.a.wq();
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj dzsjVar2 = fttVar.cx;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fns(fttVar, 1273);
            fttVar.cx = dzsjVar2;
        }
        wiqVar.d = new wix(dzsjVar, dzsjVar2);
    }
}
