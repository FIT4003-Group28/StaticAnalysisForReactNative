package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: cjeq  reason: default package */
/* loaded from: classes4.dex */
public final class cjeq extends cqiw<cjet> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cjet cjetVar, Context context, cqiv cqivVar) {
        cjet cjetVar2 = cjetVar;
        for (int i2 = 1; i2 < cjetVar2.a().size(); i2++) {
            cqivVar.c(new cjep());
            cqivVar.a(new cjes(), cjetVar2.a().get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cjet> a() {
        return ijd.a(cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqrp.d(14.0d)), cqgr.x(irn.G()), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.gq(cqgr.eI("Begelsmith Bedford"), ibq.f(), cqgr.ca(Float.valueOf(1.0f)), cqgr.eN(5)), cqgr.gq(cqgr.eI("189 Bedford Ave, Brooklyn, NY 11211, USA"), ibq.p(), cqgr.eN(5)), cqgr.gq(cqgr.eI("0.4 mi away"), ibq.p(), cqgr.eN(5)), cqgr.fP(new cjes(), cjeo.a, new cqmp[0])), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-2), cqgr.ep(false))));
    }
}
