package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
/* compiled from: PG */
/* renamed from: cxqu  reason: default package */
/* loaded from: classes5.dex */
final class cxqu extends AnimatorListenerAdapter {
    final /* synthetic */ AnimatorSet a;
    private boolean b = false;

    public cxqu(AnimatorSet animatorSet) {
        this.a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.b) {
            this.a.start();
        }
    }
}
