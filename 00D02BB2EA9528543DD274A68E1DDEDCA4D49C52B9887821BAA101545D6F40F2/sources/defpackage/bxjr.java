package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bxjr  reason: default package */
/* loaded from: classes4.dex */
public final class bxjr extends abp {
    private final bxjq a;
    private final int b;
    private final Drawable c;
    private final int d;
    private final int e;
    private final Drawable f;

    public bxjr(Context context, bxjq bxjqVar) {
        this.a = bxjqVar;
        this.b = ibn.z().e(context);
        this.c = ibk.a().a(context);
        this.d = ibn.B().e(context);
        this.e = ibn.t().e(context);
        this.f = new ColorDrawable(ibl.az().b(context));
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        super.b(rect, view, recyclerView, aciVar);
        int Z = recyclerView.Z(view);
        if (this.a.a(Z)) {
            rect.top = this.b;
        } else if (!this.a.b(Z)) {
        } else {
            rect.top = this.d;
        }
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int Z = recyclerView.Z(childAt);
            if (Z == -1) {
                break;
            }
            int top = childAt.getTop() + ((int) childAt.getTranslationY());
            if (this.a.a(Z)) {
                this.c.setBounds(childAt.getLeft(), top - this.b, childAt.getRight(), top);
                this.c.draw(canvas);
            } else if (this.a.b(Z)) {
                if (od.s(childAt) == 1) {
                    this.f.setBounds(childAt.getLeft(), top - this.d, childAt.getRight() - this.e, top);
                } else {
                    this.f.setBounds(childAt.getLeft() + this.e, top - this.d, childAt.getRight(), top);
                }
                this.f.draw(canvas);
            }
        }
        canvas.restore();
    }
}
