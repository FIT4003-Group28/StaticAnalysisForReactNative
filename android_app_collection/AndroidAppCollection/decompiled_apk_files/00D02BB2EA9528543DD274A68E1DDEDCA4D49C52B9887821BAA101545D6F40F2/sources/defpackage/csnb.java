package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: csnb  reason: default package */
/* loaded from: classes5.dex */
public final class csnb extends Drawable implements csmr {
    public int a;
    public int b;
    public int c;
    public final ObjectAnimator d;
    public float e;
    public boolean f;
    public double g;
    public Runnable h;
    private final int i;
    private int j;
    private final Paint k;
    private final cskv l;
    private final csky m;
    private final ObjectAnimator n;
    private final float o;
    private float p;
    private float q;
    private final cskz r;

    public csnb(int i, int i2, int i3, float f, int i4) {
        csna csnaVar = new csna(this);
        this.r = csnaVar;
        this.a = i;
        this.j = i2;
        this.b = i3;
        this.i = Math.round(f * 255.0f);
        this.c = i4;
        Paint paint = new Paint();
        this.k = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        float f2 = 1.0f;
        this.p = 1.0f;
        this.f = isVisible();
        this.q = 0.0f;
        double level = getLevel();
        Double.isNaN(level);
        this.g = level / 10000.0d;
        this.o = 1.0f;
        this.e = i4 != 2 ? 0.0f : f2;
        cskv cskvVar = new cskv();
        this.l = cskvVar;
        double level2 = getLevel();
        Double.isNaN(level2);
        cskvVar.d(level2 / 10000.0d);
        cskvVar.c(this.g);
        cskvVar.b();
        cskvVar.e(csnaVar);
        this.m = new csky(cskvVar);
        this.n = csnc.a(this);
        ObjectAnimator b = csnc.b(this);
        b.addListener(new csmz(this));
        this.d = b;
    }

    @Override // defpackage.csmr
    public final void a(Runnable runnable) {
        this.h = runnable;
        setVisible(false, false);
    }

    @Override // defpackage.csmr
    public final void b() {
        this.f = false;
        if (super.setVisible(false, false)) {
            this.n.cancel();
            this.d.cancel();
            d();
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.h = null;
    }

    public final void c(int i) {
        this.j = i;
        invalidateSelf();
    }

    public final void d() {
        cskv cskvVar = this.l;
        double level = getLevel();
        Double.isNaN(level);
        cskvVar.d(level / 10000.0d);
        this.m.b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        canvas.save();
        float height = getBounds().height();
        float f = this.a;
        if (height > f) {
            canvas.translate(0.0f, (height - f) / 2.0f);
        }
        canvas.scale(bounds.width() / 10000.0f, this.a / 4.0f);
        canvas.translate(5000.0f, 2.0f);
        if (this.q < 1.0f) {
            if (this.c == 0) {
                canvas.scale(1.0f, -1.0f);
            }
            canvas.translate(0.0f, (this.q - 1.0f) * 4.0f * 0.5f);
            canvas.scale(1.0f, this.q);
        }
        int i = this.b;
        if (i != -1) {
            this.k.setColor(i);
        } else {
            this.k.setColor(this.j);
        }
        this.k.setAlpha((int) (this.i * this.p));
        canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.k);
        this.k.setColor(this.j);
        this.k.setAlpha((int) (this.p * 255.0f));
        canvas.drawRect(-5000.0f, -2.0f, ((float) (this.g * 10000.0d)) - 5000.0f, 2.0f, this.k);
        canvas.restore();
    }

    public float getGrowScale() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        cskv cskvVar = this.l;
        double d = i;
        Double.isNaN(d);
        cskvVar.c(d / 10000.0d);
        this.m.a();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.p = i / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.q = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f;
        if (z3 || z2) {
            this.f = z;
            if (z) {
                super.setVisible(true, z2);
                if (z2) {
                    d();
                    this.n.cancel();
                    this.d.cancel();
                    this.q = this.e;
                }
                this.d.cancel();
                this.n.setFloatValues(this.o);
                this.n.start();
                this.h = null;
            } else if (z3) {
                this.n.cancel();
                this.d.setFloatValues(this.e);
                this.d.start();
            }
            return z3;
        }
        return false;
    }
}
