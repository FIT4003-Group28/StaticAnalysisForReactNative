package defpackage;

import android.app.Application;
import com.google.android.filament.R;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: irb  reason: default package */
/* loaded from: classes.dex */
public final class irb<T> implements dzsj<T> {
    final /* synthetic */ irc a;
    private final int b;

    public irb(irc ircVar, int i) {
        this.a = ircVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204, types: [T] */
    /* JADX WARN: Type inference failed for: r4v47, types: [com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl, java.lang.Object] */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        ScheduledExecutorService scheduledExecutorService;
        Object obj8;
        dbsg<dzsj<cxef>> dbsgVar;
        T t;
        int i = this.b;
        boolean z = false;
        if (i / 100 != 0) {
            switch (i) {
                case 100:
                    irc ircVar = this.a;
                    T t2 = (T) ircVar.O;
                    if (!(t2 instanceof dxjf)) {
                        return t2;
                    }
                    synchronized (t2) {
                        Object obj9 = ircVar.O;
                        if (obj9 instanceof dxjf) {
                            dzsj dzsjVar = ircVar.N;
                            if (dzsjVar == null) {
                                dzsjVar = new irb(ircVar, R.styleable.AppCompatTheme_switchStyle);
                                ircVar.N = dzsjVar;
                            }
                            ?? nativeCrashHandlerImpl = new NativeCrashHandlerImpl(dbsg.i(dzsjVar));
                            dxjc.d(ircVar.O, nativeCrashHandlerImpl);
                            ircVar.O = nativeCrashHandlerImpl;
                            t = nativeCrashHandlerImpl;
                        } else {
                            t = (T) obj9;
                        }
                    }
                    return t;
                case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                    return (T) false;
                case 102:
                    return (T) btsf.a(this.a.b, null, null, null);
                case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                    return (T) this.a.p();
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 0:
                return (T) this.a.sd();
            case 1:
                return (T) this.a.M();
            case 2:
                return (T) this.a.rp();
            case 3:
                return (T) this.a.rR();
            case 4:
                return (T) this.a.rU();
            case 5:
                return (T) this.a.E();
            case 6:
                return (T) this.a.J();
            case 7:
                scheduledExecutorService = new btry(this.a.E());
                break;
            case 8:
                return (T) this.a.K();
            case 9:
                return (T) this.a.o();
            case 10:
                return (T) this.a.r();
            case 11:
                return (T) this.a.N();
            case 12:
                return (T) this.a.rq();
            case 13:
                T t3 = (T) this.a.rp().getFeedbackParameters();
                dxjg.f(t3);
                return t3;
            case 14:
                return (T) this.a.P();
            case 15:
                return (T) this.a.rE();
            case 16:
                return (T) this.a.R();
            case 17:
                return (T) this.a.z();
            case 18:
                return (T) this.a.sc();
            case 19:
                return (T) this.a.L();
            case 20:
                return (T) this.a.V();
            case 21:
                irc ircVar2 = this.a;
                Object obj10 = ircVar2.l;
                if (obj10 instanceof dxjf) {
                    synchronized (obj10) {
                        obj = ircVar2.l;
                        if (obj instanceof dxjf) {
                            buiq buiqVar = new buiq(ircVar2.aa(), ircVar2.ab(), ircVar2.aO(), dxjc.c(ircVar2.ac()), dxjc.c(ircVar2.W()), ircVar2.rR(), ircVar2.rU(), ircVar2.tk(), ircVar2.ae());
                            dzsj dzsjVar2 = ircVar2.f;
                            if (dzsjVar2 == null) {
                                dzsjVar2 = new irb(ircVar2, 26);
                                ircVar2.f = dzsjVar2;
                            }
                            dxio c = dxjc.c(dzsjVar2);
                            dzsj dzsjVar3 = ircVar2.g;
                            if (dzsjVar3 == null) {
                                dzsjVar3 = new irb(ircVar2, 40);
                                ircVar2.g = dzsjVar3;
                            }
                            dxio c2 = dxjc.c(dzsjVar3);
                            bujh bujhVar = new bujh(ircVar2.an(), ircVar2.aO(), dxjc.c(ircVar2.W()), ircVar2.rR(), ircVar2.rU(), ircVar2.tk(), ircVar2.am(), ircVar2.ae());
                            dzsj dzsjVar4 = ircVar2.j;
                            if (dzsjVar4 == null) {
                                dzsjVar4 = new irb(ircVar2, 42);
                                ircVar2.j = dzsjVar4;
                            }
                            dxio c3 = dxjc.c(dzsjVar4);
                            Object obj11 = ircVar2.c;
                            if (obj11 instanceof dxjf) {
                                synchronized (obj11) {
                                    obj2 = ircVar2.c;
                                    if (obj2 instanceof dxjf) {
                                        obj2 = new buiv();
                                        dxjc.d(ircVar2.c, obj2);
                                        ircVar2.c = obj2;
                                    }
                                }
                                obj11 = obj2;
                            }
                            buiv buivVar = (buiv) obj11;
                            CronetEngine aO = ircVar2.aO();
                            cqat rR = ircVar2.rR();
                            dehq tk = ircVar2.tk();
                            cvhk cvhkVar = new cvhk(ircVar2.b);
                            dzsj dzsjVar5 = ircVar2.k;
                            if (dzsjVar5 == null) {
                                dzsjVar5 = new irb(ircVar2, 45);
                                ircVar2.k = dzsjVar5;
                            }
                            new cvhu(aO, rR, tk, cvhkVar, dzsjVar5, ircVar2.b);
                            buit buitVar = new buit(buiqVar, c, c2, bujhVar, c3, new buhj(ircVar2.aO(), ircVar2.tk()));
                            dxjc.d(ircVar2.l, buitVar);
                            ircVar2.l = buitVar;
                            obj = buitVar;
                        }
                    }
                    obj10 = obj;
                }
                return (T) ((buit) obj10);
            case 22:
                return (T) this.a.aO();
            case 23:
                return (T) new btvi();
            case 24:
                return (T) this.a.sx();
            case 25:
                return (T) this.a.aN();
            case 26:
                return (T) this.a.al();
            case 27:
                irc ircVar3 = this.a;
                dzsj dzsjVar6 = ircVar3.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new irb(ircVar3, 28);
                    ircVar3.d = dzsjVar6;
                }
                dzsj dzsjVar7 = ircVar3.e;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new irb(ircVar3, 29);
                    ircVar3.e = dzsjVar7;
                }
                scheduledExecutorService = new bucd(dzsjVar6, dzsjVar7, ircVar3.X());
                break;
            case 28:
                return (T) this.a.af();
            case 29:
                return (T) this.a.Z();
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                scheduledExecutorService = new btvd(this.a.X());
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return (T) this.a.Y();
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return (T) this.a.ah();
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                T t4 = (T) this.a.rp().getNetworkParameters();
                dxjg.f(t4);
                return t4;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return (T) this.a.ai();
            case 35:
                T t5 = (T) this.a.rp().getTriggerExperimentIdParameters();
                dxjg.f(t5);
                return t5;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return (T) this.a.ru();
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return (T) this.a.aj();
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return (T) this.a.T();
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                T t6 = (T) ((kuw) this.a.ak()).a.b();
                dxjg.f(t6);
                return t6;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return (T) this.a.aR();
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                T t7 = (T) this.a.rp().getPaintParameters();
                dxjg.f(t7);
                return t7;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                irc ircVar4 = this.a;
                dzsj dzsjVar8 = ircVar4.h;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new irb(ircVar4, 43);
                    ircVar4.h = dzsjVar8;
                }
                dxio c4 = dxjc.c(dzsjVar8);
                dzsj dzsjVar9 = ircVar4.i;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new irb(ircVar4, 44);
                    ircVar4.i = dzsjVar9;
                }
                return (T) new bual(c4, dxjc.c(dzsjVar9), ircVar4.U(), ircVar4.rU());
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                scheduledExecutorService = new buaf(new buag());
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return (T) this.a.ao();
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                T t8 = (T) this.a.rp().getNavigationSdkParameters();
                dxjg.f(t8);
                return t8;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                irc ircVar5 = this.a;
                dzsj dzsjVar10 = ircVar5.n;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new irb(ircVar5, 52);
                    ircVar5.n = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj dzsjVar12 = ircVar5.p;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new irb(ircVar5, 53);
                    ircVar5.p = dzsjVar12;
                }
                dzsj dzsjVar13 = dzsjVar12;
                dzsj dzsjVar14 = ircVar5.q;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new irb(ircVar5, 54);
                    ircVar5.q = dzsjVar14;
                }
                dzsj dzsjVar15 = dzsjVar14;
                dzsj dzsjVar16 = ircVar5.r;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new irb(ircVar5, 55);
                    ircVar5.r = dzsjVar16;
                }
                dzsj dzsjVar17 = dzsjVar16;
                dzsj<buhr> au = ircVar5.au();
                dzsj dzsjVar18 = ircVar5.t;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new irb(ircVar5, 57);
                    ircVar5.t = dzsjVar18;
                }
                dzsj dzsjVar19 = dzsjVar18;
                dzsj dzsjVar20 = ircVar5.v;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new irb(ircVar5, 58);
                    ircVar5.v = dzsjVar20;
                }
                dzsj dzsjVar21 = dzsjVar20;
                dzsj dzsjVar22 = ircVar5.x;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new irb(ircVar5, 59);
                    ircVar5.x = dzsjVar22;
                }
                dzsj dzsjVar23 = dzsjVar22;
                dzsj dzsjVar24 = ircVar5.y;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new irb(ircVar5, 60);
                    ircVar5.y = dzsjVar24;
                }
                dzsj dzsjVar25 = dzsjVar24;
                dzsj dzsjVar26 = ircVar5.z;
                if (dzsjVar26 == null) {
                    dzsjVar26 = new irb(ircVar5, 61);
                    ircVar5.z = dzsjVar26;
                }
                dzsj dzsjVar27 = dzsjVar26;
                dzsj<cqat> H = ircVar5.H();
                dzsj dzsjVar28 = ircVar5.A;
                if (dzsjVar28 == null) {
                    dzsjVar28 = new irb(ircVar5, 62);
                    ircVar5.A = dzsjVar28;
                }
                dzsj dzsjVar29 = dzsjVar28;
                dzsj dzsjVar30 = ircVar5.C;
                if (dzsjVar30 == null) {
                    dzsjVar30 = new irb(ircVar5, 64);
                    ircVar5.C = dzsjVar30;
                }
                return (T) new buie(dzsjVar11, dzsjVar13, dzsjVar15, dzsjVar17, au, dzsjVar19, dzsjVar21, dzsjVar23, dzsjVar25, dzsjVar27, H, dzsjVar29, dzsjVar30);
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return (T) this.a.aq();
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                irc ircVar6 = this.a;
                btvo rp = ircVar6.rp();
                dxjc.c(ircVar6.R);
                scheduledExecutorService = new aehr(rp);
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return (T) this.a.ar();
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return (T) this.a.ap();
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                irc ircVar7 = this.a;
                return (T) new bugk(irs.b(ircVar7.b), new isa(ircVar7.rU()));
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                irc ircVar8 = this.a;
                Object obj12 = ircVar8.m;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj3 = ircVar8.m;
                        if (obj3 instanceof dxjf) {
                            buhu buhuVar = new buhu(ircVar8.aa(), dbsg.i(ircVar8.ag()), ircVar8.an());
                            dxjc.d(ircVar8.m, buhuVar);
                            ircVar8.m = buhuVar;
                            obj3 = buhuVar;
                        }
                    }
                    obj12 = obj3;
                }
                return (T) ((buhu) obj12);
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                irc ircVar9 = this.a;
                Object obj13 = ircVar9.o;
                if (obj13 instanceof dxjf) {
                    synchronized (obj13) {
                        obj4 = ircVar9.o;
                        if (obj4 instanceof dxjf) {
                            obj4 = new buhv(ircVar9.E());
                            dxjc.d(ircVar9.o, obj4);
                            ircVar9.o = obj4;
                        }
                    }
                    obj13 = obj4;
                }
                return (T) ((buhv) obj13);
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return (T) this.a.as();
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return (T) this.a.at();
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                irc ircVar10 = this.a;
                Object obj14 = ircVar10.s;
                if (obj14 instanceof dxjf) {
                    synchronized (obj14) {
                        obj5 = ircVar10.s;
                        if (obj5 instanceof dxjf) {
                            obj5 = new buhr(ircVar10.rR(), ircVar10.E());
                            dxjc.d(ircVar10.s, obj5);
                            ircVar10.s = obj5;
                        }
                    }
                    obj14 = obj5;
                }
                return (T) ((buhr) obj14);
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                scheduledExecutorService = new buig(this.a.aN());
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                irc ircVar11 = this.a;
                Object obj15 = ircVar11.u;
                if (obj15 instanceof dxjf) {
                    synchronized (obj15) {
                        obj6 = ircVar11.u;
                        if (obj6 instanceof dxjf) {
                            obj6 = new buif(ircVar11.aN());
                            dxjc.d(ircVar11.u, obj6);
                            ircVar11.u = obj6;
                        }
                    }
                    obj15 = obj6;
                }
                return (T) ((buif) obj15);
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                irc ircVar12 = this.a;
                Object obj16 = ircVar12.w;
                if (obj16 instanceof dxjf) {
                    synchronized (obj16) {
                        obj7 = ircVar12.w;
                        if (obj7 instanceof dxjf) {
                            obj7 = new buhx(ircVar12.rR(), ircVar12.E());
                            dxjc.d(ircVar12.w, obj7);
                            ircVar12.w = obj7;
                        }
                    }
                    obj16 = obj7;
                }
                return (T) ((buhx) obj16);
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return (T) this.a.av();
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return (T) this.a.aw();
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return (T) dbsg.i(this.a.ax());
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return (T) dbsg.i(new cnjq(this.a.b));
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                irc ircVar13 = this.a;
                Object obj17 = ircVar13.B;
                scheduledExecutorService = obj17;
                if (obj17 == null) {
                    ScheduledExecutorService a = bvpw.a(dxjc.c(ircVar13.ay()), bvrj.LOCATION_FRESHNESS_WAITING_THREADPOOL, ircVar13.rR());
                    ircVar13.B = a;
                    scheduledExecutorService = a;
                    break;
                }
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return (T) this.a.D();
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return (T) this.a.si();
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return (T) this.a.sj();
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return (T) this.a.az();
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return (T) this.a.aB();
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return (T) this.a.G();
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return (T) this.a.ad();
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return (T) this.a.aV();
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return (T) this.a.aT();
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                irc ircVar14 = this.a;
                return (T) new buwb(dxjc.c(ircVar14.Q()), ircVar14.D());
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return (T) this.a.S();
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                irc ircVar15 = this.a;
                return (T) new btxm(ircVar15.b, ircVar15.rR(), dxjc.c(ircVar15.aA()), dxjc.c(ircVar15.aC()), dxjc.c(ircVar15.I()), ircVar15.tg());
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                irc ircVar16 = this.a;
                dzsj dzsjVar31 = ircVar16.D;
                if (dzsjVar31 == null) {
                    dzsjVar31 = new irb(ircVar16, 78);
                    ircVar16.D = dzsjVar31;
                }
                scheduledExecutorService = new afdf(dxjc.c(dzsjVar31), ircVar16.tg(), dxjc.c(ircVar16.I()));
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                irc ircVar17 = this.a;
                return (T) bukk.b(dxjc.c(ircVar17.Q()), ircVar17.D());
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return (T) this.a.aE();
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return (T) dbsg.i(coxs.a(this.a.b));
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return (T) this.a.sD();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return (T) this.a.O();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return (T) this.a.sO();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return (T) new ckcl();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return (T) this.a.sg();
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return (T) this.a.aX();
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return (T) this.a.rY();
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return (T) this.a.so();
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                irc ircVar18 = this.a;
                scheduledExecutorService = new afei(ircVar18.b, ircVar18.rR());
                break;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                irc ircVar19 = this.a;
                Object obj18 = ircVar19.Q;
                if (obj18 instanceof dxjf) {
                    synchronized (obj18) {
                        obj8 = ircVar19.Q;
                        if (obj8 instanceof dxjf) {
                            dbpy<Object> dbpyVar = dbpy.a;
                            Application application = ircVar19.b;
                            final dzsj dzsjVar32 = ircVar19.E;
                            if (dzsjVar32 == null) {
                                dzsjVar32 = new irb(ircVar19, 91);
                                ircVar19.E = dzsjVar32;
                            }
                            dbpy<Object> dbpyVar2 = dbpy.a;
                            dzsj dzsjVar33 = ircVar19.F;
                            if (dzsjVar33 == null) {
                                dzsjVar33 = new irb(ircVar19, 92);
                                ircVar19.F = dzsjVar33;
                            }
                            dbsg<dzsj<cwze>> i2 = dbsg.i(dzsjVar33);
                            dzsj dzsjVar34 = ircVar19.G;
                            if (dzsjVar34 == null) {
                                dzsjVar34 = new irb(ircVar19, 93);
                                ircVar19.G = dzsjVar34;
                            }
                            dbsg<dzsj<cxdg>> i3 = dbsg.i(dzsjVar34);
                            dzsj dzsjVar35 = ircVar19.H;
                            if (dzsjVar35 == null) {
                                dzsjVar35 = new irb(ircVar19, 94);
                                ircVar19.H = dzsjVar35;
                            }
                            dbsg<dzsj<cxai>> i4 = dbsg.i(dzsjVar35);
                            dzsj dzsjVar36 = ircVar19.I;
                            if (dzsjVar36 == null) {
                                dzsjVar36 = new irb(ircVar19, 95);
                                ircVar19.I = dzsjVar36;
                            }
                            dbsg<dzsj<cwxp>> i5 = dbsg.i(dzsjVar36);
                            dzsj dzsjVar37 = ircVar19.J;
                            if (dzsjVar37 == null) {
                                dzsjVar37 = new irb(ircVar19, 96);
                                ircVar19.J = dzsjVar37;
                            }
                            dbsg<dzsj<cxcg>> i6 = dbsg.i(dzsjVar37);
                            dzsj dzsjVar38 = ircVar19.K;
                            if (dzsjVar38 == null) {
                                dzsjVar38 = new irb(ircVar19, 97);
                                ircVar19.K = dzsjVar38;
                            }
                            dbsg<dzsj<cwyo>> i7 = dbsg.i(dzsjVar38);
                            dbpy<Object> dbpyVar3 = dbpy.a;
                            dzsj dzsjVar39 = ircVar19.L;
                            if (dzsjVar39 == null) {
                                dzsjVar39 = new irb(ircVar19, 98);
                                ircVar19.L = dzsjVar39;
                            }
                            dbsg<dzsj<cxef>> i8 = dbsg.i(dzsjVar39);
                            dzsj dzsjVar40 = ircVar19.M;
                            if (dzsjVar40 == null) {
                                dzsjVar40 = new irb(ircVar19, 99);
                                ircVar19.M = dzsjVar40;
                            }
                            dbsg<dzsj<cwvf>> i9 = dbsg.i(dzsjVar40);
                            dbpy<Object> dbpyVar4 = dbpy.a;
                            dbpy<Object> dbpyVar5 = dbpy.a;
                            dbpy<Object> dbpyVar6 = dbpy.a;
                            dzsj dzsjVar41 = ircVar19.P;
                            if (dzsjVar41 == null) {
                                dbsgVar = i8;
                                dzsjVar41 = new irb(ircVar19, 100);
                                ircVar19.P = dzsjVar41;
                            } else {
                                dbsgVar = i8;
                            }
                            dbsg<dzsj<NativeCrashHandlerImpl>> i10 = dbsg.i(dzsjVar41);
                            cwtf cwtfVar = new cwtf(application, new cwrm());
                            dbpyVar.c(cwtfVar);
                            cwrt cwrtVar = cwtfVar.a;
                            dzsjVar32.getClass();
                            cwrtVar.i(new dbty(dzsjVar32) { // from class: cwte
                                private final dzsj a;

                                {
                                    this.a = dzsjVar32;
                                }

                                @Override // defpackage.dbty
                                public final Object a() {
                                    return this.a.a();
                                }
                            });
                            cwtfVar.a.d(dbpyVar2);
                            cwtfVar.a.h(i2);
                            cwtfVar.a.k(i4);
                            cwtfVar.a.l(i6);
                            cwtfVar.a.m(dbpyVar3);
                            cwtfVar.a.b(i9);
                            cwtfVar.a.e(dbpyVar4);
                            cwtfVar.a.f(dbpyVar5);
                            cwtfVar.a(dbpyVar6);
                            cwtfVar.a.o(dbsgVar);
                            cwtfVar.a.n(i3);
                            cwtfVar.a.g(i7);
                            cwtfVar.a.c(i5);
                            cwtfVar.a(dbpyVar6);
                            cwtfVar.a.p(i10);
                            obj8 = cwsy.a(cwtfVar.a.a());
                            dxjg.f(obj8);
                            dxjc.d(ircVar19.Q, obj8);
                            ircVar19.Q = obj8;
                        }
                    }
                    obj18 = obj8;
                }
                return (T) ((cwsy) obj18);
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                irc ircVar20 = this.a;
                return (T) dcep.B(new ckod(ircVar20.b, ircVar20.F(), ircVar20.aD(), ircVar20.a, ircVar20.M(), ircVar20.U()));
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                dxio c5 = dxjc.c(this.a.U());
                cwzd h = cwze.h();
                h.b(true);
                h.d(((dkiy) c5.a()).H);
                T t9 = (T) h.a();
                dxjg.f(t9);
                return t9;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                dxio c6 = dxjc.c(this.a.U());
                cxdf e = cxdg.e();
                e.d(((dkiy) c6.a()).G);
                T t10 = (T) e.c();
                dxjg.f(t10);
                return t10;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                dxio c7 = dxjc.c(this.a.U());
                cxah g = cxai.g();
                g.e(((dkiy) c7.a()).K);
                g.b(true);
                T t11 = (T) g.d();
                dxjg.f(t11);
                return t11;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return (T) this.a.aF();
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                dkiy dkiyVar = (dkiy) dxjc.c(this.a.U()).a();
                cxcf e2 = cxcg.e();
                e2.c(dkiyVar.P);
                cxbo cxboVar = new cxbo();
                cxboVar.a = 5;
                cxboVar.d = 1;
                if (dkiyVar.P && dkiyVar.Q) {
                    z = true;
                }
                cxboVar.d = true != z ? 2 : 3;
                Pattern compile = Pattern.compile(".*");
                if (cxboVar.b == null) {
                    if (cxboVar.c == null) {
                        cxboVar.b = dcdc.F();
                    } else {
                        cxboVar.b = dcdc.F();
                        cxboVar.b.i(cxboVar.c);
                        cxboVar.c = null;
                    }
                }
                cxboVar.b.g(compile);
                dccx<Pattern> dccxVar = cxboVar.b;
                if (dccxVar != null) {
                    cxboVar.c = dccxVar.f();
                } else if (cxboVar.c == null) {
                    cxboVar.c = dcdc.e();
                }
                String str = cxboVar.d == 0 ? " enablement" : "";
                if (cxboVar.a == null) {
                    str = str.concat(" maxFolderDepth");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                ((cxbq) e2).b = dbsg.i(new cxbp(cxboVar.d, cxboVar.a.intValue(), cxboVar.c));
                T t12 = (T) e2.a();
                dxjg.f(t12);
                return t12;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                dxio c8 = dxjc.c(this.a.U());
                cwyn c9 = cwyo.c();
                c9.c(((dkiy) c8.a()).F);
                T t13 = (T) c9.a();
                dxjg.f(t13);
                return t13;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                dxio c10 = dxjc.c(this.a.U());
                cxee d = cxef.d();
                dkiy dkiyVar2 = (dkiy) c10.a();
                d.d(false);
                T t14 = (T) d.c();
                dxjg.f(t14);
                return t14;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return (T) this.a.aG();
            default:
                throw new AssertionError(i);
        }
        return scheduledExecutorService;
    }
}
