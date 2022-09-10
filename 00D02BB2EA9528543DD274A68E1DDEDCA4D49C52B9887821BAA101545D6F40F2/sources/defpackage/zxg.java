package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: zxg  reason: default package */
/* loaded from: classes7.dex */
public final class zxg extends LinearLayout {
    private static final dcqe a = dcqe.c("zxg");

    public zxg(Context context) {
        super(context);
    }

    private static void a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int paddingStart = getPaddingStart();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (cjxu.f(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int paddingTop2 = getPaddingTop() + ((paddingTop - measuredHeight) / 2);
                int i7 = cjxu.d(this) ? (i5 - paddingStart) - measuredWidth : paddingStart;
                childAt.layout(i7, paddingTop2, i7 + measuredWidth, measuredHeight + paddingTop2);
                paddingStart += measuredWidth;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        View childAt;
        View view;
        if (getChildCount() > 3 || getChildCount() < 2) {
            bvoo.h("This view only supports 2 or 3 children.", new Object[0]);
            super.onMeasure(i, i2);
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        measureChildren(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        View childAt2 = getChildAt(0);
        if (getChildCount() > 2) {
            view = getChildAt(1);
            childAt = getChildAt(2);
        } else {
            childAt = getChildAt(1);
            view = null;
        }
        int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : (View.MeasureSpec.getSize(i) - paddingLeft) - ((view == null || !cjxu.f(view)) ? 0 : view.getMeasuredWidth());
        int i3 = size / 2;
        if (childAt2.getMeasuredWidth() > i3) {
            a(childAt, i3, i2);
            a(childAt2, size - childAt.getMeasuredWidth(), i2);
        } else {
            a(childAt, size - childAt2.getMeasuredWidth(), i2);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt3 = getChildAt(i5);
            if (cjxu.f(childAt3)) {
                paddingLeft += childAt3.getMeasuredWidth();
                i4 = Math.max(i4, childAt3.getMeasuredHeight());
            }
        }
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0), resolveSizeAndState(Math.max(i4 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }
}
