package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: vz  reason: default package */
/* loaded from: classes4.dex */
final class vz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ wa a;

    public vz(wa waVar) {
        this.a = waVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(floatValue);
        this.a.c.setAlpha(floatValue);
        this.a.h();
    }
}
