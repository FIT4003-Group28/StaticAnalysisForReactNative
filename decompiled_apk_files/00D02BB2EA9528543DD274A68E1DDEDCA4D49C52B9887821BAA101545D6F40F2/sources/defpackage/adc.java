package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: adc  reason: default package */
/* loaded from: classes2.dex */
public final class adc extends AnimatorListenerAdapter {
    final /* synthetic */ add a;
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public adc(add addVar) {
        this.a = addVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            return;
        }
        this.a.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b = false;
    }
}
