package a.q.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.g;
/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f517h = new LinearInterpolator();
    private static final Interpolator i = new a.l.a.a.b();
    private static final int[] j = {-16777216};

    /* renamed from: b  reason: collision with root package name */
    private final c f518b;

    /* renamed from: c  reason: collision with root package name */
    private float f519c;

    /* renamed from: d  reason: collision with root package name */
    private Resources f520d;

    /* renamed from: e  reason: collision with root package name */
    private Animator f521e;

    /* renamed from: f  reason: collision with root package name */
    float f522f;

    /* renamed from: g  reason: collision with root package name */
    boolean f523g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f524a;

        a(c cVar) {
            this.f524a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.a(floatValue, this.f524a);
            b.this.a(floatValue, this.f524a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.q.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0031b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f526a;

        C0031b(c cVar) {
            this.f526a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.a(1.0f, this.f526a, true);
            this.f526a.l();
            this.f526a.j();
            b bVar = b.this;
            if (!bVar.f523g) {
                bVar.f522f += 1.0f;
                return;
            }
            bVar.f523g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f526a.a(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f522f = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float q;
        int r;
        int s;
        int u;

        /* renamed from: a  reason: collision with root package name */
        final RectF f528a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f529b = new Paint();

        /* renamed from: c  reason: collision with root package name */
        final Paint f530c = new Paint();

        /* renamed from: d  reason: collision with root package name */
        final Paint f531d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        float f532e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        float f533f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        float f534g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        float f535h = 5.0f;
        float p = 1.0f;
        int t = 255;

        c() {
            this.f529b.setStrokeCap(Paint.Cap.SQUARE);
            this.f529b.setAntiAlias(true);
            this.f529b.setStyle(Paint.Style.STROKE);
            this.f530c.setStyle(Paint.Style.FILL);
            this.f530c.setAntiAlias(true);
            this.f531d.setColor(0);
        }

        int a() {
            return this.t;
        }

        void a(float f2) {
            if (f2 != this.p) {
                this.p = f2;
            }
        }

        void a(float f2, float f3) {
            this.r = (int) f2;
            this.s = (int) f3;
        }

        void a(int i) {
            this.t = i;
        }

        void a(Canvas canvas, float f2, float f3, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    this.o = new Path();
                    this.o.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path2 = this.o;
                float f4 = this.p;
                path2.lineTo((this.r * f4) / 2.0f, this.s * f4);
                this.o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.r * this.p) / 2.0f), rectF.centerY() + (this.f535h / 2.0f));
                this.o.close();
                this.f530c.setColor(this.u);
                this.f530c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.f530c);
                canvas.restore();
            }
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f528a;
            float f2 = this.q;
            float f3 = (this.f535h / 2.0f) + f2;
            if (f2 <= 0.0f) {
                f3 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.f535h / 2.0f);
            }
            rectF.set(rect.centerX() - f3, rect.centerY() - f3, rect.centerX() + f3, rect.centerY() + f3);
            float f4 = this.f532e;
            float f5 = this.f534g;
            float f6 = (f4 + f5) * 360.0f;
            float f7 = ((this.f533f + f5) * 360.0f) - f6;
            this.f529b.setColor(this.u);
            this.f529b.setAlpha(this.t);
            float f8 = this.f535h / 2.0f;
            rectF.inset(f8, f8);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f531d);
            float f9 = -f8;
            rectF.inset(f9, f9);
            canvas.drawArc(rectF, f6, f7, false, this.f529b);
            a(canvas, f6, f7, rectF);
        }

        void a(ColorFilter colorFilter) {
            this.f529b.setColorFilter(colorFilter);
        }

        void a(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        void a(int[] iArr) {
            this.i = iArr;
            c(0);
        }

        float b() {
            return this.f533f;
        }

        void b(float f2) {
            this.q = f2;
        }

        void b(int i) {
            this.u = i;
        }

        int c() {
            return this.i[d()];
        }

        void c(float f2) {
            this.f533f = f2;
        }

        void c(int i) {
            this.j = i;
            this.u = this.i[this.j];
        }

        int d() {
            return (this.j + 1) % this.i.length;
        }

        void d(float f2) {
            this.f534g = f2;
        }

        float e() {
            return this.f532e;
        }

        void e(float f2) {
            this.f532e = f2;
        }

        int f() {
            return this.i[this.j];
        }

        void f(float f2) {
            this.f535h = f2;
            this.f529b.setStrokeWidth(f2);
        }

        float g() {
            return this.l;
        }

        float h() {
            return this.m;
        }

        float i() {
            return this.k;
        }

        void j() {
            c(d());
        }

        void k() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            e(0.0f);
            c(0.0f);
            d(0.0f);
        }

        void l() {
            this.k = this.f532e;
            this.l = this.f533f;
            this.m = this.f534g;
        }
    }

    public b(Context context) {
        g.a(context);
        this.f520d = context.getResources();
        this.f518b = new c();
        this.f518b.a(j);
        c(2.5f);
        a();
    }

    private int a(float f2, int i2, int i3) {
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        return ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
    }

    private void a() {
        c cVar = this.f518b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f517h);
        ofFloat.addListener(new C0031b(cVar));
        this.f521e = ofFloat;
    }

    private void a(float f2, float f3, float f4, float f5) {
        c cVar = this.f518b;
        float f6 = this.f520d.getDisplayMetrics().density;
        cVar.f(f3 * f6);
        cVar.b(f2 * f6);
        cVar.c(0);
        cVar.a(f4 * f6, f5 * f6);
    }

    private void b(float f2, c cVar) {
        a(f2, cVar);
        cVar.e(cVar.i() + (((cVar.g() - 0.01f) - cVar.i()) * f2));
        cVar.c(cVar.g());
        cVar.d(cVar.h() + ((((float) (Math.floor(cVar.h() / 0.8f) + 1.0d)) - cVar.h()) * f2));
    }

    private void d(float f2) {
        this.f519c = f2;
    }

    public void a(float f2) {
        this.f518b.a(f2);
        invalidateSelf();
    }

    public void a(float f2, float f3) {
        this.f518b.e(f2);
        this.f518b.c(f3);
        invalidateSelf();
    }

    void a(float f2, c cVar) {
        cVar.b(f2 > 0.75f ? a((f2 - 0.75f) / 0.25f, cVar.f(), cVar.c()) : cVar.f());
    }

    void a(float f2, c cVar, boolean z) {
        float i2;
        float interpolation;
        if (this.f523g) {
            b(f2, cVar);
        } else if (f2 == 1.0f && !z) {
        } else {
            float h2 = cVar.h();
            if (f2 < 0.5f) {
                float i3 = cVar.i();
                i2 = (i.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + i3;
                interpolation = i3;
            } else {
                i2 = cVar.i() + 0.79f;
                interpolation = i2 - (((1.0f - i.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            cVar.e(interpolation);
            cVar.c(i2);
            cVar.d(h2 + (0.20999998f * f2));
            d((f2 + this.f522f) * 216.0f);
        }
    }

    public void a(int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (i2 == 0) {
            f2 = 11.0f;
            f3 = 3.0f;
            f4 = 12.0f;
            f5 = 6.0f;
        } else {
            f2 = 7.5f;
            f3 = 2.5f;
            f4 = 10.0f;
            f5 = 5.0f;
        }
        a(f2, f3, f4, f5);
        invalidateSelf();
    }

    public void a(boolean z) {
        this.f518b.a(z);
        invalidateSelf();
    }

    public void a(int... iArr) {
        this.f518b.a(iArr);
        this.f518b.c(0);
        invalidateSelf();
    }

    public void b(float f2) {
        this.f518b.d(f2);
        invalidateSelf();
    }

    public void c(float f2) {
        this.f518b.f(f2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f519c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f518b.a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f518b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f521e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f518b.a(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f518b.a(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j2;
        this.f521e.cancel();
        this.f518b.l();
        if (this.f518b.b() != this.f518b.e()) {
            this.f523g = true;
            animator = this.f521e;
            j2 = 666;
        } else {
            this.f518b.c(0);
            this.f518b.k();
            animator = this.f521e;
            j2 = 1332;
        }
        animator.setDuration(j2);
        this.f521e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f521e.cancel();
        d(0.0f);
        this.f518b.a(false);
        this.f518b.c(0);
        this.f518b.k();
        invalidateSelf();
    }
}
