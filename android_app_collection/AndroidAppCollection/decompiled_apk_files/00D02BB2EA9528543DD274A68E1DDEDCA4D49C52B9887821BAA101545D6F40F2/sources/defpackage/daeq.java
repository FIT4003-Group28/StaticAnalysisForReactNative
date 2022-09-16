package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: daeq  reason: default package */
/* loaded from: classes5.dex */
final class daeq extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ daff b;

    public daeq(daff daffVar, int i) {
        this.b = daffVar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.m();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.f.b();
    }
}
