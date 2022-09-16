package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: vw  reason: default package */
/* loaded from: classes4.dex */
final class vw implements Runnable {
    final /* synthetic */ wa a;

    public vw(wa waVar) {
        this.a = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa waVar = this.a;
        int i = waVar.q;
        if (i == 1) {
            waVar.p.cancel();
        } else if (i != 2) {
            return;
        }
        waVar.q = 3;
        ValueAnimator valueAnimator = waVar.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        waVar.p.setDuration(500L);
        waVar.p.start();
    }
}
