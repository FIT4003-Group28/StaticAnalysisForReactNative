package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxuy  reason: default package */
/* loaded from: classes5.dex */
public final class cxuy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cxuz c;

    public cxuy(cxuz cxuzVar, View view, boolean z) {
        this.c = cxuzVar;
        this.a = view;
        this.b = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.a.requestLayout();
        if (valueAnimator.getAnimatedFraction() != 1.0f || this.b) {
            return;
        }
        this.c.g.setVisibility(8);
    }
}
