package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwhc  reason: default package */
/* loaded from: classes4.dex */
public final class bwhc extends cqiw<bwht> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bwht bwhtVar, Context context, cqiv cqivVar) {
        cqivVar.f(new bwgd(), bwhtVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bwht> a() {
        Integer valueOf = Integer.valueOf((int) R.id.apps_grid_layout);
        cqlc cqlcVar = bwhb.a;
        cqgq n = cqgr.n();
        n.j();
        n.c = irf.b;
        n.d = 225;
        n.i(Float.valueOf(0.0f));
        cqnf b = n.b();
        cqgq n2 = cqgr.n();
        n2.c();
        n2.c = irf.c;
        n2.d = 195;
        n2.i(Float.valueOf(1.0f));
        return aefx.f(aefx.d(valueOf), aefx.e(bwgz.a), cqgr.cd(-1), cqgr.bp(-1), iue.b(cjtd.a(dtyb.dn)), jgn.a(cqgr.fs(bwha.a), cqjv.l(cqlcVar, b, n2.b()), jgn.b(cqrp.d(8.0d)), cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(80), GmmRecyclerView.aw(C(), cqgr.aR(valueOf), cqqx.p(null), cqgr.cd(-1), cqgr.bp(-1), cqqx.H(4), cqgr.z(ibm.b()), cqgr.dB(cqrp.d(24.0d)), cqgr.dQ(cqrp.d(16.0d)), cqgr.dF(cqrp.d(16.0d)), cqgr.aJ(16))));
    }
}
