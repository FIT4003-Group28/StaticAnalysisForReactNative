package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czzr  reason: default package */
/* loaded from: classes5.dex */
public final class czzr extends AnimatorListenerAdapter {
    final /* synthetic */ daaa a;

    public czzr(daaa daaaVar) {
        this.a = daaaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        daaa daaaVar = this.a;
        daaaVar.u = 0;
        daaaVar.o = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.f(0, false);
        daaa daaaVar = this.a;
        daaaVar.u = 2;
        daaaVar.o = animator;
    }
}
