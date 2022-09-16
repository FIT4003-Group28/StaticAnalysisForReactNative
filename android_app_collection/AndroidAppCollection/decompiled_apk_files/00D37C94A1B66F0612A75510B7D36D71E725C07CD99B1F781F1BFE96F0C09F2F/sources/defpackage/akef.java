package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
/* compiled from: PG */
/* renamed from: akef  reason: default package */
/* loaded from: classes.dex */
public final class akef {
    public static final Interpolator a = kt.o(0.05f, 0.0f, 0.0f, 1.0f);
    public static final Interpolator b = kt.o(0.2f, 0.0f, 0.6f, 1.0f);

    public static float a(View view) {
        int n = zew.n(view.getResources().getDisplayMetrics(), Math.max(view.getWidth(), view.getHeight()));
        return Math.max(n > 0 ? 1.0f - (9.0f / n) : 0.0f, 0.94f);
    }

    public static Animator b(View view, float f, float f2, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f, f2);
        Interpolator interpolator = a;
        ofFloat.setInterpolator(interpolator);
        long j = i;
        ofFloat.setDuration(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f, f2);
        ofFloat2.setInterpolator(interpolator);
        ofFloat2.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    public static akee c() {
        return new akee();
    }

    public static void d(View view, int i, int i2, Drawable drawable) {
        if (drawable instanceof TouchFeedbackDrawable) {
            return;
        }
        akej a2 = akej.a(view.getContext());
        a2.a = i;
        a2.c(i2);
        a2.b = drawable;
        zav.c(view, a2.b());
    }

    public static void e(View view) {
        akej a2 = akej.a(view.getContext());
        a2.c(-2);
        a2.b = null;
        zav.c(view, a2.b());
    }
}
