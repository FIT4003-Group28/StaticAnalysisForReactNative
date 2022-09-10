package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: aqzm  reason: default package */
/* loaded from: classes.dex */
final class aqzm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aqzs a;

    public aqzm(aqzs aqzsVar) {
        this.a = aqzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.f.a = (akra) valueAnimator.getAnimatedValue();
    }
}
