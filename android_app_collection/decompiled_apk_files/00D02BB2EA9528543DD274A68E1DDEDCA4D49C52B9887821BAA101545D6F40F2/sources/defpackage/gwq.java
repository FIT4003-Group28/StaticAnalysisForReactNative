package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: gwq  reason: default package */
/* loaded from: classes6.dex */
final class gwq extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ gwr b;

    public gwq(gwr gwrVar, View view) {
        this.b = gwrVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (gwu.g(this.a)) {
            this.b.b(this.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (gwu.g(this.a)) {
            this.a.setVisibility(0);
        }
    }
}
