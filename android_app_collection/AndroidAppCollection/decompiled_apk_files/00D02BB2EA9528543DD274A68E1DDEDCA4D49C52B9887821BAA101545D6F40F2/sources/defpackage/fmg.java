package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fmg  reason: default package */
/* loaded from: classes6.dex */
final class fmg implements dxis {
    final /* synthetic */ ftt a;

    public fmg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        abbn abbnVar = (abbn) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        abbnVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        abbnVar.aI = tr;
        abbnVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        abbnVar.aK = sU;
        abbnVar.aL = new cpv();
        abbnVar.aM = dxjc.c(this.a.eW.ie());
        abbnVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        abbnVar.d = rD;
        ((bfdp) abbnVar).e = this.a.wq();
        dzsj<gga> ad = this.a.ad();
        dzsj<cqhn> il = this.a.eW.il();
        ftt fttVar = this.a;
        dzsj dzsjVar = fttVar.cH;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar, 1302);
            fttVar.cH = dzsjVar;
        }
        abbnVar.a = new abej(ad, il, dzsjVar);
        abbnVar.b = this.a.wl();
    }
}
