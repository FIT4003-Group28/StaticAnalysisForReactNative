package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ajtx  reason: default package */
/* loaded from: classes.dex */
final class ajtx extends AnimatorListenerAdapter {
    final /* synthetic */ ajto a;
    final /* synthetic */ ajtz b;

    public ajtx(ajtz ajtzVar, ajto ajtoVar) {
        this.b = ajtzVar;
        this.a = ajtoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.d;
    }
}
