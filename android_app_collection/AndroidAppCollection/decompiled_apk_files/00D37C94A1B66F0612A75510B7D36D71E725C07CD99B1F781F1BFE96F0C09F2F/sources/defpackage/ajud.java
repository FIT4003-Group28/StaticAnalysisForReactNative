package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ajud  reason: default package */
/* loaded from: classes.dex */
final class ajud extends AnimatorListenerAdapter {
    final /* synthetic */ ajti a;
    final /* synthetic */ ajue b;

    public ajud(ajue ajueVar, ajti ajtiVar) {
        this.b = ajueVar;
        this.a = ajtiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
