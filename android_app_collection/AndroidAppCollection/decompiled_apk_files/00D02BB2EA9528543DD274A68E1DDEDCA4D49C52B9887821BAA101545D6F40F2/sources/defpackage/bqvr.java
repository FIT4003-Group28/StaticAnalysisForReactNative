package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bqvr  reason: default package */
/* loaded from: classes4.dex */
final class bqvr extends cqqw {
    final /* synthetic */ bqvt a;

    public bqvr(bqvt bqvtVar) {
        this.a = bqvtVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean z = recyclerView.computeVerticalScrollOffset() <= 0;
        bqvt bqvtVar = this.a;
        if (z != bqvtVar.k) {
            bqvtVar.k = z;
            cqkx.p(bqvtVar);
        }
    }
}
