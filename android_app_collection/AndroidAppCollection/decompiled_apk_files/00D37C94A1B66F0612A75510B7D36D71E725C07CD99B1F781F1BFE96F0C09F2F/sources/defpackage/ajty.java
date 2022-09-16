package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ajty  reason: default package */
/* loaded from: classes.dex */
final class ajty extends AnimatorListenerAdapter {
    final /* synthetic */ ajto a;
    final /* synthetic */ ajtz b;

    public ajty(ajtz ajtzVar, ajto ajtoVar) {
        this.b = ajtzVar;
        this.a = ajtoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.c.setListener(null);
        this.b.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.f;
    }
}
