package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: czvd  reason: default package */
/* loaded from: classes5.dex */
final class czvd implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ czvg a;

    public czvd(czvg czvgVar) {
        this.a = czvgVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.j(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
