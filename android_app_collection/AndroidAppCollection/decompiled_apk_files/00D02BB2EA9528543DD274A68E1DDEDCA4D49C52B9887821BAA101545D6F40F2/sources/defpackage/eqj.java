package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqj  reason: default package */
/* loaded from: classes6.dex */
public final class eqj implements dxis {
    private volatile dzsj<aojq> A;
    private volatile dzsj<anpc> B;
    private volatile dzsj<anzv> C;
    private volatile dzsj<apjv> D;
    public volatile dzsj a;
    public volatile dzsj b;
    public volatile dzsj<anpy> c;
    public volatile dzsj<anys> d;
    public volatile apkf e;
    public volatile dzsj f;
    public volatile dzsj<anri> g;
    public volatile dzsj<anpb> h;
    public volatile dzsj<anum> i;
    public volatile dzsj<aovf<aogb, aoge>> j;
    public volatile dzsj<aoku> k;
    public final dzsj<anut> l;
    final /* synthetic */ ftt m;
    private volatile Object n = new dxjf();
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();
    private volatile dzsj<anqr> q;
    private volatile dzsj<aobn> r;
    private volatile dzsj<anqx> s;
    private volatile dzsj<apkf> t;
    private volatile dzsj<anru> u;
    private volatile dzsj<anrz> v;
    private volatile dzsj<aojt> w;
    private volatile dzsj x;
    private volatile dzsj<aoiw> y;
    private volatile dzsj<aofe> z;

    public eqj(ftt fttVar, anut anutVar) {
        this.m = fttVar;
        this.l = dxjd.b(anutVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        anut anutVar = (anut) obj;
        cjqq tp = this.m.eW.a.tp();
        dxjg.e(tp);
        anutVar.aH = tp;
        cjqy tr = this.m.eW.a.tr();
        dxjg.e(tr);
        anutVar.aI = tr;
        anutVar.aJ = dbsg.i(this.m.ap());
        Executor sU = this.m.eW.a.sU();
        dxjg.e(sU);
        anutVar.aK = sU;
        anutVar.aL = new cpv();
        anutVar.aM = dxjc.c(this.m.eW.ie());
        anutVar.aN = dxjc.c(this.m.eW.iU());
        dxjc.c(this.m.lx());
        anutVar.a = this.m.eW.bW();
        ftt fttVar = this.m;
        anutVar.b = new apjy(fttVar.a, dxjc.c(fttVar.kI()), dxjc.c(this.m.sw()));
        cqat rR = this.m.eW.a.rR();
        dxjg.e(rR);
        anutVar.c = rR;
        anutVar.d = new jmz();
        btrm rz = this.m.eW.a.rz();
        dxjg.e(rz);
        anutVar.e = rz;
        bwqv rD = this.m.eW.a.rD();
        dxjg.e(rD);
        anutVar.f = rD;
        anutVar.g = b();
        anutVar.ad = c();
        anutVar.ae = this.m.eW.jD();
        anutVar.af = this.m.aW();
        Object obj3 = this.p;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.p;
                if (obj2 instanceof dxjf) {
                    obj2 = new aotx(this.m.dH());
                    dxjc.d(this.p, obj2);
                    this.p = obj2;
                }
            }
            obj3 = obj2;
        }
        anutVar.ag = (aotx) obj3;
        anutVar.ah = dxjc.c(this.m.cl());
        anutVar.ai = new apkh(this.m.aW());
        ftt fttVar2 = this.m;
        rb rbVar = fttVar2.a;
        iuk kj = fttVar2.kj();
        cjqy tr2 = this.m.eW.a.tr();
        dxjg.e(tr2);
        dxjg.e(this.m.eW.a.th());
        dehq tg = this.m.eW.a.tg();
        dxjg.e(tg);
        bvjj rB = this.m.eW.a.rB();
        dxjg.e(rB);
        Application a = this.m.eW.a.a();
        dxjg.e(a);
        cjqy tr3 = this.m.eW.a.tr();
        dxjg.e(tr3);
        anutVar.aj = new ansy(rbVar, kj, tr2, tg, rB, new answ(new ansu(a, tr3)), this.m.kk());
        anutVar.ak = this.m.wl();
        anutVar.al = new cqhu();
        anutVar.am = this.m.wq();
        bvjj rB2 = this.m.eW.a.rB();
        dxjg.e(rB2);
        anutVar.an = rB2;
        anutVar.ao = new aoug(this.m.eW.m(), this.m.eW.aw(), this.m.eW.ax(), this.m.eW.an(), this.m.eW.R());
        ftt fttVar3 = this.m;
        dzsj<rb> dzsjVar = fttVar3.eV;
        dzsj<cqhn> il = fttVar3.eW.il();
        dzsj<bsvm> aV = this.m.aV();
        dzsj<Executor> di = this.m.eW.di();
        dzsj dzsjVar2 = this.q;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eqi(this, 0);
            this.q = dzsjVar2;
        }
        anutVar.ap = new anqq(dzsjVar, il, aV, di, dzsjVar2);
        this.m.eW.dd();
        this.m.eW.cx();
        dzsj<cjyb> sx = this.m.sx();
        dzsj dzsjVar3 = this.r;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eqi(this, 1);
            this.r = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.C;
        if (dzsjVar5 == null) {
            dzsjVar5 = new eqi(this, 4);
            this.C = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj<anut> dzsjVar7 = this.l;
        dzsj<jjm> kI = this.m.kI();
        dzsj<anhg> aX = this.m.aX();
        dzsj<eapg> hn = this.m.eW.hn();
        dzsj dzsjVar8 = this.D;
        if (dzsjVar8 == null) {
            dzsjVar8 = new eqi(this, 23);
            this.D = dzsjVar8;
        }
        anutVar.aq = new anvk(sx, dzsjVar4, dzsjVar6, dzsjVar7, kI, aX, hn, dzsjVar8, this.m.eW.al(), this.m.eW.il());
        anutVar.ar = new aplg(this.m.cv());
        anutVar.as = this.m.cJ();
        anutVar.at = this.m.wd();
    }

    public final aovf<eapy, aogo> b() {
        Object obj;
        Object obj2 = this.n;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.n;
                if (obj instanceof dxjf) {
                    obj = new aovf();
                    dxjc.d(this.n, obj);
                    this.n = obj;
                }
            }
            obj2 = obj;
        }
        return (aovf) obj2;
    }

    public final aovf<aogb, aoge> c() {
        Object obj;
        Object obj2 = this.o;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.o;
                if (obj instanceof dxjf) {
                    obj = new aovf();
                    dxjc.d(this.o, obj);
                    this.o = obj;
                }
            }
            obj2 = obj;
        }
        return (aovf) obj2;
    }

    public final apjv d() {
        gga wk = this.m.wk();
        anhg aW = this.m.aW();
        dxio c = dxjc.c(this.m.bh());
        apkm dN = this.m.dN();
        dxjg.e(this.m.eW.a.rB());
        this.m.eW.am();
        cpv cpvVar = new cpv();
        this.m.eW.jJ();
        dxjg.e(this.m.eW.a.rp());
        return new apjv(wk, aW, c, dN, cpvVar);
    }

    public final dzsj<anqx> e() {
        dzsj<anqx> dzsjVar = this.s;
        if (dzsjVar == null) {
            eqi eqiVar = new eqi(this, 8);
            this.s = eqiVar;
            return eqiVar;
        }
        return dzsjVar;
    }

    public final dzsj<anru> f() {
        dzsj<anru> dzsjVar = this.u;
        if (dzsjVar == null) {
            eqi eqiVar = new eqi(this, 10);
            this.u = eqiVar;
            return eqiVar;
        }
        return dzsjVar;
    }

    public final aoiw g() {
        dzsj dzsjVar = this.w;
        if (dzsjVar == null) {
            dzsjVar = new eqi(this, 13);
            this.w = dzsjVar;
        }
        dzsj dzsjVar2 = this.x;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eqi(this, 14);
            this.x = dzsjVar2;
        }
        return new aoiw(dzsjVar, dzsjVar2, this.m.eW.m());
    }

    public final dzsj<aoiw> h() {
        dzsj<aoiw> dzsjVar = this.y;
        if (dzsjVar == null) {
            eqi eqiVar = new eqi(this, 12);
            this.y = eqiVar;
            return eqiVar;
        }
        return dzsjVar;
    }

    public final dzsj<aojq> i() {
        dzsj<aojq> dzsjVar = this.A;
        if (dzsjVar == null) {
            eqi eqiVar = new eqi(this, 17);
            this.A = eqiVar;
            return eqiVar;
        }
        return dzsjVar;
    }

    public final anrz j() {
        dzsj<btvo> dzsjVar;
        dzsj<gga> ad = this.m.ad();
        dzsj<cqat> K = this.m.eW.K();
        dzsj<angp> jB = this.m.eW.jB();
        dzsj<anhg> aX = this.m.aX();
        dzsj<bbut> bf = this.m.bf();
        dzsj<anqx> e = e();
        dzsj<cjqy> al = this.m.eW.al();
        dzsj dzsjVar2 = this.t;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eqi(this, 9);
            this.t = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<anru> f = f();
        dzsj dzsjVar4 = this.v;
        if (dzsjVar4 == null) {
            dzsjVar4 = new eqi(this, 11);
            this.v = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<anpw> ug = this.m.ug();
        dzsj<aoiw> h = h();
        dzsj c = dxjh.c(this.m.az());
        dzsj<btvo> V = this.m.eW.V();
        dzsj<aogw> fx = this.m.eW.fx();
        dzsj<aokw> dM = this.m.dM();
        dzsj dzsjVar6 = this.z;
        if (dzsjVar6 == null) {
            dzsjVar = V;
            dzsjVar6 = new eqi(this, 15);
            this.z = dzsjVar6;
        } else {
            dzsjVar = V;
        }
        return new anrz(ad, K, jB, aX, bf, e, al, dzsjVar3, f, dzsjVar5, ug, h, c, dzsjVar, fx, dM, dzsjVar6, i());
    }

    public final dzsj<anpc> k() {
        dzsj<anpc> dzsjVar = this.B;
        if (dzsjVar == null) {
            eqi eqiVar = new eqi(this, 20);
            this.B = eqiVar;
            return eqiVar;
        }
        return dzsjVar;
    }
}
