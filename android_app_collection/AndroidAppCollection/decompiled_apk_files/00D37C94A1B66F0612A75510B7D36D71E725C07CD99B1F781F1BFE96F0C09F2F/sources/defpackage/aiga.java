package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
/* compiled from: PG */
/* renamed from: aiga  reason: default package */
/* loaded from: classes.dex */
public final class aiga {
    public final TapBloomView a;
    public ValueAnimator b;
    private final int c;
    private final int d;

    public aiga(TapBloomView tapBloomView, int i, int i2) {
        this.a = tapBloomView;
        this.c = i;
        this.d = i2;
    }

    public final ValueAnimator a() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.setDuration(this.c);
        this.b.setRepeatCount(this.d);
        this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: aify
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                aiga aigaVar = aiga.this;
                aigaVar.a.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                aigaVar.a.invalidate();
            }
        });
        this.b.addListener(new aifz(this));
        return this.b;
    }

    public final void b(int i, int i2) {
        TapBloomView tapBloomView = this.a;
        tapBloomView.b = i;
        tapBloomView.c = i2;
        a().start();
    }
}
