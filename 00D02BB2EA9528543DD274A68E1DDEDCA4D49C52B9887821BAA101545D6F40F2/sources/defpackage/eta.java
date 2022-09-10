package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eta  reason: default package */
/* loaded from: classes6.dex */
final class eta implements dxis {
    final /* synthetic */ ftt a;

    public eta(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cbbt cbbtVar = (cbbt) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cbbtVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cbbtVar.aI = tr;
        cbbtVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cbbtVar.aK = sU;
        cbbtVar.aL = new cpv();
        cbbtVar.aM = dxjc.c(this.a.eW.ie());
        cbbtVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cbbtVar.a = this.a.wl();
        cbbtVar.b = new cbbb(this.a.eW.il(), this.a.eW.al(), this.a.ad(), this.a.y());
        cbbtVar.c = this.a.wq();
        cbbtVar.d = new cjxo(this.a.a);
    }
}
