package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: daep  reason: default package */
/* loaded from: classes5.dex */
final class daep implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ daff b;

    public daep(daff daffVar, int i) {
        this.b = daffVar;
        this.a = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = daff.n;
        this.b.e.setTranslationY(intValue);
    }
}
