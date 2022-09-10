package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fhl  reason: default package */
/* loaded from: classes6.dex */
final class fhl implements dxis {
    final /* synthetic */ ftt a;

    public fhl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aoit aoitVar = (aoit) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aoitVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aoitVar.aI = tr;
        aoitVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aoitVar.aK = sU;
        aoitVar.aL = new cpv();
        aoitVar.aM = dxjc.c(this.a.eW.ie());
        aoitVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aoitVar.f = dxjc.c(this.a.cz());
        aoitVar.a = this.a.eW.rw();
    }
}
