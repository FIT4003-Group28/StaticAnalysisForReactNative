package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: dago  reason: default package */
/* loaded from: classes5.dex */
final class dago implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ dagq a;

    public dago(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
