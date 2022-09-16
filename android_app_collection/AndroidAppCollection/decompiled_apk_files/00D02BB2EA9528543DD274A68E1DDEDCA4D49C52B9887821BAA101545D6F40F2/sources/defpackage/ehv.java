package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: ehv  reason: default package */
/* loaded from: classes6.dex */
final class ehv extends AnimatorListenerAdapter {
    final /* synthetic */ ehx a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ ehz d;

    public ehv(ehz ehzVar, ehx ehxVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = ehzVar;
        this.a = ehxVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        acl aclVar = this.a.a;
        if (aclVar != null) {
            this.d.p(aclVar);
            this.d.g.remove(this.a.a);
            this.d.B();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        acl aclVar = this.a.a;
    }
}
