package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: evt  reason: default package */
/* loaded from: classes6.dex */
public final class evt implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<auoo> b;
    private volatile dzsj<aurg> c;

    public evt(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        auol auolVar = (auol) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        auolVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        auolVar.aI = tr;
        auolVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        auolVar.aK = sU;
        auolVar.aL = new cpv();
        auolVar.aM = dxjc.c(this.a.eW.ie());
        auolVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        auolVar.b = this.a.wl();
        auolVar.c = this.a.wq();
        auolVar.d = this.a.N();
        auolVar.e = dxjc.c(this.a.q());
        auolVar.f = dxjc.c(this.a.aV());
        dzsj c = dxjh.c(this.a.r());
        dzsj c2 = dxjh.c(this.a.eW.p());
        dzsj c3 = dxjh.c(this.a.m());
        dzsj c4 = dxjh.c(this.a.eW.im());
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new evs(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<auhq> ap = this.a.eW.ap();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new evs(this, 1);
            this.c = dzsjVar3;
        }
        auolVar.g = aurr.b(c, c2, c3, c4, dzsjVar2, ap, il, dzsjVar3, this.a.eW.aT(), this.a.eW.o(), this.a.P(), this.a.eW.at());
        auolVar.ad = this.a.a;
    }
}
