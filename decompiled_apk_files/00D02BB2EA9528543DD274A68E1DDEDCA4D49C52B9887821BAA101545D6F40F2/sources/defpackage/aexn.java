package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aexn  reason: default package */
/* loaded from: classes2.dex */
public final class aexn extends cqiw<aexp> {
    private static final cqjg n = cqjg.a();
    public static final Interpolator a = eho.a(0.0f, 0.0f, 0.2f, 1.0f);
    private static final cqss o = ibm.L();
    public static final cqss b = iva.b(ibl.J(), ibl.E());
    public static final cqss c = ibl.s();
    public static final cqtd d = gdj.d(ibm.w(), null, gdj.b);
    public static final cqtd e = gdj.d(ibl.r(), null, gdj.b);
    public static final cqtd f = gdj.d(ibl.E(), null, gdj.b);
    public static final cqtd g = gdj.d(ibl.w(), null, gdj.b);
    public static final cqss h = iva.b(ibl.J(), ibl.E());
    public static final cqss i = ibl.s();
    public static final cqss j = iva.b(ibl.I(), ibl.E());
    public static final cqss k = ibl.r();
    public static final cqtd l = gdj.d(ibm.z(), null, gdj.b);
    public static final cqtd m = gdj.d(ibl.w(), null, gdj.b);

    public static <T extends cqkp> cqjb<T, Boolean> e() {
        return aewg.a;
    }

    @SafeVarargs
    private static final cqmj<aexp> f(final int i2, cqlc<aexp, cqsn> cqlcVar, cqlc<aexp, View.OnClickListener> cqlcVar2, cqlc<aexp, ddho> cqlcVar3, final cqlc<aexp, cqss> cqlcVar4, cqmp<aexp>... cqmpVarArr) {
        jcl jclVar = new jcl();
        jclVar.d(cqrp.d(50.0d), cqrp.d(dcyn.a));
        jclVar.m = 0;
        jclVar.k = a;
        jclVar.l = 200;
        jcm a2 = jclVar.a();
        cqrp d2 = cqrp.d(8.0d);
        cqmj<aexp> gd = cqgr.gd(cqgr.ce(cqrp.d(180.0d)), cqgr.bp(-2), cqgr.cL(cqrp.d(160.0d)), cqgr.cH(cqrp.d(56.0d)), cqgr.dr(0), cqgr.aJ(16), cqgr.dz(d2, d2, d2, d2), cqgr.y(aews.a), itj.h(cqlcVar2), itj.j(cqlcVar3), jcm.a(a2), iuh.e(new cqlc(i2, cqlcVar4) { // from class: aewt
            private final int a;
            private final cqlc b;

            {
                this.a = i2;
                this.b = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i3 = this.a;
                Interpolator interpolator = aexn.a;
                return cqrt.h(i3, (cqss) this.b.a((aexp) cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqgr.ce(cqrp.d(18.0d)), cqgr.bq(cqrp.d(18.0d)), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.bR(cqrp.d(10.0d)), cqgr.bG(cqrp.d(10.0d))), cqgr.gq(cqgr.cd(0), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), cqgr.eM(cqlcVar), cqgr.eN(2), ibq.q(), cqgr.eW(cqlcVar4)));
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    private static cqmj<aexp> h(cqlc<aexp, cqss> cqlcVar, cqmp<aexp>... cqmpVarArr) {
        cqmj<aexp> f2 = iue.f(cqgr.bR(cqrp.d(2.0d)), cqgr.bG(cqrp.d(2.0d)), cqgr.eI(" · "), ibq.h(), cqgr.eW(cqlcVar), cqgr.aW(2));
        f2.f(cqmpVarArr);
        return f2;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i2, aexp aexpVar, Context context, cqiv cqivVar) {
        aexp aexpVar2 = aexpVar;
        cqivVar.a(new aexl(), aexpVar2.f());
        if (aexpVar2.r().booleanValue()) {
            cqivVar.a(new aexl(), aexpVar2.g());
        }
        cqivVar.a(new aexl(), aexpVar2.h());
        if (aexpVar2.s().booleanValue()) {
            cqivVar.a(new aexl(), aexpVar2.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aexp> a() {
        aexm aexmVar = new aexm();
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr = {cqgr.bp(-2), cqgr.ca(valueOf)};
        cqmp[] cqmpVarArr2 = {cqjv.o(aewg.a, cqgr.bY(cqjd.s(), cqjd.i()), cqgr.bY(cqjd.s(), cqjd.t()))};
        cqmp[] cqmpVarArr3 = {cqgr.aE(aewg.a), cqgr.ce(cqrp.d(32.0d)), cqgr.bq(cqrp.d(32.0d)), cqgr.eG(aewq.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE)};
        cqmp[] cqmpVarArr4 = {cqic.g(aewu.a, new cqmp[0])};
        cqjb cqjbVar = aewg.a;
        cqmn a2 = cqmn.a(cqgr.aJ(8388627), cqgr.dr(0));
        cqmp[] cqmpVarArr5 = {cqgr.aJ(17), cqgr.dr(1)};
        cqmp[] cqmpVarArr6 = {cqgr.aI(aewh.a), cqjv.l(aewy.a, itj.i(dtyb.eJ), iue.b(null)), cqgr.cd(-2), cqgr.bp(-2), cqgr.dH(aeuz.a), cqgr.dr(0), cqgr.K(aeva.a), itj.h(cqgr.q(aevb.a)), cqgr.y(aevc.a), cqgr.gc(cqgr.aI(aevd.a), cqgr.ce(cqrp.d(20.0d)), cqgr.bq(cqrp.d(20.0d)), cqgr.bw(16), cqgr.bG(cqrp.d(8.0d)), cqgr.T(cqrt.l(R.string.CHECKIN_CHECKMARK_DESCRIPTION)), cqgr.x(cqtt.h(cqtt.g(o), 0.75f)), cqgr.eG(aeve.a)), iue.f(cqgr.cH(ibn.a()), cqgr.aJ(16), ibq.h(), cqgr.eM(aevf.a), cqgr.eW(aevg.a))};
        cqlc cqlcVar = aevh.a;
        cqmp[] cqmpVarArr7 = {cqgr.aH(aevi.a), ibq.q()};
        cqlc cqlcVar2 = aevn.a;
        cqnf eM = cqgr.eM(aevo.a);
        cqiq b2 = cqiq.b(Integer.valueOf((int) R.string.SUPERBLUE_NEAR_ADDRESS), cqiq.h(aevp.a));
        b2.a = alp.a();
        cqmj gd = cqgr.gd(itj.i(dtyb.eQ), cqgr.cd(-2), cqgr.bp(-2), cqgr.dQ(cqrp.d(32.0d)), cqgr.dF(cqrp.d(32.0d)), cqgr.dr(1), cqjv.p(cqjbVar, a2, cqmn.a(cqmpVarArr5)), cqgr.gd(cqmpVarArr6), h(cqlcVar, cqmpVarArr7), cqgr.gd(cqgr.aI(aewi.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(0), iue.f(cqgr.aF(cqjv.x(aevk.a)), itj.j(aevl.a), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.cH(ibn.a()), cqgr.aJ(16), ibq.q(), cqgr.eW(aevm.a), cqjv.l(cqlcVar2, eM, cqgr.eK(b2))), h(aevq.a, cqgr.aF(aevr.a), cqgr.cH(ibn.a()), cqgr.aJ(16), ibq.q()), iue.f(cqgr.aI(aevs.a), itj.j(aevt.a), cqgr.cH(ibn.a()), cqgr.aJ(16), cqgr.eM(aevv.a), itj.h(cqgr.q(aevw.a)), ibq.q(), cqgr.eW(aevx.a), cqgr.fj(2), cqgr.dY(9))));
        gd.f(cqmpVarArr4);
        cqmp[] cqmpVarArr8 = {cqic.g(aewv.a, new cqmp[0])};
        cqmj gd2 = cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(0), cqgr.aJ(16), cqgr.dQ(cqrp.d(32.0d)), iue.f(cqgr.aI(aewj.a), itj.i(dtyb.eO), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.cH(ibn.a()), cqgr.aJ(16), cqgr.eK(cqiq.b(Integer.valueOf((int) R.string.SUPERBLUE_LOCATION), cqiq.h(aevy.a))), ibq.q(), cqgr.eW(aevz.a), itj.h(cqgr.q(aewa.a)), cqgr.y(aewb.a)), cqgr.fY(itj.i(dtyb.eN), cqgr.bq(ibn.a()), cqgr.ce(ibn.a()), cqgr.dQ(ibn.d()), cqgr.J(true), itj.h(cqgr.q(aewc.a)), cqgr.y(aewd.a), cqgr.gc(cqgr.ce(cqrp.d(16.0d)), cqgr.bq(cqrp.d(16.0d)), cqgr.bw(8388627), cqgr.eG(aewe.a), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.S(Integer.valueOf((int) R.string.OPEN_LOCATION_CODE_TOOLTIP_CONTENT_DESCRIPTION)))));
        gd2.f(cqmpVarArr8);
        cqmj gd3 = cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), cqjv.o(aewg.a, cqgr.bV(cqrp.d(16.0d)), cqgr.bV(cqrp.d(dcyn.a))), cqgr.aJ(1), cqic.g(aewf.a, new cqmp[0]), cqgr.gc(cqmpVarArr3), gd, gd2);
        gd3.f(cqmpVarArr2);
        cqmp[] cqmpVarArr9 = {cqgr.bY(cqjd.e(), cqjd.i()), cqgr.ap(cqrp.d(4.0d))};
        jcl jclVar = new jcl();
        jclVar.b();
        jclVar.m = 67;
        jclVar.l = 100;
        jcm a3 = jclVar.a();
        cqlc cqlcVar3 = aeww.a;
        cqrp d2 = cqrp.d(16.0d);
        cqmj e2 = iuh.e(cqlcVar3, cqgr.cd(-2), cqgr.bp(-2), cqgr.dz(d2, d2, d2, d2), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), jcm.a(a3), cqgr.cW(cqgr.q(aewx.a)), itj.i(dtyb.eI), cqgr.S(Integer.valueOf((int) R.string.CLOSE)));
        e2.f(cqmpVarArr9);
        cqmp[] cqmpVarArr10 = {cqgr.cd(-1), cqmn.a(cqmpVarArr), cqgr.bV(ird.b()), cqgr.y(aevj.a), cqgr.ap(cqrp.d(3.0d)), gd3, e2};
        cqmp[] cqmpVarArr11 = {cqgr.bY(cqjd.i(), cqjd.s())};
        cqjd[] cqjdVarArr = {cqjd.s(), cqjd.i()};
        cqjb<aexp, cqiv> C = C();
        cqrp d3 = cqrp.d(16.0d);
        cqmj gd4 = cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.P(false), cqgr.L(false), cqgr.bY(cqjdVarArr), GmmRecyclerView.aw(C, cqqx.p(null), cqgr.aT(n), cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(16), cqgr.aJ(16), cqgr.dz(d3, d3, d3, d3), cqgr.dQ(cqrp.d(72.0d)), cqgr.dF(cqrp.d(72.0d)), cqjv.o(aewg.a, cqqx.H(2), cqqx.F()), cqgr.ep(true), cqgr.eq(33554432), cqgr.P(false), cqgr.L(false)));
        gd4.f(cqmpVarArr11);
        int i2 = aexmVar.a;
        int i3 = aexmVar.b;
        jcl jclVar2 = new jcl();
        jclVar2.b();
        jclVar2.d(cqrp.d(50.0d), cqrp.d(dcyn.a));
        jclVar2.m = i2;
        jclVar2.l = i3;
        jclVar2.k = a;
        jcm a4 = jclVar2.a();
        aexmVar.a += 17;
        aexmVar.b += 17;
        cqmp[] cqmpVarArr12 = {cqgr.cd(-1), cqgr.bp(0), cqgr.ca(Float.valueOf(10.0f)), cqgr.P(false), cqgr.L(false), gd4, jcm.a(a4)};
        cqmp[] cqmpVarArr13 = {cqgr.bY(cqjd.s())};
        cqmj gd5 = cqgr.gd(cqgr.dr(0), cqgr.ce(cqrp.d(360.0d)), cqgr.bp(-2), cqgr.cz(cqrp.d(360.0d)), cqgr.cL(cqrp.d(320.0d)), cqgr.aJ(16), f(2131232669, cqkz.a(cqrt.l(R.string.SUPERBLUE_CALIBRATE_COMPASS_TITLE)), cqgr.q(aewn.a), cqkz.a(dtxk.C), aewo.a, cqgr.cd(0), cqgr.ca(valueOf)), f(2131232675, cqkz.a(cqrt.l(R.string.SUPERBLUE_REPORT_LOCATION_ISSUES_TITLE)), cqgr.q(aewp.a), cqkz.a(dtxk.D), aewr.a, cqgr.cd(0), cqgr.ca(valueOf)));
        gd5.f(cqmpVarArr13);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.aJ(1), cqgr.L(false), cqgr.P(false), itj.i(dtyb.eL), cqgr.dd(), cqjv.l(aeuy.a, cqgr.v(Integer.valueOf((int) R.drawable.supergrey_menu_background)), cqgr.x(iva.g(R.drawable.superblue_menu_background, R.drawable.superblue_night_menu_background))), cqgr.gj(cqmpVarArr10), cqgr.gj(cqmpVarArr12), cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.y(aevu.a), gd5));
    }
}
