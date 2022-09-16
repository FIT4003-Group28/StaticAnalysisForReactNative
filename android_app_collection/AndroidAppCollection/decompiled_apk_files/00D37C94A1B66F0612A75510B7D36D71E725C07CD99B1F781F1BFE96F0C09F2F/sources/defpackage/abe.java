package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: abe  reason: default package */
/* loaded from: classes.dex */
final class abe implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ abf a;

    public abe(abf abfVar) {
        this.a = abfVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.p = valueAnimator.getAnimatedFraction();
    }
}
