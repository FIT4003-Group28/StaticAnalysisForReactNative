package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfd  reason: default package */
/* loaded from: classes.dex */
public final class acfd extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ acfh c;

    public acfd(acfh acfhVar, View view, View view2) {
        this.c = acfhVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.a.setAlpha(1.0f);
        this.b.setVisibility(0);
        this.c.M = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.M = true;
    }
}
