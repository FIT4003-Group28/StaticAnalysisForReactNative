package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alnp  reason: default package */
/* loaded from: classes.dex */
final class alnp extends AnimatorListenerAdapter {
    final /* synthetic */ aloe a;

    public alnp(aloe aloeVar) {
        this.a = aloeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k();
    }
}
