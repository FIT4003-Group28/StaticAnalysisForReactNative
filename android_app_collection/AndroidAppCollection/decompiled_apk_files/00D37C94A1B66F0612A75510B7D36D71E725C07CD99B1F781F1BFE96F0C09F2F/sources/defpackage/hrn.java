package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hrn  reason: default package */
/* loaded from: classes3.dex */
public final class hrn implements Animator.AnimatorListener {
    final /* synthetic */ hro a;

    public hrn(hro hroVar) {
        this.a = hroVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hro hroVar = this.a;
        hroVar.ae.aG(hroVar);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
