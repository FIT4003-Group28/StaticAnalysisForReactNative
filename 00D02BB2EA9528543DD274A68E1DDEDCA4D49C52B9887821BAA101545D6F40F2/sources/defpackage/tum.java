package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tum  reason: default package */
/* loaded from: classes7.dex */
final class tum extends cqiw<ubt> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ubt> a() {
        cqlc cqlcVar = tuh.a;
        ttm ttmVar = new ttm();
        cqlc cqlcVar2 = tui.a;
        cqmp[] cqmpVarArr = {cqgr.aq(tuj.a)};
        cqlc cqlcVar3 = tuk.a;
        final cqtv z = ibn.z();
        final cqtd a2 = itd.a(cqrp.d(1.0d), ibm.h());
        cqmj j = ict.j(cqkz.a(false), cqlcVar, jgi.d(cqgr.dr(1), cqgr.ce(tun.a), cqgr.z(ibm.b()), cqgr.fP(ttmVar, cqlcVar2, cqmpVarArr), GmmRecyclerView.ax(cqlcVar3, cqgr.aR(Integer.valueOf((int) R.id.directions_group_list)), cqqx.p(null), cqgr.cd(-1), cqgr.bp(-1), cqgr.R("A list of directions results"), cqgr.z(ibm.g()), cqqx.K(new cqjb(a2, z) { // from class: tug
            private final cqtd a;
            private final cqtv b;

            {
                this.a = a2;
                this.b = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                ubt ubtVar = (ubt) cqkpVar;
                return new tub(this.a.a(context), this.b.e(context), true);
            }
        }), cqqx.F())), cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.result_list_error_layout)), cqgr.ce(tun.a), cqgr.bp(-2), cqgr.fP(new ico(), tul.a, new cqmp[0])));
        j.f(cqgr.cd(-2), cqgr.bp(-2), cqgr.z(ibm.b()));
        return cqgr.fY(cqgr.ce(tun.a), cqgr.bp(-2), j);
    }
}
