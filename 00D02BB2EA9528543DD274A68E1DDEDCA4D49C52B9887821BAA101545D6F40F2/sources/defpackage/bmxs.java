package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: bmxs  reason: default package */
/* loaded from: classes3.dex */
final class bmxs implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ bmxz b;

    public bmxs(bmxz bmxzVar, View view) {
        this.b = bmxzVar;
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bmxz bmxzVar = this.b;
        View view = this.a;
        bmxzVar.a.e = false;
        if (!cpv.a.e(bmxzVar.a.b) || !bmxzVar.a.b().booleanValue() || bmxzVar.a.d) {
            return;
        }
        cpv.a.c(view, 8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
