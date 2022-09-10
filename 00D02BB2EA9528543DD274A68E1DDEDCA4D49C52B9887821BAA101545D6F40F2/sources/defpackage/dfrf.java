package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfrf  reason: default package */
/* loaded from: classes6.dex */
public final class dfrf implements Animator.AnimatorListener {
    final /* synthetic */ dfrh a;

    public dfrf(dfrh dfrhVar) {
        this.a = dfrhVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.l.cancel();
        this.a.c();
        this.a.j();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
