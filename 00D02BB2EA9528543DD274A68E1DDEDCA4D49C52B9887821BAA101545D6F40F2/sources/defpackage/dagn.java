package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: dagn  reason: default package */
/* loaded from: classes5.dex */
final class dagn extends AnimatorListenerAdapter {
    final /* synthetic */ dagq a;

    public dagn(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k.setEndIconVisible(false);
    }
}
