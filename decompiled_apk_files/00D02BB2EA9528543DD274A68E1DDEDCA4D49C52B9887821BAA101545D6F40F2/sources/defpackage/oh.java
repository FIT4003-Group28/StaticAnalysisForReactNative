package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: oh  reason: default package */
/* loaded from: classes.dex */
final class oh implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ sg a;

    public oh(sg sgVar) {
        this.a = sgVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.a.a.c.getParent()).invalidate();
    }
}
