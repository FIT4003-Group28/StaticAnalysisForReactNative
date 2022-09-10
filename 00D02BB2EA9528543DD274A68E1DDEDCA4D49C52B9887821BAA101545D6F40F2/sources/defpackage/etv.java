package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: etv  reason: default package */
/* loaded from: classes6.dex */
final class etv implements dxis {
    final /* synthetic */ ftt a;

    public etv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        axtx axtxVar = (axtx) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        axtxVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        axtxVar.aI = tr;
        axtxVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        axtxVar.aK = sU;
        axtxVar.aL = new cpv();
        axtxVar.aM = dxjc.c(this.a.eW.ie());
        axtxVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        axtxVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        axtxVar.a = rD;
        axtxVar.b = this.a.wl();
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cklf> fe = fttVar.fe();
        ftt fttVar2 = this.a;
        dzsj dzsjVar2 = fttVar2.cW;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fns(fttVar2, 1330);
            fttVar2.cW = dzsjVar2;
        }
        axtxVar.c = new axvk(dzsjVar, fe, dzsjVar2);
        axtxVar.d = dxjc.c(this.a.eW.al());
    }
}
