package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fom  reason: default package */
/* loaded from: classes6.dex */
public final class fom implements dxis {
    private volatile dzsj A;
    private volatile dzsj B;
    private volatile dzsj<aniz> C;
    private volatile dzsj<aobn> D;
    private volatile dzsj<anqx> E;
    private volatile dzsj<anru> F;
    private volatile dzsj<anrz> G;
    private volatile dzsj<aojt> H;
    private volatile dzsj I;
    private volatile dzsj<aoiw> J;
    private volatile dzsj<aofe> K;
    private volatile dzsj<aojq> L;
    private volatile dzsj<anpc> M;
    private volatile dzsj<anzv> N;
    private volatile dzsj<anqr> Q;
    public volatile dzsj<apim> a;
    public volatile dzsj<apis> b;
    public volatile dzsj<aoxq> c;
    public volatile dzsj<apid> d;
    public volatile dzsj<apiy> e;
    public volatile dzsj<aphy> f;
    public volatile dzsj<anpy> g;
    public volatile dzsj<anys> h;
    public volatile dzsj i;
    public volatile dzsj<anri> j;
    public volatile dzsj<anpb> k;
    public volatile dzsj<anum> l;
    public volatile dzsj<aovf<aogb, aoge>> m;
    public volatile dzsj<aoku> n;
    public final dzsj<aovt> o;
    final /* synthetic */ ftt p;
    private final aovt q;
    private volatile dzsj<aphj> t;
    private volatile dzsj<apii> u;
    private volatile dzsj<apip> v;
    private volatile dzsj<apjg> w;
    private volatile dzsj<apjv> x;
    private volatile dzsj<aphc> y;
    private volatile dzsj<apgk> z;
    private volatile Object r = new dxjf();
    private volatile Object s = new dxjf();
    private volatile Object O = new dxjf();
    private volatile Object P = new dxjf();
    private volatile Object R = new dxjf();

    public fom(ftt fttVar, aovt aovtVar) {
        this.p = fttVar;
        this.q = aovtVar;
        this.o = dxjd.b(aovtVar);
    }

    private final dzsj<apjv> p() {
        dzsj<apjv> dzsjVar = this.x;
        if (dzsjVar == null) {
            fol folVar = new fol(this, 10);
            this.x = folVar;
            return folVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        aovt aovtVar = (aovt) obj;
        cjqq tp = this.p.eW.a.tp();
        dxjg.e(tp);
        aovtVar.aH = tp;
        cjqy tr = this.p.eW.a.tr();
        dxjg.e(tr);
        aovtVar.aI = tr;
        aovtVar.aJ = dbsg.i(this.p.ap());
        Executor sU = this.p.eW.a.sU();
        dxjg.e(sU);
        aovtVar.aK = sU;
        aovtVar.aL = new cpv();
        aovtVar.aM = dxjc.c(this.p.eW.ie());
        aovtVar.aN = dxjc.c(this.p.eW.iU());
        dxjc.c(this.p.lx());
        aovtVar.a = this.p.eW.bW();
        aovtVar.b = b();
        aovtVar.c = c();
        cqat rR = this.p.eW.a.rR();
        dxjg.e(rR);
        aovtVar.d = rR;
        aovtVar.e = dxjc.c(this.p.cl());
        aovtVar.f = dxjc.c(this.p.lN());
        aovtVar.g = new cqhn();
        aovtVar.ad = new cqhu();
        aovtVar.ae = this.p.wl();
        dzsj dzsjVar = this.u;
        if (dzsjVar == null) {
            dzsjVar = new fol(this, 0);
            this.u = dzsjVar;
        }
        dzsj dzsjVar2 = this.v;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fol(this, 3);
            this.v = dzsjVar2;
        }
        dzsj dzsjVar3 = this.w;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fol(this, 5);
            this.w = dzsjVar3;
        }
        aovtVar.af = new apjc(dzsjVar, dzsjVar2, dzsjVar3);
        dzsj<gga> ad = this.p.ad();
        dzsj<cqhn> il = this.p.eW.il();
        dzsj<cqhu> eS = this.p.eS();
        dzsj<cjqy> al = this.p.eW.al();
        dzsj<apjz> oC = this.p.eW.oC();
        dzsj<apjv> p = p();
        dzsj<anhg> aX = this.p.aX();
        dzsj dzsjVar4 = this.y;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fol(this, 11);
            this.y = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.z;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fol(this, 12);
            this.z = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.C;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fol(this, 13);
            this.C = dzsjVar8;
        }
        aovtVar.ag = new apgr(ad, il, eS, al, oC, p, aX, dzsjVar5, dzsjVar7, dzsjVar8, this.p.eW.bk());
        dzsj<cjyb> sx = this.p.sx();
        dzsj dzsjVar9 = this.D;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fol(this, 16);
            this.D = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.N;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fol(this, 17);
            this.N = dzsjVar11;
        }
        aovtVar.ah = new anvk(sx, dzsjVar10, dzsjVar11, this.o, this.p.kI(), this.p.aX(), this.p.eW.hn(), p(), this.p.eW.al(), this.p.eW.il());
        Object obj5 = this.O;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj4 = this.O;
                if (obj4 instanceof dxjf) {
                    obj4 = new aotx(this.p.dH());
                    dxjc.d(this.O, obj4);
                    this.O = obj4;
                }
            }
            obj5 = obj4;
        }
        aovtVar.ai = (aotx) obj5;
        Object obj6 = this.P;
        if (obj6 instanceof dxjf) {
            synchronized (obj6) {
                obj3 = this.P;
                if (obj3 instanceof dxjf) {
                    gga wk = this.p.wk();
                    aoxv oA = this.p.eW.oA();
                    akox ap = this.p.ap();
                    dxio c = dxjc.c(this.p.dE());
                    btrm rz = this.p.eW.a.rz();
                    dxjg.e(rz);
                    bvrb tn = this.p.eW.a.tn();
                    dxjg.e(tn);
                    Executor sU2 = this.p.eW.a.sU();
                    dxjg.e(sU2);
                    aphj d = d();
                    bmdv hp = this.p.eW.hp();
                    begg wj = this.p.wj();
                    gle bM = this.p.bM();
                    ahjq wf = this.p.eW.wf();
                    dxio c2 = dxjc.c(this.p.bA());
                    anhg aW = this.p.aW();
                    btvo rp = this.p.eW.a.rp();
                    dxjg.e(rp);
                    obj3 = aoxa.b(wk, oA, ap, c, rz, tn, sU2, d, hp, wj, bM, wf, c2, aW, rp);
                    dxjc.d(this.P, obj3);
                    this.P = obj3;
                }
            }
            obj6 = obj3;
        }
        aovtVar.aj = (aowy) obj6;
        aovtVar.ak = f();
        aovtVar.al = this.p.eW.oA();
        aovtVar.am = new jmz();
        aovtVar.an = this.p.eW.jD();
        bwqv rD = this.p.eW.a.rD();
        dxjg.e(rD);
        aovtVar.ao = rD;
        aovtVar.ap = this.p.cJ();
        aovtVar.aq = this.p.wk();
        ftt fttVar = this.p;
        aovtVar.ar = new apjy(fttVar.a, dxjc.c(fttVar.kI()), dxjc.c(this.p.sw()));
        ftt fttVar2 = this.p;
        dzsj<rb> dzsjVar12 = fttVar2.eV;
        dzsj<cqhn> il2 = fttVar2.eW.il();
        dzsj<bsvm> aV = this.p.aV();
        dzsj<Executor> di = this.p.eW.di();
        dzsj dzsjVar13 = this.Q;
        if (dzsjVar13 == null) {
            dzsjVar13 = new fol(this, 35);
            this.Q = dzsjVar13;
        }
        aovtVar.as = new anqq(dzsjVar12, il2, aV, di, dzsjVar13);
        aovtVar.at = new aoug(this.p.eW.m(), this.p.eW.aw(), this.p.eW.ax(), this.p.eW.an(), this.p.eW.R());
        btrm rz2 = this.p.eW.a.rz();
        dxjg.e(rz2);
        aovtVar.au = rz2;
        bvjj rB = this.p.eW.a.rB();
        dxjg.e(rB);
        aovtVar.av = rB;
        Object obj7 = this.R;
        if (obj7 instanceof dxjf) {
            synchronized (obj7) {
                obj2 = this.R;
                if (obj2 instanceof dxjf) {
                    ftt fttVar3 = this.p;
                    obj2 = new gek(fttVar3.a, this.q, fttVar3.cJ());
                    dxjc.d(this.R, obj2);
                    this.R = obj2;
                }
            }
            obj7 = obj2;
        }
        aovtVar.aw = (gek) obj7;
        this.p.wd();
        dxio c3 = dxjc.c(this.p.fy());
        bvrb tn2 = this.p.eW.a.tn();
        dxjg.e(tn2);
        Executor sU3 = this.p.eW.a.sU();
        dxjg.e(sU3);
        aovtVar.ax = anlf.b(c3, tn2, sU3);
    }

    public final aovf<eapy, aogo> b() {
        Object obj;
        Object obj2 = this.r;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.r;
                if (obj instanceof dxjf) {
                    obj = new aovf();
                    dxjc.d(this.r, obj);
                    this.r = obj;
                }
            }
            obj2 = obj;
        }
        return (aovf) obj2;
    }

    public final aovf<aogb, aoge> c() {
        Object obj;
        Object obj2 = this.s;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.s;
                if (obj instanceof dxjf) {
                    obj = new aovf();
                    dxjc.d(this.s, obj);
                    this.s = obj;
                }
            }
            obj2 = obj;
        }
        return (aovf) obj2;
    }

    public final aphj d() {
        return new aphj(this.p.a);
    }

    public final dzsj<aphj> e() {
        dzsj<aphj> dzsjVar = this.t;
        if (dzsjVar == null) {
            fol folVar = new fol(this, 2);
            this.t = folVar;
            return folVar;
        }
        return dzsjVar;
    }

    public final aoxq f() {
        btvo rp = this.p.eW.a.rp();
        dxjg.e(rp);
        return new aoxq(rp);
    }

    public final apjv g() {
        gga wk = this.p.wk();
        anhg aW = this.p.aW();
        dxio c = dxjc.c(this.p.bh());
        apkm dN = this.p.dN();
        dxjg.e(this.p.eW.a.rB());
        this.p.eW.am();
        cpv cpvVar = new cpv();
        this.p.eW.jJ();
        dxjg.e(this.p.eW.a.rp());
        return new apjv(wk, aW, c, dN, cpvVar);
    }

    public final aniz h() {
        dzsj<cjyb> sx = this.p.sx();
        dzsj dzsjVar = this.A;
        if (dzsjVar == null) {
            dzsjVar = new fol(this, 14);
            this.A = dzsjVar;
        }
        dzsj dzsjVar2 = this.B;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fol(this, 15);
            this.B = dzsjVar2;
        }
        return new aniz(sx, dzsjVar, dzsjVar2, this.p.eW.al());
    }

    public final dzsj<anqx> i() {
        dzsj<anqx> dzsjVar = this.E;
        if (dzsjVar == null) {
            fol folVar = new fol(this, 21);
            this.E = folVar;
            return folVar;
        }
        return dzsjVar;
    }

    public final dzsj<anru> j() {
        dzsj<anru> dzsjVar = this.F;
        if (dzsjVar == null) {
            fol folVar = new fol(this, 22);
            this.F = folVar;
            return folVar;
        }
        return dzsjVar;
    }

    public final aoiw k() {
        dzsj dzsjVar = this.H;
        if (dzsjVar == null) {
            dzsjVar = new fol(this, 25);
            this.H = dzsjVar;
        }
        dzsj dzsjVar2 = this.I;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fol(this, 26);
            this.I = dzsjVar2;
        }
        return new aoiw(dzsjVar, dzsjVar2, this.p.eW.m());
    }

    public final dzsj<aoiw> l() {
        dzsj<aoiw> dzsjVar = this.J;
        if (dzsjVar == null) {
            fol folVar = new fol(this, 24);
            this.J = folVar;
            return folVar;
        }
        return dzsjVar;
    }

    public final dzsj<aojq> m() {
        dzsj<aojq> dzsjVar = this.L;
        if (dzsjVar == null) {
            fol folVar = new fol(this, 29);
            this.L = folVar;
            return folVar;
        }
        return dzsjVar;
    }

    public final anrz n() {
        dzsj<btvo> dzsjVar;
        dzsj<gga> ad = this.p.ad();
        dzsj<cqat> K = this.p.eW.K();
        dzsj<angp> jB = this.p.eW.jB();
        dzsj<anhg> aX = this.p.aX();
        dzsj<bbut> bf = this.p.bf();
        dzsj<anqx> i = i();
        dzsj<cjqy> al = this.p.eW.al();
        dzsj<apkf> oD = this.p.eW.oD();
        dzsj<anru> j = j();
        dzsj dzsjVar2 = this.G;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fol(this, 23);
            this.G = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<anpw> ug = this.p.ug();
        dzsj<aoiw> l = l();
        dzsj c = dxjh.c(this.p.az());
        dzsj<btvo> V = this.p.eW.V();
        dzsj<aogw> fx = this.p.eW.fx();
        dzsj<aokw> dM = this.p.dM();
        dzsj dzsjVar4 = this.K;
        if (dzsjVar4 == null) {
            dzsjVar = V;
            dzsjVar4 = new fol(this, 27);
            this.K = dzsjVar4;
        } else {
            dzsjVar = V;
        }
        return new anrz(ad, K, jB, aX, bf, i, al, oD, j, dzsjVar3, ug, l, c, dzsjVar, fx, dM, dzsjVar4, m());
    }

    public final dzsj<anpc> o() {
        dzsj<anpc> dzsjVar = this.M;
        if (dzsjVar == null) {
            fol folVar = new fol(this, 32);
            this.M = folVar;
            return folVar;
        }
        return dzsjVar;
    }
}
