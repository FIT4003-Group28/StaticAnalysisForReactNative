package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: ffc  reason: default package */
/* loaded from: classes3.dex */
final class ffc extends ffg {
    public static final /* synthetic */ int d = 0;
    public final int a = 200;
    public int b = 200;
    final /* synthetic */ ffh c;

    public ffc(ffh ffhVar) {
        this.c = ffhVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.invalidate();
        if (b() == 0.0f) {
            this.c.k();
        }
    }
}
