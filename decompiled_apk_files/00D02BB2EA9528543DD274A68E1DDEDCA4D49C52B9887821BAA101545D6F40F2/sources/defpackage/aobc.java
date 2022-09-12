package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: aobc  reason: default package */
/* loaded from: classes2.dex */
final class aobc extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ aobd b;

    public aobc(aobd aobdVar, View view) {
        this.b = aobdVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
        this.b.a.c = null;
    }
}
