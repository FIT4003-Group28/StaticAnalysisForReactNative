package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: esr  reason: default package */
/* loaded from: classes6.dex */
final class esr implements dxis {
    final /* synthetic */ ftt a;

    public esr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aodr aodrVar = (aodr) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aodrVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aodrVar.aI = tr;
        aodrVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aodrVar.aK = sU;
        aodrVar.aL = new cpv();
        aodrVar.aM = dxjc.c(this.a.eW.ie());
        aodrVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aodrVar.f = dxjc.c(this.a.cz());
        ftt fttVar = this.a;
        aodrVar.a = new aoea(fttVar.eV, fttVar.eW.K());
        aodrVar.b = this.a.wl();
    }
}
