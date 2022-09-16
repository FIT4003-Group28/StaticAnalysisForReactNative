package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: alpm  reason: default package */
/* loaded from: classes.dex */
final class alpm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ alpx a;

    public alpm(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
