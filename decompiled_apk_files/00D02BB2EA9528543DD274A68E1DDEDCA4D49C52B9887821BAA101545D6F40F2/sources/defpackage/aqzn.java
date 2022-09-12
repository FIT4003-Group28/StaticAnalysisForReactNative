package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: aqzn  reason: default package */
/* loaded from: classes.dex */
final class aqzn implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aqzs a;

    public aqzn(aqzs aqzsVar) {
        this.a = aqzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f.j = (akra) valueAnimator.getAnimatedValue();
    }
}
