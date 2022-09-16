package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aknm  reason: default package */
/* loaded from: classes.dex */
public final class aknm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aknr a;

    public aknm(aknr aknrVar) {
        this.a = aknrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.ai.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
