package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alkq  reason: default package */
/* loaded from: classes.dex */
public abstract class alkq extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ alkr b;
    private float c;
    private float d;

    public alkq(alkr alkrVar) {
        this.b = alkrVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.k((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            almx almxVar = this.b.i;
            this.c = almxVar == null ? 0.0f : almxVar.a();
            this.d = a();
            this.a = true;
        }
        alkr alkrVar = this.b;
        float f = this.c;
        alkrVar.k((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
