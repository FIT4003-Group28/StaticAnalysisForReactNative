package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: czuu  reason: default package */
/* loaded from: classes5.dex */
public final class czuu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ dadr a;

    public czuu(dadr dadrVar) {
        this.a = dadrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.aa(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
