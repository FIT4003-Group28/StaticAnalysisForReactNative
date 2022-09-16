package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: erb  reason: default package */
/* loaded from: classes6.dex */
final class erb implements dxis {
    final /* synthetic */ ftt a;

    public erb(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bdgj bdgjVar = (bdgj) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bdgjVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bdgjVar.aI = tr;
        bdgjVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bdgjVar.aK = sU;
        bdgjVar.aL = new cpv();
        bdgjVar.aM = dxjc.c(this.a.eW.ie());
        bdgjVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bdgjVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bdgjVar.d = rD;
        bdgjVar.e = this.a.wl();
        bdgjVar.ae = this.a.EE();
        ftt fttVar = this.a;
        bdgjVar.g = fttVar.a;
        bdgjVar.ad = fttVar.k();
    }
}
