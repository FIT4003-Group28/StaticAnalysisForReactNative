package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
/* compiled from: PG */
/* renamed from: cjze  reason: default package */
/* loaded from: classes4.dex */
public final class cjze extends CardView {
    public cjze(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int h(int i, int i2, int i3) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i) - i2, 0), 1073741824);
        }
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            childAt.measure(h(i, paddingLeft, marginLayoutParams.width), h(i2, paddingTop, marginLayoutParams.height));
            int measuredWidth = childAt.getMeasuredWidth();
            int i6 = marginLayoutParams.leftMargin;
            int i7 = marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = marginLayoutParams.topMargin;
            int i9 = marginLayoutParams.bottomMargin;
            i3 = Math.max(i3, measuredWidth + i6 + i7);
            i4 = Math.max(i4, measuredHeight + i8 + i9);
        }
        setMeasuredDimension(i3 + paddingLeft, i4 + paddingTop);
    }
}
