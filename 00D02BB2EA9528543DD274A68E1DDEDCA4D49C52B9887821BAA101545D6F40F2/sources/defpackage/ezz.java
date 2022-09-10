package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ezz  reason: default package */
/* loaded from: classes6.dex */
public final class ezz implements dxis {
    public volatile dzsj<batz> a;
    final /* synthetic */ ftt b;
    public volatile bvbi c;
    private volatile dzsj<bbai> d;
    private volatile dzsj<bvbi> e;

    public ezz(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        baav baavVar = (baav) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        baavVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        baavVar.aI = tr;
        baavVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        baavVar.aK = sU;
        baavVar.aL = new cpv();
        baavVar.aM = dxjc.c(this.b.eW.ie());
        baavVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        baavVar.b = this.b.eW.bW();
        baavVar.c = this.b.wk();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj<btpc> cx = this.b.eW.cx();
        dzsj<Executor> di = this.b.eW.di();
        dzsj<gga> ad = this.b.ad();
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new ezy(this, 0);
            this.d = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.e;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ezy(this, 2);
            this.e = dzsjVar3;
        }
        baavVar.d = new bagp(il, cx, di, ad, dzsjVar2, dzsjVar3);
        baavVar.e = this.b.wq();
        baavVar.f = this.b.wl();
    }
}
