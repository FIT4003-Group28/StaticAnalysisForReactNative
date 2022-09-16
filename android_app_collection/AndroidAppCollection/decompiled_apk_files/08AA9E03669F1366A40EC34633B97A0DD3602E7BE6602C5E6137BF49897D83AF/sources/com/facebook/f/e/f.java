package com.facebook.f.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
/* compiled from: FadeDrawable.java */
/* loaded from: classes.dex */
public class f extends a {

    /* renamed from: a  reason: collision with root package name */
    int f2419a;

    /* renamed from: b  reason: collision with root package name */
    int f2420b;

    /* renamed from: c  reason: collision with root package name */
    long f2421c;

    /* renamed from: d  reason: collision with root package name */
    int[] f2422d;
    int[] e;
    int f;
    boolean[] g;
    int h;
    private final Drawable[] i;

    public f(Drawable[] drawableArr) {
        super(drawableArr);
        com.facebook.common.d.i.b(drawableArr.length < 1 ? false : true, "At least one layer required!");
        this.i = drawableArr;
        this.f2422d = new int[drawableArr.length];
        this.e = new int[drawableArr.length];
        this.f = 255;
        this.g = new boolean[drawableArr.length];
        this.h = 0;
        g();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.h == 0) {
            super.invalidateSelf();
        }
    }

    public void b() {
        this.h++;
    }

    public void c() {
        this.h--;
        invalidateSelf();
    }

    public void c(int i) {
        this.f2420b = i;
        if (this.f2419a == 1) {
            this.f2419a = 0;
        }
    }

    private void g() {
        this.f2419a = 2;
        Arrays.fill(this.f2422d, 0);
        this.f2422d[0] = 255;
        Arrays.fill(this.e, 0);
        this.e[0] = 255;
        Arrays.fill(this.g, false);
        this.g[0] = true;
    }

    public void d(int i) {
        this.f2419a = 0;
        this.g[i] = true;
        invalidateSelf();
    }

    public void e(int i) {
        this.f2419a = 0;
        this.g[i] = false;
        invalidateSelf();
    }

    public void d() {
        this.f2419a = 0;
        Arrays.fill(this.g, true);
        invalidateSelf();
    }

    public void e() {
        this.f2419a = 2;
        for (int i = 0; i < this.i.length; i++) {
            this.e[i] = this.g[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    private boolean a(float f) {
        boolean z = true;
        for (int i = 0; i < this.i.length; i++) {
            this.e[i] = (int) (this.f2422d[i] + ((this.g[i] ? 1 : -1) * 255 * f));
            if (this.e[i] < 0) {
                this.e[i] = 0;
            }
            if (this.e[i] > 255) {
                this.e[i] = 255;
            }
            if (this.g[i] && this.e[i] < 255) {
                z = false;
            }
            if (!this.g[i] && this.e[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.f.e.a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean a2;
        int i = 2;
        switch (this.f2419a) {
            case 0:
                System.arraycopy(this.e, 0, this.f2422d, 0, this.i.length);
                this.f2421c = f();
                a2 = a(this.f2420b == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                if (!a2) {
                    i = 1;
                }
                this.f2419a = i;
                break;
            case 1:
                com.facebook.common.d.i.b(this.f2420b > 0);
                a2 = a(((float) (f() - this.f2421c)) / this.f2420b);
                if (!a2) {
                    i = 1;
                }
                this.f2419a = i;
                break;
            case 2:
            default:
                a2 = true;
                break;
        }
        for (int i2 = 0; i2 < this.i.length; i2++) {
            a(canvas, this.i[i2], (this.e[i2] * this.f) / 255);
        }
        if (!a2) {
            invalidateSelf();
        }
    }

    private void a(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.h++;
        drawable.mutate().setAlpha(i);
        this.h--;
        drawable.draw(canvas);
    }

    @Override // com.facebook.f.e.a, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f != i) {
            this.f = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f;
    }

    protected long f() {
        return SystemClock.uptimeMillis();
    }
}
