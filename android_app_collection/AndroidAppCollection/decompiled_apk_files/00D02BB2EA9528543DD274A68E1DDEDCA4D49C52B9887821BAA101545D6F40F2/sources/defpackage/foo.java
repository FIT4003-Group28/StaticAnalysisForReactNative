package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: foo  reason: default package */
/* loaded from: classes6.dex */
final class foo implements dxis {
    final /* synthetic */ ftt a;

    public foo(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aotn aotnVar = (aotn) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aotnVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aotnVar.aI = tr;
        aotnVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aotnVar.aK = sU;
        aotnVar.aL = new cpv();
        aotnVar.aM = dxjc.c(this.a.eW.ie());
        aotnVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aotnVar.f = dxjc.c(this.a.cz());
        ftt fttVar = this.a;
        aotnVar.a = new aotp(fttVar.eV, fttVar.aV(), this.a.bh());
    }
}
