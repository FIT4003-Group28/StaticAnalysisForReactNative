package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fik  reason: default package */
/* loaded from: classes6.dex */
public final class fik implements dxis {
    public volatile dzsj<batz> a;
    final /* synthetic */ ftt b;
    private volatile dzsj c;
    private volatile dzsj<barv> d;
    private volatile dzsj<bbbd> e;
    private volatile dzsj<bbbb> f;

    public fik(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        baax baaxVar = (baax) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        baaxVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        baaxVar.aI = tr;
        baaxVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        baaxVar.aK = sU;
        baaxVar.aL = new cpv();
        baaxVar.aM = dxjc.c(this.b.eW.ie());
        baaxVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        baaxVar.b = this.b.eW.bW();
        baaxVar.c = this.b.wk();
        dzsj<gga> ad = this.b.ad();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj<bvjj> aw = this.b.eW.aw();
        dzsj<akfa> p = this.b.eW.p();
        dzsj<axwq> u = this.b.eW.u();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fij(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fij(this, 1);
            this.d = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.e;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fij(this, 2);
            this.e = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.f;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fij(this, 3);
            this.f = dzsjVar7;
        }
        baaxVar.d = new bahn(ad, il, aw, p, u, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar7, this.b.eW.hj());
        baaxVar.e = this.b.wq();
        baaxVar.f = this.b.wl();
    }
}
