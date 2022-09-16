package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: alxp  reason: default package */
/* loaded from: classes.dex */
final class alxp extends AnimatorListenerAdapter {
    final /* synthetic */ alxt a;

    public alxp(alxt alxtVar) {
        this.a = alxtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alxt alxtVar = this.a;
        ViewGroup.LayoutParams layoutParams = alxtVar.b.getLayoutParams();
        int height = alxtVar.b.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(alxtVar.a);
        duration.addListener(new alxq(alxtVar, layoutParams, height));
        duration.addUpdateListener(new alxr(alxtVar, layoutParams));
        duration.start();
    }
}
