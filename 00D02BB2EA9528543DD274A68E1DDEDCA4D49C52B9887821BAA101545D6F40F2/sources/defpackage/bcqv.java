package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: bcqv  reason: default package */
/* loaded from: classes3.dex */
final class bcqv implements Animator.AnimatorListener {
    final /* synthetic */ bcqw a;

    public bcqv(bcqw bcqwVar) {
        this.a = bcqwVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.aT();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.aT();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
