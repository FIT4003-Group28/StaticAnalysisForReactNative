package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: fex  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fex implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ffh a;
    private final /* synthetic */ int b;

    public /* synthetic */ fex(ffh ffhVar, int i) {
        this.b = i;
        this.a = ffhVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b == 0) {
            this.a.invalidate();
        } else {
            this.a.invalidate();
        }
    }
}
