package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aopt  reason: default package */
/* loaded from: classes2.dex */
public final class aopt extends cqiw<aopu> {
    public static final cqjg a = cqjg.a();
    public static final cqrp b = cqrp.d(2.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aopu aopuVar, Context context, cqiv cqivVar) {
        aopu aopuVar2 = aopuVar;
        cqivVar.a(new anrl(), aopuVar2);
        cqivVar.f(new anpq(), aopuVar2.j());
        if (aopuVar2.i().booleanValue()) {
            cqivVar.a(new acnn(), aopuVar2);
        }
        cqivVar.a(new hax(), aopuVar2.g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aopu> a() {
        cqmj fY = cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.header)), cqgr.cd(-1), cqgr.bp(-2), iue.c(aopr.a), cqgr.P(false), cqgr.fP(new aopk(), aops.a, new cqmp[0]));
        cqjd[] cqjdVarArr = {cqjd.v(fY)};
        cqjb<aopu, cqiv> C = C();
        Integer valueOf = Integer.valueOf((int) R.id.timeline_segment_adding_list_view);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.B(aopo.a), cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(ird.b()), cqgr.P(false), cqgr.aT(aplg.a), fY, cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.bY(cqjdVarArr), cqgr.bX(aopp.a), GmmRecyclerView.aw(C, cqgr.z(irg.a()), cqgr.aR(valueOf), cqgr.aT(a), cqgr.dE(aopq.a)), jdx.b(jdx.c(valueOf)))));
    }
}
