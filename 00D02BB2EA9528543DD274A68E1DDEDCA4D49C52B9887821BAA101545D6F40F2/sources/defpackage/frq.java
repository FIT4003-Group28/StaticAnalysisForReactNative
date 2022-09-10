package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: frq  reason: default package */
/* loaded from: classes6.dex */
final class frq implements dxis {
    final /* synthetic */ ftt a;

    public frq(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cgei cgeiVar = (cgei) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cgeiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cgeiVar.aI = tr;
        cgeiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cgeiVar.aK = sU;
        cgeiVar.aL = new cpv();
        cgeiVar.aM = dxjc.c(this.a.eW.ie());
        cgeiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cgeiVar.f = dxjc.c(this.a.cz());
        ((geh) cgeiVar).d = this.a.wl();
    }
}
