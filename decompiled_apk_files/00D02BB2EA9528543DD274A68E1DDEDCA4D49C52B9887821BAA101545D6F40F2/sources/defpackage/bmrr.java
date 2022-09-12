package defpackage;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: bmrr  reason: default package */
/* loaded from: classes3.dex */
final class bmrr extends cquq {
    public bmrr(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        Interpolator interpolator = irf.a;
        LayoutTransition layoutTransition = new LayoutTransition();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f));
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(View.ALPHA, 1.0f, 0.0f));
        layoutTransition.enableTransitionType(2);
        layoutTransition.setDuration(2, 700L);
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setAnimator(2, ofPropertyValuesHolder);
        layoutTransition.enableTransitionType(3);
        layoutTransition.setDuration(3, 150L);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setAnimator(3, ofPropertyValuesHolder2);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        return layoutTransition;
    }
}
