package com.facebook.f.d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.f.e.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: DebugControllerOverlayDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private String f2402a;

    /* renamed from: b  reason: collision with root package name */
    private int f2403b;

    /* renamed from: c  reason: collision with root package name */
    private int f2404c;

    /* renamed from: d  reason: collision with root package name */
    private int f2405d;
    private String e;
    private o.b f;
    private int g;
    private int h;
    private int i = 80;
    private final Paint j = new Paint(1);
    private final Matrix k = new Matrix();
    private final Rect l = new Rect();
    private final RectF m = new RectF();
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public a() {
        a();
    }

    public void a() {
        this.f2403b = -1;
        this.f2404c = -1;
        this.f2405d = -1;
        this.g = -1;
        this.h = -1;
        this.e = null;
        a((String) null);
        invalidateSelf();
    }

    public void a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f2402a = str;
        invalidateSelf();
    }

    public void a(int i, int i2) {
        this.f2403b = i;
        this.f2404c = i2;
        invalidateSelf();
    }

    public void a(int i) {
        this.f2405d = i;
    }

    public void a(o.b bVar) {
        this.f = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect, 7, 7);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth(2.0f);
        this.j.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.j);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setColor(a(this.f2403b, this.f2404c, this.f));
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.j);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        this.j.setColor(-1);
        this.q = this.n;
        this.r = this.o;
        a(canvas, "ID: %s", this.f2402a);
        a(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        a(canvas, "I: %dx%d", Integer.valueOf(this.f2403b), Integer.valueOf(this.f2404c));
        a(canvas, "I: %d KiB", Integer.valueOf(this.f2405d / 1024));
        if (this.e != null) {
            a(canvas, "i format: %s", this.e);
        }
        if (this.g > 0) {
            a(canvas, "anim: f %d, l %d", Integer.valueOf(this.g), Integer.valueOf(this.h));
        }
        if (this.f != null) {
            a(canvas, "scale: %s", this.f);
        }
    }

    private void a(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(12, Math.min(rect.width() / i2, rect.height() / i)));
        this.j.setTextSize(min);
        this.p = min + 8;
        if (this.i == 80) {
            this.p *= -1;
        }
        this.n = rect.left + 10;
        this.o = this.i == 80 ? rect.bottom - 10 : rect.top + 10 + 12;
    }

    private void a(Canvas canvas, String str, Object... objArr) {
        if (objArr == null) {
            canvas.drawText(str, this.q, this.r, this.j);
        } else {
            canvas.drawText(String.format(str, objArr), this.q, this.r, this.j);
        }
        this.r += this.p;
    }

    int a(int i, int i2, o.b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return 1727284022;
        }
        if (bVar != null) {
            Rect rect = this.l;
            this.l.top = 0;
            rect.left = 0;
            this.l.right = width;
            this.l.bottom = height;
            this.k.reset();
            bVar.a(this.k, this.l, i, i2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            RectF rectF = this.m;
            this.m.top = BitmapDescriptorFactory.HUE_RED;
            rectF.left = BitmapDescriptorFactory.HUE_RED;
            this.m.right = i;
            this.m.bottom = i2;
            this.k.mapRect(this.m);
            width = Math.min(width, (int) this.m.width());
            height = Math.min(height, (int) this.m.height());
        }
        float f = width;
        float f2 = f * 0.1f;
        float f3 = f * 0.5f;
        float f4 = height;
        float f5 = 0.1f * f4;
        float f6 = f4 * 0.5f;
        int abs = Math.abs(i - width);
        int abs2 = Math.abs(i2 - height);
        float f7 = abs;
        if (f7 < f2 && abs2 < f5) {
            return 1716301648;
        }
        return (f7 >= f3 || ((float) abs2) >= f6) ? 1727284022 : 1728026624;
    }
}
