package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: daek  reason: default package */
/* loaded from: classes5.dex */
final class daek extends AnimatorListenerAdapter {
    final /* synthetic */ daff a;

    public daek(daff daffVar) {
        this.a = daffVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.j();
    }
}
