package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: vlo  reason: default package */
/* loaded from: classes7.dex */
final class vlo extends AnimatorListenerAdapter {
    final /* synthetic */ vlp a;
    private final long b = 1000;

    public vlo(vlp vlpVar) {
        this.a = vlpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.b > 0) {
            animator.setStartDelay(this.b);
            animator.start();
        }
    }
}
