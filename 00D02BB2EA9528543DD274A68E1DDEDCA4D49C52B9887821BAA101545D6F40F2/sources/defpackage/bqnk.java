package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqnk  reason: default package */
/* loaded from: classes4.dex */
public final class bqnk extends cqiw<bqsw> {
    private static final cqtv b = cqrp.d(20.0d);
    private final ckln<bqsw> a = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bqsw bqswVar, Context context, cqiv cqivVar) {
        this.a.b(cqivVar, 2, 16).b(new bqns(), bqswVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bqsw> a() {
        cqtv cqtvVar = b;
        cqmp[] cqmpVarArr = {cqgr.eL(Integer.valueOf((int) R.string.TRIP_TYPE_QUESTION_TEXT)), ibq.h()};
        cqmp[] cqmpVarArr2 = {cqgr.eL(Integer.valueOf((int) R.string.SELECT_ALL_THAT_APPLY_TEXT)), ibq.p(), cqgr.bD(cqrp.d(8.0d))};
        cqjb<bqsw, cqiv> C = C();
        cqrp d = cqrp.d(1.0d);
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.dz(cqtvVar, cqrp.d(dcyn.a), cqtvVar, ibn.f()), cqgr.gq(cqmpVarArr), cqgr.gq(cqmpVarArr2), GmmRecyclerView.aw(C, cqgr.cd(-1), cqgr.bp(-2), cqgr.dz(d, d, d, d), cqgr.aJ(17), cqgr.ch(cquz.b), cqqx.p(null), ckln.a(this.a)));
    }
}
