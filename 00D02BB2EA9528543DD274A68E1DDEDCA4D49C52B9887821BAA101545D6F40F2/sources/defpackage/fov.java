package defpackage;

import android.content.res.Resources;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fov  reason: default package */
/* loaded from: classes6.dex */
public final class fov<T> implements dzsj<T> {
    final /* synthetic */ fow a;
    private final int b;

    public fov(fow fowVar, int i) {
        this.a = fowVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        cigg ciggVar;
        cixn cixnVar;
        switch (this.b) {
            case 0:
                fow fowVar = this.a;
                dzsj<gga> ad = fowVar.z.ad();
                dzsj<cqhn> il = fowVar.z.eW.il();
                dzsj<Executor> di = fowVar.z.eW.di();
                dzsj dzsjVar = fowVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new fov(fowVar, 1);
                    fowVar.a = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = fowVar.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fov(fowVar, 2);
                    fowVar.b = dzsjVar3;
                }
                return (T) new cizn(ad, il, di, dzsjVar2, dzsjVar3, fowVar.z.eW.V());
            case 1:
                fow fowVar2 = this.a;
                return (T) new cizc(fowVar2.z.eW.di(), fowVar2.z.eW.il(), fowVar2.z.eS(), fowVar2.z.eW.fd(), fowVar2.z.eW.bu(), fowVar2.z.lf(), fowVar2.z.eW.ie());
            case 2:
                fow fowVar3 = this.a;
                return (T) new ciyn(fowVar3.z.ad(), fowVar3.z.eW.il(), fowVar3.z.eS(), fowVar3.z.eW.R(), fowVar3.z.eW.di());
            case 3:
                fow fowVar4 = this.a;
                ftt fttVar = fowVar4.z;
                cist cistVar = new cist(fttVar.eV, fttVar.fe(), dxjh.c(fowVar4.z.m()), fowVar4.z.eW.kY());
                dzsj<Executor> di2 = fowVar4.z.eW.di();
                dzsj dzsjVar4 = fowVar4.c;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fov(fowVar4, 4);
                    fowVar4.c = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj<caxn> kY = fowVar4.z.eW.kY();
                dzsj dzsjVar6 = fowVar4.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fov(fowVar4, 5);
                    fowVar4.d = dzsjVar6;
                }
                ciuc ciucVar = new ciuc(di2, dzsjVar5, kY, dzsjVar6, fowVar4.z.vi(), fowVar4.z.eW.V(), fowVar4.z.je());
                ftt fttVar2 = fowVar4.z;
                cisy cisyVar = new cisy(fttVar2.eV, fttVar2.fe(), dxjh.c(fowVar4.z.m()), fowVar4.z.eW.kY());
                citd citdVar = new citd(fowVar4.z.aV());
                ciux ciuxVar = new ciux(fowVar4.z.J());
                fowVar4.z.eW.I();
                fowVar4.z.eW.fr();
                fowVar4.z.eW.il();
                fowVar4.z.eW.di();
                dzsj<Executor> di3 = fowVar4.z.eW.di();
                dzsj c = dxjh.c(fowVar4.z.eW.il());
                dzsj dzsjVar7 = fowVar4.e;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fov(fowVar4, 6);
                    fowVar4.e = dzsjVar7;
                }
                cirp cirpVar = new cirp(di3, c, dxjh.c(dzsjVar7));
                fowVar4.z.vp();
                cirv cirvVar = new cirv(fowVar4.z.eV);
                dxjg.e(fowVar4.z.eW.a.rp());
                return (T) new cisi(cistVar, ciucVar, cisyVar, citdVar, ciuxVar, cirpVar, cirvVar);
            case 4:
                return (T) new citl();
            case 5:
                return (T) new cish(this.a.z.eV);
            case 6:
                return (T) new bzqn(dxjh.c(this.a.z.eW.ie()));
            case 7:
                fow fowVar5 = this.a;
                btvo rp = fowVar5.z.eW.a.rp();
                dxjg.e(rp);
                chsf gF = fowVar5.z.gF();
                cicx cicxVar = new cicx(fowVar5.z.eW.il(), fowVar5.z.eW.lL(), dxjh.c(fowVar5.z.eW.iU()), dxjh.c(fowVar5.z.eW.ie()));
                cibd cibdVar = new cibd(fowVar5.z.eW.lL(), fowVar5.z.eW.aI(), fowVar5.z.eW.V(), fowVar5.z.eW.k());
                cioz ciozVar = new cioz(fowVar5.z.eW.R());
                ciqy ciqyVar = new ciqy(fowVar5.c(), fowVar5.z.eW.V());
                dzsj dzsjVar8 = fowVar5.f;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fov(fowVar5, 9);
                    fowVar5.f = dzsjVar8;
                }
                cimh cimhVar = new cimh(dzsjVar8);
                dzsj<cqhn> il2 = fowVar5.z.eW.il();
                dzsj dzsjVar9 = fowVar5.g;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fov(fowVar5, 10);
                    fowVar5.g = dzsjVar9;
                }
                cilv cilvVar = new cilv(il2, dzsjVar9, fowVar5.z.eW.V());
                dzsj<gga> ad2 = fowVar5.z.ad();
                dzsj dzsjVar10 = fowVar5.h;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fov(fowVar5, 11);
                    fowVar5.h = dzsjVar10;
                }
                dzsj<axwi> el = fowVar5.z.eW.el();
                dzsj dzsjVar11 = fowVar5.i;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fov(fowVar5, 12);
                    fowVar5.i = dzsjVar11;
                }
                cihk cihkVar = new cihk(ad2, dzsjVar10, el, dzsjVar11);
                fowVar5.d();
                dzsj dzsjVar12 = fowVar5.j;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fov(fowVar5, 13);
                    fowVar5.j = dzsjVar12;
                }
                cixn cixnVar2 = new cixn(new cixr(dzsjVar12));
                cijg cijgVar = new cijg(fowVar5.z.ad(), fowVar5.z.eW.il(), fowVar5.z.eW.el());
                cigg ciggVar2 = new cigg(fowVar5.z.ad(), fowVar5.z.eW.el());
                dzsj dzsjVar13 = fowVar5.l;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fov(fowVar5, 14);
                    fowVar5.l = dzsjVar13;
                }
                dzsj dzsjVar14 = fowVar5.m;
                if (dzsjVar14 == null) {
                    ciggVar = ciggVar2;
                    dzsjVar14 = new fov(fowVar5, 16);
                    fowVar5.m = dzsjVar14;
                } else {
                    ciggVar = ciggVar2;
                }
                ciht cihtVar = new ciht(dzsjVar13, dzsjVar14, fowVar5.z.eW.el());
                dzsj dzsjVar15 = fowVar5.o;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fov(fowVar5, 17);
                    fowVar5.o = dzsjVar15;
                }
                ciei cieiVar = new ciei(dzsjVar15);
                ciem ciemVar = new ciem(fowVar5.z.eV);
                dzsj<rb> dzsjVar16 = fowVar5.z.eV;
                dzsj dzsjVar17 = fowVar5.p;
                if (dzsjVar17 == null) {
                    cixnVar = cixnVar2;
                    dzsjVar17 = new fov(fowVar5, 19);
                    fowVar5.p = dzsjVar17;
                } else {
                    cixnVar = cixnVar2;
                }
                cifd cifdVar = new cifd(ciemVar, new ciff(dzsjVar16, dzsjVar17), new cifh(fowVar5.z.eV));
                dxio c2 = dxjc.c(fowVar5.e());
                dzsj dzsjVar18 = fowVar5.t;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new fov(fowVar5, 22);
                    fowVar5.t = dzsjVar18;
                }
                dxio c3 = dxjc.c(dzsjVar18);
                dzsj dzsjVar19 = fowVar5.u;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fov(fowVar5, 25);
                    fowVar5.u = dzsjVar19;
                }
                return (T) new cibe(rp, gF, cicxVar, cibdVar, ciozVar, ciqyVar, cimhVar, cilvVar, cihkVar, cixnVar, cijgVar, ciggVar, cihtVar, cieiVar, cifdVar, c2, c3, dxjc.c(dzsjVar19));
            case 8:
                return (T) this.a.b();
            case 9:
                return (T) new cinw(this.a.c());
            case 10:
                return (T) new cing();
            case 11:
                return (T) new aymh(this.a.z.a);
            case 12:
                fow fowVar6 = this.a;
                ftt fttVar3 = fowVar6.z;
                return (T) new aywr(fttVar3.eV, fttVar3.eW.il(), fowVar6.z.fe());
            case 13:
                return (T) this.a.d();
            case 14:
                fow fowVar7 = this.a;
                dzsj<chyy> c4 = fowVar7.c();
                dzsj dzsjVar20 = fowVar7.k;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fov(fowVar7, 15);
                    fowVar7.k = dzsjVar20;
                }
                return (T) new cikf(c4, dzsjVar20, fowVar7.z.pl(), fowVar7.z.az());
            case 15:
                fow fowVar8 = this.a;
                return (T) new aybq(fowVar8.z.ad(), fowVar8.z.eW.jd(), dxjh.c(fowVar8.z.tV()));
            case 16:
                fow fowVar9 = this.a;
                return (T) new cigp(fowVar9.z.ad(), fowVar9.z.eW.el());
            case 17:
                fow fowVar10 = this.a;
                dzsj dzsjVar21 = fowVar10.n;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fov(fowVar10, 18);
                    fowVar10.n = dzsjVar21;
                }
                return (T) new ciek(dzsjVar21);
            case 18:
                return (T) new ciej(this.a.z.ad());
            case 19:
                return (T) new cifv();
            case 20:
                fow fowVar11 = this.a;
                dzsj<cqhn> il3 = fowVar11.z.eW.il();
                dzsj<Resources> fr = fowVar11.z.eW.fr();
                dzsj dzsjVar22 = fowVar11.q;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new fov(fowVar11, 21);
                    fowVar11.q = dzsjVar22;
                }
                return (T) new cjae(il3, fr, dzsjVar22);
            case 21:
                return (T) new cjac();
            case 22:
                fow fowVar12 = this.a;
                dzsj<ccgr> fd = fowVar12.z.eW.fd();
                dzsj dzsjVar23 = fowVar12.r;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new fov(fowVar12, 23);
                    fowVar12.r = dzsjVar23;
                }
                dzsj c5 = dxjh.c(dzsjVar23);
                dzsj dzsjVar24 = fowVar12.s;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new fov(fowVar12, 24);
                    fowVar12.s = dzsjVar24;
                }
                return (T) new cira(fd, c5, dzsjVar24);
            case 23:
                return (T) new chjx(this.a.z.eW.fr());
            case 24:
                return (T) chiv.b(this.a.z.a);
            case 25:
                return (T) new cirk();
            case 26:
                fow fowVar13 = this.a;
                cqhn cqhnVar = new cqhn();
                ccgr fc = fowVar13.z.eW.fc();
                Executor sU = fowVar13.z.eW.a.sU();
                dxjg.e(sU);
                caxo ff = fowVar13.z.ff();
                caxa caxaVar = caxa.CREATOR_ZONE;
                dxjg.f(caxaVar);
                return (T) cayk.b(cqhnVar, fc, sU, ff, caxaVar);
            case 27:
                fow fowVar14 = this.a;
                dzsj<bvrb> R = fowVar14.z.eW.R();
                dzsj c6 = dxjh.c(fowVar14.z.qw());
                dzsj c7 = dxjh.c(fowVar14.z.gA());
                dzsj c8 = dxjh.c(fowVar14.z.tk());
                dzsj c9 = dxjh.c(fowVar14.z.vq());
                dzsj c10 = dxjh.c(fowVar14.z.rn());
                ftt fttVar4 = fowVar14.z;
                dzsj dzsjVar25 = fttVar4.ch;
                if (dzsjVar25 == null) {
                    dzsjVar25 = new fns(fttVar4, 1241);
                    fttVar4.ch = dzsjVar25;
                }
                return (T) new chrl(R, c6, c7, c8, c9, c10, dxjh.c(dzsjVar25), dxjh.c(fowVar14.z.fF()));
            case 28:
                fow fowVar15 = this.a;
                dzsj<buva> vr = fowVar15.z.vr();
                dzsj dzsjVar26 = fowVar15.v;
                if (dzsjVar26 == null) {
                    dzsjVar26 = new fov(fowVar15, 29);
                    fowVar15.v = dzsjVar26;
                }
                dzsj dzsjVar27 = dzsjVar26;
                dzsj dzsjVar28 = fowVar15.w;
                if (dzsjVar28 == null) {
                    dzsjVar28 = new fov(fowVar15, 30);
                    fowVar15.w = dzsjVar28;
                }
                dzsj dzsjVar29 = dzsjVar28;
                ftt fttVar5 = fowVar15.z;
                dzsj dzsjVar30 = fttVar5.ex;
                if (dzsjVar30 == null) {
                    dzsjVar30 = new fns(fttVar5, 1428);
                    fttVar5.ex = dzsjVar30;
                }
                return (T) new chnt(vr, dzsjVar27, dzsjVar29, dzsjVar30, fowVar15.z.eW.aw(), fowVar15.z.eW.V(), fowVar15.z.eW.fr(), fowVar15.z.eW.di());
            case 29:
                fow fowVar16 = this.a;
                dzsj<bvrb> R2 = fowVar16.z.eW.R();
                ftt fttVar6 = fowVar16.z;
                return (T) new chnz(R2, fttVar6.eV, fttVar6.eW.bk(), fowVar16.z.eW.di());
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                fow fowVar17 = this.a;
                dzsj<btvo> V = fowVar17.z.eW.V();
                dzsj<bvjj> aw = fowVar17.z.eW.aw();
                ftt fttVar7 = fowVar17.z;
                return (T) new chrz(V, aw, fttVar7.eV, fttVar7.eW.bk(), dxjh.c(fowVar17.z.cQ()));
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                fow fowVar18 = this.a;
                return (T) new chrv(fowVar18.z.eW.R(), fowVar18.z.eW.di());
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                fow fowVar19 = this.a;
                dzsj<Executor> di4 = fowVar19.z.eW.di();
                dzsj<bbpv> ba = fowVar19.z.eW.ba();
                dzsj<bbrq> jb = fowVar19.z.eW.jb();
                dzsj<chhr> uu = fowVar19.z.uu();
                dzsj<ccrh> uA = fowVar19.z.uA();
                dzsj dzsjVar31 = fowVar19.x;
                if (dzsjVar31 == null) {
                    dzsjVar31 = new fov(fowVar19, 33);
                    fowVar19.x = dzsjVar31;
                }
                dzsj dzsjVar32 = dzsjVar31;
                dzsj<akfa> p = fowVar19.z.eW.p();
                dzsj<cctn> uy = fowVar19.z.uy();
                dzsj<ccru> uB = fowVar19.z.uB();
                dzsj dzsjVar33 = fowVar19.y;
                if (dzsjVar33 == null) {
                    dzsjVar33 = new fov(fowVar19, 34);
                    fowVar19.y = dzsjVar33;
                }
                return (T) new ccsk(di4, ba, jb, uu, uA, dzsjVar32, p, uy, uB, dzsjVar33);
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                fow fowVar20 = this.a;
                Executor sU2 = fowVar20.z.eW.a.sU();
                dxjg.e(sU2);
                return (T) new ccrf(sU2, new cctt(fowVar20.z.wk()));
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                fow fowVar21 = this.a;
                gga wk = fowVar21.z.wk();
                Executor sU3 = fowVar21.z.eW.a.sU();
                dxjg.e(sU3);
                return (T) new cctx(wk, sU3, fowVar21.z.kr(), fowVar21.z.aB());
            case 35:
                return (T) new chnn();
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                fow fowVar22 = this.a;
                dxio c11 = dxjc.c(fowVar22.z.eW.at());
                dxio c12 = dxjc.c(fowVar22.z.eW.V());
                dxio c13 = dxjc.c(fowVar22.z.T());
                dxio c14 = dxjc.c(fowVar22.z.eW.p());
                ftt fttVar8 = fowVar22.z;
                return (T) new chrg(c11, c12, c13, c14, fttVar8.a, fttVar8.eW.aH(), dxjc.c(fowVar22.z.lD()), dxjc.c(fowVar22.z.eW.aw()));
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                dxjg.e(this.a.z.eW.a.rB());
                return (T) new chrh();
            default:
                fow fowVar23 = this.a;
                return (T) new chtc(fowVar23.z.eW.di(), fowVar23.z.eW.V(), fowVar23.z.vi(), fowVar23.z.eW.at());
        }
    }
}
