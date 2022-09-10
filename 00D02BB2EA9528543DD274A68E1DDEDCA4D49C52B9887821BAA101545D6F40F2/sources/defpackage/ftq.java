package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ftq  reason: default package */
/* loaded from: classes6.dex */
public final class ftq implements dxis {
    public volatile dzsj<bfcd> a;
    public volatile dzsj<bnhs> b;
    public volatile dzsj<aymh> c;
    public volatile dzsj<ayak> d;
    public volatile dzsj<axze> e;
    public final dzsj<baup> f;
    final /* synthetic */ ftt g;
    private volatile dzsj<batz> h;
    private volatile dzsj<bayv> i;
    private volatile dzsj<bayy> j;
    private volatile dzsj<bazx> k;
    private volatile dzsj<wgc> l;
    private volatile dzsj<bbag> m;
    private volatile dzsj<bbcj> n;
    private volatile dzsj<bbbv> o;
    private volatile bvbi p;

    public ftq(ftt fttVar, baup baupVar) {
        this.g = fttVar;
        this.f = dxjd.b(baupVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        baup baupVar = (baup) obj;
        cjqq tp = this.g.eW.a.tp();
        dxjg.e(tp);
        baupVar.aH = tp;
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        baupVar.aI = tr;
        baupVar.aJ = dbsg.i(this.g.ap());
        Executor sU = this.g.eW.a.sU();
        dxjg.e(sU);
        baupVar.aK = sU;
        baupVar.aL = new cpv();
        baupVar.aM = dxjc.c(this.g.eW.ie());
        baupVar.aN = dxjc.c(this.g.eW.iU());
        dxjc.c(this.g.lx());
        baupVar.c = new cqhn();
        btvo rp = this.g.eW.a.rp();
        dxjg.e(rp);
        baupVar.d = rp;
        btrm rz = this.g.eW.a.rz();
        dxjg.e(rz);
        baupVar.e = rz;
        btpc sz = this.g.eW.a.sz();
        dxjg.e(sz);
        baupVar.f = sz;
        baupVar.g = this.g.eW.qn();
        baupVar.ad = this.g.z();
        baupVar.ae = this.g.eW.ek();
        bvrb tn = this.g.eW.a.tn();
        dxjg.e(tn);
        baupVar.af = tn;
        baupVar.ag = this.g.wq();
        baupVar.ah = this.g.wl();
        baupVar.ai = new jmz();
        bvbi bvbiVar = this.p;
        if (bvbiVar == null) {
            dxio c = dxjc.c(this.g.eW.h());
            bvrb tn2 = this.g.eW.a.tn();
            dxjg.e(tn2);
            bvbiVar = bvbk.b(bvbj.b(c, tn2));
            this.p = bvbiVar;
        }
        baupVar.aC = bvbiVar;
        baupVar.aj = this.g.eW.rG();
        this.g.eW.bW();
        baupVar.ak = this.g.N();
        baupVar.al = this.g.eW.io();
        dzsj<gga> ad = this.g.ad();
        dzsj<ahjq> k = this.g.eW.k();
        dzsj<axwq> u = this.g.eW.u();
        dzsj dzsjVar = this.i;
        if (dzsjVar == null) {
            dzsjVar = new ftp(this, 0);
            this.i = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.j;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ftp(this, 2);
            this.j = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.k;
        if (dzsjVar5 == null) {
            dzsjVar5 = new ftp(this, 3);
            this.k = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj<ania> hj = this.g.eW.hj();
        dzsj c2 = dxjh.c(this.g.J());
        dzsj dzsjVar7 = this.l;
        if (dzsjVar7 == null) {
            dzsjVar7 = new ftp(this, 4);
            this.l = dzsjVar7;
        }
        baupVar.am = new bazf(ad, k, u, dzsjVar2, dzsjVar4, dzsjVar6, hj, c2, dzsjVar7, this.g.eW.il());
        dzsj<bbag> dzsjVar8 = this.m;
        if (dzsjVar8 == null) {
            dzsjVar8 = new ftp<>(this, 5);
            this.m = dzsjVar8;
        }
        baupVar.an = dzsjVar8;
        dzsj<bbcj> dzsjVar9 = this.n;
        if (dzsjVar9 == null) {
            dzsjVar9 = new ftp<>(this, 8);
            this.n = dzsjVar9;
        }
        baupVar.ao = dzsjVar9;
        dzsj<bbbv> dzsjVar10 = this.o;
        if (dzsjVar10 == null) {
            dzsjVar10 = new ftp<>(this, 12);
            this.o = dzsjVar10;
        }
        baupVar.ap = dzsjVar10;
        baupVar.aq = new bbco(this.g.eW.ik(), this.g.ad(), this.g.aX(), this.g.eW.il(), this.g.eW.al());
        baupVar.au = new bbak(this.g.wk(), new bbai(this.g.ly(), this.g.ad(), this.g.eW.er(), this.g.eW.oL(), this.g.eW.hj(), this.g.bd(), c()));
        gga wk = this.g.wk();
        bvjj rB = this.g.eW.a.rB();
        dxjg.e(rB);
        akfa rK = this.g.eW.a.rK();
        dxjg.e(rK);
        cjqy tr2 = this.g.eW.a.tr();
        dxjg.e(tr2);
        baupVar.av = new bbbk(wk, rB, rK, tr2, this.g.cp(), this.g.eW.qq(), this.g.eW.qn(), new barv(this.g.ad(), this.g.eW.il(), this.g.eW.u(), this.g.J(), this.g.G(), dxjh.c(this.g.eW.p())), new bbbd(this.g.ad(), this.g.fe(), this.g.dL()), new bbbb(this.g.ad(), this.g.eW.u(), this.g.eW.er(), this.g.eW.hj(), dxjh.c(this.g.m()), this.g.lD(), c()));
    }

    public final batz b() {
        return baua.b(this.g.fc());
    }

    public final dzsj<batz> c() {
        dzsj<batz> dzsjVar = this.h;
        if (dzsjVar == null) {
            ftp ftpVar = new ftp(this, 1);
            this.h = ftpVar;
            return ftpVar;
        }
        return dzsjVar;
    }

    public final aymh d() {
        return new aymh(this.g.a);
    }

    public final ayak e() {
        gga wk = this.g.wk();
        bwqv rD = this.g.eW.a.rD();
        dxjg.e(rD);
        bvrb tn = this.g.eW.a.tn();
        dxjg.e(tn);
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        return ayal.b(wk, rD, tn, tr, this.g.fd(), dxjc.c(this.g.bh()), dxjc.c(this.g.eW.el()), dxjc.c(this.g.eW()), dxjc.c(this.g.eW.ak()), dxjc.c(this.g.eW.u()), dxjc.c(this.g.eW.oQ()), dxjc.c(this.g.eW.oR()), this.g.wl());
    }
}
