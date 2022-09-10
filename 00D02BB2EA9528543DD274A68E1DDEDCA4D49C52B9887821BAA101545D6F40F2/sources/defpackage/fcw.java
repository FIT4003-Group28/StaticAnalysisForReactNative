package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fcw  reason: default package */
/* loaded from: classes6.dex */
public final class fcw<T> implements dzsj<T> {
    final /* synthetic */ fcx a;
    private final int b;

    public fcw(fcx fcxVar, int i) {
        this.a = fcxVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                fcx fcxVar = this.a;
                Application a = fcxVar.q.eW.a.a();
                dxjg.e(a);
                bvjj rB = fcxVar.q.eW.a.rB();
                dxjg.e(rB);
                return (T) new vns(a, rB, new vnv(), fcxVar.q.eW.lC());
            case 1:
                return (T) new zah(this.a.q.eW.dH());
            case 2:
                return (T) zau.b();
            case 3:
                fcx fcxVar2 = this.a;
                cqat rR = fcxVar2.q.eW.a.rR();
                dxjg.e(rR);
                btvo rp = fcxVar2.q.eW.a.rp();
                dxjg.e(rp);
                return (T) zas.b(rR, rp, fcxVar2.q.iy());
            case 4:
                return (T) new zag();
            case 5:
                ckcw rU = this.a.q.eW.a.rU();
                dxjg.e(rU);
                return (T) pte.b(rU);
            case 6:
                fcx fcxVar3 = this.a;
                Application a2 = fcxVar3.q.eW.a.a();
                dxjg.e(a2);
                return (T) new yzl(a2, fcxVar3.b());
            case 7:
                return (T) this.a.c();
            case 8:
                fcx fcxVar4 = this.a;
                cqat rR2 = fcxVar4.q.eW.a.rR();
                dxjg.e(rR2);
                ckcw rU2 = fcxVar4.q.eW.a.rU();
                dxjg.e(rU2);
                return (T) new xcs(rR2, rU2);
            case 9:
                return (T) this.a.b();
            case 10:
                fcx fcxVar5 = this.a;
                byym d = fcxVar5.d();
                Executor sU = fcxVar5.q.eW.a.sU();
                dxjg.e(sU);
                return (T) new bzcm(d, sU, dxjc.c(fcxVar5.q.eW.ed()), dxjc.c(fcxVar5.q.eW.p()), dxjc.c(fcxVar5.q.cB()), dxjc.c(fcxVar5.q.eW.nX()));
            case 11:
                return (T) new vot(this.a.q.eV);
            case 12:
                return (T) this.a.f();
            case 13:
                return (T) this.a.g();
            case 14:
                return (T) this.a.k();
            case 15:
                fcx fcxVar6 = this.a;
                dzsj<efh> fN = fcxVar6.q.fN();
                ftt fttVar = fcxVar6.q;
                return (T) new bwow(fN, fttVar.eV, fttVar.cz(), fcxVar6.q.aK(), fcxVar6.q.bT());
            case 16:
                fcx fcxVar7 = this.a;
                cqat rR3 = fcxVar7.q.eW.a.rR();
                dxjg.e(rR3);
                ftt fttVar2 = fcxVar7.q;
                return (T) new bwpz(rR3, fttVar2.a, new bwqd(dxjh.c(fttVar2.ay())), new bwqb(dxjh.c(fcxVar7.q.ay())));
            case 17:
                fcx fcxVar8 = this.a;
                return (T) new vrg(fcxVar8.q.eW.il(), fcxVar8.q.fe(), fcxVar8.q.eW.ds(), fcxVar8.q.eW.n());
            case 18:
                fcx fcxVar9 = this.a;
                return (T) new vrc(fcxVar9.q.fe(), fcxVar9.q.eW.ds(), fcxVar9.q.eW.n(), fcxVar9.h(), fcxVar9.q.ad(), dxjh.c(fcxVar9.q.aV()));
            case 19:
                return (T) new vre(this.a.q.eV);
            case 20:
                fcx fcxVar10 = this.a;
                return (T) new vrp(fcxVar10.q.fe(), fcxVar10.q.eW.ds(), fcxVar10.q.eW.n(), fcxVar10.i(), fcxVar10.q.ad(), dxjh.c(fcxVar10.q.aV()));
            case 21:
                return (T) new vrr(this.a.q.eV);
            case 22:
                fcx fcxVar11 = this.a;
                return (T) new vri(fcxVar11.q.fe(), fcxVar11.q.eW.ds(), fcxVar11.q.eW.n(), fcxVar11.j(), fcxVar11.q.ad(), dxjh.c(fcxVar11.q.aV()));
            case 23:
                return (T) new vrk(this.a.q.eV);
            case 24:
                fcx fcxVar12 = this.a;
                return (T) new bwqg(fcxVar12.q.cC(), fcxVar12.q.eW.I());
            case 25:
                return (T) this.a.l();
            case 26:
                fcx fcxVar13 = this.a;
                Object obj4 = fcxVar13.b;
                if (obj4 instanceof dxjf) {
                    synchronized (obj4) {
                        obj = fcxVar13.b;
                        if (obj instanceof dxjf) {
                            wuw wuwVar = new wuw();
                            wto e = fcxVar13.e();
                            Object obj5 = fcxVar13.a;
                            if (obj5 instanceof dxjf) {
                                synchronized (obj5) {
                                    obj2 = fcxVar13.a;
                                    if (obj2 instanceof dxjf) {
                                        Executor sU2 = fcxVar13.q.eW.a.sU();
                                        dxjg.e(sU2);
                                        fyu fyuVar = fcxVar13.q.eW;
                                        dzsj dzsjVar = fyuVar.dt;
                                        if (dzsjVar == null) {
                                            dzsjVar = new fxy(fyuVar, 664);
                                            fyuVar.dt = dzsjVar;
                                        }
                                        wtq wtqVar = new wtq(sU2, new byaq(dxjc.c(dzsjVar)));
                                        dxjc.d(fcxVar13.a, wtqVar);
                                        fcxVar13.a = wtqVar;
                                        obj2 = wtqVar;
                                    }
                                }
                                obj5 = obj2;
                            }
                            fcxVar13.q.eW.qw();
                            Executor sU3 = fcxVar13.q.eW.a.sU();
                            dxjg.e(sU3);
                            obj = new vog(wuwVar, e, (wtq) obj5, sU3);
                            dxjc.d(fcxVar13.b, obj);
                            fcxVar13.b = obj;
                        }
                    }
                    obj4 = obj;
                }
                return (T) ((vog) obj4);
            case 27:
                fcx fcxVar14 = this.a;
                return (T) wtt.b(fcxVar14.q.eW.lH(), fcxVar14.q.eW.fq(), fcxVar14.q.eW.k(), dxjh.c(fcxVar14.q.bT()), dxjh.c(fcxVar14.q.bU()));
            case 28:
                return (T) this.a.B();
            case 29:
                fcx fcxVar15 = this.a;
                return (T) new vnp(fcxVar15.q.gW(), fcxVar15.q.eS());
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return (T) this.a.m();
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return (T) this.a.p();
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return (T) new zmz(this.a.q.eW.qw());
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return (T) new ydh();
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                this.a.q.ad();
                return (T) new ydl();
            case 35:
                return (T) new xhk(dxjh.c(this.a.q.tJ()));
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                fcx fcxVar16 = this.a;
                return (T) new zqv(fcxVar16.q.eW.lG(), fcxVar16.q.iF(), fcxVar16.q.H(), fcxVar16.n());
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                fcx fcxVar17 = this.a;
                return (T) new whm(fcxVar17.q.eW.V(), fcxVar17.q.eW.ii(), fcxVar17.q.eW.ig(), fcxVar17.q.eW.di());
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                fcx fcxVar18 = this.a;
                btvo rp2 = fcxVar18.q.eW.a.rp();
                dxjg.e(rp2);
                dxio c = dxjc.c(fcxVar18.q.eW.p());
                ania qq = fcxVar18.q.eW.qq();
                bvjj rB2 = fcxVar18.q.eW.a.rB();
                dxjg.e(rB2);
                return (T) new zaz(rp2, c, qq, rB2);
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                fcx fcxVar19 = this.a;
                dzsj<Resources> fr = fcxVar19.q.eW.fr();
                dzsj<cqhn> il = fcxVar19.q.eW.il();
                dzsj dzsjVar2 = fcxVar19.c;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fcw(fcxVar19, 40);
                    fcxVar19.c = dzsjVar2;
                }
                return (T) new zpj(fr, il, dzsjVar2, fcxVar19.q.tK(), fcxVar19.o());
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                fcx fcxVar20 = this.a;
                buqz vf = fcxVar20.q.eW.vf();
                bvax vj = fcxVar20.q.eW.vj();
                Executor sV = fcxVar20.q.eW.a.sV();
                dxjg.e(sV);
                return (T) new cjbx(vf, vj, sV);
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                fcx fcxVar21 = this.a;
                ftt fttVar3 = fcxVar21.q;
                rb rbVar = fttVar3.a;
                btvo rp3 = fttVar3.eW.a.rp();
                dxjg.e(rp3);
                zkq zkqVar = new zkq(rbVar, rp3, fcxVar21.q.eW.sA(), fcxVar21.q.eW.wf());
                dzsj<gga> ad = fcxVar21.q.ad();
                dzsj<btvo> V = fcxVar21.q.eW.V();
                dzsj<cqhn> il2 = fcxVar21.q.eW.il();
                dzsj dzsjVar3 = fcxVar21.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fcw(fcxVar21, 42);
                    fcxVar21.d = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj<zuz> iv = fcxVar21.q.iv();
                dzsj<Executor> di = fcxVar21.q.eW.di();
                dzsj<xew> nI = fcxVar21.q.eW.nI();
                dzsj<xfd> og = fcxVar21.q.eW.og();
                dzsj<bvjj> aw = fcxVar21.q.eW.aw();
                dzsj c2 = dxjh.c(fcxVar21.q.m());
                dzsj dzsjVar5 = fcxVar21.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fcw(fcxVar21, 45);
                    fcxVar21.e = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = fcxVar21.f;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fcw(fcxVar21, 46);
                    fcxVar21.f = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj<bvrb> R = fcxVar21.q.eW.R();
                dzsj dzsjVar9 = fcxVar21.g;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fcw(fcxVar21, 47);
                    fcxVar21.g = dzsjVar9;
                }
                ycj ycjVar = new ycj(ad, V, il2, dzsjVar4, iv, di, nI, og, aw, c2, dzsjVar6, dzsjVar8, R, dzsjVar9, dxjh.c(fcxVar21.q.eW.p()), dxjh.c(fcxVar21.t()), fcxVar21.q.eW.at());
                dzsj<rb> dzsjVar10 = fcxVar21.q.eV;
                dzsj dzsjVar11 = fcxVar21.h;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fcw(fcxVar21, 49);
                    fcxVar21.h = dzsjVar11;
                }
                dzsj dzsjVar12 = dzsjVar11;
                dzsj dzsjVar13 = fcxVar21.i;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fcw(fcxVar21, 50);
                    fcxVar21.i = dzsjVar13;
                }
                umi umiVar = new umi(dzsjVar10, dzsjVar12, dzsjVar13, fcxVar21.q.eW.jm(), fcxVar21.q.eW.in());
                zlf zlfVar = new zlf();
                zqm iS = fcxVar21.q.iS();
                ftt fttVar4 = fcxVar21.q;
                zfx zfxVar = new zfx(fttVar4.eV, fttVar4.eW.il());
                dxio c3 = dxjc.c(fcxVar21.q.tI());
                btvo rp4 = fcxVar21.q.eW.a.rp();
                dxjg.e(rp4);
                cqat rR4 = fcxVar21.q.eW.a.rR();
                dxjg.e(rR4);
                bvsl sA = fcxVar21.q.eW.sA();
                vsf g = fcxVar21.q.eW.g();
                zrl zrlVar = new zrl(fcxVar21.q.eW.fr(), dxjh.c(fcxVar21.q.da()), fcxVar21.q.eW.V());
                btpc sz = fcxVar21.q.eW.a.sz();
                dxjg.e(sz);
                byaf u = fcxVar21.u();
                zse zseVar = new zse(fcxVar21.q.eW.m(), fcxVar21.q.eW.hN());
                buti rF = fcxVar21.q.eW.rF();
                zlr zlrVar = new zlr(fcxVar21.q.eW.ds(), fcxVar21.q.ad());
                zgs zgsVar = new zgs(fcxVar21.q.eW.ds(), fcxVar21.q.ad(), fcxVar21.w());
                zqg iN = fcxVar21.q.iN();
                zrt jV = fcxVar21.q.jV();
                Executor sU4 = fcxVar21.q.eW.a.sU();
                dxjg.e(sU4);
                zpy zpyVar = new zpy(rp4, rR4, sA, g, zrlVar, sz, u, zseVar, rF, zlrVar, zgsVar, iN, jV, sU4);
                vyn x = fcxVar21.x();
                gce sC = fcxVar21.q.eW.a.sC();
                dxjg.e(sC);
                cqhn cqhnVar = new cqhn();
                Application a3 = fcxVar21.q.eW.a.a();
                dxjg.e(a3);
                cqhn cqhnVar2 = new cqhn();
                byym d2 = fcxVar21.d();
                Executor sU5 = fcxVar21.q.eW.a.sU();
                dxjg.e(sU5);
                zkt zktVar = new zkt(a3, cqhnVar2, d2, sU5);
                uim dG = fcxVar21.q.eW.dG();
                Executor sU6 = fcxVar21.q.eW.a.sU();
                dxjg.e(sU6);
                return (T) new zqi(rbVar, zkqVar, ycjVar, umiVar, zlfVar, iS, zfxVar, c3, zpyVar, x, sC, cqhnVar, zktVar, dG, sU6);
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return (T) this.a.s();
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return (T) this.a.d();
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return (T) this.a.q();
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return (T) new wtw();
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return (T) new xhh(dxjh.c(this.a.q.tJ()));
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return (T) ydd.b();
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                fcx fcxVar22 = this.a;
                rb rbVar2 = fcxVar22.q.a;
                buky bukyVar = fcxVar22.r;
                if (bukyVar == null) {
                    dxio c4 = dxjc.c(fcxVar22.q.eW.h());
                    bvrb tn = fcxVar22.q.eW.a.tn();
                    dxjg.e(tn);
                    bukyVar = bula.b(bukz.b(c4, tn));
                    fcxVar22.r = bukyVar;
                }
                Executor sV2 = fcxVar22.q.eW.a.sV();
                dxjg.e(sV2);
                Executor sU7 = fcxVar22.q.eW.a.sU();
                dxjg.e(sU7);
                return (T) new zad(rbVar2, bukyVar, sV2, sU7);
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                fcx fcxVar23 = this.a;
                ftt fttVar5 = fcxVar23.q;
                rb rbVar3 = fttVar5.a;
                umo umoVar = new umo(fttVar5.eV, fttVar5.eW.il(), dxjh.c(fcxVar23.q.da()), fcxVar23.q.eW.jm(), fcxVar23.q.eW.in());
                ftt fttVar6 = fcxVar23.q;
                return (T) new umk(rbVar3, umoVar, new umm(fttVar6.eV, fttVar6.eW.il(), dxjh.c(fcxVar23.q.da()), fcxVar23.q.eW.jm(), fcxVar23.q.eW.in()));
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                fcx fcxVar24 = this.a;
                buti rF2 = fcxVar24.q.eW.rF();
                Executor sU8 = fcxVar24.q.eW.a.sU();
                dxjg.e(sU8);
                return (T) new uir(rF2, sU8);
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                fcx fcxVar25 = this.a;
                return (T) new ziq(fcxVar25.q.wk(), fcxVar25.q.wl(), fcxVar25.v());
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                fcx fcxVar26 = this.a;
                rb rbVar4 = fcxVar26.q.a;
                cqhn cqhnVar3 = new cqhn();
                cqhu cqhuVar = new cqhu();
                gga wk = fcxVar26.q.wk();
                cqhn cqhnVar4 = new cqhn();
                btrm rz = fcxVar26.q.eW.a.rz();
                dxjg.e(rz);
                znx znxVar = new znx(fcxVar26.q.cc());
                ftt fttVar7 = fcxVar26.q;
                dzsj<rb> dzsjVar14 = fttVar7.eV;
                dzsj<cqhn> il3 = fttVar7.eW.il();
                dzsj<cqhu> eS = fcxVar26.q.eS();
                dzsj dzsjVar15 = fcxVar26.j;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fcw(fcxVar26, 53);
                    fcxVar26.j = dzsjVar15;
                }
                dzsj dzsjVar16 = dzsjVar15;
                dzsj<vwv> lH = fcxVar26.q.eW.lH();
                dzsj dzsjVar17 = fcxVar26.k;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new fcw(fcxVar26, 54);
                    fcxVar26.k = dzsjVar17;
                }
                zok zokVar = new zok(wk, cqhnVar4, rz, znxVar, new zoe(dzsjVar14, il3, eS, dzsjVar16, lH, dzsjVar17, fcxVar26.y()), new zlx(fcxVar26.q.eV), new zof(fcxVar26.q.wk(), new wtw()), fcxVar26.e(), fcxVar26.q.eW.qw());
                vop l = fcxVar26.l();
                fcxVar26.u();
                return (T) new zny(rbVar4, cqhnVar3, cqhuVar, zokVar, l, fcxVar26.e());
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                fcx fcxVar27 = this.a;
                ftt fttVar8 = fcxVar27.q;
                return (T) new zoc(fttVar8.eV, fttVar8.eW.il(), fcxVar27.q.eS(), fcxVar27.r(), fcxVar27.q.eW.dA());
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return (T) this.a.z();
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return (T) this.a.e();
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return (T) new zlb(this.a.q.eW.il());
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return (T) this.a.A();
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                fcx fcxVar28 = this.a;
                Object obj6 = fcxVar28.l;
                if (obj6 instanceof dxjf) {
                    synchronized (obj6) {
                        obj3 = fcxVar28.l;
                        if (obj3 instanceof dxjf) {
                            obj3 = new uin(dxjc.c(fcxVar28.q.v()));
                            dxjc.d(fcxVar28.l, obj3);
                            fcxVar28.l = obj3;
                        }
                    }
                    obj6 = obj3;
                }
                return (T) ((uin) obj6);
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                fcx fcxVar29 = this.a;
                return (T) new ptc(fcxVar29.q.a, fcxVar29.b());
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return (T) this.a.C();
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return (T) this.a.E();
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return (T) this.a.F();
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return (T) this.a.G();
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return (T) this.a.H();
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return (T) this.a.I();
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return (T) this.a.K();
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                fcx fcxVar30 = this.a;
                dzsj<btvo> V2 = fcxVar30.q.eW.V();
                dzsj<Context> I = fcxVar30.q.eW.I();
                dzsj dzsjVar18 = fcxVar30.m;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new fcw(fcxVar30, 68);
                    fcxVar30.m = dzsjVar18;
                }
                return (T) new aruq(V2, I, dzsjVar18);
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                fcx fcxVar31 = this.a;
                return (T) new aruv(fcxVar31.q.eW.I(), fcxVar31.q.eW.at());
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return (T) this.a.J();
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return (T) this.a.L();
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return (T) this.a.M();
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                fcx fcxVar32 = this.a;
                jdj jdjVar = new jdj();
                cjqy tr = fcxVar32.q.eW.a.tr();
                dxjg.e(tr);
                cjqq tp = fcxVar32.q.eW.a.tp();
                dxjg.e(tp);
                return (T) new pyn(jdjVar, tr, tp, fcxVar32.q.wl(), fcxVar32.q.eW.cH(), fcxVar32.q.co(), fcxVar32.q.gY());
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                fcx fcxVar33 = this.a;
                rb rbVar5 = fcxVar33.q.a;
                jdj jdjVar2 = new jdj();
                cjqy tr2 = fcxVar33.q.eW.a.tr();
                dxjg.e(tr2);
                cjqq tp2 = fcxVar33.q.eW.a.tp();
                dxjg.e(tp2);
                cqkj wl = fcxVar33.q.wl();
                bzmh cH = fcxVar33.q.eW.cH();
                bzmd co = fcxVar33.q.co();
                bzgl gY = fcxVar33.q.gY();
                bvjj rB3 = fcxVar33.q.eW.a.rB();
                dxjg.e(rB3);
                return (T) new pyo(rbVar5, jdjVar2, tr2, tp2, wl, cH, co, gY, rB3);
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return (T) this.a.N();
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return (T) this.a.O();
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return (T) this.a.P();
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                fcx fcxVar34 = this.a;
                return (T) new arly(fcxVar34.q.B(), dxjc.c(fcxVar34.q.eW.im()), fcxVar34.q.wk(), fcxVar34.q.tL());
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                fcx fcxVar35 = this.a;
                dzsj<Resources> fr2 = fcxVar35.q.eW.fr();
                dzsj<cqhn> il4 = fcxVar35.q.eW.il();
                dzsj dzsjVar19 = fcxVar35.n;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fcw(fcxVar35, 79);
                    fcxVar35.n = dzsjVar19;
                }
                return (T) new cfpe(fr2, il4, dzsjVar19, fcxVar35.R(), fcxVar35.T(), fcxVar35.U(), fcxVar35.q.eW.aw(), dxjh.c(fcxVar35.q.tK()), fcxVar35.q.eW.V(), fcxVar35.q.eW.bk(), fcxVar35.q.eW.di(), fcxVar35.q.eW.at(), fcxVar35.R(), fcxVar35.T(), fcxVar35.U());
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                fcx fcxVar36 = this.a;
                return (T) new cfns(fcxVar36.q.eW.at(), fcxVar36.q.eW.fr(), fcxVar36.q.eW.na(), fcxVar36.q.eW.nb(), fcxVar36.q.eW.V(), fcxVar36.q.eW.o());
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return (T) this.a.Q();
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return (T) new cfos();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                fcx fcxVar37 = this.a;
                dzsj dzsjVar20 = fcxVar37.o;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fcw(fcxVar37, 83);
                    fcxVar37.o = dzsjVar20;
                }
                return (T) new cfoq(dzsjVar20);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return (T) new cfon(this.a.q.eW.il());
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                fcx fcxVar38 = this.a;
                dzsj dzsjVar21 = fcxVar38.p;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fcw(fcxVar38, 85);
                    fcxVar38.p = dzsjVar21;
                }
                return (T) cfol.b(dzsjVar21);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return (T) new cfoh(this.a.q.eW.il());
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return (T) this.a.S();
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return (T) new cfpg();
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                fcx fcxVar39 = this.a;
                btvo rp5 = fcxVar39.q.eW.a.rp();
                dxjg.e(rp5);
                return (T) new cjck(rp5, dxjc.c(fcxVar39.q.eW.p()), fcxVar39.q.eW.qq());
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return (T) this.a.v();
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                fcx fcxVar40 = this.a;
                return (T) new zpq(fcxVar40.q.eW.jm(), fcxVar40.q.eW.R(), fcxVar40.q.eW.al(), fcxVar40.q.so(), fcxVar40.q.eW.V(), fcxVar40.q.eW.lH(), fcxVar40.q.eW.in());
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return (T) this.a.D();
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return (T) new zin();
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return (T) new znk(this.a.q.eV);
            default:
                return (T) new zpl(this.a.q.eV);
        }
    }
}
