package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: awn  reason: default package */
/* loaded from: classes3.dex */
final class awn implements Animator.AnimatorListener {
    final /* synthetic */ awo a;
    final /* synthetic */ awp b;

    public awn(awp awpVar, awo awoVar) {
        this.b = awpVar;
        this.a = awoVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.d(1.0f, this.a, true);
        this.a.g();
        awo awoVar = this.a;
        awoVar.b(awoVar.c());
        awp awpVar = this.b;
        if (!awpVar.c) {
            awpVar.b += 1.0f;
            return;
        }
        awpVar.c = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.a.f(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b = 0.0f;
    }
}
