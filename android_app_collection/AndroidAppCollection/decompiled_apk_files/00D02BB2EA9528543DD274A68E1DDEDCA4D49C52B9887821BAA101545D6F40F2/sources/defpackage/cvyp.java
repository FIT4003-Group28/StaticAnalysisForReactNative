package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: cvyp  reason: default package */
/* loaded from: classes5.dex */
final class cvyp extends AnimatorListenerAdapter {
    final /* synthetic */ cvyq a;

    public cvyp(cvyq cvyqVar) {
        this.a = cvyqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.b.setEnabled(true);
    }
}
