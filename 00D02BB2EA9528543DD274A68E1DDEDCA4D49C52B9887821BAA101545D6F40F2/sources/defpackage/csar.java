package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: csar  reason: default package */
/* loaded from: classes5.dex */
final class csar implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ csaw b;

    public csar(csaw csawVar, ValueAnimator valueAnimator) {
        this.b = csawVar;
        this.a = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.d = ((Integer) this.a.getAnimatedValue()).intValue();
        this.b.invalidate();
    }
}
