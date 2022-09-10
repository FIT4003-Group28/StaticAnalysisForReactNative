package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: uua  reason: default package */
/* loaded from: classes7.dex */
final class uua extends cqqw {
    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        View a = cqhu.a((View) ((View) recyclerView.getParent()).getParent(), uuh.a);
        boolean canScrollVertically = recyclerView.canScrollVertically(1);
        if (a != null) {
            a.setAlpha(true != canScrollVertically ? 0.0f : 1.0f);
        }
    }
}
