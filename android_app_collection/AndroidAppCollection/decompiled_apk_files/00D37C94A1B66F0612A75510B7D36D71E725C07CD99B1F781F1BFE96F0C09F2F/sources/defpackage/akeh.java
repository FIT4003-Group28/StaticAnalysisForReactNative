package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
/* compiled from: PG */
/* renamed from: akeh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akeh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TouchFeedbackDrawable a;
    private final /* synthetic */ int b;

    public /* synthetic */ akeh(TouchFeedbackDrawable touchFeedbackDrawable, int i) {
        this.b = i;
        this.a = touchFeedbackDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            this.a.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i == 1) {
            TouchFeedbackDrawable touchFeedbackDrawable = this.a;
            touchFeedbackDrawable.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
            touchFeedbackDrawable.invalidateSelf();
        } else {
            TouchFeedbackDrawable touchFeedbackDrawable2 = this.a;
            touchFeedbackDrawable2.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            touchFeedbackDrawable2.invalidateSelf();
        }
    }
}
