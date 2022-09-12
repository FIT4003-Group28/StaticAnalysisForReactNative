package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daem  reason: default package */
/* loaded from: classes5.dex */
public final class daem implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ daff a;

    public daem(daff daffVar) {
        this.a = daffVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
