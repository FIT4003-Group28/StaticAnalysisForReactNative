package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
/* compiled from: PG */
/* renamed from: aibv  reason: default package */
/* loaded from: classes.dex */
public final class aibv implements ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator a;
    public boolean b;
    public final int c;
    public final int d;
    public final /* synthetic */ TimeBar e;

    public aibv(TimeBar timeBar, int i, int i2) {
        this.e = timeBar;
        this.c = i2;
        this.d = i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, i2);
        this.a = ofFloat;
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(this);
        this.b = false;
    }

    public final float a() {
        if (this.e.isEnabled()) {
            return Math.min(this.c, Math.max(this.d, ((Float) this.a.getAnimatedValue()).floatValue()));
        }
        return 0.0f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e.invalidate();
    }
}
