package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ehk  reason: default package */
/* loaded from: classes6.dex */
public final class ehk extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;

    public ehk(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        egr.c.c(this.a);
        egr.d.c(this.a);
    }
}
