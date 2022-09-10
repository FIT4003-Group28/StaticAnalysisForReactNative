package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: acnm  reason: default package */
/* loaded from: classes2.dex */
public final class acnm extends ViewGroup {
    private final acnk a;

    public acnm(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(acnm.class, cqmpVarArr);
    }

    private static int b(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.a(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), getWidth(), getWidth(), od.s(this), true);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                this.a.b(childAt);
            }
        }
        this.a.c();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.a.a(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), mode == 1073741824 ? size : 0, mode == 0 ? Integer.MAX_VALUE : size, od.s(this), false);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                dbsk.b(marginLayoutParams.height != -1, "A child view in HorizontalFlowLayout has a layoutParam.height: MATCH_PARENT which is not supported");
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), marginLayoutParams.width), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), marginLayoutParams.height));
                this.a.b(childAt);
            }
        }
        this.a.c();
        int b = b(size, mode, this.a.a.width());
        acnk acnkVar = this.a;
        setMeasuredDimension(b, b(size2, mode2, acnkVar.a.height() + acnkVar.b));
    }

    public acnm(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new acnk();
    }
}
