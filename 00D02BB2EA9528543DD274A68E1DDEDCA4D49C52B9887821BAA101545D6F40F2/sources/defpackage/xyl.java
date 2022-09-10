package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xyl  reason: default package */
/* loaded from: classes7.dex */
public final class xyl extends cqiw<xzu> {
    public static final /* synthetic */ int a = 0;
    private static final cqtb b = cqrt.d(R.dimen.directions_transitsegment_width);

    private static cqmj<xzu> e(float f) {
        return ztj.q(cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), ztj.r(xym.a), cqgr.ef(Float.valueOf(f)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<xzu> a() {
        cqmp[] cqmpVarArr = {cqgr.bp(-1), xym.g(), cqgr.dr(1), e(180.0f), cqgr.gc(cqgr.bq(b), cqgr.bR(cqrp.d(2.5d)), cqgr.bG(cqrp.d(2.5d)), cqgr.bw(17), cqgr.eE(cqrt.i(vyt.f, ibm.p()))), e(0.0f)};
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.aR(Integer.valueOf((int) R.id.details_non_transit_leg)), xym.b(cqgr.cH(cqrp.d(100.0d)), cqgr.K(xyh.a), iue.c(xyi.a), cqgr.x(ibo.c()), cqgr.cW(cqgr.q(xyj.a)), cqgr.gd(cqmpVarArr), cqgr.gd(xym.c(), xym.d(), cqgr.dr(1), cqgr.cd(-1), cqgr.cH(cqrp.d(90.0d)), xym.f(), cqgr.gd(cqgr.ca(valueOf), cqgr.gd(cqgr.ca(valueOf), cqgr.dr(1), cqgr.bw(16), cqgr.gq(cqgr.ca(valueOf), cqgr.bw(16), cqgr.eN(5), cqgr.eR(xyk.a), xyq.b()))), xym.f())));
    }
}
