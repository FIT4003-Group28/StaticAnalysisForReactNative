package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: DrawBorder.java */
/* loaded from: classes.dex */
final class g extends a {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f3396c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f3397d = new float[4];
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = 0;
    private int n;
    private DashPathEffect o;
    private Path p;

    private static float a(float f, float f2) {
        return (f == BitmapDescriptorFactory.HUE_RED || f != f) ? f2 : f;
    }

    private static int a(float f, float f2, float f3, float f4, int i, int i2, int i3, int i4) {
        int i5 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        int i6 = -1;
        int i7 = i5 > 0 ? i : -1;
        int i8 = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        int i9 = i7 & (i8 > 0 ? i2 : -1);
        int i10 = (f3 > BitmapDescriptorFactory.HUE_RED ? 1 : (f3 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        int i11 = i9 & (i10 > 0 ? i3 : -1);
        int i12 = (f4 > BitmapDescriptorFactory.HUE_RED ? 1 : (f4 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i12 > 0) {
            i6 = i4;
        }
        int i13 = i11 & i6;
        if (i5 <= 0) {
            i = 0;
        }
        if (i8 <= 0) {
            i2 = 0;
        }
        int i14 = i | i2;
        if (i10 <= 0) {
            i3 = 0;
        }
        int i15 = i14 | i3;
        if (i12 <= 0) {
            i4 = 0;
        }
        if (i13 == (i15 | i4)) {
            return i13;
        }
        return 0;
    }

    public void a(int i, float f) {
        if (i != 8) {
            switch (i) {
                case 0:
                    this.e = f;
                    return;
                case 1:
                    this.f = f;
                    return;
                case 2:
                    this.g = f;
                    return;
                case 3:
                    this.h = f;
                    return;
                default:
                    return;
            }
        }
        a(f);
    }

    public void a(String str) {
        if ("dotted".equals(str)) {
            this.m = 1;
        } else if ("dashed".equals(str)) {
            this.m = 2;
        } else {
            this.m = 0;
        }
        c(32);
    }

    public void e(int i) {
        if (i != 8) {
            switch (i) {
                case 0:
                    d(2);
                    return;
                case 1:
                    d(4);
                    return;
                case 2:
                    d(8);
                    return;
                case 3:
                    d(16);
                    return;
                default:
                    return;
            }
        }
        a(-16777216);
    }

    public void a(int i, int i2) {
        if (i != 8) {
            switch (i) {
                case 0:
                    this.i = i2;
                    c(2);
                    return;
                case 1:
                    this.j = i2;
                    c(4);
                    return;
                case 2:
                    this.k = i2;
                    c(8);
                    return;
                case 3:
                    this.l = i2;
                    c(16);
                    return;
                default:
                    return;
            }
        }
        a(i2);
    }

    public void f(int i) {
        this.n = i;
    }

    @Override // com.facebook.react.flat.b
    protected void c(Canvas canvas) {
        if (b() >= 0.5f || d() != null) {
            d(canvas);
        } else {
            e(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.flat.a
    /* renamed from: s */
    public DashPathEffect d() {
        if (b(32)) {
            switch (this.m) {
                case 1:
                    this.o = c(a());
                    break;
                case 2:
                    this.o = c(a() * 3.0f);
                    break;
                default:
                    this.o = null;
                    break;
            }
            d(32);
        }
        return this.o;
    }

    private void d(Canvas canvas) {
        if (this.n != 0) {
            f3396c.setColor(this.n);
            canvas.drawPath(e(), f3396c);
        }
        a(canvas);
    }

    private void e(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int c2 = c();
        float a2 = a();
        float o = o();
        float a3 = a(this.f, a2);
        float f = o + a3;
        int a4 = a(4, this.j, c2);
        float q = q();
        float a5 = a(this.h, a2);
        float f2 = q - a5;
        int a6 = a(16, this.l, c2);
        float n = n();
        float a7 = a(this.e, a2);
        float f3 = n + a7;
        int a8 = a(2, this.i, c2);
        float p = p();
        float a9 = a(this.g, a2);
        float f4 = p - a9;
        int a10 = a(8, this.k, c2);
        int a11 = a(a7, a3, a9, a5, a8, a4, a10, a6);
        if (a11 != 0) {
            if (Color.alpha(a11) == 0) {
                return;
            }
            if (Color.alpha(this.n) != 0) {
                f3396c.setColor(this.n);
                if (Color.alpha(a11) == 255) {
                    canvas.drawRect(f3, f, f4, f2, f3396c);
                } else {
                    canvas.drawRect(n, o, p, q, f3396c);
                }
            }
            f3396c.setColor(a11);
            if (a7 > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRect(n, o, f3, f2, f3396c);
            }
            if (a3 > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRect(f3, o, p, f, f3396c);
            }
            if (a9 > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRect(f4, f, p, q, f3396c);
            }
            if (a5 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            canvas.drawRect(n, f2, f4, q, f3396c);
            return;
        }
        if (this.p == null) {
            this.p = new Path();
        }
        if (Color.alpha(this.n) != 0) {
            f3396c.setColor(this.n);
            canvas.drawRect(n, o, p, q, f3396c);
        }
        if (a3 == BitmapDescriptorFactory.HUE_RED || Color.alpha(a4) == 0) {
            i = a10;
            i2 = a8;
            i3 = a6;
        } else {
            f3396c.setColor(a4);
            i = a10;
            i2 = a8;
            i3 = a6;
            a(this.p, o, f, n, f3, p, f4);
            canvas.drawPath(this.p, f3396c);
        }
        if (a5 != BitmapDescriptorFactory.HUE_RED && Color.alpha(i3) != 0) {
            f3396c.setColor(i3);
            b(this.p, q, f2, n, f3, p, f4);
            canvas.drawPath(this.p, f3396c);
        }
        if (a7 != BitmapDescriptorFactory.HUE_RED && Color.alpha(i2) != 0) {
            f3396c.setColor(i2);
            c(this.p, o, f, q, f2, n, f3);
            canvas.drawPath(this.p, f3396c);
        }
        if (a9 == BitmapDescriptorFactory.HUE_RED || Color.alpha(i) == 0) {
            return;
        }
        f3396c.setColor(i);
        d(this.p, o, f, q, f2, p, f4);
        canvas.drawPath(this.p, f3396c);
    }

    private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        path.reset();
        path.moveTo(f3, f);
        path.lineTo(f4, f2);
        path.lineTo(f6, f2);
        path.lineTo(f5, f);
        path.lineTo(f3, f);
    }

    private static void b(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        path.reset();
        path.moveTo(f3, f);
        path.lineTo(f5, f);
        path.lineTo(f6, f2);
        path.lineTo(f4, f2);
        path.lineTo(f3, f);
    }

    private static void c(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        path.reset();
        path.moveTo(f5, f);
        path.lineTo(f6, f2);
        path.lineTo(f6, f4);
        path.lineTo(f5, f3);
        path.lineTo(f5, f);
    }

    private static void d(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        path.reset();
        path.moveTo(f5, f);
        path.lineTo(f5, f3);
        path.lineTo(f6, f4);
        path.lineTo(f6, f2);
        path.lineTo(f5, f);
    }

    private int a(int i, int i2, int i3) {
        return b(i) ? i2 : i3;
    }

    private static DashPathEffect c(float f) {
        for (int i = 0; i < 4; i++) {
            f3397d[i] = f;
        }
        return new DashPathEffect(f3397d, BitmapDescriptorFactory.HUE_RED);
    }
}
