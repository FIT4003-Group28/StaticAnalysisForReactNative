package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: csas  reason: default package */
/* loaded from: classes5.dex */
final class csas implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ csaw b;

    public csas(csaw csawVar, ValueAnimator valueAnimator) {
        this.b = csawVar;
        this.a = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.e = ((Integer) this.a.getAnimatedValue()).intValue();
        this.b.invalidate();
    }
}
