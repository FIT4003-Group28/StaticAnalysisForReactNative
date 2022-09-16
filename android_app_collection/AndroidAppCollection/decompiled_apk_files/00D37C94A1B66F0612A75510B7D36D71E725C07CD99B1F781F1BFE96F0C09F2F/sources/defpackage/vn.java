package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: vn  reason: default package */
/* loaded from: classes4.dex */
final class vn extends AnimatorListenerAdapter {
    final /* synthetic */ vo a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ vq d;

    public vn(vq vqVar, vo voVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = vqVar;
        this.a = voVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.l(this.a.b);
        this.d.g.remove(this.a.b);
        this.d.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        yo yoVar = this.a.b;
    }
}
