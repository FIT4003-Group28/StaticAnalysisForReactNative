package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atmq  reason: default package */
/* loaded from: classes2.dex */
public final class atmq extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ atmr c;

    public atmq(atmr atmrVar, View view, View view2) {
        this.c = atmrVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(4);
        atmr atmrVar = this.c;
        atmrVar.e = false;
        atmrVar.g = false;
        cqkx.p(atmrVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.g = true;
        this.a.setVisibility(0);
    }
}