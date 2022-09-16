package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fbv  reason: default package */
/* loaded from: classes6.dex */
final class fbv implements dxis {
    final /* synthetic */ ftt a;

    public fbv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cclh cclhVar = (cclh) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cclhVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cclhVar.aI = tr;
        cclhVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cclhVar.aK = sU;
        cclhVar.aL = new cpv();
        cclhVar.aM = dxjc.c(this.a.eW.ie());
        cclhVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cclhVar.a = new cczi(this.a.eW.il(), this.a.ad());
        cclhVar.b = this.a.wk();
        cclhVar.c = this.a.wl();
        cclhVar.d = dxjc.c(this.a.qw());
        cclhVar.e = this.a.wq();
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        cctn gr = this.a.gr();
        Executor sU3 = this.a.eW.a.sU();
        dxjg.e(sU3);
        cclhVar.f = new ccsq(sU2, gr, new ccrf(sU3, new cctt(this.a.wk())), this.a.gs(), this.a.fL(), this.a.aB());
    }
}
