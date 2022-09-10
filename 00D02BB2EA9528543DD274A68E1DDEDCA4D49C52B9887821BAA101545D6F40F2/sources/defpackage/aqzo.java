package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: aqzo  reason: default package */
/* loaded from: classes.dex */
final class aqzo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aqzs a;

    public aqzo(aqzs aqzsVar) {
        this.a = aqzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
