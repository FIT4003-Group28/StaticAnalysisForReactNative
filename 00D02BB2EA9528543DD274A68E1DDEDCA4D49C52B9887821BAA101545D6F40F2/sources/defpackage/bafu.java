package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bafu  reason: default package */
/* loaded from: classes3.dex */
final class bafu extends cqqw {
    final /* synthetic */ bafx a;

    public bafu(bafx bafxVar) {
        this.a = bafxVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        if ((!canScrollVertically) == this.a.n.booleanValue()) {
            this.a.n = Boolean.valueOf(canScrollVertically);
            cqkx.p(this.a);
        }
    }
}
