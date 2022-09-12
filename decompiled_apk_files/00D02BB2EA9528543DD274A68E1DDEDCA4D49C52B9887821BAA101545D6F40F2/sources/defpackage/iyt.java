package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: iyt  reason: default package */
/* loaded from: classes7.dex */
final class iyt implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ iyw a;

    public iyt(iyw iywVar) {
        this.a = iywVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.OT();
    }
}
