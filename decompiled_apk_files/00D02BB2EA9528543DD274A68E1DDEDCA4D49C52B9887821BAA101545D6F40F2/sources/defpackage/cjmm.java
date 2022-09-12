package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: cjmm  reason: default package */
/* loaded from: classes4.dex */
final class cjmm extends ValueAnimator {
    public cjmm(int... iArr) {
        setIntValues(iArr);
        setEvaluator(new ArgbEvaluator());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        super.cancel();
        removeAllUpdateListeners();
        removeAllListeners();
    }
}
