package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: blzq  reason: default package */
/* loaded from: classes3.dex */
final class blzq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ blzs a;

    public blzq(blzs blzsVar) {
        this.a = blzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
