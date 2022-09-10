package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: ehs  reason: default package */
/* loaded from: classes6.dex */
final class ehs extends AnimatorListenerAdapter {
    final /* synthetic */ acl a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ ehz c;

    public ehs(ehz ehzVar, acl aclVar, ViewPropertyAnimator viewPropertyAnimator) {
        this.c = ehzVar;
        this.a = aclVar;
        this.b = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.a.a.setAlpha(1.0f);
        this.c.p(this.a);
        this.c.f.remove(this.a);
        this.c.B();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
