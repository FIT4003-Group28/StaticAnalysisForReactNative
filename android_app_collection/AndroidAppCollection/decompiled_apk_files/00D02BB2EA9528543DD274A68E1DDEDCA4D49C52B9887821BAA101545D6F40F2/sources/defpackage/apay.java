package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apay  reason: default package */
/* loaded from: classes2.dex */
public final class apay extends cqiw<apbs> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, apbs apbsVar, Context context, cqiv cqivVar) {
        for (apbu apbuVar : apbsVar.a()) {
            if (apbuVar.c().booleanValue()) {
                cqivVar.a(new apbr(), apbuVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<apbs> a() {
        return cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.x(irg.a()), cqgr.fY(cqgr.x(irg.a()), cqgr.cd(-1), cqgr.bp(-2), GmmRecyclerView.aw(C(), cqgr.aT(apkj.a), cqgr.aR(Integer.valueOf((int) R.id.recycler_view)), cqgr.cd(-1), cqgr.bp(-2), cqgr.ep(false), cqqx.F(), cqqx.v(apax.a), cqgr.ck(C()))));
    }
}
