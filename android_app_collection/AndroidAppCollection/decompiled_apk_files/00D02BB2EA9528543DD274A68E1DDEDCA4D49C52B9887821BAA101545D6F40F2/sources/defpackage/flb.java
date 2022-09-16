package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: flb  reason: default package */
/* loaded from: classes6.dex */
final class flb implements dxis {
    final /* synthetic */ ftt a;

    public flb(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        pqx pqxVar = (pqx) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        pqxVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        pqxVar.aI = tr;
        pqxVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        pqxVar.aK = sU;
        pqxVar.aL = new cpv();
        pqxVar.aM = dxjc.c(this.a.eW.ie());
        pqxVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        pqxVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        pqxVar.a = rD;
        pqxVar.b = dxjc.c(this.a.aK());
        pqxVar.c = dxjc.c(this.a.az());
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        pqxVar.d = rU;
        pqxVar.e = new pqd(this.a.wl(), this.a.a);
    }
}
