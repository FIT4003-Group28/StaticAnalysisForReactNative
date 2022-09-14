package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: afw  reason: default package */
/* loaded from: classes2.dex */
final class afw implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ afx a;

    public afw(afx afxVar) {
        this.a = afxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.p = valueAnimator.getAnimatedFraction();
    }
}
