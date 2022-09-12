package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: bbzx  reason: default package */
/* loaded from: classes3.dex */
final class bbzx implements Animator.AnimatorListener {
    final /* synthetic */ bcab a;

    public bbzx(bcab bcabVar) {
        this.a = bcabVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable = this.a.g;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
