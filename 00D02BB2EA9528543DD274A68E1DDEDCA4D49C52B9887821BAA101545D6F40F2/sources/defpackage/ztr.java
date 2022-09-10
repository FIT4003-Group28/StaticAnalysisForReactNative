package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: ztr  reason: default package */
/* loaded from: classes7.dex */
final class ztr implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zts a;

    public ztr(zts ztsVar) {
        this.a = ztsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.invalidate();
    }
}
