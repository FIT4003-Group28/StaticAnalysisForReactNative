package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bkci  reason: default package */
/* loaded from: classes3.dex */
public final class bkci extends cqiw<bkdi> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bkdi bkdiVar, Context context, cqiv cqivVar) {
        boolean z = true;
        for (bkdg bkdgVar : bkdiVar.a()) {
            if (!z) {
                cqivVar.c(ict.p(false, new cqmp[0]));
            }
            cqivVar.a(new bkch(), bkdgVar);
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bkdi> a() {
        return GmmRecyclerView.aw(C(), cqgr.ep(false));
    }
}
