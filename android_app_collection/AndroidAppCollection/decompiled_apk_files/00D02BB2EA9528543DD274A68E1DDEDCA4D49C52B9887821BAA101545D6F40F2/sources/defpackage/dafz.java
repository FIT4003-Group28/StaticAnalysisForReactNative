package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dafz  reason: default package */
/* loaded from: classes5.dex */
public final class dafz extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ daga b;

    public dafz(daga dagaVar, int i) {
        this.b = dagaVar;
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
