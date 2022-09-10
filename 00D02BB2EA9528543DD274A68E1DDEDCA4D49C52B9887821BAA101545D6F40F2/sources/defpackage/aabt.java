package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: aabt  reason: default package */
/* loaded from: classes2.dex */
public final class aabt extends cqiw<aabu> {
    private static final dcqe b = dcqe.c("aabt");
    static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aabu aabuVar, Context context, cqiv cqivVar) {
        aabu aabuVar2 = aabuVar;
        List<cqix<? extends aklb>> a2 = aabuVar2.a();
        a2.size();
        int min = Math.min(aabuVar2.h(), a2.size());
        int min2 = Math.min(20, a2.size());
        if (min >= 0) {
            min2++;
        }
        aabuVar2.f().booleanValue();
        for (cqix<? extends aklb> cqixVar : a2) {
            aklb b2 = cqixVar.b();
            if (b2 instanceof aklg) {
                ((aklg) b2).n(cqivVar.i());
            } else {
                bvoo.h("View model of card passed to Experience Categorical List not of type SingleEventCardViewModel.", new Object[0]);
            }
            cqivVar.e(cqixVar);
            if (cqivVar.i() == min && aabuVar2.g() != null) {
                bsmy g = aabuVar2.g();
                bsmq bsmqVar = new bsmq(true);
                dbsk.s(g);
                cqivVar.a(bsmqVar, g);
            }
            if (aabuVar2.f().booleanValue() && cqivVar.i() == min2) {
                cqivVar.a(new cbpp(), aabuVar2.e());
            }
        }
        if (aabuVar2.c().booleanValue()) {
            cqivVar.a(new aabs(), new aabr());
        }
        if (cqivVar.i() == 0) {
            cqivVar.a(new aado(), aabuVar2.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aabu> a() {
        return GmmRecyclerView.aw(C(), cqgr.aT(a), cqgr.z(irg.a()), cqgr.cd(-1), cqgr.bp(-1), cqqx.v(aabq.a));
    }
}
