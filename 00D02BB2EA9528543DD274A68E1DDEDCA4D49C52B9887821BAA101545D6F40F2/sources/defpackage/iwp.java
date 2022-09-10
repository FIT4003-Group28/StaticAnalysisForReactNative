package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: iwp  reason: default package */
/* loaded from: classes6.dex */
final class iwp implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ iwr a;

    public iwp(iwr iwrVar) {
        this.a = iwrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        iwr iwrVar = this.a;
        ValueAnimator valueAnimator2 = iwrVar.c;
        if (valueAnimator2 != null) {
            iwrVar.b = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
            cqkx.p(this.a);
        }
    }
}
