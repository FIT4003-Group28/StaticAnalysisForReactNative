package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: sbk  reason: default package */
/* loaded from: classes7.dex */
final class sbk implements ValueAnimator.AnimatorUpdateListener {
    private final TextView a;

    public sbk(TextView textView) {
        this.a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
