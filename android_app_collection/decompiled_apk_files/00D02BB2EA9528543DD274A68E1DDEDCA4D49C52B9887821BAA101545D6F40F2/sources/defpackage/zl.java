package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: zl  reason: default package */
/* loaded from: classes7.dex */
final class zl implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zm a;

    public zl(zm zmVar) {
        this.a = zmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(floatValue);
        this.a.c.setAlpha(floatValue);
        this.a.a();
    }
}
