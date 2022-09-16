package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: yca  reason: default package */
/* loaded from: classes7.dex */
public class yca implements xzo {
    @dzsi
    private final xkl A;
    private final ycx B;
    @dzsi
    private final cqtd C;
    @dzsi
    private final String D;
    @dzsi
    private final wpv E;
    @dzsi
    private final String F;
    @dzsi
    private final xzk G;
    @dzsi
    private final xzn H;
    @dzsi
    private final xzn I;
    private final boolean J;
    private final Boolean K;
    private final boolean L;
    private final bzgf M;
    private final bzgf N;
    public final byyp a;
    @dzsi
    public final acpa b;
    public boolean c;
    public boolean d;
    final bzgj e;
    private final Context f;
    private final dpdy g;
    private final int h;
    private final dotv i;
    private final cqss j;
    private final zvb k;
    private final List<xyt> l;
    private final cqss m;
    private final cjta n;
    private final xyu o;
    private final xzl p;
    private final List q;
    @dzsi
    private final zcv r;
    @dzsi
    private final jhk s;
    @dzsi
    private final jhk t;
    @dzsi
    private final jhk u;
    @dzsi
    private final CharSequence v;
    @dzsi
    private final CharSequence w;
    @dzsi
    private final Runnable x;
    @dzsi
    private final xzm y;
    @dzsi
    private final xyu z;

    public yca(ybz ybzVar) {
        bzgj bzgjVar = new bzgj();
        this.e = bzgjVar;
        bzgf bzgfVar = new bzgf(this) { // from class: ybt
            private final yca a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                cqkx.p(this.a);
            }
        };
        this.M = bzgfVar;
        bzgf bzgfVar2 = new bzgf(this) { // from class: ybu
            private final yca a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                yca ycaVar = this.a;
                if (ycaVar.W(ycaVar.a.c())) {
                    if (!ycaVar.d && !ycaVar.c && ycaVar.i().booleanValue()) {
                        ycaVar.k();
                    }
                    ycaVar.d = true;
                    cqkx.p(ycaVar);
                    for (xyt xytVar : ycaVar.s()) {
                        cqkx.p(xytVar);
                    }
                }
            }
        };
        this.N = bzgfVar2;
        this.f = ybzVar.l;
        this.g = ybzVar.a;
        this.h = ybzVar.b;
        this.c = ybzVar.c;
        this.o = ybzVar.o;
        this.i = ybzVar.e;
        this.k = ybzVar.g;
        this.v = ybzVar.t;
        this.w = ybzVar.u;
        this.j = ybzVar.f;
        this.s = ybzVar.q;
        this.p = ybzVar.p;
        boolean z = ybzVar.I;
        this.J = z;
        this.D = ybzVar.z;
        this.C = ybzVar.y;
        this.m = ycz.b(ybzVar.e);
        this.l = ybzVar.h;
        this.x = ybzVar.v;
        this.y = ybzVar.d;
        this.r = ybzVar.j;
        this.n = ybzVar.k;
        this.z = ybzVar.w;
        Boolean valueOf = Boolean.valueOf(ybzVar.J);
        this.K = valueOf;
        ycx ycxVar = ybzVar.L;
        this.B = ycxVar;
        ycxVar.c(ybzVar.l);
        xkl xklVar = ybzVar.x;
        this.A = xklVar;
        this.E = ybzVar.A;
        this.b = ybzVar.B;
        if (!z) {
            this.t = ybzVar.r;
        } else {
            this.t = null;
        }
        if (valueOf.booleanValue()) {
            this.u = ybzVar.s;
        } else {
            this.u = null;
        }
        if (xklVar != null) {
            bzgg.b(bzgfVar, xklVar, bzgjVar, ybzVar.F);
        }
        this.F = ybzVar.C;
        byyp byypVar = ybzVar.D;
        this.a = byypVar;
        bzgg.b(bzgfVar2, byypVar, bzgjVar, ybzVar.F);
        this.q = ybzVar.i;
        this.L = ybzVar.K;
        this.G = ybzVar.E;
        this.I = ybzVar.H;
        this.H = ybzVar.G;
    }

    private final cjta X(ddho ddhoVar) {
        cjta cjtaVar = this.n;
        cjtaVar.d = ddhoVar;
        return cjtaVar;
    }

    @Override // defpackage.xzo
    @dzsi
    public acpa A() {
        return this.b;
    }

    @Override // defpackage.xzo
    public cqkn<xzo> B() {
        return new cqkn(this) { // from class: ybw
            private final yca a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                View a;
                xzo xzoVar = (xzo) cqkpVar;
                if (this.a.b == null || (a = cqhu.a(view, acpa.a)) == null) {
                    return;
                }
                a.performClick();
            }
        };
    }

    @Override // defpackage.xzo
    @dzsi
    public wpv C() {
        return this.E;
    }

    @Override // defpackage.xzo
    @dzsi
    public jhk D() {
        return this.t;
    }

    @Override // defpackage.xzo
    @dzsi
    public jhk E() {
        return this.u;
    }

    @Override // defpackage.xzo
    @dzsi
    public String F() {
        return this.F;
    }

    @Override // defpackage.xzo
    public Boolean G() {
        return Boolean.valueOf(this.F != null);
    }

    @Override // defpackage.xzo
    public Float H() {
        bzdk c = this.a.c();
        return !W(c) ? Float.valueOf(-1.0f) : Float.valueOf(((bzcz) c.g()).j());
    }

    @Override // defpackage.xzo
    public Float I() {
        bzdk c = this.a.c();
        return !W(c) ? Float.valueOf(-1.0f) : Float.valueOf(((bzcz) c.g()).l());
    }

    @Override // defpackage.xzo
    public List J() {
        return this.q;
    }

    @Override // defpackage.xzo
    public cjtd K() {
        return n(this.L ? dtxn.dM : dtxn.dL);
    }

    @Override // defpackage.xzo
    @dzsi
    public xzk L() {
        return this.G;
    }

    @Override // defpackage.xzo
    public Boolean M() {
        dpec dpecVar = this.g.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        dpgy dpgyVar = dpecVar.g;
        if (dpgyVar == null) {
            dpgyVar = dpgy.c;
        }
        return Boolean.valueOf(dcbg.b(dpgyVar.b).p(ybv.a));
    }

    @Override // defpackage.xzo
    public Boolean N() {
        wpv wpvVar = this.E;
        boolean z = true;
        if ((wpvVar == null || wpvVar.V() == null) && this.C != null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xzo
    @dzsi
    public xzn O() {
        return this.H;
    }

    @Override // defpackage.xzo
    @dzsi
    public xzn P() {
        return this.I;
    }

    @Override // defpackage.xzo
    @dzsi
    public View.OnClickListener Q() {
        xzn xznVar = this.I;
        if (xznVar != null) {
            return xznVar.c();
        }
        return null;
    }

    @Override // defpackage.xzo
    @dzsi
    public View.OnClickListener R() {
        xzn xznVar = this.H;
        return xznVar != null ? xznVar.c() : new View.OnClickListener(this) { // from class: ybx
            private final yca a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o();
            }
        };
    }

    @Override // defpackage.xzo
    public Boolean S() {
        xzn O = O();
        boolean z = false;
        if (O != null && O.e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xzo
    public Boolean T() {
        boolean z = false;
        if (TextUtils.isEmpty(this.B.a()) && !S().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xzo
    public CharSequence U() {
        bvsi bvsiVar = new bvsi(this.f);
        bvsiVar.d(this.o.b());
        if (this.H == null || !S().booleanValue()) {
            if (T().booleanValue()) {
                bvsiVar.d(this.f.getString(R.string.MORE_DEPARTURES_BUTTON));
            }
        } else {
            bvsiVar.d(this.H.a().a());
        }
        bvsiVar.e();
        return bvsiVar.toString();
    }

    @Override // defpackage.xzo
    public CharSequence V() {
        if (this.z == null) {
            return "";
        }
        bvsi bvsiVar = new bvsi(this.f);
        bvsiVar.d(this.z.b());
        xzn xznVar = this.I;
        if (xznVar == null || !xznVar.e().booleanValue()) {
            bvsiVar.d(u().a());
        } else {
            bvsiVar.d(this.I.b());
            bvsiVar.d(this.f.getString(R.string.ACCESSIBILITY_DIRECTIONS_TRIP_DETAILS_ARRIVAL_TIME, u().a()));
            bvsiVar.d(this.f.getString(R.string.ACCESSIBILITY_DIRECTIONS_TRIP_DETAILS_ARRIVAL_MORE_BUSYNESS));
        }
        bvsiVar.e();
        return bvsiVar.toString();
    }

    public final boolean W(bzdk bzdkVar) {
        xkl xklVar = this.A;
        return xklVar != null && xklVar.a() && bzdkVar.g().q() == this.h && (bzdkVar.g() instanceof bzcz) && !p().booleanValue() && q().booleanValue();
    }

    @Override // defpackage.xyv
    public void a(Context context) {
        this.B.c(context);
    }

    @Override // defpackage.xyv
    public boolean b() {
        return this.B.b() != dpbw.UNKNOWN;
    }

    @Override // defpackage.xzo
    public xyu c() {
        return this.o;
    }

    @Override // defpackage.xzo
    public zvb d() {
        return this.k;
    }

    @Override // defpackage.xzo
    @dzsi
    public CharSequence e() {
        xkl xklVar = this.A;
        return (xklVar == null || !xklVar.a()) ? this.v : this.w;
    }

    @Override // defpackage.xzo
    @dzsi
    public CharSequence f() {
        CharSequence charSequence = this.v;
        if (charSequence == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(charSequence);
        if (i().booleanValue()) {
            sb.append(this.f.getString(R.string.ACCESSIBILITY_LONG_PAUSE));
            if (j().booleanValue()) {
                sb.append(this.f.getString(R.string.ACCESSIBILITY_STEPS_EXPANDED));
            } else {
                sb.append(this.f.getString(R.string.ACCESSIBILITY_STEPS_COLLAPSED));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.xzo
    public cqss g() {
        return this.m;
    }

    @Override // defpackage.xzo
    public cqss h() {
        return this.j;
    }

    @Override // defpackage.xzo
    public Boolean i() {
        dotv dotvVar = this.i;
        int i = dotvVar.d - dotvVar.c;
        boolean z = true;
        if (i <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xzo
    public Boolean j() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.xzo
    public cqkl k() {
        boolean z = !this.c;
        this.c = z;
        xzm xzmVar = this.y;
        if (xzmVar != null) {
            xzmVar.m(z, this.h);
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.xzo
    public cjtd l() {
        cjta X = X(dtxn.aw);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.c ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        X.a = bZ.bK();
        return X.a();
    }

    @Override // defpackage.xzo
    @dzsi
    public jhk m() {
        return this.s;
    }

    @Override // defpackage.xzo
    public cjtd n(ddho ddhoVar) {
        return X(ddhoVar).a();
    }

    @Override // defpackage.xzo
    public cqkl o() {
        Runnable runnable = this.x;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.xzo
    public Boolean p() {
        return Boolean.valueOf(this.J);
    }

    @Override // defpackage.xzo
    public Boolean q() {
        return this.K;
    }

    @Override // defpackage.xzo
    public Boolean r() {
        dpec dpecVar = this.g.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        return Boolean.valueOf(dpecVar.i);
    }

    @Override // defpackage.xzo
    public List<xyt> s() {
        return this.l;
    }

    @Override // defpackage.xzo
    @dzsi
    public zcv t() {
        return this.r;
    }

    @Override // defpackage.xzo
    public xzl u() {
        return this.p;
    }

    @Override // defpackage.xzo
    @dzsi
    public xyu v() {
        return this.z;
    }

    @Override // defpackage.xzo
    @dzsi
    public CharSequence w() {
        CharSequence a = this.B.a();
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        if (!S().booleanValue()) {
            return null;
        }
        return this.f.getString(R.string.DIRECTIONS_TRIP_DETAILS_VIEW_OTHER_DEPARTURES);
    }

    @Override // defpackage.xzo
    public cjtd x() {
        return cjtd.a(dtxn.ak);
    }

    @Override // defpackage.xzo
    @dzsi
    public cqtd y() {
        return this.C;
    }

    @Override // defpackage.xzo
    @dzsi
    public String z() {
        return this.D;
    }
}
