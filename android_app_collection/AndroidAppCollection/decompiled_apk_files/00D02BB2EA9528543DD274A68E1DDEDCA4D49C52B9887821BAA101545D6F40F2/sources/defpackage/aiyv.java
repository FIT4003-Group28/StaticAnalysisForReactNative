package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aiyv  reason: default package */
/* loaded from: classes2.dex */
public final class aiyv extends cqiw<aiyu> {
    private static final cqrp a = cqrp.d(56.0d);
    private static final cqrp b = cqrp.d(4.0d);
    private static final cqrp c = cqrp.d(48.0d);
    private static final cqrp d = cqrp.d(16.0d);
    private static final cqrp e = cqrp.d(16.0d);
    private static final cqrp f = cqrp.d(30.0d);
    private static final cqrp g = cqrp.d(26.0d);
    private static final cqrp h = cqrp.d(200.0d);
    private static final cqrp i = cqrp.d(18.0d);
    private static final cqrp j = cqrp.d(24.0d);
    private static final cqrp k = cqrp.d(16.0d);
    private static final cqrp l = cqrp.d(36.0d);
    private static final cqrp m = cqrp.d(24.0d);
    private static final Interpolator n = eho.a(0.25f, 0.1f, 0.25f, 1.0f);
    private static final Interpolator o = new OvershootInterpolator();

    @SafeVarargs
    private static cqmj<aiyu> e(cqmp<aiyu>... cqmpVarArr) {
        cqmp<aiyu>[] cqmpVarArr2 = {cqgr.bV(b), cqgr.P(false)};
        jcl jclVar = new jcl();
        jclVar.b();
        jclVar.c();
        jclVar.m = cpnx.a;
        jclVar.l = 500;
        jclVar.k = o;
        cqmj<aiyu> gc = cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(iup.e(R.raw.ls_zero_state_image)), jcm.a(jclVar.a()));
        gc.f(cqmpVarArr2);
        gc.f(cqmpVarArr);
        return gc;
    }

    @SafeVarargs
    private static cqmj<aiyu> f(int i2, int i3, cqmp<aiyu>... cqmpVarArr) {
        Interpolator interpolator = n;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        cqmj<aiyu> j2 = j(cqgr.bD(d), cqgr.eS(Integer.valueOf((int) R.style.location_sharing_headline_text_style)), cqgr.eN(valueOf), cqgr.bw(valueOf2), cqgr.aJ(valueOf2), cqgr.eL(Integer.valueOf((int) R.string.MOD_LOCATION_SHARING_ZERO_STATE_HEADER)));
        k(500, 100, interpolator, j2);
        Integer valueOf3 = Integer.valueOf((int) R.style.location_sharing_zero_state_text_style);
        cqmj<aiyu> j3 = j(cqgr.eS(valueOf3), cqgr.eN(valueOf), cqgr.bw(valueOf2), cqgr.aJ(valueOf2), cqgr.eL(Integer.valueOf((int) R.string.MOD_LOCATION_SHARING_ZERO_STATE_CTA)), cqgr.bD(e));
        k(500, 100, interpolator, j3);
        cqmj<aiyu> j4 = j(cqgr.eS(valueOf3), cqgr.eN(valueOf), cqgr.bw(valueOf2), cqgr.aJ(valueOf2), cqgr.eL(Integer.valueOf((int) R.string.MOD_LOCATION_SHARING_ZERO_STATE_EXPLAINER)));
        k(500, 100, interpolator, j4);
        cqmj<aiyu> gd = cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), j2, j3, j4);
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    private static cqmj<aiyu> h(int i2, cqmp<aiyu>... cqmpVarArr) {
        Interpolator interpolator = o;
        Integer valueOf = Integer.valueOf(i2);
        cqmj a2 = hyb.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.eL(Integer.valueOf((int) R.string.MOD_LOCATION_SHARING_ZERO_STATE_SHARE_LOCATION_LINK)), iue.b(cjtd.a(dtxu.fT)));
        a2.f(cqmpVarArr);
        cqmj<aiyu> fY = cqgr.fY(cqgr.cd(-2), cqgr.cz(h), cqgr.bw(valueOf), cqgr.aJ(valueOf), a2);
        k(600, 250, interpolator, fY);
        return fY;
    }

    @SafeVarargs
    private static cqmj<aiyu> i(cqmp<aiyu>... cqmpVarArr) {
        Interpolator interpolator = n;
        cqmj<aiyu> d2 = hyb.d(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.aJ(17), itj.i(dtxu.fS), cqgr.eL(Integer.valueOf((int) R.string.LEARN_MORE_SHARING_LINK_TITLE)));
        d2.f(cqmpVarArr);
        k(550, 100, interpolator, d2);
        return d2;
    }

    @SafeVarargs
    private static cqmj<aiyu> j(cqmp<aiyu>... cqmpVarArr) {
        cqmj<aiyu> gq = cqgr.gq(cqmpVarArr);
        gq.g(cqgr.eB(false));
        gq.g(cqgr.eU(ibm.t()));
        gq.g(cqgr.cd(-2));
        gq.g(cqgr.bp(-2));
        return gq;
    }

    private static void k(int i2, int i3, Interpolator interpolator, cqmj<aiyu> cqmjVar) {
        jcl jclVar = new jcl();
        jclVar.b();
        jclVar.c();
        jclVar.m = i2;
        jclVar.l = i3;
        jclVar.k = interpolator;
        cqmjVar.g(jcm.a(jclVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aiyu> a() {
        cqmp[] cqmpVarArr = {cqic.e(aiyp.a, new cqmp[0])};
        cqrp cqrpVar = l;
        cqmj go = cqgr.go(cqgr.eA(1), cqjv.j(cqfe.STRETCH_COLUMNS, new Integer[]{1}), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17), cqgr.aJ(17), cqgr.bR(i), cqgr.bG(j), cqgr.bV(k), cqgr.gp(cqgr.bp(-2), e(new cqmp[0]), f(5, 8388611, cqgr.bR(cqrpVar), cqgr.bw(16))), cqgr.gp(cqgr.bp(-2), cqgr.bV(m), i(cqgr.cW(cqgr.q(aiyq.a))), h(8388627, cqgr.bw(8388627), cqgr.bR(cqrpVar), cqgr.cW(cqgr.q(aiyr.a)))));
        go.f(cqmpVarArr);
        cqmp[] cqmpVarArr2 = {cqic.b(aiyp.a, new cqmp[0])};
        cqmj gd = cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), cqgr.bw(17), cqgr.aJ(17), cqgr.dU(a), cqgr.dQ(ajev.a), cqgr.dF(ajev.a), cqgr.L(false), cqgr.P(false), e(new cqmp[0]), f(4, 17, cqgr.bw(17), cqgr.bV(c)), h(17, cqgr.bw(17), cqgr.bV(f), cqgr.bD(g), cqgr.cW(cqgr.q(aiys.a))), i(cqgr.cW(cqgr.q(aiyt.a))));
        gd.f(cqmpVarArr2);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(17), cqgr.aJ(17), cqgr.x(ibm.b()), cqgr.L(false), cqgr.P(false), iue.b(cjtd.a(dtxu.fR)), go, gd);
    }
}
