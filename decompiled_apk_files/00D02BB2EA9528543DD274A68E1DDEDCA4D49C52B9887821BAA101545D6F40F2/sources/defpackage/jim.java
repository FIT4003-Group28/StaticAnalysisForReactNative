package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.FocusFinder;
import android.view.View;
/* compiled from: PG */
/* renamed from: jim  reason: default package */
/* loaded from: classes7.dex */
final class jim extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ jin a;

    public jim(jin jinVar) {
        this.a = jinVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (cpv.a.e(this.a.getContext())) {
            jin jinVar = this.a;
            View findNearestTouchable = FocusFinder.getInstance().findNearestTouchable(jinVar, jinVar.getWidth() / 2, 0, 130, new int[2]);
            if (findNearestTouchable != null) {
                cpv.a.c(findNearestTouchable, 8);
            }
        }
        jin jinVar2 = this.a;
        jinVar2.a = -1;
        jinVar2.requestLayout();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.requestLayout();
    }
}
