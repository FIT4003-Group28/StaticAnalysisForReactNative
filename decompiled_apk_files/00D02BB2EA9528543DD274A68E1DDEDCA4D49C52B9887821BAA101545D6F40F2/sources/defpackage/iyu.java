package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: iyu  reason: default package */
/* loaded from: classes7.dex */
final class iyu extends AnimatorListenerAdapter {
    final /* synthetic */ iyw a;

    public iyu(iyw iywVar) {
        this.a = iywVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.a = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s();
    }
}
