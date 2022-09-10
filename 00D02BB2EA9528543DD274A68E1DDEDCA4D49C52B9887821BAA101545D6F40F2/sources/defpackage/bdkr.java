package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bdkr  reason: default package */
/* loaded from: classes3.dex */
public final class bdkr extends cqiw<bdks> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bdks bdksVar, Context context, cqiv cqivVar) {
        bdks bdksVar2 = bdksVar;
        if (bdksVar2.g().booleanValue()) {
            for (bdlm bdlmVar : bdksVar2.d()) {
                cqivVar.a(bdlmVar.k(), bdlmVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdks> a() {
        return GmmRecyclerView.aw(C(), cqqx.r(new bdkq(new Object[0])), cqjv.f(cqqi.ITEM_TOUCH_HELPER, bdkn.a), cqgr.V(bdko.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.bw(8388627), cqgr.dQ(bdll.c), cqgr.ep(false));
    }
}
