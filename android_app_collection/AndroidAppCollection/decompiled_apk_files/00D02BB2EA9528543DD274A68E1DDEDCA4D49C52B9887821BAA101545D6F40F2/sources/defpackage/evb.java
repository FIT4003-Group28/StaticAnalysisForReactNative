package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: evb  reason: default package */
/* loaded from: classes6.dex */
public final class evb<T> implements dzsj<T> {
    final /* synthetic */ evc a;
    private final int b;

    public evb(evc evcVar, int i) {
        this.a = evcVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i = this.b;
        if (i / 100 != 0) {
            switch (i) {
                case 100:
                    return (T) this.a.aH();
                case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                    return (T) this.a.aJ();
                case 102:
                    return (T) this.a.aI();
                case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                    return (T) new bbhy();
                case 104:
                    return (T) this.a.aL();
                case 105:
                    return (T) this.a.aM();
                case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                    return (T) this.a.dw();
                case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                    return (T) this.a.aV();
                case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                    return (T) this.a.aS();
                case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                    evc evcVar = this.a;
                    Object obj8 = evcVar.g;
                    obj7 = obj8;
                    if (obj8 == null) {
                        dxio c = dxjc.c(evcVar.n.eW.h());
                        bvrb tn = evcVar.n.eW.a.tn();
                        dxjg.e(tn);
                        bvfh b = bvfj.b(bvfi.b(c, tn));
                        evcVar.g = b;
                        obj7 = b;
                        break;
                    }
                    break;
                case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                    return (T) this.a.aQ();
                case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                    return (T) this.a.aO();
                case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                    return (T) this.a.aN();
                case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                    evc evcVar2 = this.a;
                    Object obj9 = evcVar2.h;
                    obj7 = obj9;
                    if (obj9 == null) {
                        dxio c2 = dxjc.c(evcVar2.n.eW.h());
                        bvrb tn2 = evcVar2.n.eW.a.tn();
                        dxjg.e(tn2);
                        bvfp b2 = bvfr.b(bvfq.b(c2, tn2));
                        evcVar2.h = b2;
                        obj7 = b2;
                        break;
                    }
                    break;
                case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                    return (T) this.a.aP();
                case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                    return (T) this.a.dx();
                case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                    return (T) this.a.aR();
                case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                    return (T) this.a.aU();
                case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                    return (T) this.a.aT();
                case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                    return (T) this.a.dy();
                case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                    evc evcVar3 = this.a;
                    obj7 = new bjbh(evcVar3.n.eW.il(), evcVar3.n.ad(), evcVar3.aW());
                    break;
                case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                    obj7 = new bkan(this.a.n.eW.il());
                    break;
                case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                    evc evcVar4 = this.a;
                    return (T) new bjbr(evcVar4.n.ad(), evcVar4.n.fF(), evcVar4.n.pT());
                case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                    return (T) this.a.aX();
                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                    evc evcVar5 = this.a;
                    obj7 = new bkar(evcVar5.n.ad(), evcVar5.n.eW.il(), evcVar5.aW());
                    break;
                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                    return (T) this.a.aY();
                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                    return (T) this.a.aZ();
                case 127:
                    evc evcVar6 = this.a;
                    gga wk = evcVar6.n.wk();
                    cqhn cqhnVar = new cqhn();
                    cqhu cqhuVar = new cqhu();
                    blht oH = evcVar6.n.oH();
                    blly oo = evcVar6.n.oo();
                    dzsj<gga> ad = evcVar6.n.ad();
                    dzsj<btvo> V = evcVar6.n.eW.V();
                    dzsj<cqhn> il = evcVar6.n.eW.il();
                    dzsj<cqhu> eS = evcVar6.n.eS();
                    dzsj c3 = dxjh.c(evcVar6.n.az());
                    dzsj<jjm> kI = evcVar6.n.kI();
                    dzsj<isd> jn = evcVar6.n.jn();
                    dzsj dzsjVar = evcVar6.i;
                    if (dzsjVar == null) {
                        dzsjVar = new evb(evcVar6, 128);
                        evcVar6.i = dzsjVar;
                    }
                    bktl bktlVar = new bktl(ad, V, il, eS, c3, kI, jn, dzsjVar);
                    blle nQ = evcVar6.n.nQ();
                    ftt fttVar = evcVar6.n;
                    dzsj<rb> dzsjVar2 = fttVar.eV;
                    dzsj<Resources> fr = fttVar.eW.fr();
                    dzsj<btvo> V2 = evcVar6.n.eW.V();
                    dzsj<cqhn> il2 = evcVar6.n.eW.il();
                    dzsj<cqhu> eS2 = evcVar6.n.eS();
                    dzsj<bktc> nS = evcVar6.n.nS();
                    dzsj dzsjVar3 = evcVar6.j;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new evb(evcVar6, 130);
                        evcVar6.j = dzsjVar3;
                    }
                    dzsj dzsjVar4 = dzsjVar3;
                    dzsj dzsjVar5 = evcVar6.k;
                    if (dzsjVar5 == null) {
                        dzsjVar5 = new evb(evcVar6, 131);
                        evcVar6.k = dzsjVar5;
                    }
                    dzsj dzsjVar6 = dzsjVar5;
                    dzsj dzsjVar7 = evcVar6.l;
                    if (dzsjVar7 == null) {
                        dzsjVar7 = new evb(evcVar6, 132);
                        evcVar6.l = dzsjVar7;
                    }
                    bksw bkswVar = new bksw(dzsjVar2, fr, V2, il2, eS2, nS, dzsjVar4, dzsjVar6, dzsjVar7);
                    blli ox = evcVar6.n.ox();
                    ftt fttVar2 = evcVar6.n;
                    blki blkiVar = new blki(fttVar2.eV, fttVar2.eW.bk());
                    begg wj = evcVar6.n.wj();
                    blik blikVar = new blik();
                    btvo rp = evcVar6.n.eW.a.rp();
                    dxjg.e(rp);
                    return (T) new blon(wk, cqhnVar, cqhuVar, oH, oo, bktlVar, nQ, bkswVar, ox, blkiVar, wj, blikVar, rp);
                case 128:
                    return (T) this.a.ba();
                case 129:
                    obj7 = new bkts(this.a.n.eW.fr());
                    break;
                case 130:
                    return (T) this.a.bb();
                case 131:
                    return (T) this.a.bc();
                case 132:
                    return (T) this.a.bd();
                case 133:
                    return (T) this.a.be();
                case 134:
                    return (T) this.a.bf();
                case 135:
                    return (T) this.a.bh();
                case 136:
                    return (T) this.a.bg();
                case 137:
                    evc evcVar7 = this.a;
                    obj7 = new brmb(evcVar7.n.eW.p(), evcVar7.n.m(), evcVar7.n.eW.I());
                    break;
                case 138:
                    return (T) this.a.bi();
                case 139:
                    return (T) this.a.dA();
                case 140:
                    return (T) this.a.bj();
                case 141:
                    return (T) this.a.dB();
                case 142:
                    return (T) this.a.bk();
                case 143:
                    return (T) this.a.dz();
                case 144:
                    return (T) this.a.bl();
                case 145:
                    return (T) this.a.bm();
                case 146:
                    return (T) this.a.bn();
                case 147:
                    return (T) this.a.bo();
                case 148:
                    return (T) this.a.bp();
                case 149:
                    evc evcVar8 = this.a;
                    dzsj dzsjVar8 = evcVar8.m;
                    if (dzsjVar8 == null) {
                        dzsjVar8 = new evb(evcVar8, 150);
                        evcVar8.m = dzsjVar8;
                    }
                    obj7 = new cjec(dzsjVar8);
                    break;
                case 150:
                    return (T) new cjee();
                case 151:
                    return (T) this.a.bs();
                case 152:
                    return (T) this.a.bq();
                case 153:
                    evc evcVar9 = this.a;
                    return (T) new adyg(evcVar9.n.wk(), dxjc.c(evcVar9.n.eW.mq()), dxjc.c(evcVar9.n.pC()), dxjc.c(evcVar9.n.m()), dxjc.c(evcVar9.n.az()));
                case 154:
                    return (T) this.a.br();
                case 155:
                    return (T) this.a.bt();
                case 156:
                    return (T) this.a.bu();
                case 157:
                    return (T) this.a.bv();
                case 158:
                    return (T) this.a.bw();
                case 159:
                    ftt fttVar3 = this.a.n;
                    obj7 = new aqoi(fttVar3.a, dxjc.c(fttVar3.P()));
                    break;
                case 160:
                    return (T) this.a.aq();
                case 161:
                    return (T) this.a.bF();
                case 162:
                    return (T) this.a.bE();
                case 163:
                    return (T) this.a.bx();
                case 164:
                    return (T) this.a.bz();
                case 165:
                    return (T) this.a.by();
                case 166:
                    return (T) this.a.bC();
                case 167:
                    return (T) this.a.bB();
                case 168:
                    return (T) this.a.bA();
                case 169:
                    return (T) this.a.bD();
                default:
                    throw new AssertionError(i);
            }
            return obj7;
        }
        switch (i) {
            case 0:
                return (T) this.a.e();
            case 1:
                return (T) this.a.f();
            case 2:
                return (T) evc.dC();
            case 3:
                return (T) this.a.g();
            case 4:
                return (T) this.a.h();
            case 5:
                return (T) this.a.i();
            case 6:
                return (T) this.a.j();
            case 7:
                evc evcVar10 = this.a;
                obj6 = new xhq(evcVar10.n.ad(), dxjh.c(evcVar10.n.m()));
                return obj6;
            case 8:
                return (T) this.a.k();
            case 9:
                return (T) this.a.l();
            case 10:
                return (T) this.a.p();
            case 11:
                evc evcVar11 = this.a;
                Object obj10 = evcVar11.a;
                if (obj10 instanceof dxjf) {
                    synchronized (obj10) {
                        obj = evcVar11.a;
                        if (obj instanceof dxjf) {
                            evcVar11.n.B();
                            dxjc.c(evcVar11.n.eW.p());
                            obj = new yxa();
                            dxjc.d(evcVar11.a, obj);
                            evcVar11.a = obj;
                        }
                    }
                    obj10 = obj;
                }
                return (T) ((yxa) obj10);
            case 12:
                evc evcVar12 = this.a;
                Object obj11 = evcVar12.f;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj2 = evcVar12.f;
                        if (obj2 instanceof dxjf) {
                            ftt fttVar4 = evcVar12.n;
                            rb rbVar = fttVar4.a;
                            cqat rR = fttVar4.eW.a.rR();
                            dxjg.e(rR);
                            Object obj12 = evcVar12.c;
                            if (obj12 instanceof dxjf) {
                                synchronized (obj12) {
                                    obj3 = evcVar12.c;
                                    if (obj3 instanceof dxjf) {
                                        Application a = evcVar12.n.eW.a.a();
                                        dxjg.e(a);
                                        Object n = evcVar12.n();
                                        cqat rR2 = evcVar12.n.eW.a.rR();
                                        dxjg.e(rR2);
                                        dxio c4 = dxjc.c(evcVar12.n.bA());
                                        btvo rp2 = evcVar12.n.eW.a.rp();
                                        dxjg.e(rp2);
                                        xlg b3 = xll.b(a, n, rR2, c4, rp2, evcVar12.o());
                                        xlc m = evcVar12.m();
                                        Object n2 = evcVar12.n();
                                        xkw xkwVar = new xkw(evcVar12.n.ap(), new alen(evcVar12.n.ap()), evcVar12.n.bJ());
                                        cjqy tr = evcVar12.n.eW.a.tr();
                                        dxjg.e(tr);
                                        cjqq tp = evcVar12.n.eW.a.tp();
                                        dxjg.e(tp);
                                        xmn o = evcVar12.o();
                                        akox ap = evcVar12.n.ap();
                                        akzh au = evcVar12.n.au();
                                        alhv sr = evcVar12.n.eW.sr();
                                        Object obj13 = evcVar12.b;
                                        if (obj13 instanceof dxjf) {
                                            synchronized (obj13) {
                                                obj4 = evcVar12.b;
                                                if (obj4 instanceof dxjf) {
                                                    Application a2 = evcVar12.n.eW.a.a();
                                                    dxjg.e(a2);
                                                    obj4 = new xmg(a2, evcVar12.n.bM(), evcVar12.n.eW.wf(), evcVar12.n.ap());
                                                    dxjc.d(evcVar12.b, obj4);
                                                    evcVar12.b = obj4;
                                                }
                                            }
                                            obj13 = obj4;
                                        }
                                        crzb sO = evcVar12.n.eW.a.sO();
                                        dxjg.e(sO);
                                        bvrb tn3 = evcVar12.n.eW.a.tn();
                                        dxjg.e(tn3);
                                        cqba vu = evcVar12.n.eW.a.vu();
                                        dxjg.e(vu);
                                        btvo rp3 = evcVar12.n.eW.a.rp();
                                        dxjg.e(rp3);
                                        obj3 = xlv.b(b3, m, n2, xkwVar, tr, tp, o, ap, au, sr, (xmg) obj13, sO, tn3, vu, rp3);
                                        dxjc.d(evcVar12.c, obj3);
                                        evcVar12.c = obj3;
                                    }
                                }
                                obj12 = obj3;
                            }
                            xlu xluVar = (xlu) obj12;
                            akox ap2 = evcVar12.n.ap();
                            ales alesVar = new ales(evcVar12.n.ap());
                            yuv yuvVar = new yuv(evcVar12.n.ap());
                            alec bJ = evcVar12.n.bJ();
                            xdk lB = evcVar12.n.lB();
                            dzsj<efh> fN = evcVar12.n.fN();
                            dzsj<akox> as = evcVar12.n.as();
                            dzsj dzsjVar9 = evcVar12.e;
                            if (dzsjVar9 == null) {
                                dzsjVar9 = new evb(evcVar12, 13);
                                evcVar12.e = dzsjVar9;
                            }
                            xbl xblVar = new xbl(fN, as, dzsjVar9, evcVar12.n.eW.jm());
                            hwc bB = evcVar12.n.bB();
                            ftt fttVar5 = evcVar12.n;
                            fyu fyuVar = fttVar5.eW;
                            dxio c5 = dxjc.c(fyuVar.h());
                            bvrb tn4 = fyuVar.a.tn();
                            dxjg.e(tn4);
                            busb busbVar = new busb(c5, tn4);
                            Executor sU = fttVar5.eW.a.sU();
                            dxjg.e(sU);
                            obj2 = new yuu(rbVar, rR, xluVar, ap2, alesVar, yuvVar, bJ, lB, xblVar, bB, new ytr(busbVar, sU), evcVar12.n.jM());
                            dxjc.d(evcVar12.f, obj2);
                            evcVar12.f = obj2;
                        }
                    }
                    obj11 = obj2;
                }
                return (T) ((yuu) obj11);
            case 13:
                evc evcVar13 = this.a;
                dzsj<Executor> di = evcVar13.n.eW.di();
                dzsj<akox> as2 = evcVar13.n.as();
                dzsj dzsjVar10 = evcVar13.d;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new evb(evcVar13, 14);
                    evcVar13.d = dzsjVar10;
                }
                obj6 = new xbq(di, as2, dzsjVar10, evcVar13.n.eW.al());
                return obj6;
            case 14:
                evc evcVar14 = this.a;
                dxio c6 = dxjc.c(evcVar14.n.bH());
                Application a3 = evcVar14.n.eW.a.a();
                dxjg.e(a3);
                obj5 = new xbr(c6, a3);
                return obj5;
            case 15:
                evc evcVar15 = this.a;
                obj5 = new yuw(evcVar15.n.ap(), evcVar15.n.bM());
                return obj5;
            case 16:
                return (T) this.a.v();
            case 17:
                return (T) this.a.s();
            case 18:
                return (T) this.a.r();
            case 19:
                return (T) this.a.u();
            case 20:
                return (T) this.a.t();
            case 21:
                return (T) this.a.q();
            case 22:
                return (T) this.a.w();
            case 23:
                return (T) this.a.x();
            case 24:
                this.a.n.ad();
                obj6 = new ahhb();
                return obj6;
            case 25:
                return (T) this.a.Y();
            case 26:
                return (T) this.a.y();
            case 27:
                return (T) new jmq();
            case 28:
                return (T) this.a.A();
            case 29:
                return (T) this.a.B();
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return (T) this.a.D();
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return (T) this.a.C();
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return (T) this.a.E();
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return (T) this.a.G();
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return (T) this.a.F();
            case 35:
                ftt fttVar6 = this.a.n;
                obj6 = new ahhg(fttVar6.eV, fttVar6.cP());
                return obj6;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return (T) this.a.z();
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return (T) this.a.J();
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                obj6 = new axoi(dxjh.c(this.a.n.cN()));
                return obj6;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return (T) this.a.I();
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return (T) new blkr();
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return (T) new cece();
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return (T) this.a.H();
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return (T) this.a.K();
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return (T) this.a.L();
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return (T) this.a.R();
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return (T) this.a.M();
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                evc evcVar16 = this.a;
                dxjc.c(evcVar16.n.eW.dd());
                evcVar16.n.wk();
                dxjc.c(evcVar16.n.aX());
                dxjc.c(evcVar16.n.aJ());
                evcVar16.n.dl();
                obj6 = new agag();
                return obj6;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return (T) this.a.N();
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                this.a.O();
                return (T) new ahal();
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                evc evcVar17 = this.a;
                obj6 = new agbq(dxjh.c(evcVar17.n.eW.dd()), evcVar17.n.eW.di(), dxjh.c(evcVar17.n.jr()), evcVar17.n.eW.bY());
                return obj6;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return (T) this.a.Q();
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return (T) this.a.P();
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return (T) this.a.S();
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return (T) this.a.T();
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return (T) this.a.U();
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return (T) this.a.W();
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return (T) this.a.V();
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return (T) this.a.X();
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                ftt fttVar7 = this.a.n;
                obj6 = new ahhi(fttVar7.eV, fttVar7.lK());
                return obj6;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                ftt fttVar8 = this.a.n;
                obj6 = new ahjn(fttVar8.eV, dxjh.c(fttVar8.m()));
                return obj6;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return (T) this.a.Z();
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                obj6 = new ahjh(this.a.n.dg());
                return obj6;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                evc evcVar18 = this.a;
                ftt fttVar9 = evcVar18.n;
                rb rbVar2 = fttVar9.a;
                dxio c7 = dxjc.c(fttVar9.r());
                akfa rK = evcVar18.n.eW.a.rK();
                dxjg.e(rK);
                obj6 = new ahiy(rbVar2, c7, rK);
                return obj6;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return (T) this.a.aa();
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return (T) this.a.ab();
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return (T) this.a.ac();
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return (T) this.a.ad();
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return (T) this.a.ae();
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return (T) new auut();
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return (T) this.a.af();
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return (T) this.a.ag();
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return (T) this.a.an();
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return (T) this.a.aj();
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return (T) this.a.ah();
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return (T) this.a.ak();
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return (T) this.a.al();
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return (T) this.a.am();
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return (T) this.a.ao();
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return (T) this.a.ap();
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                evc evcVar19 = this.a;
                ftt fttVar10 = evcVar19.n;
                return (T) new aqoo(fttVar10.eV, fttVar10.eW.ip(), evcVar19.n.eW.il(), evcVar19.ai(), evcVar19.n.lP(), dxjh.c(evcVar19.n.x()));
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return (T) this.a.at();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return (T) this.a.as();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return (T) this.a.ar();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return (T) this.a.au();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return (T) this.a.av();
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return (T) this.a.aw();
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return (T) this.a.ax();
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return (T) this.a.ay();
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return (T) this.a.az();
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return (T) this.a.aC();
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return (T) this.a.aA();
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return (T) this.a.aB();
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return (T) this.a.aD();
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return (T) this.a.aE();
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return (T) new bbnl();
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return (T) new bbpm();
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return (T) this.a.aF();
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return (T) this.a.aG();
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return (T) this.a.aK();
            default:
                throw new AssertionError(i);
        }
    }
}
