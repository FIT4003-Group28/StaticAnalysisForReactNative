package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ExpandableDialogView extends ViewGroup implements no {
    public static final /* synthetic */ int j = 0;
    private static final boolean k = true;
    private final Paint A;
    private final RectF B;
    private final ObjectAnimator C;
    private final ObjectAnimator D;
    private final int E;
    private final czyv F;
    private final Paint G;
    private final int H;
    private final boolean I;
    private final boolean J;
    private OverScrollControlledNestedScrollView K;
    private View L;
    private View M;
    private boolean N;
    private Configuration O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    public final Rect a;
    private Runnable aa;
    private int ab;
    public final int b;
    public final RectF c;
    public View d;
    public final dadr e;
    public final float f;
    public float g;
    public int h;
    public Window i;
    private final np m;
    private final Rect n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private float u;
    private boolean v;
    private boolean w;
    private int x;
    private final Paint y;
    private final Paint z;
    private static final TimeInterpolator l = new aon();
    private static final Property<ExpandableDialogView, Integer> ac = new cwpm(Integer.class);
    private static final Property<ExpandableDialogView, RectF> ad = new cwpn(RectF.class);
    private static final Property<View, Integer> ae = new cwpo(Integer.class);

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class State implements Parcelable {
        public abstract boolean a();

        public abstract Parcelable b();
    }

    public ExpandableDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new np();
        this.n = new Rect();
        this.a = new Rect();
        Paint paint = new Paint(1);
        this.y = paint;
        Paint paint2 = new Paint(1);
        this.z = paint2;
        Paint paint3 = new Paint(1);
        this.A = paint3;
        this.B = new RectF();
        RectF rectF = new RectF();
        this.c = rectF;
        Paint paint4 = new Paint(1);
        this.G = paint4;
        this.F = new czyv(context);
        this.o = getResources().getDimensionPixelSize(R.dimen.og_dialog_margin_horizontal);
        this.q = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_margin_bottom);
        this.r = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_width);
        this.s = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_max_height);
        this.t = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_min_scroll);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.og_dialog_corner_radius);
        this.b = dimensionPixelSize;
        this.f = getResources().getDimensionPixelSize(R.dimen.og_dialog_header_elevation);
        setWillNotDraw(false);
        paint4.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cwqm.a, R.attr.ogPopoverStyle, 2132017755);
        try {
            int color = obtainStyledAttributes.getColor(0, akm.c(context, R.color.og_background_light));
            this.E = color;
            int color2 = obtainStyledAttributes.getColor(2, akm.c(context, R.color.og_account_menu_divider_color_light));
            this.H = color2;
            this.I = obtainStyledAttributes.getBoolean(4, false);
            this.J = obtainStyledAttributes.getBoolean(1, false);
            this.p = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.og_dialog_default_margin_top));
            obtainStyledAttributes.recycle();
            paint3.setColor(color);
            if (Build.VERSION.SDK_INT >= 26) {
                paint.setColor(kc.f(color, Math.round(204.0f)));
            } else {
                paint.setColor(akm.c(context, R.color.google_scrim));
            }
            paint2.setColor(color2);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, ac, 0);
            this.D = ofInt;
            ofInt.setDuration(150L);
            ofInt.setInterpolator(new aoo());
            ofInt.addListener(new cwpj(this));
            dadr O = dadr.O(getContext(), 0.0f);
            this.e = O;
            dadw a = dadx.a();
            a.j(dimensionPixelSize);
            a.k(dimensionPixelSize);
            O.setShapeAppearanceModel(a.b());
            ObjectAnimator ofObject = ObjectAnimator.ofObject(this, (Property<ExpandableDialogView, V>) ad, (TypeEvaluator) new cwqn(new RectF()), (Object[]) new RectF[]{rectF});
            this.C = ofObject;
            ofObject.setDuration(300L);
            ofObject.setInterpolator(new aoo());
            ofObject.addListener(new cwpk(this));
            if (k) {
                setClipToOutline(true);
                setOutlineProvider(new cwpl(this));
                setClipChildren(false);
            }
            n(getResources().getConfiguration());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void n(Configuration configuration) {
        boolean z = true;
        this.P = configuration.smallestScreenWidthDp >= 600;
        if (configuration.orientation != 2) {
            z = false;
        }
        this.Q = z;
        this.R = cwjd.a(getContext());
        requestLayout();
    }

    private final void o(float f) {
        this.u = f;
        q();
    }

    private final boolean p() {
        return (this.Q || this.R) && !this.P;
    }

    private final void q() {
        if (this.K != null) {
            boolean z = true;
            if (!i() && !this.P) {
                z = false;
            }
            this.K.a = z;
        }
    }

    private final void r(int i) {
        int height = this.a.height();
        if (this.P) {
            this.a.top = this.x + this.n.top;
            this.a.left = ((((i - this.n.left) - this.n.right) - this.r) / 2) + this.n.left;
            Rect rect = this.a;
            rect.right = rect.left + this.r;
            Rect rect2 = this.a;
            rect2.bottom = rect2.top + height;
            this.B.set(this.a);
            return;
        }
        int round = Math.round(this.o * (1.0f - j()));
        this.a.top = this.n.top + (i() ? 0 : this.x - this.h);
        this.a.left = this.n.left + round;
        this.a.right = (i - this.n.right) - round;
        if (this.v || p()) {
            Rect rect3 = this.a;
            rect3.bottom = rect3.top + height;
        } else if (this.h <= 0) {
            Rect rect4 = this.a;
            rect4.bottom = rect4.top + this.d.getMeasuredHeight() + this.T;
        } else {
            int measuredHeight = this.n.top + this.x + this.d.getMeasuredHeight() + this.T;
            this.a.bottom = measuredHeight + Math.round((this.S - measuredHeight) * j());
        }
        if (i()) {
            this.B.set(0.0f, 0.0f, i, this.S);
        } else {
            this.B.set(this.a.left, this.a.top - (l.getInterpolation(Math.max(0.0f, (j() - 0.6f) / 0.39999998f)) * this.n.top), this.a.right, this.a.bottom);
        }
    }

    private final boolean s() {
        int i = this.h;
        return i < -290 || i <= this.W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(float f) {
        this.M.setTranslationY(f);
        this.L.setTranslationY(f);
    }

    @Override // defpackage.nn
    public final boolean a(View view, View view2, int i, int i2) {
        if (s()) {
            return false;
        }
        this.D.cancel();
        if (this.P || p()) {
            return false;
        }
        if (i2 == 1) {
            this.N = true;
        }
        this.w = i();
        return true;
    }

    @Override // defpackage.nn
    public final void b(View view, View view2, int i, int i2) {
        this.m.b(i, i2);
    }

    @Override // defpackage.nn
    public final void c(View view, int i) {
        this.m.c(i);
        if (i == 1) {
            this.N = false;
        }
        if (this.N || i()) {
            return;
        }
        if (s()) {
            this.D.setIntValues(this.V);
            ObjectAnimator objectAnimator = this.D;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(50L);
            animatorSet.setInterpolator(new AccelerateInterpolator());
            if (this.i != null) {
                int c = akm.c(getContext(), R.color.google_scrim);
                animatorSet.playTogether(objectAnimator, ObjectAnimator.ofObject(this.i.getDecorView(), (Property<View, V>) ae, (TypeEvaluator) new czuo(), (Object[]) new Integer[]{Integer.valueOf(c), Integer.valueOf(kc.f(c, 0))}));
            } else {
                animatorSet.playTogether(objectAnimator);
            }
            animatorSet.start();
            return;
        }
        if (this.h >= 145) {
            this.D.setIntValues(this.x);
        } else {
            this.D.setIntValues(0);
        }
        this.D.start();
    }

    @Override // defpackage.nn
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipRect(this.a.left, this.a.top, this.a.right, this.c.bottom);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        if (Build.VERSION.SDK_INT < 23) {
            onDrawForeground(canvas);
        }
    }

    @Override // defpackage.nn
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (i2 <= 0 || (i4 = this.h) >= (i5 = this.x)) {
            return;
        }
        if (!this.v && !this.w) {
            i5 = 0;
        }
        int min = Math.min(i2, i5 - i4);
        iArr[1] = min;
        g(this.h + min);
    }

    @Override // defpackage.no
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            if (i5 != 0 && this.h >= this.x) {
                return;
            }
            int max = Math.max(i4 + this.h, this.W);
            iArr[1] = max - this.h;
            g(max);
        }
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        this.n.set(rect);
        return true;
    }

    public final void g(int i) {
        if (this.h == i) {
            return;
        }
        o(Math.max(0.0f, i / this.x));
        this.K.offsetTopAndBottom(this.h - i);
        this.h = i;
        this.C.cancel();
        r(getWidth());
        if (!this.v) {
            h(this.B);
        }
        this.c.set(this.B);
        k();
        invalidate();
        if (k) {
            invalidateOutline();
        }
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        this.d.layout(this.a.left, this.a.top, this.a.right, this.a.top + this.d.getMeasuredHeight());
        if (!this.I) {
            this.K.layout(this.a.left, this.d.getBottom(), this.a.right, this.a.bottom);
        }
        if (i > this.V) {
            return;
        }
        this.aa.run();
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.m.a();
    }

    public final void h(RectF rectF) {
        this.c.set(rectF);
        t((rectF.bottom - this.K.getTop()) - this.U);
        k();
        invalidate();
        if (k) {
            invalidateOutline();
        }
    }

    final boolean i() {
        return j() == 1.0f;
    }

    public final float j() {
        if (this.P) {
            return 0.0f;
        }
        if (!p()) {
            return this.u;
        }
        return 1.0f;
    }

    public final void k() {
        Window window;
        boolean l2 = l();
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.c.top < this.n.top / 2.0f) {
                setSystemUiVisibility(getSystemUiVisibility() & (-8193));
                if (!l2) {
                    setSystemUiVisibility(getSystemUiVisibility() | 8192);
                }
            } else {
                setSystemUiVisibility(getSystemUiVisibility() & (-8193));
            }
        }
        float f = this.c.bottom;
        float height = getHeight() - this.n.bottom;
        int i = 0;
        if (this.Q || f < height) {
            this.i.setNavigationBarColor(0);
        } else {
            this.i.setNavigationBarColor(this.ab);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.Q && !this.P) {
                return;
            }
            if (f < height) {
                setSystemUiVisibility(getSystemUiVisibility() & (-17));
            } else if (Build.VERSION.SDK_INT > 26 && Build.VERSION.SDK_INT < 29 && !l2) {
                setSystemUiVisibility(getSystemUiVisibility() | 16);
            }
            if (Build.VERSION.SDK_INT < 28 || (window = this.i) == null) {
                return;
            }
            if (f >= height) {
                i = this.H;
            }
            window.setNavigationBarDividerColor(i);
        }
    }

    public final boolean l() {
        Configuration configuration = this.O;
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.n.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 26) {
            post(new Runnable(this) { // from class: cwpi
                private final ExpandableDialogView a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ExpandableDialogView expandableDialogView = this.a;
                    expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() & (-17));
                    if (!expandableDialogView.l()) {
                        expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() | 16);
                    }
                    expandableDialogView.k();
                }
            });
        }
        this.ab = Build.VERSION.SDK_INT < 29 ? this.i.getNavigationBarColor() : 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n(configuration);
        q();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float j2 = this.b * (1.0f - j());
        canvas.drawRoundRect(this.c, j2, j2, this.A);
        dadr dadrVar = this.e;
        dadw a = dadx.a();
        a.j(j2);
        a.k(j2);
        dadrVar.setShapeAppearanceModel(a.b());
        if (i()) {
            float G = od.G(this.d);
            this.G.setColor(G == 0.0f ? this.E : this.F.a(this.E, G + dabd.c(this)));
            canvas.drawRect(this.n.left, -this.n.top, this.c.right - this.n.right, this.d.getTop(), this.G);
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        float j2 = this.b * (1.0f - j());
        canvas.save();
        canvas.clipRect(0, getHeight() - this.n.bottom, getWidth(), getHeight());
        canvas.drawRoundRect(this.c, j2, j2, this.y);
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.drawRect(0.0f, getHeight() - this.n.bottom, getWidth(), (getHeight() - this.n.bottom) + 1, this.z);
        }
        canvas.restore();
        if (Build.VERSION.SDK_INT >= 26 && i()) {
            if (this.n.left > 0) {
                canvas.drawRect(this.n.left - 1, 0.0f, this.n.left, getHeight(), this.z);
            }
            if (this.n.right > 0) {
                canvas.drawRect(getWidth() - this.n.right, 0.0f, (getWidth() - this.n.right) + 1, getHeight(), this.z);
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), this.n.top);
            canvas.drawRoundRect(this.c, j2, j2, this.y);
            canvas.restore();
        }
        if (Build.VERSION.SDK_INT >= 26 || !i()) {
            return;
        }
        if (this.n.left > 0) {
            canvas.drawRect(-this.n.left, 0.0f, this.n.left, getHeight(), this.y);
        }
        if (this.n.right <= 0) {
            return;
        }
        canvas.drawRect(getWidth() - this.n.right, 0.0f, getWidth() + this.n.right, getHeight(), this.y);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        this.d = childAt;
        od.U(childAt, this.e);
        if (k) {
            this.d.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        this.K = (OverScrollControlledNestedScrollView) findViewById(R.id.og_container_scroll_view);
        this.L = findViewById(R.id.og_container_footer_divider);
        this.M = findViewById(R.id.og_container_footer);
        this.L.setBackgroundColor(this.H);
        findViewById(R.id.og_container_disable_content_view).setBackgroundColor(this.E);
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        this.d.layout(this.a.left, this.a.top, this.a.right, this.a.top + this.d.getMeasuredHeight());
        if (this.P || !this.I) {
            rect = this.a;
        } else {
            rect = this.n;
        }
        int i5 = rect.left;
        this.K.layout(i5, this.d.getBottom(), this.K.getMeasuredWidth() + i5, this.a.bottom);
        if (this.h == 0) {
            this.K.setScrollY(0);
        }
        k();
        if (getResources().getConfiguration().equals(this.O)) {
            if (this.c.equals(this.B)) {
                return;
            }
            this.C.setObjectValues(this.B);
            this.C.start();
            return;
        }
        this.O = getResources().getConfiguration();
        this.c.set(this.B);
        if (!k) {
            return;
        }
        invalidateOutline();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int min;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        r(size);
        int i3 = (size2 - this.n.top) - this.n.bottom;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        int measuredHeight = this.d.getMeasuredHeight();
        int width = (this.P || !this.I) ? this.a.width() : (size - this.n.left) - this.n.right;
        int i4 = i3 - measuredHeight;
        boolean z = this.P;
        int i5 = z ? (i4 - this.p) - this.q : i4 - this.p;
        boolean z2 = false;
        int i6 = z ? this.t : 0;
        this.S = size2 - this.n.bottom;
        this.K.findViewById(R.id.og_container_scroll_root).setMinimumHeight(0);
        this.K.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.T = this.K.getMeasuredHeight();
        if (this.K.getMeasuredHeight() - i5 >= i6) {
            z2 = true;
        }
        this.v = z2;
        if (i() || (!this.P && this.v && this.K.getMeasuredHeight() < i4)) {
            this.K.findViewById(R.id.og_container_scroll_root).setMinimumHeight(i4);
            this.K.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        if (i() || this.v) {
            min = this.P ? Math.min(this.s - measuredHeight, i5) : i4;
        } else {
            min = this.K.getMeasuredHeight();
            o(0.0f);
        }
        if (!this.J || i() || this.P) {
            this.x = this.p;
        } else {
            this.x = Math.max(this.p, (i4 - min) / 2);
        }
        int i7 = -size2;
        this.V = this.n.top + i7 + this.x;
        this.W = (i7 / 2) + this.n.top + this.x;
        Rect rect = this.a;
        rect.bottom = rect.top + min + measuredHeight;
        this.B.bottom = i() ? this.S : this.a.bottom;
        this.U = this.K.findViewById(R.id.og_container_scroll_root).getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h < this.x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.m.d(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        State state = (State) parcelable;
        super.onRestoreInstanceState(state.b());
        o(true != state.a() ? 0.0f : 1.0f);
        this.h = Math.round(this.u * this.x);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        cwpc cwpcVar = new cwpc();
        cwpcVar.a = Boolean.valueOf(this.u == 1.0f);
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            cwpcVar.b = onSaveInstanceState;
            String str = cwpcVar.a == null ? " isPortraitInFullScreen" : "";
            if (cwpcVar.b == null) {
                str = str.concat(" parentState");
            }
            if (str.isEmpty()) {
                return new AutoValue_ExpandableDialogView_State(cwpcVar.a.booleanValue(), cwpcVar.b);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null parentState");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.m.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.contains(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
    }

    public void setDismissRunnable(Runnable runnable) {
        this.aa = runnable;
    }

    public void setIsExperimental(boolean z) {
    }
}
