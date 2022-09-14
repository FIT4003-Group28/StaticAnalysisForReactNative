package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: aab  reason: default package */
/* loaded from: classes2.dex */
public class aab extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public aab(Context context) {
        this(context, null);
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aaa;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public aaa generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aaa(layoutParams);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i3 = this.c;
        if (this.d == 1 && (i = this.f & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
            }
        }
        return i3 + ((aaa) childAt.getLayoutParams()).topMargin + baseline;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public aaa generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new aaa(-2, -2);
        }
        if (i != 1) {
            return null;
        }
        return new aaa(-1, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public aaa generateLayoutParams(AttributeSet attributeSet) {
        return new aaa(getContext(), attributeSet);
    }

    final void l(Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    final void m(Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean n(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.n & 4) != 0;
        } else if ((this.n & 2) == 0) {
            return false;
        } else {
            do {
                i--;
                if (i < 0) {
                    return false;
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        boolean z = false;
        if (drawable != null) {
            this.h = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.h = 0;
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

    public void setGravity(int i) {
        if (this.f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i |= 48;
            }
            this.f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f;
        if ((8388615 & i3) != i2) {
            this.f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.j = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i3 = this.f;
        if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i2) {
            this.f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.i = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public aab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        aeq b = aeq.b(context, attributeSet, sj.m, i, 0);
        od.a(this, context, sj.m, attributeSet, b.b, i, 0);
        int i2 = b.i(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = b.i(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!b.h(2, true)) {
            setBaselineAligned(false);
        }
        this.i = b.b.getFloat(4, -1.0f);
        this.b = b.i(3, -1);
        this.j = b.h(7, false);
        setDividerDrawable(b.d(5));
        this.n = b.i(8, 0);
        this.o = b.m(6, 0);
        b.q();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.g == null) {
            return;
        }
        int i2 = 0;
        if (this.d != 1) {
            int childCount = getChildCount();
            boolean a = afm.a(this);
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && n(i2)) {
                    aaa aaaVar = (aaa) childAt.getLayoutParams();
                    if (a) {
                        left2 = childAt.getRight() + aaaVar.rightMargin;
                    } else {
                        left2 = (childAt.getLeft() - aaaVar.leftMargin) - this.h;
                    }
                    m(canvas, left2);
                }
                i2++;
            }
            if (!n(childCount)) {
                return;
            }
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 != null) {
                aaa aaaVar2 = (aaa) childAt2.getLayoutParams();
                if (a) {
                    left = childAt2.getLeft() - aaaVar2.leftMargin;
                    i = this.h;
                    right = left - i;
                } else {
                    right = childAt2.getRight() + aaaVar2.rightMargin;
                }
            } else if (a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.h;
                right = left - i;
            }
            m(canvas, right);
            return;
        }
        int childCount2 = getChildCount();
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && n(i2)) {
                l(canvas, (childAt3.getTop() - ((aaa) childAt3.getLayoutParams()).topMargin) - this.m);
            }
            i2++;
        }
        if (!n(childCount2)) {
            return;
        }
        View childAt4 = getChildAt(childCount2 - 1);
        if (childAt4 == null) {
            bottom = (getHeight() - getPaddingBottom()) - this.m;
        } else {
            bottom = childAt4.getBottom() + ((aaa) childAt4.getLayoutParams()).bottomMargin;
        }
        l(canvas, bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ca, code lost:
        if (r12.width == (-1)) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x062e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r41, int r42) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.onMeasure(int, int):void");
    }
}
