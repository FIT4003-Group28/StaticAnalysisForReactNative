package defpackage;

import android.content.Context;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgwz  reason: default package */
/* loaded from: classes3.dex */
public final class bgwz extends cqiw<bgyp> {
    public static final cqjg a = cqjg.a();
    private static final Interpolator b = new LinearInterpolator();
    private static final Interpolator c = new aop();
    private static final Interpolator d = new aon();
    private final ckln<bgyp> e = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bgyp bgypVar, Context context, cqiv cqivVar) {
        bgyp bgypVar2 = bgypVar;
        this.e.b(cqivVar, bgypVar2.c().intValue(), 0).b(new bgwr(), bgypVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bgyp> a() {
        Float valueOf = Float.valueOf(0.0f);
        cqlc cqlcVar = bgws.a;
        cqgq n = cqgr.n();
        n.j();
        Float valueOf2 = Float.valueOf(1.0f);
        n.a = valueOf2;
        Interpolator interpolator = b;
        n.c = interpolator;
        n.d = 100;
        cqnf b2 = n.b();
        cqgq n2 = cqgr.n();
        n2.c();
        n2.a = valueOf;
        n2.c = interpolator;
        n2.d = 100;
        bgxj bgxjVar = new bgxj();
        cqlc cqlcVar2 = bgwt.a;
        cqmp[] cqmpVarArr = {cqgr.dQ(ibn.f()), cqgr.dF(ibn.f())};
        Float valueOf3 = Float.valueOf(0.9f);
        cqlc cqlcVar3 = bgwu.a;
        cqgq n3 = cqgr.n();
        n3.j();
        n3.f = valueOf2;
        n3.g = valueOf2;
        n3.c = c;
        n3.d = 100;
        cqnf b3 = n3.b();
        cqgq n4 = cqgr.n();
        n4.c();
        Float valueOf4 = Float.valueOf(0.94f);
        n4.f = valueOf4;
        n4.g = valueOf4;
        n4.c = d;
        n4.d = 100;
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(cqrp.d(10.0d)), cqgr.dB(ibn.d()), cqgr.x(cqtt.l(ibm.b(), ibn.k())), cqgr.ap(cqrp.d(8.0d)), cqgr.i(valueOf), cqjv.l(cqlcVar, b2, n2.b()), cqgr.fP(bgxjVar, cqlcVar2, cqmpVarArr), cqgr.gd(cqgr.aT(a), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.S(Integer.valueOf((int) R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_SELECTION)), cqgr.ek(valueOf3), cqgr.el(valueOf3), cqjv.l(cqlcVar3, b3, n4.b()), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-2), cqgr.S(Integer.valueOf((int) R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_MONTHS)), ckln.a(this.e), cqgr.fF(bgwv.a)), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(17.0d)), cqgr.dQ(ibn.d()), cqgr.dF(ibn.d()), cqgr.aJ(8388613), hyb.c(cqgr.cd(-2), cqgr.bp(-2), cqgr.eJ(cqrt.l(R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_CANCEL)), cqgr.cW(cqgr.q(bgww.a)), iue.b(cjtd.a(dtxv.bl))), hyb.a(cqgr.au(bgwx.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(ibn.d()), cqgr.eJ(cqrt.l(R.string.MERCHANT_PANEL_INSIGHTS_MONTH_PICKER_APPLY)), cqgr.cW(cqgr.q(bgwy.a)), iue.b(cjtd.a(dtxv.bk))))));
    }
}
