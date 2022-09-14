package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: czvg  reason: default package */
/* loaded from: classes5.dex */
public class czvg extends FrameLayout {
    final daaj a;
    Drawable b;
    int c;
    ow d;
    private boolean e;
    private int f;
    private Toolbar g;
    private View h;
    private View i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    private boolean o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private czvb w;

    public czvg(Context context) {
        this(context, null);
    }

    private final void a() {
        if (!this.e) {
            return;
        }
        Toolbar toolbar = null;
        this.g = null;
        this.h = null;
        int i = this.f;
        if (i != -1) {
            Toolbar toolbar2 = (Toolbar) findViewById(i);
            this.g = toolbar2;
            if (toolbar2 != null) {
                ViewParent parent = toolbar2.getParent();
                View view = toolbar2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.h = view;
            }
        }
        if (this.g == null) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (childAt instanceof Toolbar) {
                    toolbar = (Toolbar) childAt;
                    break;
                }
                i2++;
            }
            this.g = toolbar;
        }
        b();
        this.e = false;
    }

    private final void b() {
        View view;
        if (!this.o && (view = this.i) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.i);
            }
        }
        if (!this.o || this.g == null) {
            return;
        }
        if (this.i == null) {
            this.i = new View(getContext());
        }
        if (this.i.getParent() != null) {
            return;
        }
        this.g.addView(this.i, -1, -1);
    }

    private static int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private final void d() {
        setContentDescription(this.o ? this.a.f : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static czvm i(View view) {
        czvm czvmVar = (czvm) view.getTag(R.id.view_offset_helper);
        if (czvmVar == null) {
            czvm czvmVar2 = new czvm(view);
            view.setTag(R.id.view_offset_helper, czvmVar2);
            return czvmVar2;
        }
        return czvmVar;
    }

    protected static final czve m() {
        return new czve();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof czve;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.g == null && (drawable = this.q) != null && this.r > 0) {
            drawable.mutate().setAlpha(this.r);
            this.q.draw(canvas);
        }
        if (this.o && this.p) {
            this.a.t(canvas);
        }
        if (this.b == null || this.r <= 0) {
            return;
        }
        ow owVar = this.d;
        int d = owVar != null ? owVar.d() : 0;
        if (d <= 0) {
            return;
        }
        this.b.setBounds(0, -this.c, getWidth(), d - this.c);
        this.b.mutate().setAlpha(this.r);
        this.b.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.q;
        if (drawable == null || this.r <= 0 || ((view2 = this.h) == null || view2 == this ? view != this.g : view != view2)) {
            z = false;
        } else {
            drawable.mutate().setAlpha(this.r);
            this.q.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        daaj daajVar = this.a;
        if (daajVar != null) {
            z |= daajVar.r(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ FrameLayout.LayoutParams mo7generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new czve(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new czve(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        Toolbar toolbar;
        if (i != this.r) {
            if (this.q != null && (toolbar = this.g) != null) {
                od.i(toolbar);
            }
            this.r = i;
            od.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        if (this.q == null && this.b == null) {
            return;
        }
        int height = getHeight() + this.c;
        int i = this.v;
        boolean z = false;
        if (i < 0) {
            ow owVar = this.d;
            int d = owVar != null ? owVar.d() : 0;
            int A = od.A(this);
            if (A > 0) {
                i = Math.min(A + A + d, getHeight());
            } else {
                i = getHeight() / 3;
            }
        }
        if (height < i) {
            z = true;
        }
        setScrimsShown(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l(View view) {
        return ((getHeight() - i(view).a) - view.getHeight()) - ((czve) view.getLayoutParams()).bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            od.N(this, od.M((View) parent));
            if (this.w == null) {
                this.w = new czvf(this);
            }
            ((AppBarLayout) parent).c(this.w);
            od.L(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        czvb czvbVar = this.w;
        if (czvbVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).d(czvbVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        ow owVar = this.d;
        if (owVar != null) {
            int d = owVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!od.M(childAt) && childAt.getTop() < d) {
                    od.ag(childAt, d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            i(getChildAt(i6)).a();
        }
        if (this.o && (view = this.i) != null) {
            boolean z2 = od.ak(view) && this.i.getVisibility() == 0;
            this.p = z2;
            if (z2) {
                int s = od.s(this);
                View view2 = this.h;
                if (view2 == null) {
                    view2 = this.g;
                }
                int l = l(view2);
                daak.a(this, this.i, this.n);
                this.a.f(this.n.left + (s == 1 ? this.g.f : this.g.e), this.n.top + l + this.g.g, this.n.right - (s == 1 ? this.g.e : this.g.f), (this.n.bottom + l) - this.g.h);
                this.a.e(s == 1 ? this.l : this.j, this.n.top + this.k, (i3 - i) - (s == 1 ? this.j : this.l), (i4 - i2) - this.m);
                this.a.v();
            }
        }
        if (this.g != null && this.o && TextUtils.isEmpty(this.a.f)) {
            setTitle(this.g.i);
        }
        k();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            i(getChildAt(i7)).b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        ow owVar = this.d;
        int d = owVar != null ? owVar.d() : 0;
        if (mode == 0 && d > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        Toolbar toolbar = this.g;
        if (toolbar != null) {
            View view = this.h;
            if (view == null || view == this) {
                setMinimumHeight(c(toolbar));
            } else {
                setMinimumHeight(c(view));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.a.k(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.a.l(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.a.n(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            od.i(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.a.j(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.m = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.l = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.j = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.k = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.a.m(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.a.d(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.a.o(typeface);
    }

    public void setMaxLines(int i) {
        this.a.x(i);
    }

    public void setScrimAnimationDuration(long j) {
        this.u = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.v != i) {
            this.v = i;
            k();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = false;
        if (od.ae(this) && !isInEditMode()) {
            z2 = true;
        }
        setScrimsShown(z, z2);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.b = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.b.setState(getDrawableState());
                }
                ks.d(this.b, od.s(this));
                this.b.setVisible(getVisibility() == 0, false);
                this.b.setCallback(this);
                this.b.setAlpha(this.r);
            }
            od.i(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        this.a.w(charSequence);
        d();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            d();
            b();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.b;
        if (drawable != null && drawable.isVisible() != z) {
            this.b.setVisible(z, false);
        }
        Drawable drawable2 = this.q;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.q.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.b;
    }

    public czvg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.a.c(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        if (this.s != z) {
            int i = 255;
            if (z2) {
                if (true != z) {
                    i = 0;
                }
                a();
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.t = valueAnimator2;
                    valueAnimator2.setDuration(this.u);
                    ValueAnimator valueAnimator3 = this.t;
                    if (i > this.r) {
                        timeInterpolator = czum.c;
                    } else {
                        timeInterpolator = czum.d;
                    }
                    valueAnimator3.setInterpolator(timeInterpolator);
                    this.t.addUpdateListener(new czvd(this));
                } else if (valueAnimator.isRunning()) {
                    this.t.cancel();
                }
                this.t.setIntValues(this.r, i);
                this.t.start();
            } else {
                if (true != z) {
                    i = 0;
                }
                j(i);
            }
            this.s = z;
        }
    }

    public czvg(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 2132018538), attributeSet, i);
        this.e = true;
        this.n = new Rect();
        this.v = -1;
        Context context2 = getContext();
        daaj daajVar = new daaj(this);
        this.a = daajVar;
        daajVar.a(czum.e);
        TypedArray a = daaz.a(context2, attributeSet, czvk.c, i, 2132018538, new int[0]);
        daajVar.j(a.getInt(3, 8388691));
        daajVar.k(a.getInt(0, 8388627));
        int dimensionPixelSize = a.getDimensionPixelSize(4, 0);
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        if (a.hasValue(7)) {
            this.j = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(6)) {
            this.l = a.getDimensionPixelSize(6, 0);
        }
        if (a.hasValue(8)) {
            this.k = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(5)) {
            this.m = a.getDimensionPixelSize(5, 0);
        }
        this.o = a.getBoolean(15, true);
        setTitle(a.getText(14));
        daajVar.m(2132018099);
        daajVar.l(com.google.android.filament.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (a.hasValue(9)) {
            daajVar.m(a.getResourceId(9, 0));
        }
        if (a.hasValue(1)) {
            daajVar.l(a.getResourceId(1, 0));
        }
        this.v = a.getDimensionPixelSize(12, -1);
        if (a.hasValue(10)) {
            daajVar.x(a.getInt(10, 1));
        }
        this.u = a.getInt(11, 600);
        setContentScrim(a.getDrawable(2));
        setStatusBarScrim(a.getDrawable(13));
        this.f = a.getResourceId(16, -1);
        a.recycle();
        setWillNotDraw(false);
        od.O(this, new czvc(this));
    }
}
