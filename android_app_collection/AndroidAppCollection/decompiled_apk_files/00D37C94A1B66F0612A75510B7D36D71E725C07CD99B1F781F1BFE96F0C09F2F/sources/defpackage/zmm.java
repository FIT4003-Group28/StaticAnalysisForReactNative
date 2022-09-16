package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: zmm  reason: default package */
/* loaded from: classes4.dex */
final class zmm extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ zmp b;

    public zmm(zmp zmpVar, boolean z) {
        this.b = zmpVar;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.as.setVisibility(4);
            this.b.ah.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.as.setVisibility(0);
            this.b.ah.setVisibility(0);
        }
    }
}
