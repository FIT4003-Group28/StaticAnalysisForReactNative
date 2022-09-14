package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends aji<V> {
    public ViewPropertyAnimator a;
    private int b;
    private int c;

    public HideBottomViewOnScrollBehavior() {
        this.b = 0;
        this.c = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 2;
    }

    private final void s(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new czvo(this));
    }

    @Override // defpackage.aji
    public final boolean f(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.b = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // defpackage.aji
    public final void o(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.c == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.c = 1;
            s(v, this.b, 175L, czum.c);
        } else if (i >= 0 || this.c == 2) {
        } else {
            ViewPropertyAnimator viewPropertyAnimator2 = this.a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.c = 2;
            s(v, 0, 225L, czum.d);
        }
    }

    @Override // defpackage.aji
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2) {
        return i == 2;
    }
}
