package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: abqp  reason: default package */
/* loaded from: classes.dex */
final class abqp extends AnimatorListenerAdapter {
    final /* synthetic */ abqq a;

    public abqp(abqq abqqVar) {
        this.a = abqqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.t = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.k.setVisibility(0);
    }
}
