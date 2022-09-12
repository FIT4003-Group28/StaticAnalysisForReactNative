package defpackage;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.apps.gmm.base.views.drawerlayout.GmmDrawerLayout;
import com.google.android.apps.maps.R;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afuu  reason: default package */
/* loaded from: classes.dex */
public final class afuu extends itb implements afwr, afwt, jkh {
    public static final dcdn<dosc, afwm> a;
    afwg A;
    private final dxio<glj> B;
    private final btvo C;
    private final bwqv D;
    private final akox E;
    private final dxio<akzh> F;
    private final crzp<btlu> G;
    @dzsi
    private afut H;
    @dzsi
    private crzm<dbsg<Integer>> I;
    private final btxv K;
    private final dzsj<afwg> L;
    private final dxio<arfm> M;
    private final dxio<byej> N;
    private final dxio<afha> O;
    private final dxio<btxc> P;
    private final gcg Q;
    private final dxio<gce> R;
    private FrameLayout T;
    private crzp<dbsg<Integer>> U;
    private crzp<Boolean> V;
    private final afow W;
    private final busn X;
    private final aftw Y;
    public final gga b;
    public final efd c;
    public final bvjj d;
    public final btrm e;
    public final cjqy f;
    public final cjqq g;
    public final eeu h;
    public final efc i;
    public final akfa j;
    public GmmDrawerLayout p;
    @dzsi
    public btlu q;
    public final bzmi r;
    public final dxio<bzmm> s;
    public final dxio<axxi> t;
    public final Executor u;
    public final afox v;
    public final bhhf w;
    public final cqhn x;
    public final cpv y;
    public final cjmt z;
    private boolean J = false;
    public boolean k = false;
    public boolean o = false;
    private final crzp<btvo> S = new crzp(this) { // from class: afue
        private final afuu a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            afwg afwgVar = this.a.A;
            if (afwgVar != null) {
                afwgVar.x();
            }
        }
    };

    static {
        dcdg p = dcdn.p();
        p.f(dosc.TYPE_BICYCLING_LAYER, afwm.BICYCLING);
        p.f(dosc.TYPE_TERRAIN_LAYER, afwm.TERRAIN);
        p.f(dosc.TYPE_TRAFFIC_LAYER, afwm.TRAFFIC);
        p.f(dosc.TYPE_TRANSIT_LAYER, afwm.TRANSIT);
        a = dcjz.c(p.b());
    }

    public afuu(gga ggaVar, efd efdVar, bvjj bvjjVar, btrm btrmVar, cqhn cqhnVar, busn busnVar, dxio dxioVar, btvo btvoVar, cjqy cjqyVar, cjqq cjqqVar, eeu eeuVar, efc efcVar, bwqv bwqvVar, akox akoxVar, dxio dxioVar2, btxv btxvVar, dzsj dzsjVar, bzmi bzmiVar, bhhf bhhfVar, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6, dxio dxioVar7, dxio dxioVar8, Executor executor, akfa akfaVar, dxio dxioVar9, cpv cpvVar, gcg gcgVar, dxio dxioVar10, cjmt cjmtVar) {
        afus afusVar = new afus(this);
        this.W = afusVar;
        this.b = ggaVar;
        this.c = efdVar;
        this.d = bvjjVar;
        this.e = btrmVar;
        this.x = cqhnVar;
        this.X = busnVar;
        this.B = dxioVar;
        this.C = btvoVar;
        this.f = cjqyVar;
        this.g = cjqqVar;
        this.h = eeuVar;
        this.i = efcVar;
        this.D = bwqvVar;
        this.E = akoxVar;
        this.F = dxioVar2;
        this.K = btxvVar;
        this.u = executor;
        this.L = dzsjVar;
        this.r = bzmiVar;
        this.M = dxioVar3;
        this.N = dxioVar4;
        this.s = dxioVar5;
        this.O = dxioVar6;
        this.t = dxioVar7;
        this.P = dxioVar8;
        this.j = akfaVar;
        this.w = bhhfVar;
        this.y = cpvVar;
        this.Q = gcgVar;
        this.R = dxioVar10;
        this.z = cjmtVar;
        this.G = new crzp(this) { // from class: afuf
            private final afuu a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                afuu afuuVar = this.a;
                btlu j = afuuVar.j.j();
                afuuVar.t.a().h();
                if (!j.l() || dbsd.a(afuuVar.q, j)) {
                    if (j.m() || j.o()) {
                        afuuVar.d.X(bvjk.jp, afuuVar.q, 0);
                    }
                } else {
                    afuuVar.i();
                    afuuVar.f();
                }
                afuuVar.q = j;
            }
        };
        this.v = new afox(afusVar, bvjjVar, akoxVar, afox.a);
        this.Y = (aftw) dxioVar9.a();
        this.q = akfaVar.j();
    }

    private final void D() {
        dupo emergencyMenuItemParameters = this.C.getEmergencyMenuItemParameters();
        if (this.A.t()) {
            for (int i = 0; i < emergencyMenuItemParameters.a.size(); i++) {
                dupn dupnVar = emergencyMenuItemParameters.a.get(i);
                this.A.s(new afuy(this.b, this, this.O, dupnVar.a, dupnVar.b, dupnVar.c, dupnVar.d));
            }
        }
    }

    private final void E() {
        int e = cqrp.d(64.0d).e(this.b);
        int i = this.b.getResources().getDisplayMetrics().widthPixels;
        int e2 = cqrp.d(320.0d).e(this.b);
        ViewGroup.LayoutParams layoutParams = this.T.getLayoutParams();
        layoutParams.width = (int) Math.min(i - e, e2);
        this.T.setLayoutParams(layoutParams);
    }

    private final boolean F() {
        if (this.d.m(bvjk.cR, true)) {
            duxt duxtVar = this.C.getMapLayersParameters().a;
            if (duxtVar == null) {
                duxtVar = duxt.c;
            }
            return duxtVar.a;
        }
        return false;
    }

    private final boolean G(Intent intent) {
        return this.b.getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void H() {
        this.k = false;
        this.p.setDrawerLockMode(1);
    }

    private final void I(afwm afwmVar, int i) {
        afuq afuqVar = new afuq(this, i);
        dcdc f = dcdc.f(afwmVar);
        dwjq bZ = dwjr.c.bZ();
        dhjx Z = this.E.Z();
        if (Z != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjr dwjrVar = (dwjr) bZ.b;
            Z.getClass();
            dwjrVar.b = Z;
            dwjrVar.a |= 1;
        }
        this.X.b(bZ.bK(), new afur(f, afuqVar), this.u);
    }

    public final boolean B() {
        return this.Q.a() && this.R.a().h();
    }

    public final void C(int i) {
        if (i == 1) {
            this.J = true;
            H();
        } else if (i == 3) {
            this.J = true;
        }
        if (this.o) {
            E();
        }
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (jjnVar2.b()) {
            H();
        } else if (this.J) {
        } else {
            s();
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        if (this.d.m(bvjk.E, false)) {
            this.v.g(true);
        } else if (this.C.getSatelliteParameters().c) {
            if (!this.d.m(bvjk.G, false)) {
                int s = this.d.s(bvjk.F, 0);
                if (this.v.d(afwm.SATELLITE)) {
                    if (s < 3) {
                        this.d.W(bvjk.F, s + 1);
                    }
                } else if (s > 0) {
                    this.d.W(bvjk.F, s - 1);
                }
            }
            this.v.g(false);
        }
        if (!F() || this.v.d(afwm.TRAFFIC) || this.v.d(afwm.TERRAIN) || this.v.d(afwm.SATELLITE) || this.v.d(afwm.BICYCLING)) {
            return;
        }
        this.v.j(true);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.p = (GmmDrawerLayout) this.b.findViewById(R.id.slidingpane_container);
        this.T = (FrameLayout) this.b.findViewById(R.id.side_menu_container);
        boolean z = true;
        if (this.b.r().c() != null) {
            C(1);
        }
        btrm btrmVar = this.e;
        dceq a2 = dcet.a();
        a2.b(gdt.class, new afuv(0, gdt.class, this));
        a2.b(ege.class, new afuv(1, ege.class, this));
        a2.b(btyi.class, new afuv(2, btyi.class, this, bvrj.UI_THREAD));
        a2.b(gdw.class, new afuv(3, gdw.class, this, bvrj.UI_THREAD));
        a2.b(acyv.class, new afuv(4, acyv.class, this, bvrj.UI_THREAD));
        a2.b(afws.class, new afuv(5, afws.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.j.C().d(this.G, this.u);
        this.P.a().a().d(this.S, this.u);
        this.p.setDrawerListener(new aful(this));
        this.B.a().e(this);
        if (this.H != null) {
            z = false;
        }
        dbsk.l(z);
        if (this.o) {
            D();
            this.H = new afut(this.D, this.M.a().C(), this.A);
        }
        this.v.a();
        f();
        if (this.Q.a()) {
            this.V = new crzp(this) { // from class: afui
                private final afuu a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    afuu afuuVar = this.a;
                    afuuVar.t(afuuVar.v.d(afwm.SATELLITE), afuuVar.B());
                }
            };
            this.R.a().g().d(this.V, this.u);
        }
        if (this.p.r()) {
            p();
        }
    }

    @Override // defpackage.itb
    public final void Nu() {
        afwg afwgVar = this.A;
        if (afwgVar != null) {
            afwgVar.v();
        }
        super.Nu();
        FrameLayout frameLayout = this.T;
        if (frameLayout != null) {
            frameLayout.setOnApplyWindowInsetsListener(null);
        }
        cqkf<afva> cqkfVar = this.Y.c;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }

    @Override // defpackage.itb
    public final void Po() {
        if (this.o) {
            afut afutVar = this.H;
            dbsk.s(afutVar);
            bwqv.t(afutVar.b, afutVar);
            this.H = null;
        } else {
            dbsk.l(this.H == null);
        }
        this.B.a().j(this);
        this.P.a().a().c(this.S);
        this.j.C().c(this.G);
        this.e.a(this);
        this.p.setDrawerListener(null);
        i();
        if (this.Q.a()) {
            this.R.a().g().c(this.V);
        }
        super.Po();
    }

    public final boolean e() {
        boolean z = false;
        if (this.o) {
            return false;
        }
        afwg a2 = this.L.a();
        this.A = a2;
        a2.u();
        f();
        D();
        aftw aftwVar = this.Y;
        FrameLayout frameLayout = this.T;
        new Runnable(this) { // from class: afug
            private final afuu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.q();
            }
        };
        afwg afwgVar = this.A;
        aftwVar.c = aftwVar.a.c(new aftv(aftwVar.b), frameLayout);
        aftwVar.c.e(afwgVar);
        E();
        this.o = true;
        if (this.H == null) {
            z = true;
        }
        dbsk.l(z);
        if (w()) {
            this.H = new afut(this.D, this.M.a().C(), this.A);
        }
        return true;
    }

    public final void f() {
        if (this.w.c() && this.I == null) {
            btlu j = this.j.j();
            if (!j.l()) {
                return;
            }
            this.I = this.d.u(bvjk.jp, j);
            crzp<dbsg<Integer>> crzpVar = new crzp(this) { // from class: afuh
                private final afuu a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    dbsg dbsgVar;
                    afuu afuuVar = this.a;
                    if (afuuVar.w.c() && afuuVar.A != null && (dbsgVar = (dbsg) crzmVar.l()) != null && dbsgVar.a()) {
                        afwg afwgVar = afuuVar.A;
                        afwgVar.D = afwgVar.q();
                        afwgVar.y();
                    }
                }
            };
            this.U = crzpVar;
            this.I.d(crzpVar, this.u);
        }
    }

    public final void i() {
        crzm<dbsg<Integer>> crzmVar = this.I;
        if (crzmVar != null) {
            crzmVar.c(this.U);
            this.I = null;
        }
    }

    @Override // defpackage.afwr
    public final void j(afwm afwmVar) {
        k(afwmVar, !this.v.d(afwmVar));
    }

    @Override // defpackage.afwr
    public final void k(afwm afwmVar, boolean z) {
        boolean z2;
        if (afwmVar.equals(afwm.TRANSIT) && !z && F()) {
            int s = this.d.s(bvjk.cQ, 0);
            duxt duxtVar = this.C.getMapLayersParameters().a;
            if (duxtVar == null) {
                duxtVar = duxt.c;
            }
            if (s >= duxtVar.b) {
                this.d.S(bvjk.cR, false);
            }
            this.d.W(bvjk.cQ, s + 1);
        }
        int ordinal = afwmVar.ordinal();
        if (ordinal == 0) {
            if (z != this.v.d(afwm.TRAFFIC)) {
                this.v.i(z);
                if (!z) {
                    this.N.a().f();
                } else {
                    I(afwm.TRAFFIC, R.string.TRAFFIC_LAYER_UNAVAILABLE);
                }
                z2 = true;
            }
            z2 = false;
        } else if (ordinal == 1) {
            if (z != this.v.d(afwm.BICYCLING)) {
                this.v.f(z);
                if (z) {
                    I(afwm.BICYCLING, R.string.BICYCLING_LAYER_UNAVAILABLE);
                }
                z2 = true;
            }
            z2 = false;
        } else if (ordinal == 2) {
            if (z != this.v.d(afwm.TRANSIT)) {
                this.v.j(z);
                z2 = true;
            }
            z2 = false;
        } else if (ordinal == 3) {
            if (z != this.v.d(afwm.SATELLITE)) {
                this.v.g(z);
                z2 = true;
            }
            z2 = false;
        } else if (ordinal == 4) {
            if (z != this.v.d(afwm.TERRAIN)) {
                this.v.h(z);
                z2 = true;
            }
            z2 = false;
        } else if (ordinal == 7) {
            if (z != this.v.d(afwm.THREE_DIMENSIONAL)) {
                this.v.c(afwm.THREE_DIMENSIONAL, z);
                z2 = true;
            }
            z2 = false;
        } else {
            if (ordinal == 8 && z != this.v.d(afwm.COVID19)) {
                this.v.c(afwm.COVID19, z);
                if (z) {
                    if (!this.C.getPassiveAssistParameters().r()) {
                        gei.a(this.b, new gbl());
                    } else {
                        this.b.D(new fzr());
                    }
                }
                z2 = true;
            }
            z2 = false;
        }
        if (afwmVar == afwm.SATELLITE && z && z2 && this.C.getSatelliteParameters().c && !this.d.m(bvjk.E, false) && !this.d.m(bvjk.G, false) && this.d.s(bvjk.F, 0) >= 3) {
            Resources resources = this.b.getResources();
            new AlertDialog.Builder(this.b).setTitle(resources.getString(R.string.SATELLITE_KEEP_ON_DIALOG_TITLE)).setMessage(resources.getString(R.string.SATELLITE_KEEP_ON_DIALOG_MESSAGE)).setCancelable(true).setNegativeButton(R.string.NO_BUTTON, new afuo(this)).setPositiveButton(R.string.YES_BUTTON, new afun(this)).create().show();
            this.g.g().d(cjtd.a(dtyb.a));
        }
        if (!z || !z2) {
            return;
        }
        this.K.a(new afum(this, afwmVar));
    }

    @Override // defpackage.afwr
    public final afwo l() {
        return this.v;
    }

    @Override // defpackage.afwt
    public final void m() {
        Runnable runnable = new Runnable(this) { // from class: afuk
            private final afuu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        };
        alad p = this.F.a().p();
        dbsk.s(p);
        akra akraVar = p.j;
        int i = akraVar.i();
        int m = akraVar.m();
        String a2 = bvpb.a(i);
        String a3 = bvpb.a(m);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
        sb.append(a2);
        sb.append(",");
        sb.append(a3);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "geo:%s?z=%d&h=%f&t=%f&s=0", sb.toString(), Integer.valueOf(Math.round(p.k)), Float.valueOf(p.m), Float.valueOf(p.l))));
        intent.setClassName("com.google.earth", "com.google.earth.EarthActivity");
        if (!G(intent)) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.earth"));
            if (G(intent2)) {
                this.O.a().n(this.b, intent2, 1, runnable);
                return;
            } else {
                n();
                return;
            }
        }
        this.O.a().n(this.b, intent, 1, runnable);
    }

    public final void n() {
        Toast.makeText(this.b, this.b.getString(R.string.GOOGLE_EARTH_NOT_AVAILABLE), 0).show();
    }

    @Override // defpackage.afwt
    public final boolean o() {
        return this.p.r();
    }

    @Override // defpackage.afwt
    public final void p() {
        if (!w()) {
            return;
        }
        if (e()) {
            new afup(this, this.T);
            return;
        }
        s();
        cqkx.p(this.A);
        this.p.q();
    }

    @Override // defpackage.afwt
    public final void q() {
        GmmDrawerLayout gmmDrawerLayout = this.p;
        View h = gmmDrawerLayout.h(8388611);
        if (h != null) {
            gmmDrawerLayout.l(h);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + ank.i(8388611));
    }

    @Override // defpackage.afwt
    public final void r(boolean z) {
        this.p.setTransparent(z);
    }

    public final void s() {
        this.k = true;
        this.p.setDrawerLockMode(0);
    }

    public final void t(boolean z, boolean z2) {
        ImageView imageView = (ImageView) this.b.findViewById(R.id.watermark_image);
        if (imageView != null) {
            int i = 2131231887;
            if (!z && !z2) {
                i = 2131231885;
            }
            imageView.setImageResource(i);
        }
    }
}
