package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alno  reason: default package */
/* loaded from: classes.dex */
final class alno extends AnimatorListenerAdapter {
    final /* synthetic */ aloe a;

    public alno(aloe aloeVar) {
        this.a = aloeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f();
    }
}
