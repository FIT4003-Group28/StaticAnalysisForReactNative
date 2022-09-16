package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbir  reason: default package */
/* loaded from: classes4.dex */
public final class cbir extends cqiw<cbql> {
    public static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cbql cbqlVar, Context context, cqiv cqivVar) {
        cbql cbqlVar2 = cbqlVar;
        for (cbqi cbqiVar : cbqlVar2.c()) {
            cqivVar.a(new cbfe(cqrp.d(3.0d), cqrp.d(3.0d), cqrp.d(dcyn.a), cqrp.d(dcyn.a)), cbqiVar);
        }
        cqivVar.a(new cbiq(), cbqlVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cbql> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(cqrp.d(4.0d)), cqgr.dB(cqrp.d(4.0d)), cqqx.G(), cqgr.ep(false), cqgr.P(false), cqgr.aR(Integer.valueOf((int) R.id.event_category_scroll_view)), cqgr.z(ibm.b()), cqgr.aJ(16), cqgr.aT(a), cqgr.az(true), cqgr.aC(true));
    }
}
