package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ehi  reason: default package */
/* loaded from: classes6.dex */
public final class ehi extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;

    public ehi(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
        this.a.removeAllViews();
        this.b.setVisibility(8);
    }
}
