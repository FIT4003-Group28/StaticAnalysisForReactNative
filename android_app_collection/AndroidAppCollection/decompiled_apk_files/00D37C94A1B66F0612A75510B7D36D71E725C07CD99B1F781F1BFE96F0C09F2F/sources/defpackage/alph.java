package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: alph  reason: default package */
/* loaded from: classes.dex */
final class alph implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ alpi a;
    private final /* synthetic */ int b;

    public alph(alpi alpiVar) {
        this.a = alpiVar;
    }

    public alph(alpi alpiVar, int i) {
        this.b = i;
        this.a = alpiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b == 0) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.m.setScaleX(floatValue);
            this.a.m.setScaleY(floatValue);
            return;
        }
        this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
