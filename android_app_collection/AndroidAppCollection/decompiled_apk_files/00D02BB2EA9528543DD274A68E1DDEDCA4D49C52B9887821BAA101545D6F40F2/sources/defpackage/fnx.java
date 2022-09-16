package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fnx  reason: default package */
/* loaded from: classes6.dex */
public final class fnx implements dxis {
    public volatile buka a;
    final /* synthetic */ ftt b;
    private volatile dzsj<buka> c;

    public fnx(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bycp bycpVar = (bycp) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bycpVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bycpVar.aI = tr;
        bycpVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bycpVar.aK = sU;
        bycpVar.aL = new cpv();
        bycpVar.aM = dxjc.c(this.b.eW.ie());
        bycpVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bycpVar.ae = new cjxo(this.b.a);
        bycpVar.af = dxjc.c(this.b.ec());
        bycpVar.ag = this.b.wq();
        bycpVar.b = this.b.wl();
        ckcw rU = this.b.eW.a.rU();
        dxjg.e(rU);
        bycpVar.c = rU;
        dzsj<gga> ad = this.b.ad();
        dzsj<cklf> fe = this.b.fe();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fnw(this);
            this.c = dzsjVar;
        }
        bycpVar.d = new bydb(ad, fe, dzsjVar, this.b.eW.K(), this.b.eW.aw(), this.b.eW.iQ(), this.b.eW.al(), this.b.cW(), dxjh.c(this.b.aV()), dxjh.c(this.b.ec()), this.b.eW.at(), dxjh.c(this.b.eW.p()), this.b.eW.il(), this.b.eW.di(), this.b.eW.o());
    }
}
