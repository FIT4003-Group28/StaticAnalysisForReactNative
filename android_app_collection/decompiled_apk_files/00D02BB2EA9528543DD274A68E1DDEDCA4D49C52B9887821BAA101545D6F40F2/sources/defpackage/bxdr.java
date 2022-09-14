package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxdr  reason: default package */
/* loaded from: classes4.dex */
public final class bxdr implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bxds c;
    float a = 0.0f;
    float b = 0.0f;
    int d = 1;

    public bxdr(bxds bxdsVar) {
        this.c = bxdsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = 2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = animatedFraction - this.a;
        float f2 = this.b + f;
        this.b = f2;
        this.a = animatedFraction;
        if (f2 >= 1.0f) {
            bxds bxdsVar = this.c;
            if (!bxdsVar.g) {
                bxdsVar.g = true;
                bxdsVar.i();
                return;
            }
        }
        float f3 = f2 * 10.0f;
        float floor = f3 - ((float) Math.floor(f3));
        float f4 = this.c.a;
        double cos = Math.cos(Math.toRadians(dcyn.a));
        float f5 = this.c.a;
        double sin = Math.sin(Math.toRadians(dcyn.a));
        bxds bxdsVar2 = this.c;
        float f6 = 1.0f - floor;
        float f7 = floor * 0.0f;
        double d = f4;
        Double.isNaN(d);
        bxdsVar2.b = (int) (((-((float) (d * cos))) * f6) + f7);
        double d2 = f5;
        Double.isNaN(d2);
        bxdsVar2.c = (int) ((f6 * (-((float) (d2 * sin)))) + f7);
        bxdsVar2.d = 1.0f;
        if (floor < 0.13333334f) {
            bxdsVar2.d = floor / 0.13333334f;
        } else if (floor > 0.8666667f) {
            bxdsVar2.d = 1.0f - ((floor - 0.8666667f) / 0.13333334f);
        }
        if (this.b >= 0.9866667f) {
            this.d = 3;
        }
        if (this.d == 2) {
            float f8 = bxdsVar2.e;
            if (f8 < 1.0f) {
                bxdsVar2.e = Math.min(1.0f, f8 + (f / 0.013333334f));
            }
        }
        if (this.d == 3) {
            bxds bxdsVar3 = this.c;
            float f9 = bxdsVar3.e;
            if (f9 > 0.0f) {
                bxdsVar3.e = Math.max(0.0f, f9 - (f / 0.013333334f));
                bxds bxdsVar4 = this.c;
                if (bxdsVar4.e == 0.0f) {
                    bxdsVar4.g = false;
                    bxdsVar4.i();
                }
            }
        }
        cqkx.p(this.c);
    }
}
