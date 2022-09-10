package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private ColorStateList C;
    private ColorStateList D;
    private boolean E;
    private boolean F;
    private final ArrayList<View> G;
    private final int[] H;
    private final wy I;
    private afa J;
    private wt K;
    private vs L;
    private vd M;
    private boolean N;
    private final Runnable O;
    public ActionMenuView a;
    public ImageButton b;
    public View c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public CharSequence i;
    public CharSequence j;
    public final ArrayList<View> k;
    public aew l;
    public aeu m;
    private TextView n;
    private TextView o;
    private ImageButton p;
    private ImageView q;
    private Drawable r;
    private CharSequence s;
    private Context t;
    private int u;
    private int v;
    private int w;
    private int x;
    private acx y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private final boolean A(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private final boolean B(View view) {
        return view.getParent() == this || this.k.contains(view);
    }

    private final void C() {
        if (this.y == null) {
            this.y = new acx();
        }
    }

    private static final int D(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int E(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void F(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public static final aev n() {
        return new aev();
    }

    protected static final aev o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aev) {
            return new aev((aev) layoutParams);
        }
        if (layoutParams instanceof qh) {
            return new aev((qh) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aev((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new aev(layoutParams);
    }

    private final void p() {
        if (this.q == null) {
            this.q = new AppCompatImageView(getContext());
        }
    }

    private final void q() {
        r();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu d = actionMenuView.d();
            if (this.m == null) {
                this.m = new aeu(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            ((vf) d).b(this.m, this.t);
        }
    }

    private final void r() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.u);
            this.a.setOnMenuItemClickListener(this.I);
            this.a.setMenuCallbacks(this.L, this.M);
            aev n = n();
            n.a = (this.d & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388613;
            this.a.setLayoutParams(n);
            t(this.a, false);
        }
    }

    private final void s() {
        if (this.p == null) {
            this.p = new xl(getContext(), null, com.google.android.apps.maps.R.attr.toolbarNavigationButtonStyle);
            aev n = n();
            n.a = (this.d & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            this.p.setLayoutParams(n);
        }
    }

    private final void t(View view, boolean z) {
        aev aevVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            aevVar = n();
        } else if (!checkLayoutParams(layoutParams)) {
            aevVar = o(layoutParams);
        } else {
            aevVar = (aev) layoutParams;
        }
        aevVar.b = 1;
        if (!z || this.c == null) {
            addView(view, aevVar);
            return;
        }
        view.setLayoutParams(aevVar);
        this.k.add(view);
    }

    private final int u(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final int v(View view, int i, int[] iArr, int i2) {
        aev aevVar = (aev) view.getLayoutParams();
        int i3 = aevVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int x = x(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, x, max + measuredWidth, view.getMeasuredHeight() + x);
        return max + measuredWidth + aevVar.rightMargin;
    }

    private final int w(View view, int i, int[] iArr, int i2) {
        aev aevVar = (aev) view.getLayoutParams();
        int i3 = aevVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int x = x(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, x, max, view.getMeasuredHeight() + x);
        return max - (measuredWidth + aevVar.leftMargin);
    }

    private final int x(View view, int i) {
        aev aevVar = (aev) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = aevVar.a & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        }
        if (i3 != 48) {
            if (i3 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - aevVar.bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            if (i4 < aevVar.topMargin) {
                i4 = aevVar.topMargin;
            } else {
                int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                if (i5 < aevVar.bottomMargin) {
                    i4 = Math.max(0, i4 - (aevVar.bottomMargin - i5));
                }
            }
            return paddingTop + i4;
        }
        return getPaddingTop() - i2;
    }

    private final void y(List<View> list, int i) {
        int s = od.s(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, od.s(this));
        list.clear();
        if (s != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                aev aevVar = (aev) childAt.getLayoutParams();
                if (aevVar.b == 0 && A(childAt) && z(aevVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            aev aevVar2 = (aev) childAt2.getLayoutParams();
            if (aevVar2.b == 0 && A(childAt2) && z(aevVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final int z(int i) {
        int s = od.s(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, s) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : s == 1 ? 5 : 3;
    }

    public final boolean a() {
        wt wtVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (wtVar = actionMenuView.c) == null || !wtVar.l()) ? false : true;
    }

    public final boolean b() {
        wt wtVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (wtVar = actionMenuView.c) == null || !wtVar.j()) ? false : true;
    }

    public final void c() {
        aeu aeuVar = this.m;
        vi viVar = aeuVar == null ? null : aeuVar.b;
        if (viVar != null) {
            viVar.collapseActionView();
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof aev);
    }

    public final CharSequence d() {
        ImageButton imageButton = this.p;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final Drawable e() {
        ImageButton imageButton = this.p;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        q();
        return this.a.d();
    }

    public final Drawable g() {
        q();
        ActionMenuView actionMenuView = this.a;
        actionMenuView.d();
        wt wtVar = actionMenuView.c;
        wq wqVar = wtVar.g;
        if (wqVar != null) {
            return wqVar.getDrawable();
        }
        if (wtVar.i) {
            return wtVar.h;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aev(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    public final int h() {
        acx acxVar = this.y;
        if (acxVar != null) {
            return acxVar.g ? acxVar.b : acxVar.a;
        }
        return 0;
    }

    public final int i() {
        acx acxVar = this.y;
        if (acxVar != null) {
            return acxVar.g ? acxVar.a : acxVar.b;
        }
        return 0;
    }

    public final int j() {
        return e() != null ? Math.max(h(), Math.max(this.z, 0)) : h();
    }

    public final int k() {
        vf vfVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (vfVar = actionMenuView.a) == null || !vfVar.hasVisibleItems()) ? i() : Math.max(i(), Math.max(this.A, 0));
    }

    public final void l() {
        if (this.b == null) {
            xl xlVar = new xl(getContext(), null, com.google.android.apps.maps.R.attr.toolbarNavigationButtonStyle);
            this.b = xlVar;
            xlVar.setImageDrawable(this.r);
            this.b.setContentDescription(this.s);
            aev n = n();
            n.a = (this.d & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            n.b = 2;
            this.b.setLayoutParams(n);
            this.b.setOnClickListener(new aet(this));
        }
    }

    public final yr m() {
        if (this.J == null) {
            this.J = new afa(this);
        }
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
            actionMasked = 9;
        }
        if (!this.F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02af A[LOOP:0: B:110:0x02ad->B:111:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d1 A[LOOP:1: B:113:0x02cf->B:114:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f5 A[LOOP:2: B:116:0x02f3->B:117:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0345 A[LOOP:3: B:125:0x0343->B:126:0x0345, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.H;
        boolean a = afm.a(this);
        int i10 = !a ? 1 : 0;
        int i11 = 0;
        if (A(this.p)) {
            F(this.p, i, 0, i2, this.x);
            i3 = this.p.getMeasuredWidth() + D(this.p);
            i4 = Math.max(0, this.p.getMeasuredHeight() + E(this.p));
            i5 = View.combineMeasuredStates(0, this.p.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A(this.b)) {
            F(this.b, i, 0, i2, this.x);
            i3 = this.b.getMeasuredWidth() + D(this.b);
            i4 = Math.max(i4, this.b.getMeasuredHeight() + E(this.b));
            i5 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
        }
        int j = j();
        int max = Math.max(j, i3);
        iArr[a ? 1 : 0] = Math.max(0, j - i3);
        if (A(this.a)) {
            F(this.a, i, max, i2, this.x);
            i6 = this.a.getMeasuredWidth() + D(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + E(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int k = k();
        int max2 = max + Math.max(k, i6);
        iArr[i10] = Math.max(0, k - i6);
        if (A(this.c)) {
            max2 += u(this.c, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.c.getMeasuredHeight() + E(this.c));
            i5 = View.combineMeasuredStates(i5, this.c.getMeasuredState());
        }
        if (A(this.q)) {
            max2 += u(this.q, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.q.getMeasuredHeight() + E(this.q));
            i5 = View.combineMeasuredStates(i5, this.q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((aev) childAt.getLayoutParams()).b == 0 && A(childAt)) {
                max2 += u(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + E(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.g + this.h;
        int i14 = this.e + this.f;
        if (A(this.n)) {
            u(this.n, i, max2 + i14, i2, i13, iArr);
            int measuredWidth = this.n.getMeasuredWidth() + D(this.n);
            i9 = this.n.getMeasuredHeight() + E(this.n);
            i7 = View.combineMeasuredStates(i5, this.n.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (A(this.o)) {
            i8 = Math.max(i8, u(this.o, i, max2 + i14, i2, i9 + i13, iArr));
            i9 += this.o.getMeasuredHeight() + E(this.o);
            i7 = View.combineMeasuredStates(i7, this.o.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(max2 + i8 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (this.N) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!A(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i11);
        }
        i11 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        ActionMenuView actionMenuView = this.a;
        vf vfVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.a;
        if (i != 0 && this.m != null && vfVar != null && (findItem = vfVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (!savedState.b) {
            return;
        }
        removeCallbacks(this.O);
        post(this.O);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        C();
        acx acxVar = this.y;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z == acxVar.g) {
            return;
        }
        acxVar.g = z;
        if (!acxVar.h) {
            acxVar.a = acxVar.e;
            acxVar.b = acxVar.f;
        } else if (z) {
            int i2 = acxVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = acxVar.e;
            }
            acxVar.a = i2;
            int i3 = acxVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = acxVar.f;
            }
            acxVar.b = i3;
        } else {
            int i4 = acxVar.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = acxVar.e;
            }
            acxVar.a = i4;
            int i5 = acxVar.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = acxVar.f;
            }
            acxVar.b = i5;
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        vi viVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        aeu aeuVar = this.m;
        if (aeuVar != null && (viVar = aeuVar.b) != null) {
            savedState.a = viVar.a;
        }
        savedState.b = a();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
            actionMasked = 0;
        }
        if (!this.E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(sl.b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (e() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (e() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        C();
        this.y.b(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        C();
        this.y.a(i, i2);
    }

    public void setLogo(int i) {
        setLogo(sl.b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setMenu(vf vfVar, wt wtVar) {
        if (vfVar == null && this.a == null) {
            return;
        }
        r();
        vf vfVar2 = this.a.a;
        if (vfVar2 == vfVar) {
            return;
        }
        if (vfVar2 != null) {
            vfVar2.c(this.K);
            vfVar2.c(this.m);
        }
        if (this.m == null) {
            this.m = new aeu(this);
        }
        wtVar.k = true;
        if (vfVar != null) {
            vfVar.b(wtVar, this.t);
            vfVar.b(this.m, this.t);
        } else {
            wtVar.a(this.t, null);
            this.m.a(this.t, null);
            wtVar.i();
            this.m.i();
        }
        this.a.setPopupTheme(this.u);
        this.a.setPresenter(wtVar);
        this.K = wtVar;
    }

    public void setMenuCallbacks(vs vsVar, vd vdVar) {
        this.L = vsVar;
        this.M = vdVar;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(vsVar, vdVar);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(sl.b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        s();
        this.p.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(aew aewVar) {
        this.l = aewVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        q();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.u != i) {
            this.u = i;
            if (i == 0) {
                this.t = getContext();
            } else {
                this.t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.w = i;
        TextView textView = this.o;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.h = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.e = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.v = i;
        TextView textView = this.n;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.maps.R.attr.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.b;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            this.b.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.b;
        if (imageButton == null) {
            return;
        }
        imageButton.setImageDrawable(this.r);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            p();
            if (!B(this.q)) {
                t(this.q, true);
            }
        } else {
            ImageView imageView = this.q;
            if (imageView != null && B(imageView)) {
                removeView(this.q);
                this.k.remove(this.q);
            }
        }
        ImageView imageView2 = this.q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            p();
        }
        ImageView imageView = this.q;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            s();
        }
        ImageButton imageButton = this.p;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            s();
            if (!B(this.p)) {
                t(this.p, true);
            }
        } else {
            ImageButton imageButton = this.p;
            if (imageButton != null && B(imageButton)) {
                removeView(this.p);
                this.k.remove(this.p);
            }
        }
        ImageButton imageButton2 = this.p;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.o == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.o = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.o.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.w;
                if (i != 0) {
                    this.o.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.o.setTextColor(colorStateList);
                }
            }
            if (!B(this.o)) {
                t(this.o, true);
            }
        } else {
            TextView textView = this.o;
            if (textView != null && B(textView)) {
                removeView(this.o);
                this.k.remove(this.o);
            }
        }
        TextView textView2 = this.o;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.j = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.o;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.n == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.n = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.n.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.v;
                if (i != 0) {
                    this.n.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.n.setTextColor(colorStateList);
                }
            }
            if (!B(this.n)) {
                t(this.n, true);
            }
        } else {
            TextView textView = this.n;
            if (textView != null && B(textView)) {
                removeView(this.n);
                this.k.remove(this.n);
            }
        }
        TextView textView2 = this.n;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.i = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        TextView textView = this.n;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new aex();
        int a;
        boolean b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = 8388627;
        this.G = new ArrayList<>();
        this.k = new ArrayList<>();
        this.H = new int[2];
        this.I = new aer(this);
        this.O = new aes(this);
        aeq b = aeq.b(getContext(), attributeSet, sj.x, i, 0);
        od.a(this, context, sj.x, attributeSet, b.b, i, 0);
        this.v = b.o(28, 0);
        this.w = b.o(19, 0);
        this.B = b.k(0, this.B);
        this.d = b.k(2, 48);
        int l = b.l(22, 0);
        l = b.p(27) ? b.l(27, l) : l;
        this.h = l;
        this.g = l;
        this.f = l;
        this.e = l;
        int l2 = b.l(25, -1);
        if (l2 >= 0) {
            this.e = l2;
        }
        int l3 = b.l(24, -1);
        if (l3 >= 0) {
            this.f = l3;
        }
        int l4 = b.l(26, -1);
        if (l4 >= 0) {
            this.g = l4;
        }
        int l5 = b.l(23, -1);
        if (l5 >= 0) {
            this.h = l5;
        }
        this.x = b.m(13, -1);
        int l6 = b.l(9, Integer.MIN_VALUE);
        int l7 = b.l(5, Integer.MIN_VALUE);
        int m = b.m(7, 0);
        int m2 = b.m(8, 0);
        C();
        this.y.b(m, m2);
        if (l6 != Integer.MIN_VALUE || l7 != Integer.MIN_VALUE) {
            this.y.a(l6, l7);
        }
        this.z = b.l(10, Integer.MIN_VALUE);
        this.A = b.l(6, Integer.MIN_VALUE);
        this.r = b.d(4);
        this.s = b.f(3);
        CharSequence f = b.f(21);
        if (!TextUtils.isEmpty(f)) {
            setTitle(f);
        }
        CharSequence f2 = b.f(18);
        if (!TextUtils.isEmpty(f2)) {
            setSubtitle(f2);
        }
        this.t = getContext();
        setPopupTheme(b.o(17, 0));
        Drawable d = b.d(16);
        if (d != null) {
            setNavigationIcon(d);
        }
        CharSequence f3 = b.f(15);
        if (!TextUtils.isEmpty(f3)) {
            setNavigationContentDescription(f3);
        }
        Drawable d2 = b.d(11);
        if (d2 != null) {
            setLogo(d2);
        }
        CharSequence f4 = b.f(12);
        if (!TextUtils.isEmpty(f4)) {
            setLogoDescription(f4);
        }
        if (b.p(29)) {
            setTitleTextColor(b.j(29));
        }
        if (b.p(20)) {
            setSubtitleTextColor(b.j(20));
        }
        if (b.p(14)) {
            new ul(getContext()).inflate(b.o(14, 0), f());
        }
        b.q();
    }
}
