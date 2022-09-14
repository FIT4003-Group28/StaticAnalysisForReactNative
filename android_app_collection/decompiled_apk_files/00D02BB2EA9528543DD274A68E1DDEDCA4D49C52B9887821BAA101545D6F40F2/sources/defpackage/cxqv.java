package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: cxqv  reason: default package */
/* loaded from: classes5.dex */
public final class cxqv extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public cxqv(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(0);
    }
}
