package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: acch  reason: default package */
/* loaded from: classes2.dex */
public final class acch extends cqiw<accj> {
    public static final cqtv a;
    public static final cqtv b;
    private static final cqtv c;
    private static final cqtv d;

    static {
        cqrp d2 = cqrp.d(2.0d);
        c = d2;
        d = cqrp.d(8.0d);
        Float valueOf = Float.valueOf(2.0f);
        a = cqsg.d(abjc.a, cqsg.f(d2, valueOf));
        b = cqsg.g(abjc.b, cqsg.f(d2, valueOf));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, accj accjVar, Context context, cqiv cqivVar) {
        List<acci> e = accjVar.e();
        int i2 = 0;
        while (i2 < e.size()) {
            cqivVar.a(new accg(), e.get(i2));
            i2++;
            if (i2 < e.size()) {
                cqivVar.c(new acbz());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<accj> a() {
        cqjb<accj, cqiv> C = C();
        cqtv cqtvVar = d;
        return cqgr.fY(cqgr.bp(-2), cqgr.x(irg.a()), GmmRecyclerView.aw(C, cqgr.aT(accj.a), cqgr.aR(Integer.valueOf((int) R.id.visual_explore_pivots_carousel)), cqgr.d(R.id.visual_explore_header), cqgr.cd(-1), cqqx.G(), cqgr.dQ(cqtvVar), cqgr.dF(cqtvVar), cqgr.P(false), cqgr.ep(false), cqqx.p(null)));
    }
}
