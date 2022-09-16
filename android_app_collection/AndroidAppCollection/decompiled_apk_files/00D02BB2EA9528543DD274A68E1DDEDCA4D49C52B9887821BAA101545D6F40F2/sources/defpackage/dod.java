package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dod  reason: default package */
/* loaded from: classes6.dex */
public final class dod extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ dof c;

    public dod(dof dofVar, View view, View view2) {
        this.c = dofVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        doe.c(this.c.h, this.a, this.b);
    }
}
