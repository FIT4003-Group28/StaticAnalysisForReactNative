package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.squeezedlabel.SqueezedLabelView;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atje  reason: default package */
/* loaded from: classes2.dex */
public final class atje extends cqiw<atnf> {
    private static final cqjb<atnf, Integer> A;
    private static final cqjb<atnf, cqss> B;
    private static final cqjb<atnf, cqss> C;
    private static final cqjb<atnf, cqvj> D;
    private static final cqjb<atnf, cqss> E;
    private static final cqjb<atnf, cqtv> F;
    private static final cqjb<atnf, cqvj> G;
    private static final cqjb<atnf, cqtv> H;
    public static final cqtv a = cqsg.d(ird.b(), cqrp.d(88.0d));
    public static final cqtv b = cqrp.d(88.0d);
    public static final int c;
    public static final cqvj d;
    public static final cqss e;
    public static final cqtv f;
    public static final cqtv g;
    public static final cqjg h;
    public static final cqjg i;
    public static final cqjg j;
    public static final jcm k;
    public static final atob l;
    private static final cqrp m;
    private static final cqrp n;
    private static final Typeface o;
    private static final cqjb<atnf, jcm> p;
    private static final cqjb<atnf, Boolean> q;
    private static final cqjb<atnf, atnn> r;
    private static final cqjb<atnf, Boolean> s;
    private static final cqjb<atnf, Maneuvers$Maneuver> t;
    private static final cqjb<atnf, jcm> u;
    private static final cqjb<atnf, cqtd> v;
    private static final cqjb<atnf, cqtd> w;
    private static final cqjb<atnf, Integer> x;
    private static final cqjb<atnf, cqtd> z;

    static {
        cqsg.d(ird.b(), cqrp.d(96.0d));
        c = 16;
        m = cqrp.d(30.0d);
        n = cqrp.d(16.0d);
        d = irn.c;
        e = ibl.b();
        f = cqrp.f(16.0d);
        g = cqrp.d(24.0d);
        o = cqgm.e;
        h = cqjg.a();
        i = cqjg.a();
        j = cqjg.a();
        k = jcm.a;
        p = new ativ();
        q = new atiw();
        r = new atix();
        s = new atiy();
        t = new atiz();
        u = new atja();
        l = audu.a(0);
        v = new atjb();
        w = new atjc();
        x = new atjd();
        z = new atil();
        A = new atim();
        B = new atio();
        C = new atip();
        D = new atiq();
        E = new atir();
        F = new atis();
        G = new atit();
        H = new atiu();
    }

    public static cqtd e(cqss cqssVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        return aclp.b(cqssVar, cqssVar, cqrp.d(dcyn.a), atlt.c, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5));
    }

    public static jcm f(int i2, int i3) {
        jcl p2 = p();
        p2.d(cqrp.d(dcyn.a), cqrp.d(-i2));
        p2.m = i3;
        return p2.a();
    }

    public static cqss g(atnf atnfVar, boolean z2) {
        cqtd a2 = atnfVar.A().a(z2, atnfVar.k().booleanValue(), atnfVar.D().booleanValue());
        if (a2 instanceof cqss) {
            return (cqss) a2;
        }
        return null;
    }

    public static Typeface h(atnf atnfVar, Context context) {
        atne C2 = atnfVar.C();
        atnfVar.k().booleanValue();
        cqvj j2 = C2.j();
        Typeface a2 = j2 != null ? j2.a(context) : null;
        return a2 == null ? o : a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ jcm i(int i2) {
        jcl p2 = p();
        p2.d(cqrp.d(-i2), cqrp.d(dcyn.a));
        p2.m = 500;
        return p2.a();
    }

    public static cqtv j(atnf atnfVar) {
        atne C2 = atnfVar.C();
        atnfVar.k().booleanValue();
        return C2.h();
    }

    public static cqtv k(atnf atnfVar) {
        atne C2 = atnfVar.C();
        atnfVar.k().booleanValue();
        return C2.i();
    }

    public static cqss l(atnf atnfVar) {
        return atnfVar.C().a(atnfVar.k().booleanValue());
    }

    public static cqss m(atnf atnfVar) {
        cqss a2 = atnfVar.C().a(atnfVar.k().booleanValue());
        return a2 == null ? ibl.b() : a2;
    }

    public static cqvj n(atnf atnfVar) {
        atne C2 = atnfVar.C();
        atnfVar.k().booleanValue();
        cqvj j2 = C2.j();
        return j2 == null ? cqvh.a(null) : j2;
    }

    private static cqmn<atnf> o() {
        return cqmn.a(cqgr.eS(Integer.valueOf((int) R.style.QuHeadline)), cqgr.eU(ibl.b()));
    }

    private static jcl p() {
        jcl jclVar = new jcl();
        jclVar.k = irf.a;
        jclVar.l = 330;
        return jclVar;
    }

    private final Boolean q() {
        return cqjv.r(cqjv.t(B().Q(), cqjv.u(B().L())), cqjv.t(B().o(), B().m()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atnf> a() {
        cqtv cqtvVar = b;
        cqmp[] cqmpVarArr = {cqgr.aR(Integer.valueOf((int) R.id.step_cue_icon_panel)), cqgr.cd(-2), cqgr.cL(atcs.a), cqgr.bq(cqtvVar), cqgr.bY(cqjd.e()), cqgr.aW(4), cqgr.aG(q())};
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.aJ(17), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.dU(cqrp.d(4.0d)), atnq.a(irn.D(), cqgr.aG(B().m()), atnq.b(B().n()), atnq.e(B), cqgr.aW(2)), SqueezedLabelView.c(cqgr.cd(-2), cqgr.bp(-2), cqgr.eI(B().p()), o(), cqgr.aW(2), cqgr.az(true), cqgr.aG(B().o()), cqgr.ff(G), cqjv.d(iug.DESIRED_TEXT_SIZE, H), cqgr.cB(1), cqgr.aZ(false)));
        gd.f(cqmpVarArr);
        cqmj b2 = atnz.b(cqgr.aR(Integer.valueOf((int) R.id.step_cue_text)), cqgr.cd(-1), cqgr.bq(cqtvVar), cqgr.bY(cqjd.f(), cqjd.B(gd)), cqgr.h(true), cqgr.aJ(8388627), cqgr.aW(4), cqjv.k(q(), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dQ(cqrp.d(10.0d))), cqjv.k(cqjv.r(B().G(), G()), cqgr.dF(cqrp.d(79.0d)), cqgr.dF(cqrp.d(15.0d))), cqgr.dU(cqrp.d(4.0d)), cqgr.aD(cqjv.s(B().L(), cqjv.u(B().t()), cqjv.r(B().Q(), B().Y()))), atnz.c(B().u()), atnz.f(true), atnz.e(l), cqjv.e(atnl.TYPEFACE, atic.a, atnk.a), atnz.h(atid.a), cqjv.e(atnl.STEP_CUE_SECONDARY_TEXT_COLOR, atie.a, atnk.a), cqjv.e(atnl.STEP_CUE_FIRST_ROW_TEXT_SIZE, atif.a, atnk.a), cqjv.e(atnl.STEP_CUE_SECOND_ROW_TEXT_SIZE, atig.a, atnk.a));
        cqmp[] cqmpVarArr2 = {cqgr.aR(Integer.valueOf((int) R.id.long_step_cue_text)), cqgr.cd(-1), cqgr.bq(cqtvVar), cqgr.bY(cqjd.e()), cqgr.aJ(16), cqgr.aW(4), cqgr.aD(cqjv.u(B().L()))};
        cqrp cqrpVar = m;
        cqrp cqrpVar2 = n;
        cqmj gd2 = cqgr.gd(cqgr.dQ(cqrp.d(15.0d)), cqjv.k(cqjv.r(B().G(), G()), cqgr.dF(cqrp.d(79.0d)), cqgr.dF(cqrp.d(15.0d))), cqgr.aJ(8388611), cqgr.dr(1), SqueezedLabelView.c(cqgr.cd(-2), cqgr.bp(-2), o(), SqueezedLabelView.d(cqrpVar), SqueezedLabelView.b(cqrpVar2), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.ff(atih.a), cqgr.eV(atii.a), cqgr.eI(B().M())), SqueezedLabelView.c(cqgr.cd(-2), cqgr.bp(-2), o(), SqueezedLabelView.d(cqrpVar), SqueezedLabelView.b(cqrpVar2), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.ff(atij.a), cqgr.eV(atik.a), cqgr.eI(B().N())));
        gd2.f(cqmpVarArr2);
        cqmj fY = cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.step_cue_header_primary_card)), cqgr.aT(h), cqgr.w(v), cqjv.k(cqjv.t(B().X(), cqjv.r(B().Q(), B().Y())), cqgr.ce(atcs.a), cqgr.cd(-1)), cqgr.ap(atlt.a), cqgr.bp(-2), cqgr.gj(cqgr.R(B().V()), cqgr.N(new atin(atlt.c)), cqgr.M(true), cqjv.k(B().k(), cqgr.x(ibo.d()), cqgr.x(ibl.a())), cqgr.bp(-2), cqgr.cd(-1), itj.i(dtxw.ba), cqgr.cU(B().j()), gd, b2, gd2));
        cqjd[] cqjdVarArr = {cqjd.e(), cqjd.v(fY)};
        int i2 = c;
        cqmp[] cqmpVarArr3 = {cqgr.aR(Integer.valueOf((int) R.id.then_instruction_secondary_card)), cqgr.aT(j), cqgr.bY(cqjdVarArr), cqgr.bV(cqrp.d(-i2)), cqgr.ap(atlt.b)};
        cqmj a2 = atnv.a(cqgr.ff(D), cqgr.br(A), cqgr.cd(-2), cqgr.w(z), cqgr.dU(cqrp.d(i2)), cqgr.aH(s), cqgr.aJ(17), cqgr.dQ(cqrp.d(10.0d)), cqgr.dF(cqrp.d(10.0d)), cqjv.e(atnl.MANEUVER, t, atnk.a), jcm.b(u), atnq.e(C), cqgr.eV(E), cqjv.d(cqfe.TEXT_SIZE, F), cqgr.cB(1), atnv.b(new atnw()), cqgr.aW(4));
        a2.f(cqmpVarArr3);
        cqmp[] cqmpVarArr4 = {cqgr.aR(Integer.valueOf((int) R.id.lane_guidance_secondary_card)), cqjv.k(cqjv.t(B().X(), cqjv.r(B().Q(), B().Y())), cqgr.ce(atcs.a), cqgr.cd(-1)), cqgr.bp(-2), cqgr.bV(cqrp.d(-i2)), cqgr.aT(i), cqgr.aW(4), cqgr.bY(cqjd.v(fY), cqjd.e()), cqgr.ap(atlt.b), cqgr.cU(B().j()), itj.i(dtxw.ba)};
        cqmj gd3 = cqgr.gd(cqgr.aH(q), cqgr.dr(1), atnt.a(cqjv.k(I(), cqgr.cd(-2), cqgr.cd(-1)), cqgr.br(x), cqjv.k(I(), cqgr.dQ(cqrp.d(13.0d)), cqgr.dQ(cqrp.d(14.0d))), cqjv.k(I(), cqgr.dF(cqrp.d(13.0d)), cqgr.dF(cqrp.d(14.0d))), cqgr.w(w), atnn.a(r)), jcm.b(p), cqgr.aW(4));
        gd3.f(cqmpVarArr4);
        return cqgr.gj(cqgr.cd(-1), cqgr.fG(B().W()), gd3, a2, fY);
    }
}
