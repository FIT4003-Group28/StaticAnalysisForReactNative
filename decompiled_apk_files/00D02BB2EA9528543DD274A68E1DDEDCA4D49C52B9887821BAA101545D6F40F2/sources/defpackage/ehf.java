package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ehf  reason: default package */
/* loaded from: classes6.dex */
final class ehf extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;

    public ehf(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
    }
}
