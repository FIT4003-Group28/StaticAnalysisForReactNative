package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aifp  reason: default package */
/* loaded from: classes.dex */
public final class aifp extends AnimatorListenerAdapter {
    final /* synthetic */ aifq a;

    public aifp(aifq aifqVar) {
        this.a = aifqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aifq aifqVar = this.a;
        if (!aifqVar.g.isAttachedToWindow() || !aifqVar.f) {
            return;
        }
        aifqVar.g.postDelayed(new aifo(aifqVar), aifq.a.toMillis());
    }
}
