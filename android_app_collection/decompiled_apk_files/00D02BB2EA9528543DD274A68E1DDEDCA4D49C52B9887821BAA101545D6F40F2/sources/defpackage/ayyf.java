package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayyf  reason: default package */
/* loaded from: classes3.dex */
public final class ayyf extends cqiw<ayyi> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(278.0d);
    private static final cqjg c = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ayyi ayyiVar, Context context, cqiv cqivVar) {
        List<ayyg> e = ayyiVar.e();
        for (int i2 = 0; i2 < e.size(); i2++) {
            cqivVar.a(new ayye(), e.get(i2));
            if (i2 < e.size() - 1) {
                cqivVar.c(new ayxz());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ayyi> a() {
        cqjg cqjgVar = c;
        cqmp[] cqmpVarArr = {cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(ibn.a()), cqgr.cW(cqgr.q(ayxu.a)), cqgr.V(ayxv.a), cqgr.gq(cqgr.aT(cqjgVar), cqgr.bY(cqjd.c()), cqgr.cd(-2), cqgr.bp(-2), cqgr.aJ(17), ibq.l(), ibq.x(), cqgr.eN(4), cqgr.eL(Integer.valueOf((int) R.string.RECOMMENDED_PLACES_TITLE))), cqgr.fY(cqgr.bY(cqjd.A(cqjgVar), cqjd.t()), cqgr.x(irn.J()), cqgr.bR(cqrp.d(12.0d)), cqgr.ch(cqrp.d(24.0d)), cqgr.gc(cqgr.bw(17), cqgr.aJ(17), cqgr.eG(ayxw.a)))};
        cqlc cqlcVar = ayxq.a;
        cqgq n = cqgr.n();
        n.a = Float.valueOf(0.0f);
        n.c();
        cqnf b2 = n.b();
        cqgq n2 = cqgr.n();
        n2.a = Float.valueOf(1.0f);
        n2.j();
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.x(ibm.b()), cqgr.dU(ibn.f()), cqjv.l(ayxm.a, cqgr.bq(cqrp.d(dcyn.a)), cqgr.bp(-2)), cqgr.gj(cqmpVarArr), cqgr.fY(cqjv.l(cqlcVar, b2, n2.b()), cqqx.E(cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(16.0d)), cqgr.bD(cqrp.d(16.0d)), cqqx.o(cqrp.d(8.0d)), cqqx.i(cqrp.d(3.0d)), cqqx.g(cqrp.d(8.0d)), cqqx.d(ibm.b()), cqgr.gd(cqgr.dr(1), cqgr.fY(cqgr.aI(ayxr.a), cqgr.cd(-1), cqgr.bq(b), cqgr.bw(17), itj.s(cqgr.fI(0), cqgr.bw(17), cqgr.ch(cqrp.d(48.0d)))), cqqx.D(cqqx.F(), cqgr.ck(C()), cqgr.bk(ayxs.a)), cqgr.fP(new ayxz(), ayxt.a, new cqmp[0]), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(cqrp.d(48.0d)), cqgr.aJ(17), cqgr.cW(cqgr.q(ayxx.a)), iue.b(cjtd.a(dtyb.dM)), cqgr.S(Integer.valueOf((int) R.string.RECOMMENDED_PLACES_REFRESH_BUTTON_CONTENT_DESCRIPTION)), cqgr.x(ibq.E()), cqgr.aX(ayxy.a), cqgr.K(ayxn.a), cqgr.gc(cqgr.ch(cqrp.d(18.0d)), cqgr.bG(cqrp.d(4.0d)), cqgr.eG(ayxo.a)), cqgr.gq(ibq.r(), cqgr.aW(2), cqgr.eW(ayxp.a), cqgr.eL(Integer.valueOf((int) R.string.RECOMMENDED_PLACES_REFRESH_BUTTON_LABEL))))))));
    }
}
