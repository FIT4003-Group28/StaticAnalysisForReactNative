package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: LinearLayoutCompat.java */
/* loaded from: classes.dex */
public class y extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1029a;

    /* renamed from: b  reason: collision with root package name */
    private int f1030b;

    /* renamed from: c  reason: collision with root package name */
    private int f1031c;

    /* renamed from: d  reason: collision with root package name */
    private int f1032d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    int a(View view) {
        return 0;
    }

    int a(View view, int i) {
        return 0;
    }

    int b(View view) {
        return 0;
    }

    int d(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public y(Context context) {
        this(context, null);
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1029a = true;
        this.f1030b = -1;
        this.f1031c = 0;
        this.e = 8388659;
        am a2 = am.a(context, attributeSet, a.j.LinearLayoutCompat, i, 0);
        int a3 = a2.a(a.j.LinearLayoutCompat_android_orientation, -1);
        if (a3 >= 0) {
            setOrientation(a3);
        }
        int a4 = a2.a(a.j.LinearLayoutCompat_android_gravity, -1);
        if (a4 >= 0) {
            setGravity(a4);
        }
        boolean a5 = a2.a(a.j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a5) {
            setBaselineAligned(a5);
        }
        this.g = a2.a(a.j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1030b = a2.a(a.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = a2.a(a.j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.a(a.j.LinearLayoutCompat_divider));
        this.n = a2.a(a.j.LinearLayoutCompat_showDividers, 0);
        this.o = a2.e(a.j.LinearLayoutCompat_dividerPadding, 0);
        a2.a();
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public int getShowDividers() {
        return this.n;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        boolean z = false;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.k == null) {
            return;
        }
        if (this.f1032d == 1) {
            a(canvas);
        } else {
            b(canvas);
        }
    }

    void a(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View b2 = b(i);
            if (b2 != null && b2.getVisibility() != 8 && c(i)) {
                a(canvas, (b2.getTop() - ((a) b2.getLayoutParams()).topMargin) - this.m);
            }
        }
        if (c(virtualChildCount)) {
            View b3 = b(virtualChildCount - 1);
            if (b3 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.m;
            } else {
                bottom = b3.getBottom() + ((a) b3.getLayoutParams()).bottomMargin;
            }
            a(canvas, bottom);
        }
    }

    void b(Canvas canvas) {
        int right;
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean a2 = as.a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View b2 = b(i);
            if (b2 != null && b2.getVisibility() != 8 && c(i)) {
                a aVar = (a) b2.getLayoutParams();
                if (a2) {
                    left = b2.getRight() + aVar.rightMargin;
                } else {
                    left = (b2.getLeft() - aVar.leftMargin) - this.l;
                }
                b(canvas, left);
            }
        }
        if (c(virtualChildCount)) {
            View b3 = b(virtualChildCount - 1);
            if (b3 != null) {
                a aVar2 = (a) b3.getLayoutParams();
                if (a2) {
                    right = (b3.getLeft() - aVar2.leftMargin) - this.l;
                } else {
                    right = b3.getRight() + aVar2.rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.l;
            }
            b(canvas, right);
        }
    }

    void a(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    void b(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.f1029a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1030b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f1030b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f1030b);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1030b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i2 = this.f1031c;
        if (this.f1032d == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i == 80) {
                i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return i2 + ((a) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1030b;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1030b = i;
    }

    View b(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    public void setWeightSum(float f) {
        this.g = Math.max((float) BitmapDescriptorFactory.HUE_RED, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1032d == 1) {
            a(i, i2);
        } else {
            b(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.n & 4) != 0;
        } else if ((this.n & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(int r41, int r42) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.y.a(int, int):void");
    }

    private void c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b2 = b(i3);
            if (b2.getVisibility() != 8) {
                a aVar = (a) b2.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = b2.getMeasuredHeight();
                    measureChildWithMargins(b2, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b(int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.y.b(int, int):void");
    }

    private void d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b2 = b(i3);
            if (b2.getVisibility() != 8) {
                a aVar = (a) b2.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = b2.getMeasuredWidth();
                    measureChildWithMargins(b2, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    void a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1032d == 1) {
            a(i, i2, i3, i4);
        } else {
            b(i, i2, i3, i4);
        }
    }

    void a(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i7 = this.e & 112;
        int i8 = this.e & 8388615;
        if (i7 == 16) {
            paddingTop = (((i4 - i2) - this.f) / 2) + getPaddingTop();
        } else if (i7 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - this.f;
        } else {
            paddingTop = getPaddingTop();
        }
        int i9 = 0;
        while (i9 < virtualChildCount) {
            View b2 = b(i9);
            if (b2 == null) {
                paddingTop += d(i9);
            } else if (b2.getVisibility() != 8) {
                int measuredWidth = b2.getMeasuredWidth();
                int measuredHeight = b2.getMeasuredHeight();
                a aVar = (a) b2.getLayoutParams();
                int i10 = aVar.h;
                if (i10 < 0) {
                    i10 = i8;
                }
                int a2 = android.support.v4.j.e.a(i10, android.support.v4.j.s.c(this)) & 7;
                if (a2 == 1) {
                    i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aVar.leftMargin) - aVar.rightMargin;
                } else if (a2 == 5) {
                    i5 = (paddingRight - measuredWidth) - aVar.rightMargin;
                } else {
                    i5 = aVar.leftMargin + paddingLeft;
                }
                int i11 = i5;
                if (c(i9)) {
                    paddingTop += this.m;
                }
                int i12 = paddingTop + aVar.topMargin;
                a(b2, i11, i12 + a(b2), measuredWidth, measuredHeight);
                i9 += a(b2, i9);
                paddingTop = i12 + measuredHeight + aVar.bottomMargin + b(b2);
            }
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b(int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.y.b(int, int, int, int):void");
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.f1032d != i) {
            this.f1032d = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f1032d;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.e;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.e) != i2) {
            this.e = i2 | (this.e & (-8388616));
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.e & 112) != i2) {
            this.e = i2 | (this.e & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public a generateDefaultLayoutParams() {
        if (this.f1032d == 0) {
            return new a(-2, -2);
        }
        if (this.f1032d != 1) {
            return null;
        }
        return new a(-1, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(y.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(y.class.getName());
    }

    /* compiled from: LinearLayoutCompat.java */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float g;
        public int h;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.LinearLayoutCompat_Layout);
            this.g = obtainStyledAttributes.getFloat(a.j.LinearLayoutCompat_Layout_android_layout_weight, BitmapDescriptorFactory.HUE_RED);
            this.h = obtainStyledAttributes.getInt(a.j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.h = -1;
            this.g = BitmapDescriptorFactory.HUE_RED;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.h = -1;
        }
    }
}
