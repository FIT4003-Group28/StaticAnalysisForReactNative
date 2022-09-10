package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: yy  reason: default package */
/* loaded from: classes7.dex */
final class yy extends AnimatorListenerAdapter {
    final /* synthetic */ za a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ zc d;

    public yy(zc zcVar, za zaVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = zcVar;
        this.a = zaVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.p(this.a.a);
        this.d.g.remove(this.a.a);
        this.d.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        acl aclVar = this.a.a;
    }
}
