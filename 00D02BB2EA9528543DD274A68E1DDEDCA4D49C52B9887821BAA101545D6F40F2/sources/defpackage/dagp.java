package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: dagp  reason: default package */
/* loaded from: classes5.dex */
final class dagp implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ dagq a;

    public dagp(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.m.setScaleX(floatValue);
        this.a.m.setScaleY(floatValue);
    }
}
