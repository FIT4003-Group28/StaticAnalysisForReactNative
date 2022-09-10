package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: bexu  reason: default package */
/* loaded from: classes3.dex */
public final class bexu implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bfdd c;

    public bexu(bfdd bfddVar, View view, boolean z) {
        this.c = bfddVar;
        this.a = view;
        this.b = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bfdd bfddVar = this.c;
        View view = this.a;
        boolean z = this.b;
        if (!cpv.a.e(bfddVar.a.b) || !z) {
            return;
        }
        if (!dbsj.d(bfddVar.a.d)) {
            cpv.a.f(view, bfddVar.a.d);
        }
        bfde bfdeVar = bfddVar.a;
        View a = cqhu.a(view, bexw.a);
        if (a == null) {
            return;
        }
        cpv.a.c(a, 8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
