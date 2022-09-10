package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fps  reason: default package */
/* loaded from: classes6.dex */
final class fps implements dxis {
    final /* synthetic */ ftt a;

    public fps(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        xdq xdqVar = (xdq) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        xdqVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        xdqVar.aI = tr;
        xdqVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        xdqVar.aK = sU;
        xdqVar.aL = new cpv();
        xdqVar.aM = dxjc.c(this.a.eW.ie());
        xdqVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        xdqVar.a = this.a.wl();
        xdqVar.b = this.a.wq();
        xdqVar.c = new wia(this.a.eW.il(), this.a.eW.di(), this.a.ad(), this.a.eW.bk());
        xdqVar.d = new whm(this.a.eW.V(), this.a.eW.ii(), this.a.eW.ig(), this.a.eW.di());
        xdqVar.e = this.a.jV();
        xdqVar.f = this.a.eg();
    }
}
