package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: bmf  reason: default package */
/* loaded from: classes2.dex */
final class bmf implements Animator.AnimatorListener {
    final /* synthetic */ bmg a;
    final /* synthetic */ bmh b;

    public bmf(bmh bmhVar, bmg bmgVar) {
        this.b = bmhVar;
        this.a = bmgVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.f();
        bmg bmgVar = this.a;
        bmgVar.g();
        bmgVar.h();
        bmh bmhVar = this.b;
        if (!bmhVar.d) {
            bmhVar.c += 1.0f;
            return;
        }
        bmhVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.a.d(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }
}
