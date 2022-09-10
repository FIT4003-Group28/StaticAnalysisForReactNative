package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fsu  reason: default package */
/* loaded from: classes6.dex */
public final class fsu implements dxis {
    public final acdh a;
    public volatile bvan b;
    public volatile dzsj<bdcn> c;
    public volatile dzsj<bdct> d;
    public volatile dzsj<aaaf> e;
    final /* synthetic */ ftt f;
    private volatile dzsj<bbuu> g;
    private volatile dzsj<bdfc> h;
    private volatile dzsj<bvan> i;
    private volatile dzsj<bdfe> j;
    private volatile dzsj<bdcm> k;
    private volatile dzsj<bdcj> l;
    private volatile dzsj<bddz> m;
    private volatile dzsj<bddb> n;
    private volatile dzsj<bdcp> o;
    private volatile dzsj<bdai> p;
    private volatile dzsj<bdag> q;
    private volatile dzsj<bcrp> r;
    private volatile dzsj<dbsg<bcrr>> s;
    private volatile dzsj<bdcz> t;

    public fsu(ftt fttVar, acdh acdhVar) {
        this.f = fttVar;
        this.a = acdhVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        acdh acdhVar = (acdh) obj;
        cjqq tp = this.f.eW.a.tp();
        dxjg.e(tp);
        acdhVar.aH = tp;
        cjqy tr = this.f.eW.a.tr();
        dxjg.e(tr);
        acdhVar.aI = tr;
        acdhVar.aJ = dbsg.i(this.f.ap());
        Executor sU = this.f.eW.a.sU();
        dxjg.e(sU);
        acdhVar.aK = sU;
        acdhVar.aL = new cpv();
        acdhVar.aM = dxjc.c(this.f.eW.ie());
        acdhVar.aN = dxjc.c(this.f.eW.iU());
        dxjc.c(this.f.lx());
        acdhVar.ae = this.f.wl();
        acdhVar.af = this.f.wq();
        acdhVar.ag = this.f.h();
        acdhVar.ah = this.f.wd();
        dzsj c = dxjh.c(this.f.eW.p());
        dzsj<akdv> P = this.f.P();
        dzsj dzsjVar = this.h;
        if (dzsjVar == null) {
            dzsjVar = new fst(this, 0);
            this.h = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.i;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fst(this, 2);
            this.i = dzsjVar3;
        }
        acdhVar.ai = new bcrm(c, P, dzsjVar2, dxjh.c(dzsjVar3), this.f.eW.di(), b());
        ftt fttVar = this.f;
        dzsj<rb> dzsjVar4 = fttVar.eV;
        dzsj<btvo> V = fttVar.eW.V();
        dzsj<ckcw> at = this.f.eW.at();
        dzsj<cjqy> al = this.f.eW.al();
        dzsj<cjqq> hN = this.f.eW.hN();
        dzsj dzsjVar5 = this.j;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fst(this, 3);
            this.j = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.k;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fst(this, 4);
            this.k = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj dzsjVar9 = this.l;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fst(this, 6);
            this.l = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj<ckmm> lK = this.f.eW.lK();
        dzsj dzsjVar11 = this.m;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fst(this, 7);
            this.m = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj<cqhn> il = this.f.eW.il();
        dzsj dzsjVar13 = this.n;
        if (dzsjVar13 == null) {
            dzsjVar13 = new fst(this, 8);
            this.n = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.o;
        if (dzsjVar15 == null) {
            dzsjVar15 = new fst(this, 9);
            this.o = dzsjVar15;
        }
        dzsj dzsjVar16 = dzsjVar15;
        dzsj dzsjVar17 = this.p;
        if (dzsjVar17 == null) {
            dzsjVar17 = new fst(this, 10);
            this.p = dzsjVar17;
        }
        dzsj dzsjVar18 = dzsjVar17;
        dzsj dzsjVar19 = this.q;
        if (dzsjVar19 == null) {
            dzsjVar19 = new fst(this, 11);
            this.q = dzsjVar19;
        }
        dzsj dzsjVar20 = dzsjVar19;
        dzsj dzsjVar21 = this.r;
        if (dzsjVar21 == null) {
            dzsjVar21 = new fst(this, 12);
            this.r = dzsjVar21;
        }
        dzsj dzsjVar22 = dzsjVar21;
        dzsj dzsjVar23 = this.s;
        if (dzsjVar23 == null) {
            dzsjVar23 = new fst(this, 13);
            this.s = dzsjVar23;
        }
        acdhVar.aj = new bddg(dzsjVar4, V, at, al, hN, dzsjVar6, dzsjVar8, dzsjVar10, lK, dzsjVar12, il, dzsjVar14, dzsjVar16, dzsjVar18, dzsjVar20, dzsjVar22, dzsjVar23);
        acdhVar.ak = dxjc.c(b());
        ftt fttVar2 = this.f;
        acdhVar.a = fttVar2.a;
        bwqv rD = fttVar2.eW.a.rD();
        dxjg.e(rD);
        acdhVar.b = rD;
        btvo rp = this.f.eW.a.rp();
        dxjg.e(rp);
        acdhVar.c = rp;
        acdhVar.d = this.f.qO();
        ftt fttVar3 = this.f;
        acdhVar.e = new bdeq(fttVar3.a, fttVar3.wj());
        dzsj<rb> dzsjVar24 = this.f.eV;
        dzsj dzsjVar25 = this.t;
        if (dzsjVar25 == null) {
            dzsjVar25 = new fst(this, 14);
            this.t = dzsjVar25;
        }
        acdhVar.f = new bdes(dzsjVar24, dzsjVar25);
        acdhVar.g = new bbuw();
        acdhVar.ad = this.f.vF();
    }

    public final dzsj<bbuu> b() {
        dzsj<bbuu> dzsjVar = this.g;
        if (dzsjVar == null) {
            fst fstVar = new fst(this, 1);
            this.g = fstVar;
            return fstVar;
        }
        return dzsjVar;
    }

    public final bdcn c() {
        return bcqf.b(this.a);
    }
}
