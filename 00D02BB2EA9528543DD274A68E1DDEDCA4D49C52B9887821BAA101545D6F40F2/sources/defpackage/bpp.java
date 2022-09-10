package defpackage;

import android.animation.Animator;
import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: bpp  reason: default package */
/* loaded from: classes4.dex */
public final class bpp extends bpl implements Choreographer.FrameCallback {
    public bis h;
    public float b = 1.0f;
    private boolean j = false;
    public long c = 0;
    public float d = 0.0f;
    public int e = 0;
    public float f = -2.14748365E9f;
    public float g = 2.14748365E9f;
    public boolean i = false;

    public final float c() {
        bis bisVar = this.h;
        if (bisVar == null) {
            return 0.0f;
        }
        float f = this.d;
        float f2 = bisVar.j;
        return (f - f2) / (bisVar.k - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        for (Animator.AnimatorListener animatorListener : this.a) {
            animatorListener.onAnimationCancel(this);
        }
        l();
    }

    public final void d(float f) {
        if (this.d == f) {
            return;
        }
        this.d = bpr.g(f, i(), j());
        this.c = 0L;
        b();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        k();
        bis bisVar = this.h;
        if (bisVar == null || !this.i) {
            return;
        }
        long j2 = this.c;
        long j3 = 0;
        if (j2 != 0) {
            j3 = j - j2;
        }
        float abs = ((float) j3) / ((1.0E9f / bisVar.l) / Math.abs(this.b));
        float f = this.d;
        if (h()) {
            abs = -abs;
        }
        float f2 = f + abs;
        this.d = f2;
        boolean h = bpr.h(f2, i(), j());
        this.d = bpr.g(this.d, i(), j());
        this.c = j;
        b();
        if (!h) {
            if (getRepeatCount() != -1 && this.e >= getRepeatCount()) {
                this.d = this.b < 0.0f ? i() : j();
                l();
                a(h());
            } else {
                for (Animator.AnimatorListener animatorListener : this.a) {
                    animatorListener.onAnimationRepeat(this);
                }
                this.e++;
                if (getRepeatMode() == 2) {
                    this.j = !this.j;
                    f();
                } else {
                    this.d = h() ? j() : i();
                }
                this.c = j;
            }
        }
        if (this.h != null) {
            float f3 = this.d;
            float f4 = this.f;
            if (f3 < f4 || f3 > this.g) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.g), Float.valueOf(this.d)));
            }
        }
        bim.a();
    }

    public final void e(float f, float f2) {
        if (f <= f2) {
            bis bisVar = this.h;
            float f3 = bisVar == null ? -3.4028235E38f : bisVar.j;
            float f4 = bisVar == null ? Float.MAX_VALUE : bisVar.k;
            this.f = bpr.g(f, f3, f4);
            this.g = bpr.g(f2, f3, f4);
            d((int) bpr.g(this.d, f, f2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public final void f() {
        this.b = -this.b;
    }

    public final void g() {
        l();
        a(h());
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float i;
        if (this.h == null) {
            return 0.0f;
        }
        if (h()) {
            f = j();
            i = this.d;
        } else {
            f = this.d;
            i = i();
        }
        return (f - i) / (j() - i());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        bis bisVar = this.h;
        if (bisVar == null) {
            return 0L;
        }
        return bisVar.e();
    }

    public final boolean h() {
        return this.b < 0.0f;
    }

    public final float i() {
        bis bisVar = this.h;
        if (bisVar == null) {
            return 0.0f;
        }
        float f = this.f;
        return f == -2.14748365E9f ? bisVar.j : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.i;
    }

    public final float j() {
        bis bisVar = this.h;
        if (bisVar == null) {
            return 0.0f;
        }
        float f = this.g;
        return f == 2.14748365E9f ? bisVar.k : f;
    }

    public final void k() {
        if (this.i) {
            m(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void l() {
        m(true);
    }

    protected final void m(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.i = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.j) {
            return;
        }
        this.j = false;
        f();
    }
}
