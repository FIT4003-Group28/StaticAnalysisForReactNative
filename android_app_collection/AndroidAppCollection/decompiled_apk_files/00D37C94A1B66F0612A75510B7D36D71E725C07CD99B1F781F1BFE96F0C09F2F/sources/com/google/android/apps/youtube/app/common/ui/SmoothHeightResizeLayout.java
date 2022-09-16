package com.google.android.apps.youtube.app.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SmoothHeightResizeLayout extends ViewGroup {
    public boolean a;
    public float b;
    public int c;

    public SmoothHeightResizeLayout(Context context) {
        super(context);
        b();
    }

    private final void b() {
        this.b = 1.0f;
        this.a = false;
    }

    public final void a(float f) {
        boolean z = true;
        aqxo.y(f >= 0.0f);
        if (f > 1.0f) {
            z = false;
        }
        aqxo.y(z);
        aqxo.y(this.a);
        this.b = f;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            int measuredHeight = childAt.getMeasuredHeight();
            if (this.a && measuredHeight < (i5 = this.c)) {
                measuredHeight = i5;
            }
            getChildAt(i6).layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, measuredHeight + paddingTop);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        measureChildren(i, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            i3 = Math.max(i3, getChildAt(i4).getMeasuredHeight());
        }
        int i5 = i3 + paddingTop + paddingBottom;
        if (this.a) {
            int i6 = this.c;
            setMeasuredDimension(size, i6 + ((int) ((i5 - i6) * this.b)));
            return;
        }
        setMeasuredDimension(size, i5);
        this.c = i5;
    }

    public SmoothHeightResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public SmoothHeightResizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public SmoothHeightResizeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
