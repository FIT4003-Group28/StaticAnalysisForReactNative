package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beku  reason: default package */
/* loaded from: classes3.dex */
public final class beku extends cqiw<bens> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    private static final Interpolator c = new LinearInterpolator();
    private static final cqjb<bens, Boolean> d = bekt.a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bens> a() {
        cqjb<bens, Boolean> cqjbVar = d;
        bgxj bgxjVar = new bgxj();
        cqlc cqlcVar = bekm.a;
        cqmp[] cqmpVarArr = {cqgr.dQ(ibn.f()), cqgr.dF(ibn.f())};
        cqmp[] cqmpVarArr2 = {cqgr.aT(b), cqgr.aI(bekn.a), cqjv.o(cqjbVar, cqgr.ce(cqrp.d(250.0d)), cqgr.cd(-1)), cqgr.bq(cqrp.d(72.0d)), cqgr.bw(1), itj.q(), eit.d(new eil(Integer.valueOf((int) R.raw.merchant_calls_loading_metrics_lottie))), eit.b(true), cqgr.fF(beko.a)};
        cqlc cqlcVar2 = bekq.a;
        cqgq n = cqgr.n();
        n.a = Float.valueOf(0.0f);
        Interpolator interpolator = c;
        n.c = interpolator;
        Integer valueOf = Integer.valueOf((int) cpnx.a);
        n.d = valueOf;
        cqnf b2 = n.b();
        cqgq n2 = cqgr.n();
        Float valueOf2 = Float.valueOf(1.0f);
        n2.a = valueOf2;
        n2.c = interpolator;
        n2.d = valueOf;
        return cqgr.fY(cqgr.aT(a), cqgr.cd(-1), cqgr.bp(-2), cqgr.aW(2), cqgr.gd(cqgr.dr(1), cqjv.o(cqjbVar, cqgr.ce(cqrp.d(356.0d)), cqgr.cd(-1)), cqgr.bp(-2), cqgr.bw(17), cqgr.dU(cqrp.d(14.0d)), cqgr.dB(ibn.j()), cqgr.dQ(ibn.j()), cqgr.dF(ibn.j()), cqgr.dk(bekl.a), cqgr.fP(bgxjVar, cqlcVar, cqmpVarArr), cqgr.fY(cqgr.bV(ibn.j()), cqgr.dQ(ibn.j()), cqgr.dF(ibn.j()), eit.a(cqmpVarArr2), cqgr.gd(cqgr.aF(bekp.a), cqjv.l(cqlcVar2, b2, n2.b()), cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.S(Integer.valueOf((int) R.string.MERCHANT_PANEL_CALLS_METRICS_CONTENT_DESCRIPTION)), cqgr.fY(cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf2), cqgr.fP(new bgwg(), bekr.a, cqgr.bw(8388611))), cqgr.fY(cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf2), cqgr.fP(new bgwg(), beks.a, cqgr.bw(8388613)))))));
    }
}
