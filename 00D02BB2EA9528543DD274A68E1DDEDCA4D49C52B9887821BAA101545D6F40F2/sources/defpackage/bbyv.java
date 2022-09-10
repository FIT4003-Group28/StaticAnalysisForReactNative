package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbyv  reason: default package */
/* loaded from: classes3.dex */
public final class bbyv implements Animator.AnimatorListener {
    final /* synthetic */ bbyy a;
    private boolean b = false;

    public bbyv(bbyy bbyyVar) {
        this.a = bbyyVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = bbyy.r;
        this.b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = bbyy.r;
        if (!this.b) {
            this.a.B();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = bbyy.r;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = bbyy.r;
        this.b = false;
    }
}
