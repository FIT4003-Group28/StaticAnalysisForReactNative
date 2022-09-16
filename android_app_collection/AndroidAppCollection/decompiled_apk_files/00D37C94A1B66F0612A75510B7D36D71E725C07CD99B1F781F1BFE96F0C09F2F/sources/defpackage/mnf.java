package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: mnf  reason: default package */
/* loaded from: classes3.dex */
final class mnf extends AnimatorListenerAdapter {
    final /* synthetic */ ajtl a;
    final /* synthetic */ mng b;

    public mnf(mng mngVar, ajtl ajtlVar) {
        this.b = mngVar;
        this.a = ajtlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
