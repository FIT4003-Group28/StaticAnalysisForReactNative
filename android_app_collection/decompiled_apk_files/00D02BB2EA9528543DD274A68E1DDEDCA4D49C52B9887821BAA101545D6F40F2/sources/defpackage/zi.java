package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: zi  reason: default package */
/* loaded from: classes7.dex */
final class zi implements Runnable {
    final /* synthetic */ zm a;

    public zi(zm zmVar) {
        this.a = zmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zm zmVar = this.a;
        int i = zmVar.q;
        if (i == 1) {
            zmVar.p.cancel();
        } else if (i != 2) {
            return;
        }
        zmVar.q = 3;
        ValueAnimator valueAnimator = zmVar.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        zmVar.p.setDuration(500L);
        zmVar.p.start();
    }
}
