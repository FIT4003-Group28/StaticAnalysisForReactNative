package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: hpq  reason: default package */
/* loaded from: classes6.dex */
final class hpq extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ hpr b;

    public hpq(hpr hprVar, View view) {
        this.b = hprVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(true != this.b.b ? 8 : 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
