package com.facebook.f.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes.dex */
public class k extends BitmapDrawable implements j, p {

    /* renamed from: a  reason: collision with root package name */
    final float[] f2433a;

    /* renamed from: b  reason: collision with root package name */
    final RectF f2434b;

    /* renamed from: c  reason: collision with root package name */
    final RectF f2435c;

    /* renamed from: d  reason: collision with root package name */
    final RectF f2436d;
    final RectF e;
    final Matrix f;
    final Matrix g;
    final Matrix h;
    final Matrix i;
    final Matrix j;
    final Matrix k;
    private boolean l;
    private boolean m;
    private final float[] n;
    private float o;
    private int p;
    private float q;
    private final Path r;
    private final Path s;
    private boolean t;
    private final Paint u;
    private final Paint v;
    private boolean w;
    private WeakReference<Bitmap> x;
    private q y;

    public k(Resources resources, Bitmap bitmap, Paint paint) {
        super(resources, bitmap);
        this.l = false;
        this.m = false;
        this.n = new float[8];
        this.f2433a = new float[8];
        this.f2434b = new RectF();
        this.f2435c = new RectF();
        this.f2436d = new RectF();
        this.e = new RectF();
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = new Matrix();
        this.i = new Matrix();
        this.j = new Matrix();
        this.k = new Matrix();
        this.o = BitmapDescriptorFactory.HUE_RED;
        this.p = 0;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = new Path();
        this.s = new Path();
        this.t = true;
        this.u = new Paint();
        this.v = new Paint(1);
        this.w = true;
        if (paint != null) {
            this.u.set(paint);
        }
        this.u.setFlags(1);
        this.v.setStyle(Paint.Style.STROKE);
    }

    @Override // com.facebook.f.e.j
    public void a(boolean z) {
        this.l = z;
        this.t = true;
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(float f) {
        int i = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        boolean z = false;
        com.facebook.common.d.i.b(i >= 0);
        Arrays.fill(this.n, f);
        if (i != 0) {
            z = true;
        }
        this.m = z;
        this.t = true;
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.n, (float) BitmapDescriptorFactory.HUE_RED);
            this.m = false;
        } else {
            com.facebook.common.d.i.a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.n, 0, 8);
            this.m = false;
            for (int i = 0; i < 8; i++) {
                this.m |= fArr[i] > BitmapDescriptorFactory.HUE_RED;
            }
        }
        this.t = true;
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(int i, float f) {
        if (this.p == i && this.o == f) {
            return;
        }
        this.p = i;
        this.o = f;
        this.t = true;
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void b(float f) {
        if (this.q != f) {
            this.q = f;
            this.t = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.f.e.p
    public void a(q qVar) {
        this.y = qVar;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.u.getAlpha()) {
            this.u.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.u.setColorFilter(colorFilter);
        super.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!a()) {
            super.draw(canvas);
            return;
        }
        b();
        c();
        d();
        int save = canvas.save();
        canvas.concat(this.j);
        canvas.drawPath(this.r, this.u);
        if (this.o > BitmapDescriptorFactory.HUE_RED) {
            this.v.setStrokeWidth(this.o);
            this.v.setColor(e.a(this.p, this.u.getAlpha()));
            canvas.drawPath(this.s, this.v);
        }
        canvas.restoreToCount(save);
    }

    boolean a() {
        return this.l || this.m || this.o > BitmapDescriptorFactory.HUE_RED;
    }

    private void b() {
        if (this.y != null) {
            this.y.a(this.h);
            this.y.a(this.f2434b);
        } else {
            this.h.reset();
            this.f2434b.set(getBounds());
        }
        this.f2436d.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getBitmap().getWidth(), getBitmap().getHeight());
        this.e.set(getBounds());
        this.f.setRectToRect(this.f2436d, this.e, Matrix.ScaleToFit.FILL);
        if (!this.h.equals(this.i) || !this.f.equals(this.g)) {
            this.w = true;
            this.h.invert(this.j);
            this.k.set(this.h);
            this.k.preConcat(this.f);
            this.i.set(this.h);
            this.g.set(this.f);
        }
        if (!this.f2434b.equals(this.f2435c)) {
            this.t = true;
            this.f2435c.set(this.f2434b);
        }
    }

    private void c() {
        if (this.t) {
            this.s.reset();
            this.f2434b.inset(this.o / 2.0f, this.o / 2.0f);
            if (this.l) {
                this.s.addCircle(this.f2434b.centerX(), this.f2434b.centerY(), Math.min(this.f2434b.width(), this.f2434b.height()) / 2.0f, Path.Direction.CW);
            } else {
                for (int i = 0; i < this.f2433a.length; i++) {
                    this.f2433a[i] = (this.n[i] + this.q) - (this.o / 2.0f);
                }
                this.s.addRoundRect(this.f2434b, this.f2433a, Path.Direction.CW);
            }
            this.f2434b.inset((-this.o) / 2.0f, (-this.o) / 2.0f);
            this.r.reset();
            this.f2434b.inset(this.q, this.q);
            if (this.l) {
                this.r.addCircle(this.f2434b.centerX(), this.f2434b.centerY(), Math.min(this.f2434b.width(), this.f2434b.height()) / 2.0f, Path.Direction.CW);
            } else {
                this.r.addRoundRect(this.f2434b, this.n, Path.Direction.CW);
            }
            this.f2434b.inset(-this.q, -this.q);
            this.r.setFillType(Path.FillType.WINDING);
            this.t = false;
        }
    }

    private void d() {
        Bitmap bitmap = getBitmap();
        if (this.x == null || this.x.get() != bitmap) {
            this.x = new WeakReference<>(bitmap);
            this.u.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            this.w = true;
        }
        if (this.w) {
            this.u.getShader().setLocalMatrix(this.k);
            this.w = false;
        }
    }
}
