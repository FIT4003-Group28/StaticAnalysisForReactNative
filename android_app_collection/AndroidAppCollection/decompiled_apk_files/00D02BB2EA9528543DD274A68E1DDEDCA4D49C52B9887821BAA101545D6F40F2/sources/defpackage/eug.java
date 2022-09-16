package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eug  reason: default package */
/* loaded from: classes6.dex */
public final class eug implements dxis {
    public volatile dzsj<aadg> a;
    public volatile dzsj<aacj> b;
    public volatile dzsj<bsng> c;
    public volatile dzsj<bsnb> d;
    public volatile dzsj<bsne> e;
    public volatile dzsj<brzx> f;
    final /* synthetic */ ftt g;
    private volatile dzsj<brbh> h;
    private volatile dzsj<aafv> i;
    private volatile dzsj j;
    private volatile dzsj<aabz> k;
    private volatile dzsj<brze> l;
    private volatile dzsj<aadk> m;

    public eug(ftt fttVar) {
        this.g = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aabc aabcVar = (aabc) obj;
        cjqq tp = this.g.eW.a.tp();
        dxjg.e(tp);
        aabcVar.aH = tp;
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        aabcVar.aI = tr;
        aabcVar.aJ = dbsg.i(this.g.ap());
        Executor sU = this.g.eW.a.sU();
        dxjg.e(sU);
        aabcVar.aK = sU;
        aabcVar.aL = new cpv();
        aabcVar.aM = dxjc.c(this.g.eW.ie());
        aabcVar.aN = dxjc.c(this.g.eW.iU());
        dxjc.c(this.g.lx());
        ftt fttVar = this.g;
        dzsj dzsjVar = fttVar.cD;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar, 1294);
            fttVar.cD = dzsjVar;
        }
        aabcVar.b = new aaax(dzsjVar, this.g.tS());
        dzsj dzsjVar2 = this.h;
        if (dzsjVar2 == null) {
            dzsjVar2 = new euf(this, 0);
            this.h = dzsjVar2;
        }
        aabcVar.c = new aaea(dzsjVar2, this.g.as(), this.g.eW.al(), this.g.dF());
        aabcVar.d = new aadu(this.g.eW.er(), this.g.tS());
        dzsj dzsjVar3 = this.i;
        if (dzsjVar3 == null) {
            dzsjVar3 = new euf(this, 1);
            this.i = dzsjVar3;
        }
        dzsj<gga> ad = this.g.ad();
        dzsj<cqhn> il = this.g.eW.il();
        dzsj dzsjVar4 = this.j;
        if (dzsjVar4 == null) {
            dzsjVar4 = new euf(this, 2);
            this.j = dzsjVar4;
        }
        aabcVar.e = new aacx(dzsjVar3, ad, il, dzsjVar4);
        ftt fttVar2 = this.g;
        aabcVar.f = new aabj(fttVar2.eV, fttVar2.eW.il());
        dzsj<cqhn> il2 = this.g.eW.il();
        dzsj dzsjVar5 = this.k;
        if (dzsjVar5 == null) {
            dzsjVar5 = new euf(this, 3);
            this.k = dzsjVar5;
        }
        dzsj dzsjVar6 = this.l;
        if (dzsjVar6 == null) {
            dzsjVar6 = new euf(this, 9);
            this.l = dzsjVar6;
        }
        dzsj dzsjVar7 = this.m;
        if (dzsjVar7 == null) {
            dzsjVar7 = new euf(this, 11);
            this.m = dzsjVar7;
        }
        aabcVar.g = new aade(il2, dzsjVar5, dzsjVar6, dzsjVar7);
        bwqv rD = this.g.eW.a.rD();
        dxjg.e(rD);
        aabcVar.ad = rD;
        ftt fttVar3 = this.g;
        aabcVar.ae = new aadb(fttVar3.eV, fttVar3.lN());
        aabcVar.af = new aacd(dxjh.c(this.g.as()), this.g.cd(), this.g.pD(), dxjh.c(this.g.dE()), dxjh.c(this.g.eW.al()));
        aabcVar.ag = this.g.wl();
        aabcVar.ah = new aacz();
        aabcVar.ai = new aaas(this.g.as(), this.g.av());
        ckcw rU = this.g.eW.a.rU();
        dxjg.e(rU);
        aabcVar.aj = new aaeb(rU);
    }
}
