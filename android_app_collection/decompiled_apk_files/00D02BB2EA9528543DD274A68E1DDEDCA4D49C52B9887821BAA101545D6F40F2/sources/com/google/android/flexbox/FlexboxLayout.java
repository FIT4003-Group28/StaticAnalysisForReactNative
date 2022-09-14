package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FlexboxLayout extends ViewGroup implements cmpb {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private cmpf o;
    private List<cmpc> p;
    private cmpd q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private final boolean B(int i) {
        if (i >= 0 && i < this.p.size()) {
            for (int i2 = i + 1; i2 < this.p.size(); i2++) {
                if (this.p.get(i2).a() > 0) {
                    return false;
                }
            }
            if (o()) {
                return (this.i & 4) != 0;
            } else if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private final void e(int i, int i2, int i3, int i4) {
        int v;
        int t;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            v = v() + getPaddingTop() + getPaddingBottom();
            t = t();
        } else if (i == 2 || i == 3) {
            v = t();
            t = v() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < t) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = t;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(t, i2, i4);
        } else if (mode == 1073741824) {
            if (size < t) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < v) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = v;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(v, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < v) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.f(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.g(boolean, boolean, int, int, int, int):void");
    }

    private final void i(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i3 = 0; i3 < size; i3++) {
            cmpc cmpcVar = this.p.get(i3);
            for (int i4 = 0; i4 < cmpcVar.h; i4++) {
                int i5 = cmpcVar.o + i4;
                View d = d(i5);
                if (d != null && d.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
                    if (x(i5, i4)) {
                        if (z) {
                            left = d.getRight() + layoutParams.rightMargin;
                        } else {
                            left = (d.getLeft() - layoutParams.leftMargin) - this.l;
                        }
                        n(canvas, left, cmpcVar.b, cmpcVar.g);
                    }
                    if (i4 == cmpcVar.h - 1 && (this.j & 4) > 0) {
                        if (z) {
                            right = (d.getLeft() - layoutParams.leftMargin) - this.l;
                        } else {
                            right = d.getRight() + layoutParams.rightMargin;
                        }
                        n(canvas, right, cmpcVar.b, cmpcVar.g);
                    }
                }
            }
            if (y(i3)) {
                if (z2) {
                    i2 = cmpcVar.d;
                } else {
                    i2 = cmpcVar.b - this.k;
                }
                u(canvas, paddingLeft, i2, max);
            }
            if (B(i3) && (this.i & 4) > 0) {
                if (z2) {
                    i = cmpcVar.b - this.k;
                } else {
                    i = cmpcVar.d;
                }
                u(canvas, paddingLeft, i, max);
            }
        }
    }

    private final void m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i3 = 0; i3 < size; i3++) {
            cmpc cmpcVar = this.p.get(i3);
            for (int i4 = 0; i4 < cmpcVar.h; i4++) {
                int i5 = cmpcVar.o + i4;
                View d = d(i5);
                if (d != null && d.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
                    if (x(i5, i4)) {
                        if (z2) {
                            top = d.getBottom() + layoutParams.bottomMargin;
                        } else {
                            top = (d.getTop() - layoutParams.topMargin) - this.k;
                        }
                        u(canvas, cmpcVar.a, top, cmpcVar.g);
                    }
                    if (i4 == cmpcVar.h - 1 && (this.i & 4) > 0) {
                        if (z2) {
                            bottom = (d.getTop() - layoutParams.topMargin) - this.k;
                        } else {
                            bottom = d.getBottom() + layoutParams.bottomMargin;
                        }
                        u(canvas, cmpcVar.a, bottom, cmpcVar.g);
                    }
                }
            }
            if (y(i3)) {
                if (z) {
                    i2 = cmpcVar.c;
                } else {
                    i2 = cmpcVar.a - this.l;
                }
                n(canvas, i2, paddingTop, max);
            }
            if (B(i3) && (this.j & 4) > 0) {
                if (z) {
                    i = cmpcVar.a - this.l;
                } else {
                    i = cmpcVar.c;
                }
                n(canvas, i, paddingTop, max);
            }
        }
    }

    private final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    private final void u(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    private final boolean x(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View d = d(i - i3);
            if (d != null && d.getVisibility() != 8) {
                return o() ? (this.j & 2) != 0 : (this.i & 2) != 0;
            }
        }
        return o() ? (this.j & 1) != 0 : (this.i & 1) != 0;
    }

    private final boolean y(int i) {
        if (i >= 0 && i < this.p.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (this.p.get(i2).a() > 0) {
                    return o() ? (this.i & 2) != 0 : (this.j & 2) != 0;
                }
            }
            if (o()) {
                return (this.i & 1) != 0;
            } else if ((this.j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cmpb
    public final void A(cmpc cmpcVar) {
        int i;
        int i2;
        if (o()) {
            if ((this.j & 4) <= 0) {
                return;
            }
            i = cmpcVar.e;
            i2 = this.l;
        } else if ((this.i & 4) <= 0) {
            return;
        } else {
            i = cmpcVar.e;
            i2 = this.k;
        }
        cmpcVar.e = i + i2;
        cmpcVar.f += i2;
    }

    @Override // defpackage.cmpb
    public final int F() {
        return this.f;
    }

    @Override // defpackage.cmpb
    public final List<cmpc> G() {
        return this.p;
    }

    @Override // defpackage.cmpb
    public final void H(int i, View view) {
    }

    @Override // defpackage.cmpb
    public final int a() {
        return getChildCount();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        cmpf cmpfVar = this.o;
        SparseIntArray sparseIntArray = this.n;
        int a = cmpfVar.a.a();
        List<cmpe> a2 = cmpfVar.a(a);
        cmpe cmpeVar = new cmpe();
        if (view != null && (layoutParams instanceof FlexItem)) {
            cmpeVar.b = ((FlexItem) layoutParams).c();
        } else {
            cmpeVar.b = 1;
        }
        if (i == -1 || i == a) {
            cmpeVar.a = a;
        } else if (i < cmpfVar.a.a()) {
            cmpeVar.a = i;
            for (int i2 = i; i2 < a; i2++) {
                a2.get(i2).a++;
            }
        } else {
            cmpeVar.a = a;
        }
        a2.add(cmpeVar);
        this.m = cmpf.p(a + 1, a2, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.cmpb
    public final View b(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.cmpb
    public final View c(int i) {
        return d(i);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View d(int i) {
        if (i >= 0) {
            int[] iArr = this.m;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // defpackage.cmpb
    public final int h() {
        return this.a;
    }

    @Override // defpackage.cmpb
    public final int j() {
        return this.b;
    }

    @Override // defpackage.cmpb
    public final int k() {
        return this.e;
    }

    @Override // defpackage.cmpb
    public final int l() {
        return this.d;
    }

    @Override // defpackage.cmpb
    public final boolean o() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int s = od.s(this);
        int i = this.a;
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            boolean z3 = s == 1;
            if (this.b == 2) {
                z = true;
            }
            i(canvas, z3, z);
        } else if (i == 1) {
            boolean z4 = s != 1;
            if (this.b == 2) {
                z = true;
            }
            i(canvas, z4, z);
        } else if (i == 2) {
            boolean z5 = s != 1;
            if (s != 1) {
                z2 = false;
            }
            if (this.b != 2) {
                z5 = z2;
            }
            m(canvas, z5, false);
        } else if (i != 3) {
        } else {
            boolean z6 = s != 1;
            if (s == 1) {
                z = true;
            }
            if (this.b != 2) {
                z6 = z;
            }
            m(canvas, z6, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int s = od.s(this);
        int i5 = this.a;
        boolean z2 = false;
        if (i5 == 0) {
            f(s == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            f(s != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            boolean z3 = s != 1;
            if (s == 1) {
                z2 = true;
            }
            if (this.b != 2) {
                z3 = z2;
            }
            g(z3, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            boolean z4 = s != 1;
            if (s == 1) {
                z2 = true;
            }
            if (this.b != 2) {
                z4 = z2;
            }
            g(z4, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    @Override // defpackage.cmpb
    public final int p(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (o()) {
            if (x(i, i2)) {
                i4 = this.l;
            }
            if ((this.j & 4) > 0) {
                i3 = this.l;
                return i4 + i3;
            }
            return i4;
        }
        if (x(i, i2)) {
            i4 = this.k;
        }
        if ((this.i & 4) > 0) {
            i3 = this.k;
            return i4 + i3;
        }
        return i4;
    }

    @Override // defpackage.cmpb
    public final int q(View view) {
        return 0;
    }

    @Override // defpackage.cmpb
    public final int r(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.cmpb
    public final int s(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        if (drawable != null) {
            this.k = drawable.getIntrinsicHeight();
        } else {
            this.k = 0;
        }
        w();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
        } else {
            this.l = 0;
        }
        w();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // defpackage.cmpb
    public void setFlexLines(List<cmpc> list) {
        this.p = list;
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    @Override // defpackage.cmpb
    public final int t() {
        int i = Integer.MIN_VALUE;
        for (cmpc cmpcVar : this.p) {
            i = Math.max(i, cmpcVar.e);
        }
        return i;
    }

    @Override // defpackage.cmpb
    public final int v() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cmpc cmpcVar = this.p.get(i2);
            if (y(i2)) {
                i += o() ? this.k : this.l;
            }
            if (B(i2)) {
                i += o() ? this.k : this.l;
            }
            i += cmpcVar.g;
        }
        return i;
    }

    @Override // defpackage.cmpb
    public final void z(View view, int i, int i2, cmpc cmpcVar) {
        int i3;
        int i4;
        if (x(i, i2)) {
            if (o()) {
                i3 = cmpcVar.e;
                i4 = this.l;
            } else {
                i3 = cmpcVar.e;
                i4 = this.k;
            }
            cmpcVar.e = i3 + i4;
            cmpcVar.f += i4;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void w() {
        if (this.g != null || this.h != null) {
            setWillNotDraw(false);
        } else {
            setWillNotDraw(true);
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new cmpf(this);
        this.p = new ArrayList();
        this.q = new cmpd();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cmpl.a, i, 0);
        this.a = obtainStyledAttributes.getInt(5, 0);
        this.b = obtainStyledAttributes.getInt(6, 0);
        this.c = obtainStyledAttributes.getInt(7, 0);
        this.d = obtainStyledAttributes.getInt(1, 4);
        this.e = obtainStyledAttributes.getInt(0, 5);
        this.f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new cmpg();
        private int a;
        private float b;
        private float c;
        private int d;
        private float e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cmpl.b);
            this.a = obtainStyledAttributes.getInt(8, 1);
            this.b = obtainStyledAttributes.getFloat(2, 0.0f);
            this.c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.d = obtainStyledAttributes.getInt(0, -1);
            this.e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int a() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float e() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean k() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float l() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int p() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }
    }
}
