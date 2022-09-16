package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: ahuj  reason: default package */
/* loaded from: classes.dex */
final class ahuj implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ahum a;

    public ahuj(ahum ahumVar) {
        this.a = ahumVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.a.e.setAlpha((int) (255.0f * animatedFraction));
        this.a.setAlpha(1.0f - (animatedFraction * 0.3f));
    }
}
