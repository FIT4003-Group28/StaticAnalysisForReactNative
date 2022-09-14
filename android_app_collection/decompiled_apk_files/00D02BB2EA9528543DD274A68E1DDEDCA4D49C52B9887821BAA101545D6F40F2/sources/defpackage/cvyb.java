package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvyb  reason: default package */
/* loaded from: classes5.dex */
public final class cvyb extends abp {
    private final Drawable a;
    private final Rect b = new Rect();
    private final int c;
    private final View d;

    public cvyb(View view, int i) {
        this.d = view;
        this.a = cwiz.a(view.getContext(), R.drawable.og_list_divider, cqez.a(view.getContext()));
        this.c = i;
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        RecyclerView.ad(childAt, this.b);
        int round = this.b.top + Math.round(childAt.getTranslationY());
        int intrinsicHeight = this.a.getIntrinsicHeight() + round;
        if (od.s(this.d) == 1) {
            this.a.setBounds(0, round, recyclerView.getWidth() - this.c, intrinsicHeight);
        } else {
            this.a.setBounds(this.c, round, recyclerView.getWidth(), intrinsicHeight);
        }
        this.a.draw(canvas);
    }
}
