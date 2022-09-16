package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxs  reason: default package */
/* loaded from: classes5.dex */
public final class cxs extends cqiw<cyf> {
    public static final /* synthetic */ int a = 0;
    private static final cqjg b = cqjg.a();
    private static final cqjg c = cqjg.a();
    private static final cqjg d = cqjg.a();
    private static final cqjg e = cqjg.a();

    public static <T extends cqkp> cqmj<T> c(cqlc<T, String> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.eN(5), cqgr.co(cqrp.d(3.0d), false), irn.j(), irn.v(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    private static cqmj<cyf> e(cqlc<cyf, cqsn> cqlcVar, cqlc<cyf, View.OnClickListener> cqlcVar2, cqmp<cyf>... cqmpVarArr) {
        cqmj<cyf> c2 = its.c(cqlcVar, cqlcVar2, cqgr.cd(-2), cqgr.bq(irh.a()), cqgr.fh(cqrp.d(17.0d)), cqgr.eU(ibm.x()));
        c2.f(cqmpVarArr);
        return c2;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cyf cyfVar, Context context, cqiv cqivVar) {
        List<cyh> g = cyfVar.g();
        if (g.isEmpty()) {
            return;
        }
        cqivVar.a(new cxp(), g.get(0));
        if (g.size() <= 1) {
            return;
        }
        cqivVar.f(new cxr(), g.subList(1, g.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cyf> a() {
        final cqmj<cyf> e2 = e(cqkz.a(cqrt.l(R.string.CLOSE_BUTTON)), cqgr.q(cxe.a), cqgr.aT(d), itj.i(dtyi.cO), cqgr.bN(0));
        final cqmj<cyf> e3 = e(cqkz.a(cqrt.l(R.string.GENERIC_SAVE_BUTTON)), cqgr.q(cxf.a), cqgr.aT(c), itj.i(dtyi.cO), cqgr.bN(0));
        cqmj gd = cqgr.gd(cqgr.bY(cqjd.e()), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.ck(C()), cqgr.af(cqta.f()));
        cqmj a2 = cjmv.a(cqgr.J(true), cqgr.cH(cqrp.d(48.0d)), cqgr.cL(cqrp.d(48.0d)), cqgr.bY(cqjd.i(), cqjd.e()), cqgr.I(cxg.a), itj.i(dtyi.cP), cqgr.cX(cxh.a), cqgr.V(cxi.a));
        cqmj gj = cqgr.gj(cqgr.dr(0), cqgr.bV(cqrp.d(18.0d)), cqgr.bp(-2), cqgr.cd(-1), cqgr.bY(cqjd.v(gd), cqjd.e()), a2, c(cxj.a, cqgr.cH(cqrp.d(48.0d)), cqgr.cL(cqrp.d(48.0d)), cqgr.bY(cqjd.i(), cqjd.B(a2)), cqgr.bR(cqrp.d(10.0d))), cqgr.aF(cxk.a));
        return cqgr.gk(cqgr.cd(-1), cqgr.bp(-1), cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.z(irg.a()), cqgr.gq(cqgr.dQ(cqrp.d(24.0d)), cqgr.dU(cqrp.d(24.0d)), cqgr.dB(cqrp.d(18.0d)), irn.f(), irn.x(), cqgr.eN(5), cqgr.eM(cxn.a)), gvb.d(false, new cqmp[0]), cqgr.gj(cqgr.dr(1), cqgr.bp(-2), cqgr.dQ(cqrp.d(24.0d)), cqgr.dF(cqrp.d(24.0d)), cqgr.dU(cqrp.d(18.0d)), cqgr.dB(cqrp.d(10.0d)), gd, gj, acnm.a(cqgr.bV(cqrp.d(24.0d)), cqgr.bY(cqjd.v(gj), cqjd.f()), e(cqkz.a(cqrt.l(R.string.ADS_SETTINGS_BUTTON)), cqgr.q(cxl.a), cqgr.bw(8388613), itj.i(dtyi.cN), cqgr.aT(b)), cqgr.gv(cqgr.aT(e), cqgr.ad(new cqlc(e2, e3) { // from class: cxm
            private final cqmj a;
            private final cqmj b;

            {
                this.a = e2;
                this.b = e3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqmj cqmjVar = this.a;
                cqmj cqmjVar2 = this.b;
                int i = cxs.a;
                return ((cyf) cqkpVar).i().booleanValue() ? cqmjVar.c() : cqmjVar2.c();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bw(8388613), e2, e3)))));
    }
}
