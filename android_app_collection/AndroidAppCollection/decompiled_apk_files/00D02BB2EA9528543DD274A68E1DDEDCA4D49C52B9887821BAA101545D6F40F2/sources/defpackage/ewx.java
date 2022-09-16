package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ewx  reason: default package */
/* loaded from: classes6.dex */
final class ewx implements dxis {
    final /* synthetic */ ftt a;

    public ewx(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aqsk aqskVar = (aqsk) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aqskVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aqskVar.aI = tr;
        aqskVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aqskVar.aK = sU;
        aqskVar.aL = new cpv();
        aqskVar.aM = dxjc.c(this.a.eW.ie());
        aqskVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aqskVar.a = this.a.wq();
        aqskVar.b = this.a.wl();
        aqskVar.c = new aqso(this.a.ad(), this.a.eW.R(), this.a.eW.iL(), dxjh.c(this.a.eW.is()), dxjh.c(this.a.S()));
    }
}
