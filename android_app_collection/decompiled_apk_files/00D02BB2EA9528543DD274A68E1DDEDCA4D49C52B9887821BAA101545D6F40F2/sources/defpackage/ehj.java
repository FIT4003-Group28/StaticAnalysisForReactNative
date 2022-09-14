package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ehj  reason: default package */
/* loaded from: classes6.dex */
public final class ehj extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;

    public ehj(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
        this.a.removeAllViews();
    }
}
