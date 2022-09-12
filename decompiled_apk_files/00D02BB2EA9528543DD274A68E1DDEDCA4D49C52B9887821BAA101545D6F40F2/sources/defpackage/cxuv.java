package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
/* compiled from: PG */
/* renamed from: cxuv  reason: default package */
/* loaded from: classes5.dex */
final class cxuv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ ValueAnimator b;
    final /* synthetic */ AppCompatImageView c;

    public cxuv(Drawable drawable, ValueAnimator valueAnimator, AppCompatImageView appCompatImageView) {
        this.a = drawable;
        this.b = valueAnimator;
        this.c = appCompatImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.mutate().setTint(((Integer) this.b.getAnimatedValue()).intValue());
        this.c.setImageDrawable(this.a);
    }
}
