package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: athe  reason: default package */
/* loaded from: classes2.dex */
public final class athe extends cqiw<atna> {

    /* renamed from: a */
    public static final int header = 2131427963;

    /* renamed from: b */
    public static final int nav_sheet_content = 2131428324;
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();
    public static final cqjg e = cqjg.a();
    private static final cqjg j = cqjg.a();
    private static final cqjg k = cqjg.a();
    public static final cqss f = ibl.q();
    public static final cqss g = ibl.o();
    public static final cqtv h = cqrp.d(18.0d);
    private static final cqjb<atna, CharSequence> l = new atgy();
    private static final cqjb<atna, Boolean> m = new atgz();
    private static final cqjb<atna, cqtv> n = new atha();
    private static final cqjb<atna, cqtv> o = new athb();
    private static final cqlc<atna, cqtv> p = new athc();
    public static final cqjb<atna, Boolean> i = atgr.a;

    public static cqmn<atna> e() {
        final cqlc<atna, cqtv> cqlcVar = p;
        final Float valueOf = Float.valueOf(-1.0f);
        return cqmn.a(cqgr.aR(Integer.valueOf(nav_sheet_content)), cqgr.fs(cqlcVar), cqgr.dE(new cqlc(cqlcVar, valueOf) { // from class: cqry
            private final cqlc a;
            private final Float b;

            {
                this.a = cqlcVar;
                this.b = valueOf;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                return cqsg.f((cqtv) cqlcVar2.a(cqkpVar), this.b);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.P(false));
    }

    public static Runnable f(View view, atnj atnjVar, atna atnaVar) {
        ArrayList arrayList = new ArrayList();
        View findViewById = view.findViewById(nav_sheet_content);
        View findViewById2 = view.findViewById(header);
        View d2 = cqkx.d(view, c);
        cqjz.u(view, cqpv.a(cqjz.t(k), cqpv.b(arrayList)));
        return new atgx(arrayList, atnaVar, view, atnjVar, findViewById, findViewById2, d2);
    }

    public static cqtd g(cqss cqssVar, cqtv cqtvVar) {
        return aclp.b(cqssVar, cqssVar, cqrp.d(dcyn.a), cqtvVar, true, true, false, false);
    }

    private static cqmn<atna> h() {
        return cqmn.a(cqgr.bS(n), cqgr.bH(o));
    }

    @SafeVarargs
    private static final cqmj<atna> i(cqmp<atna>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(jkv.class, cqgr.az(true), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aK(atfb.a), cqgr.eW(atfc.a));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    private static cqmj<atna> j() {
        return cqgr.gc(cqgr.bw(16), cqgr.bR(cqrp.d(5.0d)), irn.A(), cqgr.eG(atfd.a), cqgr.aI(atfe.a));
    }

    private final cqmj<atna> k() {
        return cqgr.gd(cqgr.bw(16), cqgr.ck(C()), cqic.c(cqjv.x(atff.a), new cqmp[0]));
    }

    private static cqmp<atna> l() {
        return cqgr.gc(cqgr.bw(16), cqgr.bR(cqrp.d(5.0d)), irn.A(), cqgr.S(Integer.valueOf((int) R.string.JOURNEY_SHARING_IN_PROGRESS)), cqgr.eE(cqrt.g(2131231801, ibl.H())), iue.b(cjtd.a(dtxu.dU)), cqgr.aI(atfh.a));
    }

    @SafeVarargs
    private static final cqmj<atna> m(cqmp<atna>... cqmpVarArr) {
        cqmj<atna> gc = cqgr.gc(cqgr.aT(k), cqgr.bp(-1), cqgr.cg(atgm.a), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.y(atgo.a));
        gc.f(cqmpVarArr);
        return gc;
    }

    @SafeVarargs
    private static final cqmj<atna> n(final cqlc<atna, Boolean> cqlcVar, cqmp<atna>... cqmpVarArr) {
        cqmj<atna> gc = cqgr.gc(cqgr.aT(k), cqjv.n(atgp.a, cqgr.ch(cqrp.d(48.0d)), cqgr.ch(cqrp.d(56.0d))), cqgr.y(new cqlc(cqlcVar) { // from class: atgq
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                atna atnaVar = (atna) cqkpVar;
                int i2 = athe.header;
                if (!((Boolean) cqlcVar2.a(atnaVar)).booleanValue()) {
                    return cqui.c(cquh.e(cqrp.d(1.0d), iva.b(ibl.p(), ibl.r())), cquh.a(1));
                }
                if (!atnaVar.ab().booleanValue()) {
                    return cqui.c(cquh.e(cqrp.d(1.0d), ibm.w()), cquh.f(ibm.u()), cquh.a(1));
                }
                return cqui.c(cquh.e(cqrp.d(1.0d), ibm.w()), cquh.f(cqrt.c(R.color.mod_night_blue50)), cquh.a(1));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        gc.f(cqmpVarArr);
        return gc;
    }

    private static final cqmn<atna> o() {
        return cqmn.a(cqgr.bY(cqjd.e(), cqjd.t()), cqgr.aF(atga.a), cqgr.j(atgb.a));
    }

    private static final cqmn<atna> p() {
        return cqmn.a(cqgr.aF(atfx.a), cqgr.bY(cqjd.f(), cqjd.t()));
    }

    private static final cqmn<atna> q() {
        return cqmn.a(cqgr.aF(atgi.a), cqgr.bY(cqjd.f(), cqjd.t()), cqgr.j(atgj.a));
    }

    @SafeVarargs
    private static final cqmj<atna> r(cqmp<atna>... cqmpVarArr) {
        return n(cqkz.a(false), cqmpVarArr);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i2, atna atnaVar, Context context, cqiv cqivVar) {
        cqivVar.f(new vko(19), atnaVar.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atna> a() {
        cqmp cqmpVar;
        cqmp cqmpVar2;
        cqmp[] cqmpVarArr = {o(), cqgr.bR(cqsg.d(cqrp.d(16.0d), atlu.a))};
        cqmp[] cqmpVarArr2 = {cqgr.eG(atfz.a), o(), cqgr.bR(cqsg.d(cqrp.d(8.0d), atlu.a)), cqgr.cW(cqgr.q(atfy.a)), iue.b(cjtd.a(dtxw.aF)), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_CLOSE_DIRECTIONS))};
        cqlc cqlcVar = atgk.a;
        cqmp[] cqmpVarArr3 = {q(), cqgr.bI(atgl.a)};
        cqmp[] cqmpVarArr4 = {cqjv.l(atgd.a, cqgr.eG(atgh.a), cqgr.eG(atgg.a)), q(), cqgr.bI(atgf.a), cqgr.cW(cqgr.q(atge.a)), iue.b(cjtd.a(dtxw.bQ)), cqgr.T(cqrt.l(R.string.MENU_ROUTE_OVERVIEW))};
        cqmp[] cqmpVarArr5 = {p(), cqgr.bG(cqsg.d(cqrp.d(16.0d), atlu.a))};
        cqmp[] cqmpVarArr6 = {cqgr.eG(atfw.a), p(), cqgr.aR(Integer.valueOf((int) R.id.navigation_menu_button)), cqgr.bG(cqsg.d(cqrp.d(8.0d), atlu.a)), cqgr.cW(cqgr.q(atfv.a)), iue.b(cjtd.a(dtyi.A)), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_MENU_DIRECTIONS))};
        cqmj gd = cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.gd(cqgr.bp(-2), cqjv.l(atfg.a, cqgr.cd(-1), cqgr.cd(-2)), cqjv.l(atfr.a, cqgr.aJ(17), cqgr.aJ(16)), i(cqgr.aR(Integer.valueOf((int) R.id.navigation_time_remaining_label)), cqgr.eM(atgc.a), cqgr.aZ(true), cqgr.fH(atgn.a), jkv.a(atgs.a), cqqx.N(8, 28, 1), iue.c(atgt.a)), j(), k(), l()), i(cqgr.aT(j), cqgr.eM(atgu.a), cqgr.aw(cqgm.e), cqgr.aZ(true), cqgr.fH(atgv.a), jkv.a(atgw.a), cqqx.a(8, 18, 2), cqgr.V(atew.a)));
        cqjb<atna, Boolean> cqjbVar = m;
        gd.f(cqgr.aE(cqjbVar), cqgr.bY(cqjd.e(), cqjd.t()), h());
        cqmj gd2 = cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.bY(cqjd.e(), cqjd.t()), cqgr.aJ(17), cqgr.gd(cqgr.bp(-2), cqjv.l(atex.a, cqgr.cd(-1), cqgr.cd(-2)), cqjv.l(atey.a, cqgr.aJ(17), cqgr.aJ(16)), i(cqgr.aR(Integer.valueOf((int) R.id.navigation_one_line_label)), cqgr.eK(l), cqgr.aw(cqgm.e), cqgr.fH(atez.a), jkv.a(atfa.a), cqqx.N(8, 24, 1)), j(), k(), l()));
        gd2.f(cqgr.aH(cqjbVar), h());
        cqmp[] cqmpVarArr7 = {cqgr.gj(cqgr.br(atev.a), r(cqmpVarArr), m(cqmpVarArr2), n(cqlcVar, cqmpVarArr3), m(cqmpVarArr4), r(cqmpVarArr5), m(cqmpVarArr6), cqgr.gj(cqgr.cd(-1), cqgr.bp(-1), gd, gd2), cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.s(), cqjd.i()), cqgr.bV(cqrp.d(8.0d)), cqgr.eG(atfo.a)))};
        cqlc cqlcVar2 = atft.a;
        ird b = ird.b();
        Float valueOf = Float.valueOf(-1.0f);
        cqmj gj = cqgr.gj(cqgr.cW(cqgr.q(atfp.a)), cqgr.V(atfq.a), cqgr.y(atfs.a), iue.b(cjtd.a(dtxw.cG)), cqgr.cd(-1), cqgr.bp(-2), cqjv.l(cqlcVar2, cqgr.fr(cqsg.f(b, valueOf)), cqgr.fs(atfu.a)), cqgr.aR(Integer.valueOf(header)), cqgr.J(true), cqgr.L(false), cqgr.P(false));
        gj.f(cqmpVarArr7);
        cqmj gk = cqgr.gk(cqgr.bY(cqjd.v(gj)), e());
        cqmp[] cqmpVarArr8 = new cqmp[6];
        cqmpVarArr8[0] = cqgr.bp(-2);
        cqmpVarArr8[1] = cqgr.cg(atfi.a);
        cqmpVarArr8[2] = cqgr.bw(17);
        cqmpVarArr8[3] = cqgr.L(false);
        cqmpVarArr8[4] = cqgr.P(false);
        cqmp[] cqmpVarArr9 = new cqmp[7];
        cqmpVarArr9[0] = cqgr.aT(d);
        cqmpVarArr9[1] = cqgr.bp(-2);
        cqmpVarArr9[2] = cqgr.cf(atfj.a);
        cqjb<atna, Boolean> cqjbVar2 = i;
        cqmpVarArr9[3] = cqjv.o(cqjbVar2, cqgr.L(true), cqgr.L(false));
        cqmpVarArr9[4] = cqgr.P(false);
        cqmpVarArr9[5] = cqjv.p(cqjbVar2, cqmn.a(cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d))), cqmn.a(cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dF(cqrp.d(dcyn.a))));
        cqmp[] cqmpVarArr10 = new cqmp[14];
        cqmpVarArr10[0] = cqgr.aR(Integer.valueOf((int) R.id.nav_sheet));
        cqmpVarArr10[1] = cqgr.aT(e);
        cqmpVarArr10[2] = cqgr.bp(-2);
        cqmpVarArr10[3] = cqgr.dU(ird.b());
        cqmpVarArr10[4] = cqgr.P(false);
        cqmpVarArr10[5] = cqgr.L(true);
        cqmpVarArr10[6] = cqgr.y(atfk.a);
        cqmpVarArr10[7] = cqgr.ap(atlt.a);
        cqmpVarArr10[8] = cqgr.N(new athd(cqsg.f(cqrp.d(2.0d), valueOf), atlt.c));
        iuv b2 = iva.b(ibl.d(), ibl.b());
        if (Build.VERSION.SDK_INT >= 28) {
            cqmpVar = cqgr.dv(b2);
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr10[9] = cqmpVar;
        iuv b3 = iva.b(ibl.d(), ibl.a());
        if (Build.VERSION.SDK_INT >= 28) {
            cqmpVar2 = cqgr.dw(b3);
        } else {
            cqmpVar2 = cqmp.e;
        }
        cqmpVarArr10[10] = cqmpVar2;
        cqmpVarArr10[11] = gj;
        cqmpVarArr10[12] = gk;
        cqmpVarArr10[13] = jdx.b(cqgr.bp(-1), cqgr.cd(-1), cqgr.aT(c), cqjv.l(atfl.a, cqgr.fr(cqsg.f(ird.b(), valueOf)), cqgr.fs(atfm.a)), cqgr.bY(cqjd.v(gj)), jdx.c(Integer.valueOf(nav_sheet_content)), cqjv.g(iug.USE_NIGHT_MODE, atfn.a, jdx.a));
        cqmpVarArr9[6] = cqgr.gj(cqmpVarArr10);
        cqmpVarArr8[5] = cqgr.gj(cqmpVarArr9);
        return cqgr.fY(cqmpVarArr8);
    }
}
