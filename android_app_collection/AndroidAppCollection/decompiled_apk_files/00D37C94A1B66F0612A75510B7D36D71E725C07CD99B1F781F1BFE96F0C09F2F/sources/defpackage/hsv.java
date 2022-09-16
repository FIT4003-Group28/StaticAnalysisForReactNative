package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: hsv  reason: default package */
/* loaded from: classes3.dex */
final class hsv implements Animator.AnimatorListener {
    final /* synthetic */ hsy a;

    public hsv(hsy hsyVar) {
        this.a = hsyVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hsy hsyVar = this.a;
        hsyVar.aL(hsyVar.ay);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
