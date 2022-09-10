package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fol  reason: default package */
/* loaded from: classes6.dex */
public final class fol<T> implements dzsj<T> {
    final /* synthetic */ fom a;
    private final int b;

    public fol(fom fomVar, int i) {
        this.a = fomVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fom fomVar = this.a;
                dzsj<Resources> fr = fomVar.p.eW.fr();
                dzsj dzsjVar = fomVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new fol(fomVar, 1);
                    fomVar.a = dzsjVar;
                }
                return (T) new apii(fr, dzsjVar, fomVar.p.eW.al(), fomVar.e());
            case 1:
                fom fomVar2 = this.a;
                return (T) new apim(fomVar2.p.eW.er(), fomVar2.p.eW.oB(), fomVar2.p.ad(), fomVar2.p.eW.lL(), fomVar2.e());
            case 2:
                return (T) this.a.d();
            case 3:
                fom fomVar3 = this.a;
                dzsj<Resources> fr2 = fomVar3.p.eW.fr();
                dzsj dzsjVar2 = fomVar3.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fol(fomVar3, 4);
                    fomVar3.b = dzsjVar2;
                }
                return (T) new apip(fr2, dzsjVar2, fomVar3.p.eW.al(), fomVar3.e());
            case 4:
                fom fomVar4 = this.a;
                return (T) new apis(fomVar4.p.eW.er(), fomVar4.p.ad(), fomVar4.p.eW.lL(), fomVar4.e());
            case 5:
                fom fomVar5 = this.a;
                dzsj dzsjVar3 = fomVar5.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fol(fomVar5, 6);
                    fomVar5.d = dzsjVar3;
                }
                dzsj dzsjVar4 = fomVar5.e;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fol(fomVar5, 8);
                    fomVar5.e = dzsjVar4;
                }
                dzsj dzsjVar5 = fomVar5.f;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fol(fomVar5, 9);
                    fomVar5.f = dzsjVar5;
                }
                return (T) new apjg(dzsjVar3, dzsjVar4, dzsjVar5, fomVar5.e());
            case 6:
                fom fomVar6 = this.a;
                dzsj<gga> ad = fomVar6.p.ad();
                dzsj<bwqv> er = fomVar6.p.eW.er();
                dzsj<aphj> e = fomVar6.e();
                dzsj dzsjVar6 = fomVar6.c;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fol(fomVar6, 7);
                    fomVar6.c = dzsjVar6;
                }
                return (T) new apid(ad, er, e, dzsjVar6);
            case 7:
                return (T) this.a.f();
            case 8:
                fom fomVar7 = this.a;
                dzsj<angv> jE = fomVar7.p.eW.jE();
                dzsj<cqat> K = fomVar7.p.eW.K();
                dzsj<cqhn> il = fomVar7.p.eW.il();
                dzsj<gga> ad2 = fomVar7.p.ad();
                dzsj c = dxjh.c(fomVar7.p.eW.jB());
                ftt fttVar = fomVar7.p;
                dzsj dzsjVar7 = fttVar.cM;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fns(fttVar, 1313);
                    fttVar.cM = dzsjVar7;
                }
                return (T) new apiy(jE, K, il, ad2, c, dzsjVar7, fomVar7.p.eW.di(), fomVar7.p.aX(), fomVar7.p.az());
            case 9:
                fom fomVar8 = this.a;
                return (T) new aphy(fomVar8.p.ad(), fomVar8.p.eW.er());
            case 10:
                return (T) this.a.g();
            case 11:
                return (T) new aphc(this.a.p.eW.fr());
            case 12:
                fom fomVar9 = this.a;
                return (T) new apgk(fomVar9.p.ad(), fomVar9.p.eW.oC());
            case 13:
                return (T) this.a.h();
            case 14:
                fom fomVar10 = this.a;
                cqat rR = fomVar10.p.eW.a.rR();
                dxjg.e(rR);
                angw jF = fomVar10.p.eW.jF();
                aovf<eapy, aogo> b = fomVar10.b();
                cjqy tr = fomVar10.p.eW.a.tr();
                dxjg.e(tr);
                return (T) anja.b(rR, jF, b, tr);
            case 15:
                cqat rR2 = this.a.p.eW.a.rR();
                dxjg.e(rR2);
                return (T) anjb.b(rR2);
            case 16:
                fom fomVar11 = this.a;
                rb rbVar = fomVar11.p.a;
                aniz h = fomVar11.h();
                apjz ho = fomVar11.p.eW.ho();
                Application a = fomVar11.p.eW.a.a();
                dxjg.e(a);
                aobv aobvVar = new aobv(a, fomVar11.p.eW.ho(), fomVar11.g());
                anhg aW = fomVar11.p.aW();
                cjqy tr2 = fomVar11.p.eW.a.tr();
                dxjg.e(tr2);
                return (T) new aobn(rbVar, h, ho, aobvVar, aW, tr2, new cpv());
            case 17:
                fom fomVar12 = this.a;
                ftt fttVar2 = fomVar12.p;
                dzsj<rb> dzsjVar8 = fttVar2.eV;
                dzsj<cqat> K2 = fttVar2.eW.K();
                dzsj dzsjVar9 = fomVar12.g;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fol(fomVar12, 18);
                    fomVar12.g = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj dzsjVar11 = fomVar12.h;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fol(fomVar12, 19);
                    fomVar12.h = dzsjVar11;
                }
                dzsj dzsjVar12 = dzsjVar11;
                dzsj<angv> jE2 = fomVar12.p.eW.jE();
                dzsj dzsjVar13 = fomVar12.l;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fol(fomVar12, 20);
                    fomVar12.l = dzsjVar13;
                }
                dzsj dzsjVar14 = dzsjVar13;
                dzsj<angy> jH = fomVar12.p.eW.jH();
                dzsj<btpc> cx = fomVar12.p.eW.cx();
                dzsj<anhg> aX = fomVar12.p.aX();
                dzsj<araj> cl = fomVar12.p.cl();
                dzsj<anqx> i = fomVar12.i();
                dzsj<jjm> kI = fomVar12.p.kI();
                dzsj dzsjVar15 = fomVar12.m;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fol(fomVar12, 33);
                    fomVar12.m = dzsjVar15;
                }
                dzsj dzsjVar16 = dzsjVar15;
                dzsj<cjqy> al = fomVar12.p.eW.al();
                dzsj<cqhn> il2 = fomVar12.p.eW.il();
                dzsj dzsjVar17 = fomVar12.n;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new fol(fomVar12, 34);
                    fomVar12.n = dzsjVar17;
                }
                return (T) new anzv(dzsjVar8, K2, dzsjVar10, dzsjVar12, jE2, dzsjVar14, jH, cx, aX, cl, i, kI, dzsjVar16, al, il2, dzsjVar17);
            case 18:
                this.a.p.eW.rw();
                return (T) new anpy();
            case 19:
                fom fomVar13 = this.a;
                return (T) new anys(fomVar13.p.eW.m(), fomVar13.p.eW.kf(), fomVar13.o, fomVar13.p.eW.hn());
            case 20:
                fom fomVar14 = this.a;
                ftt fttVar3 = fomVar14.p;
                rb rbVar2 = fttVar3.a;
                cqat rR3 = fttVar3.eW.a.rR();
                dxjg.e(rR3);
                aoah b2 = aoai.b();
                bvsl sA = fomVar14.p.eW.sA();
                apkr dg = fomVar14.p.dg();
                anrz n = fomVar14.n();
                dzsj dzsjVar18 = fomVar14.j;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new fol(fomVar14, 30);
                    fomVar14.j = dzsjVar18;
                }
                dzsj dzsjVar19 = fomVar14.k;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fol(fomVar14, 31);
                    fomVar14.k = dzsjVar19;
                }
                return (T) anun.b(rbVar2, rR3, b2, sA, dg, n, new antx(dzsjVar18, dzsjVar19, fomVar14.o(), fomVar14.p.eW.kf()), fomVar14.p.aW(), fomVar14.p.be(), fomVar14.k(), fomVar14.p.eW.fw());
            case 21:
                Application a2 = this.a.p.eW.a.a();
                dxjg.e(a2);
                return (T) new anqx(a2);
            case 22:
                return (T) new anru();
            case 23:
                return (T) this.a.n();
            case 24:
                return (T) this.a.k();
            case 25:
                fom fomVar15 = this.a;
                return (T) new aojt(fomVar15.o, fomVar15.p.bf(), fomVar15.p.eW.m(), fomVar15.p.eW.ow(), fomVar15.p.eW.fx(), fomVar15.p.ad());
            case 26:
                fom fomVar16 = this.a;
                return (T) aoja.b(fomVar16.p.dM(), fomVar16.p.aX());
            case 27:
                fom fomVar17 = this.a;
                dzsj dzsjVar20 = fomVar17.i;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fol(fomVar17, 28);
                    fomVar17.i = dzsjVar20;
                }
                return (T) new aofe(dzsjVar20, fomVar17.p.eW.m(), fomVar17.p.uh());
            case 28:
                return (T) aofh.b(this.a.p.uh());
            case 29:
                return (T) new aojq();
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return (T) new anri(this.a.p.dg());
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                fom fomVar18 = this.a;
                return (T) new anpb(fomVar18.p.ad(), fomVar18.o(), fomVar18.p.eW.K(), fomVar18.p.eW.jB(), fomVar18.p.aX(), fomVar18.p.bf(), fomVar18.i(), fomVar18.j(), fomVar18.l(), fomVar18.p.eW.V(), fomVar18.p.eW.fx(), fomVar18.p.dM(), fomVar18.m());
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return (T) new anpc();
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return (T) this.a.c();
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                fom fomVar19 = this.a;
                return (T) new aoku(fomVar19.p.eW.oy(), fomVar19.p.ad(), fomVar19.p.eW.fx());
            default:
                fom fomVar20 = this.a;
                akfa rK = fomVar20.p.eW.a.rK();
                dxjg.e(rK);
                cjns au = fomVar20.p.eW.au();
                dehq tg = fomVar20.p.eW.a.tg();
                dxjg.e(tg);
                return (T) new anqr(rK, au, tg);
        }
    }
}
