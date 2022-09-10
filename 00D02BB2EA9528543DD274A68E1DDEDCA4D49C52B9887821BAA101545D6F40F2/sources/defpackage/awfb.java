package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: awfb  reason: default package */
/* loaded from: classes3.dex */
final class awfb implements Animator.AnimatorListener {
    private final akpm a;
    private final int b;

    public awfb(akpm akpmVar, int i) {
        this.a = akpmVar;
        this.b = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ValueAnimator valueAnimator = (ValueAnimator) animator;
        akpm akpmVar = this.a;
        akyc t = akyt.t(this.b);
        t.c = valueAnimator.getInterpolator();
        t.b = (int) valueAnimator.getDuration();
        akpmVar.p(t);
    }
}
