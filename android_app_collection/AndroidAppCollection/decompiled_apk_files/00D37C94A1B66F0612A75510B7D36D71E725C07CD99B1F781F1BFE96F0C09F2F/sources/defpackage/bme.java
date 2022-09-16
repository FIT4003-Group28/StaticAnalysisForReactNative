package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: bme  reason: default package */
/* loaded from: classes2.dex */
final class bme implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bmg a;
    final /* synthetic */ bmh b;

    public bme(bmh bmhVar, bmg bmgVar) {
        this.b = bmhVar;
        this.a = bmgVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bmh.e(floatValue, this.a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
