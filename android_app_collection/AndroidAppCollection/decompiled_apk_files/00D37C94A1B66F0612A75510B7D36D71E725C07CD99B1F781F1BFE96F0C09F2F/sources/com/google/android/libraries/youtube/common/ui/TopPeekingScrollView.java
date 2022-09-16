package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TopPeekingScrollView extends zad {
    private static final Rect n = new Rect();
    public int k;
    public View l;
    public View m;
    private float o;
    private int p;
    private int q;

    public TopPeekingScrollView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("TopPeekingScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final void f(int i) {
        g(i, i, false);
    }

    public final void g(int i, int i2, boolean z) {
        this.k = i;
        this.p = i2;
        if (z) {
            int i3 = 0;
            b(0, i2);
            if (getScrollY() != 0) {
                i3 = this.p;
            }
            a(i3);
        }
        requestLayout();
    }

    public final void h(int i) {
        g(i, i, true);
    }

    @Override // defpackage.zad, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (super.e(motionEvent)) {
            if (getScrollY() < this.p) {
                return true;
            }
            View view = this.m;
            if (view != null && !view.canScrollVertically(-1) && motionEvent.getY() >= this.o) {
                return true;
            }
        }
        this.o = motionEvent.getY();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n.set(i, i2, i3, this.k);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int i5 = i3 - i;
            childAt.layout((i5 - childAt.getMeasuredWidth()) / 2, i2 + this.k, ((i5 - childAt.getMeasuredWidth()) / 2) + childAt.getMeasuredWidth(), i4);
        }
        b(0, this.p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            i3 = Math.max(0, childAt.getMeasuredWidth());
        }
        setMeasuredDimension(i3, size + this.k);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.q = i2 - i4 > 0 ? 1 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r2 != 3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
        if (getScrollY() > 0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    @Override // defpackage.zad, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.common.ui.TopPeekingScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public TopPeekingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopPeekingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = context.obtainStyledAttributes(attributeSet, yzz.h).getBoolean(0, false);
    }
}
