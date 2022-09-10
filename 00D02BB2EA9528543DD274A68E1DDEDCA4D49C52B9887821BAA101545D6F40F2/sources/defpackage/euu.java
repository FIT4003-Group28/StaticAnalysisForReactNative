package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: euu  reason: default package */
/* loaded from: classes6.dex */
public final class euu implements dxis {
    public volatile dzsj<cbvd> a;
    public volatile dzsj<cbuw> b;
    public volatile dzsj<cbvt> c;
    public volatile dzsj<cbyx> d;
    public volatile dzsj<cbyi> e;
    public volatile dzsj<cbxa> f;
    public volatile dzsj<cbxu> g;
    public volatile dzsj<cbsq> h;
    public volatile dzsj<cbtc> i;
    final /* synthetic */ ftt j;
    private volatile dzsj<cbvn> k;
    private volatile dzsj<cbvy> l;
    private volatile dzsj<cbsl> m;
    private volatile dzsj<cbsi> n;

    public euu(ftt fttVar) {
        this.j = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cbrt cbrtVar = (cbrt) obj;
        cjqq tp = this.j.eW.a.tp();
        dxjg.e(tp);
        cbrtVar.aH = tp;
        cjqy tr = this.j.eW.a.tr();
        dxjg.e(tr);
        cbrtVar.aI = tr;
        cbrtVar.aJ = dbsg.i(this.j.ap());
        Executor sU = this.j.eW.a.sU();
        dxjg.e(sU);
        cbrtVar.aK = sU;
        cbrtVar.aL = new cpv();
        cbrtVar.aM = dxjc.c(this.j.eW.ie());
        cbrtVar.aN = dxjc.c(this.j.eW.iU());
        dxjc.c(this.j.lx());
        cbrtVar.a = this.j.wq();
        cbrtVar.b = this.j.wl();
        dzsj dzsjVar = this.k;
        if (dzsjVar == null) {
            dzsjVar = new eut(this, 0);
            this.k = dzsjVar;
        }
        dzsj dzsjVar2 = this.l;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eut(this, 4);
            this.l = dzsjVar2;
        }
        cbrtVar.c = new cbuq(dzsjVar, dzsjVar2, this.j.eW.di(), this.j.eW.il());
        dzsj dzsjVar3 = this.m;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eut(this, 9);
            this.m = dzsjVar3;
        }
        dzsj dzsjVar4 = this.n;
        if (dzsjVar4 == null) {
            dzsjVar4 = new eut(this, 12);
            this.n = dzsjVar4;
        }
        cbrtVar.d = new cbse(dzsjVar3, dzsjVar4);
    }
}
