package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ciyf  reason: default package */
/* loaded from: classes4.dex */
final class ciyf implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ View e;

    public ciyf(int i, int i2, int i3, int i4, View view) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = this.a;
        int i2 = this.b;
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i3 = this.c;
        int i4 = this.d;
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        layoutParams.width = (int) ((floatValue * (i - i2)) + i2);
        layoutParams.height = (int) ((floatValue2 * (i3 - i4)) + i4);
        this.e.setLayoutParams(layoutParams);
    }
}
