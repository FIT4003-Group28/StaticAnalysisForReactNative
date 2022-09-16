package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bjn  reason: default package */
/* loaded from: classes2.dex */
final class bjn extends nd {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ bjr d;

    public bjn(bjr bjrVar) {
        this.d = bjrVar;
    }

    private final boolean g(View view, RecyclerView recyclerView) {
        yo k = recyclerView.k(view);
        if (!(k instanceof bke) || !((bke) k).w) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        yo k2 = recyclerView.k(recyclerView.getChildAt(indexOfChild + 1));
        return (k2 instanceof bke) && ((bke) k2).v;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        if (g(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.nd
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (g(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
