package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
/* compiled from: PG */
/* renamed from: nud  reason: default package */
/* loaded from: classes7.dex */
public final class nud extends CardView {
    private static final Interpolator n = irf.a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final View.OnGenericMotionListener F;
    private final View.OnFocusChangeListener G;
    private final Animator.AnimatorListener H;
    private final AnimatorListenerAdapter I;
    private final AnimatorListenerAdapter J;
    private final ValueAnimator.AnimatorUpdateListener K;
    private final ValueAnimator.AnimatorUpdateListener L;
    private final Property<View, Float> M;
    private final Property<CardView, Float> N;
    public final ImageView g;
    public final AnimatorSet h;
    public final AnimatorSet i;
    public boolean j;
    public boolean k;
    public boolean l;
    @dzsi
    public ntr m;
    private final FrameLayout o;
    private final FrameLayout p;
    private final ImageView q;
    private final ImageView r;
    private final View s;
    private final CardView t;
    private long u;
    private float v;
    @dzsi
    private ntq w;
    private int x;
    private int y;
    private int z;

    public nud(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.OnGenericMotionListener ntwVar = new ntw(this);
        this.F = ntwVar;
        View.OnFocusChangeListener ntxVar = new ntx(this);
        this.G = ntxVar;
        this.H = new nty(this);
        this.I = new ntz(this);
        this.J = new nua(this);
        this.K = new ValueAnimator.AnimatorUpdateListener(this) { // from class: nts
            private final nud a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nud nudVar = this.a;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nudVar.getLayoutParams();
                marginLayoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                nudVar.setLayoutParams(marginLayoutParams);
            }
        };
        this.L = new ValueAnimator.AnimatorUpdateListener(this) { // from class: ntt
            private final nud a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup viewGroup = (ViewGroup) this.a.getParent();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup.setLayoutParams(marginLayoutParams);
            }
        };
        this.M = new nub(Float.class);
        this.N = new nuc(Float.class);
        FrameLayout frameLayout = new FrameLayout(context, attributeSet);
        this.o = frameLayout;
        frameLayout.setOnClickListener(new ntu(this));
        frameLayout.setOnFocusChangeListener(ntxVar);
        ImageView imageView = new ImageView(context, attributeSet);
        this.g = imageView;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context, attributeSet);
        this.p = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        ImageView imageView2 = new ImageView(context, attributeSet);
        this.q = imageView2;
        ImageView imageView3 = new ImageView(context, attributeSet);
        this.r = imageView3;
        View view = new View(context, attributeSet);
        this.s = view;
        CardView cardView = new CardView(context, attributeSet);
        this.t = cardView;
        this.h = new AnimatorSet();
        this.i = new AnimatorSet();
        super.addView(frameLayout);
        frameLayout.addView(imageView);
        frameLayout.addView(frameLayout2);
        frameLayout2.addView(imageView2);
        frameLayout2.addView(imageView3);
        frameLayout2.addView(view);
        frameLayout2.addView(cardView);
        frameLayout.setOnGenericMotionListener(ntwVar);
    }

    private final void m() {
        if (!this.k) {
            return;
        }
        int i = this.B;
        int i2 = this.x;
        this.t.animate().translationY((((-this.v) * (i - (i2 + i2))) - this.x) + (this.z / 2)).setDuration(500L).setInterpolator(n);
    }

    public final void h() {
        this.o.setOnGenericMotionListener(null);
    }

    public final void i() {
        View findViewById = getRootView().findViewById(this.A);
        if (findViewById == null || !findViewById.isLaidOut()) {
            if (this.j) {
                return;
            }
            this.j = true;
            if (findViewById == null) {
                findViewById = this;
            }
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ntv(this, findViewById));
            return;
        }
        dbsk.b(findViewById.isLaidOut(), "Zoom widget container has not been laid out.");
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int i = iArr[1];
        int height = findViewById.getHeight();
        int paddingTop = findViewById.getPaddingTop() + i;
        int paddingBottom = (i + height) - findViewById.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            paddingTop += marginLayoutParams.topMargin;
            paddingBottom -= marginLayoutParams.bottomMargin;
        }
        getLocationOnScreen(iArr);
        this.B = paddingBottom - paddingTop;
        this.D = (findViewById.getHeight() / 2) - (this.x / 2);
        dbsk.l(this.A != 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, (Property<ImageView, Float>) this.M, 0.0f);
        long j = this.u;
        ofFloat.setDuration((j + j) / 3);
        ofFloat.addListener(this.J);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.p, (Property<FrameLayout, Float>) this.M, 0.0f, 1.0f);
        ofFloat2.setDuration(this.u);
        ValueAnimator ofInt = ValueAnimator.ofInt(this.x, this.B);
        ofInt.addUpdateListener(this.K);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(this.E, this.D);
        ofInt2.addUpdateListener(this.L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2, ObjectAnimator.ofFloat(this, (Property<nud, Float>) this.N, this.C));
        animatorSet.setDuration(this.u);
        this.h.playTogether(ofFloat, ofFloat2, animatorSet);
        this.h.addListener(this.H);
        AnimatorSet animatorSet2 = this.h;
        Interpolator interpolator = n;
        animatorSet2.setInterpolator(interpolator);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(this.B, this.x);
        ofInt3.addUpdateListener(this.K);
        ValueAnimator ofInt4 = ValueAnimator.ofInt(this.D, this.E);
        ofInt4.addUpdateListener(this.L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ofInt3, ofInt4, ObjectAnimator.ofFloat(this, (Property<nud, Float>) this.N, this.y));
        animatorSet3.setDuration(this.u);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.p, (Property<FrameLayout, Float>) this.M, 1.0f, 0.0f);
        ofFloat3.setDuration(this.u);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.g, (Property<ImageView, Float>) this.M, 1.0f);
        long j2 = this.u;
        ofFloat4.setDuration((j2 + j2) / 3);
        ofFloat4.setStartDelay(this.u / 3);
        ofFloat4.addListener(this.I);
        this.i.playTogether(animatorSet3, ofFloat3, ofFloat4);
        this.i.addListener(this.H);
        this.i.setInterpolator(interpolator);
        this.j = false;
    }

    public final void j(float f) {
        this.v = f;
        m();
    }

    public final void k(boolean z) {
        if (z) {
            m();
            this.h.start();
            return;
        }
        this.i.start();
        this.t.animate().translationY(0.0f).setDuration(this.u).setInterpolator(n);
    }

    public void setActive(boolean z) {
        if (this.k == z) {
            return;
        }
        if (this.l && !hasFocus() && z) {
            return;
        }
        this.k = z;
        ntq ntqVar = this.w;
        if (ntqVar != null) {
            ntqVar.a(z);
        }
        if (this.h.isRunning() || this.i.isRunning()) {
            return;
        }
        k(z);
    }

    public void setAnimationDuration(long j) {
        this.u = j;
        i();
    }

    public void setBaseColor(int i) {
        setCardBackgroundColor(i);
        this.t.setCardBackgroundColor(i);
    }

    public void setButtonIcon(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        this.g.setScaleType(ImageView.ScaleType.CENTER);
    }

    public void setButtonSize(int i) {
        this.x = i;
        this.y = (int) e();
        this.C = i / 2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            layoutParams.width = i;
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(i, i));
        }
        this.q.setLayoutParams(new FrameLayout.LayoutParams(i, i, 49));
        this.r.setLayoutParams(new FrameLayout.LayoutParams(i, i, 81));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (getResources().getDisplayMetrics().density + 0.5f), -1, 1);
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = i;
        this.s.setLayoutParams(layoutParams2);
        setThumbSize(this.z);
    }

    public void setCardBackground(Drawable drawable) {
        this.o.setBackgroundDrawable(drawable);
    }

    public void setContainerId(int i) {
        this.A = i;
        i();
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        this.o.setFocusable(z);
    }

    public void setMustBeFocusedToBeActive(boolean z) {
        this.l = z;
        if (hasFocus() || !z) {
            return;
        }
        setActive(false);
    }

    public void setOnActiveStateChangedListener(@dzsi ntq ntqVar) {
        this.w = ntqVar;
    }

    public void setThumbSize(int i) {
        this.z = i;
        this.t.setLayoutParams(new FrameLayout.LayoutParams(i, i, 81));
        this.t.setRadius(i / 2);
    }

    public void setTrackColor(int i) {
        this.s.setBackgroundColor(i);
    }

    public void setZoomHandler(@dzsi ntr ntrVar) {
        this.m = ntrVar;
    }

    public void setZoomInIcon(Drawable drawable) {
        this.q.setImageDrawable(drawable);
        this.q.setScaleType(ImageView.ScaleType.CENTER);
    }

    public void setZoomOutIcon(Drawable drawable) {
        this.r.setImageDrawable(drawable);
        this.r.setScaleType(ImageView.ScaleType.CENTER);
    }

    public void setZoomWidgetCollapsedTopMargin(int i) {
        this.E = i;
    }
}
