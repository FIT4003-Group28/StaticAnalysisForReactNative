package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: vy  reason: default package */
/* loaded from: classes4.dex */
final class vy extends AnimatorListenerAdapter {
    final /* synthetic */ wa a;
    private boolean b = false;

    public vy(wa waVar) {
        this.a = waVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
        } else if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            wa waVar = this.a;
            waVar.q = 0;
            waVar.i(0);
        } else {
            wa waVar2 = this.a;
            waVar2.q = 2;
            waVar2.h();
        }
    }
}
