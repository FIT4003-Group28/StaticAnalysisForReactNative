package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: zau  reason: default package */
/* loaded from: classes4.dex */
final class zau extends AnimatorListenerAdapter {
    final /* synthetic */ zaq a;

    public zau(zaq zaqVar) {
        this.a = zaqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
    }
}
