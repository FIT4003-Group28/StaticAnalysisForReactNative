package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: evm  reason: default package */
/* loaded from: classes.dex */
public final class evm implements dxis {
    public volatile dzsj<adwz> A;
    public volatile dzsj<adxu> B;
    public volatile dzsj<adxz> C;
    public volatile dzsj<adwb> D;
    public volatile dzsj<bfcn> E;
    public volatile dzsj<adwg> F;
    public volatile dzsj<adwj> G;
    public volatile dzsj<adyw> H;
    public volatile dzsj<abhx> I;
    public final dzsj<acyf> J;
    final /* synthetic */ ftt K;
    public volatile abtz L;
    private volatile dzsj<adyg> M;
    private volatile dzsj<adxf> N;
    private volatile dzsj<adxh> O;
    private volatile dzsj P;
    private volatile dzsj<adwv> Q;
    private volatile dzsj<aebl> R;
    private volatile dzsj<aebg> S;
    private volatile Object T = new dxjf();
    private volatile Object U = new dxjf();
    private volatile Object V = new dxjf();
    private volatile dzsj<awrc> W;
    private volatile dzsj<ish> X;
    private volatile dzsj<acyy> Y;
    private volatile dzsj<aeef> Z;
    public volatile dzsj<addd> a;
    private volatile dzsj<aeei> aa;
    private volatile dzsj<gcs> ab;
    private volatile dzsj<aeem> ac;
    private volatile dzsj<aeek> ad;
    private volatile dzsj<gcr> ae;
    private volatile dzsj<gcn> af;
    private volatile dzsj<aefj> ag;
    public volatile dzsj<abus> b;
    public volatile dzsj<adfb> c;
    public volatile dzsj<adeu> d;
    public volatile dzsj<adal> e;
    public volatile dzsj<adgm> f;
    public volatile dzsj<adka> g;
    public volatile dzsj<adan> h;
    public volatile dzsj<adec> i;
    public volatile dzsj<adhs> j;
    public volatile dzsj<adhn> k;
    public volatile dzsj<adxl> l;
    public volatile dzsj<adwp> m;
    public volatile dzsj<ahha> n;
    public volatile dzsj<ahfo> o;
    public volatile dzsj<ahds> p;
    public volatile dzsj<adws> q;
    public volatile dzsj<adxc> r;
    public volatile dzsj<adxr> s;
    public volatile dzsj<adxp> t;
    public volatile dzsj<adyf> u;
    public volatile dzsj<advx> v;
    public volatile dzsj<advz> w;
    public volatile dzsj<advv> x;
    public volatile bvan y;
    public volatile dzsj<bvan> z;

    public evm(ftt fttVar, acyf acyfVar) {
        this.K = fttVar;
        this.J = dxjd.b(acyfVar);
    }

    private final aeet m() {
        Object obj;
        Object obj2 = this.T;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.T;
                if (obj instanceof dxjf) {
                    aecy N = this.K.N();
                    dzsj dzsjVar = this.R;
                    if (dzsjVar == null) {
                        dzsjVar = new evl(this, 0);
                        this.R = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.S;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new evl(this, 40);
                        this.S = dzsjVar2;
                    }
                    dxio c2 = dxjc.c(dzsjVar2);
                    dxio c3 = dxjc.c(this.K.fy());
                    dxio c4 = dxjc.c(this.K.v());
                    cjqy tr = this.K.eW.a.tr();
                    dxjg.e(tr);
                    adza fk = this.K.eW.fk();
                    cjqq tp = this.K.eW.a.tp();
                    dxjg.e(tp);
                    obj = new aeet(N, c, c2, c3, c4, tr, fk, tp);
                    dxjc.d(this.T, obj);
                    this.T = obj;
                }
            }
            obj2 = obj;
        }
        return (aeet) obj2;
    }

    private final aefg n() {
        Object obj;
        Object obj2 = this.U;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.U;
                if (obj instanceof dxjf) {
                    ftt fttVar = this.K;
                    rb rbVar = fttVar.a;
                    abfa dJ = fttVar.eW.dJ();
                    aecy N = this.K.N();
                    aeet m = m();
                    cqkj wl = this.K.wl();
                    cqhn cqhnVar = new cqhn();
                    adza fk = this.K.eW.fk();
                    ftt fttVar2 = this.K;
                    aefa aefaVar = new aefa(fttVar2.eV, fttVar2.eW.mq(), this.K.eW.ij());
                    ckcw rU = this.K.eW.a.rU();
                    dxjg.e(rU);
                    btvo rp = this.K.eW.a.rp();
                    dxjg.e(rp);
                    amfi qp = this.K.eW.qp();
                    cjqy tr = this.K.eW.a.tr();
                    dxjg.e(tr);
                    obj = new aefg(rbVar, dJ, N, m, wl, cqhnVar, fk, aefaVar, rU, rp, qp, tr);
                    dxjc.d(this.U, obj);
                    this.U = obj;
                }
            }
            obj2 = obj;
        }
        return (aefg) obj2;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        acyf acyfVar = (acyf) obj;
        acyfVar.bw = this.K.kt();
        acyfVar.a = n();
        acyfVar.b = this.K.K();
        acyfVar.c = m();
        acyfVar.d = this.K.wq();
        cqat rR = this.K.eW.a.rR();
        dxjg.e(rR);
        acyfVar.e = rR;
        acyfVar.f = dxjc.c(this.K.eW.n());
        Executor sU = this.K.eW.a.sU();
        dxjg.e(sU);
        acyfVar.g = sU;
        acyfVar.ad = dxjc.c(this.K.eW.iR());
        Object obj4 = this.V;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj3 = this.V;
                if (obj3 instanceof dxjf) {
                    obj3 = new adyx();
                    dxjc.d(this.V, obj3);
                    this.V = obj3;
                }
            }
            obj4 = obj3;
        }
        acyfVar.bt = (adyx) obj4;
        acyfVar.ae = this.K.gd();
        acyfVar.af = dxjc.c(this.K.fy());
        acyfVar.ag = this.K.eW.mN();
        bvkx o = this.K.eW.a.o();
        dxjg.e(o);
        acyfVar.ah = o;
        acyfVar.ai = dxjc.c(this.K.v());
        ftt fttVar = this.K;
        acyfVar.aj = new ivt(fttVar.eV, dxjh.c(fttVar.H()), this.K.eW.ik(), this.K.aV());
        btvo rp = this.K.eW.a.rp();
        dxjg.e(rp);
        acyfVar.ak = rp;
        acyfVar.al = this.K.eW.fk();
        bvjj rB = this.K.eW.a.rB();
        dxjg.e(rB);
        acyfVar.am = rB;
        acyfVar.an = dxjc.c(this.K.cF());
        acyfVar.ao = this.K.lz();
        dzsj dzsjVar = this.X;
        if (dzsjVar == null) {
            dzsjVar = new evl(this, 41);
            this.X = dzsjVar;
        }
        acyfVar.ap = dxjc.c(dzsjVar);
        acyfVar.aq = this.K.F();
        acyfVar.ar = new acwx(this.K.eW.m(), this.K.eW.aw(), this.K.eW.di(), this.K.eW.at());
        acyfVar.as = dxjc.c(this.K.cV());
        ftt fttVar2 = this.K;
        dzsj dzsjVar2 = fttVar2.cI;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fns(fttVar2, 1307);
            fttVar2.cI = dzsjVar2;
        }
        acyfVar.at = dxjc.c(dzsjVar2);
        ftt fttVar3 = this.K;
        rb rbVar = fttVar3.a;
        bvnx rS = fttVar3.eW.a.rS();
        dxjg.e(rS);
        dxio c = dxjc.c(this.K.as());
        btrm rz = this.K.eW.a.rz();
        dxjg.e(rz);
        Executor sU2 = this.K.eW.a.sU();
        dxjg.e(sU2);
        Executor sV = this.K.eW.a.sV();
        dxjg.e(sV);
        acyfVar.au = new acyn(rbVar, rS, c, rz, sU2, sV);
        acyfVar.av = dxjc.c(this.K.eW.al());
        acyfVar.aw = dxjc.c(this.K.rx());
        acyfVar.ax = new adzz(dxjh.c(this.K.eW.kR()), dxjh.c(this.K.as()), dxjh.c(this.K.eW.k()), this.K.eW.o());
        dzsj dzsjVar3 = this.Y;
        if (dzsjVar3 == null) {
            dzsjVar3 = new evl(this, 43);
            this.Y = dzsjVar3;
        }
        acyfVar.ay = dxjc.c(dzsjVar3);
        dzsj dzsjVar4 = this.Z;
        if (dzsjVar4 == null) {
            dzsjVar4 = new evl(this, 44);
            this.Z = dzsjVar4;
        }
        acyfVar.az = dxjc.c(dzsjVar4);
        dzsj dzsjVar5 = this.aa;
        if (dzsjVar5 == null) {
            dzsjVar5 = new evl(this, 45);
            this.aa = dzsjVar5;
        }
        acyfVar.aA = dxjc.c(dzsjVar5);
        dzsj dzsjVar6 = this.ab;
        if (dzsjVar6 == null) {
            dzsjVar6 = new evl(this, 46);
            this.ab = dzsjVar6;
        }
        acyfVar.aB = dxjc.c(dzsjVar6);
        dzsj dzsjVar7 = this.ac;
        if (dzsjVar7 == null) {
            dzsjVar7 = new evl(this, 47);
            this.ac = dzsjVar7;
        }
        acyfVar.aC = dxjc.c(dzsjVar7);
        dzsj dzsjVar8 = this.ad;
        if (dzsjVar8 == null) {
            dzsjVar8 = new evl(this, 48);
            this.ad = dzsjVar8;
        }
        acyfVar.aD = dxjc.c(dzsjVar8);
        acyfVar.aE = dxjc.c(this.K.eW.im());
        acyfVar.aF = dxjc.c(this.K.eW.at());
        acyfVar.aG = (acxe) this.K.E();
        acyfVar.aH = dxjc.c(this.K.ub());
        acyfVar.aI = dxjc.c(this.K.cD());
        acyfVar.aJ = this.K.wl();
        acyfVar.aK = this.K.eW.bW();
        acyfVar.aL = dxjc.c(this.K.rH());
        dzsj dzsjVar9 = this.ae;
        if (dzsjVar9 == null) {
            dzsjVar9 = new evl(this, 49);
            this.ae = dzsjVar9;
        }
        acyfVar.aM = dxjc.c(dzsjVar9);
        acyfVar.aN = dxjc.c(this.K.bH());
        acyfVar.aO = dxjc.c(this.K.gW());
        acyfVar.bu = this.K.eW.jf();
        acyfVar.aP = this.K.wr();
        acyfVar.aQ = this.K.fu();
        fyu fyuVar = this.K.eW;
        Object obj5 = fyuVar.dw;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj2 = fyuVar.dw;
                if (obj2 instanceof dxjf) {
                    Executor sV2 = fyuVar.a.sV();
                    dxjg.e(sV2);
                    dxio c2 = dxjc.c(fyuVar.on());
                    btvo rp2 = fyuVar.a.rp();
                    dxjg.e(rp2);
                    bvkx o2 = fyuVar.a.o();
                    dxjg.e(o2);
                    ckcw rU = fyuVar.a.rU();
                    dxjg.e(rU);
                    obj2 = new bxrw(sV2, c2, rp2, o2, rU);
                    dxjc.d(fyuVar.dw, obj2);
                    fyuVar.dw = obj2;
                }
            }
            obj5 = obj2;
        }
        acyfVar.aR = (bxrw) obj5;
        dzsj dzsjVar10 = this.af;
        if (dzsjVar10 == null) {
            dzsjVar10 = new evl(this, 50);
            this.af = dzsjVar10;
        }
        acyfVar.aS = dxjc.c(dzsjVar10);
        acyfVar.aT = dxjc.c(this.K.eW.mq());
        dzsj dzsjVar11 = this.ag;
        if (dzsjVar11 == null) {
            dzsjVar11 = new evl(this, 51);
            this.ag = dzsjVar11;
        }
        acyfVar.aU = dxjc.c(dzsjVar11);
        acyfVar.aV = this.K.eW.mY();
    }

    public final addd b() {
        return new addd(dxjh.c(this.K.aK()), dxjh.c(this.K.aP()), this.K.pC(), this.K.eW.ij(), this.K.eV);
    }

    public final adec c() {
        abfa dJ = this.K.eW.dJ();
        adza fk = this.K.eW.fk();
        cpv cpvVar = new cpv();
        cqat rR = this.K.eW.a.rR();
        dxjg.e(rR);
        bvjj rB = this.K.eW.a.rB();
        dxjg.e(rB);
        return new adec(dJ, fk, new adef(cpvVar, rR, rB, new cqhn(), dxjc.c(this.K.aK()), this.K.pG(), this.K.wk(), dxjc.c(this.K.eW.p()), dxjc.c(this.K.m())));
    }

    public final dzsj<adyg> d() {
        dzsj<adyg> dzsjVar = this.M;
        if (dzsjVar == null) {
            evl evlVar = new evl(this, 16);
            this.M = evlVar;
            return evlVar;
        }
        return dzsjVar;
    }

    public final dzsj<adxf> e() {
        dzsj<adxf> dzsjVar = this.N;
        if (dzsjVar == null) {
            evl evlVar = new evl(this, 15);
            this.N = evlVar;
            return evlVar;
        }
        return dzsjVar;
    }

    public final dzsj<adxh> f() {
        dzsj<adxh> dzsjVar = this.O;
        if (dzsjVar == null) {
            evl evlVar = new evl(this, 18);
            this.O = evlVar;
            return evlVar;
        }
        return dzsjVar;
    }

    public final dzsj g() {
        dzsj dzsjVar = this.P;
        if (dzsjVar == null) {
            evl evlVar = new evl(this, 28);
            this.P = evlVar;
            return evlVar;
        }
        return dzsjVar;
    }

    public final advv h() {
        ftt fttVar = this.K;
        return new advv(fttVar.eV, fttVar.av(), this.K.eW.fd(), this.K.aJ(), this.K.bf(), g());
    }

    public final dzsj<adwv> i() {
        dzsj<adwv> dzsjVar = this.Q;
        if (dzsjVar == null) {
            evl evlVar = new evl(this, 34);
            this.Q = evlVar;
            return evlVar;
        }
        return dzsjVar;
    }

    public final aeba j() {
        return new aeba(this.K.eW.at());
    }

    public final ish k() {
        dxio c = dxjc.c(this.K.eW.im());
        dxio c2 = dxjc.c(this.K.eW.fp());
        dzsj dzsjVar = this.W;
        if (dzsjVar == null) {
            dzsjVar = new evl(this, 42);
            this.W = dzsjVar;
        }
        return new ish(c, c2, dxjc.c(dzsjVar));
    }

    public final acyy l() {
        ftt fttVar = this.K;
        rb rbVar = fttVar.a;
        adza fk = fttVar.eW.fk();
        dxio c = dxjc.c(this.K.eW.p());
        cqkj wl = this.K.wl();
        bvjj rB = this.K.eW.a.rB();
        dxjg.e(rB);
        adza fk2 = this.K.eW.fk();
        cqhn cqhnVar = new cqhn();
        aefg n = n();
        ftt fttVar2 = this.K;
        aczi acziVar = new aczi(fttVar2.eV, dxjh.c(fttVar2.H()));
        aczg aczgVar = new aczg(this.K.as(), this.K.rA(), this.K.ad(), this.K.lN(), this.K.pC(), this.K.eW.mj());
        ftt fttVar3 = this.K;
        return new acyy(rbVar, fk, c, wl, new aczd(rB, fk2, cqhnVar, n, acziVar, aczgVar, new aczj(fttVar3.a, dxjc.c(fttVar3.rr()), this.K.lz())));
    }
}
