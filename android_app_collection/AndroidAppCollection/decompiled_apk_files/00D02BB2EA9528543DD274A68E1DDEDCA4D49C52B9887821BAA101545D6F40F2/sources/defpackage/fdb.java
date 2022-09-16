package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fdb  reason: default package */
/* loaded from: classes6.dex */
final class fdb implements dxis {
    final /* synthetic */ ftt a;

    public fdb(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        yik yikVar = (yik) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        yikVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        yikVar.aI = tr;
        yikVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        yikVar.aK = sU;
        yikVar.aL = new cpv();
        yikVar.aM = dxjc.c(this.a.eW.ie());
        yikVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        yikVar.f = dxjc.c(this.a.cz());
        ((yie) yikVar).a = this.a.wl();
        yikVar.c = new yos(this.a.eW.il(), this.a.eS(), this.a.eW.lH());
    }
}
