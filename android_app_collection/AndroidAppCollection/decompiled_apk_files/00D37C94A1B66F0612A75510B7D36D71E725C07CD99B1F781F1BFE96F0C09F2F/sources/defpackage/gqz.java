package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: gqz  reason: default package */
/* loaded from: classes3.dex */
public final class gqz implements Animator.AnimatorListener {
    final /* synthetic */ gra a;

    public gqz(gra graVar) {
        this.a = graVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.a = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gra graVar = this.a;
        graVar.a = 0;
        graVar.b = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
