package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: awm  reason: default package */
/* loaded from: classes3.dex */
final class awm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ awo a;
    final /* synthetic */ awp b;

    public awm(awp awpVar, awo awoVar) {
        this.b = awpVar;
        this.a = awoVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        awp.f(floatValue, this.a);
        this.b.d(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
