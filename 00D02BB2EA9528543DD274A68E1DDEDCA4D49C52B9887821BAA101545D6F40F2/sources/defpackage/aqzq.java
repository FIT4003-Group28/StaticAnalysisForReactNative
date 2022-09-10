package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: aqzq  reason: default package */
/* loaded from: classes.dex */
final class aqzq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aqzs a;

    public aqzq(aqzs aqzsVar) {
        this.a = aqzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f.q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
