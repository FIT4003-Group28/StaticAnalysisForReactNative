package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: gvr  reason: default package */
/* loaded from: classes3.dex */
final class gvr extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public gvr(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(8);
    }
}
