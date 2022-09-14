package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: afwg  reason: default package */
/* loaded from: classes2.dex */
public class afwg implements afva {
    public final btxv A;
    public final dehq B;
    public final cztz C;
    public List<afuz> D;
    public List<afuz> E;
    public final btyh F;
    public final afwk G;
    private final btvo H;
    private final bttf I;
    private final bhhf J;
    private final dxio<akfa> K;
    private final List<afuz> L;
    private final List<afuz> M;
    private List<afuz> N;
    private List<afuz> O;
    private final List<afuz> P;
    private final List<afuz> Q;
    private final List<afuz> R;
    private final List<afuz> S;
    private final List<afuz> U;
    private final List<afuz> V;
    private final List<afuz> W;
    private final List<afuz> X;
    private final AtomicBoolean Y = new AtomicBoolean(false);
    private final crzp<btlu> Z;
    public final Activity a;
    private dkiy aa;
    private dkpa ab;
    private dkvl ac;
    public final eeu b;
    public final efc c;
    public final cjqy d;
    public final cjxd e;
    public final bvjj f;
    public final axxf g;
    public final axxi h;
    public final dxio<afwt> i;
    public final dxio<anhg> j;
    public final dxio<ascb> k;
    public final dxio<avik> l;
    public final dxio<axwy> m;
    public final dxio<apsa> n;
    public final dxio<cafi> o;
    public final dxio<ceet> p;
    public final dxio<axjh> q;
    public final dxio<chnm> r;
    public final dxio<ahwf> s;
    public final dxio<apyz> t;
    public final dxio<arfm> u;
    public final dxio<cqg> v;
    public final dxio<bsvm> w;
    public final dxio<ache> x;
    public final dxio<bycs> y;
    public final dxio<cjxl> z;

    public afwg(Activity activity, eeu eeuVar, efc efcVar, btxv btxvVar, dehq dehqVar, cztz cztzVar, cjqy cjqyVar, btvo btvoVar, cjxd cjxdVar, bvjj bvjjVar, bttf bttfVar, cqhn cqhnVar, btyh btyhVar, axxf axxfVar, axxi axxiVar, afwk afwkVar, bhhf bhhfVar, dxio<afwr> dxioVar, dxio<afwt> dxioVar2, dxio<anhg> dxioVar3, dxio<ascb> dxioVar4, dxio<avik> dxioVar5, dxio<axwy> dxioVar6, dxio<bnlf> dxioVar7, dxio<apsa> dxioVar8, dxio<cafi> dxioVar9, dxio<ceet> dxioVar10, dxio<axjh> dxioVar11, dxio<chnm> dxioVar12, dxio<ahwf> dxioVar13, dxio<arfm> dxioVar14, dxio<cqg> dxioVar15, dxio<bsvm> dxioVar16, dxio<ache> dxioVar17, dxio<apyz> dxioVar18, dxio<bycs> dxioVar19, dxio<akfa> dxioVar20, akfc akfcVar, dxio<afwp> dxioVar21, dxio<cjxl> dxioVar22, Boolean bool) {
        gie a;
        String string;
        dcdc f;
        this.a = activity;
        this.b = eeuVar;
        this.c = efcVar;
        this.d = cjqyVar;
        this.H = btvoVar;
        this.e = cjxdVar;
        this.g = axxfVar;
        this.h = axxiVar;
        this.J = bhhfVar;
        dxioVar.a().l();
        this.i = dxioVar2;
        this.j = dxioVar3;
        this.k = dxioVar4;
        this.l = dxioVar5;
        this.m = dxioVar6;
        this.n = dxioVar8;
        this.o = dxioVar9;
        this.p = dxioVar10;
        this.q = dxioVar11;
        this.r = dxioVar12;
        this.s = dxioVar13;
        this.u = dxioVar14;
        this.v = dxioVar15;
        this.w = dxioVar16;
        this.x = dxioVar17;
        this.t = dxioVar18;
        this.y = dxioVar19;
        this.f = bvjjVar;
        this.I = bttfVar;
        this.z = dxioVar22;
        gid b = gie.b(ibr.k);
        b.b = ibm.c();
        b.b(24.0d);
        this.V = dcdc.f(new afvq(this, b.a(), activity.getString(R.string.WIFI_ONLY_TITLE), cjtd.b));
        this.K = dxioVar20;
        this.D = q();
        dccx F = dcdc.F();
        if (btvoVar.getNavigationParameters().A()) {
            gid b2 = gie.b(ibr.g);
            b2.b = ibm.c();
            b2.b(24.0d);
            F.g(new afvz(this, b2.a(), activity.getString(R.string.DRIVING_MODE_SIDE_MENU_ITEM), cjtd.a(dtye.i)));
        }
        this.L = F.f();
        gid b3 = gie.b(ibr.b);
        b3.b = ibm.c();
        b3.b(24.0d);
        this.M = dcdc.f(new afwa(this, b3.a(), activity.getString(R.string.OFFLINE_MAPS_TITLE), cjtd.a(dtye.n)));
        this.W = dcdc.e();
        this.aa = btvoVar.getEnableFeatureParameters();
        this.ab = btvoVar.getMerchantModeParameters();
        this.ac = btvoVar.getPrivacyAdvisorParameters();
        this.N = z();
        this.O = A();
        this.E = dcdc.e();
        dccx F2 = dcdc.F();
        gid b4 = gie.b(iro.a);
        b4.b = ibm.j();
        b4.b(24.0d);
        gie a2 = b4.a();
        String string2 = activity.getString(R.string.LAYER_GOOGLE_EARTH);
        cjtd a3 = cjtd.a(dtye.j);
        gid b5 = gie.b(iro.b);
        b5.b = ibm.j();
        F2.g(new afvj(this, a2, string2, a3, b5.a(), cjtd.b));
        this.P = F2.f();
        dccx F3 = dcdc.F();
        if (btvoVar.getUgcParameters().h()) {
            F3.g(new afvk(this, activity.getString(R.string.ADD_A_MISSING_PLACE), cjtd.a(dtxj.L)));
        }
        F3.g(new afvl(this, activity.getString(R.string.SETTINGS), cjtd.a(dtxv.t)));
        F3.g(new afvo(this, activity.getString(R.string.HELP), cjtd.a(dtyi.M)));
        if ("FR".equals(bttfVar.a())) {
            F3.g(new afvp(this, activity.getString(R.string.CONSUMER_INFORMATION), cjtd.a(dtxv.m)));
        }
        F3.g(new afvs(this, activity.getString(R.string.SEND_FEEDBACK), cjtd.a(dtyi.N)));
        this.Q = F3.f();
        dccx F4 = dcdc.F();
        boolean o = dxioVar12.a().o();
        if (o || !dxioVar10.a().e()) {
            if (o) {
                gid a4 = iro.a();
                a4.b = ibm.c();
                a4.b(18.0d);
                a = a4.a();
            } else {
                gid a5 = ibr.a();
                a5.b = ibm.c();
                a5.b(24.0d);
                a = a5.a();
            }
            if (o) {
                string = activity.getString(R.string.YOUR_PROFILE_SIDE_MENU_BUTTON);
            } else {
                string = activity.getString(R.string.CONTRIBUTIONS);
            }
            F4.g(new afvg(this, a, string, cjtd.b, o));
            if (o) {
                gid a6 = ibr.a();
                a6.b = ibm.c();
                a6.b(24.0d);
                F4.g(new afvh(this, a6.a(), activity.getString(R.string.CONTRIBUTE_SIDE_MENU_BUTTON), cjtd.a(dtxv.n)));
            }
            f = F4.f();
        } else {
            gid a7 = ibr.a();
            a7.b = ibm.c();
            a7.b(24.0d);
            F4.g(new afwc(this, a7.a(), activity.getString(R.string.CONTRIBUTIONS), cjtd.a(dtxv.v)));
            gid a8 = iro.a();
            a8.b = ibm.c();
            a8.b(18.0d);
            F4.g(new afvf(this, a8.a(), activity.getString(R.string.YOUR_PROFILE_SIDE_MENU_BUTTON), cjtd.b));
            f = F4.f();
        }
        this.S = f;
        this.R = dchl.a();
        this.A = btxvVar;
        this.B = dehqVar;
        this.C = cztzVar;
        this.F = btyhVar;
        this.G = afwkVar;
        dccx F5 = dcdc.F();
        if (dxioVar18.a().o()) {
            gid b6 = gie.b(ibr.e);
            b6.b = ibm.c();
            b6.b(24.0d);
            F5.g(new afvi(this, b6.a(), activity.getString(R.string.MESSAGES), cjtd.a(dtxv.q)));
        }
        this.U = F5.f();
        dccx F6 = dcdc.F();
        F6.g(new afvt(this, activity.getString(R.string.PRIVACY_POLICY), cjtd.a(dtxv.r)));
        F6.g(new afvu(this, activity.getString(R.string.TERMS_OF_SERVICE), cjtd.a(dtxv.u)));
        this.X = F6.f();
        this.Z = new crzp(this) { // from class: afvb
            private final afwg a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                afwg afwgVar = this.a;
                afwgVar.E = dcdc.e();
                afwgVar.y();
            }
        };
        y();
    }

    private final List<afuz> A() {
        if (this.H.getEnableFeatureParameters().z) {
            return dcdc.f(new afwd(this, this.H.getLocationSharingParameters()));
        }
        return dcdc.e();
    }

    private final List<afuz> z() {
        dccx F = dcdc.F();
        arfk c = this.u.a().C().c();
        if (c != null && c.e() != null && c.c == arfj.MAP_LOADED) {
            gie a = gie.b(ibr.f).a();
            dvcx e = c.e();
            dbsk.s(e);
            dvcr dvcrVar = e.b;
            if (dvcrVar == null) {
                dvcrVar = dvcr.h;
            }
            F.g(new afwb(this, a, dvcrVar.b, cjtd.a(dtye.m), c));
        }
        return F.f();
    }

    @Override // defpackage.afva
    public List<afuz> a() {
        return this.D;
    }

    @Override // defpackage.afva
    public List<afuz> b() {
        return this.L;
    }

    @Override // defpackage.afva
    public List<afuz> c() {
        return this.M;
    }

    @Override // defpackage.afva
    public List<afuz> d() {
        return this.N;
    }

    @Override // defpackage.afva
    public List<afuz> e() {
        return this.O;
    }

    @Override // defpackage.afva
    public List<afuz> f() {
        return this.E;
    }

    @Override // defpackage.afva
    public List<afuz> g() {
        return this.P;
    }

    @Override // defpackage.afva
    public List<afuz> h() {
        return this.Q;
    }

    @Override // defpackage.afva
    public List<afuz> i() {
        return this.X;
    }

    @Override // defpackage.afva
    public List<afuz> j() {
        return this.R;
    }

    @Override // defpackage.afva
    public List<afuz> k() {
        return this.S;
    }

    @Override // defpackage.afva
    public List<afuz> l() {
        return this.V;
    }

    @Override // defpackage.afva
    public List<afuz> m() {
        return this.U;
    }

    @Override // defpackage.afva
    public boolean n() {
        return false;
    }

    @Override // defpackage.afva
    public List<afuz> o() {
        return this.W;
    }

    @Override // defpackage.afva
    public boolean p() {
        return this.F.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<afuz> q() {
        dccx F = dcdc.F();
        gid b = gie.b(ibr.h);
        b.b = ibm.c();
        b.b(24.0d);
        F.g(new afvw(this, b.a(), this.a.getString(R.string.YOUR_PLACES), cjtd.b));
        if (this.H.getEnableFeatureParameters().aa) {
            gid b2 = gie.b(ibr.j);
            b2.b = ibm.c();
            b2.b(24.0d);
            F.g(new afvx(this, b2.a(), this.a.getString(R.string.YOUR_TIMELINE), cjtd.a(dtyi.dn)));
        }
        if (this.J.c()) {
            int t = this.f.t(bvjk.jp, this.K.a().j(), 0);
            if (t > 0) {
                gid b3 = gie.b(iro.c);
                b3.b = ibm.c();
                b3.b(24.0d);
                F.g(new afvy(this, b3.a(), this.a.getResources().getQuantityString(R.plurals.YOUR_BUSINESS_PROFILE, t), cjtd.a(dtxv.p)));
            }
        }
        return F.f();
    }

    public final void r() {
        this.B.execute(new Runnable(this) { // from class: afvc
            private final afwg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afwg afwgVar = this.a;
                String string = afwgVar.a.getString(R.string.HELP_NOT_AVAILABLE_OFFLINE);
                cztq a = cztt.a(afwgVar.C);
                a.c = string;
                a.c();
            }
        });
    }

    public void s(afuz afuzVar) {
        this.R.add(afuzVar);
        y();
    }

    public boolean t() {
        return this.R.isEmpty();
    }

    public void u() {
        if (!this.Y.get()) {
            this.K.a().C().d(this.Z, this.B);
            this.Y.set(true);
        }
    }

    public void v() {
        if (this.Y.get()) {
            this.K.a().C().c(this.Z);
            this.Y.set(false);
        }
    }

    public void w() {
        this.N = z();
        y();
    }

    public void x() {
        boolean z;
        dkiy enableFeatureParameters = this.H.getEnableFeatureParameters();
        boolean z2 = false;
        boolean z3 = true;
        if (this.aa.aa != enableFeatureParameters.aa) {
            this.D = q();
            z = true;
        } else {
            z = false;
        }
        if (this.aa.z != enableFeatureParameters.z) {
            this.O = A();
            z = true;
        }
        dkpa merchantModeParameters = this.H.getMerchantModeParameters();
        dkpa dkpaVar = this.ab;
        bhhf bhhfVar = this.J;
        if (dkpaVar.d != merchantModeParameters.d && bhhfVar.c()) {
            z2 = true;
        }
        boolean z4 = z | z2;
        dkvl privacyAdvisorParameters = this.H.getPrivacyAdvisorParameters();
        if (this.ac.a != privacyAdvisorParameters.a) {
            this.E = dcdc.e();
        } else {
            z3 = z4;
        }
        this.aa = enableFeatureParameters;
        this.ab = merchantModeParameters;
        this.ac = privacyAdvisorParameters;
        if (z3) {
            y();
        }
    }

    public final void y() {
        if (((efh) this.b).c) {
            return;
        }
        cqkx.p(this);
    }
}
