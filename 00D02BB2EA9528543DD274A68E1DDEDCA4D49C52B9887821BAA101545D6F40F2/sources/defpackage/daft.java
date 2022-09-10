package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daft  reason: default package */
/* loaded from: classes5.dex */
public final class daft implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ dagg a;

    public daft(dagg daggVar) {
        this.a = daggVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
