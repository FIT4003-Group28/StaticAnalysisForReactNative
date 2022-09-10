package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: erx  reason: default package */
/* loaded from: classes6.dex */
public final class erx<T> implements dzsj<T> {
    final /* synthetic */ ery a;
    private final int b;

    public erx(ery eryVar, int i) {
        this.a = eryVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        switch (this.b) {
            case 0:
                ery eryVar = this.a;
                wuw wuwVar = new wuw();
                sze szeVar = new sze(eryVar.b(), eryVar.c());
                ftt fttVar = eryVar.r.y;
                dzsj<rb> dzsjVar = fttVar.eV;
                dzsj<cqat> K = fttVar.eW.K();
                dzsj<twk> b = eryVar.b();
                dzsj<byym> s = eryVar.r.s();
                dzsj<bzgl> iB = eryVar.r.y.iB();
                dzsj<cqhn> il = eryVar.r.y.eW.il();
                dzsj<aibo> nX = eryVar.r.y.eW.nX();
                ese eseVar = eryVar.r;
                dzsj dzsjVar2 = eseVar.f;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new erv(eseVar, 14);
                    eseVar.f = dzsjVar2;
                }
                szm szmVar = new szm(dzsjVar, K, b, s, iB, il, nX, dzsjVar2, dxjh.c(eryVar.r.y.eW.dd()), eryVar.r.y.lD());
                dzsj<twk> b2 = eryVar.b();
                dzsj<sxq> c = eryVar.c();
                dzsj dzsjVar3 = eryVar.a;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new erx(eryVar, 3);
                    eryVar.a = dzsjVar3;
                }
                ese eseVar2 = eryVar.r;
                dzsj dzsjVar4 = eseVar2.h;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new erv(eseVar2, 15);
                    eseVar2.h = dzsjVar4;
                }
                szp szpVar = new szp(b2, c, dzsjVar3, dzsjVar4);
                szj szjVar = new szj(eryVar.r.y.eV, eryVar.d());
                dzsj<rb> dzsjVar5 = eryVar.r.y.eV;
                dzsj<sxq> c2 = eryVar.c();
                dzsj dzsjVar6 = eryVar.b;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new erx(eryVar, 5);
                    eryVar.b = dzsjVar6;
                }
                return (T) new sxb(wuwVar, szeVar, szmVar, szpVar, szjVar, new szh(dzsjVar5, c2, dzsjVar6), new szc(eryVar.b(), eryVar.c(), eryVar.r.y.eW.ob(), eryVar.d()));
            case 1:
                ese eseVar3 = this.a.r;
                return (T) new twk(eseVar3.y.eV, eseVar3.r());
            case 2:
                ery eryVar2 = this.a;
                ftt fttVar2 = eryVar2.r.y;
                return (T) new sxq(fttVar2.eV, fttVar2.kI(), eryVar2.r.y.eW.il());
            case 3:
                ery eryVar3 = this.a;
                ftt fttVar3 = eryVar3.r.y;
                return (T) new sxo(fttVar3.eV, fttVar3.eW.il(), eryVar3.r.y.eW.V(), eryVar3.r.y.eW.di());
            case 4:
                ery eryVar4 = this.a;
                ftt fttVar4 = eryVar4.r.y;
                return (T) new sxg(fttVar4.eV, dxjh.c(fttVar4.m()), eryVar4.r.y.eW.dB());
            case 5:
                ery eryVar5 = this.a;
                return (T) wtt.b(eryVar5.r.y.eW.lH(), eryVar5.r.y.eW.fq(), eryVar5.r.y.eW.k(), dxjh.c(eryVar5.r.y.bT()), dxjh.c(eryVar5.r.y.bU()));
            case 6:
                ery eryVar6 = this.a;
                wuw wuwVar2 = new wuw();
                dzsj<rb> dzsjVar7 = eryVar6.r.y.eV;
                dzsj dzsjVar8 = eryVar6.c;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new erx(eryVar6, 7);
                    eryVar6.c = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj<cqhn> il2 = eryVar6.r.y.eW.il();
                dzsj<vsf> jm = eryVar6.r.y.eW.jm();
                dzsj<twh> e = eryVar6.e();
                dzsj<tao> f = eryVar6.f();
                dzsj<suq> g = eryVar6.g();
                dzsj dzsjVar10 = eryVar6.d;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new erx(eryVar6, 11);
                    eryVar6.d = dzsjVar10;
                }
                tdm tdmVar = new tdm(dzsjVar7, dzsjVar9, il2, jm, e, f, g, dzsjVar10, eryVar6.r.y.eW.ob());
                ftt fttVar5 = eryVar6.r.y;
                tdo tdoVar = new tdo(fttVar5.eV, fttVar5.eW.il(), eryVar6.r.y.eW.jm(), eryVar6.r.y.eW.kf(), eryVar6.h(), eryVar6.f());
                ftt fttVar6 = eryVar6.r.y;
                tdq tdqVar = new tdq(fttVar6.eV, fttVar6.eW.il(), eryVar6.r.y.eW.jm(), eryVar6.h(), eryVar6.f(), eryVar6.r.y.iH());
                ftt fttVar7 = eryVar6.r.y;
                teb tebVar = new teb(fttVar7.eV, fttVar7.eW.il(), eryVar6.r.y.eW.jm(), eryVar6.h(), eryVar6.f(), eryVar6.r.y.iH());
                ftt fttVar8 = eryVar6.r.y;
                tdy tdyVar = new tdy(fttVar8.eV, fttVar8.eW.il(), eryVar6.r.y.eW.al(), eryVar6.r.y.eW.jm(), eryVar6.r.v());
                ftt fttVar9 = eryVar6.r.y;
                tds tdsVar = new tds(fttVar9.eV, fttVar9.ad(), eryVar6.r.y.eW.il(), eryVar6.r.y.eW.jm(), eryVar6.e(), eryVar6.f(), eryVar6.g(), eryVar6.i());
                ted tedVar = new ted(eryVar6.r.y.eW.il());
                ftt fttVar10 = eryVar6.r.y;
                return (T) new szq(wuwVar2, tdmVar, tdoVar, tdqVar, tebVar, tdyVar, tdsVar, tedVar, new tef(fttVar10.eV, fttVar10.eW.il(), eryVar6.r.y.eW.jm(), eryVar6.r.y.eW.kf(), eryVar6.h(), eryVar6.f()));
            case 7:
                return (T) new qhn(this.a.r.y.eW.sA());
            case 8:
                return (T) new twh();
            case 9:
                return (T) new tao(this.a.r.y.eV);
            case 10:
                return (T) new suq(this.a.r.y.eV);
            case 11:
                ftt fttVar11 = this.a.r.y;
                return (T) new twn(fttVar11.eV, fttVar11.eW.V());
            case 12:
                ery eryVar7 = this.a;
                ese eseVar4 = eryVar7.r;
                return (T) new tam(eseVar4.y.eV, eseVar4.u(), eryVar7.r.y.eW.ds());
            case 13:
                return (T) new wtw();
            case 14:
                ery eryVar8 = this.a;
                wuw wuwVar3 = new wuw();
                ese eseVar5 = eryVar8.r;
                dzsj<rb> dzsjVar11 = eseVar5.y.eV;
                dzsj<sve> w = eseVar5.w();
                dzsj dzsjVar12 = eryVar8.j;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new erx(eryVar8, 15);
                    eryVar8.j = dzsjVar12;
                }
                swj swjVar = new swj(dzsjVar11, w, dzsjVar12);
                ese eseVar6 = eryVar8.r;
                dzsj<rb> dzsjVar13 = eseVar6.y.eV;
                dzsj<sve> w2 = eseVar6.w();
                dzsj dzsjVar14 = eryVar8.o;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new erx(eryVar8, 20);
                    eryVar8.o = dzsjVar14;
                }
                dzsj dzsjVar15 = eryVar8.p;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new erx(eryVar8, 26);
                    eryVar8.p = dzsjVar15;
                }
                swl swlVar = new swl(dzsjVar13, w2, dzsjVar14, dzsjVar15);
                dzsj<tmi> v = eryVar8.r.v();
                dzsj dzsjVar16 = eryVar8.q;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new erx(eryVar8, 27);
                    eryVar8.q = dzsjVar16;
                }
                return (T) new svq(wuwVar3, swjVar, swlVar, new swh(v, dzsjVar16, eryVar8.r.y.eW.il(), eryVar8.r.y.eS(), eryVar8.g()));
            case 15:
                ery eryVar9 = this.a;
                btvo rp = eryVar9.r.y.eW.a.rp();
                dxjg.e(rp);
                cqat rR = eryVar9.r.y.eW.a.rR();
                dxjg.e(rR);
                bvsl sA = eryVar9.r.y.eW.sA();
                vsf g2 = eryVar9.r.y.eW.g();
                zrl zrlVar = new zrl(eryVar9.r.y.eW.fr(), dxjh.c(eryVar9.r.y.da()), eryVar9.r.y.eW.V());
                btpc sz = eryVar9.r.y.eW.a.sz();
                dxjg.e(sz);
                byaf byafVar = eryVar9.e;
                if (byafVar == null) {
                    dxjg.e(eryVar9.r.y.eW.a.rB());
                    btvo rp2 = eryVar9.r.y.eW.a.rp();
                    dxjg.e(rp2);
                    byafVar = new byaf(rp2);
                    eryVar9.e = byafVar;
                }
                byaf byafVar2 = byafVar;
                zse zseVar = new zse(eryVar9.r.y.eW.m(), eryVar9.r.y.eW.hN());
                buti rF = eryVar9.r.y.eW.rF();
                zlr zlrVar = new zlr(eryVar9.r.y.eW.ds(), eryVar9.r.y.ad());
                dzsj<vpd> ds = eryVar9.r.y.eW.ds();
                dzsj<gga> ad = eryVar9.r.y.ad();
                dzsj dzsjVar17 = eryVar9.i;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new erx(eryVar9, 16);
                    eryVar9.i = dzsjVar17;
                }
                zgs zgsVar = new zgs(ds, ad, dzsjVar17);
                zqg iN = eryVar9.r.y.iN();
                zrt jV = eryVar9.r.y.jV();
                Executor sU = eryVar9.r.y.eW.a.sU();
                dxjg.e(sU);
                return (T) new zpy(rp, rR, sA, g2, zrlVar, sz, byafVar2, zseVar, rF, zlrVar, zgsVar, iN, jV, sU);
            case 16:
                ery eryVar10 = this.a;
                gga wk = eryVar10.r.y.wk();
                cqkj wl = eryVar10.r.y.wl();
                dzsj<vxo> dx = eryVar10.r.y.eW.dx();
                ftt fttVar12 = eryVar10.r.y;
                dzsj<rb> dzsjVar18 = fttVar12.eV;
                dzsj<vpd> ds2 = fttVar12.eW.ds();
                dzsj<cklf> fe = eryVar10.r.y.fe();
                dzsj dzsjVar19 = eryVar10.f;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new erx(eryVar10, 17);
                    eryVar10.f = dzsjVar19;
                }
                dzsj dzsjVar20 = dzsjVar19;
                dzsj dzsjVar21 = eryVar10.g;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new erx(eryVar10, 18);
                    eryVar10.g = dzsjVar21;
                }
                dzsj dzsjVar22 = dzsjVar21;
                dzsj dzsjVar23 = eryVar10.h;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new erx(eryVar10, 19);
                    eryVar10.h = dzsjVar23;
                }
                return (T) new ziq(wk, wl, new zrj(dx, dzsjVar18, ds2, fe, dzsjVar20, dzsjVar22, dzsjVar23));
            case 17:
                return (T) new vrk(this.a.r.y.eV);
            case 18:
                return (T) new vre(this.a.r.y.eV);
            case 19:
                return (T) new vrr(this.a.r.y.eV);
            case 20:
                ery eryVar11 = this.a;
                dzsj<gga> ad2 = eryVar11.r.y.ad();
                dzsj<btvo> V = eryVar11.r.y.eW.V();
                dzsj<cqhn> il3 = eryVar11.r.y.eW.il();
                dzsj dzsjVar24 = eryVar11.k;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new erx(eryVar11, 21);
                    eryVar11.k = dzsjVar24;
                }
                dzsj dzsjVar25 = dzsjVar24;
                dzsj<zuz> iv = eryVar11.r.y.iv();
                dzsj<Executor> di = eryVar11.r.y.eW.di();
                dzsj<xew> nI = eryVar11.r.y.eW.nI();
                dzsj<xfd> og = eryVar11.r.y.eW.og();
                dzsj<bvjj> aw = eryVar11.r.y.eW.aw();
                dzsj c3 = dxjh.c(eryVar11.r.y.m());
                dzsj<wtw> i = eryVar11.i();
                dzsj dzsjVar26 = eryVar11.l;
                if (dzsjVar26 == null) {
                    dzsjVar26 = new erx(eryVar11, 23);
                    eryVar11.l = dzsjVar26;
                }
                dzsj dzsjVar27 = dzsjVar26;
                dzsj<bvrb> R = eryVar11.r.y.eW.R();
                dzsj dzsjVar28 = eryVar11.m;
                if (dzsjVar28 == null) {
                    dzsjVar28 = new erx(eryVar11, 24);
                    eryVar11.m = dzsjVar28;
                }
                dzsj dzsjVar29 = dzsjVar28;
                dzsj c4 = dxjh.c(eryVar11.r.y.eW.p());
                dzsj dzsjVar30 = eryVar11.n;
                if (dzsjVar30 == null) {
                    dzsjVar30 = new erx(eryVar11, 25);
                    eryVar11.n = dzsjVar30;
                }
                return (T) new ycj(ad2, V, il3, dzsjVar25, iv, di, nI, og, aw, c3, i, dzsjVar27, R, dzsjVar29, c4, dxjh.c(dzsjVar30), eryVar11.r.y.eW.at());
            case 21:
                ery eryVar12 = this.a;
                rb rbVar = eryVar12.r.y.a;
                cqhn cqhnVar = new cqhn();
                cqhu cqhuVar = new cqhu();
                ydf ydfVar = new ydf(eryVar12.r.y.iA(), eryVar12.r.y.ix());
                Executor sU2 = eryVar12.r.y.eW.a.sU();
                dxjg.e(sU2);
                btvo rp3 = eryVar12.r.y.eW.a.rp();
                dxjg.e(rp3);
                bvjj rB = eryVar12.r.y.eW.a.rB();
                dxjg.e(rB);
                byym q = eryVar12.r.q();
                wvb nu = eryVar12.r.y.eW.nu();
                cqat rR2 = eryVar12.r.y.eW.a.rR();
                dxjg.e(rR2);
                ybs ybsVar = new ybs(rbVar, cqhnVar, cqhuVar, ydfVar, sU2, rp3, rB, q, nu, rR2, dxjc.c(eryVar12.r.y.H()), eryVar12.r.y.jV());
                ftt fttVar13 = eryVar12.r.y;
                rb rbVar2 = fttVar13.a;
                bvsl sA2 = fttVar13.eW.sA();
                gce sC = eryVar12.r.y.eW.a.sC();
                dxjg.e(sC);
                ftt fttVar14 = eryVar12.r.y;
                yao yaoVar = new yao(fttVar14.eV, fttVar14.eW.il(), eryVar12.r.y.bT(), eryVar12.r.y.eW.V(), eryVar12.r.y.eW.k(), eryVar12.r.y.eW.lH(), eryVar12.r.y.eW.fq(), eryVar12.r.y.bU());
                Application a = eryVar12.r.y.eW.a.a();
                dxjg.e(a);
                gce sC2 = eryVar12.r.y.eW.a.sC();
                dxjg.e(sC2);
                yak yakVar = new yak(a, sC2);
                ftt fttVar15 = eryVar12.r.y;
                ycr ycrVar = new ycr(fttVar15.eV, fttVar15.eW.V(), eryVar12.r.y.eW.il(), eryVar12.r.s(), eryVar12.r.y.eW.di(), eryVar12.r.y.eW.k(), eryVar12.r.y.eW.lH(), eryVar12.r.y.tM(), dxjh.c(eryVar12.r.y.eo()), eryVar12.r.y.tB(), eryVar12.r.y.eW.cx());
                yct yctVar = new yct();
                ftt fttVar16 = eryVar12.r.y;
                rb rbVar3 = fttVar16.a;
                gce sC3 = fttVar16.eW.a.sC();
                dxjg.e(sC3);
                ftt fttVar17 = eryVar12.r.y;
                yaq yaqVar = new yaq(rbVar2, sA2, sC, yaoVar, yakVar, ycrVar, yctVar, new yar(rbVar3, sC3, new yat(fttVar17.eV, fttVar17.eW.il(), eryVar12.r.y.eW.lH(), eryVar12.k(), dxjh.c(eryVar12.r.y.m()), eryVar12.r.y.eW.dA(), eryVar12.r.y.ir()), yav.b(eryVar12.r.y.a, new cqhn(), eryVar12.j(), ery.l()), ybd.b(ery.l()), new wuw(), eryVar12.r.y.eW.sA()));
                ese eseVar7 = eryVar12.r;
                Object obj2 = eseVar7.j;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = eseVar7.j;
                        if (obj instanceof dxjf) {
                            obj = new vtg(eseVar7.y.ap(), eseVar7.y.cJ());
                            dxjc.d(eseVar7.j, obj);
                            eseVar7.j = obj;
                        }
                    }
                    obj2 = obj;
                }
                Context b3 = eryVar12.r.y.eW.a.b();
                dxjg.e(b3);
                wqy wqyVar = new wqy(b3, eryVar12.r.y.eW.g(), eryVar12.r.y.jR(), new wqw(eryVar12.r.y.eW.m()));
                btvo rp4 = eryVar12.r.y.eW.a.rp();
                dxjg.e(rp4);
                return (T) new yac(rbVar, ybsVar, yaqVar, (vtg) obj2, wqyVar, rp4);
            case 22:
                return (T) this.a.j();
            case 23:
                return (T) new xhh(dxjh.c(this.a.r.y.tJ()));
            case 24:
                return (T) ydd.b();
            case 25:
                ery eryVar13 = this.a;
                rb rbVar4 = eryVar13.r.y.a;
                buky bukyVar = eryVar13.s;
                if (bukyVar == null) {
                    dxio c5 = dxjc.c(eryVar13.r.y.eW.h());
                    bvrb tn = eryVar13.r.y.eW.a.tn();
                    dxjg.e(tn);
                    bukyVar = bula.b(bukz.b(c5, tn));
                    eryVar13.s = bukyVar;
                }
                Executor sV = eryVar13.r.y.eW.a.sV();
                dxjg.e(sV);
                Executor sU3 = eryVar13.r.y.eW.a.sU();
                dxjg.e(sU3);
                return (T) new zad(rbVar4, bukyVar, sV, sU3);
            case 26:
                ery eryVar14 = this.a;
                return (T) new xkm(eryVar14.r.y.eW.m(), eryVar14.r.s(), eryVar14.r.y.eW.nK(), eryVar14.r.y.eW.di(), eryVar14.r.y.eW.nW());
            default:
                ery eryVar15 = this.a;
                return (T) new swp(eryVar15.r.y.eV, eryVar15.k());
        }
    }
}
