package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: jgf  reason: default package */
/* loaded from: classes.dex */
public final class jgf extends ViewGroup {
    private static final dcqe a = dcqe.c("jgf");
    private final ArrayList<jge> b;
    private boolean c;
    private int d;

    public jgf(Context context) {
        super(context);
        this.b = new ArrayList<>();
        this.c = false;
        this.d = -2;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jgf.class, cqmpVarArr);
    }

    private final boolean b(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        int measuredHeightAndState;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= childCount) {
                z = true;
                break;
            }
            jge jgeVar = this.b.get(i7);
            View childAt = getChildAt(jgeVar.a);
            if (!cjxu.f(childAt)) {
                i6 = childCount;
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int c = c(layoutParams, this.c);
                int c2 = c(layoutParams, !this.c);
                int i11 = (i3 - i8) + 1;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
                int childMeasureSpec = getChildMeasureSpec(i, d() + c, this.c ? layoutParams.width : layoutParams.height);
                i6 = childCount;
                int childMeasureSpec2 = getChildMeasureSpec(makeMeasureSpec, e() + c2, this.c ? layoutParams.height : layoutParams.width);
                boolean z2 = this.c;
                int i12 = true != z2 ? childMeasureSpec2 : childMeasureSpec;
                if (true == z2) {
                    childMeasureSpec = childMeasureSpec2;
                }
                childAt.measure(i12, childMeasureSpec);
                int measuredWidth = this.c ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
                int measuredHeight = (this.c ? childAt.getMeasuredHeight() : childAt.getMeasuredWidth()) + c2;
                if (measuredHeight >= i11) {
                    z = false;
                    break;
                }
                jgeVar.c = true;
                i8 += measuredHeight;
                i9 = Math.max(i9, measuredWidth + c);
                if (this.c) {
                    measuredHeightAndState = childAt.getMeasuredWidthAndState();
                } else {
                    measuredHeightAndState = childAt.getMeasuredHeightAndState();
                }
                i10 |= measuredHeightAndState & (-16777216);
            }
            i7++;
            childCount = i6;
        }
        int suggestedMinimumWidth = this.c ? getSuggestedMinimumWidth() : getSuggestedMinimumHeight();
        int suggestedMinimumHeight = this.c ? getSuggestedMinimumHeight() : getSuggestedMinimumWidth();
        int resolveSizeAndState = resolveSizeAndState(Math.max(i9 + d(), suggestedMinimumWidth), i, i10);
        int max = Math.max(i8 + e(), suggestedMinimumHeight);
        if (true != z) {
            i5 = 16777216;
            i4 = i2;
        } else {
            i4 = i2;
            i5 = 0;
        }
        int resolveSizeAndState2 = resolveSizeAndState(max, i4, i5);
        boolean z3 = this.c;
        int i13 = true != z3 ? resolveSizeAndState2 : resolveSizeAndState;
        if (true == z3) {
            resolveSizeAndState = resolveSizeAndState2;
        }
        setMeasuredDimension(i13, resolveSizeAndState);
        return z;
    }

    private static int c(LinearLayout.LayoutParams layoutParams, boolean z) {
        int i;
        int i2;
        if (z) {
            i = layoutParams.leftMargin;
            i2 = layoutParams.rightMargin;
        } else {
            i = layoutParams.bottomMargin;
            i2 = layoutParams.topMargin;
        }
        return i + i2;
    }

    private final int d() {
        return f(this.c);
    }

    private final int e() {
        return f(!this.c);
    }

    private final int f(boolean z) {
        int paddingTop;
        int paddingBottom;
        if (z) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        return paddingTop + paddingBottom;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        int childCount = getChildCount();
        if (childCount != this.b.size()) {
            bvoo.h("Children have been modified between measure and draw", new Object[0]);
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i) != view) {
                i++;
            } else if (this.b.get(i).c) {
                return super.drawChild(canvas, view, j);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount != this.b.size()) {
            bvoo.h("Children have been modified between measure and layout", new Object[0]);
            return;
        }
        Collections.sort(this.b, jge.d);
        boolean z2 = !cjxu.d(this);
        int paddingLeft = z2 ? getPaddingLeft() : getMeasuredWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!this.b.get(i5).c) {
                childAt.layout(1073741823, 1073741823, 1073741823, 1073741823);
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (z2) {
                    childAt.layout(layoutParams.leftMargin + paddingLeft, layoutParams.topMargin + paddingTop, layoutParams.leftMargin + paddingLeft + measuredWidth, layoutParams.topMargin + paddingTop + measuredHeight);
                } else {
                    childAt.layout((paddingLeft - layoutParams.rightMargin) - measuredWidth, layoutParams.topMargin + paddingTop, paddingLeft - layoutParams.rightMargin, layoutParams.topMargin + paddingTop + measuredHeight);
                }
                if (this.c) {
                    paddingTop += childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                    if (!z2) {
                        measuredWidth2 = -measuredWidth2;
                    }
                    paddingLeft += measuredWidth2;
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        View view = null;
        if (this.b.size() >= childCount) {
            while (this.b.size() > childCount) {
                ArrayList<jge> arrayList = this.b;
                arrayList.remove(arrayList.size() - 1);
            }
        } else {
            this.b.ensureCapacity(childCount);
            while (this.b.size() < childCount) {
                this.b.add(new jge());
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            jge jgeVar = this.b.get(i3);
            jgeVar.a = i3;
            jgeVar.c = false;
            View childAt = getChildAt(i3);
            if (childAt.getId() != this.d || childAt.getParent() != this) {
                jgeVar.b = ((LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams()).weight;
            } else {
                view = getChildAt(i3);
                jgeVar.b = Float.MAX_VALUE;
            }
        }
        boolean z = this.c;
        int i4 = true != z ? i2 : i;
        if (true == z) {
            i = i2;
        }
        int max = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : Math.max(View.MeasureSpec.getSize(i) - e(), 0);
        Collections.sort(this.b, jge.e);
        if (view != null) {
            view.setVisibility(8);
        }
        if (!b(i4, i, max) && view != null) {
            for (int i5 = 0; i5 < childCount; i5++) {
                this.b.get(i5).c = false;
            }
            view.setVisibility(0);
            b(i4, i, max);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(this.b.get(i6).a);
            if (!this.b.get(i6).c && cjxu.f(childAt2)) {
                childAt2.measure(makeMeasureSpec, makeMeasureSpec);
            }
        }
    }

    public void setEllipsisViewId(int i) {
        this.d = i;
    }

    public void setOrientation(Integer num) {
        boolean z = true;
        if (num.intValue() != 1) {
            z = false;
        }
        this.c = z;
    }

    public jgf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList<>();
        this.c = false;
        this.d = -2;
    }

    public jgf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ArrayList<>();
        this.c = false;
        this.d = -2;
    }
}
