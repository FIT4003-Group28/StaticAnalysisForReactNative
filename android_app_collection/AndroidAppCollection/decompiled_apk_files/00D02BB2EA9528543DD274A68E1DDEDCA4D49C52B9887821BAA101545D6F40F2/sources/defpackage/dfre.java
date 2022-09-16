package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: dfre  reason: default package */
/* loaded from: classes6.dex */
public final class dfre implements Animator.AnimatorListener {
    final /* synthetic */ dfrh a;

    public dfre(dfrh dfrhVar) {
        this.a = dfrhVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.l.cancel();
        this.a.l.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
