package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: zm  reason: default package */
/* loaded from: classes7.dex */
public final class zm extends abp implements abw {
    private static final int[] r = {16842919};
    private static final int[] s = new int[0];
    private final Runnable D;
    private final abx E;
    public final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public RecyclerView l;
    final ValueAnimator p;
    int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    public zm(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        this.q = 0;
        this.D = new zi(this);
        zj zjVar = new zj(this);
        this.E = zjVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i, drawable.getIntrinsicWidth());
        this.y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.t = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new zk(this));
        ofFloat.addUpdateListener(new zl(this));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.h(this);
            this.l.E(this);
            this.l.j(zjVar);
            m();
        }
        this.l = recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.g(this);
        this.l.D(this);
        this.l.i(zjVar);
    }

    private final boolean l() {
        return od.s(this.l) == 1;
    }

    private final void m() {
        this.l.removeCallbacks(this.D);
    }

    private final void n(int i) {
        m();
        this.l.postDelayed(this.D, i);
    }

    private static final int o(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 < i5 && i7 >= 0) {
            return i6;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.l.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            m();
        }
        if (i == 0) {
            a();
        } else {
            e();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            n(1200);
        } else if (i == 1) {
            n(1500);
        }
        this.o = i;
    }

    public final void e() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.p.cancel();
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.p.setDuration(500L);
        this.p.setStartDelay(0L);
        this.p.start();
    }

    @Override // defpackage.abw
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.o;
        if (i != 1) {
            return i == 2;
        }
        boolean i2 = i(motionEvent.getX(), motionEvent.getY());
        boolean j = j(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!i2) {
            if (!j) {
                return false;
            }
        } else if (!j) {
            this.A = 2;
            this.f = (int) motionEvent.getY();
            d(2);
            return true;
        }
        this.A = 1;
        this.i = (int) motionEvent.getX();
        d(2);
        return true;
    }

    @Override // defpackage.abw
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean i = i(motionEvent.getX(), motionEvent.getY());
            boolean j = j(motionEvent.getX(), motionEvent.getY());
            if (!i) {
                if (!j) {
                    return;
                }
            } else if (!j) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
                d(2);
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            d(2);
        } else if (motionEvent.getAction() != 1 || this.o != 2) {
            if (motionEvent.getAction() != 2 || this.o != 2) {
                return;
            }
            e();
            if (this.A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.C;
                int i2 = this.t;
                iArr[0] = i2;
                iArr[1] = this.j - i2;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.h - max) >= 2.0f) {
                    int o = o(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (o != 0) {
                        this.l.scrollBy(o, 0);
                    }
                    this.i = max;
                }
            }
            if (this.A != 2) {
                return;
            }
            float y = motionEvent.getY();
            int[] iArr2 = this.B;
            int i3 = this.t;
            iArr2[0] = i3;
            iArr2[1] = this.k - i3;
            float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
            if (Math.abs(this.e - max2) < 2.0f) {
                return;
            }
            int o2 = o(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
            if (o2 != 0) {
                this.l.scrollBy(0, o2);
            }
            this.f = max2;
        } else {
            this.f = 0.0f;
            this.i = 0.0f;
            d(1);
            this.A = 0;
        }
    }

    @Override // defpackage.abw
    public final void h(boolean z) {
    }

    final boolean i(float f, float f2) {
        if (l()) {
            if (f > this.u) {
                return false;
            }
        } else if (f < this.j - this.u) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    final boolean j(float f, float f2) {
        if (f2 >= this.k - this.y) {
            int i = this.h;
            int i2 = this.g / 2;
            return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
        }
        return false;
    }

    @Override // defpackage.abp
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            d(0);
        } else if (this.q == 0) {
        } else {
            if (this.m) {
                int i = this.j;
                int i2 = this.u;
                int i3 = i - i2;
                int i4 = this.e;
                int i5 = this.d;
                int i6 = i4 - (i5 / 2);
                this.b.setBounds(0, 0, i2, i5);
                this.c.setBounds(0, 0, this.v, this.k);
                if (l()) {
                    this.c.draw(canvas);
                    canvas.translate(this.u, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.u, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.c.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.b.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (!this.n) {
                return;
            }
            int i7 = this.k;
            int i8 = this.y;
            int i9 = i7 - i8;
            int i10 = this.h;
            int i11 = this.g;
            int i12 = i10 - (i11 / 2);
            this.w.setBounds(0, 0, i11, i8);
            this.x.setBounds(0, 0, this.j, this.z);
            canvas.translate(0.0f, i9);
            this.x.draw(canvas);
            canvas.translate(i12, 0.0f);
            this.w.draw(canvas);
            canvas.translate(-i12, -i9);
        }
    }
}
