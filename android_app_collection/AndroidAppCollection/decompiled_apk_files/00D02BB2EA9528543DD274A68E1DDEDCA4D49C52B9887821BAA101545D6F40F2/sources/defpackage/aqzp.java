package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: aqzp  reason: default package */
/* loaded from: classes.dex */
final class aqzp implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aqzs a;

    public aqzp(aqzs aqzsVar) {
        this.a = aqzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f.i = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
