package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: awp  reason: default package */
/* loaded from: classes3.dex */
public final class awp extends Drawable implements Animatable {
    private static final Interpolator d = new LinearInterpolator();
    private static final Interpolator e = new aoo();
    private static final int[] f = {-16777216};
    public final awo a;
    float b;
    boolean c;
    private float g;
    private final Resources h;
    private final Animator i;

    public awp(Context context) {
        nb.b(context);
        this.h = context.getResources();
        awo awoVar = new awo();
        this.a = awoVar;
        awoVar.a(f);
        awoVar.d(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new awm(this, awoVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(d);
        ofFloat.addListener(new awn(this, awoVar));
        this.i = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f(float f2, awo awoVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int e2 = awoVar.e();
            int i = awoVar.i[awoVar.c()];
            int i2 = (e2 >> 24) & 255;
            int i3 = (e2 >> 16) & 255;
            int i4 = (e2 >> 8) & 255;
            int i5 = e2 & 255;
            awoVar.u = ((i2 + ((int) ((((i >> 24) & 255) - i2) * f3))) << 24) | ((i3 + ((int) ((((i >> 16) & 255) - i3) * f3))) << 16) | ((i4 + ((int) ((((i >> 8) & 255) - i4) * f3))) << 8) | (i5 + ((int) (f3 * ((i & 255) - i5))));
            return;
        }
        awoVar.u = awoVar.e();
    }

    private final void g(float f2, float f3, float f4, float f5) {
        awo awoVar = this.a;
        float f6 = this.h.getDisplayMetrics().density;
        awoVar.d(f3 * f6);
        awoVar.q = f2 * f6;
        awoVar.b(0);
        awoVar.r = (int) (f4 * f6);
        awoVar.s = (int) (f5 * f6);
    }

    public final void a(int i) {
        if (i == 0) {
            g(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            g(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void b(boolean z) {
        this.a.f(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        awo awoVar = this.a;
        if (f2 != awoVar.p) {
            awoVar.p = f2;
        }
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(float f2, awo awoVar, boolean z) {
        float interpolation;
        float f3;
        if (this.c) {
            f(f2, awoVar);
            double floor = Math.floor(awoVar.m / 0.8f);
            float f4 = awoVar.k;
            float f5 = awoVar.l;
            awoVar.e = f4 + ((((-0.01f) + f5) - f4) * f2);
            awoVar.f = f5;
            float f6 = awoVar.m;
            awoVar.g = f6 + ((((float) (floor + 1.0d)) - f6) * f2);
        } else if (f2 == 1.0f && !z) {
        } else {
            float f7 = awoVar.m;
            if (f2 < 0.5f) {
                interpolation = awoVar.k;
                f3 = (e.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = awoVar.k + 0.79f;
                interpolation = f8 - (((1.0f - e.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            float f9 = this.b;
            awoVar.e = interpolation;
            awoVar.f = f3;
            awoVar.g = f7 + (0.20999998f * f2);
            this.g = (f2 + f9) * 216.0f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.g, bounds.exactCenterX(), bounds.exactCenterY());
        awo awoVar = this.a;
        RectF rectF = awoVar.a;
        float f2 = awoVar.q;
        float f3 = (awoVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((awoVar.r * awoVar.p) / 2.0f, awoVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = awoVar.e;
        float f5 = awoVar.g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((awoVar.f + f5) * 360.0f) - f6;
        awoVar.b.setColor(awoVar.u);
        awoVar.b.setAlpha(awoVar.t);
        float f8 = awoVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, awoVar.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, awoVar.b);
        if (awoVar.n) {
            Path path = awoVar.o;
            if (path == null) {
                awoVar.o = new Path();
                awoVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height());
            int i = awoVar.r;
            float f10 = awoVar.p;
            awoVar.o.moveTo(0.0f, 0.0f);
            awoVar.o.lineTo(awoVar.r * awoVar.p, 0.0f);
            Path path2 = awoVar.o;
            int i2 = awoVar.r;
            float f11 = awoVar.p;
            path2.lineTo((i2 * f11) / 2.0f, awoVar.s * f11);
            awoVar.o.offset(((min / 2.0f) + rectF.centerX()) - ((i * f10) / 2.0f), rectF.centerY() + (awoVar.h / 2.0f));
            awoVar.o.close();
            awoVar.c.setColor(awoVar.u);
            awoVar.c.setAlpha(awoVar.t);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(awoVar.o, awoVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void e(float f2) {
        awo awoVar = this.a;
        awoVar.e = 0.0f;
        awoVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        this.a.g();
        awo awoVar = this.a;
        if (awoVar.f != awoVar.e) {
            this.c = true;
            this.i.setDuration(666L);
            this.i.start();
            return;
        }
        awoVar.b(0);
        this.a.h();
        this.i.setDuration(1332L);
        this.i.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.g = 0.0f;
        this.a.f(false);
        this.a.b(0);
        this.a.h();
        invalidateSelf();
    }
}
