package defpackage;

import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkur  reason: default package */
/* loaded from: classes3.dex */
public final class bkur extends cqiw<blku> {
    private static cqmj<blku> e(final int i) {
        return cqgr.fY(cqgr.bq(cqrp.d(4.0d)), cqgr.cd(-1), cqgr.bV(cqrp.d(4.0d)), cqgr.bD(cqrp.d(4.0d)), cqgr.aJ(16), cqgr.gc(cqgr.bp(-1), cqgr.cd(-1), cqgr.v(Integer.valueOf((int) R.drawable.rating_histogram_bar_background_mod))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.fL(Float.valueOf(1.0f)), cqgr.gc(cqgr.ce(cqrp.d(dcyn.a)), cqgr.cL(cqrp.d(1.0d)), cqgr.bq(cqrp.d(4.0d)), cqgr.cc(new cqlc(i) { // from class: bkum
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((blku) cqkpVar).a(Integer.valueOf(this.a)).a();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.v(Integer.valueOf((int) R.drawable.rating_histogram_bar_mod)))), cqgr.bR(cqrp.d(8.0d)), cqgr.bG(irh.g()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<blku> a() {
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bp(-2), cqgr.bw(16), cqgr.aW(4), e(4), e(3), e(2), e(1), e(0));
        cqlc cqlcVar = bkuj.a;
        cqlc cqlcVar2 = bkuk.a;
        cqlc cqlcVar3 = bkul.a;
        cqmp[] cqmpVarArr = {cqgr.cd(-2), cqgr.aJ(17), cqgr.bG(cqrp.d(20.0d))};
        cqmj gd2 = cqgr.gd(cqgr.dr(1), cqgr.K(bkun.a), cqgr.cW(cqgr.q(bkuo.a)), iue.c(bkup.a), cqgr.gq(cqgr.eK(cqiq.c("%.1f", cqiq.h(bkuq.a))), cqgr.cd(-2), cqgr.bp(-2), cqgr.aZ(false), cqgr.aW(2), ibq.b(), cqgr.eU(ibm.t())), FiveStarView.g(cqlcVar, jfo.d), cqgr.gq(cqgr.eM(cqlcVar2), cqgr.V(cqlcVar3), cqgr.cd(-2), cqgr.bV(cqrp.d(4.0d)), ibq.q(), cqgr.eU(ibm.o()), cqgr.aZ(false)));
        gd2.f(cqmpVarArr);
        return cqgr.gd(cqgr.aJ(16), cqgr.dB(cqrp.d(8.0d)), cqgr.dU(cqrp.d(8.0d)), cqgr.az(false), cqgr.aC(true), gd2, gd);
    }
}
