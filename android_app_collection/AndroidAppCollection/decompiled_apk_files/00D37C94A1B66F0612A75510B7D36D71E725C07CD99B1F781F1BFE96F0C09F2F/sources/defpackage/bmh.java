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
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bmh  reason: default package */
/* loaded from: classes2.dex */
public final class bmh extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new app();
    private static final int[] g = {-16777216};
    public final bmg a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public bmh(Context context) {
        hz.g(context);
        this.b = context.getResources();
        bmg bmgVar = new bmg();
        this.a = bmgVar;
        bmgVar.c(g);
        bmgVar.e(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bme(this, bmgVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new bmf(this, bmgVar));
        this.i = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(float f2, bmg bmgVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int a = bmgVar.a();
            int[] iArr = bmgVar.i;
            bmgVar.g();
            int i = iArr[0];
            int i2 = (a >> 24) & PrivateKeyType.INVALID;
            int i3 = (a >> 16) & PrivateKeyType.INVALID;
            int i4 = (a >> 8) & PrivateKeyType.INVALID;
            int i5 = a & PrivateKeyType.INVALID;
            bmgVar.t = ((i2 + ((int) ((((i >> 24) & PrivateKeyType.INVALID) - i2) * f3))) << 24) | ((i3 + ((int) ((((i >> 16) & PrivateKeyType.INVALID) - i3) * f3))) << 16) | ((i4 + ((int) ((((i >> 8) & PrivateKeyType.INVALID) - i4) * f3))) << 8) | (i5 + ((int) (f3 * ((i & PrivateKeyType.INVALID) - i5))));
            return;
        }
        bmgVar.t = bmgVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f2, bmg bmgVar, boolean z) {
        float interpolation;
        float f3;
        if (this.d) {
            e(f2, bmgVar);
            double floor = Math.floor(bmgVar.l / 0.8f);
            float f4 = bmgVar.j;
            float f5 = bmgVar.k;
            bmgVar.e = f4 + ((((-0.01f) + f5) - f4) * f2);
            bmgVar.f = f5;
            float f6 = bmgVar.l;
            bmgVar.g = f6 + ((((float) (floor + 1.0d)) - f6) * f2);
        } else if (f2 == 1.0f && !z) {
        } else {
            float f7 = bmgVar.l;
            if (f2 < 0.5f) {
                interpolation = bmgVar.j;
                f3 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = bmgVar.j + 0.79f;
                interpolation = f8 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            float f9 = this.c;
            bmgVar.e = interpolation;
            bmgVar.f = f3;
            bmgVar.g = f7 + (0.20999998f * f2);
            this.h = (f2 + f9) * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.d(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        bmg bmgVar = this.a;
        if (f2 != bmgVar.o) {
            bmgVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        bmg bmgVar = this.a;
        bmgVar.e = 0.0f;
        bmgVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        bmg bmgVar = this.a;
        RectF rectF = bmgVar.a;
        float f2 = bmgVar.p;
        float f3 = (bmgVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((bmgVar.q * bmgVar.o) / 2.0f, bmgVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = bmgVar.e;
        float f5 = bmgVar.g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((bmgVar.f + f5) * 360.0f) - f6;
        bmgVar.b.setColor(bmgVar.t);
        bmgVar.b.setAlpha(bmgVar.s);
        float f8 = bmgVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bmgVar.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, bmgVar.b);
        if (bmgVar.m) {
            Path path = bmgVar.n;
            if (path == null) {
                bmgVar.n = new Path();
                bmgVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height());
            int i = bmgVar.q;
            float f10 = bmgVar.o;
            bmgVar.n.moveTo(0.0f, 0.0f);
            bmgVar.n.lineTo(bmgVar.q * bmgVar.o, 0.0f);
            Path path2 = bmgVar.n;
            int i2 = bmgVar.q;
            float f11 = bmgVar.o;
            path2.lineTo((i2 * f11) / 2.0f, bmgVar.r * f11);
            bmgVar.n.offset(((min / 2.0f) + rectF.centerX()) - ((i * f10) / 2.0f), rectF.centerY() + (bmgVar.h / 2.0f));
            bmgVar.n.close();
            bmgVar.c.setColor(bmgVar.t);
            bmgVar.c.setAlpha(bmgVar.s);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bmgVar.n, bmgVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
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
        this.a.s = i;
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
        this.a.f();
        bmg bmgVar = this.a;
        if (bmgVar.f != bmgVar.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
            return;
        }
        bmgVar.h();
        this.a.b();
        this.i.setDuration(1332L);
        this.i.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.d(false);
        this.a.h();
        this.a.b();
        invalidateSelf();
    }
}
