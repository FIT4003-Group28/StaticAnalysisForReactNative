package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fle  reason: default package */
/* loaded from: classes6.dex */
public final class fle implements dxis {
    private volatile dzsj<abfg> A;
    private volatile dzsj<brlk> B;
    private volatile dzsj<bsne> C;
    private volatile dzsj<bsrg> D;
    private volatile dzsj<bsrb> E;
    private volatile dzsj<bsqx> F;
    private volatile dzsj<acfj> G;
    private volatile dzsj<bsrd> H;
    private volatile dzsj<bsqr> I;
    private volatile dzsj<bsri> J;
    private volatile dzsj<ghx> K;
    private volatile dzsj L;
    private volatile dzsj M;
    private volatile dzsj<bmyp> N;
    private volatile dzsj<bmzc> O;
    private volatile dzsj<bdyl> P;
    private volatile dzsj<bsni> Q;
    private volatile dzsj<bsnk> R;
    private volatile dzsj<bsos> S;
    private volatile dzsj<vox> T;
    private volatile dzsj<brbx> U;
    private volatile dzsj<brcf> V;
    private volatile dzsj<brmk> X;
    private volatile dzsj<brns> Y;
    private volatile dzsj<brzx> Z;
    public volatile dzsj<bsng> a;
    private volatile dzsj<brch> aa;
    public volatile dzsj<bsnb> b;
    public volatile dzsj<bsqw> c;
    public volatile dzsj<brmb> d;
    public volatile dzsj<bsql> e;
    public volatile dzsj<bniv> f;
    public volatile dzsj<bniy> g;
    public volatile dzsj<bdwu> h;
    public volatile dzsj<bmyh> i;
    public volatile dzsj<bmyo> j;
    public volatile dzsj<bmlm> k;
    public volatile dzsj<bfle> l;
    public volatile dzsj<beew> m;
    public volatile dzsj<bfhn> n;
    public volatile dzsj<bfhf> o;
    public volatile dzsj<blyj> p;
    public volatile dzsj<bniw> q;
    public volatile dzsj<bfvw> r;
    public volatile dzsj<brbh> s;
    public volatile dzsj<bsre> v;
    final /* synthetic */ ftt x;
    private final bqzm y;
    private volatile dzsj<bsma> z;
    private volatile Object W = new dxjf();
    public volatile Object t = new dxjf();
    public volatile Object u = new dxjf();
    public volatile Object w = new dxjf();

    public fle(ftt fttVar, bqzm bqzmVar) {
        this.x = fttVar;
        this.y = bqzmVar;
    }

    private final dzsj<bsri> g() {
        dzsj<bsri> dzsjVar = this.J;
        if (dzsjVar == null) {
            fld fldVar = new fld(this, 15);
            this.J = fldVar;
            return fldVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bqzm bqzmVar;
        bqzm bqzmVar2 = (bqzm) obj;
        cjqq tp = this.x.eW.a.tp();
        dxjg.e(tp);
        bqzmVar2.aH = tp;
        cjqy tr = this.x.eW.a.tr();
        dxjg.e(tr);
        bqzmVar2.aI = tr;
        bqzmVar2.aJ = dbsg.i(this.x.ap());
        Executor sU = this.x.eW.a.sU();
        dxjg.e(sU);
        bqzmVar2.aK = sU;
        bqzmVar2.aL = new cpv();
        bqzmVar2.aM = dxjc.c(this.x.eW.ie());
        bqzmVar2.aN = dxjc.c(this.x.eW.iU());
        dxjc.c(this.x.lx());
        ftt fttVar = this.x;
        bqzmVar2.b = fttVar.a;
        bqzmVar2.c = fttVar.h();
        bqzmVar2.d = this.x.tz();
        ckcw rU = this.x.eW.a.rU();
        dxjg.e(rU);
        bqzmVar2.e = rU;
        btvo rp = this.x.eW.a.rp();
        dxjg.e(rp);
        bqzmVar2.f = rp;
        btrm rz = this.x.eW.a.rz();
        dxjg.e(rz);
        bqzmVar2.g = rz;
        bqzmVar2.ad = dxjc.c(this.x.av());
        ftt fttVar2 = this.x;
        dzsj dzsjVar = fttVar2.dJ;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar2, 1388);
            fttVar2.dJ = dzsjVar;
        }
        bqzmVar2.ae = dxjc.c(dzsjVar);
        dzsj<brat> mO = this.x.eW.mO();
        dzsj<gga> ad = this.x.ad();
        dzsj<bwqv> er = this.x.eW.er();
        dzsj<aehr> lz = this.x.eW.lz();
        dzsj<aeht> ec = this.x.eW.ec();
        dzsj dzsjVar2 = this.z;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fld(this, 0);
            this.z = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.A;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fld(this, 1);
            this.A = dzsjVar4;
        }
        bqzmVar2.af = new brcb(mO, ad, er, lz, ec, dzsjVar3, dxjh.c(dzsjVar4), dxjh.c(this.x.as()), dxjh.c(this.x.eW.di()), c());
        bqzmVar2.ag = this.x.kp();
        bqzmVar2.ah = this.x.wo();
        bqzmVar2.ai = this.x.cJ();
        bwqv rD = this.x.eW.a.rD();
        dxjg.e(rD);
        bqzmVar2.aj = rD;
        bvrb tn = this.x.eW.a.tn();
        dxjg.e(tn);
        bqzmVar2.ak = tn;
        bqzmVar2.al = this.x.wl();
        bqzmVar2.am = dxjc.c(this.x.fy());
        bqzmVar2.an = dxjc.c(this.x.eW.lz());
        dzsj<Application> m = this.x.eW.m();
        dzsj<brat> mO2 = this.x.eW.mO();
        dzsj<btvo> V = this.x.eW.V();
        dzsj<cqat> K = this.x.eW.K();
        dzsj<ckcw> at = this.x.eW.at();
        dzsj<ckmp> lc = this.x.eW.lc();
        dzsj<cklq> mj = this.x.eW.mj();
        dzsj<btrm> n = this.x.eW.n();
        dzsj<cqg> cS = this.x.cS();
        dzsj c = dxjh.c(this.x.m());
        dzsj<bnjv> pl = this.x.pl();
        dzsj dzsjVar5 = this.C;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fld(this, 3);
            this.C = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.D;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fld(this, 6);
            this.D = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj dzsjVar9 = this.E;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fld(this, 8);
            this.E = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj<brwl> uk = this.x.uk();
        dzsj<aeht> ec2 = this.x.eW.ec();
        dzsj dzsjVar11 = this.F;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fld(this, 9);
            this.F = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj c2 = dxjh.c(this.x.eW.dT());
        dzsj c3 = dxjh.c(this.x.aX());
        dzsj c4 = dxjh.c(this.x.pL());
        dzsj<cqhn> il = this.x.eW.il();
        dzsj<jjm> kI = this.x.kI();
        dzsj dzsjVar13 = this.G;
        if (dzsjVar13 == null) {
            dzsjVar13 = new fld(this, 10);
            this.G = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj lk = this.x.eW.lk();
        ftt fttVar3 = this.x;
        dzsj dzsjVar15 = fttVar3.dK;
        if (dzsjVar15 == null) {
            bqzmVar = bqzmVar2;
            dzsjVar15 = new fns(fttVar3, 1389);
            fttVar3.dK = dzsjVar15;
        } else {
            bqzmVar = bqzmVar2;
        }
        dzsj dzsjVar16 = dzsjVar15;
        dzsj dzsjVar17 = this.H;
        if (dzsjVar17 == null) {
            dzsjVar17 = new fld(this, 11);
            this.H = dzsjVar17;
        }
        dzsj dzsjVar18 = dzsjVar17;
        dzsj dzsjVar19 = this.I;
        if (dzsjVar19 == null) {
            dzsjVar19 = new fld(this, 14);
            this.I = dzsjVar19;
        }
        bqzm bqzmVar3 = bqzmVar;
        bqzmVar3.ao = new bssf(m, mO2, V, K, at, lc, mj, n, cS, c, pl, dzsjVar6, dzsjVar8, dzsjVar10, uk, ec2, dzsjVar12, c2, c3, c4, il, kI, dzsjVar14, lk, dzsjVar16, dzsjVar18, dzsjVar19, this.x.eW.kb(), this.x.eW.Q(), this.x.eW.al(), this.x.eQ(), c());
        bqzmVar3.ap = dxjc.c(this.x.tA());
        ckmm r = this.x.eW.a.r();
        dxjg.e(r);
        bqzmVar3.aq = r;
        bqzmVar3.ar = new bsrm(this.x.tr(), this.x.eW.il(), dxjh.c(this.x.gb()), g(), dxjh.c(this.x.m()));
        bqzmVar3.as = new iwh(this.x.ad(), this.x.kI(), this.x.eW.V());
        ftt fttVar4 = this.x;
        dzsj<rb> dzsjVar20 = fttVar4.eV;
        dzsj<Application> m2 = fttVar4.eW.m();
        dzsj<cqhn> il2 = this.x.eW.il();
        dzsj<btrm> n2 = this.x.eW.n();
        dzsj<btvo> V2 = this.x.eW.V();
        ftt fttVar5 = this.x;
        dzsj dzsjVar21 = fttVar5.dL;
        if (dzsjVar21 == null) {
            dzsjVar21 = new fns(fttVar5, 1390);
            fttVar5.dL = dzsjVar21;
        }
        dzsj dzsjVar22 = dzsjVar21;
        dzsj dzsjVar23 = this.K;
        if (dzsjVar23 == null) {
            dzsjVar23 = new fld(this, 16);
            this.K = dzsjVar23;
        }
        dzsj dzsjVar24 = dzsjVar23;
        dzsj<alhv> iR = this.x.eW.iR();
        dzsj<cqkj> y = this.x.y();
        dzsj<cjqy> al = this.x.eW.al();
        dzsj<cjqq> hN = this.x.eW.hN();
        dzsj<brat> mO3 = this.x.eW.mO();
        dzsj<ckmp> lc2 = this.x.eW.lc();
        dzsj dzsjVar25 = this.L;
        if (dzsjVar25 == null) {
            dzsjVar25 = new fld(this, 17);
            this.L = dzsjVar25;
        }
        dzsj dzsjVar26 = dzsjVar25;
        dzsj dzsjVar27 = this.M;
        if (dzsjVar27 == null) {
            dzsjVar27 = new fld(this, 18);
            this.M = dzsjVar27;
        }
        dzsj dzsjVar28 = dzsjVar27;
        dzsj c5 = dxjh.c(this.x.aK());
        dzsj c6 = dxjh.c(this.x.as());
        dzsj<gle> dF = this.x.dF();
        dzsj dzsjVar29 = this.P;
        if (dzsjVar29 == null) {
            dzsjVar29 = new fld(this, 19);
            this.P = dzsjVar29;
        }
        bqzmVar3.at = new bsoj(dzsjVar20, m2, il2, n2, V2, dzsjVar22, dzsjVar24, iR, y, al, hN, mO3, lc2, dzsjVar26, dzsjVar28, c5, c6, dF, dzsjVar29, dxjh.c(this.x.vd()), dxjh.c(this.x.ez()), c(), this.x.uD());
        dzsj c7 = dxjh.c(this.x.cV());
        fyu fyuVar = this.x.eW;
        dzsj dzsjVar30 = fyuVar.dL;
        if (dzsjVar30 == null) {
            dzsjVar30 = new fxy(fyuVar, 718);
            fyuVar.dL = dzsjVar30;
        }
        dzsj dzsjVar31 = dzsjVar30;
        dzsj dzsjVar32 = this.Q;
        if (dzsjVar32 == null) {
            dzsjVar32 = new fld(this, 35);
            this.Q = dzsjVar32;
        }
        dzsj dzsjVar33 = dzsjVar32;
        dzsj dzsjVar34 = this.R;
        if (dzsjVar34 == null) {
            dzsjVar34 = new fld(this, 36);
            this.R = dzsjVar34;
        }
        dzsj dzsjVar35 = dzsjVar34;
        dzsj<efg> lN = this.x.lN();
        dzsj<brat> mO4 = this.x.eW.mO();
        dzsj<ckmp> lc3 = this.x.eW.lc();
        dzsj<acyp> ik = this.x.eW.ik();
        dzsj dzsjVar36 = this.S;
        if (dzsjVar36 == null) {
            dzsjVar36 = new fld(this, 37);
            this.S = dzsjVar36;
        }
        bqzmVar3.au = new brad(c7, dzsjVar31, dzsjVar33, dzsjVar35, lN, mO4, lc3, ik, dzsjVar36, c());
        bqzmVar3.av = new bsrq(this.x.eW.il(), g());
        ftt fttVar6 = this.x;
        dzsj<rb> dzsjVar37 = fttVar6.eV;
        dzsj c8 = dxjh.c(fttVar6.av());
        dzsj dzsjVar38 = this.T;
        if (dzsjVar38 == null) {
            dzsjVar38 = new fld(this, 38);
            this.T = dzsjVar38;
        }
        dzsj dzsjVar39 = dzsjVar38;
        dzsj<crzb> jv = this.x.eW.jv();
        dzsj<akox> as = this.x.as();
        dzsj<gle> dF2 = this.x.dF();
        dzsj dzsjVar40 = this.U;
        if (dzsjVar40 == null) {
            dzsjVar40 = new fld(this, 39);
            this.U = dzsjVar40;
        }
        dzsj dzsjVar41 = dzsjVar40;
        dzsj dzsjVar42 = this.V;
        if (dzsjVar42 == null) {
            dzsjVar42 = new fld(this, 41);
            this.V = dzsjVar42;
        }
        bqzmVar3.aw = new brck(dzsjVar37, c8, dzsjVar39, jv, as, dF2, dzsjVar41, dzsjVar42, this.x.aK(), this.x.eW.al(), c());
        bqzmVar3.ax = new brme(this.x.fN(), this.x.eV);
        new bxbe(this.x.da(), this.x.eW.V(), dxjh.c(this.x.ic()));
        this.x.ap();
        bqzmVar3.ay = this.x.eW.ll();
        dzsj<brmk> dzsjVar43 = this.X;
        if (dzsjVar43 == null) {
            dzsjVar43 = new fld<>(this, 42);
            this.X = dzsjVar43;
        }
        bqzmVar3.az = dzsjVar43;
        if (this.Y == null) {
            this.Y = new fld(this, 43);
        }
        bqzmVar3.aA = f();
        bqzmVar3.aB = this.x.lz();
        bqzmVar3.aC = this.x.eW.io();
        bqzmVar3.aO = dxjc.c(this.x.ko());
        bqzmVar3.aP = dxjc.c(this.x.cu());
        bqzmVar3.aQ = new bsop();
        bqzmVar3.aR = this.x.gi();
        dzsj<bskt> rY = this.x.rY();
        dzsj<aehr> lz2 = this.x.eW.lz();
        dzsj dzsjVar44 = this.Z;
        if (dzsjVar44 == null) {
            dzsjVar44 = new fld(this, 44);
            this.Z = dzsjVar44;
        }
        bqzmVar3.aS = new brze(rY, lz2, dzsjVar44, this.x.eW.il());
        bqzmVar3.aT = new ckmu(this.x.eW.lK(), this.x.eW.K(), this.x.eW.pj());
        dzsj dzsjVar45 = this.aa;
        if (dzsjVar45 == null) {
            dzsjVar45 = new fld(this, 45);
            this.aa = dzsjVar45;
        }
        bqzmVar3.aU = dxjc.c(dzsjVar45);
        dehp tl = this.x.eW.a.tl();
        dxjg.e(tl);
        bqzmVar3.aV = tl;
        Executor sU2 = this.x.eW.a.sU();
        dxjg.e(sU2);
        bqzmVar3.aW = sU2;
    }

    public final brlk b() {
        return this.y.bt();
    }

    public final dzsj<brlk> c() {
        dzsj<brlk> dzsjVar = this.B;
        if (dzsjVar == null) {
            fld fldVar = new fld(this, 2);
            this.B = fldVar;
            return fldVar;
        }
        return dzsjVar;
    }

    public final dzsj<bmyp> d() {
        dzsj<bmyp> dzsjVar = this.N;
        if (dzsjVar == null) {
            fld fldVar = new fld(this, 24);
            this.N = fldVar;
            return fldVar;
        }
        return dzsjVar;
    }

    public final dzsj<bmzc> e() {
        dzsj<bmzc> dzsjVar = this.O;
        if (dzsjVar == null) {
            fld fldVar = new fld(this, 25);
            this.O = fldVar;
            return fldVar;
        }
        return dzsjVar;
    }

    public final brpk f() {
        Object obj;
        Object obj2 = this.W;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.W;
                if (obj instanceof dxjf) {
                    Application a = this.x.eW.a.a();
                    dxjg.e(a);
                    btvo rp = this.x.eW.a.rp();
                    dxjg.e(rp);
                    akox ap = this.x.ap();
                    brpd U = this.x.U();
                    ckcw rU = this.x.eW.a.rU();
                    dxjg.e(rU);
                    brat ll = this.x.eW.ll();
                    dehq tg = this.x.eW.a.tg();
                    dxjg.e(tg);
                    obj = new brpk(a, rp, ap, U, rU, ll, tg);
                    dxjc.d(this.W, obj);
                    this.W = obj;
                }
            }
            obj2 = obj;
        }
        return (brpk) obj2;
    }
}
