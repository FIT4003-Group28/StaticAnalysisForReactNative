package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ajub  reason: default package */
/* loaded from: classes.dex */
final class ajub extends AnimatorListenerAdapter {
    final /* synthetic */ ajtl a;
    final /* synthetic */ ajuc b;

    public ajub(ajuc ajucVar, ajtl ajtlVar) {
        this.b = ajucVar;
        this.a = ajtlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
