package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjwb  reason: default package */
/* loaded from: classes3.dex */
public final class bjwb extends cqiw<bjwz> {
    private static final jby a = hsd.e(ibn.d());

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bjwz bjwzVar, Context context, cqiv cqivVar) {
        boolean z;
        hsd hsdVar = new hsd();
        bjrh bjrhVar = new bjrh();
        bjrq bjrqVar = new bjrq();
        bjvy bjvyVar = new bjvy();
        loop0: while (true) {
            z = true;
            for (bjwy bjwyVar : bjwzVar.b()) {
                if (z) {
                    cqivVar.a(hsdVar, a);
                }
                if (bjwyVar instanceof bjwj) {
                    cqivVar.a(bjrhVar, (bjwj) bjwyVar);
                } else if (bjwyVar instanceof bjwk) {
                    cqivVar.a(bjrqVar, (bjwk) bjwyVar);
                }
                if (bjwyVar.h() != null) {
                    bjwx h = bjwyVar.h();
                    h.getClass();
                    cqivVar.a(bjvyVar, h);
                    z = false;
                }
            }
        }
        if (z) {
            cqivVar.a(hsdVar, a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bjwz> a() {
        cqrp f = ibn.f();
        return jgi.d(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dU(ibn.d()), iue.c(bjvz.a), ict.n(false, new cqmp[0]), cqgr.gq(cqgr.cd(-1), cqgr.dz(f, f, f, f), cqgr.eL(Integer.valueOf((int) R.string.PLACE_QA_SUGGESTED_ANSWERS_CONTAINER_TITLE)), ibq.k(), ibq.x(), ibq.z(), cqgr.eN(5)), ict.n(false, new cqmp[0]), GmmRecyclerView.aw(C(), cqgr.aT(bjwz.a), cqgr.cd(-1), cqgr.bp(-2), cqqx.v(bjwa.a), cqqx.p(null)));
    }
}
