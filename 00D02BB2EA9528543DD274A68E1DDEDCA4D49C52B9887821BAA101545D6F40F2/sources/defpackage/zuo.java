package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zuo  reason: default package */
/* loaded from: classes7.dex */
public final class zuo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zup a;

    public zuo(zup zupVar) {
        this.a = zupVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.i(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.a.b);
    }
}
