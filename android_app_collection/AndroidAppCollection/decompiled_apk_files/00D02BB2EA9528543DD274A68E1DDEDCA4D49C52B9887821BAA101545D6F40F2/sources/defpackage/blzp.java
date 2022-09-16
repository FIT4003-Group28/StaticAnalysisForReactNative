package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: blzp  reason: default package */
/* loaded from: classes3.dex */
final class blzp implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ blzs a;

    public blzp(blzs blzsVar) {
        this.a = blzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
