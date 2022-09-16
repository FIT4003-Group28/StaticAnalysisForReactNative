package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alnq  reason: default package */
/* loaded from: classes.dex */
public final class alnq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aloe a;
    private final /* synthetic */ int b;

    public alnq(aloe aloeVar) {
        this.a = aloeVar;
    }

    public alnq(aloe aloeVar, int i) {
        this.b = i;
        this.a = aloeVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.e.setScaleX(floatValue);
            this.a.e.setScaleY(floatValue);
        } else if (i == 1) {
            this.a.e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i == 2) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            String str = aloe.b;
            this.a.e.setTranslationY(intValue);
        } else {
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            String str2 = aloe.b;
            this.a.e.setTranslationY(intValue2);
        }
    }
}
