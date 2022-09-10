package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aefq  reason: default package */
/* loaded from: classes2.dex */
public final class aefq extends AnimatorListenerAdapter {
    final /* synthetic */ aefv a;

    public aefq(aefv aefvVar) {
        this.a = aefvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aefv aefvVar = this.a;
        aefvVar.b = null;
        aefvVar.t(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Animator animator2 = this.a.b;
        if (animator2 != null) {
            animator2.cancel();
        }
        aefv aefvVar = this.a;
        aefvVar.b = animator;
        aefvVar.t(2);
    }
}
