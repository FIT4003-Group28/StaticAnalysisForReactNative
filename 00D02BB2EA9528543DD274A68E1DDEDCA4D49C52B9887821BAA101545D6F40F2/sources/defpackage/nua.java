package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: nua  reason: default package */
/* loaded from: classes7.dex */
final class nua extends AnimatorListenerAdapter {
    final /* synthetic */ nud a;

    public nua(nud nudVar) {
        this.a = nudVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g.setVisibility(4);
    }
}
