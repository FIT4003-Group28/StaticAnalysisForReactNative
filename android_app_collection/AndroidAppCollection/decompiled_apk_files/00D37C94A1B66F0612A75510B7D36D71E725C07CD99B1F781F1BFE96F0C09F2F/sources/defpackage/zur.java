package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zur  reason: default package */
/* loaded from: classes4.dex */
public final class zur extends AnimatorListenerAdapter {
    final /* synthetic */ zuu a;

    public zur(zuu zuuVar) {
        this.a = zuuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.a.getAlpha() == 0.0f) {
            this.a.a.setVisibility(8);
        }
        if (this.a.b.getAlpha() == 0.0f) {
            this.a.b.setVisibility(8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(0);
    }
}
