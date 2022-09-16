package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alos  reason: default package */
/* loaded from: classes.dex */
public final class alos extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ alot b;

    public alos(alot alotVar, int i) {
        this.b = alotVar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b = this.a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b = this.a;
    }
}
