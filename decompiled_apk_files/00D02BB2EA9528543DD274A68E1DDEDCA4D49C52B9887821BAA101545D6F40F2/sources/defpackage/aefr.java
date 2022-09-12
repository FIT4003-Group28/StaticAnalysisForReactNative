package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aefr  reason: default package */
/* loaded from: classes2.dex */
public final class aefr implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aefs a;

    public aefr(aefs aefsVar) {
        this.a = aefsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.i(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.a.b, true);
    }
}
