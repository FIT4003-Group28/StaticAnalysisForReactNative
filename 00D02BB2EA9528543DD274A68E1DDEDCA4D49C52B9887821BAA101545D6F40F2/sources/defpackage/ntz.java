package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ntz  reason: default package */
/* loaded from: classes7.dex */
final class ntz extends AnimatorListenerAdapter {
    final /* synthetic */ nud a;

    public ntz(nud nudVar) {
        this.a = nudVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.g.setVisibility(0);
    }
}
