package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: jgq  reason: default package */
/* loaded from: classes7.dex */
public class jgq extends ViewGroup {
    public int a;
    public dcdc<View> b;
    private int c;

    public jgq(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(jgq.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(cqtv cqtvVar) {
        return cqjv.j(iug.ITEM_MARGINS_MINIMUM, cqtvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i) {
        cjxu.o(d(), false);
        boolean z = true;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (!e(childAt)) {
                if (!z) {
                    i2 += f();
                }
                i2 += childAt.getMeasuredWidth();
                z = false;
            }
        }
        return i2;
    }

    @dzsi
    public final View d() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (e(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean e(View view) {
        return view.getId() == this.c && view.getParent() == this;
    }

    public int f() {
        return this.a;
    }

    protected void g() {
        h();
    }

    public final void h() {
        for (int i = 0; i < getChildCount(); i++) {
            cjxu.o(getChildAt(i), true);
        }
    }

    protected int i(int i, int i2, int i3, int i4) {
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.d()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            defpackage.cjxu.o(r0, r1)
            int r3 = r0.getMeasuredWidth()
            goto L11
        L10:
            r3 = 0
        L11:
            r4 = 0
        L12:
            int r5 = r7.getChildCount()
            if (r4 >= r5) goto L58
            android.view.View r5 = r7.getChildAt(r4)
            boolean r6 = r7.e(r5)
            if (r6 == 0) goto L23
            goto L55
        L23:
            int r5 = r5.getMeasuredWidth()
            if (r1 == 0) goto L30
            if (r0 == 0) goto L35
            int r1 = r7.f()
            goto L34
        L30:
            int r1 = r7.f()
        L34:
            int r5 = r5 + r1
        L35:
            int r5 = r5 + r3
            if (r5 <= r8) goto L53
        L38:
            int r8 = r7.getChildCount()
            if (r4 >= r8) goto L52
            android.view.View r8 = r7.getChildAt(r4)
            boolean r8 = r7.e(r8)
            if (r8 != 0) goto L4f
            android.view.View r8 = r7.getChildAt(r4)
            defpackage.cjxu.o(r8, r2)
        L4f:
            int r4 = r4 + 1
            goto L38
        L52:
            return r3
        L53:
            r3 = r5
            r1 = 0
        L55:
            int r4 = r4 + 1
            goto L12
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgq.j(int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int k() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (cjxu.f(childAt)) {
                i = Math.max(i, childAt.getMeasuredHeight());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int paddingStart = getPaddingStart();
        dcdc<View> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = dcdcVar.get(i6);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int paddingTop2 = getPaddingTop() + ((paddingTop - measuredHeight) / 2);
            int i7 = cjxu.d(this) ? (i5 - paddingStart) - measuredWidth : paddingStart;
            view.layout(i7, paddingTop2, i7 + measuredWidth, measuredHeight + paddingTop2);
            paddingStart += measuredWidth + f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        g();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        measureChildren(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i) - paddingLeft;
        int a = a(size);
        if (a > size && (a = i(i, i2, size, a)) > size) {
            a = j(size);
        }
        setMeasuredDimension(resolveSizeAndState(Math.max(a + paddingLeft, getSuggestedMinimumWidth()), i, 0), resolveSizeAndState(Math.max(k() + paddingTop, getSuggestedMinimumHeight()), i2, 0));
        dccx F = dcdc.F();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (!e(childAt) && cjxu.f(childAt)) {
                F.g(childAt);
            }
        }
        View d = d();
        if (cjxu.f(d)) {
            F.g(d);
        }
        this.b = F.f();
    }

    public void setEllipsisViewId(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public void setMarginBetweenItems(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        requestLayout();
        invalidate();
    }

    public jgq(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jgq(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = dcdc.e();
        this.c = -2;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cpj.c, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        setMarginBetweenItems(dimensionPixelSize);
    }
}
