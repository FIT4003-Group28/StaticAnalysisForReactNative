package com.facebook.f.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
/* compiled from: RoundedColorDrawable.java */
/* loaded from: classes.dex */
public class l extends Drawable implements j {
    private final float[] e = new float[8];

    /* renamed from: a  reason: collision with root package name */
    final float[] f2437a = new float[8];

    /* renamed from: b  reason: collision with root package name */
    final Paint f2438b = new Paint(1);
    private boolean f = false;
    private float g = BitmapDescriptorFactory.HUE_RED;
    private float h = BitmapDescriptorFactory.HUE_RED;
    private int i = 0;

    /* renamed from: c  reason: collision with root package name */
    final Path f2439c = new Path();

    /* renamed from: d  reason: collision with root package name */
    final Path f2440d = new Path();
    private int j = 0;
    private final RectF k = new RectF();
    private int l = 255;

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public l(int i) {
        a(i);
    }

    public static l a(ColorDrawable colorDrawable) {
        return new l(colorDrawable.getColor());
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2438b.setColor(e.a(this.j, this.l));
        this.f2438b.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.f2439c, this.f2438b);
        if (this.g != BitmapDescriptorFactory.HUE_RED) {
            this.f2438b.setColor(e.a(this.i, this.l));
            this.f2438b.setStyle(Paint.Style.STROKE);
            this.f2438b.setStrokeWidth(this.g);
            canvas.drawPath(this.f2440d, this.f2438b);
        }
    }

    @Override // com.facebook.f.e.j
    public void a(boolean z) {
        this.f = z;
        a();
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.e, (float) BitmapDescriptorFactory.HUE_RED);
        } else {
            com.facebook.common.d.i.a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.e, 0, 8);
        }
        a();
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(float f) {
        com.facebook.common.d.i.a(f >= BitmapDescriptorFactory.HUE_RED, "radius should be non negative");
        Arrays.fill(this.e, f);
        a();
        invalidateSelf();
    }

    public void a(int i) {
        if (this.j != i) {
            this.j = i;
            invalidateSelf();
        }
    }

    @Override // com.facebook.f.e.j
    public void a(int i, float f) {
        if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
        if (this.g != f) {
            this.g = f;
            a();
            invalidateSelf();
        }
    }

    @Override // com.facebook.f.e.j
    public void b(float f) {
        if (this.h != f) {
            this.h = f;
            a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.l) {
            this.l = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return e.a(e.a(this.j, this.l));
    }

    private void a() {
        this.f2439c.reset();
        this.f2440d.reset();
        this.k.set(getBounds());
        this.k.inset(this.g / 2.0f, this.g / 2.0f);
        if (this.f) {
            this.f2440d.addCircle(this.k.centerX(), this.k.centerY(), Math.min(this.k.width(), this.k.height()) / 2.0f, Path.Direction.CW);
        } else {
            for (int i = 0; i < this.f2437a.length; i++) {
                this.f2437a[i] = (this.e[i] + this.h) - (this.g / 2.0f);
            }
            this.f2440d.addRoundRect(this.k, this.f2437a, Path.Direction.CW);
        }
        this.k.inset((-this.g) / 2.0f, (-this.g) / 2.0f);
        this.k.inset(this.h, this.h);
        if (this.f) {
            this.f2439c.addCircle(this.k.centerX(), this.k.centerY(), Math.min(this.k.width(), this.k.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f2439c.addRoundRect(this.k, this.e, Path.Direction.CW);
        }
        this.k.inset(-this.h, -this.h);
    }
}
