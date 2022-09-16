package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: lm  reason: default package */
/* loaded from: classes3.dex */
final class lm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ pj a;

    public lm(pj pjVar) {
        this.a = pjVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.a.a.c.getParent()).invalidate();
    }
}
