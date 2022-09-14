package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: jin  reason: default package */
/* loaded from: classes7.dex */
public final class jin extends ViewGroup {
    public static final cqkv b = new jio();
    public int a;
    private final ValueAnimator c;
    private int d;
    private float e;
    private boolean f;

    public jin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.c = ofFloat;
        this.a = -1;
        jim jimVar = new jim(this);
        ofFloat.addListener(jimVar);
        ofFloat.addUpdateListener(jimVar);
        setTransitionDuration(375);
        setTransitionInterpolator(irf.a);
        setTransitionFadeRatio(0.25f);
    }

    private final void a(int i, int i2, boolean z) {
        int paddingRight;
        View childAt = getChildAt(i);
        if (childAt == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        if (!z) {
            paddingRight = getPaddingLeft() + marginLayoutParams.leftMargin;
        } else {
            paddingRight = ((i2 - getPaddingRight()) - marginLayoutParams.rightMargin) - childAt.getMeasuredWidth();
        }
        int paddingTop = getPaddingTop() + marginLayoutParams.topMargin;
        childAt.layout(paddingRight, paddingTop, childAt.getMeasuredWidth() + paddingRight, childAt.getMeasuredHeight() + paddingTop);
    }

    private final float b() {
        if (this.c.isRunning()) {
            return this.c.getAnimatedFraction();
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f = true;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f = false;
        this.c.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5 = i3 - i;
        boolean d = cjxu.d(this);
        a(this.d, i5, d);
        int i6 = this.a;
        if (i6 >= 0) {
            a(i6, i5, d);
        }
        int childCount = getChildCount();
        float b2 = b();
        for (int i7 = 0; i7 < childCount; i7++) {
            float f2 = 1.0f;
            if (i7 != this.d) {
                if (i7 == this.a) {
                    float f3 = this.e;
                    if (f3 > 0.0f) {
                        f = 1.0f - (b2 / f3);
                        f2 = Math.max(f, 0.0f);
                    }
                }
                f2 = 0.0f;
            } else if (this.a >= 0) {
                float f4 = this.e;
                if (f4 > 0.0f) {
                    f = 1.0f - ((1.0f - b2) / f4);
                    f2 = Math.max(f, 0.0f);
                }
                f2 = 0.0f;
            }
            int i8 = f2 == 0.0f ? 8 : 0;
            View childAt = getChildAt(i7);
            if (childAt.getAlpha() != f2) {
                childAt.setAlpha(f2);
            }
            if (childAt.getVisibility() != i8) {
                childAt.setVisibility(i8);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        View childAt;
        View childAt2 = getChildAt(this.d);
        int i4 = 0;
        if (childAt2 != null) {
            measureChildWithMargins(childAt2, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            i3 = childAt2.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            i4 = marginLayoutParams.bottomMargin + childAt2.getMeasuredHeight() + marginLayoutParams.topMargin;
        } else {
            i3 = 0;
        }
        int i5 = this.a;
        if (i5 >= 0 && (childAt = getChildAt(i5)) != null) {
            measureChildWithMargins(childAt, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            float b2 = b();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            i3 = (int) (measuredWidth + ((i3 - measuredWidth) * b2));
            i4 = (int) (measuredHeight + ((i4 - measuredHeight) * b2));
        }
        setMeasuredDimension(resolveSize(Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i), resolveSize(Math.max(i4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2));
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        this.c.cancel();
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        this.c.cancel();
        super.onViewRemoved(view);
    }

    public void setSelectedChildIndex(int i) {
        if (i == this.d) {
            return;
        }
        if (!this.f) {
            this.d = i;
            requestLayout();
            return;
        }
        this.c.cancel();
        this.a = this.d;
        this.d = i;
        this.c.start();
    }

    public void setTransitionDuration(int i) {
        this.c.setDuration(i);
    }

    public void setTransitionFadeRatio(float f) {
        this.e = Math.min(f, 1.0f);
    }

    public void setTransitionInterpolator(TimeInterpolator timeInterpolator) {
        this.c.setInterpolator(timeInterpolator);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
