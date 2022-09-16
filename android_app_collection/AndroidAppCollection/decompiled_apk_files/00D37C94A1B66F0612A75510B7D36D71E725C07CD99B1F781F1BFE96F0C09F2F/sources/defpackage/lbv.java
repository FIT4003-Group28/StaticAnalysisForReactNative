package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: lbv  reason: default package */
/* loaded from: classes3.dex */
final class lbv implements Animator.AnimatorListener {
    final /* synthetic */ lbx a;

    public lbv(lbx lbxVar) {
        this.a = lbxVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lbx lbxVar = this.a;
        lbxVar.m.setBackgroundColor(lbxVar.a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
