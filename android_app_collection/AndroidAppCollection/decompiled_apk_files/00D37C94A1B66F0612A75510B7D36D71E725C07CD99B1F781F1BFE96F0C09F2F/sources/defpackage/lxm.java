package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: lxm  reason: default package */
/* loaded from: classes3.dex */
final class lxm extends AnimatorListenerAdapter {
    final /* synthetic */ lxn a;

    public lxm(lxn lxnVar) {
        this.a = lxnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
