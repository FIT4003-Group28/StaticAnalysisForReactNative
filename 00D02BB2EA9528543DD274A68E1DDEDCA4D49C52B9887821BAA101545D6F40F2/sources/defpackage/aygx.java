package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: aygx  reason: default package */
/* loaded from: classes3.dex */
public final class aygx extends abp {
    private final int a;
    private final Drawable b;
    private final ayii c;

    public aygx(Context context, ayii ayiiVar) {
        this.c = ayiiVar;
        this.a = ibn.z().e(context);
        this.b = ibk.a().a(context);
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        super.b(rect, view, recyclerView, aciVar);
        if (this.c.a(recyclerView.Z(view))) {
            rect.top = this.a;
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
            if (this.c.a(Z)) {
                this.b.setBounds(childAt.getLeft(), childAt.getTop() - this.a, childAt.getRight(), childAt.getTop());
                this.b.draw(canvas);
            }
        }
        canvas.restore();
    }
}
