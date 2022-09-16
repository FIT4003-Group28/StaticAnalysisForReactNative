package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fbt  reason: default package */
/* loaded from: classes6.dex */
final class fbt implements dxis {
    final /* synthetic */ ftt a;

    public fbt(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cclg cclgVar = (cclg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cclgVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cclgVar.aI = tr;
        cclgVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cclgVar.aK = sU;
        cclgVar.aL = new cpv();
        cclgVar.aM = dxjc.c(this.a.eW.ie());
        cclgVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cclgVar.f = dxjc.c(this.a.cz());
        cclgVar.a = this.a.wk();
        cclgVar.b = new ccze(this.a.eW.il());
        cclgVar.c = this.a.wl();
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        cctn gr = this.a.gr();
        Executor sU3 = this.a.eW.a.sU();
        dxjg.e(sU3);
        cclgVar.d = new ccsq(sU2, gr, new ccrf(sU3, new cctt(this.a.wk())), this.a.gs(), this.a.fL(), this.a.aB());
    }
}
