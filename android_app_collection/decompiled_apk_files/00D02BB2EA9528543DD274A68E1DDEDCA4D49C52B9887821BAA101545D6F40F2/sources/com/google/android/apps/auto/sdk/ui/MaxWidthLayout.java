package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaxWidthLayout extends FrameLayout {
    private int a;

    public MaxWidthLayout(Context context) {
        super(context);
        a(context.obtainStyledAttributes(cox.b));
    }

    private final void a(TypedArray typedArray) {
        int[] iArr = cox.a;
        this.a = typedArray.getDimensionPixelSize(0, 0);
        typedArray.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == 0) {
            return;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i3 = this.a;
                    if (measuredWidth > i3) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((i3 - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
            }
        }
    }

    public void setMaxChildrenWidth(int i) {
        this.a = i;
    }

    public MaxWidthLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context.obtainStyledAttributes(attributeSet, cox.b));
    }

    public MaxWidthLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context.obtainStyledAttributes(attributeSet, cox.b, i, 0));
    }
}
