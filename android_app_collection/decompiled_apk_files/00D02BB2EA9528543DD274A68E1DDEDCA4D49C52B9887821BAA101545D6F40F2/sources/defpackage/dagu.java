package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: dagu  reason: default package */
/* loaded from: classes5.dex */
final class dagu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ dahe a;

    public dagu(dahe daheVar) {
        this.a = daheVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
