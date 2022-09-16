package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqw  reason: default package */
/* loaded from: classes6.dex */
public final class fqw implements dxis {
    public volatile dzsj<brvh> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<bass> c;
    private volatile dzsj<barh> d;
    private volatile dzsj<bakw> e;
    private final dzsj<bakk> f;

    public fqw(ftt fttVar, bakk bakkVar) {
        this.b = fttVar;
        this.f = dxjd.b(bakkVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bakk bakkVar = (bakk) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bakkVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bakkVar.aI = tr;
        bakkVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bakkVar.aK = sU;
        bakkVar.aL = new cpv();
        bakkVar.aM = dxjc.c(this.b.eW.ie());
        bakkVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bakkVar.b = this.b.eW.qn();
        bakkVar.c = this.b.wq();
        bakkVar.d = this.b.wl();
        bakkVar.e = this.b.cJ();
        dzsj<gga> ad = this.b.ad();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj<cqkj> y = this.b.y();
        dzsj<axsa> oL = this.b.eW.oL();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fqv(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fqv(this, 2);
            this.d = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.e;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fqv(this, 3);
            this.e = dzsjVar5;
        }
        bakkVar.f = new batb(ad, il, y, oL, dzsjVar2, dzsjVar4, dzsjVar5, this.b.eW.oS(), dxjh.c(this.b.az()), dxjh.c(this.b.eW()), dxjh.c(this.b.aT()), dxjh.c(this.b.eW.eY()));
        bakkVar.g = new bakz(this.b.eW.il(), this.b.kI());
        bakkVar.ad = new balc(this.b.ad());
        bakkVar.ae = new batc(this.b.ad(), this.f, this.b.G(), dxjh.c(this.b.eW.p()));
    }
}
