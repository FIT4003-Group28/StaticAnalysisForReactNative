package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fkw  reason: default package */
/* loaded from: classes6.dex */
public final class fkw implements dxis {
    public volatile dzsj<baez> a;
    public volatile dzsj b;
    public volatile dzsj<bbat> c;
    public volatile dzsj<ayak> d;
    public volatile dzsj<axze> e;
    public volatile dzsj<bbca> f;
    public volatile dzsj<anqr> g;
    public volatile dzsj<burp> h;
    public volatile dzsj i;
    public volatile dzsj j;
    public final dzsj<babb> k;
    final /* synthetic */ ftt l;
    public volatile burp m;
    private volatile dzsj<bagk> n;
    private volatile dzsj<aosp> o;
    private volatile dzsj<bagz> p;
    private volatile dzsj<bahj> q;
    private volatile dzsj<aymh> r;
    private volatile dzsj<batz> s;
    private volatile dzsj<baia> t;
    private volatile dzsj<aotf> u;

    public fkw(ftt fttVar, babb babbVar) {
        this.l = fttVar;
        this.k = dxjd.b(babbVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        babb babbVar;
        babb babbVar2 = (babb) obj;
        cjqq tp = this.l.eW.a.tp();
        dxjg.e(tp);
        babbVar2.aH = tp;
        cjqy tr = this.l.eW.a.tr();
        dxjg.e(tr);
        babbVar2.aI = tr;
        babbVar2.aJ = dbsg.i(this.l.ap());
        Executor sU = this.l.eW.a.sU();
        dxjg.e(sU);
        babbVar2.aK = sU;
        babbVar2.aL = new cpv();
        babbVar2.aM = dxjc.c(this.l.eW.ie());
        babbVar2.aN = dxjc.c(this.l.eW.iU());
        dxjc.c(this.l.lx());
        babbVar2.b = this.l.eW.bW();
        babbVar2.c = this.l.N();
        babbVar2.d = this.l.wk();
        babbVar2.e = this.l.eW.io();
        babbVar2.f = dxjc.c(this.l.eW.p());
        dxjc.c(this.l.aX());
        babbVar2.g = dxjc.c(this.l.ge());
        dzsj<acyp> ik = this.l.eW.ik();
        dzsj<cqat> K = this.l.eW.K();
        dzsj<cqhn> il = this.l.eW.il();
        dzsj<btpc> cx = this.l.eW.cx();
        dzsj<Executor> o = this.l.eW.o();
        dzsj<Executor> di = this.l.eW.di();
        dzsj<btrm> n = this.l.eW.n();
        dzsj<gga> ad = this.l.ad();
        dzsj<cklq> mj = this.l.eW.mj();
        dzsj c = dxjh.c(this.l.eW.aw());
        dzsj c2 = dxjh.c(this.l.eW.el());
        dzsj dzsjVar = this.n;
        if (dzsjVar == null) {
            dzsjVar = new fkv(this, 0);
            this.n = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<axsa> oL = this.l.eW.oL();
        dzsj dzsjVar3 = this.o;
        if (dzsjVar3 == null) {
            babbVar = babbVar2;
            dzsjVar3 = new fkv(this, 1);
            this.o = dzsjVar3;
        } else {
            babbVar = babbVar2;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.p;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fkv(this, 2);
            this.p = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj<axwq> u = this.l.eW.u();
        dzsj dzsjVar7 = this.q;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fkv(this, 3);
            this.q = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj dzsjVar9 = this.t;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fkv(this, 4);
            this.t = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.u;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fkv(this, 13);
            this.u = dzsjVar11;
        }
        babb babbVar3 = babbVar;
        babbVar3.ad = new bajo(ik, K, il, cx, o, di, n, ad, mj, c, c2, dzsjVar2, oL, dzsjVar4, dzsjVar6, u, dzsjVar8, dzsjVar10, dzsjVar11, this.l.eW.bm());
        babbVar3.ae = this.l.wq();
        babbVar3.af = this.l.wl();
        dehq tf = this.l.eW.a.tf();
        dxjg.e(tf);
        babbVar3.ag = tf;
    }

    public final baih b() {
        return new baih(this.l.eW.K(), this.l.eW.il(), this.l.eW.kf(), this.l.ad(), this.l.eW.k(), dxjh.c(this.l.az()), dxjh.c(this.l.eW()), dxjh.c(this.l.J()));
    }

    public final aymh c() {
        return new aymh(this.l.a);
    }

    public final dzsj<aymh> d() {
        dzsj<aymh> dzsjVar = this.r;
        if (dzsjVar == null) {
            fkv fkvVar = new fkv(this, 6);
            this.r = fkvVar;
            return fkvVar;
        }
        return dzsjVar;
    }

    public final batz e() {
        return baua.b(this.l.fc());
    }

    public final dzsj<batz> f() {
        dzsj<batz> dzsjVar = this.s;
        if (dzsjVar == null) {
            fkv fkvVar = new fkv(this, 7);
            this.s = fkvVar;
            return fkvVar;
        }
        return dzsjVar;
    }

    public final ayak g() {
        gga wk = this.l.wk();
        bwqv rD = this.l.eW.a.rD();
        dxjg.e(rD);
        bvrb tn = this.l.eW.a.tn();
        dxjg.e(tn);
        cjqy tr = this.l.eW.a.tr();
        dxjg.e(tr);
        return ayal.b(wk, rD, tn, tr, this.l.fd(), dxjc.c(this.l.bh()), dxjc.c(this.l.eW.el()), dxjc.c(this.l.eW()), dxjc.c(this.l.eW.ak()), dxjc.c(this.l.eW.u()), dxjc.c(this.l.eW.oQ()), dxjc.c(this.l.eW.oR()), this.l.wl());
    }
}
