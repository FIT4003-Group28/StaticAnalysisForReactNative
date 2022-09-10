package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fdd  reason: default package */
/* loaded from: classes6.dex */
final class fdd implements dxis {
    final /* synthetic */ ftt a;

    public fdd(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aohg aohgVar = (aohg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aohgVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aohgVar.aI = tr;
        aohgVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aohgVar.aK = sU;
        aohgVar.aL = new cpv();
        aohgVar.aM = dxjc.c(this.a.eW.ie());
        aohgVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aohgVar.a = new aoib(this.a.bh(), this.a.dL(), this.a.eW.jI(), this.a.eW.aw(), this.a.aX());
        aohgVar.b = this.a.wq();
        aohgVar.c = this.a.wl();
        aohgVar.d = new cjxo(this.a.a);
        aohgVar.e = this.a.aW();
        aohgVar.f = this.a.eW.au();
        dehq tg = this.a.eW.a.tg();
        dxjg.e(tg);
        aohgVar.g = tg;
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        aohgVar.ad = sU2;
    }
}
