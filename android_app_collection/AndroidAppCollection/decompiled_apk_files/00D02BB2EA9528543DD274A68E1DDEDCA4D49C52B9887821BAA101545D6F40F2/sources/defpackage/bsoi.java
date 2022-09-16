package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bsoi  reason: default package */
/* loaded from: classes4.dex */
public class bsoi implements ghu {
    public int A;
    public final bsop C;
    @dzsi
    public ghw D;
    @dzsi
    public cqkf<ghq> E;
    @dzsi
    public ExtendedFloatingActionButton F;
    public boolean G;
    @dzsi
    public ilo H;
    @dzsi
    public bdwp L;
    @dzsi
    public bdyk M;
    private final ghx O;
    @dzsi
    private final dro P;
    private final ckmp Q;
    private final bsod R;
    private final dxio<brpm> S;
    private final brcj T;
    @dzsi
    private final brmk U;
    private final boolean V;
    private final jkf W;
    private boolean X;
    private dhjx Y;
    private brlu Z;
    public final Application a;
    private int aa;
    private int ab;
    private int ac;
    private final brvv ah;
    public final Activity b;
    public final cqhn c;
    public final ghl d;
    public final cqkj e;
    public final bdyl f;
    public final alhv g;
    public final bsoh h;
    public final dxio<brba> i;
    public final btrm j;
    public final btvo k;
    public final cjqy l;
    public final cjqq m;
    public final brat n;
    public final dxio<akox> o;
    public final gle p;
    public final brlk q;
    @dzsi
    public final bxbd r;
    public final bsoq v;
    @dzsi
    public dkee w;
    public boolean x;
    public int y;
    public int z;
    final Map<cqkp, ghs<brve>> s = dcjz.d();
    public final Runnable t = new bsnw(this);
    public final Runnable u = new bsnx(this);
    public List<ghs<?>> B = new ArrayList();
    private boolean ad = true;
    private int ae = -1;
    private boolean af = false;
    private int ag = -1;
    public boolean I = false;
    public final alht J = new bsny(this);
    public final bbb K = new bsnz(this);
    float N = 0.0f;

    public bsoi(Activity activity, Application application, cqhn cqhnVar, btrm btrmVar, btvo btvoVar, ghl ghlVar, ghx ghxVar, alhv alhvVar, cqkj cqkjVar, cjqy cjqyVar, cjqq cjqqVar, brat bratVar, ckmp ckmpVar, bsod bsodVar, bsoh bsohVar, dxio dxioVar, dxio dxioVar2, gle gleVar, bdyl bdylVar, dxio dxioVar3, brlk brlkVar, brvv brvvVar, brcj brcjVar, iqx iqxVar, dro droVar, brmk brmkVar, bsop bsopVar, bxbd bxbdVar) {
        boolean z = false;
        this.G = false;
        this.b = activity;
        this.a = application;
        this.c = cqhnVar;
        this.j = btrmVar;
        this.k = btvoVar;
        this.d = ghlVar;
        this.O = ghxVar;
        this.g = alhvVar;
        this.e = cqkjVar;
        this.Q = ckmpVar;
        this.R = bsodVar;
        this.h = bsohVar;
        this.i = dxioVar;
        this.C = bsopVar;
        this.T = brcjVar;
        this.E = cqkjVar.c(new ghj(0), null);
        this.P = droVar;
        bsoq bsoqVar = new bsoq(application.getApplicationContext(), application.getResources().getConfiguration().orientation, this.y, this.z, bratVar.b());
        this.v = bsoqVar;
        this.W = bsoqVar;
        this.l = cjqyVar;
        this.m = cjqqVar;
        this.n = bratVar;
        this.q = brlkVar;
        brlu e = brlkVar.e();
        dbsk.t(e, "Null search result");
        this.Z = e;
        dkee ar = e.ar();
        this.w = ar;
        if (!brlkVar.f() && ar != null) {
            boolean z2 = new dsrh(btvoVar.getCategoricalSearchParameters().n().a, dhoh.b).contains(ar) || ad(btvoVar, ar, brlkVar);
            iqx iqxVar2 = iqx.TRAVERSAL;
            if (z2 || iqxVar == iqxVar2) {
                z = true;
            }
        }
        this.G = z;
        this.Y = this.Z.x();
        this.U = brmkVar;
        this.o = dxioVar2;
        this.p = gleVar;
        this.f = bdylVar;
        this.S = dxioVar3;
        this.V = btpf.d(activity.getResources().getConfiguration()).e;
        this.ah = brvvVar;
        this.r = null;
    }

    @dzsi
    public static bnju B(cqkp cqkpVar) {
        if (cqkpVar instanceof bnju) {
            return (bnju) cqkpVar;
        }
        if (!(cqkpVar instanceof brve)) {
            return null;
        }
        jba A = ((brve) cqkpVar).A();
        if (!(A instanceof bnju)) {
            return null;
        }
        return (bnju) A;
    }

    @dzsi
    public static Point T(cqkp cqkpVar, alrh alrhVar) {
        bnju B = B(cqkpVar);
        if (B == null) {
            return null;
        }
        ilo aH = B.aH();
        if (aH.aj() != null) {
            return alrhVar.b(aH.aj());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void U(ghs<?> ghsVar, float f) {
        Object b = ghsVar.a().b();
        if (b instanceof brwu) {
            ((brwu) b).aM(f);
        }
    }

    private final void V(ghw ghwVar, int i, int i2, boolean z, boolean z2, @dzsi cjqm cjqmVar) {
        if (this.n.b()) {
            k();
        }
        if (!this.q.f()) {
            if (h(i)) {
                this.Q.b(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_TRAVERSAL_RESULTS_LIST_ON_CARD_FOCUSED);
                if (w(i)) {
                    ghwVar.p(P(i).e(), true);
                } else {
                    ghwVar.n(i, true);
                }
                ilo iloVar = this.H;
                if (iloVar == null) {
                    iloVar = x(i);
                }
                dro droVar = this.P;
                if (droVar != null) {
                    droVar.e(iloVar);
                }
                u(iloVar, z, z2);
                L();
                this.T.e();
                if (i2 == 1) {
                    N();
                }
                if (z(i)) {
                    this.T.g(cjqmVar);
                    this.af = true;
                }
                cqkx.p(ghwVar);
                this.R.a();
                this.ae = i;
                this.j.b(bsno.b(i));
                return;
            }
            int i3 = i - 1;
            if (h(i3)) {
                this.j.b(bsno.b(i3));
            }
            int i4 = i + 1;
            if (h(i4)) {
                this.j.b(bsno.b(i4));
            }
        }
        this.Q.b(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_TRAVERSAL_RESULTS_LIST_ON_CARD_FOCUSED);
        if (w(i)) {
            ghs<?> P = P(i);
            ghwVar.p(P.e(), true);
            brmk brmkVar = this.U;
            if (brmkVar != null) {
                brmkVar.j = ((bsob) P.e()).a();
            }
        } else {
            ghwVar.n(i, true);
        }
        dro droVar2 = this.P;
        if (droVar2 != null) {
            droVar2.e(y(i));
        }
        t(i, z, z2);
        boolean z3 = i2 == 1 || i2 == 2;
        if (!this.k.getCategoricalSearchParameters().a()) {
            if (M() && i == 0) {
                if (!z3) {
                    i = 0;
                } else {
                    i = 0;
                }
            }
            L();
        }
        this.T.e();
        if (i2 == 1) {
            N();
        }
        if (z(i)) {
            this.T.g(cjqmVar);
            this.af = true;
        }
        int i5 = this.ae;
        if (i5 != i) {
            W(i5, false);
        }
        W(i, true);
        cqkx.p(ghwVar);
        this.R.a();
        this.ae = i;
    }

    private final void W(int i, boolean z) {
        View aJ;
        brwu i2 = i(i);
        if (i2 == null || !i2.ar().booleanValue()) {
            return;
        }
        if (z && (aJ = i2.aJ()) != null) {
            this.v.setAboveView(aJ);
        }
        i2.aK(z);
    }

    private final void X(bssu bssuVar) {
        if (this.X) {
            brjc brjcVar = new brjc(null);
            bssp k = bssuVar.k();
            dbsk.s(k);
            ag(new ghs<>(cqgr.fT(brjcVar, k), null, false, bsob.e(3), null, null));
            this.y = 290;
            this.z = 190;
            ghw ghwVar = this.D;
            dbsk.s(ghwVar);
            ghwVar.s(this.y, this.z);
            this.v.Y(this.y, this.z);
        }
        if (!bssuVar.g().booleanValue()) {
            return;
        }
        boolean z = false;
        if (S() > this.ag && this.af && this.D != null) {
            if (h(A())) {
                ghw ghwVar2 = this.D;
                dbsk.s(ghwVar2);
                ghwVar2.n(this.ag, false);
            }
            this.af = false;
        }
        this.ag = S();
        int S = S();
        if (S() <= 0) {
            z = true;
        }
        f(S, bssuVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y(java.util.List<defpackage.ilo> r7) {
        /*
            r6 = this;
            brlu r0 = r6.Z
            dkee r0 = r0.ar()
            r6.w = r0
            brlu r0 = r6.Z
            dcdc<dqfg> r0 = r0.p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3d
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L3d
            btvo r3 = r6.k
            dhov r3 = r3.getCategoricalSearchParameters()
            dhoq r3 = r3.r()
            dsrh r4 = new dsrh
            dsrf r3 = r3.a
            dsrg<java.lang.Integer, dqfg> r5 = defpackage.dhoq.b
            r4.<init>(r3, r5)
            dcbg r3 = defpackage.dcbg.b(r4)
            r0.getClass()
            bsnt r4 = new bsnt
            r4.<init>(r0)
            boolean r0 = r3.p(r4)
            if (r0 == 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            btvo r3 = r6.k
            dhov r3 = r3.getCategoricalSearchParameters()
            dhot r3 = r3.q()
            dsrh r4 = new dsrh
            dsrf r3 = r3.a
            dsrg<java.lang.Integer, dkee> r5 = defpackage.dhot.b
            r4.<init>(r3, r5)
            dkee r3 = r6.w
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L5b
            if (r0 == 0) goto L7f
        L5b:
            java.util.Iterator r0 = r7.iterator()
        L5f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r0.next()
            ilo r3 = (defpackage.ilo) r3
            dvyw r3 = r3.h()
            dvwr r3 = r3.bj
            if (r3 != 0) goto L75
            dvwr r3 = defpackage.dvwr.b
        L75:
            dsrj<dvwp> r3 = r3.a
            int r3 = r3.size()
            if (r3 <= 0) goto L5f
        L7d:
            r0 = 1
            goto L97
        L7f:
            java.util.Iterator r0 = r7.iterator()
        L83:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r3 = r0.next()
            ilo r3 = (defpackage.ilo) r3
            java.lang.String r3 = r3.ab()
            if (r3 == 0) goto L83
            goto L7d
        L96:
            r0 = 0
        L97:
            r6.x = r0
            dkee r0 = r6.w
            btvo r3 = r6.k
            int r0 = r6.ab(r0, r7, r3, r2)
            r6.y = r0
            dkee r0 = r6.w
            btvo r2 = r6.k
            int r0 = r6.ab(r0, r7, r2, r1)
            r6.z = r0
            dkee r0 = r6.w
            btvo r1 = r6.k
            int r7 = r6.aa(r0, r7, r1)
            r6.A = r7
            ghw r7 = r6.D
            if (r7 == 0) goto Lc2
            int r0 = r6.y
            int r1 = r6.z
            r7.s(r0, r1)
        Lc2:
            bsoq r7 = r6.v
            if (r7 == 0) goto Lcd
            int r0 = r6.y
            int r1 = r6.z
            r7.Y(r0, r1)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsoi.Y(java.util.List):void");
    }

    private final int Z(List<ilo> list) {
        if (this.H != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).ai().equals(this.H.ai())) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    private final int aa(@dzsi dkee dkeeVar, List<ilo> list, btvo btvoVar) {
        int i;
        float max = Math.max(0.5f, Math.min(this.a.getResources().getConfiguration().fontScale, 2.0f));
        int round = Math.round(107.0f * max) + 50;
        if (dkeeVar != null && (dkeeVar == dkee.HOTEL || dkeeVar == dkee.HOTEL_CHAIN)) {
            round -= Math.round(26.0f * max);
        } else if (this.x) {
            round += Math.round(26.0f * max);
        }
        if (btvoVar.getCategoricalSearchParameters().v()) {
            Iterator<ilo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                } else if (it.next().cA().a.size() > 0) {
                    i = 30;
                    break;
                }
            }
            round += i;
        }
        if (this.n.b()) {
            round += 10;
        }
        int ac = ac(list, max, btvoVar);
        return ac != 0 ? ac - Math.round(max * 11.0f) : round;
    }

    private final int ab(@dzsi dkee dkeeVar, List<ilo> list, btvo btvoVar, boolean z) {
        float max = Math.max(0.5f, Math.min(this.a.getResources().getConfiguration().fontScale, 2.0f));
        int ac = ac(list, max, btvoVar);
        if (ac != 0) {
            return ac;
        }
        int aa = aa(dkeeVar, list, btvoVar);
        if (brwu.aB(dkeeVar)) {
            Configuration configuration = this.a.getResources().getConfiguration();
            int i = configuration.orientation;
            int i2 = i == 2 ? configuration.screenWidthDp : configuration.screenHeightDp;
            int i3 = i == 2 ? configuration.screenHeightDp : configuration.screenWidthDp;
            if (true == z) {
                i2 = i3;
            }
            if (brwu.aN(max, i2, btvoVar.getSearchParameters().j())) {
                aa += 102;
            }
        }
        return aa + 11;
    }

    private static int ac(List<ilo> list, float f, btvo btvoVar) {
        dnjf ad;
        int a;
        if (!beuq.b(btvoVar)) {
            return 0;
        }
        Iterator<ilo> it = list.iterator();
        int i = 0;
        while (it.hasNext() && ((ad = it.next().ad()) == null || (a = dnje.a(ad.a)) == 0 || a != 2 || ad.b.get(0).c.size() <= i || (i = ad.b.get(0).c.size()) <= 2)) {
        }
        if (i <= 0) {
            return 0;
        }
        return Math.round(f * (i == 1 ? 144.0f : i == 2 ? 166.0f : 190.0f)) + 50;
    }

    private static boolean ad(btvo btvoVar, @dzsi dkee dkeeVar, brlk brlkVar) {
        if (brlkVar.f() || dkeeVar == null) {
            return false;
        }
        return new dsrh(btvoVar.getCategoricalSearchParameters().p().a, dhob.b).contains(dkeeVar);
    }

    private final synchronized void ae() {
        for (cqkp cqkpVar : this.s.keySet()) {
            if (cqkpVar instanceof brwk) {
                brwk brwkVar = (brwk) cqkpVar;
                af(this.s.get(brwkVar), brwkVar);
            }
        }
    }

    private static void af(ghs<brve> ghsVar, brwk brwkVar) {
        if (brwkVar.aI() == null || !(ghsVar.a().b() instanceof brwu)) {
            return;
        }
        bwrs<ilo> aI = brwkVar.aI();
        dbsk.s(aI);
        ((brwu) ghsVar.a().b()).QR(aI);
    }

    private final synchronized void ag(ghs<?> ghsVar) {
        bsop bsopVar = this.C;
        bsopVar.b.add(ghsVar.e());
        this.B.add(ghsVar);
    }

    private final synchronized boolean ah() {
        return this.B.isEmpty();
    }

    private final synchronized void ai(int i) {
        this.C.b.remove(i);
        this.B.remove(i);
    }

    public static int o(@dzsi Point point, Rect rect) {
        if (point == null) {
            return Integer.MAX_VALUE;
        }
        int i = rect.top;
        int i2 = rect.bottom;
        double d = rect.top - point.y;
        double d2 = (i - i2) / 6;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (int) Math.floor(d / d2);
    }

    public final int A() {
        ghw ghwVar = this.D;
        if (ghwVar != null) {
            return ghwVar.c().intValue();
        }
        return 0;
    }

    public final boolean C() {
        int a = dkkn.a(this.n.a.getExploreMapParametersWithoutLogging().n);
        if (a == 0) {
            a = 1;
        }
        return !this.q.f() || a == 2;
    }

    public final boolean D() {
        return ((ExpandingScrollView) this.W).f == jjn.HIDDEN && (this.q.f() || M());
    }

    @dzsi
    public final ght E() {
        ghw ghwVar = this.D;
        if (ghwVar == null) {
            return null;
        }
        return ghwVar.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(boolean z) {
        if (z != this.v.m.equals(this.L)) {
            if (z) {
                int A = A();
                ilo y = y(A);
                if (y == null || this.L == null || this.M == null || !w(A)) {
                    return;
                }
                bdwp bdwpVar = this.L;
                dbsk.s(bdwpVar);
                bdwpVar.f(bwrs.a(y));
                bdyk bdykVar = this.M;
                dbsk.s(bdykVar);
                bfle N = bdykVar.N();
                brvv brvvVar = this.ah;
                bwrs<ilo> a = bwrs.a(y);
                Runnable runnable = bsnu.a;
                bdyk bdykVar2 = this.M;
                dbsk.s(bdykVar2);
                N.P(brvvVar.a(a, null, runnable, bdykVar2.ap()));
                bdwp bdwpVar2 = this.L;
                dbsk.s(bdwpVar2);
                cqkf<bnih> cqkfVar = bdwpVar2.l;
                bdyk bdykVar3 = this.M;
                dbsk.s(bdykVar3);
                cqkfVar.e(bdykVar3);
                bsoq bsoqVar = this.v;
                bdwp bdwpVar3 = this.L;
                dbsk.s(bdwpVar3);
                bsoqVar.setContent(bdwpVar3);
                Object b = P(A).a().b();
                float f = 0.0f;
                if ((b instanceof brwu) && ((brwu) b).Qx().booleanValue()) {
                    bdwp bdwpVar4 = this.L;
                    dbsk.s(bdwpVar4);
                    bfia bfiaVar = bdwpVar4.j;
                    dbsk.s(bfiaVar);
                    f = bfiaVar.c(this.v, jjn.COLLAPSED, 0.33f);
                }
                this.N = f;
                this.S.a().b(this.Z, y, brlt.TRAVERSAL_EXPANSION);
                return;
            }
            bsoq bsoqVar2 = this.v;
            cqkf<ghq> cqkfVar2 = this.E;
            dbsk.s(cqkfVar2);
            bsoqVar2.setContent(cqkfVar2.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(float f) {
        ghw ghwVar = this.D;
        dbsk.s(ghwVar);
        ghwVar.t(Math.max(0.0f, f));
        ghw ghwVar2 = this.D;
        dbsk.s(ghwVar2);
        cqkx.p(ghwVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(boolean z) {
        ghw ghwVar = this.D;
        dbsk.s(ghwVar);
        ghwVar.r(z);
        ghw ghwVar2 = this.D;
        dbsk.s(ghwVar2);
        cqkx.p(ghwVar2);
        this.ad = false;
    }

    public final void I(jjn jjnVar) {
        this.W.B(jjnVar);
    }

    public final boolean J() {
        ghw ghwVar = this.D;
        dbsk.s(ghwVar);
        return ghwVar.g().booleanValue();
    }

    public final void K() {
        if (((ExpandingScrollView) this.W).f == jjn.COLLAPSED) {
            if (this.D != null && this.q.f()) {
                ghw ghwVar = this.D;
                dbsk.s(ghwVar);
                ghwVar.o(false);
            }
            I(jjn.HIDDEN);
            H(true);
        }
    }

    public final void L() {
        if (((ExpandingScrollView) this.W).f == jjn.HIDDEN) {
            if (this.D != null && this.q.f()) {
                ghw ghwVar = this.D;
                dbsk.s(ghwVar);
                ghwVar.o(false);
            }
            I(jjn.COLLAPSED);
            H(false);
        }
    }

    public final boolean M() {
        return this.ad && ad(this.k, this.w, this.q);
    }

    public final void N() {
        brla.b(this.F, this.a.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dcdc<ghs<?>> O() {
        return dcdc.r(this.B);
    }

    public final synchronized ghs<?> P(int i) {
        return this.B.get(i);
    }

    public final synchronized void Q(ghs<?> ghsVar, int i) {
        if (i >= 0) {
            if (i <= S()) {
                bsop bsopVar = this.C;
                bsopVar.b.add(i, ghsVar.e());
                this.B.add(i, ghsVar);
            }
        }
    }

    public final synchronized void R() {
        this.C.b.clear();
        this.B.clear();
    }

    public final synchronized int S() {
        return this.B.size();
    }

    public final void a(boolean z, jjn jjnVar) {
        if (this.G != z) {
            this.G = z;
            this.T.b(jjnVar);
            this.T.c();
        }
    }

    public final void b(int i) {
        this.v.C = i;
    }

    @Override // defpackage.ghu
    public final void c(ghw ghwVar, int i, int i2, @dzsi cjqm cjqmVar) {
        V(ghwVar, i, i2, i2 == 1, false, cjqmVar);
    }

    public final void d(boolean z, boolean z2) {
        ghw ghwVar = this.D;
        if (ghwVar == null) {
            return;
        }
        V(ghwVar, A(), 0, z, z2, null);
    }

    public final void e(int i) {
        ghw ghwVar = this.D;
        dbsk.s(ghwVar);
        V(ghwVar, i, 0, false, false, null);
    }

    public final void f(int i, bssu bssuVar, boolean z) {
        if (i < 0 || i > S()) {
            return;
        }
        Q(new ghs<>(cqgr.fT(new bsov(z), bssuVar.b()), null, true, bsob.f(i), null, null), i);
    }

    public final void g(int i) {
        if (w(i) && (P(i).a().a() instanceof bsov)) {
            ai(i);
        }
    }

    public final boolean h(int i) {
        return w(i) && P(i).e().equals(bsob.f(i));
    }

    @dzsi
    public final brwu i(int i) {
        if (!w(i)) {
            return null;
        }
        ghs<?> P = P(i);
        if (!(P.a().b() instanceof brwu)) {
            return null;
        }
        return (brwu) P.a().b();
    }

    public final void j() {
        int i = this.ac;
        if (i >= 0) {
            e(i);
            this.H = null;
            this.ac = -1;
        }
    }

    public final void k() {
        bvrj.UI_THREAD.c();
        if (this.n.b()) {
            int A = A();
            boolean z = false;
            if (this.V || this.X || h(A) || !w(A)) {
                this.v.Z(false);
                return;
            }
            ilo y = y(A);
            if (y != null && !y.ba() && !y.bb()) {
                z = true;
            }
            this.v.Z(z);
        }
    }

    public final void l() {
        q();
        a(false, jjn.HIDDEN);
    }

    public final synchronized void m(bssu bssuVar, brlu brluVar) {
        boolean z;
        ghs<brve> a;
        List<cqkp> p = bssuVar.p();
        if (bssuVar != null && p != null) {
            if (this.D == null) {
                this.D = s();
            }
            this.Z = brluVar;
            this.Y = brluVar.x();
            ghw ghwVar = this.D;
            dbsk.s(ghwVar);
            this.B = ghwVar.a();
            dcdc<cqkp> r = dcdc.r(dcbg.b(dcbg.b(p).o(bsnq.a).o(bsnr.a).z()).A(new bsoa(this)));
            ArrayList arrayList = new ArrayList();
            for (cqkp cqkpVar : r) {
                bnju B = B(cqkpVar);
                if (B != null) {
                    arrayList.add(B.aH());
                }
            }
            boolean z2 = false;
            for (int i = 0; i < S(); i++) {
                ilo y = y(i);
                if (y != null && i < arrayList.size() && arrayList.get(i).ai().equals(y.ai())) {
                }
                z = false;
            }
            z = true;
            this.X = bssuVar.l().booleanValue() && bssuVar.k() != null;
            this.aa = this.y;
            this.ab = this.z;
            if (z && arrayList.size() == S() && this.H == null && !this.X && !bssuVar.g().booleanValue()) {
                return;
            }
            if (this.s.size() == r.size() && this.s.keySet().containsAll(r)) {
                z2 = true;
            }
            boolean containsAll = this.B.containsAll(this.s.values());
            if (!r.isEmpty() && z2 && containsAll) {
                ae();
                return;
            }
            int Z = Z(arrayList);
            this.ac = Z;
            if (!z || Z != -1) {
                R();
                this.ae = -1;
            }
            if (ah()) {
                Y(arrayList);
            }
            for (int S = S(); S < r.size(); S++) {
                brwk brwkVar = (brwk) r.get(S);
                if (this.s.containsKey(brwkVar)) {
                    a = this.s.get(brwkVar);
                    af(a, brwkVar);
                } else {
                    a = this.h.a(brwkVar, this.x, this.A, this.t, this.u);
                    this.s.put(brwkVar, a);
                }
                if (D()) {
                    U(a, -1.0f);
                }
                ag(a);
            }
            X(bssuVar);
        }
    }

    public final synchronized void n(bssu bssuVar, brlu brluVar) {
        this.Z = brluVar;
        this.Y = brluVar.x();
        this.B = s().a();
        dcdc z = dcbg.b(bssuVar.p()).o(bsns.a).z();
        this.aa = this.y;
        this.ab = this.z;
        if (brluVar.al() || (brluVar.ah() && brluVar.E() == 0)) {
            this.s.clear();
        }
        this.ac = Z(brluVar.c());
        R();
        Y(brluVar.c());
        for (int S = S(); S < z.size(); S++) {
            cqkp cqkpVar = (cqkp) z.get(S);
            if (cqkpVar instanceof bssr) {
                f(S, bssuVar, false);
            } else if ((cqkpVar instanceof brwk) && this.s.containsKey(cqkpVar)) {
                brwk brwkVar = (brwk) cqkpVar;
                if (this.s.containsKey(brwkVar)) {
                    ghs<brve> ghsVar = this.s.get(brwkVar);
                    dbsk.s(ghsVar);
                    af(ghsVar, brwkVar);
                    if (D()) {
                        U(ghsVar, -1.0f);
                    }
                    g(S);
                    Q(ghsVar, S);
                }
            }
        }
        this.X = bssuVar.l().booleanValue() && bssuVar.k() != null;
        X(bssuVar);
        int max = Math.max(A(), 0);
        if (!this.G || brluVar.ah() || this.X || !h(max)) {
            return;
        }
        e(max);
    }

    public final int p(ilo iloVar) {
        for (int i = 0; i < S(); i++) {
            ilo y = y(i);
            if (y != null && y.cr(iloVar)) {
                return i;
            }
        }
        return -1;
    }

    public final void q() {
        ghw ghwVar = this.D;
        if (ghwVar == null) {
            return;
        }
        ghwVar.n(-1, true);
        this.D.p(null, true);
        brmk brmkVar = this.U;
        if (brmkVar == null) {
            return;
        }
        brmkVar.j = null;
    }

    public final void r() {
        int i;
        int i2 = this.aa;
        boolean z = true;
        if ((i2 <= 0 || i2 == this.y) && ((i = this.ab) <= 0 || i == this.z)) {
            z = false;
        }
        if (!this.G || ((ExpandingScrollView) this.W).f != jjn.COLLAPSED || !z) {
            return;
        }
        this.T.b(jjn.HIDDEN);
    }

    public final ghw s() {
        if (this.D == null) {
            this.D = this.O.a(this, this.k.getCategoricalSearchParameters().a());
        }
        ghw ghwVar = this.D;
        dbsk.s(ghwVar);
        return ghwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(int i, boolean z, boolean z2) {
        ilo y;
        ilo y2;
        if (w(i) && (y = y(i)) != null) {
            if (this.q.f()) {
                ghl ghlVar = this.d;
                ghlVar.e = 2000;
                ghlVar.f = 2;
            } else {
                ghl ghlVar2 = this.d;
                ghlVar2.e = 500;
                ghlVar2.f = 1;
            }
            akqq akqqVar = null;
            if (w(this.ae) && this.ae != i && !this.q.f() && (y2 = y(this.ae)) != null) {
                akqqVar = y2.aj();
            }
            bsoe bsoeVar = new bsoe(this, y);
            akqq aj = y.aj();
            if (z && aj != null) {
                if (akqqVar != null) {
                    this.d.b(aj, akqqVar, bsoeVar);
                } else if (z2) {
                    this.d.d(this.Y, aj);
                } else {
                    this.d.c(y);
                }
            }
            if (bsoeVar.a) {
                return;
            }
            this.d.e(y);
        }
    }

    public final void u(@dzsi ilo iloVar, boolean z, boolean z2) {
        ilo x;
        if (iloVar == null) {
            return;
        }
        ghl ghlVar = this.d;
        ghlVar.e = 500;
        ghlVar.f = 1;
        akqq akqqVar = null;
        if (w(this.ae) && (x = x(this.ae)) != null && !x.cr(iloVar)) {
            akqqVar = x.aj();
        }
        bsoe bsoeVar = new bsoe(this, iloVar);
        akqq aj = iloVar.aj();
        if (z && aj != null) {
            if (akqqVar != null) {
                this.d.b(aj, akqqVar, bsoeVar);
            } else if (z2) {
                this.d.d(this.Y, aj);
            } else {
                this.d.c(iloVar);
            }
        }
        if (bsoeVar.a) {
            return;
        }
        this.d.e(iloVar);
    }

    public final void v(ilo iloVar) {
        this.d.e(iloVar);
    }

    public final boolean w(int i) {
        return i >= 0 && i < S();
    }

    @dzsi
    public final ilo x(int i) {
        bwrs<ilo> bwrsVar;
        brlu brluVar = this.Z;
        if (brluVar != null && i >= 0 && i < brluVar.E() && (bwrsVar = this.Z.D(i).a) != null) {
            return bwrsVar.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v3, types: [cqkp] */
    @dzsi
    public final ilo y(int i) {
        bnju B;
        if (w(i) && (B = B(P(i).a().b())) != null) {
            return B.aH();
        }
        return null;
    }

    final boolean z(int i) {
        if (this.D != null && !this.af) {
            int S = S();
            if (S() > 4 && i >= S - 4) {
                return true;
            }
        }
        return false;
    }
}
