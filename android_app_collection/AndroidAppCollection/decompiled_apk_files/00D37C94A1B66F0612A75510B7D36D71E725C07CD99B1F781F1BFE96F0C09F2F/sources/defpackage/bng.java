package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bng  reason: default package */
/* loaded from: classes2.dex */
public final class bng extends AnimatorListenerAdapter {
    final /* synthetic */ afw a;
    final /* synthetic */ bnk b;

    public bng(bnk bnkVar, afw afwVar) {
        this.b = bnkVar;
        this.a = afwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.l.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.l.add(animator);
    }
}
