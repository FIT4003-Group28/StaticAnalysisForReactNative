package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: nwx  reason: default package */
/* loaded from: classes3.dex */
final class nwx extends AnimatorListenerAdapter {
    final /* synthetic */ nwy a;

    public nwx(nwy nwyVar) {
        this.a = nwyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        nwy nwyVar = this.a;
        nwyVar.c = 1.0f;
        nwyVar.J();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        nwy nwyVar = this.a;
        nwyVar.c = 0.01f;
        nwyVar.a();
    }
}
