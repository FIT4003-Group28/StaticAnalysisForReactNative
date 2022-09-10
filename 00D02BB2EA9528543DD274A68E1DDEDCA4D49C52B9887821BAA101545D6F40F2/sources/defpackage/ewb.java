package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ewb  reason: default package */
/* loaded from: classes6.dex */
final class ewb implements dxis {
    final /* synthetic */ ftt a;

    public ewb(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        byov byovVar = (byov) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        byovVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        byovVar.aI = tr;
        byovVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        byovVar.aK = sU;
        byovVar.aL = new cpv();
        byovVar.aM = dxjc.c(this.a.eW.ie());
        byovVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        byovVar.f = dxjc.c(this.a.cz());
        byovVar.a = this.a.wl();
        byovVar.b = dxjc.c(this.a.eW.al());
        byovVar.c = new bysp(this.a.eW.fr(), dxjh.c(this.a.eW.ax()), dxjh.c(this.a.eW.bp()), dxjh.c(this.a.eW.pq()), dxjh.c(this.a.eW.al()), dxjh.c(this.a.eW.p()), this.a.eW.o());
        byovVar.d = this.a.eW.nz();
    }
}
