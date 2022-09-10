package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: jgj  reason: default package */
/* loaded from: classes7.dex */
public final class jgj extends LinearLayout {
    private static final dcqe e = dcqe.c("jgj");
    final List<View> a;
    final List<View> b;
    int c;
    int d;

    public jgj(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jgj.class, cqmpVarArr);
    }

    private static int b(int i, int i2, int i3) {
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            return Math.min(Math.max(i2, i3), View.MeasureSpec.getSize(i));
        }
        return View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : Math.max(i2, i3);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        this.c = getPaddingLeft();
        this.d = getWidth() - getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != null && childAt.getVisibility() != 8) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int i8 = layoutParams.gravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                int i9 = layoutParams.gravity & 8388615;
                int measuredHeight = childAt.getMeasuredHeight();
                if (i8 == 48) {
                    i6 = getPaddingTop();
                } else {
                    if (i8 == 16) {
                        paddingTop = getPaddingTop();
                        i5 = (height - measuredHeight) / 2;
                    } else {
                        paddingTop = getPaddingTop();
                        i5 = height - measuredHeight;
                    }
                    i6 = paddingTop + i5;
                }
                int i10 = layoutParams.leftMargin + layoutParams.rightMargin;
                int measuredWidth = childAt.getMeasuredWidth() + i10;
                int i11 = this.d - this.c;
                if (measuredWidth > i11) {
                    if (i11 > 0) {
                        measuredWidth = i11;
                    }
                }
                int max = Math.max(0, measuredWidth - i10);
                if (!((i9 == 8388613) ^ cjxu.d(this))) {
                    int i12 = this.c + layoutParams.leftMargin;
                    childAt.layout(i12, i6, max + i12, measuredHeight + i6);
                    this.c += measuredWidth;
                } else {
                    int i13 = this.d - layoutParams.rightMargin;
                    childAt.layout(i13 - max, i6, i13, measuredHeight + i6);
                    this.d -= measuredWidth;
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.b.clear();
        this.a.clear();
        int childCount = getChildCount();
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof TextView ? ((TextView) childAt).getEllipsize() : null) != null) {
                if (z2) {
                    bvoo.h("Unsupported ellipsizing configuration inside InfixEllipsizingLinearLayout. Your children will not be ellipsized correctly. Please read class docs and fix.", new Object[0]);
                }
                this.a.add(childAt);
                z = true;
            } else if (z) {
                this.b.add(childAt);
                z2 = true;
            } else {
                this.b.add(childAt);
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < this.b.size(); i7++) {
            View view = this.b.get(i7);
            if (view != null && view.getVisibility() != 8) {
                measureChild(view, i, i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                i5 += view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                i4 = combineMeasuredStates(i4, view.getMeasuredState());
                i6 = Math.max(i6, view.getMeasuredHeight());
            }
        }
        int i8 = i4;
        int i9 = i5;
        int i10 = i6;
        for (int i11 = 0; i11 < this.a.size(); i11++) {
            View view2 = this.a.get(i11);
            if (view2 != null && view2.getVisibility() != 8) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                int i12 = layoutParams2.leftMargin;
                int i13 = layoutParams2.rightMargin;
                measureChildWithMargins(view2, i, i9, i2, 0);
                i9 += view2.getMeasuredWidth() + i12 + i13;
                i8 = combineMeasuredStates(i8, view2.getMeasuredState());
                i10 = Math.max(i10, view2.getMeasuredHeight());
            }
        }
        int paddingTop = getPaddingTop();
        setMeasuredDimension(resolveSizeAndState(b(i, getSuggestedMinimumWidth(), i9), i, i8), resolveSizeAndState(b(i2, getSuggestedMinimumHeight(), i10 + paddingTop + getPaddingBottom()), i2, i8 << 16));
    }

    public jgj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jgj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
}
