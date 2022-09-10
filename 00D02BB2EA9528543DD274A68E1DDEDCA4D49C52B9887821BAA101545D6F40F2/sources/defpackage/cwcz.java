package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwcz  reason: default package */
/* loaded from: classes5.dex */
public final class cwcz extends abp {
    private final Drawable a;
    private final Rect b = new Rect();

    public cwcz(Context context) {
        this.a = cwiz.a(context, R.drawable.og_list_divider, cqez.a(context));
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.ad(childAt, this.b);
            int round = this.b.top + Math.round(childAt.getTranslationY());
            this.a.setBounds(0, round, recyclerView.getWidth(), this.a.getIntrinsicHeight() + round);
            this.a.draw(canvas);
        }
    }
}
