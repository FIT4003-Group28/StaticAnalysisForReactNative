package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: czzf  reason: default package */
/* loaded from: classes5.dex */
public final class czzf extends AnimatorListenerAdapter {
    final /* synthetic */ daad a;
    private boolean b;

    public czzf(daad daadVar) {
        this.a = daadVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
        this.a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d();
        if (!this.b) {
            this.a.k();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.c(animator);
        this.b = false;
    }
}
