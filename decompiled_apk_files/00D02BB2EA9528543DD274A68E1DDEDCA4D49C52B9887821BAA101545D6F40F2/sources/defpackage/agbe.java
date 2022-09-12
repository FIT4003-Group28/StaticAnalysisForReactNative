package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: agbe  reason: default package */
/* loaded from: classes2.dex */
final class agbe extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;

    public agbe(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
