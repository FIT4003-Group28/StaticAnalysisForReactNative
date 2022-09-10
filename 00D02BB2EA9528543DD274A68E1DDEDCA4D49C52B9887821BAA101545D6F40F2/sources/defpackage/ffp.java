package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ffp  reason: default package */
/* loaded from: classes6.dex */
public final class ffp implements dxis {
    public volatile dzsj<beew> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<gcr> c;
    private volatile dzsj<bkfe> d;
    private volatile dzsj<vox> e;
    private volatile dzsj<brrr> f;
    private volatile dzsj<bhlk> g;
    private volatile dzsj<begx> h;
    private volatile dzsj<bniv> i;
    private volatile dzsj<bniy> j;
    private volatile dzsj<bdwu> k;
    private volatile dzsj<bmyp> l;
    private volatile dzsj<bmzc> m;
    private volatile dzsj<bmyh> n;
    private volatile dzsj<bmyo> o;
    private volatile dzsj<bmlm> p;
    private volatile dzsj<bfle> q;
    private volatile dzsj<bfhn> r;
    private volatile dzsj<bfhf> s;
    private volatile dzsj<blyj> t;
    private volatile dzsj<bniw> u;
    private volatile dzsj<bfvw> v;
    private volatile dzsj<brbh> w;

    public ffp(ftt fttVar) {
        this.b = fttVar;
    }

    private final dzsj<vox> d() {
        dzsj<vox> dzsjVar = this.e;
        if (dzsjVar == null) {
            ffo ffoVar = new ffo(this, 2);
            this.e = ffoVar;
            return ffoVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        bdyb bdybVar = (bdyb) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bdybVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bdybVar.aI = tr;
        bdybVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bdybVar.aK = sU;
        bdybVar.aL = new cpv();
        bdybVar.aM = dxjc.c(this.b.eW.ie());
        bdybVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        cztz m = this.b.eW.a.m();
        dxjg.e(m);
        bdybVar.a = m;
        ftt fttVar = this.b;
        bdybVar.b = fttVar.a;
        bdybVar.c = fttVar.eW.bW();
        ftt fttVar2 = this.b;
        Object obj6 = fttVar2.de;
        if (obj6 instanceof dxjf) {
            synchronized (obj6) {
                obj5 = fttVar2.de;
                if (obj5 instanceof dxjf) {
                    obj5 = new abfn(fttVar2.a, fttVar2.B(), dxjc.c(fttVar2.eW.im()), dxjc.c(fttVar2.eW.hN()), dxjc.c(fttVar2.eW.mq()));
                    dxjc.d(fttVar2.de, obj5);
                    fttVar2.de = obj5;
                }
            }
            obj6 = obj5;
        }
        bdybVar.d = (abfn) obj6;
        bdybVar.e = new bnir(this.b.ad());
        bdybVar.f = this.b.wm();
        bdybVar.g = this.b.lz();
        ckcw rU = this.b.eW.a.rU();
        dxjg.e(rU);
        bdybVar.ad = rU;
        btvo rp = this.b.eW.a.rp();
        dxjg.e(rp);
        bdybVar.ae = rp;
        ftt fttVar3 = this.b;
        bdybVar.af = new ivt(fttVar3.eV, dxjh.c(fttVar3.H()), this.b.eW.ik(), this.b.aV());
        bdybVar.ag = this.b.sp();
        bdybVar.ah = this.b.wd();
        btrm rz = this.b.eW.a.rz();
        dxjg.e(rz);
        bdybVar.ai = rz;
        dxjg.e(this.b.eW.a.rB());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bdybVar.aj = rD;
        bwqv rD2 = this.b.eW.a.rD();
        dxjg.e(rD2);
        bdybVar.ak = rD2;
        bdybVar.al = this.b.eW.ee();
        bdybVar.am = this.b.pj();
        bdybVar.an = this.b.eW.qe();
        ftt fttVar4 = this.b;
        Object obj7 = fttVar4.df;
        if (obj7 instanceof dxjf) {
            synchronized (obj7) {
                obj4 = fttVar4.df;
                if (obj4 instanceof dxjf) {
                    obj4 = new aeop(dxjc.c(fttVar4.eW.lz()), dxjc.c(fttVar4.as()));
                    dxjc.d(fttVar4.df, obj4);
                    fttVar4.df = obj4;
                }
            }
            obj7 = obj4;
        }
        bdybVar.ao = (aeop) obj7;
        fyu fyuVar = this.b.eW;
        btvo rp2 = fyuVar.a.rp();
        dxjg.e(rp2);
        aehr ee = fyuVar.ee();
        aeht qe = fyuVar.qe();
        buwi buwiVar = fyuVar.eL;
        if (buwiVar == null) {
            dxio c = dxjc.c(fyuVar.h());
            bvrb tn = fyuVar.a.tn();
            dxjg.e(tn);
            buwiVar = new buwi(new buwh(c, tn));
            fyuVar.eL = buwiVar;
        }
        bdybVar.cf = new aehb(rp2, ee, qe, buwiVar);
        bdybVar.ap = this.b.wg();
        bdybVar.aq = this.b.eW.io();
        bdybVar.ar = dxjc.c(this.b.eS());
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new ffo(this, 0);
            this.c = dzsjVar;
        }
        bdybVar.as = dxjc.c(dzsjVar);
        bdybVar.at = dxjc.c(this.b.eW.mq());
        bdybVar.au = dxjc.c(this.b.av());
        dxjc.c(this.b.fy());
        bdybVar.av = dxjc.c(this.b.ef());
        bdybVar.aw = dxjc.c(this.b.cV());
        bdybVar.ax = dxjc.c(this.b.cA());
        bdybVar.ay = dxjc.c(this.b.tA());
        bdybVar.az = dxjc.c(this.b.cb());
        bdybVar.aA = dxjc.c(this.b.fY());
        bdybVar.aB = dxjc.c(this.b.az());
        bdybVar.aC = dxjc.c(this.b.eW.lY());
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ffo(this, 1);
            this.d = dzsjVar2;
        }
        bdybVar.aO = dxjc.c(dzsjVar2);
        dxjc.c(this.b.eW.mO());
        bdybVar.aP = dxjc.c(this.b.ge());
        bdybVar.aQ = dxjc.c(this.b.aK());
        bdybVar.aR = dxjc.c(this.b.eW.im());
        akfa rK = this.b.eW.a.rK();
        dxjg.e(rK);
        bdybVar.aS = rK;
        bdybVar.aT = this.b.ap();
        bdybVar.aU = this.b.eW.rV();
        bdybVar.aV = this.b.eW.sr();
        bdybVar.aW = this.b.bM();
        bdybVar.aX = this.b.fp();
        ckcw rU2 = this.b.eW.a.rU();
        dxjg.e(rU2);
        bdybVar.aY = new bgql(rU2);
        this.b.fN();
        this.b.eW.V();
        this.b.eW.ry();
        this.b.eW.jm();
        this.b.H();
        this.b.eW.n();
        this.b.as();
        ftt fttVar5 = this.b;
        if (fttVar5.dg == null) {
            fttVar5.dg = new fns(fttVar5, 1345);
        }
        this.b.bF();
        d();
        this.b.eW.al();
        this.b.B();
        dxjc.c(this.b.eW.im());
        this.b.wk();
        dxjc.c(this.b.eW.al());
        dxjc.c(this.b.eW.hN());
        dxjg.e(this.b.eW.a.rp());
        bdybVar.aZ = this.b.tz();
        bdybVar.ba = this.b.kO();
        bdybVar.cd = (bdwl) this.b.sr();
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ffo(this, 3);
            this.f = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj<btrm> n = this.b.eW.n();
        dzsj c2 = dxjh.c(this.b.cH());
        ftt fttVar6 = this.b;
        dzsj dzsjVar5 = fttVar6.dn;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fns(fttVar6, 1352);
            fttVar6.dn = dzsjVar5;
        }
        dzsj c3 = dxjh.c(dzsjVar5);
        dzsj dzsjVar6 = this.g;
        if (dzsjVar6 == null) {
            dzsjVar6 = new ffo(this, 4);
            this.g = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.h;
        if (dzsjVar8 == null) {
            dzsjVar8 = new ffo(this, 5);
            this.h = dzsjVar8;
        }
        bdybVar.bb = new bdye(dzsjVar4, n, c2, c3, dzsjVar7, dzsjVar8, this.b.kI(), this.b.sN(), this.b.eW.lY(), this.b.eS());
        bdybVar.bc = this.b.sM();
        bdybVar.bd = this.b.bB();
        bdybVar.be = new bgqo(this.b.eW.V());
        dzsj<gga> ad = this.b.ad();
        dzsj<btrm> n2 = this.b.eW.n();
        dzsj<beht> sm = this.b.sm();
        dzsj<behw> uF = this.b.uF();
        dzsj dzsjVar9 = this.i;
        if (dzsjVar9 == null) {
            dzsjVar9 = new ffo(this, 6);
            this.i = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.j;
        if (dzsjVar11 == null) {
            dzsjVar11 = new ffo(this, 7);
            this.j = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj dzsjVar13 = this.k;
        if (dzsjVar13 == null) {
            dzsjVar13 = new ffo(this, 8);
            this.k = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.n;
        if (dzsjVar15 == null) {
            dzsjVar15 = new ffo(this, 9);
            this.n = dzsjVar15;
        }
        dzsj dzsjVar16 = dzsjVar15;
        dzsj dzsjVar17 = this.o;
        if (dzsjVar17 == null) {
            dzsjVar17 = new ffo(this, 12);
            this.o = dzsjVar17;
        }
        dzsj dzsjVar18 = dzsjVar17;
        dzsj dzsjVar19 = this.p;
        if (dzsjVar19 == null) {
            dzsjVar19 = new ffo(this, 13);
            this.p = dzsjVar19;
        }
        dzsj dzsjVar20 = dzsjVar19;
        dzsj dzsjVar21 = this.q;
        if (dzsjVar21 == null) {
            dzsjVar21 = new ffo(this, 14);
            this.q = dzsjVar21;
        }
        dzsj dzsjVar22 = dzsjVar21;
        dzsj dzsjVar23 = this.r;
        if (dzsjVar23 == null) {
            dzsjVar23 = new ffo(this, 15);
            this.r = dzsjVar23;
        }
        dzsj dzsjVar24 = dzsjVar23;
        dzsj<bfhu> sR = this.b.sR();
        dzsj dzsjVar25 = this.s;
        if (dzsjVar25 == null) {
            dzsjVar25 = new ffo(this, 17);
            this.s = dzsjVar25;
        }
        dzsj dzsjVar26 = dzsjVar25;
        dzsj dzsjVar27 = this.t;
        if (dzsjVar27 == null) {
            dzsjVar27 = new ffo(this, 18);
            this.t = dzsjVar27;
        }
        dzsj dzsjVar28 = dzsjVar27;
        dzsj dzsjVar29 = this.u;
        if (dzsjVar29 == null) {
            dzsjVar29 = new ffo(this, 19);
            this.u = dzsjVar29;
        }
        dzsj dzsjVar30 = dzsjVar29;
        dzsj<bfgy> uL = this.b.uL();
        dzsj<bfea> uM = this.b.uM();
        dzsj<jjm> kI = this.b.kI();
        dzsj c4 = dxjh.c(this.b.uN());
        dzsj c5 = dxjh.c(this.b.uO());
        dzsj dzsjVar31 = this.v;
        if (dzsjVar31 == null) {
            dzsjVar31 = new ffo(this, 20);
            this.v = dzsjVar31;
        }
        bdybVar.bf = new bdyl(ad, n2, sm, uF, dzsjVar10, dzsjVar12, dzsjVar14, dzsjVar16, dzsjVar18, dzsjVar20, dzsjVar22, dzsjVar24, sR, dzsjVar26, dzsjVar28, dzsjVar30, uL, uM, kI, c4, c5, dzsjVar31, this.b.qA(), this.b.eW.V(), this.b.eW.il(), this.b.eS(), this.b.eW.al(), this.b.sN(), this.b.eW.lY(), this.b.eW.mq(), this.b.eW.bk(), dxjh.c(this.b.uP()), this.b.iX());
        bdybVar.bg = this.b.fu();
        ftt fttVar7 = this.b;
        bdybVar.bh = new bdyn(fttVar7.eV, fttVar7.eW.V(), this.b.eS(), this.b.eW.mq(), this.b.eW.lY());
        bdybVar.bi = this.b.ey();
        ckmm r = this.b.eW.a.r();
        dxjg.e(r);
        bdybVar.bj = r;
        bdybVar.bk = d();
        ftt fttVar8 = this.b;
        Object obj8 = fttVar8.dy;
        if (obj8 instanceof dxjf) {
            synchronized (obj8) {
                obj3 = fttVar8.dy;
                if (obj3 instanceof dxjf) {
                    gga wk = fttVar8.wk();
                    bvjj rB = fttVar8.eW.a.rB();
                    dxjg.e(rB);
                    obj3 = new bdyr(wk, rB, dxjc.c(fttVar8.eW.im()), fttVar8.co());
                    dxjc.d(fttVar8.dy, obj3);
                    fttVar8.dy = obj3;
                }
            }
            obj8 = obj3;
        }
        bdybVar.bl = (bdyr) obj8;
        ftt fttVar9 = this.b;
        dzsj<rb> dzsjVar32 = fttVar9.eV;
        dzsj<akox> as = fttVar9.as();
        dzsj c6 = dxjh.c(this.b.av());
        dzsj<broq> tC = this.b.tC();
        dzsj<cjqy> al = this.b.eW.al();
        dzsj<ckcw> at = this.b.eW.at();
        dzsj dzsjVar33 = this.w;
        if (dzsjVar33 == null) {
            dzsjVar33 = new ffo(this, 21);
            this.w = dzsjVar33;
        }
        bdybVar.bm = new brbx(dzsjVar32, as, c6, tC, al, at, dzsjVar33, this.b.kq(), this.b.eW.aw());
        ftt fttVar10 = this.b;
        Object obj9 = fttVar10.dz;
        if (obj9 instanceof dxjf) {
            synchronized (obj9) {
                obj2 = fttVar10.dz;
                if (obj2 instanceof dxjf) {
                    rb rbVar = fttVar10.a;
                    bvjj rB2 = fttVar10.eW.a.rB();
                    dxjg.e(rB2);
                    dxio c7 = dxjc.c(fttVar10.fY());
                    axse eT = fttVar10.eT();
                    Executor sU2 = fttVar10.eW.a.sU();
                    dxjg.e(sU2);
                    obj2 = new bdyv(rbVar, rB2, c7, eT, sU2);
                    dxjc.d(fttVar10.dz, obj2);
                    fttVar10.dz = obj2;
                }
            }
            obj9 = obj2;
        }
        bdybVar.bn = (bdyv) obj9;
        bdybVar.bo = this.b.kp();
        bdybVar.bp = this.b.gh();
        bdybVar.bq = this.b.fg();
        bdybVar.br = this.b.cJ();
        bdybVar.bs = new ckmu(this.b.eW.lK(), this.b.eW.K(), this.b.eW.pj());
        bdybVar.bt = new bxbe(this.b.da(), this.b.eW.V(), dxjh.c(this.b.ic()));
        bdybVar.bu = this.b.eW.lg();
        bdybVar.bv = new aaaf(this.b.uz(), this.b.ui(), this.b.az(), this.b.eW.lY());
        bvrb tn2 = this.b.eW.a.tn();
        dxjg.e(tn2);
        bdybVar.bw = tn2;
        bdybVar.bx = this.b.cv();
        bdybVar.by = this.b.fm();
        bdybVar.bz = this.b.wq();
        dxjg.e(this.b.eW.a.tr());
        bdybVar.bA = this.b.eW.qq();
        bdybVar.bB = this.b.wl();
        bdybVar.bC = this.b.hh();
        Executor sU3 = this.b.eW.a.sU();
        dxjg.e(sU3);
        bdybVar.bD = sU3;
        bdybVar.bE = new bdyp(this.b.eW.V(), this.b.eS());
    }

    public final dzsj<bmyp> b() {
        dzsj<bmyp> dzsjVar = this.l;
        if (dzsjVar == null) {
            ffo ffoVar = new ffo(this, 10);
            this.l = ffoVar;
            return ffoVar;
        }
        return dzsjVar;
    }

    public final dzsj<bmzc> c() {
        dzsj<bmzc> dzsjVar = this.m;
        if (dzsjVar == null) {
            ffo ffoVar = new ffo(this, 11);
            this.m = ffoVar;
            return ffoVar;
        }
        return dzsjVar;
    }
}
