package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: idf  reason: default package */
/* loaded from: classes3.dex */
public final class idf implements Animator.AnimatorListener {
    final /* synthetic */ idj a;

    public idf(idj idjVar) {
        this.a = idjVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        hqs.c(this.a.m, false);
        hqs.c(this.a.n, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationCancel(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
