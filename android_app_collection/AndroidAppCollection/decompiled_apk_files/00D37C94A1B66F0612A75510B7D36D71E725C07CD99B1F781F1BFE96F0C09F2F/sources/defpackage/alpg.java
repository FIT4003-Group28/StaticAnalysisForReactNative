package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alpg  reason: default package */
/* loaded from: classes.dex */
final class alpg extends AnimatorListenerAdapter {
    final /* synthetic */ alpi a;

    public alpg(alpi alpiVar) {
        this.a = alpiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k.u(false);
    }
}
