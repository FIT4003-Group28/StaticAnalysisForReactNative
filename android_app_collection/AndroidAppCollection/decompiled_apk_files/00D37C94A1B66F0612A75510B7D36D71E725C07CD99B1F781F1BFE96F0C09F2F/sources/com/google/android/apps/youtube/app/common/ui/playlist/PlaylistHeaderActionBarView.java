package com.google.android.apps.youtube.app.common.ui.playlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaylistHeaderActionBarView extends ViewGroup {
    private static final geb b = new geb(0, 0);
    int a;
    private boolean c;
    private View d;
    private int e;

    public PlaylistHeaderActionBarView(Context context) {
        super(context);
        a(context, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        this.e = zew.i(getResources().getDisplayMetrics(), 8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gek.a);
        this.a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    private final geb b(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return b;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        gec gecVar = (gec) view.getLayoutParams();
        int i3 = 0;
        int measuredWidth = view.getMeasuredWidth() + (gecVar != null ? gecVar.leftMargin + gecVar.rightMargin : 0);
        int measuredHeight = view.getMeasuredHeight();
        if (gecVar != null) {
            i3 = gecVar.topMargin + gecVar.bottomMargin;
        }
        return new geb(measuredWidth, measuredHeight + i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gec;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gec();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gec(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingRight = (i3 - i) - getPaddingRight();
        int e = lj.e(this);
        View view = this.d;
        if (view != null && view.getVisibility() != 8 && this.c) {
            gec gecVar = (gec) this.d.getLayoutParams();
            int i9 = paddingBottom - gecVar.bottomMargin;
            int measuredHeight = i9 - this.d.getMeasuredHeight();
            int i10 = (measuredHeight - gecVar.topMargin) - this.e;
            if (e == 1) {
                measuredWidth = paddingRight - gecVar.rightMargin;
                i8 = measuredWidth - this.d.getMeasuredWidth();
            } else {
                i8 = paddingLeft + gecVar.leftMargin;
                measuredWidth = this.d.getMeasuredWidth() + i8;
            }
            this.d.layout(i8, measuredHeight, measuredWidth, i9);
            paddingBottom = i10;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && (childAt != this.d || !this.c)) {
                gec gecVar2 = (gec) childAt.getLayoutParams();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i12 = (((((paddingBottom - paddingTop) - measuredHeight2) / 2) + paddingTop) + gecVar2.topMargin) - gecVar2.bottomMargin;
                int i13 = measuredHeight2 + i12;
                if (e == 1) {
                    i6 = paddingRight - gecVar2.rightMargin;
                    i5 = i6 - childAt.getMeasuredWidth();
                    i7 = i5 - gecVar2.leftMargin;
                } else {
                    i5 = gecVar2.leftMargin + paddingLeft;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i5;
                    int i14 = paddingRight;
                    i6 = measuredWidth2;
                    paddingLeft = gecVar2.rightMargin + measuredWidth2;
                    i7 = i14;
                }
                childAt.layout(i5, i12, i6, i13);
                paddingRight = i7;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int max;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int size = (View.MeasureSpec.getSize(i) - paddingLeft) - paddingRight;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        geb b2 = b(this.d, makeMeasureSpec, makeMeasureSpec2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.d) {
                geb b3 = b(childAt, makeMeasureSpec, makeMeasureSpec2);
                i4 += b3.a;
                i3 = Math.max(i3, b3.b);
            }
        }
        View view = this.d;
        if (view == null || view.getVisibility() == 8 || size >= b2.a + i4) {
            max = Math.max(i3, b2.b);
            this.c = false;
        } else {
            max = i3 + this.e + b2.b;
            this.c = true;
        }
        setMeasuredDimension(Math.min(size, i4 + b2.a) + paddingLeft + paddingRight, max + paddingTop + paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null && view.getId() == this.a) {
            this.d = view;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view != null && view.getId() == this.a) {
            this.d = null;
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new gec(layoutParams);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }
}
