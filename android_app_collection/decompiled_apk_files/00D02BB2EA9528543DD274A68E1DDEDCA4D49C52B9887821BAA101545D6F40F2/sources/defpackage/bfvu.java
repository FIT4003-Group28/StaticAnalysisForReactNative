package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bfvu  reason: default package */
/* loaded from: classes3.dex */
final class bfvu implements cqfc {
    final /* synthetic */ boolean a;
    final /* synthetic */ bfvv b;

    public bfvu(bfvv bfvvVar, boolean z) {
        this.b = bfvvVar;
        this.a = z;
    }

    @Override // defpackage.cqfc
    public final void a(final View view, boolean z) {
        bfvv bfvvVar = this.b;
        if (bfvvVar.f) {
            final int i = 0;
            bfvvVar.f = false;
            boolean z2 = this.a;
            final int i2 = z2 ? -view.getHeight() : 0;
            if (!z2) {
                i = -view.getHeight();
            }
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = i2;
            ValueAnimator duration = new ValueAnimator().setDuration(250L);
            duration.setFloatValues(0.0f, 1.0f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(marginLayoutParams, i2, i, view) { // from class: bfvr
                private final ViewGroup.MarginLayoutParams a;
                private final int b;
                private final int c;
                private final View d;

                {
                    this.a = marginLayoutParams;
                    this.b = i2;
                    this.c = i;
                    this.d = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = this.a;
                    int i3 = this.b;
                    int i4 = this.c;
                    View view2 = this.d;
                    marginLayoutParams2.bottomMargin = (int) (i3 + (valueAnimator.getAnimatedFraction() * (i4 - i3)));
                    view2.setLayoutParams(marginLayoutParams2);
                }
            });
            duration.start();
        }
    }
}
