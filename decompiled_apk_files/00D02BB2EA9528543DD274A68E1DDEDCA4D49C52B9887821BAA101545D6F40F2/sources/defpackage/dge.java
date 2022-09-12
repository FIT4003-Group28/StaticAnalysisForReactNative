package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: dge  reason: default package */
/* loaded from: classes6.dex */
final class dge implements Animator.AnimatorListener {
    final /* synthetic */ dgs a;

    public dge(dgs dgsVar) {
        this.a = dgsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dgs dgsVar = this.a;
        if (!dgsVar.i) {
            return;
        }
        dgsVar.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
