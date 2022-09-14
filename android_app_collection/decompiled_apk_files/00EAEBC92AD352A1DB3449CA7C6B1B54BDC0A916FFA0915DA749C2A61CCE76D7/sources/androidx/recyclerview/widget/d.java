package androidx.recyclerview.widget;

import a.g.m.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];

    /* renamed from: a  reason: collision with root package name */
    private final int f2080a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2081b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f2082c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f2083d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2084e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2085f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f2086g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f2087h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private RecyclerView s;
    private int q = 0;
    private int r = 0;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);
    int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(500);
        }
    }

    /* loaded from: classes.dex */
    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            d.this.a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2090a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2090a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2090a) {
                this.f2090a = false;
            } else if (((Float) d.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.b(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0056d implements ValueAnimator.AnimatorUpdateListener {
        C0056d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f2082c.setAlpha(floatValue);
            d.this.f2083d.setAlpha(floatValue);
            d.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f2082c = stateListDrawable;
        this.f2083d = drawable;
        this.f2086g = stateListDrawable2;
        this.f2087h = drawable2;
        this.f2084e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2085f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2080a = i2;
        this.f2081b = i3;
        this.f2082c.setAlpha(255);
        this.f2083d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new C0056d());
        a(recyclerView);
    }

    private int a(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 < i5 && i7 >= 0) {
            return i6;
        }
        return 0;
    }

    private void a(float f2) {
        int[] e2 = e();
        float max = Math.max(e2[0], Math.min(e2[1], f2));
        if (Math.abs(this.o - max) < 2.0f) {
            return;
        }
        int a2 = a(this.p, max, e2, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (a2 != 0) {
            this.s.scrollBy(a2, 0);
        }
        this.p = max;
    }

    private void a(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = i - i2;
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 - (i5 / 2);
        this.f2086g.setBounds(0, 0, i5, i2);
        this.f2087h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i3);
        this.f2087h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f2086g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    private void b(float f2) {
        int[] f3 = f();
        float max = Math.max(f3[0], Math.min(f3[1], f2));
        if (Math.abs(this.l - max) < 2.0f) {
            return;
        }
        int a2 = a(this.m, max, f3, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (a2 != 0) {
            this.s.scrollBy(0, a2);
        }
        this.m = max;
    }

    private void b(Canvas canvas) {
        int i = this.q;
        int i2 = this.f2084e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.f2082c.setBounds(0, 0, i2, i5);
        this.f2083d.setBounds(0, 0, this.f2085f, this.r);
        if (g()) {
            this.f2083d.draw(canvas);
            canvas.translate(this.f2084e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f2082c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f2084e;
        } else {
            canvas.translate(i3, 0.0f);
            this.f2083d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f2082c.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    private void c() {
        this.s.removeCallbacks(this.B);
    }

    private void c(int i) {
        c();
        this.s.postDelayed(this.B, i);
    }

    private void d() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        c();
    }

    private int[] e() {
        int[] iArr = this.y;
        int i = this.f2081b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    private int[] f() {
        int[] iArr = this.x;
        int i = this.f2081b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    private boolean g() {
        return v.p(this.s) == 1;
    }

    private void h() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    void a() {
        this.s.invalidate();
    }

    void a(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    void a(int i, int i2) {
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        this.t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f2080a;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        this.u = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f2080a;
        if (!this.t && !this.u) {
            if (this.v == 0) {
                return;
            }
            b(0);
            return;
        }
        if (this.t) {
            float f2 = i3;
            this.l = (int) ((f2 * (i2 + (f2 / 2.0f))) / computeVerticalScrollRange);
            this.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.u) {
            float f3 = i4;
            this.o = (int) ((f3 * (i + (f3 / 2.0f))) / computeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        b(1);
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            d();
        }
        this.s = recyclerView;
        if (this.s == null) {
            return;
        }
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(boolean z) {
    }

    boolean a(float f2, float f3) {
        if (f3 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b2 && !a2) {
                return false;
            }
            if (a2) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (b2) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public void b() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    void b(int i) {
        int i2;
        if (i == 2 && this.v != 2) {
            this.f2082c.setState(D);
            c();
        }
        if (i == 0) {
            a();
        } else {
            b();
        }
        if (this.v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.v = i;
        }
        this.f2082c.setState(E);
        i2 = 1200;
        c(i2);
        this.v = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            b(0);
        } else if (this.A == 0) {
        } else {
            if (this.t) {
                b(canvas);
            }
            if (!this.u) {
                return;
            }
            a(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (!b2 && !a2) {
                return;
            }
            if (a2) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (b2) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            b(2);
        } else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            b(1);
            this.w = 0;
        } else if (motionEvent.getAction() != 2 || this.v != 2) {
        } else {
            b();
            if (this.w == 1) {
                a(motionEvent.getX());
            }
            if (this.w != 2) {
                return;
            }
            b(motionEvent.getY());
        }
    }

    boolean b(float f2, float f3) {
        if (!g() ? f2 >= this.q - this.f2084e : f2 <= this.f2084e / 2) {
            int i = this.l;
            int i2 = this.k;
            if (f3 >= i - (i2 / 2) && f3 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }
}
