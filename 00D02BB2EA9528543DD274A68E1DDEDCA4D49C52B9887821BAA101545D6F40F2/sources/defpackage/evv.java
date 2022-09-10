package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: evv  reason: default package */
/* loaded from: classes6.dex */
final class evv implements dxis {
    final /* synthetic */ ftt a;

    public evv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        afel afelVar = (afel) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        afelVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        afelVar.aI = tr;
        afelVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        afelVar.aK = sU;
        afelVar.aL = new cpv();
        afelVar.aM = dxjc.c(this.a.eW.ie());
        afelVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        afelVar.f = dxjc.c(this.a.cz());
        afelVar.c = this.a.wl();
        afelVar.d = new afet(dxjc.c(this.a.m()), this.a.wk());
    }
}
