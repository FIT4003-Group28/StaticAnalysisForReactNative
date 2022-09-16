package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aool  reason: default package */
/* loaded from: classes2.dex */
public final class aool extends cqiw<aopu> {
    private static final cqtv b = cqrp.d(8.0d);
    static final cqtv a = irh.a();

    @SafeVarargs
    private static cqmj<aopu> e(cqlc<aopu, cqsn> cqlcVar, cqlc<aopu, View.OnClickListener> cqlcVar2, cqmp<aopu>... cqmpVarArr) {
        cqmj<aopu> c = its.c(cqlcVar, cqlcVar2, cqgr.eU(cqrt.c(R.color.qu_blue_grey_400)), cqgr.cH(irh.a()), cqgr.x(irn.L()), cqgr.bq(a), cqgr.bG(b), cqgr.bw(8388629));
        c.f(cqmpVarArr);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aopu> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(8388613), cqgr.z(irg.a()), e(cqkz.a(cqrt.l(R.string.CANCEL_BUTTON)), cqgr.q(aooj.a), itj.i(dtyi.R)), e(cqkz.a(cqrt.l(R.string.SAVE)), cqgr.q(aook.a), itj.i(dtyi.T)));
    }
}
