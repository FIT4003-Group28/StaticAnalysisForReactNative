package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: wa  reason: default package */
/* loaded from: classes4.dex */
public final class wa extends nd implements ya {
    private static final int[] r = {16842919};
    private static final int[] s = new int[0];
    private final Runnable D;
    private final ne E;
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

    public wa(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        this.q = 0;
        this.D = new vw(this);
        vx vxVar = new vx(this);
        this.E = vxVar;
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
        stateListDrawable.setAlpha(PrivateKeyType.INVALID);
        drawable.setAlpha(PrivateKeyType.INVALID);
        ofFloat.addListener(new vy(this));
        ofFloat.addUpdateListener(new vz(this));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aF(this);
            this.l.Z(this);
            this.l.aG(vxVar);
            o();
        }
        this.l = recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.aC(this);
        this.l.v(this);
        this.l.aE(vxVar);
    }

    private final void o() {
        this.l.removeCallbacks(this.D);
    }

    private final void p(int i) {
        o();
        this.l.postDelayed(this.D, i);
    }

    private final boolean q() {
        return lj.e(this.l) == 1;
    }

    private static final int r(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // defpackage.nd
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            i(0);
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
                if (q()) {
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

    @Override // defpackage.ya
    public final void g(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.l.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            o();
        }
        if (i == 0) {
            h();
        } else {
            j();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            p(1200);
        } else if (i == 1) {
            p(1500);
        }
        this.o = i;
    }

    public final void j() {
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

    final boolean k(float f, float f2) {
        if (f2 >= this.k - this.y) {
            int i = this.h;
            int i2 = this.g / 2;
            return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
        }
        return false;
    }

    final boolean l(float f, float f2) {
        if (q()) {
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

    @Override // defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.o;
        if (i != 1) {
            return i == 2;
        }
        boolean l = l(motionEvent.getX(), motionEvent.getY());
        boolean k = k(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!l) {
            if (!k) {
                return false;
            }
        } else if (!k) {
            this.A = 2;
            this.f = (int) motionEvent.getY();
            i(2);
            return true;
        }
        this.A = 1;
        this.i = (int) motionEvent.getX();
        i(2);
        return true;
    }

    @Override // defpackage.ya
    public final void n(MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean l = l(motionEvent.getX(), motionEvent.getY());
            boolean k = k(motionEvent.getX(), motionEvent.getY());
            if (!l) {
                if (!k) {
                    return;
                }
            } else if (!k) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
                i(2);
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            i(2);
        } else if (motionEvent.getAction() != 1 || this.o != 2) {
            if (motionEvent.getAction() != 2 || this.o != 2) {
                return;
            }
            j();
            if (this.A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.C;
                int i = this.t;
                iArr[0] = i;
                iArr[1] = this.j - i;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.h - max) >= 2.0f) {
                    int r2 = r(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (r2 != 0) {
                        this.l.scrollBy(r2, 0);
                    }
                    this.i = max;
                }
            }
            if (this.A != 2) {
                return;
            }
            float y = motionEvent.getY();
            int[] iArr2 = this.B;
            int i2 = this.t;
            iArr2[0] = i2;
            iArr2[1] = this.k - i2;
            float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
            if (Math.abs(this.e - max2) < 2.0f) {
                return;
            }
            int r3 = r(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
            if (r3 != 0) {
                this.l.scrollBy(0, r3);
            }
            this.f = max2;
        } else {
            this.f = 0.0f;
            this.i = 0.0f;
            i(1);
            this.A = 0;
        }
    }
}
