package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: cslx  reason: default package */
/* loaded from: classes5.dex */
final class cslx extends AnimatorListenerAdapter {
    final /* synthetic */ csme a;

    public cslx(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m = null;
        csme csmeVar = this.a;
        if (csmeVar.o || csmeVar.u) {
            return;
        }
        csmeVar.e(csmeVar.m());
    }
}
