package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: brab  reason: default package */
/* loaded from: classes4.dex */
public final class brab extends itb implements brba {
    public static final /* synthetic */ int d = 0;
    private final btrm A;
    private final bvrb B;
    private final broq C;
    private final bvsf D;
    private final brbr E;
    private final dxio<gll> F;
    private final dxio<avik> G;
    private final dxio<pra> H;
    private final dxio<bwjz> I;
    private final dxio<qbt> J;
    private final dxio<begg> K;
    private final dxio<bzmm> L;
    private final eeu M;
    private final dxio<ckcw> N;
    private final dxio<afwr> O;
    private final dxio<ixr> P;
    private final iqq Q;
    private final bxtx R;
    private final dzsj<bzlr> S;
    private final dzsj<bzlq> T;
    private final cjnx U;
    private final dxio<brcg> V;
    private final brdi W;
    private final brcs X;
    private final afec Y;
    private final dxio<btpc> Z;
    private final dxio<acyp> aa;
    private final brmt ab;
    private final brcc ac;
    private final brpm ad;
    private final bsqi ae;
    private final bsqg af;
    private final bsqf ag;
    private final cxb ah;
    private final cvn ai;
    @dzsi
    public volatile dhjx b;
    public final gga c;
    private doed f;
    private List<Integer> h;
    private final cqkj j;
    private final cjqy k;
    private final cjqq o;
    private final brat p;
    private final akox q;
    private final cqat r;
    private final bvsl s;
    private final btvo t;
    private final anhk u;
    private final bwqv v;
    private final gfq w;
    private final ahjq x;
    private final aehr y;
    private final aeht z;
    private static final dcqe e = dcqe.c("brab");
    static final Pattern a = Pattern.compile("^\\s*ok(?:ay)?\\s*maps?\\s*$", 2);
    private final akzy g = new bqzy(this);
    @dzsi
    private ggg i = null;

    public brab(gga ggaVar, eeu eeuVar, cqkj cqkjVar, cjqy cjqyVar, cjqq cjqqVar, btvo btvoVar, brat bratVar, bwqv bwqvVar, gfq gfqVar, ahjq ahjqVar, bvsl bvslVar, aehr aehrVar, aeht aehtVar, btrm btrmVar, bvrb bvrbVar, cqat cqatVar, anhk anhkVar, akox akoxVar, broq broqVar, bvsf bvsfVar, brbr brbrVar, dxio<gll> dxioVar, dxio<pra> dxioVar2, dxio<qbt> dxioVar3, dxio<avik> dxioVar4, dxio<bwjz> dxioVar5, dxio<begg> dxioVar6, dxio<bzmm> dxioVar7, dxio<ckcw> dxioVar8, dxio<afwr> dxioVar9, dxio<ixr> dxioVar10, iqq iqqVar, bxtx bxtxVar, dzsj<bzlr> dzsjVar, dzsj<bzlq> dzsjVar2, cjnx cjnxVar, dxio<brcg> dxioVar11, brdi brdiVar, brcs brcsVar, afec afecVar, cxb cxbVar, cvn cvnVar, dxio<btpc> dxioVar12, dxio<acyp> dxioVar13, brmt brmtVar, brcc brccVar, brpm brpmVar, bsqi bsqiVar, bsqg bsqgVar, bsqf bsqfVar) {
        this.c = ggaVar;
        this.M = eeuVar;
        this.j = cqkjVar;
        this.q = akoxVar;
        this.k = cjqyVar;
        this.o = cjqqVar;
        this.t = btvoVar;
        this.F = dxioVar;
        this.v = bwqvVar;
        this.w = gfqVar;
        this.x = ahjqVar;
        this.s = bvslVar;
        this.y = aehrVar;
        this.z = aehtVar;
        this.A = btrmVar;
        this.B = bvrbVar;
        this.r = cqatVar;
        this.C = broqVar;
        this.D = bvsfVar;
        this.E = brbrVar;
        this.H = dxioVar2;
        this.J = dxioVar3;
        this.G = dxioVar4;
        this.I = dxioVar5;
        this.K = dxioVar6;
        this.L = dxioVar7;
        this.u = anhkVar;
        this.N = dxioVar8;
        this.O = dxioVar9;
        this.P = dxioVar10;
        this.Q = iqqVar;
        this.R = bxtxVar;
        this.S = dzsjVar;
        this.T = dzsjVar2;
        this.U = cjnxVar;
        this.V = dxioVar11;
        this.W = brdiVar;
        this.X = brcsVar;
        this.p = bratVar;
        this.Y = afecVar;
        this.ah = cxbVar;
        this.ai = cvnVar;
        this.Z = dxioVar12;
        this.aa = dxioVar13;
        this.ab = brmtVar;
        this.ac = brccVar;
        this.ad = brpmVar;
        this.ae = bsqiVar;
        this.af = bsqgVar;
        this.ag = bsqfVar;
    }

    static void P(dxbp dxbpVar, @dzsi iqy iqyVar) {
        if ((dxbpVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            int i = dxbpVar.m;
            if (i == 0) {
                iqyVar.e = dndr.HOME;
            } else if (i == 1) {
                iqyVar.e = dndr.WORK;
            } else if (i == 2) {
                iqyVar.e = dndr.CONTACT;
                if ((dxbpVar.a & ImageMetadata.SHADING_MODE) != 0) {
                    iqyVar.c = Long.valueOf(dxbpVar.n);
                }
            }
        }
        int a2 = dxbi.a(dxbpVar.f);
        if (a2 != 0 && a2 == 3) {
            iqyVar.p = 2;
        } else {
            iqyVar.p = 3;
        }
    }

    private static dwfv R(Resources resources) {
        int i = (int) (resources.getDisplayMetrics().density * 160.0f);
        dwfs bZ = dwfv.m.bZ();
        dwev bZ2 = dwew.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwew dwewVar = (dwew) bZ2.b;
        dwewVar.a |= 1;
        dwewVar.c = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ.b;
        dwew bK = bZ2.bK();
        bK.getClass();
        dwfvVar.b = bK;
        dwfvVar.a |= 1;
        dwdu bZ3 = dwdv.a.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwdv.c((dwdv) bZ3.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar2 = (dwfv) bZ.b;
        dwdv bK2 = bZ3.bK();
        bK2.getClass();
        dwfvVar2.e = bK2;
        dwfvVar2.a |= 16;
        dwei bZ4 = dwej.b.bZ();
        dweg bZ5 = dweh.d.bZ();
        dwee bZ6 = dwef.c.bZ();
        dweb dwebVar = dweb.MENU;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwef dwefVar = (dwef) bZ6.b;
        dwefVar.b = dwebVar.i;
        dwefVar.a |= 1;
        bZ5.a(bZ6);
        dhkc bZ7 = dhkd.d.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ7.b;
        int i2 = dhkdVar.a | 1;
        dhkdVar.a = i2;
        dhkdVar.b = i;
        dhkdVar.a = i2 | 2;
        dhkdVar.c = i;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dweh dwehVar = (dweh) bZ5.b;
        dhkd bK3 = bZ7.bK();
        bK3.getClass();
        dwehVar.c = bK3;
        dwehVar.a |= 1;
        bZ4.a(bZ5);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar3 = (dwfv) bZ.b;
        dwej bK4 = bZ4.bK();
        bK4.getClass();
        dwfvVar3.f = bK4;
        dwfvVar3.a |= 32;
        return bZ.bK();
    }

    private final djna S() {
        djmz bZ = djna.b.bZ();
        djnz bZ2 = djoa.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djoa djoaVar = (djoa) bZ2.b;
        djoaVar.a |= 1;
        djoaVar.b = 5;
        bZ.b(bZ2.bK());
        djnz bZ3 = djoa.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djoa djoaVar2 = (djoa) bZ3.b;
        djoaVar2.a |= 1;
        djoaVar2.b = 1;
        bZ.b(bZ3.bK());
        if (!H()) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djna.c((djna) bZ.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djna.d((djna) bZ.b);
            djnz bZ4 = djoa.c.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djoa djoaVar3 = (djoa) bZ4.b;
            djoaVar3.a |= 1;
            djoaVar3.b = 17;
            bZ.b(bZ4.bK());
            djnz bZ5 = djoa.c.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djoa djoaVar4 = (djoa) bZ5.b;
            djoaVar4.a |= 1;
            djoaVar4.b = 7;
            bZ.b(bZ5.bK());
            djnz bZ6 = djoa.c.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            djoa djoaVar5 = (djoa) bZ6.b;
            djoaVar5.a |= 1;
            djoaVar5.b = 20;
            bZ.b(bZ6.bK());
            djnz bZ7 = djoa.c.bZ();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            djoa djoaVar6 = (djoa) bZ7.b;
            djoaVar6.a |= 1;
            djoaVar6.b = 10;
            bZ.b(bZ7.bK());
            djnz bZ8 = djoa.c.bZ();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            djoa djoaVar7 = (djoa) bZ8.b;
            djoaVar7.a |= 1;
            djoaVar7.b = 31;
            bZ.b(bZ8.bK());
            if (this.t.getCategoricalSearchParameters().b()) {
                djnz bZ9 = djoa.c.bZ();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                djoa djoaVar8 = (djoa) bZ9.b;
                djoaVar8.a |= 1;
                djoaVar8.b = 18;
                bZ.b(bZ9.bK());
            }
            if (this.X.a()) {
                djnz bZ10 = djoa.c.bZ();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                djoa djoaVar9 = (djoa) bZ10.b;
                djoaVar9.a |= 1;
                djoaVar9.b = 25;
                bZ.b(bZ10.bK());
            }
        }
        return bZ.bK();
    }

    private final dnyw T() {
        dnyt bZ = dnyw.c.bZ();
        if (this.t.getCategoricalSearchParameters().k()) {
            dnyw dnywVar = this.t.getCategoricalSearchParameters().l().a;
            if (dnywVar == null) {
                dnywVar = dnyw.c;
            }
            bZ.bC(dnywVar);
        } else {
            dnyu bZ2 = dnyv.c.bZ();
            dnwv dnwvVar = dnwv.RESTAURANT_RESERVATION;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnyv dnyvVar = (dnyv) bZ2.b;
            dnyvVar.b = dnwvVar.s;
            dnyvVar.a |= 1;
            dnyv.b(dnyvVar);
            bZ.a(bZ2.bK());
            dnyu bZ3 = dnyv.c.bZ();
            dnwv dnwvVar2 = dnwv.APPOINTMENT;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnyv dnyvVar2 = (dnyv) bZ3.b;
            dnyvVar2.b = dnwvVar2.s;
            dnyvVar2.a |= 1;
            dnyv.b(dnyvVar2);
            bZ.a(bZ3.bK());
            dnyu bZ4 = dnyv.c.bZ();
            dnwv dnwvVar3 = dnwv.ORDER_FOOD;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dnyv dnyvVar3 = (dnyv) bZ4.b;
            dnyvVar3.b = dnwvVar3.s;
            dnyvVar3.a |= 1;
            dnyv.b(dnyvVar3);
            bZ.a(bZ4.bK());
            dnyu bZ5 = dnyv.c.bZ();
            dnwv dnwvVar4 = dnwv.WAITLIST;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnyv dnyvVar4 = (dnyv) bZ5.b;
            dnyvVar4.b = dnwvVar4.s;
            dnyvVar4.a |= 1;
            dnyv.b(dnyvVar4);
            bZ.a(bZ5.bK());
            dnyu bZ6 = dnyv.c.bZ();
            dnwv dnwvVar5 = dnwv.SEE_HOTEL_PRICING;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnyv dnyvVar5 = (dnyv) bZ6.b;
            dnyvVar5.b = dnwvVar5.s;
            dnyvVar5.a |= 1;
            dnyv.b(dnyvVar5);
            bZ.a(bZ6.bK());
        }
        dcdc<dnwv> z = dcbg.b(this.t.getCategoricalSearchParameters().c()).m(this.t.getCategoricalSearchParameters().d()).s(bqzw.a).o(bqzx.a).z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnyw dnywVar2 = (dnyw) bZ.b;
        dnywVar2.b();
        for (dnwv dnwvVar6 : z) {
            dnywVar2.a.h(dnwvVar6.s);
        }
        return bZ.bK();
    }

    private final void U(dwir dwirVar, @dzsi iqy iqyVar, @dzsi brlm brlmVar) {
        ac(dwirVar, iqyVar, brlmVar, 1);
    }

    private final void V(boolean z) {
        ckgu ckguVar;
        if (z) {
            ckguVar = ckjw.i;
        } else {
            ckguVar = ckjw.h;
        }
        ((ckcn) this.N.a().a(ckguVar)).a();
    }

    private final void W(bram bramVar, bwrs<brlu> bwrsVar) {
        ddda dddaVar;
        brlu c = bwrsVar.c();
        int aF = c == null ? 0 : c.aF();
        if (aF == 0) {
            dddaVar = ddda.fj;
        } else {
            dowa dowaVar = dowa.KILOMETERS;
            int i = aF - 1;
            if (i != 0) {
                if (i == 1) {
                    dddaVar = ddda.fg;
                } else if (i != 3) {
                    if (i == 4) {
                        dddaVar = ddda.ff;
                    } else if (i == 6) {
                        dddaVar = ddda.fk;
                    } else {
                        dddaVar = ddda.fl;
                    }
                }
            }
            dddaVar = ddda.fj;
        }
        cjqy cjqyVar = this.k;
        cjsx i2 = cjsy.i();
        i2.b(dddaVar);
        cjqyVar.k(i2.a());
        bwqv bwqvVar = this.v;
        bwrs<brln> a2 = bramVar.a();
        cjqk d2 = bramVar.d();
        bqzm bqzmVar = new bqzm();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "SearchListFragment.searchRequestRef", a2);
        bwqvVar.c(bundle, "SearchListFragment.searchResultRef", bwrsVar);
        bundle.putString("SearchListFragment.searchClientEi", d2.a().f());
        bqzmVar.B(bundle);
        if (bramVar.e() != null) {
            bqzmVar.Nz(bramVar.e());
        }
        X(bqzmVar, bramVar, bwrsVar);
    }

    private final void X(ges gesVar, bram bramVar, bwrs<brlu> bwrsVar) {
        if (this.c.g().J()) {
            return;
        }
        brlu c = bwrsVar.c();
        if (bramVar.c() && c != null) {
            alao.d(this.q, alad.c(c.x()));
        }
        if (bramVar.b()) {
            this.c.E(gesVar);
        } else {
            this.c.D(gesVar);
        }
    }

    private final void Y() {
        gga ggaVar = this.c;
        Toast.makeText(ggaVar, ggaVar.getString(R.string.NO_ROUTE_FOUND), 1).show();
        this.c.g().f();
    }

    private final boolean Z() {
        return this.t.getSuggestParameters().h || this.t.getSuggestParameters().i || this.t.getSuggestParameters().o || this.t.getSuggestParameters().p;
    }

    private final void aa(dwim dwimVar, @dzsi iqy iqyVar, @dzsi brlm brlmVar, int i) {
        dwir q = q(dwimVar, null);
        if (q != null) {
            ac(q, iqyVar, brlmVar, i);
        }
    }

    private final void ab(dpvg dpvgVar, int i, @dzsi iqy iqyVar, @dzsi dnqh dnqhVar, @dzsi brlm brlmVar, @dzsi dqep dqepVar, @dzsi dwiq dwiqVar, @dzsi dnnn dnnnVar) {
        dwim bZ = dwir.R.bZ();
        String str = dpvgVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        str.getClass();
        dwirVar.a |= 1;
        dwirVar.c = str;
        dpvf b = dpvf.b(dpvgVar.b);
        if (b == null) {
            b = dpvf.UNKNOWN_CATEGORY;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        dwirVar2.N = b.an;
        int i2 = dwirVar2.b | 4194304;
        dwirVar2.b = i2;
        if (dqepVar != null) {
            dqepVar.getClass();
            dwirVar2.O = dqepVar;
            dwirVar2.b = 8388608 | i2;
        }
        if (dnqhVar != null) {
            dnqhVar.getClass();
            dwirVar2.s = dnqhVar;
            dwirVar2.a |= 33554432;
        }
        if (dwiqVar != null) {
            dwiqVar.getClass();
            dwirVar2.u = dwiqVar;
            dwirVar2.a |= 134217728;
        }
        if (dnnnVar != null && this.y.i()) {
            dnyc bZ2 = dnzj.Z.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnzj dnzjVar = (dnzj) bZ2.b;
            dnnnVar.getClass();
            dnzjVar.d = dnnnVar;
            dnzjVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar3 = (dwir) bZ.b;
            dnzj bK = bZ2.bK();
            bK.getClass();
            dwirVar3.t = bK;
            dwirVar3.a |= 67108864;
        }
        brat bratVar = this.p;
        dpvf b2 = dpvf.b(dpvgVar.b);
        if (b2 == null) {
            b2 = dpvf.UNKNOWN_CATEGORY;
        }
        if (!bratVar.e.contains(b2) || bratVar.a.getExploreMapParametersWithoutLogging().u <= 0) {
            if (bratVar.b.contains(b2) && bratVar.a.getCategoricalSearchParametersWithoutLogging().l > 0) {
                bratVar.a.getCategoricalSearchParameters().E();
            }
        } else {
            bratVar.a.getExploreMapParameters().c();
        }
        if (this.p.a() && this.Z.a().i() && iqyVar != null && iqyVar.k) {
            dcep<dpvf> dcepVar = this.p.b;
            dpvf b3 = dpvf.b(dpvgVar.b);
            if (b3 == null) {
                b3 = dpvf.UNKNOWN_CATEGORY;
            }
            if (dcepVar.contains(b3)) {
                brmt brmtVar = this.ab;
                bsqi bsqiVar = this.ae;
                String str2 = dpvgVar.c;
                dpvf b4 = dpvf.b(dpvgVar.b);
                if (b4 == null) {
                    b4 = dpvf.UNKNOWN_CATEGORY;
                }
                dfpo a2 = bsqiVar.a(str2, b4);
                dsqp dsqpVar = (dsqp) a2.cu(5);
                dsqpVar.bC(a2);
                dfpn dfpnVar = (dfpn) dsqpVar;
                dncj dncjVar = a2.f;
                if (dncjVar == null) {
                    dncjVar = dncj.p;
                }
                dsqp dsqpVar2 = (dsqp) dncjVar.cu(5);
                dsqpVar2.bC(dncjVar);
                dnbw dnbwVar = (dnbw) dsqpVar2;
                if (dnbwVar.c) {
                    dnbwVar.bF();
                    dnbwVar.c = false;
                }
                dncj.b((dncj) dnbwVar.b);
                if (dfpnVar.c) {
                    dfpnVar.bF();
                    dfpnVar.c = false;
                }
                dfpo dfpoVar = (dfpo) dfpnVar.b;
                dncj bK2 = dnbwVar.bK();
                bK2.getClass();
                dfpoVar.f = bK2;
                dfpoVar.a |= 16;
                dfpo bK3 = dfpnVar.bK();
                akrw g = akrw.g(bK3);
                alyk q = alyl.q();
                ((alvg) q).a = bK3;
                brmtVar.h = brmtVar.b.N(brmtVar.a.getResources(), g, q.b());
            }
        }
        if (this.p.a.getCategoricalSearchParametersWithoutLogging().k && iqyVar != null && iqyVar.k) {
            dcep<dpvf> dcepVar2 = this.p.b;
            dpvf b5 = dpvf.b(dpvgVar.b);
            if (b5 == null) {
                b5 = dpvf.UNKNOWN_CATEGORY;
            }
            if (dcepVar2.contains(b5) && this.Z.a().i()) {
                bsqi bsqiVar2 = this.ae;
                String str3 = dpvgVar.c;
                dpvf b6 = dpvf.b(dpvgVar.b);
                if (b6 == null) {
                    b6 = dpvf.UNKNOWN_CATEGORY;
                }
                dfpo a3 = bsqiVar2.a(str3, b6);
                iqyVar.d = iqx.MAP;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar4 = (dwir) bZ.b;
                dwirVar4.I = 5;
                dwirVar4.b |= 32768;
                dwir q2 = q(bZ, null);
                dbsk.s(q2);
                brln brlnVar = new brln(q2, iqyVar);
                brlnVar.g = i;
                brlnVar.b = bvrt.b(a3);
                if (this.p.c() == 3) {
                    brcc brccVar = this.ac;
                    bwrs a4 = bwrs.a(brlnVar);
                    brln brlnVar2 = brccVar.d;
                    if (brlnVar2 != null) {
                        brccVar.b.b(brlnVar2);
                        brccVar.d = null;
                    }
                    brln brlnVar3 = (brln) a4.c();
                    dbsk.s(brlnVar3);
                    brccVar.c = alad.c(brccVar.a.aa());
                    dwir b7 = brlnVar3.b();
                    dsqp dsqpVar3 = (dsqp) b7.cu(5);
                    dsqpVar3.bC(b7);
                    dwim dwimVar = (dwim) dsqpVar3;
                    dhjx aa = brccVar.a.aa();
                    if (dwimVar.c) {
                        dwimVar.bF();
                        dwimVar.c = false;
                    }
                    dwir dwirVar5 = (dwir) dwimVar.b;
                    aa.getClass();
                    dwirVar5.d = aa;
                    int i3 = dwirVar5.a | 2;
                    dwirVar5.a = i3;
                    dwirVar5.a = i3 | 8;
                    dwirVar5.f = 0;
                    dwirVar5.b |= 32;
                    dwirVar5.C = false;
                    dwir.e(dwirVar5);
                    dnfn bZ3 = dnfo.d.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnfo dnfoVar = (dnfo) bZ3.b;
                    dnfoVar.a |= 2;
                    dnfoVar.c = true;
                    if (dwimVar.c) {
                        dwimVar.bF();
                        dwimVar.c = false;
                    }
                    dwir dwirVar6 = (dwir) dwimVar.b;
                    dnfo bK4 = bZ3.bK();
                    bK4.getClass();
                    dwirVar6.v = bK4;
                    dwirVar6.a |= 268435456;
                    if (dwimVar.c) {
                        dwimVar.bF();
                        dwimVar.c = false;
                    }
                    dwir.f((dwir) dwimVar.b);
                    dnqh dnqhVar2 = brlnVar3.b().s;
                    if (dnqhVar2 == null) {
                        dnqhVar2 = dnqh.p;
                    }
                    dsqp dsqpVar4 = (dsqp) dnqhVar2.cu(5);
                    dsqpVar4.bC(dnqhVar2);
                    dnqg dnqgVar = (dnqg) dsqpVar4;
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar3 = (dnqh) dnqgVar.b;
                    dnqhVar3.a |= 2048;
                    dnqhVar3.j = true;
                    if (dwimVar.c) {
                        dwimVar.bF();
                        dwimVar.c = false;
                    }
                    dwir dwirVar7 = (dwir) dwimVar.b;
                    dnqh bK5 = dnqgVar.bK();
                    bK5.getClass();
                    dwirVar7.s = bK5;
                    dwirVar7.a = 33554432 | dwirVar7.a;
                    if (dwimVar.c) {
                        dwimVar.bF();
                        dwimVar.c = false;
                    }
                    dwir dwirVar8 = (dwir) dwimVar.b;
                    dwirVar8.e = null;
                    dwirVar8.a &= -5;
                    brln brlnVar4 = new brln(dwimVar.bK(), brlnVar3.a);
                    brlnVar4.f = brccVar;
                    brccVar.b.a(brlnVar4);
                    brccVar.d = brlnVar4;
                }
                W(bram.f(bwrs.a(brlnVar)).a(), bwrs.a(brlnVar.e));
                return;
            }
        }
        aa(bZ, iqyVar, brlmVar, i);
    }

    private final void ac(dwir dwirVar, @dzsi iqy iqyVar, @dzsi brlm brlmVar, int i) {
        broq broqVar;
        bqzo bqzoVar;
        btvo btvoVar;
        if (iqyVar == null) {
            iqyVar = new iqy();
        }
        if (!a.matcher(dwirVar.c).matches()) {
            if (!dwirVar.H) {
                String str = dwirVar.c;
                if (!dbsj.d(str) && (btvoVar = this.t) != null) {
                    String a2 = btvoVar.getSearchParameters().a();
                    if (!dbsj.d(a2)) {
                        String lowerCase = str.toLowerCase(Locale.getDefault());
                        String lowerCase2 = a2.toLowerCase(Locale.getDefault());
                        if (lowerCase2.contains(lowerCase) || lowerCase.contains(lowerCase2)) {
                            dsqp dsqpVar = (dsqp) dwirVar.cu(5);
                            dsqpVar.bC(dwirVar);
                            dwim dwimVar = (dwim) dsqpVar;
                            if (dwimVar.c) {
                                dwimVar.bF();
                                dwimVar.c = false;
                            }
                            dwir.f((dwir) dwimVar.b);
                            dwirVar = dwimVar.bK();
                        }
                    }
                }
            }
            brln brlnVar = new brln(dwirVar, iqyVar);
            brlnVar.g = i;
            if (brlmVar != null) {
                brlnVar.f = brlmVar;
            }
            if (i != 3) {
                if (iqyVar.j) {
                    bwrs a3 = bwrs.a(brlnVar);
                    bwqv bwqvVar = this.v;
                    if (((brln) a3.c()) == null) {
                        bqzoVar = null;
                    } else {
                        bqzo bqzoVar2 = new bqzo();
                        Bundle bundle = new Bundle();
                        bwqvVar.c(bundle, "searchRequest", a3);
                        bqzoVar2.B(bundle);
                        bqzoVar = bqzoVar2;
                    }
                    if (bqzoVar != null) {
                        if (iqyVar.m) {
                            if (this.aa.a().f()) {
                                this.c.G(bqzoVar, true, gfs.HOMETAB);
                            } else {
                                this.c.F(bqzoVar, true);
                            }
                        } else {
                            this.c.D(bqzoVar);
                        }
                    } else {
                        bvoo.h("SearchLoadingFragment is not created because of invalid SearchRequest.", new Object[0]);
                        gga ggaVar = this.c;
                        cjxu.j(ggaVar, this.B, ggaVar.getString(R.string.UNKNOWN_ERROR));
                    }
                } else if (iqyVar.m) {
                    C(true);
                }
            }
            if ((iqyVar.j && i != 3) || (broqVar = this.C) == null) {
                return;
            }
            broqVar.a(brlnVar);
            return;
        }
        this.G.a().f();
    }

    static dwim o(dwjj dwjjVar, dnqh dnqhVar, @dzsi bxkv bxkvVar) {
        cjsb cjsbVar = new cjsb(dnqhVar);
        if (bxkvVar != null) {
            cjsbVar.g(bxkvVar.d());
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        if (!dbsd.a(dxbpVar.o, dnqhVar.c)) {
            dxbp dxbpVar2 = dwjjVar.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            cjsbVar.e(dxbpVar2.o);
        }
        dwim bZ = dwir.R.bZ();
        dxbp dxbpVar3 = dwjjVar.b;
        if (dxbpVar3 == null) {
            dxbpVar3 = dxbp.x;
        }
        String str = dxbpVar3.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        str.getClass();
        int i = dwirVar.a | 1;
        dwirVar.a = i;
        dwirVar.c = str;
        dspd dspdVar = dwjjVar.d;
        dspdVar.getClass();
        dwirVar.a = i | 8192;
        dwirVar.k = dspdVar;
        dnqh a2 = cjsbVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        a2.getClass();
        dwirVar2.s = a2;
        dwirVar2.a |= 33554432;
        dnyc bZ2 = dnzj.Z.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnzj.b((dnzj) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar3 = (dwir) bZ.b;
        dnzj bK = bZ2.bK();
        bK.getClass();
        dwirVar3.t = bK;
        dwirVar3.a |= 67108864;
        return bZ;
    }

    @Override // defpackage.brba
    public final void B() {
        this.i = null;
    }

    @Override // defpackage.brba
    public final void C(boolean z) {
        ggg gggVar = this.i;
        if (gggVar != null) {
            if (z) {
                gfq.m(gggVar);
            } else {
                gfq.l(gggVar);
            }
            this.i = null;
        }
    }

    @Override // defpackage.brba
    public final void D(bxmh bxmhVar, dnqh dnqhVar, @dzsi bxkv bxkvVar, @dzsi iqy iqyVar, cjqm cjqmVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        boolean z = false;
        dbsk.a((dwjjVar.a & 2) != 0);
        dwim o = o(dwjjVar, dnqhVar, bxkvVar);
        dwir dwirVar = dwjjVar.f;
        if (dwirVar == null) {
            dwirVar = dwir.R;
        }
        dwir q = q(o, dwirVar);
        if (q == null) {
            return;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbi.a(dxbpVar.f);
        if (a2 != 0 && a2 == 3) {
            z = true;
        }
        if (z) {
            cqat cqatVar = this.r;
            dtaq dtaqVar = q.j;
            if (dtaqVar == null) {
                dtaqVar = dtaq.m;
            }
            dcdc f = dcdc.f(dtaqVar);
            dwiv dwivVar = dwjjVar.c;
            if (dwivVar == null) {
                dwivVar = dwiv.M;
            }
            btul.c(cqatVar, f, q, dwivVar, this.k);
        }
        dxbp dxbpVar2 = dwjjVar.b;
        if (dxbpVar2 == null) {
            dxbpVar2 = dxbp.x;
        }
        P(dxbpVar2, iqyVar);
        dwiv dwivVar2 = dwjjVar.c;
        if (dwivVar2 == null) {
            dwivVar2 = dwiv.M;
        }
        brln brlnVar = new brln(q, dwivVar2, iqyVar, this.t);
        brlnVar.e.d = z;
        bral f2 = bram.f(bwrs.a(brlnVar));
        f2.c(cjqmVar);
        f2.b(true);
        E(f2.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x024b, code lost:
        if (r5.e() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0404, code lost:
        if (r2 != defpackage.deaf.KEYBOARD_ENTER) goto L189;
     */
    @Override // defpackage.brba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.bram r18) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brab.E(bram):void");
    }

    @Override // defpackage.brba
    public final void F(amvh amvhVar, @dzsi qbn qbnVar) {
        amvi amviVar;
        bvrj.UI_THREAD.c();
        bqzm bqzmVar = (bqzm) this.c.z(bqzm.class);
        if (bqzmVar != null) {
            if (bqzmVar.ba() != null) {
                brlk G = G();
                amsz amszVar = null;
                brln d2 = G == null ? null : G.d();
                if (d2 != null) {
                    amszVar = d2.c;
                }
                if (amszVar == null) {
                    amviVar = amvi.INSERT;
                } else {
                    amviVar = amszVar.d;
                }
                bqzmVar.Nw(new qbh(amvhVar, qbnVar, amviVar));
                return;
            }
            bvoo.h("No fragment result listener when SearchListFragment tries to dispatch waypoint search result", new Object[0]);
            return;
        }
        bvoo.h("No existing SearchListFragment to dispatch waypoint search result", new Object[0]);
    }

    @Override // defpackage.brba
    @dzsi
    public final brlk G() {
        fd K = K();
        if (K instanceof brae) {
            return ((brae) K).bt();
        }
        return null;
    }

    @Override // defpackage.brba
    public final boolean H() {
        brlk G = G();
        return G != null && G.f();
    }

    @Override // defpackage.brba
    public final void I(ilo iloVar) {
        bqzm bqzmVar = (bqzm) this.c.z(bqzm.class);
        if (bqzmVar != null) {
            bqzmVar.g(iloVar);
        }
    }

    @Override // defpackage.brba
    public final void J(ilo iloVar, begj begjVar) {
        brlt remove;
        brlk G = G();
        gfw gfwVar = null;
        bwrs<brln> a2 = G == null ? null : G.a();
        if (((brln) bwrs.b(a2)) == null) {
            bvoo.h("handleSearchResultClick but no top fragment active search request.", new Object[0]);
            return;
        }
        bwrs<brlu> b = G == null ? null : G.b();
        brlu c = b != null ? b.c() : null;
        if (c == null) {
            bvoo.h("handleSearchResultClick but no top fragment active search result.", new Object[0]);
            return;
        }
        this.V.a();
        c.B(iloVar);
        bwrs<ilo> r = c.r();
        this.Q.a(6, r);
        ilo c2 = r.c();
        dbsk.s(c2);
        dnqh cc = c2.cc(cjqm.a);
        bzlr a3 = this.S.a();
        dsqp dsqpVar = (dsqp) cc.cu(5);
        dsqpVar.bC(cc);
        dnqg dnqgVar = (dnqg) dsqpVar;
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh dnqhVar = (dnqh) dnqgVar.b;
        dnqh dnqhVar2 = dnqh.p;
        dnqhVar.a |= 64;
        dnqhVar.g = 70844;
        if (a3.a(c2, dnqgVar.bK(), false) || this.T.a().a(c2, a2, b, cc, false)) {
            return;
        }
        begjVar.i = r;
        begjVar.d = cc;
        begjVar.j = a2;
        begjVar.g = b;
        begjVar.a = begi.SEARCH_LIST_RESULT;
        begjVar.t = true;
        begjVar.u = true;
        brpm brpmVar = this.ad;
        if (brpmVar.b.getPlaceSheetParameters().V() || brpmVar.e.b()) {
            synchronized (c.r) {
                remove = c.r.remove(r);
            }
            if (remove != null) {
                brpmVar.c.g(r, new brpl(brpmVar, r, cc, remove));
            }
        }
        fd K = K();
        if (K instanceof bqzm) {
            gfwVar = (gfw) K;
        }
        this.K.a().n(begjVar, false, gfwVar);
    }

    @dzsi
    public final fd K() {
        return this.c.J(gfu.ACTIVITY_FRAGMENT);
    }

    @Override // defpackage.brba
    public final void L(dhjx dhjxVar) {
        this.b = dhjxVar;
    }

    @Override // defpackage.brba
    public final void M(String str, int i, @dzsi dnqh dnqhVar, @dzsi brlm brlmVar, @dzsi iqy iqyVar, @dzsi dwiq dwiqVar) {
        dwim bZ = dwir.R.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        str.getClass();
        int i2 = dwirVar.a | 1;
        dwirVar.a = i2;
        dwirVar.c = str;
        if (dnqhVar != null) {
            dnqhVar.getClass();
            dwirVar.s = dnqhVar;
            i2 |= 33554432;
            dwirVar.a = i2;
        }
        if (dwiqVar != null) {
            dwiqVar.getClass();
            dwirVar.u = dwiqVar;
            dwirVar.a = 134217728 | i2;
        }
        aa(bZ, iqyVar, brlmVar, i);
    }

    @Override // defpackage.brba
    public final void N(dpvg dpvgVar, int i, @dzsi iqy iqyVar, @dzsi dnqh dnqhVar, @dzsi brlm brlmVar, @dzsi dqep dqepVar, @dzsi dwiq dwiqVar) {
        ab(dpvgVar, i, iqyVar, dnqhVar, brlmVar, dqepVar, dwiqVar, null);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        doea bZ = doed.c.bZ();
        doec doecVar = doec.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doed doedVar = (doed) bZ.b;
        doecVar.getClass();
        doedVar.b = doecVar;
        doedVar.a |= 32;
        this.f = bZ.bK();
        this.q.ab(this.g);
        this.h = this.D.a();
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        brbr brbrVar = this.E;
        btrm btrmVar = brbrVar.b;
        brbq brbqVar = brbrVar.c;
        dceq a2 = dcet.a();
        a2.b(brco.class, new brbs(0, brco.class, brbqVar));
        a2.b(brcn.class, new brbs(1, brcn.class, brbqVar));
        btrmVar.g(brbqVar, a2.a());
        if (Z()) {
            cxb cxbVar = this.ah;
            if (!cxbVar.c) {
                btrm btrmVar2 = cxbVar.b;
                cxa cxaVar = cxbVar.a;
                dceq a3 = dcet.a();
                a3.b(cxd.class, new cxc(cxd.class, cxaVar, bvrj.UI_THREAD));
                btrmVar2.g(cxaVar, a3.a());
                cxbVar.c = true;
            }
            this.ai.a();
        }
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.q.ac(this.g);
        broq broqVar = this.C;
        if (broqVar != null) {
            broqVar.c();
        }
        super.Nu();
    }

    @Override // defpackage.brba
    public final View O(final String str) {
        cqkf e2 = this.j.e(new hxj());
        e2.e(new jbk(this, str) { // from class: bqzv
            private final brab a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.jbk
            public jib NC() {
                brab brabVar = this.a;
                String str2 = this.b;
                jhz a2 = jhz.a();
                a2.a = str2;
                a2.o = cjtd.a(dtyi.y);
                a2.f(new bqzz(brabVar));
                return a2.b();
            }
        });
        return e2.c();
    }

    @Override // defpackage.itb
    public final void Po() {
        brbr brbrVar = this.E;
        brbrVar.b.a(brbrVar.c);
        if (Z()) {
            cxb cxbVar = this.ah;
            if (cxbVar.c) {
                cxbVar.b.a(cxbVar.a);
                cxbVar.c = false;
            }
            this.ai.b();
        }
        super.Po();
    }

    @Override // defpackage.brba
    public final void Q(dpvg dpvgVar, @dzsi dnqh dnqhVar, @dzsi brlm brlmVar, @dzsi iqy iqyVar, @dzsi dnnn dnnnVar) {
        ab(dpvgVar, 1, iqyVar, dnqhVar, brlmVar, null, null, dnnnVar);
    }

    @Override // defpackage.brba
    public final void e(String str) {
        f(str, null);
    }

    @Override // defpackage.brba
    public final void f(String str, @dzsi bxko bxkoVar) {
        String string = this.c.getString(R.string.SEARCH_HINT);
        boolean k = this.I.a().k(dtja.SEARCH);
        bwqv bwqvVar = this.v;
        bxdy bxdyVar = new bxdy();
        bxdyVar.bu(bwqvVar, bxdy.aR(str, string, k, null, bxkoVar), null);
        this.i = bxdyVar;
        this.c.D(bxdyVar);
    }

    @Override // defpackage.brba
    public final void i(bwrs<brln> bwrsVar) {
        String string = this.c.getString(R.string.SEARCH_HINT);
        boolean k = this.I.a().k(dtja.SEARCH);
        gga ggaVar = this.c;
        bwqv bwqvVar = this.v;
        bxdy bxdyVar = new bxdy();
        brln c = bwrsVar.c();
        if (c == null) {
            bvoo.h("Search request in searchRequestRef should not be null.", new Object[0]);
        } else {
            String str = c.e.a;
            if (str == null) {
                str = c.j();
            }
            bxdyVar.bu(bwqvVar, bxdy.aR(str, string, k, bwrsVar, null), null);
            Bundle bundle = bxdyVar.o;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bxdyVar.B(bundle);
        }
        ggaVar.D(bxdyVar);
    }

    @Override // defpackage.brba
    public final void j(String str, @dzsi dnqh dnqhVar) {
        M(str, 1, dnqhVar, null, null, null);
    }

    @Override // defpackage.brba
    public final void k(bxmh bxmhVar, dnqh dnqhVar, @dzsi bxkv bxkvVar, @dzsi iqy iqyVar) {
        l(bxmhVar, dnqhVar, bxkvVar, iqyVar, null);
    }

    @Override // defpackage.brba
    public final void l(bxmh bxmhVar, dnqh dnqhVar, @dzsi bxkv bxkvVar, @dzsi iqy iqyVar, @dzsi brlm brlmVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dwim o = o(dwjjVar, dnqhVar, bxkvVar);
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        P(dxbpVar, iqyVar);
        dwir dwirVar = dwjjVar.f;
        if (dwirVar == null) {
            dwirVar = dwir.R;
        }
        dwir q = q(o, dwirVar);
        if (q != null) {
            U(q, iqyVar, brlmVar);
        }
    }

    @Override // defpackage.brba
    public final void m(dwim dwimVar, @dzsi iqy iqyVar) {
        aa(dwimVar, iqyVar, null, 1);
    }

    @Override // defpackage.brba
    public final void n(dpvg dpvgVar, @dzsi dnqh dnqhVar) {
        ab(dpvgVar, 1, null, dnqhVar, null, null, null, null);
    }

    @Override // defpackage.brba
    public final void p(String str, cjqm cjqmVar) {
        if (dbtw.a(str)) {
            return;
        }
        ((ckcn) this.N.a().a(ckjw.l)).a();
        this.B.b(new braa(this, str, cjqmVar), bvrj.UI_THREAD);
    }

    @dzsi
    final dwir q(dwim dwimVar, @dzsi dwir dwirVar) {
        dhjx dhjxVar = this.b;
        if (dhjxVar == null) {
            dhjxVar = this.q.aa();
        }
        if (dhjxVar == null) {
            return null;
        }
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar2 = (dwir) dwimVar.b;
        dwir dwirVar3 = dwir.R;
        dhjxVar.getClass();
        dwirVar2.d = dhjxVar;
        dwirVar2.a |= 2;
        r(dwimVar);
        if (dwirVar != null) {
            dwimVar.bC(dwirVar);
        }
        return dwimVar.bK();
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x082d, code lost:
        if (((java.lang.Boolean) r2.l).booleanValue() != false) goto L217;
     */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.brba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.dwim r15) {
        /*
            Method dump skipped, instructions count: 2225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brab.r(dwim):void");
    }

    @Override // defpackage.brba
    public final void s(dwir dwirVar, @dzsi iqy iqyVar) {
        U(dwirVar, iqyVar, null);
    }

    @Override // defpackage.brba
    public final void t(String str, List<String> list, braz brazVar) {
        dwim bZ = dwir.R.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        str.getClass();
        dwirVar.a |= 1;
        dwirVar.c = str;
        int size = list.size();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        dwirVar2.a |= 16;
        dwirVar2.g = size;
        dhjx aa = this.q.aa();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar3 = (dwir) bZ.b;
        aa.getClass();
        dwirVar3.d = aa;
        dwirVar3.a |= 2;
        for (String str2 : list) {
            dwik bZ2 = dwil.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwil dwilVar = (dwil) bZ2.b;
            str2.getClass();
            dwilVar.a |= 1;
            dwilVar.b = str2;
            bZ.b(bZ2.bK());
        }
        if (brazVar.a().a().a()) {
            dnqg bZ3 = dnqh.p.bZ();
            String b = brazVar.a().a().b();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ3.b;
            b.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = b;
            dnqh bK = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar4 = (dwir) bZ.b;
            bK.getClass();
            dwirVar4.s = bK;
            dwirVar4.a |= 33554432;
        }
        int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.placecollection_coverphoto_size);
        dhkc bZ4 = dhkd.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ4.b;
        int i = dhkdVar.a | 1;
        dhkdVar.a = i;
        dhkdVar.b = dimensionPixelSize;
        dhkdVar.a = i | 2;
        dhkdVar.c = dimensionPixelSize;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar5 = (dwir) bZ.b;
        dhkd bK2 = bZ4.bK();
        bK2.getClass();
        dwirVar5.q = bK2;
        dwirVar5.a |= 4194304;
        dwhq bZ5 = dwhv.H.bZ();
        this.ag.a(bZ5);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar6 = (dwir) bZ.b;
        dwhv bK3 = bZ5.bK();
        bK3.getClass();
        dwirVar6.B = bK3;
        dwirVar6.b |= 8;
        iqy iqyVar = new iqy();
        iqyVar.l = str;
        iqyVar.n = brazVar.c();
        m(bZ, iqyVar);
    }
}
