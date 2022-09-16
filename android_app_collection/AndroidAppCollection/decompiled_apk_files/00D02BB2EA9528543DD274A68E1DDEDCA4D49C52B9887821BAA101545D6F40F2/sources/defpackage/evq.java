package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: evq  reason: default package */
/* loaded from: classes6.dex */
final class evq implements dxis {
    final /* synthetic */ ftt a;

    public evq(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aerf aerfVar = (aerf) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aerfVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aerfVar.aI = tr;
        aerfVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aerfVar.aK = sU;
        aerfVar.aL = new cpv();
        aerfVar.aM = dxjc.c(this.a.eW.ie());
        aerfVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aerfVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        aerfVar.a = rD;
        ftt fttVar = this.a;
        aerfVar.b = new aern(fttVar.eV, fttVar.fN(), this.a.eW.aw(), this.a.bh(), this.a.cl(), this.a.eb(), this.a.ef(), this.a.az(), this.a.cS(), this.a.eW.V());
        aerfVar.c = this.a.eW.ok();
        aerfVar.d = this.a.wl();
        aerfVar.e = dxjc.c(this.a.ef());
    }
}
