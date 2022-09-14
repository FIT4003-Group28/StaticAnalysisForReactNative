package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: eib  reason: default package */
/* loaded from: classes6.dex */
public final class eib {
    public static int a(View view) {
        return jmj.a(view.getContext(), 33);
    }

    public static ValueAnimator b(View view, int i, int i2, TimeInterpolator timeInterpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", i, i2);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    public static ValueAnimator c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    public static ValueAnimator d(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
