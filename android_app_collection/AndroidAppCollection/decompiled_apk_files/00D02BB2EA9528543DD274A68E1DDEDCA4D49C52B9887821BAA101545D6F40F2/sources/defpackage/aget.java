package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: aget  reason: default package */
/* loaded from: classes2.dex */
public final class aget extends cqiw<agyu> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, agyu agyuVar, Context context, cqiv cqivVar) {
        agyu agyuVar2 = agyuVar;
        List<? extends agyv> d = agyuVar2.d();
        int i2 = 0;
        while (i2 < d.size()) {
            cqivVar.a(new ages(i2 != 0), d.get(i2));
            i2++;
        }
        cqivVar.a(new agel(), agyuVar2);
    }

    @Override // defpackage.cqiw
    public final cqmj<agyu> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(agxk.a()), cqgr.dF(agxk.a()), cqgr.bD(ibn.f()), cqgr.bV(agxk.a()), cqgr.gd(cqgr.dr(0), cqgr.aJ(16), cqgr.cd(-1), cqgr.bp(-2), cqgr.gc(cqgr.ch(irh.p()), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eG(agef.a)), iue.f(ibq.m(), ibq.v(), cqgr.eN(5), cqgr.eM(ageg.a))), cqgr.gq(cqgr.cd(-1), cqgr.bR(irh.g()), cqgr.bG(irh.g()), cqgr.bD(ibn.d()), ibq.p(), ibq.y(), cqgr.eN(5), cqgr.eM(ageh.a)), GmmRecyclerView.aw(C(), cqgr.bp(-2), cqgr.cd(-1), cqqx.F(), cqqx.p(null)));
    }
}
