package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fpa  reason: default package */
/* loaded from: classes6.dex */
final class fpa implements dxis {
    final /* synthetic */ ftt a;

    public fpa(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ackv ackvVar = (ackv) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ackvVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ackvVar.aI = tr;
        ackvVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ackvVar.aK = sU;
        ackvVar.aL = new cpv();
        ackvVar.aM = dxjc.c(this.a.eW.ie());
        ackvVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        ackvVar.d = rD;
        ((bfdp) ackvVar).e = this.a.wq();
        ackvVar.a = this.a.wl();
        ackvVar.b = dxjc.c(this.a.m());
        ackvVar.c = dxjc.c(this.a.J());
    }
}
