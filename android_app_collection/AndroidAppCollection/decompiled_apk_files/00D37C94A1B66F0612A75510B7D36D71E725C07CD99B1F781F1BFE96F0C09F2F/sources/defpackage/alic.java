package defpackage;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: alic  reason: default package */
/* loaded from: classes.dex */
public final class alic implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ CoordinatorLayout a;
    final /* synthetic */ AppBarLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public alic(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.B(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
