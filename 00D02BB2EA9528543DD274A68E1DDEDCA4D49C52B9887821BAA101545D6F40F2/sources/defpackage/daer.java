package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: daer  reason: default package */
/* loaded from: classes5.dex */
final class daer implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ daff a;

    public daer(daff daffVar) {
        this.a = daffVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = daff.n;
        this.a.e.setTranslationY(intValue);
    }
}
