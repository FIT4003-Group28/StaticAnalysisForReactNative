package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: str  reason: default package */
/* loaded from: classes4.dex */
final class str implements Animator.AnimatorListener {
    private final Runnable a;

    public str(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
