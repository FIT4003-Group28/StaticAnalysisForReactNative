package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eol  reason: default package */
/* loaded from: classes6.dex */
public final class eol implements dxis {
    public volatile byaf a;
    public volatile dzsj<vrk> b;
    public volatile dzsj<vre> c;
    public volatile dzsj<vrr> d;
    public volatile dzsj<ziq> e;
    public volatile bvso f;
    public volatile dzsj<bvso> g;
    public volatile dzsj<zse> h;
    final /* synthetic */ ftt i;
    private volatile dzsj<ivg> j;
    private volatile dzsj<zpy> k;
    private volatile dzsj<reu> l;

    public eol(ftt fttVar) {
        this.i = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rck rckVar = (rck) obj;
        cjqq tp = this.i.eW.a.tp();
        dxjg.e(tp);
        rckVar.aH = tp;
        cjqy tr = this.i.eW.a.tr();
        dxjg.e(tr);
        rckVar.aI = tr;
        rckVar.aJ = dbsg.i(this.i.ap());
        Executor sU = this.i.eW.a.sU();
        dxjg.e(sU);
        rckVar.aK = sU;
        rckVar.aL = new cpv();
        rckVar.aM = dxjc.c(this.i.eW.ie());
        rckVar.aN = dxjc.c(this.i.eW.iU());
        dxjc.c(this.i.lx());
        rckVar.b = dxjc.c(this.i.cD());
        dzsj<rb> dzsjVar = this.i.eV;
        dzsj dzsjVar2 = this.j;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eok(this, 0);
            this.j = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<cqhn> il = this.i.eW.il();
        dzsj c = dxjh.c(this.i.H());
        dzsj dzsjVar4 = this.k;
        if (dzsjVar4 == null) {
            dzsjVar4 = new eok(this, 1);
            this.k = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.l;
        if (dzsjVar6 == null) {
            dzsjVar6 = new eok(this, 6);
            this.l = dzsjVar6;
        }
        rckVar.c = new rfa(dzsjVar, dzsjVar3, il, c, dzsjVar5, dxjh.c(dzsjVar6));
        rckVar.d = this.i.wq();
        rckVar.e = this.i.wl();
        this.i.eW.qw();
    }

    public final zse b() {
        return new zse(this.i.eW.m(), this.i.eW.hN());
    }
}
