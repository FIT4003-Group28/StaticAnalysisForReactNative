package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: abqg  reason: default package */
/* loaded from: classes.dex */
public final class abqg extends nd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(float f, View view) {
        view.getContext();
        view.setAlpha(f);
        view.animate().setStartDelay(6000L).alpha(0.0f).setDuration(4000L).start();
    }

    @Override // defpackage.nd
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int measuredHeight = (int) (recyclerView.getMeasuredHeight() * 0.3f);
            int top = (childAt.getTop() + childAt.getBottom()) / 2;
            g(top < measuredHeight ? ((top * 0.7f) / measuredHeight) + 0.2f : 0.9f, childAt);
        }
    }
}
