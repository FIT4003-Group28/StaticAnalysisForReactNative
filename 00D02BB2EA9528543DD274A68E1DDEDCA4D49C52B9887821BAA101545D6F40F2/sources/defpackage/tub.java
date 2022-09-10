package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: tub  reason: default package */
/* loaded from: classes7.dex */
final class tub extends abp {
    private final Rect a = new Rect();
    private final Drawable b;
    private final int c;
    private final boolean d;

    public tub(Drawable drawable, int i, boolean z) {
        this.b = drawable;
        this.c = i;
        this.d = z;
    }

    private static boolean a(int i, cqrj cqrjVar, boolean z) {
        if (i != -1) {
            return i < cqrjVar.c() - (true != z ? 1 : 2);
        }
        return false;
    }

    @dzsi
    private static cqrj d(RecyclerView recyclerView) {
        abg abgVar = recyclerView.k;
        if (abgVar != null && (abgVar instanceof cqrj)) {
            return (cqrj) abgVar;
        }
        return null;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        rect.set(0, 0, 0, 0);
        cqrj d = d(recyclerView);
        if (d == null || d.c() == 0 || !a(recyclerView.Z(view), d, this.d)) {
            return;
        }
        rect.bottom = this.c;
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        cqrj d = d(recyclerView);
        if (d == null) {
            return;
        }
        canvas.save();
        if (recyclerView.g) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (a(recyclerView.Z(childAt), d, this.d)) {
                RecyclerView.ad(childAt, this.a);
                int intrinsicHeight = this.b.getIntrinsicHeight();
                int i3 = this.c;
                int intrinsicHeight2 = (this.a.bottom - (intrinsicHeight > i3 ? 0 : i3 - this.b.getIntrinsicHeight())) + Math.round(childAt.getTranslationY());
                this.b.setBounds(i, intrinsicHeight2 - this.c, width, intrinsicHeight2);
                this.b.setAlpha((int) (childAt.getAlpha() * 255.0f));
                this.b.draw(canvas);
            }
        }
        canvas.restore();
    }
}
