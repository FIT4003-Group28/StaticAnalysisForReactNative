package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqx  reason: default package */
/* loaded from: classes6.dex */
public final class eqx implements dxis {
    public final bcpz a;
    public volatile bvan b;
    public volatile dzsj<bdcn> c;
    public volatile dzsj<afxz> d;
    public volatile dzsj<bcro> e;
    final /* synthetic */ ftt f;
    private volatile dzsj<bbuu> g;
    private volatile dzsj<bdfc> h;
    private volatile dzsj<bvan> i;
    private volatile dzsj<bdfe> j;
    private volatile dzsj<bdbx> k;
    private volatile dzsj<bdch> l;
    private volatile dzsj<bdcj> m;
    private volatile dzsj<bddb> n;
    private volatile dzsj<bcaz> o;

    public eqx(ftt fttVar, bcpz bcpzVar) {
        this.f = fttVar;
        this.a = bcpzVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bcpz bcpzVar = (bcpz) obj;
        cjqq tp = this.f.eW.a.tp();
        dxjg.e(tp);
        bcpzVar.aH = tp;
        cjqy tr = this.f.eW.a.tr();
        dxjg.e(tr);
        bcpzVar.aI = tr;
        bcpzVar.aJ = dbsg.i(this.f.ap());
        Executor sU = this.f.eW.a.sU();
        dxjg.e(sU);
        bcpzVar.aK = sU;
        bcpzVar.aL = new cpv();
        bcpzVar.aM = dxjc.c(this.f.eW.ie());
        bcpzVar.aN = dxjc.c(this.f.eW.iU());
        dxjc.c(this.f.lx());
        bcpzVar.a = this.f.wl();
        bcpzVar.b = this.f.wq();
        bcpzVar.c = this.f.h();
        bwqv rD = this.f.eW.a.rD();
        dxjg.e(rD);
        bcpzVar.d = rD;
        bcpzVar.e = this.f.wd();
        btvo rp = this.f.eW.a.rp();
        dxjg.e(rp);
        bcpzVar.f = rp;
        bcpzVar.g = this.f.eW.rF();
        bcpzVar.ad = this.f.qO();
        dzsj c = dxjh.c(this.f.eW.p());
        dzsj<akdv> P = this.f.P();
        dzsj dzsjVar = this.h;
        if (dzsjVar == null) {
            dzsjVar = new eqw(this, 0);
            this.h = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.i;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eqw(this, 2);
            this.i = dzsjVar3;
        }
        bcpzVar.ae = new bcrm(c, P, dzsjVar2, dxjh.c(dzsjVar3), this.f.eW.di(), b());
        ftt fttVar = this.f;
        dzsj<rb> dzsjVar4 = fttVar.eV;
        dzsj<btvo> V = fttVar.eW.V();
        dzsj<ckcw> at = this.f.eW.at();
        dzsj<bvrb> R = this.f.eW.R();
        dzsj<cjqy> al = this.f.eW.al();
        dzsj<cjqq> hN = this.f.eW.hN();
        dzsj<bwsh> da = this.f.da();
        dzsj dzsjVar5 = this.j;
        if (dzsjVar5 == null) {
            dzsjVar5 = new eqw(this, 3);
            this.j = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.k;
        if (dzsjVar7 == null) {
            dzsjVar7 = new eqw(this, 4);
            this.k = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj dzsjVar9 = this.l;
        if (dzsjVar9 == null) {
            dzsjVar9 = new eqw(this, 6);
            this.l = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.m;
        if (dzsjVar11 == null) {
            dzsjVar11 = new eqw(this, 9);
            this.m = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj<cqhn> il = this.f.eW.il();
        dzsj<ckmm> lK = this.f.eW.lK();
        dzsj dzsjVar13 = this.n;
        if (dzsjVar13 == null) {
            dzsjVar13 = new eqw(this, 10);
            this.n = dzsjVar13;
        }
        bcpzVar.af = new bdek(dzsjVar4, V, at, R, al, hN, da, dzsjVar6, dzsjVar8, dzsjVar10, dzsjVar12, il, lK, dzsjVar13);
        bcpzVar.ag = bdpx.b(this.f.eW.pd(), this.f.eW.pf(), this.f.eW.pa(), this.f.eW.oY(), this.f.eW.R(), this.f.eW.at(), this.f.eW.k(), dxjh.c(this.f.eW.iW()), dxjh.c(this.f.m()));
        dzsj<gga> ad = this.f.ad();
        dzsj<bwqv> er = this.f.eW.er();
        dzsj c2 = dxjh.c(this.f.aX());
        dzsj dzsjVar14 = this.o;
        if (dzsjVar14 == null) {
            dzsjVar14 = new eqw(this, 11);
            this.o = dzsjVar14;
        }
        bcpzVar.ah = new bcqs(ad, er, c2, dzsjVar14, this.f.y(), this.f.uy(), this.f.eW.R());
        bcpzVar.ai = new bcqy(dxjh.c(this.f.bf()));
        bcpzVar.aj = this.f.uw();
    }

    public final dzsj<bbuu> b() {
        dzsj<bbuu> dzsjVar = this.g;
        if (dzsjVar == null) {
            eqw eqwVar = new eqw(this, 1);
            this.g = eqwVar;
            return eqwVar;
        }
        return dzsjVar;
    }

    public final bdcn c() {
        bdcn bdcnVar = this.a.al;
        dxjg.f(bdcnVar);
        return bdcnVar;
    }
}
