package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: arxu  reason: default package */
/* loaded from: classes2.dex */
final class arxu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ arxv a;

    public arxu(arxv arxvVar) {
        this.a = arxvVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        arxv arxvVar = this.a;
        if (arxvVar.a != intValue) {
            arxvVar.a = intValue;
            cqkx.p(arxvVar);
        }
    }
}
