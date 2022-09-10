package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: cppp  reason: default package */
/* loaded from: classes5.dex */
public class cppp extends ViewGroup {
    public final cppo A;
    private int Ji;
    private int Jj;
    private int c;
    private int d;
    private final Rect e;
    private final Rect f;
    private final Rect g;

    public cppp(Context context) {
        super(context);
        this.Ji = 0;
        this.Jj = 0;
        this.c = 0;
        this.d = 0;
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        cpqe cpqeVar = new cpqe((int) cpqk.a(context, 10.0f));
        cpqe cpqeVar2 = new cpqe((int) cpqk.a(context, 0.0f));
        cppo cppoVar = new cppo();
        cppoVar.a = cpqeVar;
        cppoVar.b = cpqeVar2;
        cppoVar.c = cpqeVar;
        cppoVar.d = cpqeVar2;
        cppoVar.e = cpqeVar;
        cppoVar.f = cpqeVar2;
        cppoVar.g = cpqeVar;
        cppoVar.h = cpqeVar2;
        this.A = cppoVar;
    }

    private final int Sp(int i, int i2, int i3, int i4, int i5, byte b) {
        int i6;
        boolean z;
        int i7;
        int i8;
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int i9 = 0;
        int i10 = 0;
        float f = 0.0f;
        while (true) {
            i6 = -1;
            z = true;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            cppw cppwVar = (cppw) childAt.getLayoutParams();
            int i11 = true != cppwVar.a() ? makeMeasureSpec : i2;
            if (cppwVar.width == -1) {
                i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
            }
            if (cppwVar.b(b)) {
                z(childAt, i11, 0, i3, i10);
                if (childAt.getVisibility() != 8) {
                    f += cppwVar.weight;
                    i10 += Math.max(0, childAt.getMeasuredHeight() + cppwVar.topMargin + cppwVar.bottomMargin);
                }
            }
            i9++;
        }
        if (i5 > 0) {
            i8 = Math.min(i5, i10);
            i7 = i4;
        } else {
            i7 = i4;
            i8 = i10;
        }
        int max = Math.max(i7, i8);
        int i12 = max - i10;
        if (i12 != 0 && f > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                cppw cppwVar2 = (cppw) childAt2.getLayoutParams();
                float f2 = cppwVar2.weight;
                int i14 = z != cppwVar2.a() ? makeMeasureSpec : i2;
                if (cppwVar2.width == i6) {
                    i14 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i14), 1073741824);
                }
                int childMeasureSpec = getChildMeasureSpec(i14, cppwVar2.topMargin + cppwVar2.bottomMargin, cppwVar2.width);
                if (cppwVar2.b(b) && f2 != 0.0f && childAt2.getVisibility() != 8) {
                    childAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(0, childAt2.getMeasuredHeight() + ((int) ((f2 * i12) / f))), 1073741824));
                    i13++;
                    i6 = -1;
                    z = true;
                }
                i13++;
                i6 = -1;
                z = true;
            }
        }
        return Math.min(max, View.MeasureSpec.getSize(i3));
    }

    private final int Sq(int i, int i2, int i3, int i4, int i5, byte b) {
        int i6;
        boolean z;
        int i7;
        int i8;
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int i9 = 0;
        int i10 = 0;
        float f = 0.0f;
        while (true) {
            i6 = -1;
            z = true;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            cppw cppwVar = (cppw) childAt.getLayoutParams();
            int i11 = true != cppwVar.a() ? makeMeasureSpec : i3;
            if (cppwVar.height == -1) {
                i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
            }
            if (cppwVar.b(b)) {
                z(childAt, i2, i10, i11, 0);
                if (childAt.getVisibility() != 8) {
                    f += cppwVar.weight;
                    i10 += Math.max(0, childAt.getMeasuredWidth() + cppwVar.leftMargin + cppwVar.rightMargin);
                }
            }
            i9++;
        }
        if (i5 > 0) {
            i8 = Math.min(i5, i10);
            i7 = i4;
        } else {
            i7 = i4;
            i8 = i10;
        }
        int max = Math.max(i7, i8);
        int i12 = max - i10;
        if (i12 != 0 && f > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                cppw cppwVar2 = (cppw) childAt2.getLayoutParams();
                float f2 = cppwVar2.weight;
                int i14 = z != cppwVar2.a() ? makeMeasureSpec : i3;
                if (cppwVar2.height == i6) {
                    i14 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i14), 1073741824);
                }
                int childMeasureSpec = getChildMeasureSpec(i14, cppwVar2.leftMargin + cppwVar2.rightMargin, cppwVar2.height);
                if (cppwVar2.b(b) && f2 != 0.0f && childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, childAt2.getMeasuredWidth() + ((int) ((f2 * i12) / f))), 1073741824), childMeasureSpec);
                    i13++;
                    i6 = -1;
                    z = true;
                }
                i13++;
                i6 = -1;
                z = true;
            }
        }
        return Math.min(max, View.MeasureSpec.getSize(i2));
    }

    private final View Sr(int i, int i2) {
        return getChildAt(getChildDrawingOrder(i, i2));
    }

    private final void a(int i, int i2, int i3, int i4, boolean z) {
        this.Ji = Sp(Math.max((i3 - this.d) - this.Jj, 0), i, i2, this.A.a.a(i4), this.A.b.a(i4), (byte) 8);
        int Sp = Sp(Math.max((i3 - this.d) - this.Jj, 0), i, i2, this.A.e.a(i4), this.A.f.a(i4), (byte) 16);
        this.c = Sp;
        this.Jj = Sq(Math.max((i4 - this.Ji) - Sp, 0), i, i2, this.A.c.a(i3), this.A.d.a(i3), (byte) 4);
        this.d = Sq(Math.max((i4 - this.Ji) - this.c, 0), i, i2, this.A.g.a(i3), this.A.h.a(i3), (byte) 1);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (((cppw) childAt.getLayoutParams()).b((byte) 2)) {
                    z(childAt, i, this.d + this.Jj, i2, this.Ji + this.c);
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (((cppw) childAt2.getLayoutParams()).b((byte) -1)) {
                    z(childAt2, i, 0, i2, 0);
                }
            }
        }
    }

    private final void e(View view, Rect rect, Rect rect2) {
        cppw cppwVar = (cppw) view.getLayoutParams();
        int width = cppwVar.width == -1 ? rect.width() : view.getMeasuredWidth() + cppwVar.leftMargin + cppwVar.rightMargin;
        int height = cppwVar.height == -1 ? rect.height() : view.getMeasuredHeight() + cppwVar.topMargin + cppwVar.bottomMargin;
        Rect rect3 = this.f;
        if (cppwVar.gravity != -1) {
            Gravity.apply(cppwVar.gravity, width, height, rect, rect3);
        } else {
            rect3.set(rect.left, rect.top, Math.min(rect.right, rect.left + width), Math.min(rect.bottom, rect.top + height));
        }
        if (rect2 == null) {
            view.layout(rect3.left + cppwVar.leftMargin, rect3.top + cppwVar.topMargin, rect3.right - cppwVar.rightMargin, rect3.bottom - cppwVar.bottomMargin);
            return;
        }
        view.setPadding((rect3.left - rect2.left) + cppwVar.leftMargin, (rect3.top - rect2.top) + cppwVar.topMargin, (rect2.right - rect3.right) + cppwVar.rightMargin, (rect2.bottom - rect3.bottom) + cppwVar.bottomMargin);
        if (view instanceof RelativeLayout) {
            view.measure(View.MeasureSpec.makeMeasureSpec(rect2.right - rect2.left, 1073741824), View.MeasureSpec.makeMeasureSpec(rect2.bottom - rect2.top, 1073741824));
        }
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    public static cppx w(cppx cppxVar) {
        cpwl.h(cppxVar, "Margins can not be null");
        return cppxVar;
    }

    protected static final void z(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), getChildMeasureSpec(i3, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cppw;
    }

    protected void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new cppw(-1, (byte) 2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new cppw(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        x(paddingLeft + this.d, paddingTop, paddingRight - this.Jj, paddingTop + this.Ji, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft, paddingTop, paddingRight, paddingBottom - this.c, (byte) 8, false);
        x(paddingLeft + this.d, paddingBottom - this.c, paddingRight - this.Jj, paddingBottom, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft, paddingTop + this.Ji, paddingRight, paddingBottom, (byte) 16, true);
        int i9 = paddingBottom;
        y(paddingLeft, paddingTop + this.Ji, paddingLeft + this.d, paddingBottom - this.c, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft, paddingTop, paddingRight - this.Jj, paddingBottom, (byte) 1, false);
        int i10 = paddingLeft;
        int i11 = paddingTop;
        int i12 = paddingRight;
        y(paddingRight - this.Jj, paddingTop + this.Ji, paddingRight, paddingBottom - this.c, paddingLeft, paddingTop, paddingRight, paddingBottom, paddingLeft + this.d, paddingTop, paddingRight, paddingBottom, (byte) 4, true);
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            Rect rect2 = null;
            if (i13 >= childCount) {
                break;
            }
            View Sr = Sr(childCount, i13);
            cppw cppwVar = (cppw) Sr.getLayoutParams();
            if (!cppwVar.b((byte) 2)) {
                i8 = i9;
                i5 = i10;
                i6 = i11;
                i7 = i12;
            } else {
                Rect rect3 = this.e;
                i5 = i10;
                i6 = i11;
                i7 = i12;
                i8 = i9;
                rect3.set(i5 + this.d, i6 + this.Ji, i7 - this.Jj, i8 - this.c);
                if (cppwVar.c || cppwVar.d) {
                    rect2 = this.g;
                    rect2.set(i5, i6, i7, i8);
                }
                e(Sr, rect3, rect2);
            }
            i13++;
            i10 = i5;
            i11 = i6;
            i12 = i7;
            i9 = i8;
        }
        int i14 = i9;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        for (int i18 = 0; i18 < childCount; i18++) {
            View Sr2 = Sr(childCount, i18);
            cppw cppwVar2 = (cppw) Sr2.getLayoutParams();
            if (cppwVar2.b((byte) -1)) {
                Rect rect4 = this.e;
                rect4.set(i15, i16, i17, i14);
                if (cppwVar2.c || cppwVar2.d) {
                    rect = this.g;
                    rect.set(i15, i16, i17, i14);
                } else {
                    rect = null;
                }
                e(Sr2, rect4, rect);
            }
        }
        f();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(0, (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, Integer.MIN_VALUE);
        a(makeMeasureSpec, makeMeasureSpec2, max, max2, false);
        a(makeMeasureSpec, makeMeasureSpec2, max, max2, true);
    }

    protected final void x(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, byte b, boolean z) {
        int i13;
        int i14;
        int max;
        Rect rect;
        int i15 = i2;
        int i16 = i4;
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        while (i17 < childCount) {
            View Sr = Sr(childCount, i17);
            cppw cppwVar = (cppw) Sr.getLayoutParams();
            if (cppwVar.b(b)) {
                int measuredHeight = Sr.getMeasuredHeight();
                int i19 = cppwVar.topMargin;
                int i20 = cppwVar.bottomMargin;
                int visibility = Sr.getVisibility();
                if (visibility == 8) {
                    i20 = 0;
                }
                if (visibility == 8) {
                    i19 = 0;
                }
                if (visibility == 8) {
                    measuredHeight = 0;
                }
                boolean a = cppwVar.a();
                int i21 = true != a ? i3 : i7;
                int i22 = true != a ? i : i5;
                if (z) {
                    max = i15 + i18;
                    i14 = Math.min(i16, max + measuredHeight + i19 + i20);
                } else {
                    i14 = i16 - i18;
                    max = Math.max(i15, ((i14 - measuredHeight) - i19) - i20);
                }
                Rect rect2 = this.e;
                rect2.set(i22, max, i21, i14);
                if (cppwVar.c) {
                    rect = this.g;
                    rect.set(i5, i6, i7, i8);
                    i13 = childCount;
                } else if (cppwVar.d) {
                    rect = this.g;
                    i13 = childCount;
                    rect.set(i9, i10, i11, i12);
                } else {
                    i13 = childCount;
                    rect = null;
                }
                e(Sr, rect2, rect);
                i18 += measuredHeight + i19 + i20;
            } else {
                i13 = childCount;
            }
            i17++;
            i15 = i2;
            i16 = i4;
            childCount = i13;
        }
    }

    protected final void y(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, byte b, boolean z) {
        int i13;
        int i14;
        int max;
        Rect rect;
        int i15 = i;
        int i16 = i3;
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        while (i17 < childCount) {
            View Sr = Sr(childCount, i17);
            cppw cppwVar = (cppw) Sr.getLayoutParams();
            if (cppwVar.b(b)) {
                int measuredWidth = Sr.getMeasuredWidth();
                int i19 = cppwVar.leftMargin;
                int i20 = cppwVar.rightMargin;
                int visibility = Sr.getVisibility();
                if (visibility == 8) {
                    i20 = 0;
                }
                if (visibility == 8) {
                    i19 = 0;
                }
                if (visibility == 8) {
                    measuredWidth = 0;
                }
                boolean a = cppwVar.a();
                int i21 = true != a ? i4 : i8;
                int i22 = true != a ? i2 : i6;
                if (z) {
                    max = i15 + i18;
                    i14 = Math.min(i16, max + measuredWidth + i19 + i20);
                } else {
                    i14 = i16 - i18;
                    max = Math.max(i15, ((i14 - measuredWidth) - i19) - i20);
                }
                Rect rect2 = this.e;
                rect2.set(max, i22, i14, i21);
                if (cppwVar.c) {
                    rect = this.g;
                    rect.set(i5, i6, i7, i8);
                    i13 = childCount;
                } else if (cppwVar.d) {
                    rect = this.g;
                    i13 = childCount;
                    rect.set(i9, i10, i11, i12);
                } else {
                    i13 = childCount;
                    rect = null;
                }
                e(Sr, rect2, rect);
                i18 += measuredWidth + i19 + i20;
            } else {
                i13 = childCount;
            }
            i17++;
            i15 = i;
            i16 = i3;
            childCount = i13;
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new cppw(layoutParams);
    }

    public cppp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Ji = 0;
        this.Jj = 0;
        this.c = 0;
        this.d = 0;
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.b, i, 0);
        float a = cpqk.a(context, 10.0f);
        float a2 = cpqk.a(context, 0.0f);
        cppo cppoVar = new cppo();
        cppoVar.a = cppo.a(obtainStyledAttributes, 8, a);
        cppoVar.b = cppo.a(obtainStyledAttributes, 7, a2);
        cppoVar.c = cppo.a(obtainStyledAttributes, 6, a);
        cppoVar.d = cppo.a(obtainStyledAttributes, 5, a2);
        cppoVar.e = cppo.a(obtainStyledAttributes, 2, a);
        cppoVar.f = cppo.a(obtainStyledAttributes, 1, a2);
        cppoVar.g = cppo.a(obtainStyledAttributes, 4, a);
        cppoVar.h = cppo.a(obtainStyledAttributes, 3, a2);
        this.A = cppoVar;
        if (obtainStyledAttributes.getBoolean(11, false)) {
            addView(new cpsc(context), new cppw(-1, (byte) -1));
            addView(new cpsc(context), new cppw(-1, (byte) 2));
        }
        obtainStyledAttributes.recycle();
    }
}
