package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hvv  reason: default package */
/* loaded from: classes3.dex */
public final class hvv implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ hvy b;

    public hvv(hvy hvyVar, boolean z) {
        this.b = hvyVar;
        this.a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.i.c(Boolean.valueOf(this.a));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.j.setVisibility(8);
            this.b.k.setVisibility(0);
        }
        this.b.i.c(Boolean.valueOf(this.a));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.j.setVisibility(0);
            this.b.j.setAlpha(0.0f);
        }
    }
}
