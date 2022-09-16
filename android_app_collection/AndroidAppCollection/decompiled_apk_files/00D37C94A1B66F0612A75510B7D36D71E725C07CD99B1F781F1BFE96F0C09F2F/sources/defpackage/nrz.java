package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: nrz  reason: default package */
/* loaded from: classes3.dex */
final class nrz extends AnimatorListenerAdapter {
    final /* synthetic */ azpa a;
    final /* synthetic */ zaq b;

    public nrz(azpa azpaVar, zaq zaqVar) {
        this.a = azpaVar;
        this.b = zaqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.sm();
        this.b.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.sm();
        this.b.a();
    }
}
