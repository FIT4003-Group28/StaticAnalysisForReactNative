package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: zk  reason: default package */
/* loaded from: classes7.dex */
final class zk extends AnimatorListenerAdapter {
    final /* synthetic */ zm a;
    private boolean b = false;

    public zk(zm zmVar) {
        this.a = zmVar;
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
            zm zmVar = this.a;
            zmVar.q = 0;
            zmVar.d(0);
        } else {
            zm zmVar2 = this.a;
            zmVar2.q = 2;
            zmVar2.a();
        }
    }
}
