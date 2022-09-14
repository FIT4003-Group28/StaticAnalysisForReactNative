package c.a.a.y;

import android.view.Choreographer;
/* loaded from: classes.dex */
public class e extends a implements Choreographer.FrameCallback {
    private c.a.a.e k;

    /* renamed from: d  reason: collision with root package name */
    private float f2688d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2689e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f2690f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f2691g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private int f2692h = 0;
    private float i = -2.14748365E9f;
    private float j = 2.14748365E9f;
    protected boolean l = false;

    private float q() {
        c.a.a.e eVar = this.k;
        if (eVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / eVar.g()) / Math.abs(this.f2688d);
    }

    private boolean r() {
        return j() < 0.0f;
    }

    private void s() {
        if (this.k == null) {
            return;
        }
        float f2 = this.f2691g;
        if (f2 >= this.i && f2 <= this.j) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.f2691g)));
    }

    public void a(float f2) {
        if (this.f2691g == f2) {
            return;
        }
        this.f2691g = g.a(f2, i(), h());
        this.f2690f = 0L;
        c();
    }

    public void a(float f2, float f3) {
        if (f2 <= f3) {
            c.a.a.e eVar = this.k;
            float l = eVar == null ? -3.4028235E38f : eVar.l();
            c.a.a.e eVar2 = this.k;
            float e2 = eVar2 == null ? Float.MAX_VALUE : eVar2.e();
            this.i = g.a(f2, l, e2);
            this.j = g.a(f3, l, e2);
            a((int) g.a(this.f2691g, f2, f3));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public void a(int i) {
        a(i, (int) this.j);
    }

    public void a(c.a.a.e eVar) {
        float l;
        float e2;
        boolean z = this.k == null;
        this.k = eVar;
        if (z) {
            l = (int) Math.max(this.i, eVar.l());
            e2 = Math.min(this.j, eVar.e());
        } else {
            l = (int) eVar.l();
            e2 = eVar.e();
        }
        a(l, (int) e2);
        float f2 = this.f2691g;
        this.f2691g = 0.0f;
        a((int) f2);
    }

    public void b(float f2) {
        a(this.i, f2);
    }

    public void c(float f2) {
        this.f2688d = f2;
    }

    protected void c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.l = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        n();
    }

    public void d() {
        this.k = null;
        this.i = -2.14748365E9f;
        this.j = 2.14748365E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m();
        if (this.k == null || !isRunning()) {
            return;
        }
        long j2 = this.f2690f;
        long j3 = 0;
        if (j2 != 0) {
            j3 = j - j2;
        }
        float q = ((float) j3) / q();
        float f2 = this.f2691g;
        if (r()) {
            q = -q;
        }
        this.f2691g = f2 + q;
        boolean z = !g.b(this.f2691g, i(), h());
        this.f2691g = g.a(this.f2691g, i(), h());
        this.f2690f = j;
        c();
        if (z) {
            if (getRepeatCount() == -1 || this.f2692h < getRepeatCount()) {
                b();
                this.f2692h++;
                if (getRepeatMode() == 2) {
                    this.f2689e = !this.f2689e;
                    p();
                } else {
                    this.f2691g = r() ? h() : i();
                }
                this.f2690f = j;
            } else {
                this.f2691g = this.f2688d < 0.0f ? i() : h();
                n();
                a(r());
            }
        }
        s();
    }

    public void e() {
        n();
        a(r());
    }

    public float f() {
        c.a.a.e eVar = this.k;
        if (eVar == null) {
            return 0.0f;
        }
        return (this.f2691g - eVar.l()) / (this.k.e() - this.k.l());
    }

    public float g() {
        return this.f2691g;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float f2;
        float i;
        if (this.k == null) {
            return 0.0f;
        }
        if (r()) {
            f2 = h();
            i = this.f2691g;
        } else {
            f2 = this.f2691g;
            i = i();
        }
        return (f2 - i) / (h() - i());
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(f());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        c.a.a.e eVar = this.k;
        if (eVar == null) {
            return 0L;
        }
        return eVar.c();
    }

    public float h() {
        c.a.a.e eVar = this.k;
        if (eVar == null) {
            return 0.0f;
        }
        float f2 = this.j;
        return f2 == 2.14748365E9f ? eVar.e() : f2;
    }

    public float i() {
        c.a.a.e eVar = this.k;
        if (eVar == null) {
            return 0.0f;
        }
        float f2 = this.i;
        return f2 == -2.14748365E9f ? eVar.l() : f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.l;
    }

    public float j() {
        return this.f2688d;
    }

    public void k() {
        n();
    }

    public void l() {
        this.l = true;
        b(r());
        a((int) (r() ? h() : i()));
        this.f2690f = 0L;
        this.f2692h = 0;
        m();
    }

    protected void m() {
        if (isRunning()) {
            c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void n() {
        c(true);
    }

    public void o() {
        float i;
        this.l = true;
        m();
        this.f2690f = 0L;
        if (r() && g() == i()) {
            i = h();
        } else if (r() || g() != h()) {
            return;
        } else {
            i = i();
        }
        this.f2691g = i;
    }

    public void p() {
        c(-j());
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f2689e) {
            return;
        }
        this.f2689e = false;
        p();
    }
}
