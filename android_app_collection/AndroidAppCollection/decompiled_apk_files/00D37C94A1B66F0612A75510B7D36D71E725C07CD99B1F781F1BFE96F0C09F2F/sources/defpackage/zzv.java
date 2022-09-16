package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: zzv  reason: default package */
/* loaded from: classes4.dex */
final class zzv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zzs a;

    public zzv(zzs zzsVar) {
        this.a = zzsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
