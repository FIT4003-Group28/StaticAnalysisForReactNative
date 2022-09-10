package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: nty  reason: default package */
/* loaded from: classes7.dex */
final class nty extends AnimatorListenerAdapter {
    final /* synthetic */ nud a;

    public nty(nud nudVar) {
        this.a = nudVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nud nudVar = this.a;
        if ((animator != nudVar.h || nudVar.k) && (animator != nudVar.i || !nudVar.k)) {
            return;
        }
        nudVar.k(nudVar.k);
    }
}
