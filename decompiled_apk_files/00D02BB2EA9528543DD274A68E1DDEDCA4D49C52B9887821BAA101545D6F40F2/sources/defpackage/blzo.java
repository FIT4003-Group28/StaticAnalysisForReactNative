package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: blzo  reason: default package */
/* loaded from: classes3.dex */
final class blzo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ blzs a;

    public blzo(blzs blzsVar) {
        this.a = blzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
