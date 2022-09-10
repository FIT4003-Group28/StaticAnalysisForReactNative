package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bizr  reason: default package */
/* loaded from: classes3.dex */
public final class bizr extends cqqw {
    final /* synthetic */ bizu a;

    public bizr(bizu bizuVar) {
        this.a = bizuVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        if ((!canScrollVertically) == this.a.f.booleanValue()) {
            this.a.f = Boolean.valueOf(canScrollVertically);
            cqkx.p(this.a);
        }
    }
}
