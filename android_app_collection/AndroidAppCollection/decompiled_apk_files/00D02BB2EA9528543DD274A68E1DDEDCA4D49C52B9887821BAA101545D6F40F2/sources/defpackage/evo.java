package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: evo  reason: default package */
/* loaded from: classes6.dex */
final class evo implements dxis {
    final /* synthetic */ ftt a;

    public evo(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        byoq byoqVar = (byoq) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        byoqVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        byoqVar.aI = tr;
        byoqVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        byoqVar.aK = sU;
        byoqVar.aL = new cpv();
        byoqVar.aM = dxjc.c(this.a.eW.ie());
        byoqVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        byoqVar.f = dxjc.c(this.a.cz());
        byoqVar.a = this.a.wl();
        byoqVar.b = dxjc.c(this.a.eW.al());
        byoqVar.c = new bysl(this.a.eW.fr(), dxjh.c(this.a.eW.ax()), dxjh.c(this.a.eW.bp()), dxjh.c(this.a.eW.al()));
        byoqVar.d = this.a.eW.nA();
    }
}
