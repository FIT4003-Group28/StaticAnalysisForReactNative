package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {
    private View T;
    private int U;
    private final RectF V;

    public StickyHeaderRecyclerView(Context context) {
        super(context);
        this.U = 0;
        this.V = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V.contains(motionEvent.getX(), motionEvent.getY())) {
            motionEvent.offsetLocation(-this.V.left, -this.V.top);
            return this.S.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.T != null) {
            View view = this.S;
            int save = canvas.save();
            View view2 = view != null ? view : this.T;
            int top = view != null ? this.T.getTop() : 0;
            if (view2.getTop() + top < this.U || !view2.isShown()) {
                this.V.set(0.0f, (-top) + this.U, view2.getWidth(), (view2.getHeight() - top) + this.U);
                canvas.translate(0.0f, this.V.top);
                canvas.clipRect(0, 0, view2.getWidth(), view2.getHeight());
                view2.draw(canvas);
            } else {
                this.V.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.U = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.T == null && (view2 = this.S) != null) {
            this.T = view2.findViewWithTag("sticky");
        }
        if (this.T == null || (view = this.S) == null || view.getHeight() != 0) {
            return;
        }
        view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.T != null) {
            measureChild(this.S, i, i2);
        }
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = 0;
        this.V = new RectF();
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.U = 0;
        this.V = new RectF();
    }
}
