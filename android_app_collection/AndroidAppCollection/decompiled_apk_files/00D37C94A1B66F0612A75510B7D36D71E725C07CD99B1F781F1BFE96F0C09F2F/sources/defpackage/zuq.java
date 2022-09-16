package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zuq  reason: default package */
/* loaded from: classes4.dex */
public final class zuq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zuu a;

    public zuq(zuu zuuVar) {
        this.a = zuuVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.a.setAlpha(floatValue);
        this.a.b.setAlpha(1.0f - floatValue);
    }
}
