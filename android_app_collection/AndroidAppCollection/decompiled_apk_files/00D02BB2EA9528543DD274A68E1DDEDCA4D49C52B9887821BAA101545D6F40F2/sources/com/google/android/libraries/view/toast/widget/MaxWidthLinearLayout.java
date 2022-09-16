package com.google.android.libraries.view.toast.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaxWidthLinearLayout extends LinearLayout {
    protected int a;

    public MaxWidthLinearLayout(Context context) {
        super(context);
        this.a = 0;
    }

    private final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, czub.a);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a != 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.a;
            if (measuredWidth <= i3) {
                return;
            }
            setMeasuredDimension(i3, getMeasuredHeight());
        }
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
