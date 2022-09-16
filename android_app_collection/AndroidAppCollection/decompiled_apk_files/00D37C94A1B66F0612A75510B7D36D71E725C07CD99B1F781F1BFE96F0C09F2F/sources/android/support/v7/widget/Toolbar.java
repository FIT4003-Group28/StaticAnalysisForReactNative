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
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private yx C;
    private int D;
    private int E;
    private ColorStateList F;
    private ColorStateList G;
    private boolean H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private final ArrayList f69J;
    private final int[] K;
    private aam L;
    private final Runnable M;
    private final aae N;
    public ActionMenuView a;
    public Drawable b;
    public CharSequence c;
    public ImageButton d;
    public View e;
    public Context f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public CharSequence n;
    public CharSequence o;
    public final ArrayList p;
    public aaj q;
    public tq r;
    public aah s;
    public ss t;
    public sd u;
    private TextView v;
    private TextView w;
    private ImageButton x;
    private ImageView y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public static final aai C() {
        return new aai();
    }

    protected static final aai D(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aai) {
            return new aai((aai) layoutParams);
        }
        if (layoutParams instanceof nh) {
            return new aai((nh) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aai((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new aai(layoutParams);
    }

    private final int E(int i) {
        int e = lj.e(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, e) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : e == 1 ? 5 : 3;
    }

    private final int F(View view, int i) {
        aai aaiVar = (aai) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = aaiVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.E & 112;
        }
        if (i3 != 48) {
            if (i3 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - aaiVar.bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            if (i4 < aaiVar.topMargin) {
                i4 = aaiVar.topMargin;
            } else {
                int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                if (i5 < aaiVar.bottomMargin) {
                    i4 = Math.max(0, i4 - (aaiVar.bottomMargin - i5));
                }
            }
            return paddingTop + i4;
        }
        return getPaddingTop() - i2;
    }

    private final int G(View view, int i, int[] iArr, int i2) {
        aai aaiVar = (aai) view.getLayoutParams();
        int i3 = aaiVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int F = F(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, F, max + measuredWidth, view.getMeasuredHeight() + F);
        return max + measuredWidth + aaiVar.rightMargin;
    }

    private final int H(View view, int i, int[] iArr, int i2) {
        aai aaiVar = (aai) view.getLayoutParams();
        int i3 = aaiVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int F = F(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, F, max, view.getMeasuredHeight() + F);
        return max - (measuredWidth + aaiVar.leftMargin);
    }

    private final int I(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void J(List list, int i) {
        int e = lj.e(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, lj.e(this));
        list.clear();
        if (e != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                aai aaiVar = (aai) childAt.getLayoutParams();
                if (aaiVar.b == 0 && P(childAt) && E(aaiVar.a) == absoluteGravity) {
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
            aai aaiVar2 = (aai) childAt2.getLayoutParams();
            if (aaiVar2.b == 0 && P(childAt2) && E(aaiVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void K(View view, boolean z) {
        aai aaiVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            aaiVar = C();
        } else if (!checkLayoutParams(layoutParams)) {
            aaiVar = D(layoutParams);
        } else {
            aaiVar = (aai) layoutParams;
        }
        aaiVar.b = 1;
        if (!z || this.e == null) {
            addView(view, aaiVar);
            return;
        }
        view.setLayoutParams(aaiVar);
        this.p.add(view);
    }

    private final void L() {
        if (this.C == null) {
            this.C = new yx();
        }
    }

    private final void M() {
        if (this.y == null) {
            this.y = new AppCompatImageView(getContext());
        }
    }

    private final void N() {
        if (this.x == null) {
            this.x = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            aai C = C();
            C.a = (this.h & 112) | 8388611;
            this.x.setLayoutParams(C);
        }
    }

    private final boolean O(View view) {
        return view.getParent() == this || this.p.contains(view);
    }

    private final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int Q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int R(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void S(View view, int i, int i2, int i3, int i4) {
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

    public final boolean A() {
        tq tqVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (tqVar = actionMenuView.c) == null || !tqVar.l()) ? false : true;
    }

    public final boolean B() {
        tq tqVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (tqVar = actionMenuView.c) == null || !tqVar.m()) ? false : true;
    }

    public final int a() {
        yx yxVar = this.C;
        if (yxVar != null) {
            return yxVar.g ? yxVar.a : yxVar.b;
        }
        return 0;
    }

    public final int b() {
        yx yxVar = this.C;
        if (yxVar != null) {
            return yxVar.g ? yxVar.b : yxVar.a;
        }
        return 0;
    }

    public final int c() {
        sf sfVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (sfVar = actionMenuView.a) == null || !sfVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.D, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof aai);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.m, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final vh f() {
        if (this.L == null) {
            this.L = new aam(this, true);
        }
        return this.L;
    }

    public final Menu g() {
        j();
        return this.a.d();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return C();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aai(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final void i() {
        aah aahVar = this.s;
        si siVar = aahVar == null ? null : aahVar.b;
        if (siVar != null) {
            siVar.collapseActionView();
        }
    }

    public final void j() {
        k();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu d = actionMenuView.d();
            if (this.s == null) {
                this.s = new aah(this);
            }
            this.a.c.o();
            ((sf) d).h(this.s, this.f);
        }
    }

    public final void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.g(this.g);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.N;
            actionMenuView2.f(this.t, this.u);
            aai C = C();
            C.a = (this.h & 112) | 8388613;
            this.a.setLayoutParams(C);
            K(this.a, false);
        }
    }

    public final void l(int i) {
        new rl(getContext()).inflate(i, g());
    }

    public final void m(int i, int i2) {
        L();
        this.C.a(i, i2);
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            M();
            if (!O(this.y)) {
                K(this.y, true);
            }
        } else {
            ImageView imageView = this.y;
            if (imageView != null && O(imageView)) {
                removeView(this.y);
                this.p.remove(this.y);
            }
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(int i) {
        p(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.I = false;
            actionMasked = 9;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.I = true;
                }
                if (i != 10 || i == 3) {
                    this.I = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.I = false;
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
        int[] iArr = this.K;
        boolean b = aav.b(this);
        int i9 = !b ? 1 : 0;
        int i10 = 0;
        if (P(this.x)) {
            S(this.x, i, 0, i2, this.B);
            i3 = this.x.getMeasuredWidth() + Q(this.x);
            i4 = Math.max(0, this.x.getMeasuredHeight() + R(this.x));
            i5 = View.combineMeasuredStates(0, this.x.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (P(this.d)) {
            S(this.d, i, 0, i2, this.B);
            i3 = this.d.getMeasuredWidth() + Q(this.d);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + R(this.d));
            i5 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
        }
        int d = d();
        int max = Math.max(d, i3);
        iArr[b ? 1 : 0] = Math.max(0, d - i3);
        if (P(this.a)) {
            S(this.a, i, max, i2, this.B);
            i6 = this.a.getMeasuredWidth() + Q(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + R(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c = c();
        int max2 = max + Math.max(c, i6);
        iArr[i9] = Math.max(0, c - i6);
        if (P(this.e)) {
            max2 += I(this.e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.e.getMeasuredHeight() + R(this.e));
            i5 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
        }
        if (P(this.y)) {
            max2 += I(this.y, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.y.getMeasuredHeight() + R(this.y));
            i5 = View.combineMeasuredStates(i5, this.y.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((aai) childAt.getLayoutParams()).b == 0 && P(childAt)) {
                max2 += I(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + R(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.k + this.l;
        int i13 = this.i + this.j;
        if (P(this.v)) {
            I(this.v, i, max2 + i13, i2, i12, iArr);
            i10 = this.v.getMeasuredWidth() + Q(this.v);
            int measuredHeight = this.v.getMeasuredHeight() + R(this.v);
            i7 = View.combineMeasuredStates(i5, this.v.getMeasuredState());
            i8 = measuredHeight;
        } else {
            i7 = i5;
            i8 = 0;
        }
        if (P(this.w)) {
            i10 = Math.max(i10, I(this.w, i, max2 + i13, i2, i8 + i12, iArr));
            i8 += this.w.getMeasuredHeight() + R(this.w);
            i7 = View.combineMeasuredStates(i7, this.w.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
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
        sf sfVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.a;
        if (i != 0 && this.s != null && sfVar != null && (findItem = sfVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (!savedState.b) {
            return;
        }
        removeCallbacks(this.M);
        post(this.M);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        L();
        yx yxVar = this.C;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z == yxVar.g) {
            return;
        }
        yxVar.g = z;
        if (!yxVar.h) {
            yxVar.a = yxVar.e;
            yxVar.b = yxVar.f;
        } else if (z) {
            int i2 = yxVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = yxVar.e;
            }
            yxVar.a = i2;
            int i3 = yxVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = yxVar.f;
            }
            yxVar.b = i3;
        } else {
            int i4 = yxVar.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = yxVar.e;
            }
            yxVar.a = i4;
            int i5 = yxVar.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = yxVar.f;
            }
            yxVar.b = i5;
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        si siVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        aah aahVar = this.s;
        if (aahVar != null && (siVar = aahVar.b) != null) {
            savedState.a = siVar.a;
        }
        savedState.b = A();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
            actionMasked = 0;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.H = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public final void p(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            N();
        }
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public final void q(Drawable drawable) {
        if (drawable != null) {
            N();
            if (!O(this.x)) {
                K(this.x, true);
            }
        } else {
            ImageButton imageButton = this.x;
            if (imageButton != null && O(imageButton)) {
                removeView(this.x);
                this.p.remove(this.x);
            }
        }
        ImageButton imageButton2 = this.x;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void r(View.OnClickListener onClickListener) {
        N();
        this.x.setOnClickListener(onClickListener);
    }

    public final void s(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void t(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.w == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.w = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.w.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A;
                if (i != 0) {
                    this.w.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.w.setTextColor(colorStateList);
                }
            }
            if (!O(this.w)) {
                K(this.w, true);
            }
        } else {
            TextView textView = this.w;
            if (textView != null && O(textView)) {
                removeView(this.w);
                this.p.remove(this.w);
            }
        }
        TextView textView2 = this.w;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final void u(Context context, int i) {
        this.A = i;
        TextView textView = this.w;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void v(ColorStateList colorStateList) {
        this.G = colorStateList;
        TextView textView = this.w;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void w(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.v == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.v = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.v.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.z;
                if (i != 0) {
                    this.v.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.v.setTextColor(colorStateList);
                }
            }
            if (!O(this.v)) {
                K(this.v, true);
            }
        } else {
            TextView textView = this.v;
            if (textView != null && O(textView)) {
                removeView(this.v);
                this.p.remove(this.v);
            }
        }
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.n = charSequence;
    }

    public final void x(Context context, int i) {
        this.z = i;
        TextView textView = this.v;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void y(int i) {
        z(ColorStateList.valueOf(i));
    }

    public final void z(ColorStateList colorStateList) {
        this.F = colorStateList;
        TextView textView = this.v;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return D(layoutParams);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new yg(3);
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
        this.E = 8388627;
        this.f69J = new ArrayList();
        this.p = new ArrayList();
        this.K = new int[2];
        this.N = new aae(this);
        this.M = new aaf(this);
        aad l = aad.l(getContext(), attributeSet, pm.x, i, 0);
        lj.L(this, context, pm.x, attributeSet, l.b, i, 0);
        this.z = l.f(28, 0);
        this.A = l.f(19, 0);
        this.E = l.d(0, this.E);
        this.h = l.d(2, 48);
        int a = l.a(22, 0);
        a = l.q(27) ? l.a(27, a) : a;
        this.l = a;
        this.k = a;
        this.j = a;
        this.i = a;
        int a2 = l.a(25, -1);
        if (a2 >= 0) {
            this.i = a2;
        }
        int a3 = l.a(24, -1);
        if (a3 >= 0) {
            this.j = a3;
        }
        int a4 = l.a(26, -1);
        if (a4 >= 0) {
            this.k = a4;
        }
        int a5 = l.a(23, -1);
        if (a5 >= 0) {
            this.l = a5;
        }
        this.B = l.b(13, -1);
        int a6 = l.a(9, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int a7 = l.a(5, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int b = l.b(7, 0);
        int b2 = l.b(8, 0);
        L();
        yx yxVar = this.C;
        yxVar.h = false;
        if (b != Integer.MIN_VALUE) {
            yxVar.e = b;
            yxVar.a = b;
        }
        if (b2 != Integer.MIN_VALUE) {
            yxVar.f = b2;
            yxVar.b = b2;
        }
        if (a6 != Integer.MIN_VALUE || a7 != Integer.MIN_VALUE) {
            yxVar.a(a6, a7);
        }
        this.m = l.a(10, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.D = l.a(6, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.b = l.h(4);
        this.c = l.m(3);
        CharSequence m = l.m(21);
        if (!TextUtils.isEmpty(m)) {
            w(m);
        }
        CharSequence m2 = l.m(18);
        if (!TextUtils.isEmpty(m2)) {
            t(m2);
        }
        this.f = getContext();
        s(l.f(17, 0));
        Drawable h = l.h(16);
        if (h != null) {
            q(h);
        }
        CharSequence m3 = l.m(15);
        if (!TextUtils.isEmpty(m3)) {
            p(m3);
        }
        Drawable h2 = l.h(11);
        if (h2 != null) {
            n(h2);
        }
        CharSequence m4 = l.m(12);
        if (!TextUtils.isEmpty(m4)) {
            if (!TextUtils.isEmpty(m4)) {
                M();
            }
            ImageView imageView = this.y;
            if (imageView != null) {
                imageView.setContentDescription(m4);
            }
        }
        if (l.q(29)) {
            z(l.g(29));
        }
        if (l.q(20)) {
            v(l.g(20));
        }
        if (l.q(14)) {
            l(l.f(14, 0));
        }
        l.o();
    }
}
