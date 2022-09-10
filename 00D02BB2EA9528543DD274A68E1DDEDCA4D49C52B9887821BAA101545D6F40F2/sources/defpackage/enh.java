package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: enh  reason: default package */
/* loaded from: classes6.dex */
public final class enh implements dxis {
    public volatile dzsj<bfcd> a;
    public volatile dzsj<bnhs> b;
    public volatile dzsj<batz> c;
    public final dzsj<baas> d;
    final /* synthetic */ ftt e;
    private volatile dzsj<bbaa> f;
    private volatile dzsj g;

    public enh(ftt fttVar, baas baasVar) {
        this.e = fttVar;
        this.d = dxjd.b(baasVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        baas baasVar = (baas) obj;
        cjqq tp = this.e.eW.a.tp();
        dxjg.e(tp);
        baasVar.aH = tp;
        cjqy tr = this.e.eW.a.tr();
        dxjg.e(tr);
        baasVar.aI = tr;
        baasVar.aJ = dbsg.i(this.e.ap());
        Executor sU = this.e.eW.a.sU();
        dxjg.e(sU);
        baasVar.aK = sU;
        baasVar.aL = new cpv();
        baasVar.aM = dxjc.c(this.e.eW.ie());
        baasVar.aN = dxjc.c(this.e.eW.iU());
        dxjc.c(this.e.lx());
        baasVar.b = this.e.eW.bW();
        dzsj<cqhn> il = this.e.eW.il();
        dzsj<Executor> di = this.e.eW.di();
        dzsj<beya> qz = this.e.qz();
        dzsj dzsjVar = this.f;
        if (dzsjVar == null) {
            dzsjVar = new eng(this, 0);
            this.f = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<gga> ad = this.e.ad();
        dzsj dzsjVar3 = this.g;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eng(this, 3);
            this.g = dzsjVar3;
        }
        baasVar.c = new bafm(il, di, qz, dzsjVar2, ad, dzsjVar3);
        baasVar.d = this.e.wk();
        baasVar.e = this.e.wq();
        baasVar.f = this.e.wl();
    }
}
