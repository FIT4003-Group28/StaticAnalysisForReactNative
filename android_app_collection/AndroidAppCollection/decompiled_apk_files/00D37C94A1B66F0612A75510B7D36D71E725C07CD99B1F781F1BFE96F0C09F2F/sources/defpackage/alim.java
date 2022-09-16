package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: alim  reason: default package */
/* loaded from: classes.dex */
final class alim implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ alip a;

    public alim(alip alipVar) {
        this.a = alipVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.j(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
