package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: hpv  reason: default package */
/* loaded from: classes3.dex */
final class hpv implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ hpy b;

    public hpv(View view, hpy hpyVar) {
        this.a = view;
        this.b = hpyVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.e();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.f();
    }
}
