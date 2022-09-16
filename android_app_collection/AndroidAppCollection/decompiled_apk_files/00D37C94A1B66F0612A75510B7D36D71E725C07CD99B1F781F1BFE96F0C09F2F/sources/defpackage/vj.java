package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: vj  reason: default package */
/* loaded from: classes4.dex */
final class vj extends AnimatorListenerAdapter {
    final /* synthetic */ yo a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ vq d;

    public vj(vq vqVar, yo yoVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = vqVar;
        this.a = yoVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.l(this.a);
        this.d.f.remove(this.a);
        this.d.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
