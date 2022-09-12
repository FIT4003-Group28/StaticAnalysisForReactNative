package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: kyt  reason: default package */
/* loaded from: classes7.dex */
public final class kyt extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public kyt(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
