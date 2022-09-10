package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: daen  reason: default package */
/* loaded from: classes5.dex */
final class daen implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ daff a;

    public daen(daff daffVar) {
        this.a = daffVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.e.setScaleX(floatValue);
        this.a.e.setScaleY(floatValue);
    }
}
