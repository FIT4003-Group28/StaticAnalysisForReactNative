package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: epf  reason: default package */
/* loaded from: classes6.dex */
public final class epf implements dxis {
    public volatile dzsj<aaxo> a;
    public volatile dzsj<aydo> b;
    public volatile dzsj<aybq> c;
    public volatile dzsj<aywv> d;
    public volatile dzsj<caxe> e;
    public final dzsj<ayrr> f;
    final /* synthetic */ ftt g;
    private volatile dzsj<ayvl> h;
    private volatile dzsj<axyr> i;
    private volatile dzsj<aybl> j;
    private volatile dzsj<batz> k;
    private volatile dzsj<ayfl> l;
    private volatile dzsj<aydr> m;
    private volatile dzsj<aydu> n;
    private volatile dzsj<ayvj> o;
    private volatile dzsj<aymh> p;
    private volatile dzsj<aywl> q;

    public epf(ftt fttVar, ayrr ayrrVar) {
        this.g = fttVar;
        this.f = dxjd.b(ayrrVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ayrr ayrrVar;
        dzsj dzsjVar;
        ayrr ayrrVar2 = (ayrr) obj;
        cjqq tp = this.g.eW.a.tp();
        dxjg.e(tp);
        ayrrVar2.aH = tp;
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        ayrrVar2.aI = tr;
        ayrrVar2.aJ = dbsg.i(this.g.ap());
        Executor sU = this.g.eW.a.sU();
        dxjg.e(sU);
        ayrrVar2.aK = sU;
        ayrrVar2.aL = new cpv();
        ayrrVar2.aM = dxjc.c(this.g.eW.ie());
        ayrrVar2.aN = dxjc.c(this.g.eW.iU());
        dxjc.c(this.g.lx());
        ayrrVar2.a = this.g.eW.bW();
        ayrrVar2.b = this.g.wk();
        bwqv rD = this.g.eW.a.rD();
        dxjg.e(rD);
        ayrrVar2.c = rD;
        ayrrVar2.d = this.g.wq();
        ayrrVar2.e = this.g.wl();
        ayrrVar2.f = new jmz();
        dzsj<gga> ad = this.g.ad();
        dzsj<ayrr> dzsjVar2 = this.f;
        dzsj c = dxjh.c(this.g.eW());
        dzsj<axwi> el = this.g.eW.el();
        dzsj<bvrb> R = this.g.eW.R();
        dzsj dzsjVar3 = this.h;
        if (dzsjVar3 == null) {
            dzsjVar3 = new epe(this, 0);
            this.h = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.i;
        if (dzsjVar5 == null) {
            dzsjVar5 = new epe(this, 5);
            this.i = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.j;
        if (dzsjVar7 == null) {
            dzsjVar7 = new epe(this, 6);
            this.j = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj dzsjVar9 = this.l;
        if (dzsjVar9 == null) {
            dzsjVar9 = new epe(this, 7);
            this.l = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj<cqhn> il = this.g.eW.il();
        dzsj<cqhu> eS = this.g.eS();
        dzsj dzsjVar11 = this.n;
        if (dzsjVar11 == null) {
            dzsjVar11 = new epe(this, 9);
            this.n = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj<ayay> uq = this.g.uq();
        dzsj<Executor> o = this.g.eW.o();
        dzsj<axsa> oL = this.g.eW.oL();
        dzsj<cjqy> al = this.g.eW.al();
        dzsj dzsjVar13 = this.o;
        if (dzsjVar13 == null) {
            ayrrVar = ayrrVar2;
            dzsjVar13 = new epe(this, 12);
            this.o = dzsjVar13;
        } else {
            ayrrVar = ayrrVar2;
        }
        dzsj dzsjVar14 = dzsjVar13;
        ftt fttVar = this.g;
        dzsj dzsjVar15 = fttVar.cV;
        if (dzsjVar15 == null) {
            dzsjVar = dzsjVar12;
            dzsjVar15 = new fns(fttVar, 1328);
            fttVar.cV = dzsjVar15;
        } else {
            dzsjVar = dzsjVar12;
        }
        dzsj dzsjVar16 = dzsjVar15;
        dzsj<cpv> bk = this.g.eW.bk();
        dzsj<gfq> ly = this.g.ly();
        dzsj dzsjVar17 = this.p;
        if (dzsjVar17 == null) {
            dzsjVar17 = new epe(this, 13);
            this.p = dzsjVar17;
        }
        aywc aywcVar = new aywc(ad, dzsjVar2, c, el, R, dzsjVar4, dzsjVar6, dzsjVar8, dzsjVar10, il, eS, dzsjVar, uq, o, oL, al, dzsjVar14, dzsjVar16, bk, ly, dzsjVar17);
        ayrr ayrrVar3 = ayrrVar;
        ayrrVar3.g = aywcVar;
        dzsj<aywl> dzsjVar18 = this.q;
        if (dzsjVar18 == null) {
            dzsjVar18 = new epe<>(this, 14);
            this.q = dzsjVar18;
        }
        ayrrVar3.ad = dzsjVar18;
    }

    public final axyr b() {
        return new axyr(this.g.ad(), this.g.eW.er(), this.f);
    }

    public final aybl c() {
        gga wk = this.g.wk();
        cqat rR = this.g.eW.a.rR();
        dxjg.e(rR);
        return aybm.b(wk, rR, this.g.eW.wf());
    }

    public final ayfl d() {
        dzsj<gga> ad = this.g.ad();
        dzsj<ayrr> dzsjVar = this.f;
        dzsj<ahjq> k = this.g.eW.k();
        dzsj c = dxjh.c(this.g.uo());
        dzsj<btpc> cx = this.g.eW.cx();
        dzsj<begg> az = this.g.az();
        dzsj<bvrb> R = this.g.eW.R();
        dzsj<cztz> dd = this.g.eW.dd();
        dzsj<bnjv> pl = this.g.pl();
        dzsj<btvo> V = this.g.eW.V();
        dzsj<btrg> mG = this.g.eW.mG();
        dzsj<Executor> di = this.g.eW.di();
        dzsj dzsjVar2 = this.k;
        if (dzsjVar2 == null) {
            dzsjVar2 = new epe(this, 8);
            this.k = dzsjVar2;
        }
        return new ayfl(ad, dzsjVar, k, c, cx, az, R, dd, pl, V, mG, di, dzsjVar2);
    }

    public final dzsj<aydr> e() {
        dzsj<aydr> dzsjVar = this.m;
        if (dzsjVar == null) {
            epe epeVar = new epe(this, 10);
            this.m = epeVar;
            return epeVar;
        }
        return dzsjVar;
    }

    public final aymh f() {
        return new aymh(this.g.a);
    }
}
