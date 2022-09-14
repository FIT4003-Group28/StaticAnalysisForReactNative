package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: vor  reason: default package */
/* loaded from: classes7.dex */
final class vor extends AnimatorListenerAdapter {
    final /* synthetic */ vos a;

    public vor(vos vosVar) {
        this.a = vosVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(4);
    }
}
