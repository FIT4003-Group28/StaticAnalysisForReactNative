package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: csmw  reason: default package */
/* loaded from: classes5.dex */
final class csmw extends AnimatorListenerAdapter {
    final /* synthetic */ csmy a;

    public csmw(csmy csmyVar) {
        this.a = csmyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (!this.a.a.isStarted()) {
            this.a.a.start();
        }
    }
}
