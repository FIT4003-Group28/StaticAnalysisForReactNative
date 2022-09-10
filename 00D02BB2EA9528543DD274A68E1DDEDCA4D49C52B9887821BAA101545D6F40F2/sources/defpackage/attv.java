package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: attv  reason: default package */
/* loaded from: classes2.dex */
final class attv implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ attw c;

    public attv(attw attwVar, View view, View view2) {
        this.c = attwVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b.a.v = true;
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
