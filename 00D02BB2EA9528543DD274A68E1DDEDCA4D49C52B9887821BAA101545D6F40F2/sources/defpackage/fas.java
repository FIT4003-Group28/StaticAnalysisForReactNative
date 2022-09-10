package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fas  reason: default package */
/* loaded from: classes6.dex */
public final class fas implements dxis {
    public volatile dzsj<caxe> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<aydr> c;
    private volatile dzsj<aydu> d;

    public fas(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ayzh ayzhVar = (ayzh) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        ayzhVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        ayzhVar.aI = tr;
        ayzhVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        ayzhVar.aK = sU;
        ayzhVar.aL = new cpv();
        ayzhVar.aM = dxjc.c(this.b.eW.ie());
        ayzhVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        ayzhVar.a = rD;
        ayzhVar.b = this.b.wq();
        ayzhVar.c = this.b.wl();
        dzsj<gga> ad = this.b.ad();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj<axwi> el = this.b.eW.el();
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new far(this, 0);
            this.d = dzsjVar;
        }
        ayzhVar.d = new azbt(ad, il, el, dzsjVar, this.b.uq(), this.b.eW.di(), this.b.eW.o(), this.b.eW.al());
    }

    public final dzsj<aydr> b() {
        dzsj<aydr> dzsjVar = this.c;
        if (dzsjVar == null) {
            far farVar = new far(this, 1);
            this.c = farVar;
            return farVar;
        }
        return dzsjVar;
    }
}
