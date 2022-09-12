package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: gju  reason: default package */
/* loaded from: classes6.dex */
public final class gju extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ ViewGroup b;

    public gju(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.setVisibility(4);
        }
    }
}
