package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: csmu  reason: default package */
/* loaded from: classes5.dex */
public final class csmu extends Drawable implements csmr {
    private static final LinearInterpolator d = new LinearInterpolator();
    public boolean a;
    public float b;
    public Runnable c;
    private final ValueAnimator e;
    private final ValueAnimator f;
    private float g;
    private int j;
    private final Paint k;
    private final int l;
    private final int m;
    private final cskv o;
    private final csky p;
    private final RectF h = new RectF();
    private final Rect i = new Rect();
    private int q = 255;
    private final float n = -1.0f;

    public csmu(int i, int i2, int i3) {
        this.l = i;
        this.m = i2;
        this.j = i3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        ofFloat.setDuration(750L);
        LinearInterpolator linearInterpolator = d;
        ofFloat.setInterpolator(linearInterpolator);
        this.e = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        ofFloat2.addListener(new csmt(this));
        ofFloat2.setDuration(750L);
        ofFloat2.setInterpolator(linearInterpolator);
        this.f = ofFloat2;
        Paint paint = new Paint();
        this.k = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.a = false;
        this.b = getLevel() / 10000;
        cskv cskvVar = new cskv();
        this.o = cskvVar;
        double level = getLevel();
        Double.isNaN(level);
        cskvVar.d(level / 10000.0d);
        cskvVar.c(this.b);
        cskvVar.b();
        cskvVar.e(new csms(this));
        this.p = new csky(cskvVar);
        setVisible(false, false);
    }

    @Override // defpackage.csmr
    public final void a(Runnable runnable) {
        this.c = runnable;
        setVisible(false, false);
    }

    @Override // defpackage.csmr
    public final void b() {
        this.a = false;
        if (super.setVisible(false, false)) {
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
            e();
        }
        this.c = null;
    }

    public final void c(int i) {
        this.j = i;
        invalidateSelf();
    }

    public final void d() {
        e();
        if (this.e.isStarted()) {
            this.e.cancel();
        }
        if (this.f.isStarted()) {
            this.f.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        if (this.n != -1.0f) {
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            this.i.left = centerX - (getIntrinsicWidth() / 2);
            this.i.right = centerX + (getIntrinsicWidth() / 2);
            this.i.top = centerY - (getIntrinsicHeight() / 2);
            this.i.bottom = centerY + (getIntrinsicHeight() / 2);
            rect = this.i;
        } else {
            rect = getBounds();
        }
        int i = this.l;
        float f = this.g;
        float f2 = i * f;
        int i2 = (int) (this.q * f);
        float f3 = (this.m + i) - (f2 / 2.0f);
        this.k.setStrokeWidth(f2);
        this.h.set(rect);
        this.h.inset(f3, f3);
        float width = this.h.width();
        float f4 = this.b;
        this.k.setColor(this.j);
        this.k.setAlpha((int) (i2 * 0.2f));
        canvas.drawOval(this.h, this.k);
        this.k.setAlpha(i2);
        double d2 = (width / 2.0f) - f2;
        Double.isNaN(d2);
        double d3 = f2 * 180.0f;
        Double.isNaN(d3);
        float max = Math.max(f4 * 360.0f, (float) ((d2 * 3.141592653589793d) / d3));
        if (max < 5.0f) {
            return;
        }
        canvas.drawArc(this.h, -90.0f, max, false, this.k);
    }

    public final void e() {
        cskv cskvVar = this.o;
        double level = getLevel();
        Double.isNaN(level);
        cskvVar.d(level / 10000.0d);
        this.p.b();
    }

    public float getAlphaFraction() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.n;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.n;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        cskv cskvVar = this.o;
        double d2 = i;
        Double.isNaN(d2);
        cskvVar.c(d2 / 10000.0d);
        this.p.a();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.q) {
            this.q = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (z3 || z2) {
            this.a = z;
            if (z) {
                super.setVisible(true, z2);
                if (this.f.isRunning()) {
                    this.e.setCurrentPlayTime(750 - this.f.getCurrentPlayTime());
                    this.f.cancel();
                }
                if (z2) {
                    d();
                    this.e.start();
                } else {
                    this.e.start();
                }
                this.c = null;
            } else if (z3) {
                if (this.e.isRunning()) {
                    this.f.setCurrentPlayTime(750 - this.e.getCurrentPlayTime());
                    this.e.cancel();
                }
                this.f.start();
            } else {
                d();
            }
            return z3;
        }
        return false;
    }
}
