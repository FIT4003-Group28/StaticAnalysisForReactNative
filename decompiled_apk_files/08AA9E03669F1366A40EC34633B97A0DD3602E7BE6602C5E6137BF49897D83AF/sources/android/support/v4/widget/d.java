package android.support.v4.widget;

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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public class d extends Drawable implements Animatable {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f634a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    private static final Interpolator f635b = new android.support.v4.j.b.b();

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f636c = {-16777216};

    /* renamed from: d  reason: collision with root package name */
    private final a f637d = new a();
    private float e;
    private Resources f;
    private Animator g;
    private float h;
    private boolean i;

    private int a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public d(Context context) {
        this.f = ((Context) android.support.v4.i.k.a(context)).getResources();
        this.f637d.a(f636c);
        a(2.5f);
        a();
    }

    private void a(float f, float f2, float f3, float f4) {
        a aVar = this.f637d;
        float f5 = this.f.getDisplayMetrics().density;
        aVar.a(f2 * f5);
        aVar.e(f * f5);
        aVar.b(0);
        aVar.a(f3 * f5, f4 * f5);
    }

    public void a(int i) {
        if (i == 0) {
            a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void a(float f) {
        this.f637d.a(f);
        invalidateSelf();
    }

    public void a(boolean z) {
        this.f637d.a(z);
        invalidateSelf();
    }

    public void b(float f) {
        this.f637d.f(f);
        invalidateSelf();
    }

    public void a(float f, float f2) {
        this.f637d.b(f);
        this.f637d.c(f2);
        invalidateSelf();
    }

    public void c(float f) {
        this.f637d.d(f);
        invalidateSelf();
    }

    public void a(int... iArr) {
        this.f637d.a(iArr);
        this.f637d.b(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f637d.a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f637d.c(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f637d.d();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f637d.a(colorFilter);
        invalidateSelf();
    }

    private void d(float f) {
        this.e = f;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.g.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.g.cancel();
        this.f637d.k();
        if (this.f637d.i() != this.f637d.e()) {
            this.i = true;
            this.g.setDuration(666L);
            this.g.start();
            return;
        }
        this.f637d.b(0);
        this.f637d.l();
        this.g.setDuration(1332L);
        this.g.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.g.cancel();
        d(BitmapDescriptorFactory.HUE_RED);
        this.f637d.a(false);
        this.f637d.b(0);
        this.f637d.l();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, a aVar) {
        if (f > 0.75f) {
            aVar.a(a((f - 0.75f) / 0.25f, aVar.h(), aVar.a()));
        } else {
            aVar.a(aVar.h());
        }
    }

    private void b(float f, a aVar) {
        a(f, aVar);
        aVar.b(aVar.f() + (((aVar.g() - 0.01f) - aVar.f()) * f));
        aVar.c(aVar.g());
        aVar.d(aVar.j() + ((((float) (Math.floor(aVar.j() / 0.8f) + 1.0d)) - aVar.j()) * f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, a aVar, boolean z) {
        float f2;
        float interpolation;
        if (this.i) {
            b(f, aVar);
        } else if (f == 1.0f && !z) {
        } else {
            float j = aVar.j();
            if (f < 0.5f) {
                float f3 = aVar.f();
                f2 = (f635b.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f3;
                interpolation = f3;
            } else {
                f2 = aVar.f() + 0.79f;
                interpolation = f2 - (((1.0f - f635b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            aVar.b(interpolation);
            aVar.c(f2);
            aVar.d(j + (0.20999998f * f));
            d((f + this.h) * 216.0f);
        }
    }

    private void a() {
        final a aVar = this.f637d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.v4.widget.d.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d.this.a(floatValue, aVar);
                d.this.a(floatValue, aVar, false);
                d.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f634a);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: android.support.v4.widget.d.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                d.this.h = BitmapDescriptorFactory.HUE_RED;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                d.this.a(1.0f, aVar, true);
                aVar.k();
                aVar.c();
                if (d.this.i) {
                    d.this.i = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    aVar.a(false);
                    return;
                }
                d.this.h += 1.0f;
            }
        });
        this.g = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public static class a {
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
        final RectF f642a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f643b = new Paint();

        /* renamed from: c  reason: collision with root package name */
        final Paint f644c = new Paint();

        /* renamed from: d  reason: collision with root package name */
        final Paint f645d = new Paint();
        float e = BitmapDescriptorFactory.HUE_RED;
        float f = BitmapDescriptorFactory.HUE_RED;
        float g = BitmapDescriptorFactory.HUE_RED;
        float h = 5.0f;
        float p = 1.0f;
        int t = 255;

        a() {
            this.f643b.setStrokeCap(Paint.Cap.SQUARE);
            this.f643b.setAntiAlias(true);
            this.f643b.setStyle(Paint.Style.STROKE);
            this.f644c.setStyle(Paint.Style.FILL);
            this.f644c.setAntiAlias(true);
            this.f645d.setColor(0);
        }

        void a(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f642a;
            float f = this.q + (this.h / 2.0f);
            if (this.q <= BitmapDescriptorFactory.HUE_RED) {
                f = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f, rect.centerY() - f, rect.centerX() + f, rect.centerY() + f);
            float f2 = (this.e + this.g) * 360.0f;
            float f3 = ((this.f + this.g) * 360.0f) - f2;
            this.f643b.setColor(this.u);
            this.f643b.setAlpha(this.t);
            float f4 = this.h / 2.0f;
            rectF.inset(f4, f4);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f645d);
            float f5 = -f4;
            rectF.inset(f5, f5);
            canvas.drawArc(rectF, f2, f3, false, this.f643b);
            a(canvas, f2, f3, rectF);
        }

        void a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                if (this.o == null) {
                    this.o = new Path();
                    this.o.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    this.o.reset();
                }
                this.o.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.o.lineTo(this.r * this.p, BitmapDescriptorFactory.HUE_RED);
                this.o.lineTo((this.r * this.p) / 2.0f, this.s * this.p);
                this.o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.r * this.p) / 2.0f), rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.f644c.setColor(this.u);
                this.f644c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.f644c);
                canvas.restore();
            }
        }

        void a(int[] iArr) {
            this.i = iArr;
            b(0);
        }

        void a(int i) {
            this.u = i;
        }

        void b(int i) {
            this.j = i;
            this.u = this.i[this.j];
        }

        int a() {
            return this.i[b()];
        }

        int b() {
            return (this.j + 1) % this.i.length;
        }

        void c() {
            b(b());
        }

        void a(ColorFilter colorFilter) {
            this.f643b.setColorFilter(colorFilter);
        }

        void c(int i) {
            this.t = i;
        }

        int d() {
            return this.t;
        }

        void a(float f) {
            this.h = f;
            this.f643b.setStrokeWidth(f);
        }

        void b(float f) {
            this.e = f;
        }

        float e() {
            return this.e;
        }

        float f() {
            return this.k;
        }

        float g() {
            return this.l;
        }

        int h() {
            return this.i[this.j];
        }

        void c(float f) {
            this.f = f;
        }

        float i() {
            return this.f;
        }

        void d(float f) {
            this.g = f;
        }

        void e(float f) {
            this.q = f;
        }

        void a(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        void f(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }

        float j() {
            return this.m;
        }

        void k() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        void l() {
            this.k = BitmapDescriptorFactory.HUE_RED;
            this.l = BitmapDescriptorFactory.HUE_RED;
            this.m = BitmapDescriptorFactory.HUE_RED;
            b(BitmapDescriptorFactory.HUE_RED);
            c(BitmapDescriptorFactory.HUE_RED);
            d(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
