package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: dagm  reason: default package */
/* loaded from: classes5.dex */
final class dagm extends AnimatorListenerAdapter {
    final /* synthetic */ dagq a;

    public dagm(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.k.setEndIconVisible(true);
    }
}
