package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czzq  reason: default package */
/* loaded from: classes5.dex */
public final class czzq extends AnimatorListenerAdapter {
    final /* synthetic */ daaa a;
    private boolean b;

    public czzq(daaa daaaVar) {
        this.a = daaaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        daaa daaaVar = this.a;
        daaaVar.u = 0;
        daaaVar.o = null;
        if (!this.b) {
            daaaVar.B.f(4, false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.f(0, false);
        daaa daaaVar = this.a;
        daaaVar.u = 1;
        daaaVar.o = animator;
        this.b = false;
    }
}
