package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ene  reason: default package */
/* loaded from: classes6.dex */
public final class ene implements dxis {
    public volatile dzsj<apdb> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<apcd> c;
    private volatile dzsj<apcf> d;
    private volatile dzsj<aphj> e;

    public ene(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apav apavVar = (apav) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        apavVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        apavVar.aI = tr;
        apavVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        apavVar.aK = sU;
        apavVar.aL = new cpv();
        apavVar.aM = dxjc.c(this.b.eW.ie());
        apavVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        apavVar.a = rD;
        apavVar.b = dxjc.c(this.b.lN());
        apavVar.c = this.b.wl();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new end(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new end(this, 2);
            this.d = dzsjVar2;
        }
        apavVar.d = new apbx(dzsjVar, dzsjVar2);
        apavVar.e = new cqhu();
        dzsj<gga> ad = this.b.ad();
        dzsj dzsjVar3 = this.e;
        if (dzsjVar3 == null) {
            dzsjVar3 = new end(this, 3);
            this.e = dzsjVar3;
        }
        apavVar.f = new apcb(ad, dzsjVar3);
        ftt fttVar = this.b;
        rb rbVar = fttVar.a;
        bwqv rD2 = fttVar.eW.a.rD();
        dxjg.e(rD2);
        aoxv oA = this.b.eW.oA();
        cjqq tp2 = this.b.eW.a.tp();
        dxjg.e(tp2);
        cjqy tr2 = this.b.eW.a.tr();
        dxjg.e(tr2);
        apavVar.g = new apcl(rbVar, rD2, oA, tp2, tr2);
        apavVar.ad = this.b.eV();
        apavVar.ae = this.b.wd();
        apavVar.af = this.b.wk();
        apavVar.ag = this.b.eW.rw();
        apavVar.ah = this.b.eW.oA();
    }
}
