package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ulu  reason: default package */
/* loaded from: classes4.dex */
public final class ulu extends nd {
    private final Drawable a;
    private final Rect b = new Rect();
    private final int c;
    private final View d;

    public ulu(View view, int i) {
        this.d = view;
        this.a = udy.b(view.getContext(), R.drawable.og_list_divider, smc.c(view.getContext(), R.attr.colorHairline));
        this.c = i;
    }

    @Override // defpackage.nd
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        RecyclerView.L(childAt, this.b);
        int round = this.b.top + Math.round(childAt.getTranslationY());
        int intrinsicHeight = this.a.getIntrinsicHeight() + round;
        if (lj.e(this.d) == 1) {
            this.a.setBounds(0, round, recyclerView.getWidth() - this.c, intrinsicHeight);
        } else {
            this.a.setBounds(this.c, round, recyclerView.getWidth(), intrinsicHeight);
        }
        this.a.draw(canvas);
    }
}
