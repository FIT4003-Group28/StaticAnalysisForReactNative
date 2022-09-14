package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f7888a;

    /* renamed from: b  reason: collision with root package name */
    private int f7889b;

    /* renamed from: c  reason: collision with root package name */
    private int f7890c;

    /* renamed from: d  reason: collision with root package name */
    private ViewPropertyAnimator f7891d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f7891d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f7888a = 0;
        this.f7889b = 2;
        this.f7890c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7888a = 0;
        this.f7889b = 2;
        this.f7890c = 0;
    }

    private void a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f7891d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    public void a(V v) {
        if (this.f7889b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7891d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f7889b = 1;
        a((HideBottomViewOnScrollBehavior<V>) v, this.f7888a + this.f7890c, 175L, c.e.a.c.l.a.f4735c);
    }

    public void a(V v, int i) {
        this.f7890c = i;
        if (this.f7889b == 1) {
            v.setTranslationY(this.f7888a + this.f7890c);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            a((HideBottomViewOnScrollBehavior<V>) v);
        } else if (i2 >= 0) {
        } else {
            b(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f7888a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.a(coordinatorLayout, (CoordinatorLayout) v, i);
    }

    public void b(V v) {
        if (this.f7889b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7891d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f7889b = 2;
        a((HideBottomViewOnScrollBehavior<V>) v, 0, 225L, c.e.a.c.l.a.f4736d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
