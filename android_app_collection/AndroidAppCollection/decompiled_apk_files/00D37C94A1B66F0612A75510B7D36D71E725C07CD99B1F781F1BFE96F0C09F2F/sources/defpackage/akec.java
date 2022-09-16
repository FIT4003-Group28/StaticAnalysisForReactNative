package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: akec  reason: default package */
/* loaded from: classes.dex */
final class akec implements Animator.AnimatorListener {
    final /* synthetic */ aked a;

    public akec(aked akedVar) {
        this.a = akedVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
