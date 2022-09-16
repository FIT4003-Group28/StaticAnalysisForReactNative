package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: frd  reason: default package */
/* loaded from: classes6.dex */
final class frd implements dxis {
    final /* synthetic */ ftt a;

    public frd(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdhp cdhpVar = (cdhp) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cdhpVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cdhpVar.aI = tr;
        cdhpVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cdhpVar.aK = sU;
        cdhpVar.aL = new cpv();
        cdhpVar.aM = dxjc.c(this.a.eW.ie());
        cdhpVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cdhpVar.f = dxjc.c(this.a.cz());
        cdhpVar.a = this.a.eW.ok();
        cdhpVar.b = this.a.wl();
        cdhpVar.c = new cdiq(this.a.eW.il(), dxjh.c(this.a.ef()));
        cdhpVar.d = dxjc.c(this.a.eW.at());
        cdhpVar.e = this.a.au();
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        cdhpVar.g = sU2;
    }
}
