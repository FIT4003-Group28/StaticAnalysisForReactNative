package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ajua  reason: default package */
/* loaded from: classes.dex */
public final class ajua extends AnimatorListenerAdapter {
    final /* synthetic */ ajsq a;
    final /* synthetic */ ajtr b;

    public ajua(ajtr ajtrVar, ajsq ajsqVar) {
        this.b = ajtrVar;
        this.a = ajsqVar;
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
