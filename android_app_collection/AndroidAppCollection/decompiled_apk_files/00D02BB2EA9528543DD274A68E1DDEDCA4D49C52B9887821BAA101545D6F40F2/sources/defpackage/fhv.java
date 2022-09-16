package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fhv  reason: default package */
/* loaded from: classes6.dex */
final class fhv implements dxis {
    final /* synthetic */ ftt a;

    public fhv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        botf botfVar = (botf) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        botfVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        botfVar.aI = tr;
        botfVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        botfVar.aK = sU;
        botfVar.aL = new cpv();
        botfVar.aM = dxjc.c(this.a.eW.ie());
        botfVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        botfVar.b = new botm(this.a.eW.fr(), this.a.ad(), this.a.fO(), this.a.eW.cx(), this.a.fM(), this.a.cn(), this.a.fe(), dxjh.c(this.a.eW.al()), this.a.cu(), this.a.as());
        botfVar.c = this.a.wl();
        botfVar.d = this.a.wq();
    }
}
