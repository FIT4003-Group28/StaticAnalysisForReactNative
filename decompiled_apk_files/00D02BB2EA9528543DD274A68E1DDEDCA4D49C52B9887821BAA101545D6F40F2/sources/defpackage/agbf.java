package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: agbf  reason: default package */
/* loaded from: classes2.dex */
final class agbf extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public agbf(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.a.setAlpha(0.0f);
    }
}
