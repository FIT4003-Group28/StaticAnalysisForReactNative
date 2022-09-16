package defpackage;

import android.content.Context;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: evl  reason: default package */
/* loaded from: classes.dex */
public final class evl<T> implements dzsj<T> {
    final /* synthetic */ evm a;
    private final int b;

    public evl(evm evmVar, int i) {
        this.a = evmVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v243, types: [T, bvap, bvan] */
    @Override // defpackage.dzsj
    public final T a() {
        dxio dxioVar;
        adnt adntVar;
        adnx adnxVar;
        adob adobVar;
        adof adofVar;
        adoj adojVar;
        switch (this.b) {
            case 0:
                evm evmVar = this.a;
                dzsj dzsjVar = evmVar.I;
                if (dzsjVar == null) {
                    dzsjVar = new evl(evmVar, 1);
                    evmVar.I = dzsjVar;
                }
                return (T) new aebl(dxjc.c(dzsjVar), dxjc.c(evmVar.K.ua()), dxjc.c(evmVar.K.eW.mq()), evmVar.j(), new aeay(evmVar.K.eW.at()), evmVar.K.eW.fk(), new cqhn());
            case 1:
                evm evmVar2 = this.a;
                abim rw = evmVar2.K.rw();
                abfa dJ = evmVar2.K.eW.dJ();
                adza fk = evmVar2.K.eW.fk();
                dzsj dzsjVar2 = evmVar2.a;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new evl(evmVar2, 2);
                    evmVar2.a = dzsjVar2;
                }
                adcl adclVar = new adcl(dzsjVar2, evmVar2.K.eW.ij());
                dzsj dzsjVar3 = evmVar2.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new evl(evmVar2, 3);
                    evmVar2.d = dzsjVar3;
                }
                dxio c = dxjc.c(dzsjVar3);
                dzsj dzsjVar4 = evmVar2.e;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new evl(evmVar2, 6);
                    evmVar2.e = dzsjVar4;
                }
                dxio c2 = dxjc.c(dzsjVar4);
                adfg rE = evmVar2.K.rE();
                dzsj dzsjVar5 = evmVar2.f;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new evl(evmVar2, 7);
                    evmVar2.f = dzsjVar5;
                }
                dxio c3 = dxjc.c(dzsjVar5);
                adgw rG = evmVar2.K.rG();
                dzsj dzsjVar6 = evmVar2.g;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new evl(evmVar2, 8);
                    evmVar2.g = dzsjVar6;
                }
                dxio c4 = dxjc.c(dzsjVar6);
                dzsj dzsjVar7 = evmVar2.h;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new evl(evmVar2, 9);
                    evmVar2.h = dzsjVar7;
                }
                dxjc.c(dzsjVar7);
                dzsj dzsjVar8 = evmVar2.i;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new evl(evmVar2, 10);
                    evmVar2.i = dzsjVar8;
                }
                dxio c5 = dxjc.c(dzsjVar8);
                dxio c6 = dxjc.c(evmVar2.K.sc());
                dzsj dzsjVar9 = evmVar2.j;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new evl(evmVar2, 11);
                    evmVar2.j = dzsjVar9;
                }
                dxio c7 = dxjc.c(dzsjVar9);
                dzsj dzsjVar10 = evmVar2.k;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new evl(evmVar2, 12);
                    evmVar2.k = dzsjVar10;
                }
                dxio c8 = dxjc.c(dzsjVar10);
                dxjc.c(evmVar2.K.rv());
                dzsj<abfa> mq = evmVar2.K.eW.mq();
                dzsj<adza> ij = evmVar2.K.eW.ij();
                dzsj dzsjVar11 = evmVar2.m;
                if (dzsjVar11 == null) {
                    dxioVar = c5;
                    dzsjVar11 = new evl(evmVar2, 13);
                    evmVar2.m = dzsjVar11;
                } else {
                    dxioVar = c5;
                }
                adnt adntVar2 = new adnt(mq, ij, dzsjVar11);
                dzsj<abfa> mq2 = evmVar2.K.eW.mq();
                dzsj<adza> ij2 = evmVar2.K.eW.ij();
                dzsj dzsjVar12 = evmVar2.q;
                if (dzsjVar12 == null) {
                    adntVar = adntVar2;
                    dzsjVar12 = new evl(evmVar2, 17);
                    evmVar2.q = dzsjVar12;
                } else {
                    adntVar = adntVar2;
                }
                adnx adnxVar2 = new adnx(mq2, ij2, dzsjVar12);
                dzsj<abfa> mq3 = evmVar2.K.eW.mq();
                dzsj<adza> ij3 = evmVar2.K.eW.ij();
                dzsj dzsjVar13 = evmVar2.r;
                if (dzsjVar13 == null) {
                    adnxVar = adnxVar2;
                    dzsjVar13 = new evl(evmVar2, 22);
                    evmVar2.r = dzsjVar13;
                } else {
                    adnxVar = adnxVar2;
                }
                adob adobVar2 = new adob(mq3, ij3, dzsjVar13);
                dzsj<abfa> mq4 = evmVar2.K.eW.mq();
                dzsj<adza> ij4 = evmVar2.K.eW.ij();
                dzsj dzsjVar14 = evmVar2.s;
                if (dzsjVar14 == null) {
                    adobVar = adobVar2;
                    dzsjVar14 = new evl(evmVar2, 23);
                    evmVar2.s = dzsjVar14;
                } else {
                    adobVar = adobVar2;
                }
                adof adofVar2 = new adof(mq4, ij4, dzsjVar14);
                dzsj<abfa> mq5 = evmVar2.K.eW.mq();
                dzsj<adza> ij5 = evmVar2.K.eW.ij();
                dzsj dzsjVar15 = evmVar2.u;
                if (dzsjVar15 == null) {
                    adofVar = adofVar2;
                    dzsjVar15 = new evl(evmVar2, 24);
                    evmVar2.u = dzsjVar15;
                } else {
                    adofVar = adofVar2;
                }
                adoj adojVar2 = new adoj(mq5, ij5, dzsjVar15);
                dzsj<abfa> mq6 = evmVar2.K.eW.mq();
                dzsj<adza> ij6 = evmVar2.K.eW.ij();
                dzsj dzsjVar16 = evmVar2.H;
                if (dzsjVar16 == null) {
                    adojVar = adojVar2;
                    dzsjVar16 = new evl(evmVar2, 26);
                    evmVar2.H = dzsjVar16;
                } else {
                    adojVar = adojVar2;
                }
                return (T) new abhx(rw, dJ, fk, adclVar, c, c2, rE, c3, rG, c4, dxioVar, c6, c7, c8, adntVar, adnxVar, adobVar, adofVar, adojVar, new adon(mq6, ij6, dzsjVar16), evmVar2.K.rl());
            case 2:
                return (T) this.a.b();
            case 3:
                evm evmVar3 = this.a;
                abfa dJ2 = evmVar3.K.eW.dJ();
                adza fk2 = evmVar3.K.eW.fk();
                dzsj dzsjVar17 = evmVar3.c;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new evl(evmVar3, 4);
                    evmVar3.c = dzsjVar17;
                }
                return (T) new adeu(dJ2, fk2, dxjc.c(dzsjVar17));
            case 4:
                evm evmVar4 = this.a;
                btrm rz = evmVar4.K.eW.a.rz();
                dxjg.e(rz);
                evmVar4.K.eW.fk();
                abtz abtzVar = evmVar4.L;
                if (abtzVar == null) {
                    ftt fttVar = evmVar4.K;
                    dzsj<rb> dzsjVar18 = fttVar.eV;
                    dzsj<cqhn> il = fttVar.eW.il();
                    dzsj<abfa> mq7 = evmVar4.K.eW.mq();
                    dzsj<adza> ij7 = evmVar4.K.eW.ij();
                    dzsj dzsjVar19 = evmVar4.b;
                    if (dzsjVar19 == null) {
                        dzsjVar19 = new evl(evmVar4, 5);
                        evmVar4.b = dzsjVar19;
                    }
                    abtzVar = new abtz(dzsjVar18, il, mq7, ij7, dzsjVar19);
                    evmVar4.L = abtzVar;
                }
                ftt fttVar2 = evmVar4.K;
                return (T) new adfb(rz, abtzVar, fttVar2.a, fttVar2.lz());
            case 5:
                evm evmVar5 = this.a;
                ftt fttVar3 = evmVar5.K;
                return (T) new abus(fttVar3.eV, fttVar3.rr(), evmVar5.K.as());
            case 6:
                return (T) new adal(this.a.K.eW.fk());
            case 7:
                evm evmVar6 = this.a;
                return (T) new adgm(evmVar6.K.eW.dJ(), evmVar6.K.eW.fk(), evmVar6.K.rZ());
            case 8:
                evm evmVar7 = this.a;
                return (T) new adka(evmVar7.K.eW.dJ(), evmVar7.K.eW.fk(), evmVar7.K.sa());
            case 9:
                evm evmVar8 = this.a;
                return (T) new adan(new bssx(new bstj(), dxjc.c(evmVar8.K.m())), evmVar8.K.eW.fk());
            case 10:
                return (T) this.a.c();
            case 11:
                evm evmVar9 = this.a;
                abfa dJ3 = evmVar9.K.eW.dJ();
                adza fk3 = evmVar9.K.eW.fk();
                gga wk = evmVar9.K.wk();
                bvjj rB = evmVar9.K.eW.a.rB();
                dxjg.e(rB);
                btvo rp = evmVar9.K.eW.a.rp();
                dxjg.e(rp);
                return (T) new adhs(dJ3, fk3, new adiq(wk, rB, rp, dxjc.c(evmVar9.K.H()), dxjc.c(evmVar9.K.ai()), new cqhn()));
            case 12:
                evm evmVar10 = this.a;
                return (T) new adhn(new adhp(evmVar10.K.wk(), dxjc.c(evmVar10.K.tP())));
            case 13:
                evm evmVar11 = this.a;
                dzsj<gga> ad = evmVar11.K.ad();
                dzsj<huc> jg = evmVar11.K.jg();
                dzsj<cqhn> il2 = evmVar11.K.eW.il();
                dzsj<abfa> mq8 = evmVar11.K.eW.mq();
                dzsj dzsjVar20 = evmVar11.l;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new evl(evmVar11, 14);
                    evmVar11.l = dzsjVar20;
                }
                return (T) new adwp(ad, jg, il2, mq8, dzsjVar20, evmVar11.K.je());
            case 14:
                evm evmVar12 = this.a;
                return (T) new adxl(evmVar12.K.eW.mq(), evmVar12.e(), dxjh.c(evmVar12.d()), evmVar12.K.eW.hj(), evmVar12.K.ad(), dxjh.c(evmVar12.K.m()));
            case 15:
                evm evmVar13 = this.a;
                ftt fttVar4 = evmVar13.K;
                return (T) new adxf(fttVar4.eV, fttVar4.eW.il(), evmVar13.K.eW.k(), evmVar13.K.eW.kf(), dxjh.c(evmVar13.d()));
            case 16:
                evm evmVar14 = this.a;
                return (T) new adyg(evmVar14.K.wk(), dxjc.c(evmVar14.K.eW.mq()), dxjc.c(evmVar14.K.pC()), dxjc.c(evmVar14.K.m()), dxjc.c(evmVar14.K.az()));
            case 17:
                evm evmVar15 = this.a;
                return (T) new adws(evmVar15.K.ad(), evmVar15.K.jg(), evmVar15.K.eW.il(), evmVar15.f(), evmVar15.K.je());
            case 18:
                evm evmVar16 = this.a;
                dzsj<adxf> e = evmVar16.e();
                dzsj dzsjVar21 = evmVar16.p;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new evl(evmVar16, 19);
                    evmVar16.p = dzsjVar21;
                }
                return (T) new adxh(e, dzsjVar21);
            case 19:
                evm evmVar17 = this.a;
                dzsj<gga> ad2 = evmVar17.K.ad();
                dzsj dzsjVar22 = evmVar17.o;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new evl(evmVar17, 20);
                    evmVar17.o = dzsjVar22;
                }
                return (T) new ahds(ad2, dzsjVar22, dxjh.c(evmVar17.K.m()));
            case 20:
                evm evmVar18 = this.a;
                dzsj<cqhn> il3 = evmVar18.K.eW.il();
                dzsj<gga> ad3 = evmVar18.K.ad();
                dzsj<akfa> p = evmVar18.K.eW.p();
                dzsj dzsjVar23 = evmVar18.n;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new evl(evmVar18, 21);
                    evmVar18.n = dzsjVar23;
                }
                return (T) new ahfo(il3, ad3, p, dzsjVar23, evmVar18.K.lK(), evmVar18.K.eW.hj(), evmVar18.K.eW.kb(), evmVar18.K.eW.Q(), evmVar18.K.lL());
            case 21:
                evm evmVar19 = this.a;
                return (T) new ahha(evmVar19.K.eW.il(), evmVar19.K.ad(), evmVar19.K.lK(), evmVar19.K.eW.kb(), evmVar19.K.eW.Q(), evmVar19.K.lL());
            case 22:
                evm evmVar20 = this.a;
                return (T) new adxc(evmVar20.K.ad(), evmVar20.K.jg(), evmVar20.K.eW.il(), evmVar20.f(), evmVar20.K.je());
            case 23:
                evm evmVar21 = this.a;
                return (T) new adxr(evmVar21.K.ad(), evmVar21.K.eW.il(), evmVar21.e(), evmVar21.f());
            case 24:
                evm evmVar22 = this.a;
                dzsj<gga> ad4 = evmVar22.K.ad();
                dzsj<huc> jg2 = evmVar22.K.jg();
                dzsj<cqhn> il4 = evmVar22.K.eW.il();
                dzsj dzsjVar24 = evmVar22.t;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new evl(evmVar22, 25);
                    evmVar22.t = dzsjVar24;
                }
                return (T) new adyf(ad4, jg2, il4, dzsjVar24, evmVar22.K.je());
            case 25:
                evm evmVar23 = this.a;
                return (T) new adxp(evmVar23.K.eW.il(), evmVar23.e(), evmVar23.K.aH());
            case 26:
                evm evmVar24 = this.a;
                ftt fttVar5 = evmVar24.K;
                dzsj<rb> dzsjVar25 = fttVar5.eV;
                dzsj<acyf> dzsjVar26 = evmVar24.J;
                dzsj<cqhn> il5 = fttVar5.eW.il();
                dzsj<akfa> p2 = evmVar24.K.eW.p();
                dzsj<abfa> mq9 = evmVar24.K.eW.mq();
                dzsj<btrm> n = evmVar24.K.eW.n();
                dzsj<akox> as = evmVar24.K.as();
                dzsj<agal> lJ = evmVar24.K.lJ();
                dzsj<agaw> lK = evmVar24.K.lK();
                dzsj<axjh> cP = evmVar24.K.cP();
                dzsj<btvo> V = evmVar24.K.eW.V();
                dzsj dzsjVar27 = evmVar24.v;
                if (dzsjVar27 == null) {
                    dzsjVar27 = new evl(evmVar24, 27);
                    evmVar24.v = dzsjVar27;
                }
                dzsj dzsjVar28 = dzsjVar27;
                dzsj dzsjVar29 = evmVar24.w;
                if (dzsjVar29 == null) {
                    dzsjVar29 = new evl(evmVar24, 29);
                    evmVar24.w = dzsjVar29;
                }
                dzsj dzsjVar30 = dzsjVar29;
                dzsj dzsjVar31 = evmVar24.x;
                if (dzsjVar31 == null) {
                    dzsjVar31 = new evl(evmVar24, 30);
                    evmVar24.x = dzsjVar31;
                }
                dzsj dzsjVar32 = dzsjVar31;
                dzsj dzsjVar33 = evmVar24.B;
                if (dzsjVar33 == null) {
                    dzsjVar33 = new evl(evmVar24, 31);
                    evmVar24.B = dzsjVar33;
                }
                dzsj dzsjVar34 = dzsjVar33;
                dzsj dzsjVar35 = evmVar24.C;
                if (dzsjVar35 == null) {
                    dzsjVar35 = new evl(evmVar24, 35);
                    evmVar24.C = dzsjVar35;
                }
                dzsj dzsjVar36 = dzsjVar35;
                dzsj dzsjVar37 = evmVar24.D;
                if (dzsjVar37 == null) {
                    dzsjVar37 = new evl(evmVar24, 36);
                    evmVar24.D = dzsjVar37;
                }
                dzsj dzsjVar38 = dzsjVar37;
                dzsj dzsjVar39 = evmVar24.G;
                if (dzsjVar39 == null) {
                    dzsjVar39 = new evl(evmVar24, 37);
                    evmVar24.G = dzsjVar39;
                }
                return (T) new adyw(dzsjVar25, dzsjVar26, il5, p2, mq9, n, as, lJ, lK, cP, V, dzsjVar28, dzsjVar30, dzsjVar32, dzsjVar34, dzsjVar36, dzsjVar38, dzsjVar39);
            case 27:
                return (T) new advx(this.a.g());
            case 28:
                evm evmVar25 = this.a;
                cqhn cqhnVar = new cqhn();
                abfa dJ4 = evmVar25.K.eW.dJ();
                gga wk2 = evmVar25.K.wk();
                isd jm = evmVar25.K.jm();
                cklf cp = evmVar25.K.cp();
                ania qq = evmVar25.K.eW.qq();
                dxio c9 = dxjc.c(evmVar25.K.bh());
                dxio c10 = dxjc.c(evmVar25.K.fh());
                dxio c11 = dxjc.c(evmVar25.K.aV());
                dehq tf = evmVar25.K.eW.a.tf();
                dxjg.e(tf);
                return (T) new adyo(cqhnVar, dJ4, wk2, jm, cp, qq, c9, c10, c11, tf);
            case 29:
                return (T) new advz(this.a.g());
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return (T) this.a.h();
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                evm evmVar26 = this.a;
                dzsj<gga> ad5 = evmVar26.K.ad();
                dzsj<bwqv> er = evmVar26.K.eW.er();
                dzsj<abfa> mq10 = evmVar26.K.eW.mq();
                dzsj c12 = dxjh.c(evmVar26.K.aR());
                dzsj c13 = dxjh.c(evmVar26.K.m());
                dzsj dzsjVar40 = evmVar26.A;
                if (dzsjVar40 == null) {
                    dzsjVar40 = new evl(evmVar26, 32);
                    evmVar26.A = dzsjVar40;
                }
                return (T) new adxu(new adxw(ad5, er, mq10, c12, c13, dzsjVar40, evmVar26.e(), dxjh.c(evmVar26.K.bf()), evmVar26.K.cP(), evmVar26.i(), evmVar26.g(), evmVar26.J, evmVar26.K.eW.V()));
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                evm evmVar27 = this.a;
                ftt fttVar6 = evmVar27.K;
                dzsj<rb> dzsjVar41 = fttVar6.eV;
                dzsj<cqhn> il6 = fttVar6.eW.il();
                dzsj<Executor> di = evmVar27.K.eW.di();
                dzsj<akdv> P = evmVar27.K.P();
                fyu fyuVar = evmVar27.K.eW;
                dzsj dzsjVar42 = fyuVar.dv;
                if (dzsjVar42 == null) {
                    dzsjVar42 = new fxy(fyuVar, 672);
                    fyuVar.dv = dzsjVar42;
                }
                dzsj dzsjVar43 = evmVar27.z;
                if (dzsjVar43 == null) {
                    dzsjVar43 = new evl(evmVar27, 33);
                    evmVar27.z = dzsjVar43;
                }
                return (T) new adwz(dzsjVar41, il6, di, P, dzsjVar42, dzsjVar43);
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                evm evmVar28 = this.a;
                T t = (T) evmVar28.y;
                if (t != null) {
                    return t;
                }
                dxio c14 = dxjc.c(evmVar28.K.eW.h());
                bvrb tn = evmVar28.K.eW.a.tn();
                dxjg.e(tn);
                ?? r2 = (T) bvar.b(bvaq.b(c14, tn));
                evmVar28.y = r2;
                return r2;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return (T) new adwv(this.a.K.eW.il());
            case 35:
                evm evmVar29 = this.a;
                return (T) new adxz(new adyb(evmVar29.K.eW.il(), evmVar29.K.eW.mq(), dxjh.c(evmVar29.K.aR()), evmVar29.K.eW.n(), evmVar29.K.eW.fr(), evmVar29.e(), evmVar29.K.kb(), evmVar29.K.cP(), evmVar29.i(), evmVar29.K.aH(), evmVar29.K.eW.nd(), evmVar29.g(), evmVar29.J));
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                evm evmVar30 = this.a;
                return (T) new adwb(new adwd(evmVar30.K.ad(), evmVar30.K.eW.il(), evmVar30.K.eW.mq(), evmVar30.e(), evmVar30.g(), dxjh.c(evmVar30.d())));
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                evm evmVar31 = this.a;
                dzsj<gga> ad6 = evmVar31.K.ad();
                dzsj<abfa> mq11 = evmVar31.K.eW.mq();
                dzsj c15 = dxjh.c(evmVar31.d());
                dzsj c16 = dxjh.c(evmVar31.K.x());
                dzsj<adxf> e2 = evmVar31.e();
                dzsj dzsjVar44 = evmVar31.E;
                if (dzsjVar44 == null) {
                    dzsjVar44 = new evl(evmVar31, 38);
                    evmVar31.E = dzsjVar44;
                }
                dzsj dzsjVar45 = dzsjVar44;
                dzsj dzsjVar46 = evmVar31.F;
                if (dzsjVar46 == null) {
                    dzsjVar46 = new evl(evmVar31, 39);
                    evmVar31.F = dzsjVar46;
                }
                return (T) new adwj(new adwm(ad6, mq11, c15, c16, e2, dzsjVar45, dzsjVar46, evmVar31.K.eW.hj(), evmVar31.g()));
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                evm evmVar32 = this.a;
                rb rbVar = evmVar32.K.a;
                cqhn cqhnVar2 = new cqhn();
                beya qy = evmVar32.K.qy();
                bfaq aE = evmVar32.K.aE();
                bfct sK = evmVar32.K.sK();
                bfbc qD = evmVar32.K.qD();
                dxio c17 = dxjc.c(evmVar32.K.eW.p());
                akdv O = evmVar32.K.O();
                dxio c18 = dxjc.c(evmVar32.K.eW.im());
                bvrb tn2 = evmVar32.K.eW.a.tn();
                dxjg.e(tn2);
                return (T) new bfcn(rbVar, cqhnVar2, qy, aE, sK, qD, c17, O, c18, tn2);
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return (T) new adwg(this.a.K.eW.il());
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                evm evmVar33 = this.a;
                ftt fttVar7 = evmVar33.K;
                return (T) new aebg(new aebd(new adnk(new adnp(fttVar7.a, dxjc.c(fttVar7.H()), evmVar33.K.eW.dG(), new cqhn(), evmVar33.K.eW.g()), new aeep(dxjc.c(evmVar33.K.eW.R())), evmVar33.K.eW.dG())), dxjc.c(evmVar33.K.ua()), evmVar33.j(), new cqhn());
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return (T) this.a.k();
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                evm evmVar34 = this.a;
                gga wk3 = evmVar34.K.wk();
                bvjj rB2 = evmVar34.K.eW.a.rB();
                dxjg.e(rB2);
                btrm rz2 = evmVar34.K.eW.a.rz();
                dxjg.e(rz2);
                akox ap = evmVar34.K.ap();
                aetv hi = evmVar34.K.hi();
                dxio c19 = dxjc.c(evmVar34.K.eW.im());
                dxio c20 = dxjc.c(evmVar34.K.eW.k());
                dxio c21 = dxjc.c(evmVar34.K.eW.oa());
                axrg aH = evmVar34.K.eW.aH();
                cjqq tp = evmVar34.K.eW.a.tp();
                dxjg.e(tp);
                cqat rR = evmVar34.K.eW.a.rR();
                dxjg.e(rR);
                return (T) new awrc(wk3, rB2, rz2, ap, hi, c19, c20, c21, aH, tp, rR, new cpv());
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return (T) this.a.l();
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                evm evmVar35 = this.a;
                dxio c22 = dxjc.c(evmVar35.K.K());
                cjnf dc = evmVar35.K.dc();
                evmVar35.K.B();
                dxio c23 = dxjc.c(evmVar35.K.eW.im());
                dxio c24 = dxjc.c(evmVar35.K.eW.hN());
                gga wk4 = evmVar35.K.wk();
                adza fk4 = evmVar35.K.eW.fk();
                btvo rp2 = evmVar35.K.eW.a.rp();
                dxjg.e(rp2);
                return (T) new aeef(c22, dc, c23, c24, wk4, fk4, rp2);
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                evm evmVar36 = this.a;
                dxio c25 = dxjc.c(evmVar36.K.K());
                jmc B = evmVar36.K.B();
                dxio c26 = dxjc.c(evmVar36.K.eW.im());
                dxio c27 = dxjc.c(evmVar36.K.eW.hN());
                gga wk5 = evmVar36.K.wk();
                btvo rp3 = evmVar36.K.eW.a.rp();
                dxjg.e(rp3);
                bvjj rB3 = evmVar36.K.eW.a.rB();
                dxjg.e(rB3);
                return (T) new aeei(c25, B, c26, c27, wk5, rp3, rB3);
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                evm evmVar37 = this.a;
                ftt fttVar8 = evmVar37.K;
                rb rbVar2 = fttVar8.a;
                dxio c28 = dxjc.c(fttVar8.eW.im());
                dxio c29 = dxjc.c(evmVar37.K.eW.iU());
                dxio c30 = dxjc.c(evmVar37.K.eW.ie());
                dxio c31 = dxjc.c(evmVar37.K.K());
                cqat rR2 = evmVar37.K.eW.a.rR();
                dxjg.e(rR2);
                return (T) new gcs(rbVar2, c28, c29, c30, c31, rR2, dxjc.c(evmVar37.K.tx()));
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                evm evmVar38 = this.a;
                return (T) new aeem(dxjc.c(evmVar38.K.eW.im()), dxjc.c(evmVar38.K.eW.ik()), evmVar38.K.wk(), dxjc.c(evmVar38.K.tx()), dxjc.c(evmVar38.K.eW.ii()));
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                evm evmVar39 = this.a;
                return (T) new aeek(dxjc.c(evmVar39.K.eW.im()), dxjc.c(evmVar39.K.eW.ik()), evmVar39.K.wk(), dxjc.c(evmVar39.K.tx()));
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                evm evmVar40 = this.a;
                dxio c32 = dxjc.c(evmVar40.K.fy());
                dxio c33 = dxjc.c(evmVar40.K.eW.ie());
                dxio c34 = dxjc.c(evmVar40.K.eW.iU());
                dehq tf2 = evmVar40.K.eW.a.tf();
                dxjg.e(tf2);
                bvjj rB4 = evmVar40.K.eW.a.rB();
                dxjg.e(rB4);
                return (T) new gcr(c32, c33, c34, tf2, rB4);
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                evm evmVar41 = this.a;
                Context b = evmVar41.K.eW.a.b();
                dxjg.e(b);
                dxio c35 = dxjc.c(evmVar41.K.eW.iU());
                cjqy tr = evmVar41.K.eW.a.tr();
                dxjg.e(tr);
                return (T) new gcn(b, c35, tr);
            default:
                evm evmVar42 = this.a;
                return (T) new aefj(evmVar42.K.ad(), evmVar42.K.aK());
        }
    }
}
