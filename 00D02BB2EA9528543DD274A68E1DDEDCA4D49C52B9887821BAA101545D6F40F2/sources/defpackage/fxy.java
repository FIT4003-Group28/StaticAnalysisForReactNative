package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.gmm.offline.backends.OfflineInfrastructureNativeImpl;
import com.google.android.apps.gmm.offline.instance.OfflineInstanceNativeImpl;
import com.google.android.filament.R;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.ar.core.ArCoreNativeInterop;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.geo.ar.arlo.api.jni.ArloSessionJniImpl;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxy  reason: default package */
/* loaded from: classes.dex */
public final class fxy<T> implements dzsj<T> {
    final /* synthetic */ fyu a;
    private final int b;

    public fxy(fyu fyuVar, int i) {
        this.a = fyuVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v45, types: [dehq, T, java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [avqo] */
    /* JADX WARN: Type inference failed for: r1v96, types: [T, awhl] */
    private final T c() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i = this.b;
        switch (i) {
            case 100:
                return (T) this.a.aK();
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return (T) new bzvr(this.a.m());
            case 102:
                fyu fyuVar = this.a;
                Application a = fyuVar.a.a();
                dxjg.e(a);
                return (T) new bzuv(a, dxjc.c(fyuVar.p()), fyuVar.cu(), fyuVar.bj(), fyuVar.bg());
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                fyu fyuVar2 = this.a;
                Application a2 = fyuVar2.a.a();
                dxjg.e(a2);
                return (T) new bzvz(a2, fyuVar2.cu(), fyuVar2.bj(), fyuVar2.bg());
            case 104:
                return (T) new cpv();
            case 105:
                return (T) this.a.au();
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return (T) this.a.bq();
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return (T) this.a.br();
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return (T) this.a.aM();
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                return (T) this.a.aS();
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return (T) this.a.qp();
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                return (T) this.a.qc();
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                fyu fyuVar3 = this.a;
                dxjg.e(fyuVar3.a.rB());
                cqat rR = fyuVar3.a.rR();
                dxjg.e(rR);
                fyuVar3.cu();
                btvo rp = fyuVar3.a.rp();
                dxjg.e(rp);
                dzsj dzsjVar = fyuVar3.H;
                if (dzsjVar == null) {
                    dzsjVar = new fxy(fyuVar3, R.styleable.AppCompatTheme_toolbarStyle);
                    fyuVar3.H = dzsjVar;
                }
                dxjc.c(dzsjVar);
                return (T) new bypm(rR, rp);
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                fyu fyuVar4 = this.a;
                fyuVar4.M();
                fyuVar4.ts();
                return (T) new byrz();
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                fyu fyuVar5 = this.a;
                Object obj9 = fyuVar5.I;
                if (obj9 instanceof dxjf) {
                    synchronized (obj9) {
                        obj = fyuVar5.I;
                        if (obj instanceof dxjf) {
                            Application a3 = fyuVar5.a.a();
                            dxjg.e(a3);
                            bvjj rB = fyuVar5.a.rB();
                            dxjg.e(rB);
                            dxio c = dxjc.c(fyuVar5.at());
                            dxio c2 = dxjc.c(fyuVar5.u());
                            dxio c3 = dxjc.c(fyuVar5.p());
                            GoogleApiClient bA = fyuVar5.bA();
                            coki b = byqm.b();
                            cqat rR2 = fyuVar5.a.rR();
                            dxjg.e(rR2);
                            obj = new qqb(a3, rB, c, c2, c3, bA, b, rR2);
                            dxjc.d(fyuVar5.I, obj);
                            fyuVar5.I = obj;
                        }
                    }
                    obj9 = obj;
                }
                return (T) ((qqb) obj9);
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return (T) new rig();
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                fyu fyuVar6 = this.a;
                dzsj dzsjVar2 = fyuVar6.J;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fxy(fyuVar6, R.styleable.AppCompatTheme_windowActionBar);
                    fyuVar6.J = dzsjVar2;
                }
                dzsj dzsjVar3 = fyuVar6.L;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fxy(fyuVar6, R.styleable.AppCompatTheme_windowActionBarOverlay);
                    fyuVar6.L = dzsjVar3;
                }
                return (T) new rhz(dzsjVar2, dzsjVar3);
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return (T) new rht();
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                fyu fyuVar7 = this.a;
                dzsj dzsjVar4 = fyuVar7.K;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fxy(fyuVar7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                    fyuVar7.K = dzsjVar4;
                }
                return (T) new rik(dzsjVar4);
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return (T) new rii();
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return (T) new rin();
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                return (T) this.a.bF();
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                fyu fyuVar8 = this.a;
                return (T) new rgx(fyuVar8.bG(), fyuVar8.bH());
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return (T) this.a.bH();
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                fyu fyuVar9 = this.a;
                Application a4 = fyuVar9.a.a();
                dxjg.e(a4);
                qjk bK = fyuVar9.bK();
                auhj bg = fyuVar9.bg();
                aufl cu = fyuVar9.cu();
                btvo rp2 = fyuVar9.a.rp();
                dxjg.e(rp2);
                bvjj rB2 = fyuVar9.a.rB();
                dxjg.e(rB2);
                cqat rR3 = fyuVar9.a.rR();
                dxjg.e(rR3);
                return (T) new rop(a4, bK, bg, cu, rp2, rB2, rR3);
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                fyu fyuVar10 = this.a;
                return (T) new byro(fyuVar10.M(), fyuVar10.ts());
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                fyu fyuVar11 = this.a;
                Object obj10 = fyuVar11.M;
                if (obj10 instanceof dxjf) {
                    synchronized (obj10) {
                        obj2 = fyuVar11.M;
                        if (obj2 instanceof dxjf) {
                            bypa bypaVar = new bypa(fyuVar11.bM());
                            dxjc.d(fyuVar11.M, bypaVar);
                            fyuVar11.M = bypaVar;
                            obj2 = bypaVar;
                        }
                    }
                    obj10 = obj2;
                }
                return (T) ((bypa) obj10);
            case 127:
                return (T) this.a.bN();
            case 128:
                return (T) this.a.bD();
            case 129:
                return (T) new joh(this.a.bQ());
            case 130:
                return (T) this.a.bX();
            case 131:
                T t = (T) this.a.a.rr();
                dxjg.e(t);
                return t;
            case 132:
                T t2 = (T) this.a.a.sc();
                dxjg.e(t2);
                return t2;
            case 133:
                return (T) this.a.bU();
            case 134:
                return (T) this.a.ca();
            case 135:
                return (T) this.a.bR();
            case 136:
                return (T) this.a.cg();
            case 137:
                return (T) this.a.M();
            case 138:
                return (T) this.a.ts();
            case 139:
                return (T) this.a.cw();
            case 140:
                return (T) this.a.cr();
            case 141:
                return (T) cezm.b();
            case 142:
                return (T) this.a.ck();
            case 143:
                return (T) this.a.cm();
            case 144:
                fyu fyuVar12 = this.a;
                bvjj rB3 = fyuVar12.a.rB();
                dxjg.e(rB3);
                aqwq co = fyuVar12.co();
                apyx cm = fyuVar12.cm();
                cjqy tr = fyuVar12.a.tr();
                dxjg.e(tr);
                return (T) new aqrq(rB3, co, cm, tr);
            case 145:
                fyu fyuVar13 = this.a;
                Object obj11 = fyuVar13.N;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj3 = fyuVar13.N;
                        if (obj3 instanceof dxjf) {
                            obj3 = new autb();
                            dxjc.d(fyuVar13.N, obj3);
                            fyuVar13.N = obj3;
                        }
                    }
                    obj11 = obj3;
                }
                return (T) ((autb) obj11);
            case 146:
                return (T) this.a.cs();
            case 147:
                return (T) this.a.bg();
            case 148:
                T t3 = (T) this.a.a.sz();
                dxjg.e(t3);
                return t3;
            case 149:
                return (T) this.a.e();
            case 150:
                return (T) this.a.qF();
            case 151:
                return (T) this.a.cC();
            case 152:
                Application a5 = this.a.a.a();
                dxjg.e(a5);
                return (T) new kfc(a5);
            case 153:
                return (T) this.a.qk();
            case 154:
                fyu fyuVar14 = this.a;
                Object obj12 = fyuVar14.O;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj4 = fyuVar14.O;
                        if (obj4 instanceof dxjf) {
                            obj4 = new axrf();
                            dxjc.d(fyuVar14.O, obj4);
                            fyuVar14.O = obj4;
                        }
                    }
                    obj12 = obj4;
                }
                return (T) ((axrf) obj12);
            case 155:
                return (T) this.a.sI();
            case 156:
                fyu fyuVar15 = this.a;
                awar qM = fyuVar15.qM();
                ahjq wf = fyuVar15.wf();
                btvo rp3 = fyuVar15.a.rp();
                dxjg.e(rp3);
                return (T) new awhs(qM, wf, rp3, fyuVar15.qP(), fyuVar15.cM());
            case 157:
                fyu fyuVar16 = this.a;
                Object obj13 = fyuVar16.Q;
                if (obj13 instanceof dxjf) {
                    synchronized (obj13) {
                        obj5 = fyuVar16.Q;
                        if (obj5 instanceof dxjf) {
                            dehq sZ = fyuVar16.a.sZ();
                            dxjg.e(sZ);
                            obj5 = dehx.b(sZ);
                            dxjc.d(fyuVar16.Q, obj5);
                            fyuVar16.Q = obj5;
                        }
                    }
                    obj13 = obj5;
                }
                return (T) ((Executor) obj13);
            case 158:
                fyu fyuVar17 = this.a;
                T t4 = (T) fyuVar17.S;
                if (t4 != null) {
                    return t4;
                }
                ?? r1 = (T) fyuVar17.a.sZ();
                dxjg.e(r1);
                fyuVar17.S = r1;
                return r1;
            case 159:
                return (T) this.a.cN();
            case 160:
                T t5 = (T) this.a.dj().e();
                dbsk.s(t5);
                return t5;
            case 161:
                cqat rR4 = this.a.a.rR();
                dxjg.e(rR4);
                return (T) new avbg(rR4);
            case 162:
                return (T) new avtv(this.a.K());
            case 163:
                fyu fyuVar18 = this.a;
                dzsj dzsjVar5 = fyuVar18.Y;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fxy(fyuVar18, 164);
                    fyuVar18.Y = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj<bvow> cP = fyuVar18.cP();
                dzsj dzsjVar7 = fyuVar18.ag;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fxy(fyuVar18, 166);
                    fyuVar18.ag = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj<cjqy> al = fyuVar18.al();
                dzsj dzsjVar9 = fyuVar18.ah;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fxy(fyuVar18, 174);
                    fyuVar18.ah = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj<dehq> U = fyuVar18.U();
                dzsj dzsjVar11 = fyuVar18.aj;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fxy(fyuVar18, 175);
                    fyuVar18.aj = dzsjVar11;
                }
                return (T) new avfo(dzsjVar6, cP, dzsjVar8, al, dzsjVar10, U, dzsjVar11);
            case 164:
                return (T) this.a.aa();
            case 165:
                Context b2 = this.a.a.b();
                dxjg.e(b2);
                return (T) new bvow(b2);
            case 166:
                fyu fyuVar19 = this.a;
                dzsj<avop> G = fyuVar19.G();
                dzsj<dehq> Q = fyuVar19.Q();
                dzsj dzsjVar12 = fyuVar19.ab;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fxy(fyuVar19, 167);
                    fyuVar19.ab = dzsjVar12;
                }
                dzsj dzsjVar13 = dzsjVar12;
                dzsj dzsjVar14 = fyuVar19.ac;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fxy(fyuVar19, 169);
                    fyuVar19.ac = dzsjVar14;
                }
                dzsj dzsjVar15 = dzsjVar14;
                dzsj dzsjVar16 = fyuVar19.af;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new fxy(fyuVar19, 171);
                    fyuVar19.af = dzsjVar16;
                }
                return (T) new avra(G, Q, dzsjVar13, dzsjVar15, dzsjVar16, fyuVar19.E());
            case 167:
                fyu fyuVar20 = this.a;
                T t6 = (T) fyuVar20.aa;
                T t7 = t6;
                if (t6 == null) {
                    dzsj dzsjVar17 = fyuVar20.Z;
                    if (dzsjVar17 == null) {
                        dzsjVar17 = new fxy(fyuVar20, 168);
                        fyuVar20.Z = dzsjVar17;
                    }
                    ?? r12 = (T) new avqo(dzsjVar17, fyuVar20.qP(), fyuVar20.T(), fyuVar20.D());
                    fyuVar20.aa = r12;
                    t7 = r12;
                }
                return t7;
            case 168:
                fyu fyuVar21 = this.a;
                dxio c4 = dxjc.c(fyuVar21.h());
                bvrb tn = fyuVar21.a.tn();
                dxjg.e(tn);
                return (T) new bveg(c4, tn);
            case 169:
                fyu fyuVar22 = this.a;
                dxjg.e(fyuVar22.a.rp());
                btpc sz = fyuVar22.a.sz();
                dxjg.e(sz);
                dxjg.e(fyuVar22.a.rB());
                awfh qP = fyuVar22.qP();
                fyuVar22.D();
                return (T) new avrd(sz, qP, dxjc.c(fyuVar22.cQ()));
            case 170:
                return (T) this.a.qJ();
            case 171:
                fyu fyuVar23 = this.a;
                dzsj dzsjVar18 = fyuVar23.ae;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new fxy(fyuVar23, 172);
                    fyuVar23.ae = dzsjVar18;
                }
                return (T) new avrg(dzsjVar18, fyuVar23.aw(), fyuVar23.cR(), fyuVar23.G());
            case 172:
                fyu fyuVar24 = this.a;
                Object obj14 = fyuVar24.ad;
                if (obj14 instanceof dxjf) {
                    synchronized (obj14) {
                        obj6 = fyuVar24.ad;
                        if (obj6 instanceof dxjf) {
                            btrm rz = fyuVar24.a.rz();
                            dxjg.e(rz);
                            Executor sV = fyuVar24.a.sV();
                            dxjg.e(sV);
                            avpr avprVar = new avpr(rz, sV);
                            dxjc.d(fyuVar24.ad, avprVar);
                            fyuVar24.ad = avprVar;
                            obj6 = avprVar;
                        }
                    }
                    obj14 = obj6;
                }
                return (T) ((avpr) obj14);
            case 173:
                return (T) this.a.qM();
            case 174:
                return (T) new avtt(this.a.K());
            case 175:
                fyu fyuVar25 = this.a;
                Object obj15 = fyuVar25.ai;
                if (obj15 instanceof dxjf) {
                    synchronized (obj15) {
                        obj7 = fyuVar25.ai;
                        if (obj7 instanceof dxjf) {
                            obj7 = new avgs();
                            dxjc.d(fyuVar25.ai, obj7);
                            fyuVar25.ai = obj7;
                        }
                    }
                    obj15 = obj7;
                }
                return (T) ((avgs) obj15);
            case 176:
                T t8 = (T) this.a.a.sY();
                dxjg.e(t8);
                return t8;
            case 177:
                return (T) new avhd(this.a.T());
            case 178:
                return (T) this.a.X();
            case 179:
                return (T) this.a.cM();
            case 180:
                fyu fyuVar26 = this.a;
                awar qM2 = fyuVar26.qM();
                Object obj16 = fyuVar26.an;
                if (obj16 instanceof dxjf) {
                    synchronized (obj16) {
                        obj8 = fyuVar26.an;
                        if (obj8 instanceof dxjf) {
                            awar qM3 = fyuVar26.qM();
                            cqat rR5 = fyuVar26.a.rR();
                            dxjg.e(rR5);
                            btvo rp4 = fyuVar26.a.rp();
                            dxjg.e(rp4);
                            obj8 = new awaq(qM3, rR5, rp4, fyuVar26.aN());
                            dxjc.d(fyuVar26.an, obj8);
                            fyuVar26.an = obj8;
                        }
                    }
                    obj16 = obj8;
                }
                return (T) new avzr(qM2, (awab) obj16);
            case 181:
                fyu fyuVar27 = this.a;
                T t9 = (T) fyuVar27.ap;
                if (t9 != null) {
                    return t9;
                }
                dxjg.e(fyuVar27.a.a());
                fyuVar27.w();
                dxjg.e(fyuVar27.a.rR());
                ?? r13 = (T) new awhl();
                fyuVar27.ap = r13;
                return r13;
            case 182:
                return (T) this.a.cU();
            case 183:
                fyu fyuVar28 = this.a;
                return (T) new avtj(fyuVar28.m(), fyuVar28.x());
            case 184:
                return (T) this.a.dl();
            case 185:
                return (T) this.a.cW();
            case 186:
                return (T) this.a.cX();
            case 187:
                fyu fyuVar29 = this.a;
                return (T) new avtn(fyuVar29.m(), fyuVar29.x());
            case 188:
                fyu fyuVar30 = this.a;
                awkw O = fyuVar30.O();
                crzm<avkc> qH = fyuVar30.qH();
                dxio c5 = dxjc.c(fyuVar30.t());
                Executor sV2 = fyuVar30.a.sV();
                dxjg.e(sV2);
                return (T) new avgx(O, qH, c5, sV2);
            case 189:
                fyu fyuVar31 = this.a;
                avki cN = fyuVar31.cN();
                awkw O2 = fyuVar31.O();
                away de = fyuVar31.de();
                avzo X = fyuVar31.X();
                cqat rR6 = fyuVar31.a.rR();
                dxjg.e(rR6);
                return (T) new avaz(cN, O2, de, X, rR6, fyuVar31.T());
            case 190:
                T t10 = (T) this.a.a.m();
                dxjg.e(t10);
                return t10;
            case 191:
                return (T) this.a.db();
            case 192:
                return (T) this.a.dc();
            case 193:
                return (T) this.a.cU().b();
            case 194:
                return (T) this.a.qH();
            case 195:
                T t11 = (T) this.a.a.sU();
                dxjg.e(t11);
                return t11;
            case 196:
                return (T) jzl.b();
            case 197:
                return (T) this.a.vi();
            case 198:
                return (T) this.a.qQ();
            case 199:
                return (T) this.a.dw();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, ahvr] */
    private final T e() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = this.b;
        switch (i) {
            case cpnx.a /* 300 */:
                return (T) new fvm(this.a);
            case 301:
                return (T) new fvs(this.a);
            case 302:
                return (T) new fvq(this.a);
            case 303:
                return (T) new fvo(this.a);
            case 304:
                return (T) new fvx(this.a);
            case 305:
                return (T) new fvu(this.a);
            case 306:
                return (T) new fvz(this.a);
            case 307:
                return (T) new fwb(this.a);
            case 308:
                return (T) new fwd(this.a);
            case 309:
                return (T) new fwf(this.a);
            case 310:
                return (T) new fwh(this.a);
            case 311:
                return (T) new fyd(this.a);
            case 312:
                return (T) new fxm(this.a);
            case 313:
                return (T) new fxq(this.a);
            case 314:
                return (T) new fxu(this.a);
            case 315:
                return (T) new fxz();
            case 316:
                return (T) new fyg(this.a);
            case 317:
                return (T) new ejr(this.a);
            case 318:
                return (T) new ekt(this.a);
            case 319:
                return (T) new ekl(this.a);
            case 320:
                return (T) new fyi(this.a);
            case 321:
                return (T) new fyk(this.a);
            case 322:
                return (T) new fym(this.a);
            case 323:
                return (T) new fyb(this.a);
            case 324:
                return (T) new fve(this.a);
            case 325:
                return (T) new fxw(this.a);
            case 326:
                return (T) new fxe(this.a);
            case 327:
                return (T) new fxc(this.a);
            case 328:
                return (T) new fys(this.a);
            case 329:
                return (T) new ekv(this.a);
            case 330:
                return (T) new fuw(this.a);
            case 331:
                return (T) new ftu(this.a);
            case 332:
                return (T) new fuu(this.a);
            case 333:
                return (T) new fus(this.a);
            case 334:
                return (T) new ekp(this.a);
            case 335:
                return (T) new fwj(this.a);
            case 336:
                return (T) new fwo(this.a);
            case 337:
                return (T) new fwr(this.a);
            case 338:
                return (T) new fwl(this.a);
            case 339:
                return (T) new ftw(this.a);
            case 340:
                return (T) new fty(this.a);
            case 341:
                return (T) new fua(this.a);
            case 342:
                fyu fyuVar = this.a;
                Object obj6 = fyuVar.bx;
                if (obj6 instanceof dxjf) {
                    synchronized (obj6) {
                        obj = fyuVar.bx;
                        if (obj instanceof dxjf) {
                            Object obj7 = fyuVar.bw;
                            if (obj7 instanceof dxjf) {
                                synchronized (obj7) {
                                    obj2 = fyuVar.bw;
                                    if (obj2 instanceof dxjf) {
                                        dcdg q = dcdn.q(20);
                                        dzsj dzsjVar = fyuVar.aV;
                                        if (dzsjVar == null) {
                                            dzsjVar = new fxy(fyuVar, 343);
                                            fyuVar.aV = dzsjVar;
                                        }
                                        q.f("GellerSyncWorker", dzsjVar);
                                        dzsj dzsjVar2 = fyuVar.aW;
                                        if (dzsjVar2 == null) {
                                            dzsjVar2 = new fxy(fyuVar, 353);
                                            fyuVar.aW = dzsjVar2;
                                        }
                                        q.f("GellerCleanupWorker", dzsjVar2);
                                        dzsj dzsjVar3 = fyuVar.aX;
                                        if (dzsjVar3 == null) {
                                            dzsjVar3 = new fxy(fyuVar, 354);
                                            fyuVar.aX = dzsjVar3;
                                        }
                                        q.f("DismissNotificationWorker", dzsjVar3);
                                        dzsj dzsjVar4 = fyuVar.aY;
                                        if (dzsjVar4 == null) {
                                            dzsjVar4 = new fxy(fyuVar, 355);
                                            fyuVar.aY = dzsjVar4;
                                        }
                                        q.f("GlideDiskCacheExpirationServiceWorker", dzsjVar4);
                                        dzsj dzsjVar5 = fyuVar.bc;
                                        if (dzsjVar5 == null) {
                                            dzsjVar5 = new fxy(fyuVar, 356);
                                            fyuVar.bc = dzsjVar5;
                                        }
                                        q.f("GunsNotificationFetcherWorker", dzsjVar5);
                                        dzsj dzsjVar6 = fyuVar.bd;
                                        if (dzsjVar6 == null) {
                                            dzsjVar6 = new fxy(fyuVar, 375);
                                            fyuVar.bd = dzsjVar6;
                                        }
                                        q.f("UsrUpdateWorker", dzsjVar6);
                                        dzsj dzsjVar7 = fyuVar.be;
                                        if (dzsjVar7 == null) {
                                            dzsjVar7 = new fxy(fyuVar, 376);
                                            fyuVar.be = dzsjVar7;
                                        }
                                        q.f("LowPriorityRequestTaskServiceWorker", dzsjVar7);
                                        dzsj dzsjVar8 = fyuVar.bf;
                                        if (dzsjVar8 == null) {
                                            dzsjVar8 = new fxy(fyuVar, 377);
                                            fyuVar.bf = dzsjVar8;
                                        }
                                        q.f("InboxNotificationStorageExpirationWorker", dzsjVar8);
                                        dzsj dzsjVar9 = fyuVar.bg;
                                        if (dzsjVar9 == null) {
                                            dzsjVar9 = new fxy(fyuVar, 378);
                                            fyuVar.bg = dzsjVar9;
                                        }
                                        q.f("OfflineAppIndexingWorker", dzsjVar9);
                                        dzsj dzsjVar10 = fyuVar.bi;
                                        if (dzsjVar10 == null) {
                                            dzsjVar10 = new fxy(fyuVar, 379);
                                            fyuVar.bi = dzsjVar10;
                                        }
                                        q.f("OfflineAutoUpdateMaintenanceWorker", dzsjVar10);
                                        dzsj dzsjVar11 = fyuVar.bj;
                                        if (dzsjVar11 == null) {
                                            dzsjVar11 = new fxy(fyuVar, 381);
                                            fyuVar.bj = dzsjVar11;
                                        }
                                        q.f("OfflineUpdateWatchdogWorker", dzsjVar11);
                                        dzsj dzsjVar12 = fyuVar.bn;
                                        if (dzsjVar12 == null) {
                                            dzsjVar12 = new fxy(fyuVar, 382);
                                            fyuVar.bn = dzsjVar12;
                                        }
                                        q.f("OfflineAutoUpdateWorker", dzsjVar12);
                                        dzsj dzsjVar13 = fyuVar.bo;
                                        if (dzsjVar13 == null) {
                                            dzsjVar13 = new fxy(fyuVar, 385);
                                            fyuVar.bo = dzsjVar13;
                                        }
                                        q.f("OfflineManualDownloadWorker", dzsjVar13);
                                        dzsj dzsjVar14 = fyuVar.bp;
                                        if (dzsjVar14 == null) {
                                            dzsjVar14 = new fxy(fyuVar, 386);
                                            fyuVar.bp = dzsjVar14;
                                        }
                                        q.f("PassiveAssistDataStoreExpirationWorker", dzsjVar14);
                                        dzsj dzsjVar15 = fyuVar.bq;
                                        if (dzsjVar15 == null) {
                                            dzsjVar15 = new fxy(fyuVar, 388);
                                            fyuVar.bq = dzsjVar15;
                                        }
                                        q.f("PhotoMetadataDatabaseCleanerServiceWorker", dzsjVar15);
                                        dzsj dzsjVar16 = fyuVar.br;
                                        if (dzsjVar16 == null) {
                                            dzsjVar16 = new fxy(fyuVar, 389);
                                            fyuVar.br = dzsjVar16;
                                        }
                                        q.f("TrackedTilePrefetcherWorker", dzsjVar16);
                                        dzsj dzsjVar17 = fyuVar.bs;
                                        if (dzsjVar17 == null) {
                                            dzsjVar17 = new fxy(fyuVar, 390);
                                            fyuVar.bs = dzsjVar17;
                                        }
                                        q.f("AreaTrafficNotificationWorker", dzsjVar17);
                                        dzsj dzsjVar18 = fyuVar.bt;
                                        if (dzsjVar18 == null) {
                                            dzsjVar18 = new fxy(fyuVar, 391);
                                            fyuVar.bt = dzsjVar18;
                                        }
                                        q.f("CommuteNotificationProberWorker", dzsjVar18);
                                        dzsj dzsjVar19 = fyuVar.bu;
                                        if (dzsjVar19 == null) {
                                            dzsjVar19 = new fxy(fyuVar, 392);
                                            fyuVar.bu = dzsjVar19;
                                        }
                                        q.f("NotificationOptOutChangeLoggingWorker", dzsjVar19);
                                        dzsj dzsjVar20 = fyuVar.bv;
                                        if (dzsjVar20 == null) {
                                            dzsjVar20 = new fxy(fyuVar, 394);
                                            fyuVar.bv = dzsjVar20;
                                        }
                                        q.f("TrafficToPlaceSessionWorker", dzsjVar20);
                                        obj2 = new irp(q.b());
                                        dxjc.d(fyuVar.bw, obj2);
                                        fyuVar.bw = obj2;
                                    }
                                }
                                obj7 = obj2;
                            }
                            bbh bbhVar = new bbh();
                            bbhVar.b = 2010;
                            bbhVar.c = 110999999;
                            bbhVar.a = (irp) obj7;
                            obj = bbhVar.a();
                            dxjc.d(fyuVar.bx, obj);
                            fyuVar.bx = obj;
                        }
                    }
                    obj6 = obj;
                }
                return (T) ((bbj) obj6);
            case 343:
                fyu fyuVar2 = this.a;
                btvo rp = fyuVar2.a.rp();
                dxjg.e(rp);
                isa ts = fyuVar2.ts();
                dzsj dzsjVar21 = fyuVar2.aU;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fxy(fyuVar2, 344);
                    fyuVar2.aU = dzsjVar21;
                }
                dxio c = dxjc.c(dzsjVar21);
                Executor sV = fyuVar2.a.sV();
                dxjg.e(sV);
                return (T) new pgt(rp, ts, c, sV);
            case 344:
                fyu fyuVar3 = this.a;
                dehp tl = fyuVar3.a.tl();
                dxjg.e(tl);
                pfc hg = fyuVar3.hg();
                dxjc.c(fyuVar3.V());
                dzsj dzsjVar22 = fyuVar3.aT;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new fxy(fyuVar3, 345);
                    fyuVar3.aT = dzsjVar22;
                }
                return (T) new pgl(tl, hg, dxjc.c(dzsjVar22), dxjc.c(fyuVar3.p()));
            case 345:
                fyu fyuVar4 = this.a;
                Object obj8 = fyuVar4.aS;
                if (obj8 instanceof dxjf) {
                    synchronized (obj8) {
                        obj3 = fyuVar4.aS;
                        if (obj3 instanceof dxjf) {
                            pgf hh = fyuVar4.hh();
                            pgq pgqVar = new pgq();
                            pgg pggVar = new pgg();
                            dxio c2 = dxjc.c(fyuVar4.hl());
                            pfc hg2 = fyuVar4.hg();
                            Collection B = (!hg2.b() || !hg2.c()) ? dcmr.a : dcep.B((cqyx) c2.a());
                            dxjg.f(B);
                            dcep K = dcep.K(B);
                            dehp tl2 = fyuVar4.a.tl();
                            dxjg.e(tl2);
                            dehq tk = fyuVar4.a.tk();
                            dxjg.e(tk);
                            obj3 = new cqxt(new cqxs(hh.a(), pgqVar, pggVar, K, tl2, tl2, tk));
                            dxjc.d(fyuVar4.aS, obj3);
                            fyuVar4.aS = obj3;
                        }
                    }
                    obj8 = obj3;
                }
                return (T) ((cqxt) obj8);
            case 346:
                return (T) this.a.hk();
            case 347:
                fyu fyuVar5 = this.a;
                btvo rp2 = fyuVar5.a.rp();
                dxjg.e(rp2);
                return (T) new pgp(rp2, fyuVar5.M(), fyuVar5.ts());
            case 348:
                return (T) this.a.qq();
            case 349:
                fyu fyuVar6 = this.a;
                dzsj<dehp> ae = fyuVar6.ae();
                dzsj<akfa> p = fyuVar6.p();
                dzsj c3 = dxjh.c(fyuVar6.V());
                dzsj dzsjVar23 = fyuVar6.aQ;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new fxy(fyuVar6, 350);
                    fyuVar6.aQ = dzsjVar23;
                }
                return (T) new pif(ae, p, c3, dxjh.c(dzsjVar23), dxjh.c(fyuVar6.hi()));
            case 350:
                return (T) this.a.hh();
            case 351:
                fyu fyuVar7 = this.a;
                dzsj dzsjVar24 = fyuVar7.aR;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new fxy(fyuVar7, 352);
                    fyuVar7.aR = dzsjVar24;
                }
                return (T) new pij(dzsjVar24, fyuVar7.ae(), fyuVar7.p());
            case 352:
                fyu fyuVar8 = this.a;
                Executor sV2 = fyuVar8.a.sV();
                dxjg.e(sV2);
                Context b = fyuVar8.a.b();
                dxjg.e(b);
                return (T) bwri.b(sV2, b);
            case 353:
                fyu fyuVar9 = this.a;
                Executor sV3 = fyuVar9.a.sV();
                dxjg.e(sV3);
                return (T) new pgd(sV3, fyuVar9.hh(), dxjc.c(fyuVar9.p()), dxjc.c(fyuVar9.cf()));
            case 354:
                fyu fyuVar10 = this.a;
                bokp hm = fyuVar10.hm();
                isa ts2 = fyuVar10.ts();
                Executor sV4 = fyuVar10.a.sV();
                dxjg.e(sV4);
                return (T) new boml(hm, ts2, sV4);
            case 355:
                fyu fyuVar11 = this.a;
                Executor sV5 = fyuVar11.a.sV();
                dxjg.e(sV5);
                return (T) new btno(sV5, fyuVar11.ts());
            case 356:
                fyu fyuVar12 = this.a;
                ckcw rU = fyuVar12.a.rU();
                dxjg.e(rU);
                cqat rR = fyuVar12.a.rR();
                dxjg.e(rR);
                buss bussVar = fyuVar12.eI;
                if (bussVar == null) {
                    dxio c4 = dxjc.c(fyuVar12.h());
                    bvrb tn = fyuVar12.a.tn();
                    dxjg.e(tn);
                    bussVar = new buss(new busr(c4, tn));
                    fyuVar12.eI = bussVar;
                }
                buss bussVar2 = bussVar;
                pci hO = fyuVar12.hO();
                gdo qc = fyuVar12.qc();
                isa ts3 = fyuVar12.ts();
                dehp tl3 = fyuVar12.a.tl();
                dxjg.e(tl3);
                Executor sU = fyuVar12.a.sU();
                dxjg.e(sU);
                return (T) new pcr(rU, rR, bussVar2, hO, qc, ts3, tl3, sU);
            case 357:
                cqat rR2 = this.a.a.rR();
                dxjg.e(rR2);
                return (T) aogc.j(rR2);
            case 358:
                return (T) this.a.eE();
            case 359:
                return (T) this.a.eF();
            case 360:
                return (T) this.a.es();
            case 361:
                fyu fyuVar13 = this.a;
                Application a = fyuVar13.a.a();
                dxjg.e(a);
                amfi qp = fyuVar13.qp();
                btvo rp3 = fyuVar13.a.rp();
                dxjg.e(rp3);
                akfa rK = fyuVar13.a.rK();
                dxjg.e(rK);
                aufl cu = fyuVar13.cu();
                auhj bg = fyuVar13.bg();
                ?? hq = fyuVar13.hq();
                aigw ev = fyuVar13.ev();
                Executor sU2 = fyuVar13.a.sU();
                dxjg.e(sU2);
                return (T) new pdc(a, qp, rp3, rK, cu, bg, hq, ev, sU2);
            case 362:
                fyu fyuVar14 = this.a;
                dxio c5 = dxjc.c(fyuVar14.at());
                btvo rp4 = fyuVar14.a.rp();
                dxjg.e(rp4);
                cqat rR3 = fyuVar14.a.rR();
                dxjg.e(rR3);
                dzsj dzsjVar25 = fyuVar14.bb;
                if (dzsjVar25 == null) {
                    dzsjVar25 = new fxy(fyuVar14, 363);
                    fyuVar14.bb = dzsjVar25;
                }
                return (T) new pdg(c5, rp4, rR3, dxjc.c(dzsjVar25), dxjc.c(fyuVar14.p()));
            case 363:
                fyu fyuVar15 = this.a;
                Object obj9 = fyuVar15.ba;
                if (obj9 instanceof dxjf) {
                    synchronized (obj9) {
                        obj4 = fyuVar15.ba;
                        if (obj4 instanceof dxjf) {
                            Executor sV6 = fyuVar15.a.sV();
                            dxjg.e(sV6);
                            btvo rp5 = fyuVar15.a.rp();
                            dxjg.e(rp5);
                            cqat rR4 = fyuVar15.a.rR();
                            dxjg.e(rR4);
                            aiiv eK = fyuVar15.eK();
                            dzsj dzsjVar26 = fyuVar15.aZ;
                            if (dzsjVar26 == null) {
                                dzsjVar26 = new fxy(fyuVar15, 364);
                                fyuVar15.aZ = dzsjVar26;
                            }
                            obj4 = new ajly(sV6, rp5, rR4, eK, dxjc.c(dzsjVar26), fyuVar15.hs(), fyuVar15.eM(), fyuVar15.eL(), fyuVar15.eP(), fyuVar15.hv());
                            dxjc.d(fyuVar15.ba, obj4);
                            fyuVar15.ba = obj4;
                        }
                    }
                    obj9 = obj4;
                }
                return (T) ((ajly) obj9);
            case 364:
                return (T) this.a.hz();
            case 365:
                return (T) this.a.hr();
            case 366:
                return (T) this.a.eO();
            case 367:
                return (T) this.a.hs();
            case 368:
                return (T) this.a.eP();
            case 369:
                return (T) this.a.hv();
            case 370:
                return (T) this.a.bK();
            case 371:
                fyu fyuVar16 = this.a;
                bvjj rB = fyuVar16.a.rB();
                dxjg.e(rB);
                ckcw rU2 = fyuVar16.a.rU();
                dxjg.e(rU2);
                btvo rp6 = fyuVar16.a.rp();
                dxjg.e(rp6);
                return (T) new byxn(rB, rU2, rp6);
            case 372:
                fyu fyuVar17 = this.a;
                return (T) new pct(dxjc.c(fyuVar17.bp()), dxjc.c(fyuVar17.hN()));
            case 373:
                T t = (T) this.a.a.tp();
                dxjg.e(t);
                return t;
            case 374:
                return (T) this.a.bs();
            case 375:
                fyu fyuVar18 = this.a;
                akas hy = fyuVar18.hy();
                akfa rK2 = fyuVar18.a.rK();
                dxjg.e(rK2);
                Executor sV7 = fyuVar18.a.sV();
                dxjg.e(sV7);
                Executor sU3 = fyuVar18.a.sU();
                dxjg.e(sU3);
                return (T) new akaw(hy, rK2, sV7, sU3);
            case 376:
                fyu fyuVar19 = this.a;
                bugn aS = fyuVar19.a.aS();
                dxjg.e(aS);
                isa ts4 = fyuVar19.ts();
                Executor sV8 = fyuVar19.a.sV();
                dxjg.e(sV8);
                return (T) new bugm(aS, ts4, sV8);
            case 377:
                fyu fyuVar20 = this.a;
                dxio c6 = dxjc.c(fyuVar20.aT());
                isa ts5 = fyuVar20.ts();
                Executor sV9 = fyuVar20.a.sV();
                dxjg.e(sV9);
                return (T) new auqr(c6, ts5, sV9);
            case 378:
                fyu fyuVar21 = this.a;
                avki cN = fyuVar21.cN();
                avlx aa = fyuVar21.aa();
                isa ts6 = fyuVar21.ts();
                crzm<avzg> dk = fyuVar21.dk();
                Executor sV10 = fyuVar21.a.sV();
                dxjg.e(sV10);
                return (T) new avlv(cN, aa, ts6, dk, sV10);
            case 379:
                fyu fyuVar22 = this.a;
                dzsj dzsjVar27 = fyuVar22.bh;
                if (dzsjVar27 == null) {
                    dzsjVar27 = new fxy(fyuVar22, 380);
                    fyuVar22.bh = dzsjVar27;
                }
                dxio c7 = dxjc.c(dzsjVar27);
                dxio c8 = dxjc.c(fyuVar22.at());
                gdo qc2 = fyuVar22.qc();
                dxio c9 = dxjc.c(fyuVar22.J());
                dxio c10 = dxjc.c(fyuVar22.cx());
                dxio c11 = dxjc.c(fyuVar22.cf());
                awlm hP = fyuVar22.hP();
                dehp tl4 = fyuVar22.a.tl();
                dxjg.e(tl4);
                Executor sU4 = fyuVar22.a.sU();
                dxjg.e(sU4);
                return (T) new awje(c7, c8, qc2, c9, c10, c11, hP, tl4, sU4);
            case 380:
                return (T) this.a.fz();
            case 381:
                fyu fyuVar23 = this.a;
                ckcw rU3 = fyuVar23.a.rU();
                dxjg.e(rU3);
                gdo qc3 = fyuVar23.qc();
                awlu dg = fyuVar23.dg();
                isa ts7 = fyuVar23.ts();
                dehp tl5 = fyuVar23.a.tl();
                dxjg.e(tl5);
                Executor sU5 = fyuVar23.a.sU();
                dxjg.e(sU5);
                return (T) new awmc(rU3, qc3, dg, ts7, tl5, sU5);
            case 382:
                fyu fyuVar24 = this.a;
                dxio c12 = dxjc.c(fyuVar24.hR());
                dxio c13 = dxjc.c(fyuVar24.hS());
                dxio c14 = dxjc.c(fyuVar24.eY());
                dxio c15 = dxjc.c(fyuVar24.at());
                dxio c16 = dxjc.c(fyuVar24.cf());
                gdo qc4 = fyuVar24.qc();
                dehp tl6 = fyuVar24.a.tl();
                dxjg.e(tl6);
                Executor sU6 = fyuVar24.a.sU();
                dxjg.e(sU6);
                return (T) new awkh(c12, c13, c14, c15, c16, qc4, tl6, sU6);
            case 383:
                return (T) this.a.hQ();
            case 384:
                fyu fyuVar25 = this.a;
                cqat rR5 = fyuVar25.a.rR();
                dxjg.e(rR5);
                dehq tg = fyuVar25.a.tg();
                dxjg.e(tg);
                dehq T = fyuVar25.T();
                btrm rz = fyuVar25.a.rz();
                dxjg.e(rz);
                bvjj rB2 = fyuVar25.a.rB();
                dxjg.e(rB2);
                ckcw rU4 = fyuVar25.a.rU();
                dxjg.e(rU4);
                btvo rp7 = fyuVar25.a.rp();
                dxjg.e(rp7);
                btpc sz = fyuVar25.a.sz();
                dxjg.e(sz);
                avto af = fyuVar25.af();
                awic awicVar = fyuVar25.bm;
                if (awicVar == null) {
                    awhz awhzVar = fyuVar25.bk;
                    if (awhzVar == null) {
                        btpc sz2 = fyuVar25.a.sz();
                        dxjg.e(sz2);
                        Executor sV11 = fyuVar25.a.sV();
                        dxjg.e(sV11);
                        awhzVar = new awhz(sz2, sV11, fyuVar25.cN());
                        fyuVar25.bk = awhzVar;
                    }
                    awib awibVar = fyuVar25.bl;
                    if (awibVar == null) {
                        btpc sz3 = fyuVar25.a.sz();
                        dxjg.e(sz3);
                        awibVar = new awib(sz3);
                        fyuVar25.bl = awibVar;
                    }
                    awicVar = new awic(awhzVar, awibVar);
                    fyuVar25.bm = awicVar;
                }
                avki cN2 = fyuVar25.cN();
                awar qM = fyuVar25.qM();
                crzm<avkc> qH = fyuVar25.qH();
                avfp S = fyuVar25.S();
                ahjq wf = fyuVar25.wf();
                awlm hP2 = fyuVar25.hP();
                fyuVar25.cY();
                return (T) new awjv(rR5, tg, T, rz, rB2, rU4, rp7, sz, af, awicVar, cN2, qM, qH, S, wf, hP2, fyuVar25.dk());
            case 385:
                fyu fyuVar26 = this.a;
                awkw O = fyuVar26.O();
                crzm<avkc> qH2 = fyuVar26.qH();
                bvjj rB3 = fyuVar26.a.rB();
                dxjg.e(rB3);
                isa ts8 = fyuVar26.ts();
                dehq T2 = fyuVar26.T();
                Executor sV12 = fyuVar26.a.sV();
                dxjg.e(sV12);
                return (T) new awll(O, qH2, rB3, ts8, T2, sV12);
            case 386:
                fyu fyuVar27 = this.a;
                dxio c17 = dxjc.c(fyuVar27.hT());
                Executor sV13 = fyuVar27.a.sV();
                dxjg.e(sV13);
                return (T) new axbh(c17, sV13);
            case 387:
                return (T) this.a.dO();
            case 388:
                fyu fyuVar28 = this.a;
                bttf aL = fyuVar28.a.aL();
                dxjg.e(aL);
                bzsz bd = fyuVar28.bd();
                ckcw rU5 = fyuVar28.a.rU();
                dxjg.e(rU5);
                bzsa bc = fyuVar28.bc();
                isa ts9 = fyuVar28.ts();
                gdo qc5 = fyuVar28.qc();
                dehp tl7 = fyuVar28.a.tl();
                dxjg.e(tl7);
                Executor sU7 = fyuVar28.a.sU();
                dxjg.e(sU7);
                return (T) new bzsf(aL, bd, rU5, bc, ts9, qc5, tl7, sU7);
            case 389:
                fyu fyuVar29 = this.a;
                amwp hV = fyuVar29.hV();
                ckcw rU6 = fyuVar29.a.rU();
                dxjg.e(rU6);
                isa ts10 = fyuVar29.ts();
                dehp tl8 = fyuVar29.a.tl();
                dxjg.e(tl8);
                return (T) new amww(hV, rU6, ts10, tl8);
            case 390:
                return (T) this.a.hW();
            case 391:
                fyu fyuVar30 = this.a;
                dxio c18 = dxjc.c(fyuVar30.bp());
                ckcw rU7 = fyuVar30.a.rU();
                dxjg.e(rU7);
                ahth cd = fyuVar30.cd();
                cqat rR6 = fyuVar30.a.rR();
                dxjg.e(rR6);
                bvjj rB4 = fyuVar30.a.rB();
                dxjg.e(rB4);
                isa ts11 = fyuVar30.ts();
                dehp tl9 = fyuVar30.a.tl();
                dxjg.e(tl9);
                return (T) new byrt(c18, rU7, cd, rR6, rB4, ts11, tl9);
            case 392:
                fyu fyuVar31 = this.a;
                dxio c19 = dxjc.c(fyuVar31.hX());
                dxio c20 = dxjc.c(fyuVar31.al());
                dxio c21 = dxjc.c(fyuVar31.aw());
                dxio c22 = dxjc.c(fyuVar31.at());
                dxio c23 = dxjc.c(fyuVar31.cf());
                dehp tl10 = fyuVar31.a.tl();
                dxjg.e(tl10);
                return (T) new huq(c19, c20, c21, c22, c23, tl10);
            case 393:
                return (T) this.a.rg();
            case 394:
                fyu fyuVar32 = this.a;
                aufl cu2 = fyuVar32.cu();
                bypk bM = fyuVar32.bM();
                ckcw rU8 = fyuVar32.a.rU();
                dxjg.e(rU8);
                ahth cd2 = fyuVar32.cd();
                isa ts12 = fyuVar32.ts();
                cqat rR7 = fyuVar32.a.rR();
                dxjg.e(rR7);
                dehp tl11 = fyuVar32.a.tl();
                dxjg.e(tl11);
                return (T) new byse(cu2, bM, rU8, cd2, ts12, rR7, tl11);
            case 395:
                fyu fyuVar33 = this.a;
                Object obj10 = fyuVar33.bC;
                if (obj10 instanceof dxjf) {
                    synchronized (obj10) {
                        obj5 = fyuVar33.bC;
                        if (obj5 instanceof dxjf) {
                            dzsj dzsjVar28 = fyuVar33.bA;
                            if (dzsjVar28 == null) {
                                dzsjVar28 = new fxy(fyuVar33, 396);
                                fyuVar33.bA = dzsjVar28;
                            }
                            dzsj dzsjVar29 = dzsjVar28;
                            dzsj<btvo> V = fyuVar33.V();
                            dzsj<akfa> p2 = fyuVar33.p();
                            dzsj dzsjVar30 = fyuVar33.bB;
                            if (dzsjVar30 == null) {
                                dzsjVar30 = new fxy(fyuVar33, 401);
                                fyuVar33.bB = dzsjVar30;
                            }
                            Executor sV14 = fyuVar33.a.sV();
                            dxjg.e(sV14);
                            obj5 = new bnks(dzsjVar29, V, p2, dzsjVar30, sV14);
                            dxjc.d(fyuVar33.bC, obj5);
                            fyuVar33.bC = obj5;
                        }
                    }
                    obj10 = obj5;
                }
                return (T) ((bnks) obj10);
            case 396:
                fyu fyuVar34 = this.a;
                dxjc.c(fyuVar34.ib());
                fyuVar34.vz();
                ckcw rU9 = fyuVar34.a.rU();
                dxjg.e(rU9);
                dxjg.e(fyuVar34.a.sV());
                dxjg.e(fyuVar34.a.aV());
                dzsj dzsjVar31 = fyuVar34.bz;
                if (dzsjVar31 == null) {
                    dzsjVar31 = new fxy(fyuVar34, 400);
                    fyuVar34.bz = dzsjVar31;
                }
                dxjc.c(dzsjVar31);
                return (T) new bnku(rU9);
            case 397:
                return (T) this.a.ia();
            case 398:
                return (T) this.a.a.aT();
            case 399:
                T t2 = (T) this.a.a.v();
                dxjg.e(t2);
                return t2;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        T t;
        T t2;
        T t3;
        T t4;
        T t5;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                switch (i) {
                    case 500:
                        return (T) this.a.sA();
                    case 501:
                        return (T) this.a.kg();
                    case 502:
                        return (T) this.a.ki();
                    case 503:
                        return (T) new dnc();
                    case 504:
                        return (T) this.a.kj();
                    case 505:
                        return (T) this.a.km();
                    case 506:
                        return (T) this.a.kz();
                    case 507:
                        return (T) this.a.kn();
                    case 508:
                        return (T) this.a.kr();
                    case 509:
                        return (T) this.a.kq();
                    case 510:
                        return (T) this.a.ko();
                    case 511:
                        return (T) this.a.kp();
                    case 512:
                        return (T) new dvf();
                    case 513:
                        return (T) new dvb();
                    case 514:
                        return (T) new dug();
                    case 515:
                        return (T) this.a.ky();
                    case 516:
                        return (T) this.a.kt();
                    case 517:
                        return (T) this.a.ks();
                    case 518:
                        return (T) this.a.ku();
                    case 519:
                        return (T) this.a.kx();
                    case 520:
                        return (T) this.a.kv();
                    case 521:
                        return (T) this.a.kw();
                    case 522:
                        return (T) new dwj();
                    case 523:
                        return (T) this.a.kA();
                    case 524:
                        return (T) this.a.kM();
                    case 525:
                        return (T) this.a.kH();
                    case 526:
                        return (T) this.a.kJ();
                    case 527:
                        return (T) this.a.kI();
                    case 528:
                        T t6 = (T) cwkr.b;
                        dxjg.f(t6);
                        return t6;
                    case 529:
                        T t7 = (T) csjm.b;
                        dxjg.f(t7);
                        return t7;
                    case 530:
                        T t8 = (T) csjn.b;
                        dxjg.f(t8);
                        return t8;
                    case 531:
                        T t9 = (T) csjo.b;
                        dxjg.f(t9);
                        return t9;
                    case 532:
                        T t10 = (T) csjp.b;
                        dxjg.f(t10);
                        return t10;
                    case 533:
                        T t11 = (T) cwks.b;
                        dxjg.f(t11);
                        return t11;
                    case 534:
                        return (T) this.a.kK();
                    case 535:
                        return (T) this.a.vn();
                    case 536:
                        return (T) this.a.dQ();
                    case 537:
                        return (T) this.a.kT();
                    case 538:
                        return (T) this.a.kU();
                    case 539:
                        return (T) this.a.kX();
                    case 540:
                        return (T) this.a.kW();
                    case 541:
                        return (T) axhr.b();
                    case 542:
                        return (T) this.a.bo();
                    case 543:
                        return (T) this.a.kZ();
                    case 544:
                        return (T) this.a.la();
                    case 545:
                        return (T) this.a.ep();
                    case 546:
                        T t12 = (T) this.a.a.s();
                        dxjg.e(t12);
                        return t12;
                    case 547:
                        return (T) this.a.le();
                    case 548:
                        return (T) this.a.lh();
                    case 549:
                        return (T) this.a.li();
                    case 550:
                        return (T) this.a.qY();
                    case 551:
                        return (T) this.a.lq();
                    case 552:
                        return (T) this.a.lt();
                    case 553:
                        return (T) this.a.df();
                    case 554:
                        T t13 = (T) this.a.a.sJ();
                        dxjg.e(t13);
                        return t13;
                    case 555:
                        return (T) this.a.dU();
                    case 556:
                        return (T) this.a.vl();
                    case 557:
                        fyu fyuVar = this.a;
                        Object obj2 = fyuVar.cH;
                        if (obj2 instanceof dxjf) {
                            synchronized (obj2) {
                                obj = fyuVar.cH;
                                if (obj instanceof dxjf) {
                                    cjqy tr = fyuVar.a.tr();
                                    dxjg.e(tr);
                                    obj = new ashs(tr);
                                    dxjc.d(fyuVar.cH, obj);
                                    fyuVar.cH = obj;
                                }
                            }
                            obj2 = obj;
                        }
                        return (T) ((ashs) obj2);
                    case 558:
                        return (T) this.a.vo();
                    case 559:
                        return (T) this.a.ee();
                    case 560:
                        return (T) this.a.lA();
                    case 561:
                        return (T) this.a.lF();
                    case 562:
                        return (T) this.a.qw();
                    case 563:
                        return (T) this.a.lI();
                    case 564:
                        T t14 = (T) this.a.a.r();
                        dxjg.e(t14);
                        return t14;
                    case 565:
                        return (T) this.a.hp();
                    case 566:
                        return (T) this.a.lM();
                    case 567:
                        return (T) this.a.lO();
                    case 568:
                        return (T) this.a.jc();
                    case 569:
                        return (T) this.a.kL();
                    case 570:
                        return (T) this.a.fF();
                    case 571:
                        t = (T) this.a.a.rq();
                        dxjg.e(t);
                        return t;
                    case 572:
                        t = (T) this.a.a.rt();
                        dxjg.e(t);
                        return t;
                    case 573:
                        return (T) this.a.lp();
                    case 574:
                        T t15 = (T) this.a.a.rY();
                        dxjg.e(t15);
                        return t15;
                    case 575:
                        return (T) this.a.lU();
                    case 576:
                        t2 = (T) this.a.a.rx();
                        dxjg.e(t2);
                        return t2;
                    case 577:
                        t2 = (T) this.a.a.aR();
                        dxjg.e(t2);
                        return t2;
                    case 578:
                        return (T) this.a.lV();
                    case 579:
                        return (T) this.a.uW();
                    case 580:
                        T t16 = (T) this.a.a.l();
                        dxjg.e(t16);
                        return t16;
                    case 581:
                        return (T) this.a.lW();
                    case 582:
                        return (T) this.a.lX();
                    case 583:
                        t3 = (T) this.a.a.g();
                        dxjg.e(t3);
                        return t3;
                    case 584:
                        t3 = (T) this.a.a.f();
                        dxjg.e(t3);
                        return t3;
                    case 585:
                        t3 = (T) this.a.a.h();
                        dxjg.e(t3);
                        return t3;
                    case 586:
                        return (T) this.a.jL();
                    case 587:
                        return (T) this.a.ma();
                    case 588:
                        return (T) this.a.mc();
                    case 589:
                        return (T) this.a.md();
                    case 590:
                        return (T) this.a.qm();
                    case 591:
                        t4 = (T) this.a.a.rS();
                        dxjg.e(t4);
                        return t4;
                    case 592:
                        t4 = (T) this.a.a.ru();
                        dxjg.e(t4);
                        return t4;
                    case 593:
                        return (T) this.a.ai();
                    case 594:
                        return (T) this.a.io();
                    case 595:
                        return (T) this.a.mk();
                    case 596:
                        return (T) this.a.ir();
                    case 597:
                        return (T) auus.b();
                    case 598:
                        return (T) this.a.c();
                    case 599:
                        return (T) this.a.mn();
                    default:
                        throw new AssertionError(i);
                }
            case 6:
                switch (i) {
                    case 600:
                        return (T) this.a.mp();
                    case 601:
                        return (T) this.a.dJ();
                    case 602:
                        return (T) this.a.lg();
                    case 603:
                        return (T) this.a.lf();
                    case 604:
                        return (T) this.a.mw();
                    case 605:
                        return (T) this.a.mt();
                    case 606:
                        return (T) this.a.mu();
                    case 607:
                        return (T) this.a.rF();
                    case 608:
                        return (T) this.a.mB();
                    case 609:
                        return (T) this.a.mE();
                    case 610:
                        return (T) this.a.mD();
                    case 611:
                        return (T) this.a.fl();
                    case 612:
                        return (T) this.a.mH();
                    case 613:
                        return (T) this.a.mA();
                    case 614:
                        return (T) this.a.jh();
                    case 615:
                        return (T) this.a.rj();
                    case 616:
                        return (T) this.a.ah();
                    case 617:
                        return (T) this.a.ll();
                    case 618:
                        return (T) this.a.uT();
                    case 619:
                        return (T) this.a.mv();
                    case 620:
                        return (T) this.a.dK();
                    case 621:
                        return (T) this.a.hm();
                    case 622:
                        return (T) this.a.a.bb();
                    case 623:
                        return (T) this.a.hA();
                    case 624:
                        return (T) this.a.vf();
                    case 625:
                        return (T) this.a.vj();
                    case 626:
                        return (T) this.a.nc();
                    case 627:
                        return (T) this.a.iE();
                    case 628:
                        return (T) this.a.nf();
                    case 629:
                        return (T) this.a.kk();
                    case 630:
                        return (T) new dcs();
                    case 631:
                        return (T) this.a.fa();
                    case 632:
                        return (T) this.a.nj();
                    case 633:
                        return (T) this.a.nk();
                    case 634:
                        return (T) czth.b();
                    case 635:
                        return (T) this.a.ni();
                    case 636:
                        return (T) this.a.nn();
                    case 637:
                        return (T) this.a.no();
                    case 638:
                        return (T) this.a.np();
                    case 639:
                        return (T) this.a.nr();
                    case 640:
                        return (T) this.a.bI();
                    case 641:
                        return (T) this.a.nw();
                    case 642:
                        T t17 = (T) this.a.a.sb();
                        dxjg.e(t17);
                        return t17;
                    case 643:
                        T t18 = (T) this.a.a.vu();
                        dxjg.e(t18);
                        return t18;
                    case 644:
                        return (T) this.a.nC();
                    case 645:
                        return (T) this.a.nE();
                    case 646:
                        return (T) this.a.nv();
                    case 647:
                        return (T) this.a.lD();
                    case 648:
                        return (T) this.a.mg();
                    case 649:
                        return (T) this.a.nJ();
                    case 650:
                        return (T) this.a.nL();
                    case 651:
                        return (T) zau.b();
                    case 652:
                        return (T) this.a.nM();
                    case 653:
                        return (T) this.a.nO();
                    case 654:
                        return (T) new zag();
                    case 655:
                        return (T) this.a.nR();
                    case 656:
                        return (T) this.a.nT();
                    case 657:
                        return (T) this.a.nU();
                    case 658:
                        return (T) this.a.nV();
                    case 659:
                        return (T) this.a.nS();
                    case 660:
                        return (T) this.a.eQ();
                    case 661:
                        return (T) this.a.nY();
                    case 662:
                        return (T) this.a.kO();
                    case 663:
                        return (T) this.a.lC();
                    case 664:
                        return (T) this.a.od();
                    case 665:
                        return (T) this.a.oc();
                    case 666:
                        return (T) this.a.ei();
                    case 667:
                        return (T) eja.b();
                    case 668:
                        return (T) this.a.of();
                    case 669:
                        return (T) new byzi();
                    case 670:
                        return (T) this.a.oi();
                    case 671:
                        return (T) this.a.ok();
                    case 672:
                        return (T) this.a.om();
                    case 673:
                        return (T) this.a.dR();
                    case 674:
                        return (T) this.a.eN();
                    case 675:
                        return (T) this.a.eK();
                    case 676:
                        return (T) this.a.oo();
                    case 677:
                        T t19 = (T) this.a.a.sn();
                        dxjg.e(t19);
                        return t19;
                    case 678:
                        return (T) this.a.jt();
                    case 679:
                        return (T) this.a.ov();
                    case 680:
                        return (T) this.a.hw();
                    case 681:
                        return (T) Boolean.valueOf(this.a.fu());
                    case 682:
                        return (T) this.a.ox();
                    case 683:
                        return (T) this.a.uX();
                    case 684:
                        return (T) this.a.uY();
                    case 685:
                        return (T) this.a.oA();
                    case 686:
                        return (T) this.a.ho();
                    case 687:
                        return (T) this.a.oz();
                    case 688:
                        return (T) this.a.oE();
                    case 689:
                        return (T) this.a.dX();
                    case 690:
                        return (T) this.a.jk();
                    case 691:
                        return (T) dbsg.i(this.a.cG());
                    case 692:
                        T t20 = (T) this.a.a.aJ();
                        dxjg.e(t20);
                        return t20;
                    case 693:
                        return (T) this.a.oI();
                    case 694:
                        return (T) this.a.mZ();
                    case 695:
                        T t21 = (T) this.a.a.rv();
                        dxjg.e(t21);
                        return t21;
                    case 696:
                        return (T) this.a.eS();
                    case 697:
                        return (T) this.a.de();
                    case 698:
                        return (T) this.a.fm();
                    case 699:
                        return (T) this.a.oM();
                    default:
                        throw new AssertionError(i);
                }
            default:
                switch (i) {
                    case 700:
                        return (T) this.a.oO();
                    case 701:
                        return (T) this.a.fn();
                    case 702:
                        t5 = (T) this.a.a.rs();
                        break;
                    case 703:
                        return (T) this.a.ej();
                    case 704:
                        return (T) this.a.aj();
                    case 705:
                        return (T) this.a.oV();
                    case 706:
                        return (T) this.a.oU();
                    case 707:
                        T t22 = (T) this.a.a.A();
                        dxjg.e(t22);
                        return t22;
                    case 708:
                        return (T) this.a.qZ();
                    case 709:
                        return (T) this.a.pc();
                    case 710:
                        return (T) this.a.oX();
                    case 711:
                        return (T) new bdme();
                    case 712:
                        return (T) this.a.oZ();
                    case 713:
                        return (T) this.a.pe();
                    case 714:
                        return (T) this.a.mQ();
                    case 715:
                        return (T) this.a.pb();
                    case 716:
                        return (T) this.a.mJ();
                    case 717:
                        return (T) this.a.pi();
                    case 718:
                        return (T) this.a.uV();
                    case 719:
                        return (T) this.a.ln();
                    case 720:
                        return (T) this.a.pk();
                    case 721:
                        return (T) this.a.pm();
                    case 722:
                        return (T) this.a.jf();
                    case 723:
                        return (T) this.a.vm();
                    case 724:
                        return (T) this.a.uU();
                    case 725:
                        return (T) this.a.hM();
                    case 726:
                        return (T) this.a.ls();
                    case 727:
                        return (T) this.a.pr();
                    case 728:
                        return (T) this.a.lu();
                    case 729:
                        return (T) this.a.mi();
                    case 730:
                        return (T) this.a.ft();
                    case 731:
                        return (T) this.a.pw();
                    case 732:
                        return (T) this.a.py();
                    case 733:
                        return (T) this.a.fh();
                    case 734:
                        return (T) this.a.qd();
                    case 735:
                        return (T) this.a.pA();
                    case 736:
                        akpw a = this.a.b.a();
                        dxjg.e(a);
                        T t23 = (T) a.f();
                        dxjg.f(t23);
                        return t23;
                    case 737:
                        return (T) this.a.rl();
                    case 738:
                        t5 = (T) this.a.a.z();
                        break;
                    case 739:
                        return (T) this.a.pF();
                    case 740:
                        return (T) this.a.pG();
                    case 741:
                        return (T) this.a.j();
                    case 742:
                        return (T) this.a.dp();
                    case 743:
                        return (T) this.a.qv();
                    case 744:
                        T t24 = (T) this.a.a.e();
                        dxjg.e(t24);
                        return t24;
                    case 745:
                        return (T) this.a.eB();
                    case 746:
                        return (T) this.a.eC();
                    case 747:
                        return (T) this.a.qL();
                    case 748:
                        return (T) this.a.qK();
                    case 749:
                        return (T) this.a.vh();
                    case 750:
                        return (T) this.a.mW();
                    case 751:
                        return (T) this.a.mU();
                    case 752:
                        T t25 = (T) this.a.a.tj();
                        dxjg.e(t25);
                        return t25;
                    case 753:
                        return (T) this.a.pN();
                    case 754:
                        return (T) this.a.pO();
                    case 755:
                        return (T) this.a.pB();
                    case 756:
                        return (T) this.a.bl();
                    case 757:
                        return (T) this.a.bn();
                    case 758:
                        return (T) this.a.pR();
                    case 759:
                        return (T) this.a.pQ();
                    case 760:
                        return (T) this.a.uZ();
                    case 761:
                        return (T) this.a.va();
                    case 762:
                        return (T) this.a.pP();
                    case 763:
                        return (T) new pej(dxjc.c(this.a.oW()));
                    case 764:
                        return (T) this.a.pS();
                    case 765:
                        return (T) this.a.pT();
                    default:
                        throw new AssertionError(i);
                }
                dxjg.e(t5);
                return t5;
        }
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [buye, T] */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, bute] */
    /* JADX WARN: Type inference failed for: r2v26, types: [bzmb] */
    /* JADX WARN: Type inference failed for: r2v44, types: [awir, T] */
    /* JADX WARN: Type inference failed for: r4v25, types: [awat, T] */
    private final T d() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        int i = this.b;
        switch (i) {
            case 200:
                return (T) this.a.dr();
            case 201:
                return (T) this.a.du();
            case 202:
                return (T) this.a.dy();
            case 203:
                bvjj rB = this.a.a.rB();
                dxjg.e(rB);
                return (T) new wtu(rB);
            case 204:
                bvjj rB2 = this.a.a.rB();
                dxjg.e(rB2);
                return (T) new qfw(rB2);
            case 205:
                return (T) this.a.dD();
            case 206:
                return (T) this.a.dC();
            case 207:
                return (T) this.a.qC();
            case 208:
                T t = (T) this.a.a.sf();
                dxjg.e(t);
                return t;
            case 209:
                return (T) this.a.dS();
            case 210:
                fyu fyuVar = this.a;
                Object obj14 = fyuVar.at;
                if (obj14 instanceof dxjf) {
                    synchronized (obj14) {
                        obj = fyuVar.at;
                        if (obj instanceof dxjf) {
                            crcr d = fyuVar.d();
                            btvo rp = fyuVar.a.rp();
                            dxjg.e(rp);
                            bvjj rB3 = fyuVar.a.rB();
                            dxjg.e(rB3);
                            cqat rR = fyuVar.a.rR();
                            dxjg.e(rR);
                            btyh sJ = fyuVar.a.sJ();
                            dxjg.e(sJ);
                            Application a = fyuVar.a.a();
                            dxjg.e(a);
                            cqat rR2 = fyuVar.a.rR();
                            dxjg.e(rR2);
                            btrm rz = fyuVar.a.rz();
                            dxjg.e(rz);
                            btyh sJ2 = fyuVar.a.sJ();
                            dxjg.e(sJ2);
                            Object obj15 = fyuVar.as;
                            if (obj15 instanceof dxjf) {
                                synchronized (obj15) {
                                    obj2 = fyuVar.as;
                                    if (obj2 instanceof dxjf) {
                                        Application a2 = fyuVar.a.a();
                                        dxjg.e(a2);
                                        bvrb tn = fyuVar.a.tn();
                                        dxjg.e(tn);
                                        Executor tb = fyuVar.a.tb();
                                        dxjg.e(tb);
                                        btvo rp2 = fyuVar.a.rp();
                                        dxjg.e(rp2);
                                        obj2 = new crdn(a2, tn, tb, rp2, new crdl());
                                        dxjc.d(fyuVar.as, obj2);
                                        fyuVar.as = obj2;
                                    }
                                }
                                obj15 = obj2;
                            }
                            crep crepVar = (crep) obj15;
                            crox dZ = fyuVar.dZ();
                            bvrb tn2 = fyuVar.a.tn();
                            dxjg.e(tn2);
                            buyi buyiVar = fyuVar.eF;
                            if (buyiVar == null) {
                                dxio c = dxjc.c(fyuVar.h());
                                bvrb tn3 = fyuVar.a.tn();
                                dxjg.e(tn3);
                                buyiVar = new buyi(new buyh(c, tn3));
                                fyuVar.eF = buyiVar;
                            }
                            dehq tg = fyuVar.a.tg();
                            dxjg.e(tg);
                            obj = new crdw(d, rp, rB3, rR, sJ, new cksl(a, rR2, rz, sJ2, crepVar, dZ, tn2, buyiVar, tg, fyuVar.vi(), new cksv(), false), fyuVar.vi());
                            dxjc.d(fyuVar.at, obj);
                            fyuVar.at = obj;
                        }
                    }
                    obj14 = obj;
                }
                return (T) ((crdi) obj14);
            case 211:
                fyu fyuVar2 = this.a;
                crcr d2 = fyuVar2.d();
                Application a3 = fyuVar2.a.a();
                dxjg.e(a3);
                bvjj rB4 = fyuVar2.a.rB();
                dxjg.e(rB4);
                buxe uS = fyuVar2.uS();
                btvo rp3 = fyuVar2.a.rp();
                dxjg.e(rp3);
                crcd crcdVar = new crcd(a3, rB4, uS, rp3, fyuVar2.vi());
                btvo rp4 = fyuVar2.a.rp();
                dxjg.e(rp4);
                bvjj rB5 = fyuVar2.a.rB();
                dxjg.e(rB5);
                return (T) new crbu(d2, crcdVar, rp4, rB5);
            case 212:
                return (T) this.a.qe();
            case 213:
                T t2 = (T) this.a.a.o();
                dxjg.e(t2);
                return t2;
            case 214:
                return (T) this.a.ef();
            case 215:
                fyu fyuVar3 = this.a;
                return (T) new avmq(fyuVar3.cW(), fyuVar3.dn());
            case 216:
                return (T) this.a.rV();
            case 217:
                fyu fyuVar4 = this.a;
                Application a4 = fyuVar4.a.a();
                dxjg.e(a4);
                return (T) new axyh(a4, (axwp) fyuVar4.r());
            case 218:
                return (T) this.a.rG();
            case 219:
                T t3 = (T) this.a.a.aO();
                dxjg.e(t3);
                return t3;
            case 220:
                return (T) this.a.eq();
            case 221:
                return (T) this.a.et();
            case 222:
                T t4 = (T) this.a.a.rD();
                dxjg.e(t4);
                return t4;
            case 223:
                fyu fyuVar5 = this.a;
                Context b = fyuVar5.a.b();
                dxjg.e(b);
                cqat rR3 = fyuVar5.a.rR();
                dxjg.e(rR3);
                return (T) new afei(b, rR3);
            case 224:
                return (T) this.a.eu();
            case 225:
                return (T) this.a.ew();
            case 226:
                return (T) this.a.eD();
            case 227:
                return (T) this.a.eJ();
            case 228:
                return (T) this.a.to();
            case 229:
                return (T) this.a.eT();
            case 230:
                fyu fyuVar6 = this.a;
                awax eT = fyuVar6.eT();
                awfh qP = fyuVar6.qP();
                Executor sV = fyuVar6.a.sV();
                dxjg.e(sV);
                final ?? r4 = (T) new awat(eT, qP, sV);
                r4.b.e().a(new crzp(r4) { // from class: awas
                    private final awat a;

                    {
                        this.a = r4;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        awat awatVar = this.a;
                        if (awatVar.b.d()) {
                            awatVar.c();
                            awatVar.k();
                            awatVar.m();
                            awatVar.a.f.a().m(dpyv.OFFLINE_BACKEND_CLEARED_ERROR.dm);
                            awax awaxVar = awatVar.a;
                            awaxVar.f.a().m(dpyv.OFFLINE_REGION_SOURCES_GONE.dm);
                            awaxVar.f.a().m(dpyv.OFFLINE_RECOMMENDATION_FROM_GEOMETRY_CHANGE.dm);
                            awaxVar.f.a().m(dpyv.OFFLINE_REGION_PARTLY_REPLACED_FROM_GEOMETRY_CHANGE.dm);
                            awaxVar.f.a().m(dpyv.OFFLINE_REGION_REPLACED_FROM_GEOMETRY_CHANGE.dm);
                            awaxVar.f.a().m(dpyv.OFFLINE_RECOMMENDED_REGIONS_CHANGED.dm);
                        }
                    }
                }, r4.c);
                return r4;
            case 231:
                T t5 = (T) this.a.a.y();
                dxjg.e(t5);
                return t5;
            case 232:
                fyu fyuVar7 = this.a;
                T t6 = (T) fyuVar7.eG;
                if (t6 != null) {
                    return t6;
                }
                dxio c2 = dxjc.c(fyuVar7.h());
                bvrb tn4 = fyuVar7.a.tn();
                dxjg.e(tn4);
                ?? r2 = (T) new buye(new buyd(c2, tn4));
                fyuVar7.eG = r2;
                return r2;
            case 233:
                return (T) this.a.m22do();
            case 234:
                return (T) this.a.qO();
            case 235:
                return (T) this.a.W();
            case 236:
                fyu fyuVar8 = this.a;
                T t7 = (T) fyuVar8.eH;
                if (t7 != null) {
                    return t7;
                }
                dxio c3 = dxjc.c(fyuVar8.h());
                bvrb tn5 = fyuVar8.a.tn();
                dxjg.e(tn5);
                ?? r22 = (T) new bute(new butd(c3, tn5));
                fyuVar8.eH = r22;
                return r22;
            case 237:
                return (T) this.a.fe();
            case 238:
                return (T) this.a.fc();
            case 239:
                return (T) this.a.fg();
            case 240:
                fyu fyuVar9 = this.a;
                dxio c4 = dxjc.c(fyuVar9.h());
                bvrb tn6 = fyuVar9.a.tn();
                dxjg.e(tn6);
                return (T) new bulg(c4, tn6);
            case 241:
                fyu fyuVar10 = this.a;
                btvo rp5 = fyuVar10.a.rp();
                dxjg.e(rp5);
                return (T) new aczn(rp5, dxjc.c(fyuVar10.fj()));
            case 242:
                fyu fyuVar11 = this.a;
                T t8 = (T) fyuVar11.ax;
                T t9 = t8;
                if (t8 == null) {
                    akfa rK = fyuVar11.a.rK();
                    dxjg.e(rK);
                    btvo rp6 = fyuVar11.a.rp();
                    dxjg.e(rp6);
                    ahjq wf = fyuVar11.wf();
                    axwq qn = fyuVar11.qn();
                    Object obj16 = fyuVar11.aw;
                    if (obj16 instanceof dxjf) {
                        synchronized (obj16) {
                            obj3 = fyuVar11.aw;
                            if (obj3 instanceof dxjf) {
                                dzsj dzsjVar = fyuVar11.av;
                                if (dzsjVar == null) {
                                    dzsjVar = new fxy(fyuVar11, 243);
                                    fyuVar11.av = dzsjVar;
                                }
                                dxio c5 = dxjc.c(dzsjVar);
                                dehp tl = fyuVar11.a.tl();
                                dxjg.e(tl);
                                obj3 = new bzlz(c5, tl);
                                dxjc.d(fyuVar11.aw, obj3);
                                fyuVar11.aw = obj3;
                            }
                        }
                        obj16 = obj3;
                    }
                    cqat rR4 = fyuVar11.a.rR();
                    dxjg.e(rR4);
                    ?? r23 = (T) new bzmb(rK, rp6, wf, qn, (bzlz) obj16, rR4);
                    fyuVar11.ax = r23;
                    t9 = r23;
                }
                return t9;
            case 243:
                fyu fyuVar12 = this.a;
                Object obj17 = fyuVar12.au;
                if (obj17 instanceof dxjf) {
                    synchronized (obj17) {
                        obj4 = fyuVar12.au;
                        if (obj4 instanceof dxjf) {
                            azof ag = fyuVar12.ag();
                            batm aj = fyuVar12.aj();
                            cjns au = fyuVar12.au();
                            akfa rK2 = fyuVar12.a.rK();
                            dxjg.e(rK2);
                            azmb azmbVar = new azmb(ag, aj, au, rK2);
                            btrm rz2 = fyuVar12.a.rz();
                            dxjg.e(rz2);
                            dceq a5 = dcet.a();
                            a5.b(azrh.class, new azmc(azrh.class, azmbVar));
                            rz2.g(azmbVar, a5.a());
                            dxjc.d(fyuVar12.au, azmbVar);
                            fyuVar12.au = azmbVar;
                            obj4 = azmbVar;
                        }
                    }
                    obj17 = obj4;
                }
                return (T) ((axwz) obj17);
            case 244:
                fyu fyuVar13 = this.a;
                dxio c6 = dxjc.c(fyuVar13.h());
                bvrb tn7 = fyuVar13.a.tn();
                dxjg.e(tn7);
                return (T) bukk.b(c6, tn7);
            case 245:
                fyu fyuVar14 = this.a;
                Object obj18 = fyuVar14.az;
                if (obj18 instanceof dxjf) {
                    synchronized (obj18) {
                        obj5 = fyuVar14.az;
                        if (obj5 instanceof dxjf) {
                            azof ag2 = fyuVar14.ag();
                            dxio c7 = dxjc.c(fyuVar14.bC());
                            btrg fl = fyuVar14.fl();
                            cqat rR5 = fyuVar14.a.rR();
                            dxjg.e(rR5);
                            obj5 = new azmy(ag2, c7, fl, rR5, fyuVar14.aj());
                            dxjc.d(fyuVar14.az, obj5);
                            fyuVar14.az = obj5;
                        }
                    }
                    obj18 = obj5;
                }
                return (T) ((axxa) obj18);
            case 246:
                fyu fyuVar15 = this.a;
                Object obj19 = fyuVar15.aA;
                if (obj19 instanceof dxjf) {
                    synchronized (obj19) {
                        obj6 = fyuVar15.aA;
                        if (obj6 instanceof dxjf) {
                            dcsz dcszVar = new dcsz();
                            dcsz dcszVar2 = new dcsz("GMM-", dcszVar.b, dcszVar.c);
                            obj6 = new dcsz(dcszVar2.a, false, dcszVar2.c);
                            dxjc.d(fyuVar15.aA, obj6);
                            fyuVar15.aA = obj6;
                        }
                    }
                    obj19 = obj6;
                }
                return (T) ((dcsz) obj19);
            case 247:
                fyu fyuVar16 = this.a;
                Object obj20 = fyuVar16.aC;
                if (obj20 instanceof dxjf) {
                    synchronized (obj20) {
                        obj7 = fyuVar16.aC;
                        if (obj7 instanceof dxjf) {
                            Application a6 = fyuVar16.a.a();
                            dxjg.e(a6);
                            dfde dfdeVar = new dfde(a6, huj.a, new huk());
                            dxjc.d(fyuVar16.aC, dfdeVar);
                            fyuVar16.aC = dfdeVar;
                            obj7 = dfdeVar;
                        }
                    }
                    obj20 = obj7;
                }
                return (T) ((dfde) obj20);
            case 248:
                return (T) this.a.fo();
            case 249:
                return (T) this.a.cd();
            case 250:
                return (T) this.a.dH();
            case 251:
                T t10 = (T) this.a.a.c();
                dxjg.e(t10);
                return t10;
            case 252:
                return (T) this.a.fw();
            case 253:
                return (T) this.a.sG();
            case 254:
                return (T) this.a.sF();
            case 255:
                fyu fyuVar17 = this.a;
                T t11 = (T) fyuVar17.aG;
                if (t11 != null) {
                    return t11;
                }
                ?? r24 = (T) new awir(new awkc(fyuVar17.M(), fyuVar17.ts()));
                fyuVar17.aG = r24;
                return r24;
            case 256:
                Application a7 = this.a.a.a();
                dxjg.e(a7);
                return (T) new awis(a7);
            case 257:
                fyu fyuVar18 = this.a;
                Object obj21 = (T) fyuVar18.aH;
                if (obj21 == null) {
                    btvo rp7 = fyuVar18.a.rp();
                    dxjg.e(rp7);
                    dkro dkroVar = rp7.getOfflineMapsParameters().x;
                    if (dkroVar == null) {
                        dkroVar = dkro.h;
                    }
                    try {
                        obj21 = (T) new awit(eaow.d(dkroVar.d), eaow.d(dkroVar.e));
                    } catch (IllegalArgumentException unused) {
                        obj21 = new awit(eaow.b(2L), eaow.b(4L));
                    }
                    fyuVar18.aH = (awit) obj21;
                }
                return (T) obj21;
            case 258:
                fyu fyuVar19 = this.a;
                Object obj22 = fyuVar19.aI;
                if (obj22 instanceof dxjf) {
                    synchronized (obj22) {
                        obj8 = fyuVar19.aI;
                        if (obj8 instanceof dxjf) {
                            Application a8 = fyuVar19.a.a();
                            dxjg.e(a8);
                            obj8 = new awkj(a8);
                            dxjc.d(fyuVar19.aI, obj8);
                            fyuVar19.aI = obj8;
                        }
                    }
                    obj22 = obj8;
                }
                return (T) ((awkj) obj22);
            case 259:
                btvo rp8 = this.a.a.rp();
                dxjg.e(rp8);
                dkro dkroVar2 = rp8.getOfflineMapsParameters().x;
                if (dkroVar2 == null) {
                    dkroVar2 = dkro.h;
                }
                return (T) Boolean.valueOf(dkroVar2.g);
            case 260:
                return (T) this.a.cJ();
            case 261:
                return (T) this.a.fA();
            case 262:
                return (T) this.a.fB();
            case 263:
                return (T) this.a.sE();
            case 264:
                return (T) this.a.fD();
            case 265:
                fyu fyuVar20 = this.a;
                dcen O = dcep.O(7);
                dzsj dzsjVar2 = fyuVar20.aJ;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fxy(fyuVar20, 266);
                    fyuVar20.aJ = dzsjVar2;
                }
                dxio c8 = dxjc.c(dzsjVar2);
                btvo rp9 = fyuVar20.a.rp();
                dxjg.e(rp9);
                Object B = rp9.getOfflineMapsParameters().F ? dcep.B((bvkz) c8.a()) : dcmr.a;
                dxjg.f(B);
                O.i(B);
                Object obj23 = fyuVar20.aK;
                if (obj23 instanceof dxjf) {
                    synchronized (obj23) {
                        obj13 = fyuVar20.aK;
                        if (obj13 instanceof dxjf) {
                            Executor sV2 = fyuVar20.a.sV();
                            dxjg.e(sV2);
                            cqat rR6 = fyuVar20.a.rR();
                            dxjg.e(rR6);
                            bvjj rB6 = fyuVar20.a.rB();
                            dxjg.e(rB6);
                            dxio c9 = dxjc.c(fyuVar20.an());
                            dxio c10 = dxjc.c(fyuVar20.p());
                            btvo rp10 = fyuVar20.a.rp();
                            dxjg.e(rp10);
                            obj13 = new bsuh(sV2, rR6, rB6, c9, c10, rp10);
                            dxjc.d(fyuVar20.aK, obj13);
                            fyuVar20.aK = obj13;
                        }
                    }
                    obj23 = obj13;
                }
                O.b((bvkz) obj23);
                Object obj24 = fyuVar20.aL;
                if (obj24 instanceof dxjf) {
                    synchronized (obj24) {
                        obj12 = fyuVar20.aL;
                        if (obj12 instanceof dxjf) {
                            Executor sV3 = fyuVar20.a.sV();
                            dxjg.e(sV3);
                            btrm rz3 = fyuVar20.a.rz();
                            dxjg.e(rz3);
                            bypb bypbVar = new bypb(sV3, rz3, dxjc.c(fyuVar20.ch()), dxjc.c(fyuVar20.bp()));
                            dxjc.d(fyuVar20.aL, bypbVar);
                            fyuVar20.aL = bypbVar;
                            obj12 = bypbVar;
                        }
                    }
                    obj24 = obj12;
                }
                O.b((bvkz) obj24);
                Object obj25 = fyuVar20.aM;
                if (obj25 instanceof dxjf) {
                    synchronized (obj25) {
                        obj11 = fyuVar20.aM;
                        if (obj11 instanceof dxjf) {
                            Application a9 = fyuVar20.a.a();
                            dxjg.e(a9);
                            Executor sV4 = fyuVar20.a.sV();
                            dxjg.e(sV4);
                            byvd byvdVar = new byvd(a9, sV4, dxjc.c(fyuVar20.p()));
                            dxjc.d(fyuVar20.aM, byvdVar);
                            fyuVar20.aM = byvdVar;
                            obj11 = byvdVar;
                        }
                    }
                    obj25 = obj11;
                }
                O.b((bvkz) obj25);
                Object obj26 = fyuVar20.aO;
                if (obj26 instanceof dxjf) {
                    synchronized (obj26) {
                        obj9 = fyuVar20.aO;
                        if (obj9 instanceof dxjf) {
                            Executor sV5 = fyuVar20.a.sV();
                            dxjg.e(sV5);
                            Object obj27 = fyuVar20.aN;
                            if (obj27 instanceof dxjf) {
                                synchronized (obj27) {
                                    obj10 = fyuVar20.aN;
                                    if (obj10 instanceof dxjf) {
                                        Executor sV6 = fyuVar20.a.sV();
                                        dxjg.e(sV6);
                                        Application a10 = fyuVar20.a.a();
                                        dxjg.e(a10);
                                        btvo rp11 = fyuVar20.a.rp();
                                        dxjg.e(rp11);
                                        afdw fF = fyuVar20.fF();
                                        akfa rK3 = fyuVar20.a.rK();
                                        dxjg.e(rK3);
                                        cjqy tr = fyuVar20.a.tr();
                                        dxjg.e(tr);
                                        obj10 = new ahln(sV6, a10, rp11, fF, rK3, tr, fyuVar20.fG(), fyuVar20.fH(), fyuVar20.fI());
                                        dxjc.d(fyuVar20.aN, obj10);
                                        fyuVar20.aN = obj10;
                                    }
                                }
                                obj27 = obj10;
                            }
                            ahlq ahlqVar = new ahlq(sV5, (ahln) obj27);
                            dxjc.d(fyuVar20.aO, ahlqVar);
                            fyuVar20.aO = ahlqVar;
                            obj9 = ahlqVar;
                        }
                    }
                    obj26 = obj9;
                }
                O.b((bvkz) obj26);
                dxjg.e(fyuVar20.a.a());
                Executor sV7 = fyuVar20.a.sV();
                dxjg.e(sV7);
                O.b(new cjyc(sV7));
                Application a11 = fyuVar20.a.a();
                dxjg.e(a11);
                ckcw rU = fyuVar20.a.rU();
                dxjg.e(rU);
                Executor sV8 = fyuVar20.a.sV();
                dxjg.e(sV8);
                O.b(new cjyd(a11, rU, sV8));
                return (T) O.f();
            case 266:
                fyu fyuVar21 = this.a;
                Executor sV9 = fyuVar21.a.sV();
                dxjg.e(sV9);
                return (T) new avgz(sV9, fyuVar21.dk(), fyuVar21.cZ(), dxjc.c(fyuVar21.t()));
            case 267:
                return (T) new eka(this.a);
            case 268:
                return (T) new ejo(this.a);
            case 269:
                return (T) new fxh(this.a);
            case 270:
                return (T) new fue(this.a);
            case 271:
                return (T) new fwu(this.a);
            case 272:
                return (T) new ejy(this.a);
            case 273:
                return (T) new ekh(this.a);
            case 274:
                return (T) new ekj(this.a);
            case 275:
                return (T) new fuh(this.a);
            case 276:
                return (T) new ekr(this.a);
            case 277:
                return (T) new ekz(this.a);
            case 278:
                return (T) new ekf(this.a);
            case 279:
                return (T) new ful(this.a);
            case 280:
                return (T) new fww(this.a);
            case 281:
                return (T) new fun(this.a);
            case 282:
                return (T) new ekd(this.a);
            case 283:
                return (T) new fxa(this.a);
            case 284:
                return (T) new fuc(this.a);
            case 285:
                return (T) new fuj(this.a);
            case 286:
                return (T) new ekx(this.a);
            case 287:
                return (T) new fwy(this.a);
            case 288:
                return (T) new ekn(this.a);
            case 289:
                return (T) new fuq(this.a);
            case 290:
                return (T) new ejm(this.a);
            case 291:
                return (T) new fvg(this.a);
            case 292:
                return (T) new fuy(this.a);
            case 293:
                return (T) new eju(this.a);
            case 294:
                return (T) new fvc(this.a);
            case 295:
                return (T) new fvi(this.a);
            case 296:
                return (T) new fva(this.a);
            case 297:
                return (T) new ejw(this.a);
            case 298:
                return (T) new fvk(this.a);
            case 299:
                return (T) new fxs(this.a);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r6v24, types: [buwj, java.lang.Object] */
    private final T b() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        dela initializeApp;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i = this.b;
        switch (i) {
            case 0:
                fyu fyuVar = this.a;
                Application a = fyuVar.a.a();
                dxjg.e(a);
                dxio c = dxjc.c(fyuVar.f());
                ckcw rU = fyuVar.a.rU();
                dxjg.e(rU);
                bvsf qQ = fyuVar.qQ();
                cqat rR = fyuVar.a.rR();
                dxjg.e(rR);
                btpc sz = fyuVar.a.sz();
                dxjg.e(sz);
                vsf g = fyuVar.g();
                vmy j = fyuVar.j();
                avnj m22do = fyuVar.m22do();
                dxjg.e(fyuVar.a.C());
                vmg vmgVar = new vmg(dbpy.a);
                btrm rz = fyuVar.a.rz();
                dxjg.e(rz);
                ahjq wf = fyuVar.wf();
                dxio c2 = dxjc.c(fyuVar.aw());
                bvrb tn = fyuVar.a.tn();
                dxjg.e(tn);
                cjqy tr = fyuVar.a.tr();
                dxjg.e(tr);
                vwv qw = fyuVar.qw();
                Executor sV = fyuVar.a.sV();
                dxjg.e(sV);
                vva dp = fyuVar.dp();
                dzsj dzsjVar = fyuVar.ar;
                if (dzsjVar == null) {
                    dzsjVar = new fxy(fyuVar, 197);
                    fyuVar.ar = dzsjVar;
                }
                return (T) new srv(a, c, rU, qQ, rR, sz, g, j, m22do, vmgVar, rz, wf, c2, tn, tr, qw, sV, dp, dxjc.c(dzsjVar));
            case 1:
                return (T) this.a.ea();
            case 2:
                T t = (T) this.a.a.rE();
                dxjg.e(t);
                return t;
            case 3:
                return (T) this.a.wf();
            case 4:
                return (T) this.a.cZ();
            case 5:
                fyu fyuVar2 = this.a;
                return (T) new awdb(fyuVar2.m(), fyuVar2.n(), fyuVar2.o(), dxjh.c(fyuVar2.s()), dxjh.c(fyuVar2.t()), dxjh.c(fyuVar2.u()));
            case 6:
                T t2 = (T) this.a.a.a();
                dxjg.e(t2);
                return t2;
            case 7:
                T t3 = (T) this.a.a.rz();
                dxjg.e(t3);
                return t3;
            case 8:
                T t4 = (T) this.a.a.sV();
                dxjg.e(t4);
                return t4;
            case 9:
                return (T) this.a.r();
            case 10:
                T t5 = (T) this.a.a.rK();
                dxjg.e(t5);
                return t5;
            case 11:
                fyu fyuVar3 = this.a;
                Object obj11 = fyuVar3.c;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj = fyuVar3.c;
                        if (obj instanceof dxjf) {
                            obj = fyuVar3.dj().h();
                            dxjg.f(obj);
                            dxjc.d(fyuVar3.c, obj);
                            fyuVar3.c = obj;
                        }
                    }
                    obj11 = obj;
                }
                return (T) ((avrw) obj11);
            case 12:
                return (T) this.a.qn();
            case 13:
                fyu fyuVar4 = this.a;
                dzsj<avpn> x = fyuVar4.x();
                dzsj<avsb> A = fyuVar4.A();
                dzsj dzsjVar2 = fyuVar4.e;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fxy(fyuVar4, 16);
                    fyuVar4.e = dzsjVar2;
                }
                return (T) new avry(x, A, dzsjVar2, dxjh.c(fyuVar4.C()), fyuVar4.o(), fyuVar4.E());
            case 14:
                return (T) this.a.w();
            case 15:
                fyu fyuVar5 = this.a;
                Object obj12 = fyuVar5.d;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj2 = fyuVar5.d;
                        if (obj2 instanceof dxjf) {
                            obj2 = new OfflineInstanceNativeImpl(fyuVar5.y(), fyuVar5.z());
                            dxjc.d(fyuVar5.d, obj2);
                            fyuVar5.d = obj2;
                        }
                    }
                    obj12 = obj2;
                }
                return (T) ((avsb) obj12);
            case 16:
                return (T) this.a.B();
            case 17:
                T t6 = (T) this.a.a.vt();
                dxjg.e(t6);
                return t6;
            case 18:
                return (T) this.a.D();
            case 19:
                fyu fyuVar6 = this.a;
                dzsj<avoj> F = fyuVar6.F();
                dzsj<avop> G = fyuVar6.G();
                dzsj<avpo> H = fyuVar6.H();
                dzsj<avpn> x2 = fyuVar6.x();
                dzsj dzsjVar3 = fyuVar6.g;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fxy(fyuVar6, 23);
                    fyuVar6.g = dzsjVar3;
                }
                return (T) new avom(F, G, H, x2, dzsjVar3, fyuVar6.I());
            case 20:
                fyu fyuVar7 = this.a;
                Object obj13 = fyuVar7.f;
                if (obj13 instanceof dxjf) {
                    synchronized (obj13) {
                        obj3 = fyuVar7.f;
                        if (obj3 instanceof dxjf) {
                            obj3 = new OfflineInfrastructureNativeImpl();
                            dxjc.d(fyuVar7.f, obj3);
                            fyuVar7.f = obj3;
                        }
                    }
                    obj13 = obj3;
                }
                return (T) ((avoj) obj13);
            case 21:
                return (T) this.a.y();
            case 22:
                return (T) this.a.z();
            case 23:
                return (T) this.a.v();
            case 24:
                T t7 = (T) this.a.a.b();
                dxjg.e(t7);
                return t7;
            case 25:
                fyu fyuVar8 = this.a;
                dzsj<awfh> J = fyuVar8.J();
                dzsj<cqat> K = fyuVar8.K();
                dzsj dzsjVar4 = fyuVar8.h;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fxy(fyuVar8, 28);
                    fyuVar8.h = dzsjVar4;
                }
                dzsj c3 = dxjh.c(dzsjVar4);
                dzsj dzsjVar5 = fyuVar8.X;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fxy(fyuVar8, 33);
                    fyuVar8.X = dzsjVar5;
                }
                dzsj c4 = dxjh.c(dzsjVar5);
                dzsj<avpn> x3 = fyuVar8.x();
                dzsj c5 = dxjh.c(fyuVar8.P());
                dzsj dzsjVar6 = fyuVar8.ak;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fxy(fyuVar8, 163);
                    fyuVar8.ak = dzsjVar6;
                }
                dzsj c6 = dxjh.c(dzsjVar6);
                dzsj<dehq> Q = fyuVar8.Q();
                dzsj dzsjVar7 = fyuVar8.al;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fxy(fyuVar8, 176);
                    fyuVar8.al = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj<dehq> U = fyuVar8.U();
                dzsj dzsjVar9 = fyuVar8.am;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fxy(fyuVar8, 177);
                    fyuVar8.am = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj<avpo> H2 = fyuVar8.H();
                dzsj<avzo> cS = fyuVar8.cS();
                dzsj<avzm> cT = fyuVar8.cT();
                dzsj dzsjVar11 = fyuVar8.ao;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fxy(fyuVar8, 180);
                    fyuVar8.ao = dzsjVar11;
                }
                dzsj dzsjVar12 = dzsjVar11;
                dzsj dzsjVar13 = fyuVar8.aq;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fxy(fyuVar8, 181);
                    fyuVar8.aq = dzsjVar13;
                }
                return (T) new avem(J, K, c3, c4, x3, c5, c6, Q, dzsjVar8, U, dzsjVar10, H2, cS, cT, dzsjVar12, dzsjVar13, fyuVar8.cV(), dxjh.c(fyuVar8.t()));
            case 26:
                return (T) this.a.qP();
            case 27:
                T t8 = (T) this.a.a.rR();
                dxjg.e(t8);
                return t8;
            case 28:
                fyu fyuVar9 = this.a;
                return (T) new avas(fyuVar9.K(), fyuVar9.P(), fyuVar9.Q(), fyuVar9.U());
            case 29:
                return (T) this.a.O();
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                T t9 = (T) this.a.a.tg();
                dxjg.e(t9);
                return t9;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return (T) this.a.T();
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                T t10 = (T) this.a.a.tn();
                dxjg.e(t10);
                return t10;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                fyu fyuVar10 = this.a;
                dzsj<btvo> V = fyuVar10.V();
                dzsj dzsjVar14 = fyuVar10.j;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fxy(fyuVar10, 35);
                    fyuVar10.j = dzsjVar14;
                }
                dzsj dzsjVar15 = dzsjVar14;
                dzsj<avop> G2 = fyuVar10.G();
                dzsj dzsjVar16 = fyuVar10.p;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new fxy(fyuVar10, 38);
                    fyuVar10.p = dzsjVar16;
                }
                dzsj dzsjVar17 = dzsjVar16;
                dzsj dzsjVar18 = fyuVar10.r;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new fxy(fyuVar10, 45);
                    fyuVar10.r = dzsjVar18;
                }
                dzsj dzsjVar19 = dzsjVar18;
                dzsj<avll> cL = fyuVar10.cL();
                dzsj dzsjVar20 = fyuVar10.P;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fxy(fyuVar10, 156);
                    fyuVar10.P = dzsjVar20;
                }
                dzsj dzsjVar21 = dzsjVar20;
                dzsj dzsjVar22 = fyuVar10.R;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new fxy(fyuVar10, 157);
                    fyuVar10.R = dzsjVar22;
                }
                dzsj dzsjVar23 = dzsjVar22;
                dzsj dzsjVar24 = fyuVar10.T;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new fxy(fyuVar10, 158);
                    fyuVar10.T = dzsjVar24;
                }
                dzsj dzsjVar25 = dzsjVar24;
                dzsj<dehq> U2 = fyuVar10.U();
                dzsj<avki> cO = fyuVar10.cO();
                dzsj dzsjVar26 = fyuVar10.U;
                if (dzsjVar26 == null) {
                    dzsjVar26 = new fxy(fyuVar10, 160);
                    fyuVar10.U = dzsjVar26;
                }
                dzsj dzsjVar27 = dzsjVar26;
                dzsj dzsjVar28 = fyuVar10.V;
                if (dzsjVar28 == null) {
                    dzsjVar28 = new fxy(fyuVar10, 161);
                    fyuVar10.V = dzsjVar28;
                }
                dzsj c7 = dxjh.c(dzsjVar28);
                dzsj<cjqy> al = fyuVar10.al();
                dzsj dzsjVar29 = fyuVar10.W;
                if (dzsjVar29 == null) {
                    dzsjVar29 = new fxy(fyuVar10, 162);
                    fyuVar10.W = dzsjVar29;
                }
                return (T) new avbf(V, dzsjVar15, G2, dzsjVar17, dzsjVar19, cL, dzsjVar21, dzsjVar23, dzsjVar25, U2, cO, dzsjVar27, c7, al, dzsjVar29);
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                T t11 = (T) this.a.a.rp();
                dxjg.e(t11);
                return t11;
            case 35:
                fyu fyuVar11 = this.a;
                return (T) new avba(fyuVar11.y(), fyuVar11.aa());
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                fyu fyuVar12 = this.a;
                dxio c8 = dxjc.c(fyuVar12.Y());
                if (fyuVar12.Z() == null) {
                    return null;
                }
                c8.a();
                return (T) delp.getInstance();
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                fyu fyuVar13 = this.a;
                Object obj14 = fyuVar13.i;
                if (obj14 instanceof dxjf) {
                    synchronized (obj14) {
                        obj4 = fyuVar13.i;
                        if (obj4 instanceof dxjf) {
                            Application a2 = fyuVar13.a.a();
                            dxjg.e(a2);
                            Iterator<dela> it = dela.getApps(a2).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    dela next = it.next();
                                    if (next.b().equals("[DEFAULT]")) {
                                        initializeApp = next;
                                    }
                                } else {
                                    deld deldVar = new deld();
                                    deldVar.b("AIzaSyAbPUTxeDTnaihCKmLXCMKrrUT3HNLQW6w");
                                    deldVar.b = "658104395416";
                                    deldVar.c("1:658104395416:android:f92af935c17dc6589092ed");
                                    deldVar.d = "google.com:api-project-658104395416";
                                    initializeApp = dela.initializeApp(a2, deldVar.a(), "[DEFAULT]");
                                }
                            }
                            dxjc.d(fyuVar13.i, initializeApp);
                            fyuVar13.i = initializeApp;
                            obj4 = initializeApp;
                        }
                    }
                    obj14 = obj4;
                }
                return (T) ((dela) obj14);
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                fyu fyuVar14 = this.a;
                T t12 = (T) fyuVar14.o;
                if (!(t12 instanceof dxjf)) {
                    return t12;
                }
                synchronized (t12) {
                    obj5 = fyuVar14.o;
                    if (obj5 instanceof dxjf) {
                        btvo rp = fyuVar14.a.rp();
                        dxjg.e(rp);
                        dzsj dzsjVar30 = fyuVar14.k;
                        if (dzsjVar30 == null) {
                            dzsjVar30 = new fxy(fyuVar14, 39);
                            fyuVar14.k = dzsjVar30;
                        }
                        dxio c9 = dxjc.c(dzsjVar30);
                        dzsj dzsjVar31 = fyuVar14.n;
                        if (dzsjVar31 == null) {
                            dzsjVar31 = new fxy(fyuVar14, 42);
                            fyuVar14.n = dzsjVar31;
                        }
                        obj5 = rp.getOfflineMapsParameters().z ? (avbz) dxjc.c(dzsjVar31).a() : (avbz) c9.a();
                        dxjg.f(obj5);
                        dxjc.d(fyuVar14.o, obj5);
                        fyuVar14.o = obj5;
                    }
                }
                return (T) obj5;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                fyu fyuVar15 = this.a;
                return (T) new avcf(fyuVar15.ac(), fyuVar15.x(), fyuVar15.p(), fyuVar15.J(), fyuVar15.ad(), dxjh.c(fyuVar15.t()));
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return (T) this.a.ab();
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return (T) this.a.dk();
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                fyu fyuVar16 = this.a;
                dzsj dzsjVar32 = fyuVar16.m;
                if (dzsjVar32 == null) {
                    dzsjVar32 = new fxy(fyuVar16, 43);
                    fyuVar16.m = dzsjVar32;
                }
                return (T) new avcl(dzsjVar32, fyuVar16.ae(), fyuVar16.x(), fyuVar16.p(), fyuVar16.J(), fyuVar16.ad(), dxjh.c(fyuVar16.t()));
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                fyu fyuVar17 = this.a;
                Object obj15 = fyuVar17.l;
                if (obj15 instanceof dxjf) {
                    synchronized (obj15) {
                        obj6 = fyuVar17.l;
                        if (obj6 instanceof dxjf) {
                            Application a3 = fyuVar17.a.a();
                            dxjg.e(a3);
                            btuu aU = fyuVar17.a.aU();
                            dxjg.e(aU);
                            dehq tg = fyuVar17.a.tg();
                            dxjg.e(tg);
                            CronetEngine aO = fyuVar17.a.aO();
                            dxjg.e(aO);
                            aU.a();
                            cljo cljoVar = new cljo(tg);
                            cljg cljgVar = new cljg(aO, tg);
                            clld clldVar = new clld(tg);
                            clkp clkpVar = new clkp();
                            clkpVar.a("data", cljoVar);
                            for (String str : dcep.C("http", "https")) {
                                clkpVar.a(str, cljgVar);
                            }
                            clkpVar.a("file", clldVar);
                            clkpVar.b = tg;
                            clkpVar.d = new clkv();
                            clkpVar.c = new clip(a3, tg, 10000L);
                            obj6 = new clks(clkpVar);
                            dxjc.d(fyuVar17.l, obj6);
                            fyuVar17.l = obj6;
                        }
                    }
                    obj15 = obj6;
                }
                return (T) ((clks) obj15);
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                T t13 = (T) this.a.a.tl();
                dxjg.e(t13);
                return t13;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                fyu fyuVar18 = this.a;
                Object obj16 = fyuVar18.q;
                if (obj16 instanceof dxjf) {
                    synchronized (obj16) {
                        obj7 = fyuVar18.q;
                        if (obj7 instanceof dxjf) {
                            cqat rR2 = fyuVar18.a.rR();
                            dxjg.e(rR2);
                            cjqy tr2 = fyuVar18.a.tr();
                            dxjg.e(tr2);
                            obj7 = new avtr(rR2, tr2, fyuVar18.af());
                            dxjc.d(fyuVar18.q, obj7);
                            fyuVar18.q = obj7;
                        }
                    }
                    obj16 = obj7;
                }
                return (T) ((avtr) obj16);
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return (T) this.a.cK();
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return (T) this.a.cy();
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return (T) this.a.ag();
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return (T) this.a.rH();
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return (T) this.a.cu();
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                T t14 = (T) this.a.a.tr();
                dxjg.e(t14);
                return t14;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return (T) this.a.am();
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return (T) this.a.ao();
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return (T) this.a.ct();
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return (T) this.a.cp();
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                T t15 = (T) this.a.a.sx();
                dxjg.e(t15);
                return t15;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return (T) this.a.ar();
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return (T) this.a.uR();
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                T t16 = (T) this.a.a.rU();
                dxjg.e(t16);
                return t16;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return (T) this.a.bM();
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                fyu fyuVar19 = this.a;
                Application a4 = fyuVar19.a.a();
                dxjg.e(a4);
                btrm rz2 = fyuVar19.a.rz();
                dxjg.e(rz2);
                ?? av = fyuVar19.av();
                bvjj rB = fyuVar19.a.rB();
                dxjg.e(rB);
                ped aC = fyuVar19.aC();
                bvrb tn2 = fyuVar19.a.tn();
                dxjg.e(tn2);
                dxio c10 = dxjc.c(fyuVar19.p());
                cqat rR3 = fyuVar19.a.rR();
                dxjg.e(rR3);
                btvo rp2 = fyuVar19.a.rp();
                dxjg.e(rp2);
                return (T) new paf(a4, rz2, av, rB, aC, tn2, c10, rR3, rp2, fyuVar19.aD(), fyuVar19.aE());
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                T t17 = (T) this.a.a.rB();
                dxjg.e(t17);
                return t17;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                fyu fyuVar20 = this.a;
                dzsj dzsjVar33 = fyuVar20.s;
                if (dzsjVar33 == null) {
                    dzsjVar33 = new fxy(fyuVar20, 64);
                    fyuVar20.s = dzsjVar33;
                }
                T t18 = (T) ((byqc) dxjc.c(dzsjVar33).a());
                dxjg.f(t18);
                return t18;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                fyu fyuVar21 = this.a;
                Application a5 = fyuVar21.a.a();
                dxjg.e(a5);
                btvo rp3 = fyuVar21.a.rp();
                dxjg.e(rp3);
                cqat rR4 = fyuVar21.a.rR();
                dxjg.e(rR4);
                bvjj rB2 = fyuVar21.a.rB();
                dxjg.e(rB2);
                dehq tf = fyuVar21.a.tf();
                dxjg.e(tf);
                return (T) new byoz(a5, rp3, rR4, rB2, tf, new byow(), dxjc.c(fyuVar21.at()));
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return (T) this.a.ay();
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return (T) this.a.az();
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                fyu fyuVar22 = this.a;
                dxio c11 = dxjc.c(fyuVar22.p());
                dzsj dzsjVar34 = fyuVar22.t;
                if (dzsjVar34 == null) {
                    dzsjVar34 = new fxy(fyuVar22, 68);
                    fyuVar22.t = dzsjVar34;
                }
                dxio c12 = dxjc.c(dzsjVar34);
                dzsj dzsjVar35 = fyuVar22.u;
                if (dzsjVar35 == null) {
                    dzsjVar35 = new fxy(fyuVar22, 69);
                    fyuVar22.u = dzsjVar35;
                }
                dxio c13 = dxjc.c(dzsjVar35);
                dzsj dzsjVar36 = fyuVar22.v;
                if (dzsjVar36 == null) {
                    dzsjVar36 = new fxy(fyuVar22, 70);
                    fyuVar22.v = dzsjVar36;
                }
                dxio c14 = dxjc.c(dzsjVar36);
                dzsj dzsjVar37 = fyuVar22.w;
                if (dzsjVar37 == null) {
                    dzsjVar37 = new fxy(fyuVar22, 71);
                    fyuVar22.w = dzsjVar37;
                }
                dxio c15 = dxjc.c(dzsjVar37);
                dzsj dzsjVar38 = fyuVar22.x;
                if (dzsjVar38 == null) {
                    dzsjVar38 = new fxy(fyuVar22, 72);
                    fyuVar22.x = dzsjVar38;
                }
                dxio c16 = dxjc.c(dzsjVar38);
                dzsj dzsjVar39 = fyuVar22.y;
                if (dzsjVar39 == null) {
                    dzsjVar39 = new fxy(fyuVar22, 73);
                    fyuVar22.y = dzsjVar39;
                }
                dxio c17 = dxjc.c(dzsjVar39);
                dzsj dzsjVar40 = fyuVar22.z;
                if (dzsjVar40 == null) {
                    dzsjVar40 = new fxy(fyuVar22, 74);
                    fyuVar22.z = dzsjVar40;
                }
                dxio c18 = dxjc.c(dzsjVar40);
                dzsj dzsjVar41 = fyuVar22.A;
                if (dzsjVar41 == null) {
                    dzsjVar41 = new fxy(fyuVar22, 75);
                    fyuVar22.A = dzsjVar41;
                }
                dxjc.c(dzsjVar41);
                dzsj dzsjVar42 = fyuVar22.B;
                if (dzsjVar42 == null) {
                    dzsjVar42 = new fxy(fyuVar22, 76);
                    fyuVar22.B = dzsjVar42;
                }
                dxio c19 = dxjc.c(dzsjVar42);
                dzsj dzsjVar43 = fyuVar22.C;
                if (dzsjVar43 == null) {
                    dzsjVar43 = new fxy(fyuVar22, 77);
                    fyuVar22.C = dzsjVar43;
                }
                dxio c20 = dxjc.c(dzsjVar43);
                dzsj dzsjVar44 = fyuVar22.D;
                if (dzsjVar44 == null) {
                    dzsjVar44 = new fxy(fyuVar22, 78);
                    fyuVar22.D = dzsjVar44;
                }
                return (T) new pbt(c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, dxjc.c(dzsjVar44));
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                fyu fyuVar23 = this.a;
                dxio c21 = dxjc.c(fyuVar23.h());
                bvrb tn3 = fyuVar23.a.tn();
                dxjg.e(tn3);
                return (T) new bubh(c21, tn3);
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                fyu fyuVar24 = this.a;
                dxio c22 = dxjc.c(fyuVar24.h());
                bvrb tn4 = fyuVar24.a.tn();
                dxjg.e(tn4);
                return (T) new bubd(c22, tn4);
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                fyu fyuVar25 = this.a;
                dxio c23 = dxjc.c(fyuVar25.h());
                bvrb tn5 = fyuVar25.a.tn();
                dxjg.e(tn5);
                return (T) new buav(c23, tn5);
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                fyu fyuVar26 = this.a;
                dxio c24 = dxjc.c(fyuVar26.h());
                bvrb tn6 = fyuVar26.a.tn();
                dxjg.e(tn6);
                return (T) new buaz(c24, tn6);
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                fyu fyuVar27 = this.a;
                dxio c25 = dxjc.c(fyuVar27.h());
                bvrb tn7 = fyuVar27.a.tn();
                dxjg.e(tn7);
                return (T) new buax(c25, tn7);
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return (T) this.a.aF();
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return (T) this.a.aG();
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                fyu fyuVar28 = this.a;
                dxio c26 = dxjc.c(fyuVar28.h());
                bvrb tn8 = fyuVar28.a.tn();
                dxjg.e(tn8);
                return (T) new bubb(c26, tn8);
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                fyu fyuVar29 = this.a;
                dxio c27 = dxjc.c(fyuVar29.h());
                bvrb tn9 = fyuVar29.a.tn();
                dxjg.e(tn9);
                return (T) new bubf(c27, tn9);
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                fyu fyuVar30 = this.a;
                dxio c28 = dxjc.c(fyuVar30.h());
                bvrb tn10 = fyuVar30.a.tn();
                dxjg.e(tn10);
                return (T) new bubj(c28, tn10);
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                fyu fyuVar31 = this.a;
                dxio c29 = dxjc.c(fyuVar31.h());
                bvrb tn11 = fyuVar31.a.tn();
                dxjg.e(tn11);
                return (T) new buan(c29, tn11);
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return (T) this.a.aW();
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return (T) this.a.aH();
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                fyu fyuVar32 = this.a;
                Object obj17 = fyuVar32.E;
                if (obj17 instanceof dxjf) {
                    synchronized (obj17) {
                        obj8 = fyuVar32.E;
                        if (obj8 instanceof dxjf) {
                            Application a6 = fyuVar32.a.a();
                            dxjg.e(a6);
                            btvo rp4 = fyuVar32.a.rp();
                            dxjg.e(rp4);
                            dxjg.e(fyuVar32.a.rB());
                            cqat rR5 = fyuVar32.a.rR();
                            dxjg.e(rR5);
                            aunp aJ = fyuVar32.aJ();
                            ckcw rU2 = fyuVar32.a.rU();
                            dxjg.e(rU2);
                            obj8 = new aume(a6, rp4, rR5, aJ, rU2);
                            dxjc.d(fyuVar32.E, obj8);
                            fyuVar32.E = obj8;
                        }
                    }
                    obj17 = obj8;
                }
                return (T) ((aump) obj17);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return (T) this.a.cq();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                fyu fyuVar33 = this.a;
                Object obj18 = fyuVar33.F;
                if (obj18 instanceof dxjf) {
                    synchronized (obj18) {
                        obj9 = fyuVar33.F;
                        if (obj9 instanceof dxjf) {
                            pbj bw = fyuVar33.bw();
                            obj9 = bw == null ? dbpy.a : dbsg.i(bw.q());
                            dxjc.d(fyuVar33.F, obj9);
                            fyuVar33.F = obj9;
                        }
                    }
                    obj18 = obj9;
                }
                return (T) ((dbsg) obj18);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return (T) this.a.aQ();
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return (T) this.a.aO();
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return (T) this.a.aV();
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return (T) this.a.bt();
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return (T) auny.b();
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return (T) this.a.aR();
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return (T) this.a.qG();
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                fyu fyuVar34 = this.a;
                Object obj19 = fyuVar34.G;
                if (obj19 instanceof dxjf) {
                    synchronized (obj19) {
                        obj10 = fyuVar34.G;
                        if (obj10 instanceof dxjf) {
                            btwr sx = fyuVar34.a.sx();
                            dxjg.e(sx);
                            akfa rK = fyuVar34.a.rK();
                            dxjg.e(rK);
                            ckcw rU3 = fyuVar34.a.rU();
                            dxjg.e(rU3);
                            Application a7 = fyuVar34.a.a();
                            dxjg.e(a7);
                            obj10 = new autv(sx, rK, rU3, a7);
                            dxjc.d(fyuVar34.G, obj10);
                            fyuVar34.G = obj10;
                        }
                    }
                    obj19 = obj10;
                }
                return (T) ((auua) obj19);
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return (T) this.a.aZ();
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return (T) this.a.bb();
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return (T) this.a.bd();
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                fyu fyuVar35 = this.a;
                dxio c30 = dxjc.c(fyuVar35.at());
                dxio c31 = dxjc.c(fyuVar35.V());
                dxjc.c(fyuVar35.aw());
                return (T) new bzui(c30, c31, dxjc.c(fyuVar35.p()), dxjc.c(fyuVar35.be()));
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return (T) this.a.aN();
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return (T) this.a.aP();
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return (T) this.a.aX();
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return (T) this.a.bi();
            default:
                throw new AssertionError(i);
        }
    }

    private final T f() {
        Object obj;
        Object obj2;
        T t;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        int i = this.b;
        switch (i) {
            case 400:
                T t2 = (T) this.a.a.aN();
                dxjg.e(t2);
                return t2;
            case 401:
                fyu fyuVar = this.a;
                dxjg.e(fyuVar.a.b());
                ckcw rU = fyuVar.a.rU();
                dxjg.e(rU);
                dxjg.e(fyuVar.a.sV());
                dxjg.e(fyuVar.a.sV());
                dxjg.e(fyuVar.a.sP());
                new bnkw();
                dxjc.c(fyuVar.ib());
                fyuVar.vz();
                dxjg.e(fyuVar.a.sV());
                ckcw rU2 = fyuVar.a.rU();
                dxjg.e(rU2);
                new bnkp(rU2);
                dxjc.c(fyuVar.ib());
                dxjc.c(fyuVar.id());
                dxjg.e(fyuVar.a.sV());
                int i2 = btxp.a;
                bvjj rB = fyuVar.a.rB();
                dxjg.e(rB);
                return (T) new bnkt(rU, rB);
            case 402:
                dxjc.c(this.a.V());
                return (T) new apqx();
            case 403:
                dxjg.e(this.a.a.a());
                return (T) new apqw();
            case 404:
                T t3 = (T) this.a.a.sC();
                dxjg.e(t3);
                return t3;
            case 405:
                ahkm d = this.a.b.d();
                dxjg.e(d);
                T t4 = (T) d.b();
                dxjg.f(t4);
                return t4;
            case 406:
                fyu fyuVar2 = this.a;
                Object obj19 = fyuVar2.bH;
                if (obj19 instanceof dxjf) {
                    synchronized (obj19) {
                        obj = fyuVar2.bH;
                        if (obj instanceof dxjf) {
                            obj = new ArrayDeque();
                            dxjc.d(fyuVar2.bH, obj);
                            fyuVar2.bH = obj;
                        }
                    }
                    obj19 = obj;
                }
                return (T) ((Queue) obj19);
            case 407:
                return (T) this.a.m23if();
            case 408:
                return (T) this.a.aU();
            case 409:
                return (T) this.a.ih();
            case 410:
                T t5 = (T) ((rhr) this.a.bF()).a();
                dxjg.f(t5);
                return t5;
            case 411:
                return (T) this.a.fk();
            case 412:
                return (T) this.a.bW();
            case 413:
                return (T) new cqhn();
            case 414:
                return (T) this.a.cH();
            case 415:
                return (T) this.a.dG();
            case 416:
                return (T) this.a.hY();
            case 417:
                fyu fyuVar3 = this.a;
                Object obj20 = fyuVar3.bL;
                if (obj20 instanceof dxjf) {
                    synchronized (obj20) {
                        obj2 = fyuVar3.bL;
                        if (obj2 instanceof dxjf) {
                            dxio c = dxjc.c(fyuVar3.p());
                            bvjj rB2 = fyuVar3.a.rB();
                            dxjg.e(rB2);
                            aqaa aqaaVar = new aqaa(c, rB2, fyuVar3.bW(), fyuVar3.cm());
                            dxjc.d(fyuVar3.bL, aqaaVar);
                            fyuVar3.bL = aqaaVar;
                            obj2 = aqaaVar;
                        }
                    }
                    obj20 = obj2;
                }
                return (T) ((aqaa) obj20);
            case 418:
                return (T) this.a.iK();
            case 419:
                fyu fyuVar4 = this.a;
                dzsj dzsjVar = fyuVar4.bO;
                if (dzsjVar == null) {
                    dzsjVar = new fxy(fyuVar4, 420);
                    fyuVar4.bO = dzsjVar;
                }
                dxio c2 = dxjc.c(dzsjVar);
                if (fyuVar4.hY().a()) {
                    t = (T) ((apyy) c2.a());
                } else {
                    t = (T) new aqfx();
                }
                dxjg.f(t);
                return t;
            case 420:
                fyu fyuVar5 = this.a;
                Object obj21 = fyuVar5.bN;
                if (obj21 instanceof dxjf) {
                    synchronized (obj21) {
                        obj3 = fyuVar5.bN;
                        if (obj3 instanceof dxjf) {
                            Application a = fyuVar5.a.a();
                            dxjg.e(a);
                            apyv hZ = fyuVar5.hZ();
                            aufl cu = fyuVar5.cu();
                            aqrr ir = fyuVar5.ir();
                            auhj bg = fyuVar5.bg();
                            auhq ao = fyuVar5.ao();
                            aqbv it = fyuVar5.it();
                            dxio c3 = dxjc.c(fyuVar5.is());
                            dxio c4 = dxjc.c(fyuVar5.iq());
                            dxio c5 = dxjc.c(fyuVar5.p());
                            dxio c6 = dxjc.c(fyuVar5.ip());
                            dxio c7 = dxjc.c(fyuVar5.V());
                            Object obj22 = fyuVar5.bM;
                            if (obj22 instanceof dxjf) {
                                synchronized (obj22) {
                                    obj4 = fyuVar5.bM;
                                    if (obj4 instanceof dxjf) {
                                        obj4 = new aprj(fyuVar5.iu());
                                        dxjc.d(fyuVar5.bM, obj4);
                                        fyuVar5.bM = obj4;
                                    }
                                }
                                obj22 = obj4;
                            }
                            aqgc iv = fyuVar5.iv();
                            ckcw rU3 = fyuVar5.a.rU();
                            dxjg.e(rU3);
                            cjqy tr = fyuVar5.a.tr();
                            dxjg.e(tr);
                            bvjj rB3 = fyuVar5.a.rB();
                            dxjg.e(rB3);
                            dehq tg = fyuVar5.a.tg();
                            dxjg.e(tg);
                            obj3 = new apxe(a, hZ, cu, ir, bg, ao, it, c3, c4, c5, c6, c7, (aprj) obj22, iv, rU3, tr, rB3, tg, dxjc.c(fyuVar5.iw()));
                            dxjc.d(fyuVar5.bN, obj3);
                            fyuVar5.bN = obj3;
                        }
                    }
                    obj21 = obj3;
                }
                return (T) ((apxe) obj21);
            case 421:
                return (T) this.a.qf();
            case 422:
                fyu fyuVar6 = this.a;
                btrm rz = fyuVar6.a.rz();
                dxjg.e(rz);
                bvrb tn = fyuVar6.a.tn();
                dxjg.e(tn);
                return (T) new aqdj(rz, tn, fyuVar6.hZ(), fyuVar6.cm(), dxjc.c(fyuVar6.is()), dxjc.c(fyuVar6.iy()), dxjc.c(fyuVar6.iq()), dxjc.c(fyuVar6.iz()));
            case 423:
                return (T) this.a.it();
            case 424:
                return (T) this.a.iv();
            case 425:
                fyu fyuVar7 = this.a;
                Object obj23 = fyuVar7.bP;
                if (obj23 instanceof dxjf) {
                    synchronized (obj23) {
                        obj5 = fyuVar7.bP;
                        if (obj5 instanceof dxjf) {
                            obj5 = new aqcm();
                            dxjc.d(fyuVar7.bP, obj5);
                            fyuVar7.bP = obj5;
                        }
                    }
                    obj23 = obj5;
                }
                return (T) ((aqcm) obj23);
            case 426:
                fyu fyuVar8 = this.a;
                dxio c8 = dxjc.c(fyuVar8.is());
                dxio c9 = dxjc.c(fyuVar8.iy());
                dxio c10 = dxjc.c(fyuVar8.p());
                aqbz iC = fyuVar8.iC();
                Executor sV = fyuVar8.a.sV();
                dxjg.e(sV);
                btvo rp = fyuVar8.a.rp();
                dxjg.e(rp);
                bvrb tn2 = fyuVar8.a.tn();
                dxjg.e(tn2);
                dxio c11 = dxjc.c(fyuVar8.cP());
                bvjj rB4 = fyuVar8.a.rB();
                dxjg.e(rB4);
                return (T) new aqcz(c8, c9, c10, iC, sV, rp, tn2, c11, rB4);
            case 427:
                fyu fyuVar9 = this.a;
                btvo rp2 = fyuVar9.a.rp();
                dxjg.e(rp2);
                return (T) new aqbw(rp2, fyuVar9.hZ(), dxjc.c(fyuVar9.iI()), dxjc.c(fyuVar9.iy()));
            case 428:
                return (T) this.a.iH();
            case 429:
                return (T) this.a.iF();
            case 430:
                fyu fyuVar10 = this.a;
                dzsj dzsjVar2 = fyuVar10.bQ;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fxy(fyuVar10, 431);
                    fyuVar10.bQ = dzsjVar2;
                }
                return (T) new aqan(dxjc.c(dzsjVar2));
            case 431:
                T t6 = (T) this.a.a.aZ();
                dxjg.e(t6);
                return t6;
            case 432:
                fyu fyuVar11 = this.a;
                Context b = fyuVar11.a.b();
                dxjg.e(b);
                return (T) new aqao(b, dxjc.c(fyuVar11.at()), dxjc.c(fyuVar11.V()));
            case 433:
                fyu fyuVar12 = this.a;
                dzsj dzsjVar3 = fyuVar12.bS;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fxy(fyuVar12, 434);
                    fyuVar12.bS = dzsjVar3;
                }
                T t7 = (T) ((aqgv) dxjc.c(dzsjVar3).a());
                dxjg.f(t7);
                return t7;
            case 434:
                fyu fyuVar13 = this.a;
                Context b2 = fyuVar13.a.b();
                dxjg.e(b2);
                ckcw rU4 = fyuVar13.a.rU();
                dxjg.e(rU4);
                btvo rp3 = fyuVar13.a.rp();
                dxjg.e(rp3);
                bvjj rB5 = fyuVar13.a.rB();
                dxjg.e(rB5);
                aqav iK = fyuVar13.iK();
                btvo rp4 = fyuVar13.a.rp();
                dxjg.e(rp4);
                bvrb tn3 = fyuVar13.a.tn();
                dxjg.e(tn3);
                aqgq aqgqVar = new aqgq(rp4, tn3, new aqal(dxjc.c(fyuVar13.Y())));
                Object obj24 = fyuVar13.bR;
                if (obj24 instanceof dxjf) {
                    synchronized (obj24) {
                        obj6 = fyuVar13.bR;
                        if (obj6 instanceof dxjf) {
                            ckcw rU5 = fyuVar13.a.rU();
                            dxjg.e(rU5);
                            bvjj rB6 = fyuVar13.a.rB();
                            dxjg.e(rB6);
                            obj6 = new aqgr(rU5, rB6);
                            dxjc.d(fyuVar13.bR, obj6);
                            fyuVar13.bR = obj6;
                        }
                    }
                    obj24 = obj6;
                }
                return (T) new aqgt(b2, rU4, rp3, rB5, iK, aqgqVar, (aqgr) obj24);
            case 435:
                T t8 = (T) this.a.a.aP();
                dxjg.e(t8);
                return t8;
            case 436:
                return (T) this.a.hZ();
            case 437:
                return (T) this.a.eU();
            case 438:
                T t9 = (T) this.a.a.C();
                dxjg.e(t9);
                return t9;
            case 439:
                return (T) this.a.co();
            case 440:
                T t10 = (T) this.a.a.aL();
                dxjg.e(t10);
                return t10;
            case 441:
                return (T) this.a.sr();
            case 442:
                T t11 = (T) this.a.a.sd();
                dxjg.e(t11);
                return t11;
            case 443:
                T t12 = (T) this.a.a.sB();
                dxjg.e(t12);
                return t12;
            case 444:
                T t13 = (T) this.a.a.sD();
                dxjg.e(t13);
                return t13;
            case 445:
                return (T) this.a.qT();
            case 446:
                btvo rp5 = this.a.a.rp();
                dxjg.e(rp5);
                return (T) new apni(rp5);
            case 447:
                return (T) this.a.ja();
            case 448:
                fyu fyuVar14 = this.a;
                T t14 = (T) fyuVar14.bV;
                if (!(t14 instanceof dxjf)) {
                    return t14;
                }
                synchronized (t14) {
                    obj7 = fyuVar14.bV;
                    if (obj7 instanceof dxjf) {
                        Application a2 = fyuVar14.a.a();
                        dxjg.e(a2);
                        Executor sU = fyuVar14.a.sU();
                        dxjg.e(sU);
                        bvjj rB7 = fyuVar14.a.rB();
                        dxjg.e(rB7);
                        bbqn bbqnVar = new bbqn(a2, sU, rB7);
                        dxjc.d(fyuVar14.bV, bbqnVar);
                        fyuVar14.bV = bbqnVar;
                        obj7 = bbqnVar;
                    }
                }
                return (T) obj7;
            case 449:
                fyu fyuVar15 = this.a;
                T t15 = (T) fyuVar15.bW;
                if (!(t15 instanceof dxjf)) {
                    return t15;
                }
                synchronized (t15) {
                    obj8 = fyuVar15.bW;
                    if (obj8 instanceof dxjf) {
                        Application a3 = fyuVar15.a.a();
                        dxjg.e(a3);
                        crwb iX = fyuVar15.iX();
                        btvo rp6 = fyuVar15.a.rp();
                        dxjg.e(rp6);
                        bbps bbpsVar = new bbps(a3, iX, rp6, fyuVar15.iY());
                        dxjc.d(fyuVar15.bW, bbpsVar);
                        fyuVar15.bW = bbpsVar;
                        obj8 = bbpsVar;
                    }
                }
                return (T) obj8;
            case 450:
                return (T) fyu.vy();
            case 451:
                return (T) this.a.sH();
            case 452:
                return (T) this.a.jg();
            case 453:
                return (T) this.a.bx();
            case 454:
                return (T) this.a.ji();
            case 455:
                T t16 = (T) this.a.a.si();
                dxjg.e(t16);
                return t16;
            case 456:
                fyu fyuVar16 = this.a;
                Application a4 = fyuVar16.a.a();
                dxjg.e(a4);
                cqat rR = fyuVar16.a.rR();
                dxjg.e(rR);
                btvo rp7 = fyuVar16.a.rp();
                dxjg.e(rp7);
                axrg aH = fyuVar16.aH();
                dxio c12 = dxjc.c(fyuVar16.p());
                Executor sV2 = fyuVar16.a.sV();
                dxjg.e(sV2);
                cjns au = fyuVar16.au();
                btpc sz = fyuVar16.a.sz();
                dxjg.e(sz);
                ckcw rU6 = fyuVar16.a.rU();
                dxjg.e(rU6);
                cjqy tr2 = fyuVar16.a.tr();
                dxjg.e(tr2);
                return (T) new bzlp(a4, rR, rp7, aH, c12, sV2, au, sz, rU6, tr2);
            case 457:
                return (T) this.a.g();
            case 458:
                return (T) this.a.jq();
            case 459:
                return (T) this.a.jn();
            case 460:
                return (T) this.a.jp();
            case 461:
                fyu fyuVar17 = this.a;
                dzsj dzsjVar4 = fyuVar17.ay;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fxy(fyuVar17, 244);
                    fyuVar17.ay = dzsjVar4;
                }
                dxio c13 = dxjc.c(dzsjVar4);
                Executor sV3 = fyuVar17.a.sV();
                dxjg.e(sV3);
                return (T) new afdf(c13, sV3, dxjc.c(fyuVar17.at()));
            case 462:
                return (T) this.a.eI();
            case 463:
                return (T) this.a.ju();
            case 464:
                T t17 = (T) this.a.a.sO();
                dxjg.e(t17);
                return t17;
            case 465:
                return (T) this.a.eG();
            case 466:
                return (T) this.a.eH();
            case 467:
                return (T) this.a.rw();
            case 468:
                return (T) this.a.jA();
            case 469:
                fyu fyuVar18 = this.a;
                dzsj<anmp> jC = fyuVar18.jC();
                dzsj dzsjVar5 = fyuVar18.ci;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fxy(fyuVar18, 470);
                    fyuVar18.ci = dzsjVar5;
                }
                dzsj dzsjVar6 = fyuVar18.cj;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fxy(fyuVar18, 471);
                    fyuVar18.cj = dzsjVar6;
                }
                return (T) new anmf(jC, dzsjVar5, dzsjVar6);
            case 470:
                fyu fyuVar19 = this.a;
                T t18 = (T) fyuVar19.ch;
                if (!(t18 instanceof dxjf)) {
                    return t18;
                }
                synchronized (t18) {
                    obj9 = fyuVar19.ch;
                    if (obj9 instanceof dxjf) {
                        Object obj25 = fyuVar19.cf;
                        if (obj25 instanceof dxjf) {
                            synchronized (obj25) {
                                obj11 = fyuVar19.cf;
                                if (obj11 instanceof dxjf) {
                                    obj11 = new anls();
                                    dxjc.d(fyuVar19.cf, obj11);
                                    fyuVar19.cf = obj11;
                                }
                            }
                            obj25 = obj11;
                        }
                        anlq anlqVar = (anlq) obj25;
                        anlo jz = fyuVar19.jz();
                        Object obj26 = fyuVar19.cg;
                        if (obj26 instanceof dxjf) {
                            synchronized (obj26) {
                                obj10 = fyuVar19.cg;
                                if (obj10 instanceof dxjf) {
                                    ckcw rU7 = fyuVar19.a.rU();
                                    dxjg.e(rU7);
                                    anlz anlzVar = new anlz(rU7, anln.b());
                                    dxjc.d(fyuVar19.cg, anlzVar);
                                    fyuVar19.cg = anlzVar;
                                    obj10 = anlzVar;
                                }
                            }
                            obj26 = obj10;
                        }
                        anmz anmzVar = new anmz(anlqVar, jz, (anlz) obj26);
                        dxjc.d(fyuVar19.ch, anmzVar);
                        fyuVar19.ch = anmzVar;
                        obj9 = anmzVar;
                    }
                }
                return (T) obj9;
            case 471:
                return (T) anln.b();
            case 472:
                return (T) this.a.jD();
            case 473:
                return (T) this.a.jF();
            case 474:
                return (T) this.a.fs();
            case 475:
                fyu fyuVar20 = this.a;
                Object obj27 = fyuVar20.ck;
                if (obj27 instanceof dxjf) {
                    synchronized (obj27) {
                        obj12 = fyuVar20.ck;
                        if (obj12 instanceof dxjf) {
                            bvjj rB8 = fyuVar20.a.rB();
                            dxjg.e(rB8);
                            obj12 = new aohw(rB8);
                            dxjc.d(fyuVar20.ck, obj12);
                            fyuVar20.ck = obj12;
                        }
                    }
                    obj27 = obj12;
                }
                return (T) ((aohw) obj27);
            case 476:
                btvo rp8 = this.a.a.rp();
                dxjg.e(rp8);
                return (T) Boolean.valueOf(rp8.getMapsActivitiesParameters().i);
            case 477:
                fyu fyuVar21 = this.a;
                btvo rp9 = fyuVar21.a.rp();
                dxjg.e(rp9);
                fyuVar21.fv();
                String str = rp9.getMapsActivitiesParameters().j;
                return str.isEmpty() ? (T) dbpy.a : (T) dbsg.i(Uri.parse(str));
            case 478:
                return (T) this.a.ql();
            case 479:
                fyu fyuVar22 = this.a;
                Object obj28 = fyuVar22.cp;
                if (obj28 instanceof dxjf) {
                    synchronized (obj28) {
                        obj13 = fyuVar22.cp;
                        if (obj13 instanceof dxjf) {
                            final Application a5 = fyuVar22.a.a();
                            dxjg.e(a5);
                            final dzsj<dlh> jQ = fyuVar22.jQ();
                            final Executor sV4 = fyuVar22.a.sV();
                            dxjg.e(sV4);
                            final dxio c14 = dxjc.c(fyuVar22.p());
                            Object obj29 = fyuVar22.co;
                            if (obj29 instanceof dxjf) {
                                synchronized (obj29) {
                                    obj14 = fyuVar22.co;
                                    if (obj14 instanceof dxjf) {
                                        ckmm r = fyuVar22.a.r();
                                        dxjg.e(r);
                                        dflb dflbVar = new dflb(r.a());
                                        dxjc.d(fyuVar22.co, dflbVar);
                                        fyuVar22.co = dflbVar;
                                        obj14 = dflbVar;
                                    }
                                }
                                obj29 = obj14;
                            }
                            final dflc dflcVar = (dflc) obj29;
                            final dts jN = fyuVar22.jN();
                            final btvo rp10 = fyuVar22.a.rp();
                            dxjg.e(rp10);
                            obj13 = new dbo(c14, a5, dflcVar, jN, rp10, jQ, sV4) { // from class: dbv
                                private final dxio a;
                                private final Application b;
                                private final dflc c;
                                private final czw d;
                                private final btvo e;
                                private final dzsj f;
                                private final Executor g;

                                {
                                    this.a = c14;
                                    this.b = a5;
                                    this.c = dflcVar;
                                    this.d = jN;
                                    this.e = rp10;
                                    this.f = jQ;
                                    this.g = sV4;
                                }

                                @Override // defpackage.dbo
                                public final dflf a(czh czhVar) {
                                    Config.PlaneFindingMode planeFindingMode;
                                    dxio dxioVar = this.a;
                                    Application application = this.b;
                                    dflc dflcVar2 = this.c;
                                    final czw czwVar = this.d;
                                    btvo btvoVar = this.e;
                                    dzsj dzsjVar7 = this.f;
                                    Executor executor = this.g;
                                    dflw a6 = dni.a(((akfa) dxioVar.a()).j(), true);
                                    dcdg c15 = dcdn.p().c(dcmn.a);
                                    int ordinal = czhVar.ordinal();
                                    c15.f("geoar_experience", ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "EXPERIENCE_CALIBRATOR_ARLO" : "EXPERIENCE_PLACE_DISCOVERY_ARLO" : "EXPERIENCE_LIGHTHOUSE_ARLO" : "EXPERIENCE_ARWN_ARLO");
                                    dte dteVar = czwVar.a().b;
                                    if (dteVar == null) {
                                        dteVar = dte.w;
                                    }
                                    String str2 = dteVar.s;
                                    if (!str2.isEmpty()) {
                                        c15.f("dataset_path", str2);
                                    }
                                    if (dcb.a(czhVar, czwVar, btvoVar)) {
                                        c15.f("enable_terrain_tracking", "true");
                                    }
                                    if (czhVar == czh.LIGHTHOUSE) {
                                        czwVar.getClass();
                                        new dbty(czwVar) { // from class: dbx
                                            private final czw a;

                                            {
                                                this.a = czwVar;
                                            }

                                            @Override // defpackage.dbty
                                            public final Object a() {
                                                return this.a.a();
                                            }
                                        };
                                    }
                                    dflh dflhVar = new dflh(application, dflcVar2, c15.b(), dbsg.i(((dlh) dzsjVar7.a()).a(dflcVar2, executor)));
                                    int ordinal2 = czhVar.ordinal();
                                    if (ordinal2 == 0) {
                                        planeFindingMode = Config.PlaneFindingMode.DISABLED;
                                    } else if (ordinal2 == 1) {
                                        planeFindingMode = Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL;
                                    } else if (ordinal2 == 2 || ordinal2 == 3) {
                                        planeFindingMode = Config.PlaneFindingMode.DISABLED;
                                    } else {
                                        String valueOf = String.valueOf(czhVar.name());
                                        throw new IllegalArgumentException(valueOf.length() != 0 ? "PlaneFindingMode has not been configured for ".concat(valueOf) : new String("PlaneFindingMode has not been configured for "));
                                    }
                                    dflhVar.j(planeFindingMode);
                                    dflhVar.h(a6);
                                    return dflhVar;
                                }
                            };
                            dxjc.d(fyuVar22.cp, obj13);
                            fyuVar22.cp = obj13;
                        }
                    }
                    obj28 = obj13;
                }
                return (T) ((dbo) obj28);
            case 480:
                fyu fyuVar23 = this.a;
                Object obj30 = fyuVar23.cn;
                if (obj30 instanceof dxjf) {
                    synchronized (obj30) {
                        obj15 = fyuVar23.cn;
                        if (obj15 instanceof dxjf) {
                            dbsg i3 = dbsg.i(fyuVar23.jP());
                            Executor sV5 = fyuVar23.a.sV();
                            dxjg.e(sV5);
                            obj15 = new dlh(i3, sV5);
                            dxjc.d(fyuVar23.cn, obj15);
                            fyuVar23.cn = obj15;
                        }
                    }
                    obj30 = obj15;
                }
                return (T) ((dlh) obj30);
            case 481:
                return (T) this.a.jR();
            case 482:
                return (T) this.a.jT();
            case 483:
                fyu fyuVar24 = this.a;
                Object obj31 = fyuVar24.ct;
                if (obj31 instanceof dxjf) {
                    synchronized (obj31) {
                        obj16 = fyuVar24.ct;
                        if (obj16 instanceof dxjf) {
                            final Application a6 = fyuVar24.a.a();
                            dxjg.e(a6);
                            final Executor sU2 = fyuVar24.a.sU();
                            dxjg.e(sU2);
                            Object obj32 = fyuVar24.cs;
                            if (obj32 instanceof dxjf) {
                                synchronized (obj32) {
                                    obj17 = fyuVar24.cs;
                                    if (obj17 instanceof dxjf) {
                                        dzsj dzsjVar7 = fyuVar24.cr;
                                        if (dzsjVar7 == null) {
                                            dzsjVar7 = new fxy(fyuVar24, 484);
                                            fyuVar24.cr = dzsjVar7;
                                        }
                                        obj17 = dbsg.i((dfeg) dzsjVar7.a());
                                        dxjc.d(fyuVar24.cs, obj17);
                                        fyuVar24.cs = obj17;
                                    }
                                }
                                obj32 = obj17;
                            }
                            final dbsg dbsgVar = (dbsg) obj32;
                            final dts jN2 = fyuVar24.jN();
                            final btvo rp11 = fyuVar24.a.rp();
                            dxjg.e(rp11);
                            obj16 = new dbm(a6, dbsgVar, sU2, jN2, rp11) { // from class: dbw
                                private final Application a;
                                private final dbsg b;
                                private final Executor c;
                                private final czw d;
                                private final btvo e;

                                {
                                    this.a = a6;
                                    this.b = dbsgVar;
                                    this.c = sU2;
                                    this.d = jN2;
                                    this.e = rp11;
                                }

                                @Override // defpackage.dbm
                                public final dfei a(czh czhVar, dfkm dfkmVar, Session session, dbi dbiVar) {
                                    dbsg dbsgVar2;
                                    dknu dknuVar;
                                    Application application = this.a;
                                    dbsg dbsgVar3 = this.b;
                                    Executor executor = this.c;
                                    final czw czwVar = this.d;
                                    btvo btvoVar = this.e;
                                    Resources resources = application.getResources();
                                    dfia bZ = dfir.f.bZ();
                                    if (!czwVar.a().f) {
                                        int ordinal = czhVar.ordinal();
                                        if (ordinal == 0) {
                                            dhlz dhlzVar = btvoVar.getNavigationParametersProto().aJ;
                                            if (dhlzVar == null) {
                                                dhlzVar = dhlz.n;
                                            }
                                            if ((dhlzVar.a & 2048) != 0) {
                                                dirl dirlVar = dhlzVar.k;
                                                if (dirlVar == null) {
                                                    dirlVar = dirl.h;
                                                }
                                                dbsgVar2 = dbsg.i(dirlVar);
                                            } else {
                                                dbsgVar2 = dbpy.a;
                                            }
                                        } else if (ordinal != 1) {
                                            if (ordinal != 2) {
                                                if (ordinal != 3) {
                                                    dbsgVar2 = dbpy.a;
                                                } else {
                                                    dkhv dkhvVar = btvoVar.getAugmentedRealityParameters().b;
                                                    if (dkhvVar == null) {
                                                        dkhvVar = dkhv.g;
                                                    }
                                                    if ((dkhvVar.a & 4) != 0) {
                                                        dirl dirlVar2 = dkhvVar.d;
                                                        if (dirlVar2 == null) {
                                                            dirlVar2 = dirl.h;
                                                        }
                                                        dbsgVar2 = dbsg.i(dirlVar2);
                                                    }
                                                }
                                            }
                                            dbsgVar2 = dbpy.a;
                                        } else {
                                            dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
                                            if (dknvVar == null) {
                                                dknvVar = dknv.v;
                                            }
                                            if ((dknvVar.a & 8192) != 0) {
                                                dirl dirlVar3 = dknvVar.l;
                                                if (dirlVar3 == null) {
                                                    dirlVar3 = dirl.h;
                                                }
                                                dbsgVar2 = dbsg.i(dirlVar3);
                                            } else {
                                                dbsgVar2 = dbpy.a;
                                            }
                                        }
                                        if (dbsgVar2.a()) {
                                            dfie NV = dcb.a.NV((dirl) dbsgVar2.b());
                                            if (bZ.c) {
                                                bZ.bF();
                                                bZ.c = false;
                                            }
                                            dfir dfirVar = (dfir) bZ.b;
                                            NV.getClass();
                                            dfirVar.b = NV;
                                            dfirVar.a |= 2;
                                        }
                                    } else {
                                        dfid bZ2 = dfie.h.bZ();
                                        if (bZ2.c) {
                                            bZ2.bF();
                                            bZ2.c = false;
                                        }
                                        dfie dfieVar = (dfie) bZ2.b;
                                        int i4 = dfieVar.a | 1;
                                        dfieVar.a = i4;
                                        dfieVar.b = 1000.0f;
                                        int i5 = i4 | 4;
                                        dfieVar.a = i5;
                                        dfieVar.d = 1000.0f;
                                        int i6 = i5 | 2;
                                        dfieVar.a = i6;
                                        dfieVar.c = 180.0f;
                                        dfieVar.a = i6 | 8;
                                        dfieVar.e = 180.0f;
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        dfir dfirVar2 = (dfir) bZ.b;
                                        dfie bK = bZ2.bK();
                                        bK.getClass();
                                        dfirVar2.b = bK;
                                        dfirVar2.a |= 2;
                                    }
                                    if (dcb.a(czhVar, czwVar, btvoVar)) {
                                        dfib bZ3 = dfic.c.bZ();
                                        if (bZ3.c) {
                                            bZ3.bF();
                                            bZ3.c = false;
                                        }
                                        dfic dficVar = (dfic) bZ3.b;
                                        dficVar.a |= 1;
                                        dficVar.b = true;
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        dfir dfirVar3 = (dfir) bZ.b;
                                        dfic bK2 = bZ3.bK();
                                        bK2.getClass();
                                        dfirVar3.c = bK2;
                                        dfirVar3.a |= 16;
                                    }
                                    dfij bZ4 = dfiq.f.bZ();
                                    dfim bZ5 = dfin.j.bZ();
                                    float dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_far_marker_size);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar = (dfin) bZ5.b;
                                    dfinVar.a |= 1;
                                    dfinVar.b = dimensionPixelSize;
                                    float dimensionPixelSize2 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_far_marker_size);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar2 = (dfin) bZ5.b;
                                    dfinVar2.a |= 2;
                                    dfinVar2.c = dimensionPixelSize2;
                                    float dimensionPixelSize3 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_far_marker_ripple_min_size);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar3 = (dfin) bZ5.b;
                                    dfinVar3.a |= 4;
                                    dfinVar3.d = dimensionPixelSize3;
                                    float dimensionPixelSize4 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_far_marker_ripple_max_size);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar4 = (dfin) bZ5.b;
                                    dfinVar4.a |= 8;
                                    dfinVar4.e = dimensionPixelSize4;
                                    float dimensionPixelSize5 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_far_marker_label_margin_bottom);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar5 = (dfin) bZ5.b;
                                    dfinVar5.a |= 16;
                                    dfinVar5.f = dimensionPixelSize5;
                                    float dimensionPixelSize6 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_far_marker_icon_size);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar6 = (dfin) bZ5.b;
                                    dfinVar6.a |= 32;
                                    dfinVar6.g = dimensionPixelSize6;
                                    float dimensionPixelSize7 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_far_marker_icon_size);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar7 = (dfin) bZ5.b;
                                    dfinVar7.a |= 64;
                                    dfinVar7.h = dimensionPixelSize7;
                                    float dimensionPixelSize8 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_primary_near_marker_label_margin_bottom);
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dfin dfinVar8 = (dfin) bZ5.b;
                                    dfinVar8.a |= 128;
                                    dfinVar8.i = dimensionPixelSize8;
                                    if (bZ4.c) {
                                        bZ4.bF();
                                        bZ4.c = false;
                                    }
                                    dfiq dfiqVar = (dfiq) bZ4.b;
                                    dfin bK3 = bZ5.bK();
                                    bK3.getClass();
                                    dfiqVar.c = bK3;
                                    dfiqVar.a |= 4;
                                    dfio bZ6 = dfip.i.bZ();
                                    float dimensionPixelSize9 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_secondary_marker_size);
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    dfip dfipVar = (dfip) bZ6.b;
                                    dfipVar.a |= 1;
                                    dfipVar.b = dimensionPixelSize9;
                                    float dimensionPixelSize10 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_secondary_marker_size);
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    dfip dfipVar2 = (dfip) bZ6.b;
                                    dfipVar2.a |= 2;
                                    dfipVar2.c = dimensionPixelSize10;
                                    float dimensionPixelSize11 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_secondary_marker_label_margin_bottom);
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    dfip dfipVar3 = (dfip) bZ6.b;
                                    dfipVar3.a |= 4;
                                    dfipVar3.d = dimensionPixelSize11;
                                    float dimensionPixelSize12 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_secondary_stem_width);
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    dfip dfipVar4 = (dfip) bZ6.b;
                                    int i7 = dfipVar4.a | 8;
                                    dfipVar4.a = i7;
                                    dfipVar4.e = dimensionPixelSize12;
                                    dfipVar4.a = i7 | 16;
                                    dfipVar4.f = true;
                                    float dimensionPixelSize13 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_secondary_marker_hovered_icon_size);
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    dfip dfipVar5 = (dfip) bZ6.b;
                                    dfipVar5.a |= 32;
                                    dfipVar5.g = dimensionPixelSize13;
                                    float dimensionPixelSize14 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.lighthouse_secondary_marker_hovered_icon_size);
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    dfip dfipVar6 = (dfip) bZ6.b;
                                    dfipVar6.a |= 64;
                                    dfipVar6.h = dimensionPixelSize14;
                                    if (bZ4.c) {
                                        bZ4.bF();
                                        bZ4.c = false;
                                    }
                                    dfiq dfiqVar2 = (dfiq) bZ4.b;
                                    dfip bK4 = bZ6.bK();
                                    bK4.getClass();
                                    dfiqVar2.d = bK4;
                                    dfiqVar2.a |= 8;
                                    dfik bZ7 = dfil.f.bZ();
                                    float dimensionPixelSize15 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.level_change_point_marker_size);
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dfil dfilVar = (dfil) bZ7.b;
                                    dfilVar.a |= 1;
                                    dfilVar.b = dimensionPixelSize15;
                                    float dimensionPixelSize16 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.level_change_point_marker_size);
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dfil dfilVar2 = (dfil) bZ7.b;
                                    dfilVar2.a |= 2;
                                    dfilVar2.c = dimensionPixelSize16;
                                    float dimensionPixelSize17 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.level_change_point_marker_label_margin_bottom);
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dfil dfilVar3 = (dfil) bZ7.b;
                                    dfilVar3.a |= 4;
                                    dfilVar3.d = dimensionPixelSize17;
                                    float dimensionPixelSize18 = resources.getDimensionPixelSize(com.google.android.apps.maps.R.dimen.level_change_point_marker_ripple_size);
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dfil dfilVar4 = (dfil) bZ7.b;
                                    dfilVar4.a |= 8;
                                    dfilVar4.e = dimensionPixelSize18;
                                    if (bZ4.c) {
                                        bZ4.bF();
                                        bZ4.c = false;
                                    }
                                    dfiq dfiqVar3 = (dfiq) bZ4.b;
                                    dfil bK5 = bZ7.bK();
                                    bK5.getClass();
                                    dfiqVar3.e = bK5;
                                    dfiqVar3.a |= 16;
                                    czwVar.getClass();
                                    if (dph.c(btvoVar, new dbty(czwVar) { // from class: dby
                                        private final czw a;

                                        {
                                            this.a = czwVar;
                                        }

                                        @Override // defpackage.dbty
                                        public final Object a() {
                                            return this.a.a();
                                        }
                                    })) {
                                        if (bZ4.c) {
                                            bZ4.bF();
                                            bZ4.c = false;
                                        }
                                        dfiq dfiqVar4 = (dfiq) bZ4.b;
                                        dfiqVar4.a |= 1;
                                        dfiqVar4.b = true;
                                    }
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dfir dfirVar4 = (dfir) bZ.b;
                                    dfiq bK6 = bZ4.bK();
                                    bK6.getClass();
                                    dfirVar4.d = bK6;
                                    dfirVar4.a |= 32;
                                    dte dteVar = czwVar.a().b;
                                    if (dteVar == null) {
                                        dteVar = dte.w;
                                    }
                                    dknv dknvVar2 = btvoVar.getAugmentedRealityParameters().a;
                                    if (dknvVar2 == null) {
                                        dknvVar2 = dknv.v;
                                    }
                                    if ((dteVar.a & 1024) != 0 ? dteVar.l : dknvVar2.f) {
                                        if (dteVar.l) {
                                            dknuVar = dteVar.m;
                                            if (dknuVar == null) {
                                                dknuVar = dknu.f;
                                            }
                                        } else {
                                            dknuVar = dknvVar2.g;
                                            if (dknuVar == null) {
                                                dknuVar = dknu.f;
                                            }
                                        }
                                        dfii dfiiVar = ((dfir) bZ.b).e;
                                        if (dfiiVar == null) {
                                            dfiiVar = dfii.d;
                                        }
                                        dsqp dsqpVar = (dsqp) dfiiVar.cu(5);
                                        dsqpVar.bC(dfiiVar);
                                        dfif dfifVar = (dfif) dsqpVar;
                                        if (dfifVar.c) {
                                            dfifVar.bF();
                                            dfifVar.c = false;
                                        }
                                        dfii dfiiVar2 = (dfii) dfifVar.b;
                                        dfiiVar2.a |= 1;
                                        dfiiVar2.b = true;
                                        dfih NV2 = dcb.b.NV(dknuVar);
                                        if (dfifVar.c) {
                                            dfifVar.bF();
                                            dfifVar.c = false;
                                        }
                                        dfii dfiiVar3 = (dfii) dfifVar.b;
                                        NV2.getClass();
                                        dfiiVar3.c = NV2;
                                        dfiiVar3.a |= 2;
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        dfir dfirVar5 = (dfir) bZ.b;
                                        dfii bK7 = dfifVar.bK();
                                        bK7.getClass();
                                        dfirVar5.e = bK7;
                                        dfirVar5.a |= 128;
                                    }
                                    return new dfjx(application, dfkmVar, dbsgVar3.h(dfjl.a), ArCoreNativeInterop.getNativeHandle(session), executor, bZ.bK(), dbsg.i(dbiVar), new ArloSessionJniImpl(), new dfez(executor, true));
                                }
                            };
                            dxjc.d(fyuVar24.ct, obj16);
                            fyuVar24.ct = obj16;
                        }
                    }
                    obj31 = obj16;
                }
                return (T) ((dbm) obj31);
            case 484:
                fyu fyuVar25 = this.a;
                T t19 = (T) fyuVar25.cq;
                if (!(t19 instanceof dxjf)) {
                    return t19;
                }
                synchronized (t19) {
                    obj18 = fyuVar25.cq;
                    if (obj18 instanceof dxjf) {
                        Application a7 = fyuVar25.a.a();
                        dxjg.e(a7);
                        cvin ab = fyuVar25.ab();
                        ckcw rU8 = fyuVar25.a.rU();
                        dxjg.e(rU8);
                        dehp tl = fyuVar25.a.tl();
                        dxjg.e(tl);
                        dau dauVar = new dau(a7, ab, rU8, tl);
                        dxjc.d(fyuVar25.cq, dauVar);
                        fyuVar25.cq = dauVar;
                        obj18 = dauVar;
                    }
                }
                return (T) obj18;
            case 485:
                return (T) this.a.jU();
            case 486:
                fyu fyuVar26 = this.a;
                dzsj dzsjVar8 = fyuVar26.cu;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fxy(fyuVar26, 487);
                    fyuVar26.cu = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj<cjqy> al = fyuVar26.al();
                dzsj<dkh> jX = fyuVar26.jX();
                dzsj<dkn> jZ = fyuVar26.jZ();
                dzsj<dol> jS = fyuVar26.jS();
                dzsj<der> ka = fyuVar26.ka();
                dzsj<djs> kc = fyuVar26.kc();
                dzsj<dkf> kd = fyuVar26.kd();
                dzsj dzsjVar10 = fyuVar26.cz;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fxy(fyuVar26, 496);
                    fyuVar26.cz = dzsjVar10;
                }
                return (T) new dci(dzsjVar9, al, jX, jZ, jS, ka, kc, kd, dzsjVar10);
            case 487:
                return (T) this.a.jV();
            case 488:
                return (T) this.a.jW();
            case 489:
                return (T) this.a.jY();
            case 490:
                return (T) new der(this.a.hN());
            case 491:
                fyu fyuVar27 = this.a;
                dzsj<dehq> kb = fyuVar27.kb();
                dzsj<btvo> V = fyuVar27.V();
                dzsj<cjqq> hN = fyuVar27.hN();
                dzsj dzsjVar11 = fyuVar27.cw;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fxy(fyuVar27, 493);
                    fyuVar27.cw = dzsjVar11;
                }
                return (T) new djs(kb, V, hN, dzsjVar11);
            case 492:
                T t20 = (T) this.a.a.tf();
                dxjg.e(t20);
                return t20;
            case 493:
                fyu fyuVar28 = this.a;
                dzsj<cjqy> al2 = fyuVar28.al();
                dzsj dzsjVar12 = fyuVar28.cv;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fxy(fyuVar28, 494);
                    fyuVar28.cv = dzsjVar12;
                }
                return (T) new dju(al2, dzsjVar12);
            case 494:
                return (T) this.a.jO();
            case 495:
                return (T) new dkf();
            case 496:
                fyu fyuVar29 = this.a;
                dzsj dzsjVar13 = fyuVar29.cy;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fxy(fyuVar29, 497);
                    fyuVar29.cy = dzsjVar13;
                }
                return (T) new dbh(dzsjVar13);
            case 497:
                fyu fyuVar30 = this.a;
                dzsj<dts> ke = fyuVar30.ke();
                dzsj dzsjVar14 = fyuVar30.cx;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fxy(fyuVar30, 499);
                    fyuVar30.cx = dzsjVar14;
                }
                return (T) new day(ke, dzsjVar14, fyuVar30.kh());
            case 498:
                return (T) this.a.jN();
            case 499:
                fyu fyuVar31 = this.a;
                return (T) new dbd(fyuVar31.K(), fyuVar31.kf());
            default:
                throw new AssertionError(i);
        }
    }
}
