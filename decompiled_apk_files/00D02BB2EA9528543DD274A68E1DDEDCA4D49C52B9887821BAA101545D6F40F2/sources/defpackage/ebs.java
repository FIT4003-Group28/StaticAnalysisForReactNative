package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: ebs  reason: default package */
/* loaded from: classes6.dex */
final class ebs implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ebi a;

    public ebs(ebi ebiVar) {
        this.a = ebiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setProgressRatio(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.a.invalidate();
    }
}
