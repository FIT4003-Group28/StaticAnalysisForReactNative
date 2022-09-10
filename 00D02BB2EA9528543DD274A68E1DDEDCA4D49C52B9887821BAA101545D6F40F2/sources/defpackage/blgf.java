package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: blgf  reason: default package */
/* loaded from: classes3.dex */
final class blgf extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ blgh b;

    public blgf(blgh blghVar, Runnable runnable) {
        this.b = blghVar;
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.e = null;
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
