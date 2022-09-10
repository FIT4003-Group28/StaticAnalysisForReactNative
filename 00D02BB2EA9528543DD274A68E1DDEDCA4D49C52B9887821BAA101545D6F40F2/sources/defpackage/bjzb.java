package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjzb  reason: default package */
/* loaded from: classes3.dex */
public final class bjzb extends cqqw {
    final /* synthetic */ bjzd a;

    public bjzb(bjzd bjzdVar) {
        this.a = bjzdVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        if ((!canScrollVertically) == this.a.d.booleanValue()) {
            this.a.d = Boolean.valueOf(canScrollVertically);
            cqkx.p(this.a);
        }
    }
}
