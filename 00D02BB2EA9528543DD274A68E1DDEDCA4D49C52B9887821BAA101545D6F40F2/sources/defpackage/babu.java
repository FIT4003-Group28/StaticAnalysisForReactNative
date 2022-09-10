package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: babu  reason: default package */
/* loaded from: classes3.dex */
final class babu extends abp {
    private final boolean a;
    private final Drawable b;
    private final int c;

    public babu(Context context, boolean z, cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2) {
        this.a = z;
        int e = cqtvVar2.e(context);
        this.b = new InsetDrawable(cqtdVar.a(context), e, 0, e, 0);
        this.c = cqtvVar.e(context);
    }

    private final boolean a(RecyclerView recyclerView, View view) {
        return !this.a || recyclerView.Z(view) > 0;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        super.b(rect, view, recyclerView, aciVar);
        if (a(recyclerView, view)) {
            rect.top = this.c;
        }
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (a(recyclerView, childAt)) {
                this.b.setBounds(childAt.getLeft(), childAt.getTop() - this.c, childAt.getRight(), childAt.getTop());
                this.b.draw(canvas);
            }
        }
        canvas.restore();
    }
}
