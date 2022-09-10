package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: zd  reason: default package */
/* loaded from: classes7.dex */
public class zd extends abp {
    private static final int[] b = {16843284};
    public Drawable a;
    private int c;
    private final Rect d = new Rect();

    public zd(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b);
        this.a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    @Override // defpackage.abp
    public void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        Drawable drawable = this.a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.l == null || this.a == null) {
            return;
        }
        int i3 = 0;
        if (this.c != 1) {
            canvas.save();
            if (recyclerView.g) {
                i = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.ad(childAt, this.d);
                int round = this.d.right + Math.round(childAt.getTranslationX());
                this.a.setBounds(round - this.a.getIntrinsicWidth(), i, round, height);
                this.a.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.g) {
            i2 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i3);
            RecyclerView.ad(childAt2, this.d);
            int round2 = this.d.bottom + Math.round(childAt2.getTranslationY());
            this.a.setBounds(i2, round2 - this.a.getIntrinsicHeight(), width, round2);
            this.a.draw(canvas);
            i3++;
        }
        canvas.restore();
    }
}
