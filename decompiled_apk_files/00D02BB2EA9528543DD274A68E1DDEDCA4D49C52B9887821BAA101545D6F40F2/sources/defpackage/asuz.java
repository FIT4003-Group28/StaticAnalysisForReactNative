package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: asuz  reason: default package */
/* loaded from: classes2.dex */
public final class asuz extends ViewGroup {
    public asuz(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                childAt.layout(paddingLeft, paddingTop, paddingRight, childAt.getMeasuredHeight() + paddingTop);
                paddingTop += childAt.getMeasuredHeight();
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float f;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int measuredHeight = childAt.getMeasuredHeight();
                i3 += measuredHeight;
                if (childAt.getLayoutParams() instanceof asuy) {
                    i4 += measuredHeight;
                }
            }
        }
        if (i3 >= size2) {
            int i6 = size2 - (i3 - i4);
            f = i6 > 0 ? i6 / i4 : 0.0f;
        } else {
            f = 1.0f;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                if (childAt2.getLayoutParams() instanceof asuy) {
                    measuredHeight2 = Math.max((int) (childAt2.getMeasuredHeight() * f), ((asuy) childAt2.getLayoutParams()).a);
                }
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                i7 += childAt2.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, i7);
    }

    public asuz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public asuz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
