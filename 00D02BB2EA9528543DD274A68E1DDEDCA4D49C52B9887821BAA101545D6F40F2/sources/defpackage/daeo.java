package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: daeo  reason: default package */
/* loaded from: classes5.dex */
final class daeo extends AnimatorListenerAdapter {
    final /* synthetic */ daff a;

    public daeo(daff daffVar) {
        this.a = daffVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.a();
    }
}
