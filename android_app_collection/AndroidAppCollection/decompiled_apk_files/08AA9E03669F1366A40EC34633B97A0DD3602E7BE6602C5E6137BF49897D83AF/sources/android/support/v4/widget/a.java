package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.j.s;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.baidu.mapapi.UIMsg;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    final View f620b;

    /* renamed from: c  reason: collision with root package name */
    boolean f621c;

    /* renamed from: d  reason: collision with root package name */
    boolean f622d;
    boolean e;
    private Runnable g;
    private int j;
    private int k;
    private boolean o;
    private boolean p;
    private boolean q;

    /* renamed from: a  reason: collision with root package name */
    final C0019a f619a = new C0019a();
    private final Interpolator f = new AccelerateInterpolator();
    private float[] h = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] i = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] l = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] m = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] n = {Float.MAX_VALUE, Float.MAX_VALUE};

    static float a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    static int a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public abstract void a(int i, int i2);

    public abstract boolean e(int i);

    public abstract boolean f(int i);

    public a(View view) {
        this.f620b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        a(f, f);
        float f2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        b(f2, f2);
        a(1);
        e(Float.MAX_VALUE, Float.MAX_VALUE);
        d(0.2f, 0.2f);
        c(1.0f, 1.0f);
        b(r);
        c(UIMsg.d_ResultType.SHORT_URL);
        d(UIMsg.d_ResultType.SHORT_URL);
    }

    public a a(boolean z) {
        if (this.p && !z) {
            d();
        }
        this.p = z;
        return this;
    }

    public a a(float f, float f2) {
        this.n[0] = f / 1000.0f;
        this.n[1] = f2 / 1000.0f;
        return this;
    }

    public a b(float f, float f2) {
        this.m[0] = f / 1000.0f;
        this.m[1] = f2 / 1000.0f;
        return this;
    }

    public a c(float f, float f2) {
        this.l[0] = f / 1000.0f;
        this.l[1] = f2 / 1000.0f;
        return this;
    }

    public a a(int i) {
        this.j = i;
        return this;
    }

    public a d(float f, float f2) {
        this.h[0] = f;
        this.h[1] = f2;
        return this;
    }

    public a e(float f, float f2) {
        this.i[0] = f;
        this.i[1] = f2;
        return this;
    }

    public a b(int i) {
        this.k = i;
        return this;
    }

    public a c(int i) {
        this.f619a.a(i);
        return this;
    }

    public a d(int i) {
        this.f619a.b(i);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f622d = true;
                this.o = false;
                this.f619a.a(a(0, motionEvent.getX(), view.getWidth(), this.f620b.getWidth()), a(1, motionEvent.getY(), view.getHeight(), this.f620b.getHeight()));
                if (!this.e && a()) {
                    c();
                    break;
                }
                break;
            case 1:
            case 3:
                d();
                break;
            case 2:
                this.f619a.a(a(0, motionEvent.getX(), view.getWidth(), this.f620b.getWidth()), a(1, motionEvent.getY(), view.getHeight(), this.f620b.getHeight()));
                if (!this.e) {
                    c();
                    break;
                }
                break;
        }
        return this.q && this.e;
    }

    boolean a() {
        C0019a c0019a = this.f619a;
        int f = c0019a.f();
        int e = c0019a.e();
        return (f != 0 && f(f)) || (e != 0 && e(e));
    }

    private void c() {
        if (this.g == null) {
            this.g = new b();
        }
        this.e = true;
        this.f621c = true;
        if (!this.o && this.k > 0) {
            s.a(this.f620b, this.g, this.k);
        } else {
            this.g.run();
        }
        this.o = true;
    }

    private void d() {
        if (this.f621c) {
            this.e = false;
        } else {
            this.f619a.b();
        }
    }

    private float a(int i, float f, float f2, float f3) {
        float a2 = a(this.h[i], f2, this.i[i], f);
        int i2 = (a2 > BitmapDescriptorFactory.HUE_RED ? 1 : (a2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i2 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f4 = this.l[i];
        float f5 = this.m[i];
        float f6 = this.n[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return a(a2 * f7, f5, f6);
        }
        return -a((-a2) * f7, f5, f6);
    }

    private float a(float f, float f2, float f3, float f4) {
        float interpolation;
        float a2 = a(f * f2, (float) BitmapDescriptorFactory.HUE_RED, f3);
        float f5 = f(f2 - f4, a2) - f(f4, a2);
        if (f5 < BitmapDescriptorFactory.HUE_RED) {
            interpolation = -this.f.getInterpolation(-f5);
        } else if (f5 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        } else {
            interpolation = this.f.getInterpolation(f5);
        }
        return a(interpolation, -1.0f, 1.0f);
    }

    private float f(float f, float f2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        switch (this.j) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= BitmapDescriptorFactory.HUE_RED) {
                        return 1.0f - (f / f2);
                    }
                    if (this.e && this.j == 1) {
                        return 1.0f;
                    }
                }
                break;
            case 2:
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    return f / (-f2);
                }
                break;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    void b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.f620b.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!a.this.e) {
                return;
            }
            if (a.this.f621c) {
                a.this.f621c = false;
                a.this.f619a.a();
            }
            C0019a c0019a = a.this.f619a;
            if (c0019a.c() || !a.this.a()) {
                a.this.e = false;
                return;
            }
            if (a.this.f622d) {
                a.this.f622d = false;
                a.this.b();
            }
            c0019a.d();
            a.this.a(c0019a.g(), c0019a.h());
            s.a(a.this.f620b, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* renamed from: android.support.v4.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0019a {

        /* renamed from: a  reason: collision with root package name */
        private int f623a;

        /* renamed from: b  reason: collision with root package name */
        private int f624b;

        /* renamed from: c  reason: collision with root package name */
        private float f625c;

        /* renamed from: d  reason: collision with root package name */
        private float f626d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        private float a(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        C0019a() {
        }

        public void a(int i) {
            this.f623a = i;
        }

        public void b(int i) {
            this.f624b = i;
        }

        public void a() {
            this.e = AnimationUtils.currentAnimationTimeMillis();
            this.i = -1L;
            this.f = this.e;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }

        public void b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.a((int) (currentAnimationTimeMillis - this.e), 0, this.f624b);
            this.j = a(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public boolean c() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        private float a(long j) {
            if (j < this.e) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (this.i < 0 || j < this.i) {
                return a.a(((float) (j - this.e)) / this.f623a, (float) BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
            }
            return (1.0f - this.j) + (this.j * a.a(((float) (j - this.i)) / this.k, (float) BitmapDescriptorFactory.HUE_RED, 1.0f));
        }

        public void d() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a2 = a(a(currentAnimationTimeMillis));
            this.f = currentAnimationTimeMillis;
            float f = ((float) (currentAnimationTimeMillis - this.f)) * a2;
            this.g = (int) (this.f625c * f);
            this.h = (int) (f * this.f626d);
        }

        public void a(float f, float f2) {
            this.f625c = f;
            this.f626d = f2;
        }

        public int e() {
            return (int) (this.f625c / Math.abs(this.f625c));
        }

        public int f() {
            return (int) (this.f626d / Math.abs(this.f626d));
        }

        public int g() {
            return this.g;
        }

        public int h() {
            return this.h;
        }
    }
}
