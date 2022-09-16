package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayi  reason: default package */
/* loaded from: classes3.dex */
public final class ayi extends AnimatorListenerAdapter {
    final /* synthetic */ aif a;
    final /* synthetic */ ayn b;

    public ayi(ayn aynVar, aif aifVar) {
        this.b = aynVar;
        this.a = aifVar;
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
