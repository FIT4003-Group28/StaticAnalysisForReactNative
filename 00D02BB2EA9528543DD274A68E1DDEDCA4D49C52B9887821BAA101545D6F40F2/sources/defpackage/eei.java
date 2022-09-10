package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: eei  reason: default package */
/* loaded from: classes6.dex */
final class eei extends AnimatorListenerAdapter {
    final /* synthetic */ eeo a;

    public eei(eeo eeoVar) {
        this.a = eeoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f = ValueAnimator.ofInt(0);
    }
}
