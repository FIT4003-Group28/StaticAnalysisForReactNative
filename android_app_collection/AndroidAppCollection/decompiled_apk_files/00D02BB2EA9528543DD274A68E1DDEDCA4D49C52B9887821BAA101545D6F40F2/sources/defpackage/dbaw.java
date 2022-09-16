package defpackage;

import android.animation.ValueAnimator;
import com.google.ar.core.InstallActivity;
/* compiled from: PG */
/* renamed from: dbaw  reason: default package */
/* loaded from: classes5.dex */
public final class dbaw implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ InstallActivity d;

    public dbaw(InstallActivity installActivity, int i, int i2, int i3) {
        this.d = installActivity;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        int i = this.a;
        float f = this.b * animatedFraction2;
        this.d.getWindow().setLayout((int) ((i * animatedFraction) + f), (int) ((this.c * animatedFraction) + f));
        this.d.getWindow().getDecorView().refreshDrawableState();
    }
}
