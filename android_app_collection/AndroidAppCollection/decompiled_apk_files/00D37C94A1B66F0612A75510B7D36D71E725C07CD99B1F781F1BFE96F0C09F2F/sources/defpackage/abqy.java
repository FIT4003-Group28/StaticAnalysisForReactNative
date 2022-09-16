package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: abqy  reason: default package */
/* loaded from: classes.dex */
public final class abqy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public abqy(TextView textView) {
        this.a = textView;
    }

    public /* synthetic */ abqy(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    public abqy(TextView textView, int i, byte[] bArr) {
        this.b = i;
        this.a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            this.a.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i == 1) {
            gtd.e(this.a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else {
            this.a.setHintTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
