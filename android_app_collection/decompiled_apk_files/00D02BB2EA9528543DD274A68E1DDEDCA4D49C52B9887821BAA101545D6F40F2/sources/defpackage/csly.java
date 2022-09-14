package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: csly  reason: default package */
/* loaded from: classes5.dex */
final class csly extends AnimatorListenerAdapter {
    final /* synthetic */ csme a;

    public csly(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m = null;
        csme csmeVar = this.a;
        if (!csmeVar.o) {
            csmeVar.e(csmeVar.m());
        }
    }
}
