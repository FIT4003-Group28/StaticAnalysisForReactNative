package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: dgm  reason: default package */
/* loaded from: classes6.dex */
final class dgm implements Animator.AnimatorListener {
    private boolean a;
    private boolean b;

    public final void a(Animator animator) {
        if (this.b) {
            animator.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
        this.b = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        this.b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a = false;
        this.b = false;
    }
}
