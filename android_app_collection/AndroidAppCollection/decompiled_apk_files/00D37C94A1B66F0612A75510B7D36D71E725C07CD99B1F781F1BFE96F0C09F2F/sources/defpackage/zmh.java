package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: zmh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zmh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ zmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ zmh(zmp zmpVar, int i) {
        this.b = i;
        this.a = zmpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b == 0) {
            zgd.t(this.a.al, zgd.r(((Integer) valueAnimator.getAnimatedValue()).intValue()), ViewGroup.LayoutParams.class);
            return;
        }
        this.a.an.requestLayout();
    }
}
