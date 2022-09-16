package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: abqz  reason: default package */
/* loaded from: classes.dex */
final class abqz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Drawable a;

    public abqz(Drawable drawable) {
        this.a = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
    }
}
