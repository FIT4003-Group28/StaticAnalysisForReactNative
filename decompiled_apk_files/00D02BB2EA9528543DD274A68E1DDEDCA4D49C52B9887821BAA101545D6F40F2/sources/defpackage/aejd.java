package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: aejd  reason: default package */
/* loaded from: classes2.dex */
final class aejd extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public aejd(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.invalidate();
    }
}
