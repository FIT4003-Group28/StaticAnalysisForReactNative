package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czzz  reason: default package */
/* loaded from: classes5.dex */
public abstract class czzz extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ daaa b;
    private float c;
    private float d;

    public czzz(daaa daaaVar) {
        this.b = daaaVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.l((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            dadr dadrVar = this.b.c;
            this.c = dadrVar == null ? 0.0f : dadrVar.Z();
            this.d = a();
            this.a = true;
        }
        daaa daaaVar = this.b;
        float f = this.c;
        daaaVar.l((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
