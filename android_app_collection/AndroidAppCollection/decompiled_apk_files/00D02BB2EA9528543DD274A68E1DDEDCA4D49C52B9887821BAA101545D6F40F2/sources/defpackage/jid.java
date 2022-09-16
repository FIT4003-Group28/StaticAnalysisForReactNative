package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: jid  reason: default package */
/* loaded from: classes7.dex */
public final class jid extends abp {
    private static final dcqe a = dcqe.c("jid");
    private final Rect b = new Rect();
    private final Drawable c;
    private final bxvt d;

    public jid(bxvt bxvtVar, Drawable drawable) {
        this.d = bxvtVar;
        this.c = drawable;
    }

    @dzsi
    private static cqrj a(RecyclerView recyclerView) {
        abg abgVar = recyclerView.k;
        if (abgVar == null) {
            return null;
        }
        if (!(abgVar instanceof cqrj)) {
            bvoo.h("The RecyclerView adapter is not a Curvular adapter.", new Object[0]);
            return null;
        }
        return (cqrj) abgVar;
    }

    private static final boolean d(int i, cqrj cqrjVar) {
        if (i == -1 || i >= cqrjVar.c()) {
            return false;
        }
        return bxvu.a(i, cqrjVar) && bxvu.a(i + 1, cqrjVar);
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        rect.set(0, 0, 0, 0);
        cqrj a2 = a(recyclerView);
        if (a2 == null || a2.c() == 0 || !d(recyclerView.Z(view), a2)) {
            return;
        }
        rect.bottom = this.c.getIntrinsicHeight();
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        cqrj a2 = a(recyclerView);
        if (a2 == null) {
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
            if (d(recyclerView.Z(childAt), a2)) {
                RecyclerView.ad(childAt, this.b);
                int round = this.b.bottom + Math.round(childAt.getTranslationY());
                this.c.setBounds(i, round - this.c.getIntrinsicHeight(), width, round);
                this.c.setAlpha((int) (childAt.getAlpha() * 255.0f));
                this.c.draw(canvas);
            }
        }
        canvas.restore();
    }
}
