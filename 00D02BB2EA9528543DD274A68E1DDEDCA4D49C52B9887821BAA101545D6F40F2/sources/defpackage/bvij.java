package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvij  reason: default package */
/* loaded from: classes4.dex */
public final class bvij {
    public final ValueAnimator a;
    final /* synthetic */ bvip b;

    public bvij(bvip bvipVar, bvio bvioVar) {
        this.b = bvipVar;
        ValueAnimator valueAnimator = bvioVar.a;
        this.a = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bvih
            private final bvij a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                bvij bvijVar = this.a;
                Float valueOf = Float.valueOf(valueAnimator2.getAnimatedFraction());
                bvip bvipVar2 = bvijVar.b;
                bvipVar2.i.b(bvipVar2.f, valueOf);
                cqkx.p(bvijVar.b);
            }
        });
        valueAnimator.addListener(new bvii(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.b.c.size() > 1) {
            bvip bvipVar = this.b;
            if (!bvipVar.h || !bvipVar.g) {
                return;
            }
            if (bvipVar.b.m() || bvip.r(this.b.a) || cpv.a.e(this.b.a)) {
                bvip bvipVar2 = this.b;
                bvipVar2.i.b(bvipVar2.f, Float.valueOf(1.0f));
                cqkx.p(this.b);
                return;
            }
            bvip bvipVar3 = this.b;
            if (bvipVar3.d.get(bvipVar3.f).b || !this.a.isRunning()) {
                bvip bvipVar4 = this.b;
                if (!bvipVar4.d.get(bvipVar4.f).b) {
                    return;
                }
                if (!this.a.isPaused()) {
                    if (this.a.isRunning()) {
                        return;
                    }
                    this.a.start();
                    return;
                }
                this.a.resume();
                return;
            }
            this.a.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.a.cancel();
    }
}
