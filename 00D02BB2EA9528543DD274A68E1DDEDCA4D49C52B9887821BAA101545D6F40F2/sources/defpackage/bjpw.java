package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: bjpw  reason: default package */
/* loaded from: classes3.dex */
public final class bjpw extends cqiw<bjpx> {
    static final cqjg a = cqjg.a();
    static final cqix<cqkp> b = cqgr.fT(ict.p(false, cqgr.bV(cqrp.d(12.0d)), cqgr.bJ(cqrp.d(20.0d))), cqkp.T);
    public static final /* synthetic */ int c = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bjpx bjpxVar, Context context, cqiv cqivVar) {
        bjpx bjpxVar2 = bjpxVar;
        cqix<bjpf> b2 = bjpxVar2.b();
        if (b2 != null) {
            cqivVar.e(b2);
        }
        bjoo c2 = bjpxVar2.c();
        cqivVar.e(c2 == null ? b : cqgr.fT(new bjon(), c2));
        cqivVar.g(bjpxVar2.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bjpx> a() {
        cqmp[] cqmpVarArr = {cqgr.aT(a), hxc.f(bjpi.a), hxc.g(bjpn.a), hxc.h(cqgr.q(bjpo.a)), hxc.j(cqgr.q(bjpp.a)), hxc.k(cqkz.b(bjpq.a)), hxc.i(bjpr.a)};
        cqjb<bjpx, cqiv> C = C();
        cqmp[] cqmpVarArr2 = {cqgr.aI(bjps.a), cqqx.F(), cqgr.cd(-1), cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.R("Question and answers for the place")};
        cqmp[] cqmpVarArr3 = {cqgr.aI(bjpt.a), cqgr.cd(-1), cqgr.bq(cqrp.d(2.0d)), cqgr.x(ibp.a())};
        cqmp[] cqmpVarArr4 = {cqgr.bK(cqrp.d(12.0d)), WebImageView.l(bjpv.a), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ch(cqrp.d(32.0d))};
        cqmj gd = cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cjmw.c(cjmw.f(bjpj.a), cjmw.a(cqgr.au(bjpk.a), cqgr.cx(1000), cqgr.cB(6), cqgr.be(49153), cqgr.dp(cqgi.a(bjpl.a))), cqgr.aU(268435456), cjmw.i(), cjmw.g(iut.a(cqrt.h(2131232417, ibm.x()))), cjmw.h(cqgr.q(bjpm.a))));
        gd.f(cqgr.dM(cqrp.d(12.0d)));
        cqmj gd2 = cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(0), cqgr.dJ(cqrp.d(20.0d)), cqgr.x(ibm.b()), cqgr.M(false), WebImageView.a(cqmpVarArr4), gd);
        gd2.f(cqgr.aF(bjpu.a), cqgr.bD(ird.c()));
        return cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.x(ibm.b()), hxc.a(cqmpVarArr), jih.a(C, cqmpVarArr2), cqgr.gs(cqmpVarArr3), gd2);
    }
}
