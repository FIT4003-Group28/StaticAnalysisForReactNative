package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: alxr  reason: default package */
/* loaded from: classes.dex */
final class alxr implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ViewGroup.LayoutParams a;
    final /* synthetic */ alxt b;

    public alxr(alxt alxtVar, ViewGroup.LayoutParams layoutParams) {
        this.b = alxtVar;
        this.a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.b.b.setLayoutParams(this.a);
    }
}
