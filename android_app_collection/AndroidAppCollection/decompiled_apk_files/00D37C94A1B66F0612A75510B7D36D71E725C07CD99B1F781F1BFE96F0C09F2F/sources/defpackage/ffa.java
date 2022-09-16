package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: ffa  reason: default package */
/* loaded from: classes3.dex */
final class ffa extends ffg {
    final /* synthetic */ ffh a;

    public ffa(ffh ffhVar) {
        this.a = ffhVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
