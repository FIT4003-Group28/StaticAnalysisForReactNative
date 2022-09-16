package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fkt  reason: default package */
/* loaded from: classes6.dex */
public final class fkt implements dxis {
    public volatile dzsj<aymh> a;
    public volatile dzsj<axze> b;
    final /* synthetic */ ftt c;
    private volatile dzsj<azcd> d;

    public fkt(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ayzl ayzlVar = (ayzl) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        ayzlVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        ayzlVar.aI = tr;
        ayzlVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        ayzlVar.aK = sU;
        ayzlVar.aL = new cpv();
        ayzlVar.aM = dxjc.c(this.c.eW.ie());
        ayzlVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        ayzlVar.a = this.c.eW.fm();
        ayzlVar.b = this.c.wq();
        ayzlVar.c = this.c.wl();
        ayzlVar.d = this.c.wk();
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        ayzlVar.e = rD;
        dzsj<gga> ad = this.c.ad();
        dzsj<axwi> el = this.c.eW.el();
        dzsj<Executor> di = this.c.eW.di();
        dzsj<Executor> o = this.c.eW.o();
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new fks(this, 0);
            this.d = dzsjVar;
        }
        ayzlVar.f = new azcq(ad, el, di, o, dzsjVar, dxjh.c(this.c.eW.s()), this.c.eW(), this.c.J(), this.c.eW.n(), this.c.ly(), this.c.eW.il());
        ayzlVar.g = dxjc.c(this.c.eW());
        ayzlVar.ad = dxjc.c(this.c.J());
        dxjg.e(this.c.eW.a.sU());
    }
}
