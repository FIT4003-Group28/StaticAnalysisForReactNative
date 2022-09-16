package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alpf  reason: default package */
/* loaded from: classes.dex */
final class alpf extends AnimatorListenerAdapter {
    final /* synthetic */ alpi a;

    public alpf(alpi alpiVar) {
        this.a = alpiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.k.u(true);
    }
}
