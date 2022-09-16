package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class BottomUiContainer extends FrameLayout {
    public fub a;
    public Snackbar b;
    public Mealbar c;
    public View d;
    public View e;
    public Animator f;
    public amk g;
    public anf h;
    public int i;
    public boolean j;
    public int k;
    public final Object l;
    public ftr m;
    private HatsContainer n;
    private Runnable o;
    private boolean p;
    private int q;
    private ftp r;

    public BottomUiContainer(Context context) {
        super(context);
        this.i = 0;
        this.j = false;
        this.k = 0;
        this.l = new Object();
        t();
    }

    public static ftr m(akev akevVar, Object obj) {
        return new ftr(akevVar, obj);
    }

    private static int q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    private final void r(Animator animator) {
        if (this.p) {
            animator.start();
        } else {
            animator.end();
        }
    }

    private final void s(Animator animator, final View view) {
        final int q = q(view.getLayoutParams());
        animator.addListener(new ftx(this, view, q));
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ftm
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomUiContainer bottomUiContainer = BottomUiContainer.this;
                    bottomUiContainer.j(bottomUiContainer.c(view, q));
                }
            });
        }
    }

    private final void t() {
        this.q = getVisibility();
        this.p = true;
    }

    public final float a(View view, int i) {
        return 1.0f - ((i - this.i) / view.getHeight());
    }

    public final int b(View view) {
        return c(view, q(view.getLayoutParams()));
    }

    public final int c(View view, int i) {
        int height = view.getHeight();
        float top = height - ((view.getTop() - this.i) + view.getTranslationY());
        return akf.c((int) (top + (i * akf.d(top / Math.min(height, 1)))), 0, height + i);
    }

    public final View d(int i) {
        return e(getContext(), i);
    }

    public final View e(Context context, int i) {
        return LayoutInflater.from(context).inflate(i, (ViewGroup) this, false);
    }

    public final anf f(View view, float f) {
        anf anfVar = new anf(new ane());
        ang angVar = new ang(0.0f);
        angVar.c();
        angVar.e(1500.0f);
        anfVar.n = angVar;
        anfVar.h(view.getTop());
        anfVar.g = f;
        anfVar.g(new fto(this, view, 1));
        anfVar.g(new fto(this, view));
        return anfVar;
    }

    public final HatsContainer g() {
        if (this.n == null) {
            this.n = (HatsContainer) d(R.layout.hats_survey_container);
        }
        return this.n;
    }

    public final void h(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", view.getHeight(), 0.0f));
        ofPropertyValuesHolder.addListener(new fty(view));
        s(ofPropertyValuesHolder, view);
        r(ofPropertyValuesHolder);
        ftr ftrVar = this.m;
        if (ftrVar != null) {
            ftrVar.b();
        }
    }

    public final void i(int i) {
        View view = this.d;
        if (view == null || view == this.e) {
            return;
        }
        if (i == 2) {
            synchronized (this.l) {
                if (this.k == 1) {
                    this.k = 2;
                    return;
                } else {
                    this.k = 0;
                    i = 2;
                }
            }
        }
        amk amkVar = this.g;
        if (amkVar != null) {
            amkVar.d();
        }
        ftr ftrVar = this.m;
        if (ftrVar != null) {
            ftrVar.a(i);
        }
        anf anfVar = this.h;
        if (anfVar != null) {
            anfVar.j();
        }
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
        View view2 = this.d;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", 0.0f, view2.getHeight()));
        ofPropertyValuesHolder.addListener(new ftz(view2));
        s(ofPropertyValuesHolder, view2);
        this.f = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addListener(new ftw(this));
        r(this.f);
    }

    public final void j(int i) {
        fub fubVar = this.a;
        if (fubVar != null) {
            oie oieVar = (oie) fubVar;
            oieVar.R.s(1, -i);
            oieVar.p.h(1, i);
        }
    }

    public final void k(float f) {
        View view = this.d;
        if (view == null || view == this.e) {
            return;
        }
        anf anfVar = this.h;
        if (anfVar != null) {
            anfVar.j();
        }
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
        anf f2 = f(this.d, f);
        f2.f(new ftn(this, 1));
        this.h = f2;
        f2.i(this.i);
    }

    public final void l(boolean z) {
        this.p = z;
        setVisibility(this.q);
    }

    public final void n(View view, ftr ftrVar) {
        removeAllViews();
        this.d = view;
        this.m = ftrVar;
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
            this.f = null;
        }
        anf anfVar = this.h;
        if (anfVar != null) {
            anfVar.j();
            this.h = null;
        }
        if (view != null) {
            addView(view);
            if (view.getLayoutDirection() != getLayoutDirection()) {
                view.setLayoutDirection(getLayoutDirection());
            }
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    public final void o(fue fueVar, fuf fufVar, ftr ftrVar) {
        i(4);
        Animator animator = this.f;
        if (animator == null) {
            p(fueVar, fufVar, ftrVar);
        } else {
            animator.addListener(new fts(this, fueVar, fufVar, ftrVar));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = amk.c(this, 1.0f, new fuc(this));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.o == null) {
            this.o = new Runnable() { // from class: ftq
                @Override // java.lang.Runnable
                public final void run() {
                    BottomUiContainer bottomUiContainer = BottomUiContainer.this;
                    View view = bottomUiContainer.d;
                    if (view == null) {
                        return;
                    }
                    bottomUiContainer.j(bottomUiContainer.b(view));
                }
            };
        }
        Handler handler = getHandler();
        if (handler == null) {
            return;
        }
        handler.post(this.o);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d != null) {
            return this.g.k(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.d;
        if (view != null) {
            this.i = view.getTop();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.g.f(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            return (action == 1 || action == 3) ? false : true;
        }
        View view = this.d;
        return view != null && this.g.i(view, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void p(fue fueVar, fuf fufVar, ftr ftrVar) {
        if (this.r == null) {
            this.r = new ftp(this);
        }
        View a = fufVar.a(fueVar, this.r);
        a.setClickable(true);
        a.setAccessibilityDelegate(new ftu(this));
        n(a, ftrVar);
        if (a.getHeight() == 0) {
            a.addOnLayoutChangeListener(new ftv(this));
            a.setVisibility(0);
            return;
        }
        h(a);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.q = i;
        if (true != this.p) {
            i = 8;
        }
        super.setVisibility(i);
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.j = false;
        this.k = 0;
        this.l = new Object();
        t();
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.j = false;
        this.k = 0;
        this.l = new Object();
        t();
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = 0;
        this.j = false;
        this.k = 0;
        this.l = new Object();
        t();
    }
}
