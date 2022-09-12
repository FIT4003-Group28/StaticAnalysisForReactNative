package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: kyu  reason: default package */
/* loaded from: classes7.dex */
public final class kyu extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public kyu(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
