package defpackage;

import android.app.Application;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fld  reason: default package */
/* loaded from: classes6.dex */
public final class fld<T> implements dzsj<T> {
    final /* synthetic */ fle a;
    private final int b;

    public fld(fle fleVar, int i) {
        this.a = fleVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, bupb] */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                return (T) new bsma(this.a.x.a);
            case 1:
                fle fleVar = this.a;
                abfa dJ = fleVar.x.eW.dJ();
                ?? tW = fleVar.x.tW();
                anhk qm = fleVar.x.eW.qm();
                btvo rp = fleVar.x.eW.a.rp();
                dxjg.e(rp);
                return (T) abfh.b(dJ, tW, qm, rp);
            case 2:
                return (T) this.a.b();
            case 3:
                fle fleVar2 = this.a;
                dzsj dzsjVar = fleVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fld(fleVar2, 4);
                    fleVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = fleVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fld(fleVar2, 5);
                    fleVar2.b = dzsjVar2;
                }
                return (T) new bsne(dzsjVar, dzsjVar2, fleVar2.x.jg());
            case 4:
                fle fleVar3 = this.a;
                return (T) new bsng(fleVar3.x.eW.V(), fleVar3.x.eW.fr(), fleVar3.x.rF());
            case 5:
                return (T) new bsnb(dxjh.c(this.a.x.J()));
            case 6:
                fle fleVar4 = this.a;
                ftt fttVar = fleVar4.x;
                dzsj<rb> dzsjVar3 = fttVar.eV;
                dzsj<jjm> kI = fttVar.kI();
                dzsj dzsjVar4 = fleVar4.c;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fld(fleVar4, 7);
                    fleVar4.c = dzsjVar4;
                }
                return (T) new bsrg(dzsjVar3, kI, dzsjVar4);
            case 7:
                fle fleVar5 = this.a;
                ftt fttVar2 = fleVar5.x;
                return (T) new bsqw(fttVar2.eV, fttVar2.eW.al(), fleVar5.x.fe());
            case 8:
                ftt fttVar3 = this.a.x;
                return (T) new bsrb(fttVar3.eV, fttVar3.fe());
            case 9:
                return (T) new bsqx(this.a.x.wk());
            case 10:
                this.a.x.bh();
                return (T) new acfj();
            case 11:
                fle fleVar6 = this.a;
                dzsj dzsjVar5 = fleVar6.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fld(fleVar6, 12);
                    fleVar6.e = dzsjVar5;
                }
                return (T) new bsrd(dzsjVar5, dxjh.c(fleVar6.x.aK()));
            case 12:
                fle fleVar7 = this.a;
                dzsj<Application> m = fleVar7.x.eW.m();
                dzsj dzsjVar6 = fleVar7.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fld(fleVar7, 13);
                    fleVar7.d = dzsjVar6;
                }
                return (T) new bsql(m, dzsjVar6, dxjh.c(fleVar7.x.m()), fleVar7.x.cS(), fleVar7.x.aX());
            case 13:
                fle fleVar8 = this.a;
                return (T) new brmb(fleVar8.x.eW.p(), fleVar8.x.m(), fleVar8.x.eW.I());
            case 14:
                fle fleVar9 = this.a;
                return (T) new bsqr(fleVar9.x.ad(), fleVar9.x.pT(), fleVar9.x.fF());
            case 15:
                fle fleVar10 = this.a;
                gga wk = fleVar10.x.wk();
                efh h = fleVar10.x.h();
                btrm rz = fleVar10.x.eW.a.rz();
                dxjg.e(rz);
                dzsj<afwt> q = fleVar10.x.q();
                dzsj<axxh> A = fleVar10.x.A();
                dxio c = dxjc.c(fleVar10.x.x());
                dxio c2 = dxjc.c(fleVar10.x.eW.ed());
                dxio c3 = dxjc.c(fleVar10.x.eW.u());
                acyp bW = fleVar10.x.eW.bW();
                btvo rp2 = fleVar10.x.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bsri(wk, h, rz, q, A, c, c2, c3, bW, rp2);
            case 16:
                return (T) new ghx(this.a.x.eW.al());
            case 17:
                fle fleVar11 = this.a;
                ckmp s = fleVar11.x.eW.a.s();
                dxjg.e(s);
                Executor sU = fleVar11.x.eW.a.sU();
                dxjg.e(sU);
                return (T) new bsod(s, sU);
            case 18:
                fle fleVar12 = this.a;
                Application a = fleVar12.x.eW.a.a();
                dxjg.e(a);
                btrm rz2 = fleVar12.x.eW.a.rz();
                dxjg.e(rz2);
                dehq tg = fleVar12.x.eW.a.tg();
                dxjg.e(tg);
                return (T) new bsoh(a, rz2, tg);
            case 19:
                fle fleVar13 = this.a;
                dzsj<gga> ad = fleVar13.x.ad();
                dzsj<btrm> n = fleVar13.x.eW.n();
                dzsj<beht> sm = fleVar13.x.sm();
                dzsj<behw> uF = fleVar13.x.uF();
                dzsj dzsjVar7 = fleVar13.f;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fld(fleVar13, 20);
                    fleVar13.f = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj dzsjVar9 = fleVar13.g;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fld(fleVar13, 21);
                    fleVar13.g = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj dzsjVar11 = fleVar13.h;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fld(fleVar13, 22);
                    fleVar13.h = dzsjVar11;
                }
                dzsj dzsjVar12 = dzsjVar11;
                dzsj dzsjVar13 = fleVar13.i;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fld(fleVar13, 23);
                    fleVar13.i = dzsjVar13;
                }
                dzsj dzsjVar14 = dzsjVar13;
                dzsj dzsjVar15 = fleVar13.j;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fld(fleVar13, 26);
                    fleVar13.j = dzsjVar15;
                }
                dzsj dzsjVar16 = dzsjVar15;
                dzsj dzsjVar17 = fleVar13.k;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new fld(fleVar13, 27);
                    fleVar13.k = dzsjVar17;
                }
                dzsj dzsjVar18 = dzsjVar17;
                dzsj dzsjVar19 = fleVar13.l;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fld(fleVar13, 28);
                    fleVar13.l = dzsjVar19;
                }
                dzsj dzsjVar20 = dzsjVar19;
                dzsj dzsjVar21 = fleVar13.n;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fld(fleVar13, 29);
                    fleVar13.n = dzsjVar21;
                }
                dzsj dzsjVar22 = dzsjVar21;
                dzsj<bfhu> sR = fleVar13.x.sR();
                dzsj dzsjVar23 = fleVar13.o;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new fld(fleVar13, 31);
                    fleVar13.o = dzsjVar23;
                }
                dzsj dzsjVar24 = dzsjVar23;
                dzsj dzsjVar25 = fleVar13.p;
                if (dzsjVar25 == null) {
                    dzsjVar25 = new fld(fleVar13, 32);
                    fleVar13.p = dzsjVar25;
                }
                dzsj dzsjVar26 = dzsjVar25;
                dzsj dzsjVar27 = fleVar13.q;
                if (dzsjVar27 == null) {
                    dzsjVar27 = new fld(fleVar13, 33);
                    fleVar13.q = dzsjVar27;
                }
                dzsj dzsjVar28 = dzsjVar27;
                dzsj<bfgy> uL = fleVar13.x.uL();
                dzsj<bfea> uM = fleVar13.x.uM();
                dzsj<jjm> kI2 = fleVar13.x.kI();
                dzsj c4 = dxjh.c(fleVar13.x.uN());
                dzsj c5 = dxjh.c(fleVar13.x.uO());
                dzsj dzsjVar29 = fleVar13.r;
                if (dzsjVar29 == null) {
                    dzsjVar29 = new fld(fleVar13, 34);
                    fleVar13.r = dzsjVar29;
                }
                return (T) new bdyl(ad, n, sm, uF, dzsjVar8, dzsjVar10, dzsjVar12, dzsjVar14, dzsjVar16, dzsjVar18, dzsjVar20, dzsjVar22, sR, dzsjVar24, dzsjVar26, dzsjVar28, uL, uM, kI2, c4, c5, dzsjVar29, fleVar13.x.qA(), fleVar13.x.eW.V(), fleVar13.x.eW.il(), fleVar13.x.eS(), fleVar13.x.eW.al(), fleVar13.x.sN(), fleVar13.x.eW.lY(), fleVar13.x.eW.mq(), fleVar13.x.eW.bk(), dxjh.c(fleVar13.x.uP()), fleVar13.x.iX());
            case 20:
                fle fleVar14 = this.a;
                ftt fttVar4 = fleVar14.x;
                return (T) new bniv(fttVar4.eV, fttVar4.eW.n(), fleVar14.x.H(), fleVar14.x.eW.al(), fleVar14.x.eW.mj());
            case 21:
                fle fleVar15 = this.a;
                return (T) new bniy(fleVar15.x.eW.m(), fleVar15.x.kI(), fleVar15.x.eW.p(), fleVar15.x.eW.aw(), fleVar15.x.eW.at());
            case 22:
                fle fleVar16 = this.a;
                return (T) new bdwu(fleVar16.x.eW.il(), fleVar16.x.eW.ph(), fleVar16.x.eW.di());
            case 23:
                fle fleVar17 = this.a;
                return (T) new bmyh(fleVar17.x.eW.il(), fleVar17.x.ad(), fleVar17.x.eW.al(), fleVar17.x.eW.V(), fleVar17.x.ef(), fleVar17.x.aK(), fleVar17.x.fh(), fleVar17.x.uG(), fleVar17.d(), fleVar17.e(), fleVar17.x.uH(), fleVar17.x.iX(), fleVar17.x.fe());
            case 24:
                return (T) new bmyp(this.a.x.a);
            case 25:
                fle fleVar18 = this.a;
                btvo rp3 = fleVar18.x.eW.a.rp();
                dxjg.e(rp3);
                ftt fttVar5 = fleVar18.x;
                rb rbVar = fttVar5.a;
                cjqy tr = fttVar5.eW.a.tr();
                dxjg.e(tr);
                return (T) new bmzc(rp3, rbVar, tr, fleVar18.x.ee(), fleVar18.x.be());
            case 26:
                fle fleVar19 = this.a;
                return (T) new bmyo(fleVar19.x.eW.il(), fleVar19.x.ad(), fleVar19.x.aK(), fleVar19.x.uG(), fleVar19.d(), fleVar19.e(), fleVar19.x.eW.V(), fleVar19.x.uI(), fleVar19.x.uJ(), dxjh.c(fleVar19.x.eW.mq()), fleVar19.x.uH(), fleVar19.x.iX());
            case 27:
                fle fleVar20 = this.a;
                ftt fttVar6 = fleVar20.x;
                return (T) new bmlm(fttVar6.eV, fttVar6.eW.il(), fleVar20.x.eW.al(), fleVar20.x.az(), fleVar20.x.sN(), fleVar20.x.nb(), fleVar20.x.kI(), fleVar20.x.eW.V(), fleVar20.x.uK(), fleVar20.x.eW.lQ());
            case 28:
                fle fleVar21 = this.a;
                ftt fttVar7 = fleVar21.x;
                rb rbVar2 = fttVar7.a;
                cjqy tr2 = fttVar7.eW.a.tr();
                dxjg.e(tr2);
                bhat fp = fleVar21.x.fp();
                btvo rp4 = fleVar21.x.eW.a.rp();
                dxjg.e(rp4);
                bbut be = fleVar21.x.be();
                bflb iZ = fleVar21.x.iZ();
                bwsh cZ = fleVar21.x.cZ();
                bvrb tn = fleVar21.x.eW.a.tn();
                dxjg.e(tn);
                cqhn cqhnVar = new cqhn();
                dxio c6 = dxjc.c(fleVar21.x.jc());
                bvjj rB = fleVar21.x.eW.a.rB();
                dxjg.e(rB);
                return (T) new bfle(rbVar2, tr2, fp, rp4, be, iZ, cZ, tn, cqhnVar, c6, rB, fleVar21.x.jd(), fleVar21.x.jf(), fleVar21.x.jh(), new cqhu(), fleVar21.x.eW.lX(), new bfic(fleVar21.x.jj(), new bmeb(fleVar21.x.be(), fleVar21.x.cZ())));
            case 29:
                fle fleVar22 = this.a;
                dzsj<gga> ad2 = fleVar22.x.ad();
                dzsj<akfa> p = fleVar22.x.eW.p();
                dzsj<bvjj> aw = fleVar22.x.eW.aw();
                dzsj<bwqv> er = fleVar22.x.eW.er();
                dzsj<iqs> sN = fleVar22.x.sN();
                dzsj<bbdv> jr = fleVar22.x.jr();
                dzsj<ania> hj = fleVar22.x.eW.hj();
                dzsj<btvo> V = fleVar22.x.eW.V();
                dzsj<bmfg> mx = fleVar22.x.eW.mx();
                dzsj<bfhx> sO = fleVar22.x.sO();
                dzsj<cqhn> il = fleVar22.x.eW.il();
                dzsj<cqhu> eS = fleVar22.x.eS();
                dzsj<bker> sT = fleVar22.x.sT();
                dzsj<cwy> ir = fleVar22.x.ir();
                dzsj<beez> sS = fleVar22.x.sS();
                dzsj<bfgx> nu = fleVar22.x.nu();
                dzsj<bmgu> nv = fleVar22.x.nv();
                dzsj<bfcz> sL = fleVar22.x.sL();
                dzsj<beya> qz = fleVar22.x.qz();
                dzsj<bfaq> qA = fleVar22.x.qA();
                dzsj<bhiz> jD = fleVar22.x.jD();
                dzsj<bhhf> l = fleVar22.x.l();
                dzsj<bhat> iX = fleVar22.x.iX();
                dzsj<cjqy> al = fleVar22.x.eW.al();
                dzsj<cjqq> hN = fleVar22.x.eW.hN();
                dzsj<begg> az = fleVar22.x.az();
                dzsj<biko> iU = fleVar22.x.iU();
                dzsj sP = fleVar22.x.sP();
                dzsj<bego> lY = fleVar22.x.eW.lY();
                dzsj<bfgq> sQ = fleVar22.x.sQ();
                dzsj dzsjVar30 = fleVar22.m;
                if (dzsjVar30 == null) {
                    dzsjVar30 = new fld(fleVar22, 30);
                    fleVar22.m = dzsjVar30;
                }
                return (T) new bfhn(ad2, p, aw, er, sN, jr, hj, V, mx, sO, il, eS, sT, ir, sS, nu, nv, sL, qz, qA, jD, l, iX, al, hN, az, iU, sP, lY, sQ, dzsjVar30, fleVar22.x.jp());
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return (T) new beew(this.a.x.eW.lY());
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                fle fleVar23 = this.a;
                return (T) new bfhf(fleVar23.x.eW.il(), fleVar23.x.eS(), fleVar23.x.sN(), fleVar23.x.eW.er(), fleVar23.x.sO(), fleVar23.x.sP(), fleVar23.x.jx(), fleVar23.x.eW.lY(), fleVar23.x.eW.V(), fleVar23.x.sQ());
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                fle fleVar24 = this.a;
                dxio c7 = dxjc.c(fleVar24.x.eW.p());
                bvrb tn2 = fleVar24.x.eW.a.tn();
                dxjg.e(tn2);
                blwy blwyVar = new blwy(c7, tn2, fleVar24.x.eW.ft(), dxjc.c(fleVar24.x.eW.V()));
                dxio c8 = dxjc.c(fleVar24.x.eW.p());
                bvrb tn3 = fleVar24.x.eW.a.tn();
                dxjg.e(tn3);
                cjqy tr3 = fleVar24.x.eW.a.tr();
                dxjg.e(tr3);
                dxio c9 = dxjc.c(fleVar24.x.tk());
                dxio c10 = dxjc.c(fleVar24.x.az());
                ckcw rU = fleVar24.x.eW.a.rU();
                dxjg.e(rU);
                dxio c11 = dxjc.c(fleVar24.x.eW.V());
                bvvw bvvwVar = (bvvw) fleVar24.x.ao();
                cqhn cqhnVar2 = new cqhn();
                ckmm r = fleVar24.x.eW.a.r();
                dxjg.e(r);
                return (T) new blyj(blwyVar, c8, tn3, tr3, c9, c10, rU, c11, bvvwVar, cqhnVar2, r, fleVar24.x.k());
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return (T) new bniw(this.a.x.a);
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                fle fleVar25 = this.a;
                ftt fttVar8 = fleVar25.x;
                return (T) new bfvw(fttVar8.eV, fttVar8.eW.il(), fleVar25.x.eW.di(), fleVar25.x.eW.ec(), dxjh.c(fleVar25.x.az()));
            case 35:
                fle fleVar26 = this.a;
                return (T) new bsni(fleVar26.x.eW.at(), fleVar26.x.eW.il(), fleVar26.x.eS(), fleVar26.x.eW.al(), fleVar26.x.eW.mj(), fleVar26.x.eW.lc(), fleVar26.x.tO(), fleVar26.x.vd(), fleVar26.c());
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                fle fleVar27 = this.a;
                ftt fttVar9 = fleVar27.x;
                return (T) new bsnk(fttVar9.eV, fttVar9.eS(), fleVar27.x.eW.mj(), fleVar27.x.eW.lc(), fleVar27.x.tO(), fleVar27.x.vd(), fleVar27.c());
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                fle fleVar28 = this.a;
                return (T) new bsos(fleVar28.x.eW.al(), fleVar28.x.eW.mO(), fleVar28.x.eW.hN(), fleVar28.x.eW.il(), fleVar28.c());
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                fle fleVar29 = this.a;
                dxio c12 = dxjc.c(fleVar29.x.H());
                vsf g = fleVar29.x.eW.g();
                ftt fttVar10 = fleVar29.x;
                return (T) new vox(c12, g, fttVar10.a, fttVar10.bB());
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                fle fleVar30 = this.a;
                ftt fttVar11 = fleVar30.x;
                dzsj<rb> dzsjVar31 = fttVar11.eV;
                dzsj<akox> as = fttVar11.as();
                dzsj c13 = dxjh.c(fleVar30.x.av());
                dzsj<broq> tC = fleVar30.x.tC();
                dzsj<cjqy> al2 = fleVar30.x.eW.al();
                dzsj<ckcw> at = fleVar30.x.eW.at();
                dzsj dzsjVar32 = fleVar30.s;
                if (dzsjVar32 == null) {
                    dzsjVar32 = new fld(fleVar30, 40);
                    fleVar30.s = dzsjVar32;
                }
                return (T) new brbx(dzsjVar31, as, c13, tC, al2, at, dzsjVar32, fleVar30.x.kq(), fleVar30.x.eW.aw());
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                fle fleVar31 = this.a;
                dzsj<bvrb> R = fleVar31.x.eW.R();
                dzsj<btrm> n2 = fleVar31.x.eW.n();
                dzsj<akox> as2 = fleVar31.x.as();
                dzsj<btvo> V2 = fleVar31.x.eW.V();
                dzsj<cqkj> y = fleVar31.x.y();
                ftt fttVar12 = fleVar31.x;
                return (T) new brbh(R, n2, as2, V2, y, fttVar12.eV, fttVar12.eW.il());
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                fle fleVar32 = this.a;
                ftt fttVar13 = fleVar32.x;
                dzsj<rb> dzsjVar33 = fttVar13.eV;
                dzsj<btvo> V3 = fttVar13.eW.V();
                dzsj<broq> tC2 = fleVar32.x.tC();
                dzsj<akox> as3 = fleVar32.x.as();
                dzsj<aehr> lz = fleVar32.x.eW.lz();
                dzsj<aeht> ec = fleVar32.x.eW.ec();
                dzsj<brdi> mM = fleVar32.x.eW.mM();
                fyu fyuVar = fleVar32.x.eW;
                dzsj dzsjVar34 = fyuVar.dM;
                if (dzsjVar34 == null) {
                    dzsjVar34 = new fxy(fyuVar, 719);
                    fyuVar.dM = dzsjVar34;
                }
                return (T) new brcf(dzsjVar33, V3, tC2, as3, lz, ec, mM, dzsjVar34, fleVar32.x.sw(), fleVar32.x.kq(), fleVar32.x.ko());
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                fle fleVar33 = this.a;
                Object obj4 = fleVar33.t;
                if (obj4 instanceof dxjf) {
                    synchronized (obj4) {
                        obj = fleVar33.t;
                        if (obj instanceof dxjf) {
                            akox ap = fleVar33.x.ap();
                            gle bM = fleVar33.x.bM();
                            btrm rz3 = fleVar33.x.eW.a.rz();
                            dxjg.e(rz3);
                            dxio c14 = dxjc.c(fleVar33.x.av());
                            brpk f = fleVar33.f();
                            cklq io = fleVar33.x.eW.io();
                            jjm cJ = fleVar33.x.cJ();
                            brat ll = fleVar33.x.eW.ll();
                            brlk b = fleVar33.b();
                            dehq tg2 = fleVar33.x.eW.a.tg();
                            dxjg.e(tg2);
                            obj = new brmk(ap, bM, rz3, c14, f, io, cJ, ll, b, tg2);
                            dxjc.d(fleVar33.t, obj);
                            fleVar33.t = obj;
                        }
                    }
                    obj4 = obj;
                }
                return (T) ((brmk) obj4);
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                fle fleVar34 = this.a;
                Object obj5 = fleVar34.u;
                if (obj5 instanceof dxjf) {
                    synchronized (obj5) {
                        obj2 = fleVar34.u;
                        if (obj2 instanceof dxjf) {
                            dxjg.e(fleVar34.x.eW.a.rz());
                            akox ap2 = fleVar34.x.ap();
                            dehq tg3 = fleVar34.x.eW.a.tg();
                            dxjg.e(tg3);
                            btvo rp5 = fleVar34.x.eW.a.rp();
                            dxjg.e(rp5);
                            brny gg = fleVar34.x.gg();
                            brpk f2 = fleVar34.f();
                            fleVar34.x.gh();
                            obj2 = new brns(ap2, tg3, rp5, gg, f2, fleVar34.b());
                            dxjc.d(fleVar34.u, obj2);
                            fleVar34.u = obj2;
                        }
                    }
                    obj5 = obj2;
                }
                return (T) ((brns) obj5);
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return (T) brzy.b(this.a.x.wk(), new cqhn());
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                fle fleVar35 = this.a;
                Object obj6 = fleVar35.w;
                if (obj6 instanceof dxjf) {
                    synchronized (obj6) {
                        obj3 = fleVar35.w;
                        if (obj3 instanceof dxjf) {
                            dxjc.c(fleVar35.x.ez());
                            dxjc.c(fleVar35.x.y());
                            if (fleVar35.v == null) {
                                fleVar35.v = new fld(fleVar35, 46);
                            }
                            obj3 = new brch();
                            dxjc.d(fleVar35.w, obj3);
                            fleVar35.w = obj3;
                        }
                    }
                    obj6 = obj3;
                }
                return (T) ((brch) obj6);
            default:
                fle fleVar36 = this.a;
                return (T) new bsre(fleVar36.x.wn(), dxjc.c(fleVar36.x.aK()));
        }
    }
}
