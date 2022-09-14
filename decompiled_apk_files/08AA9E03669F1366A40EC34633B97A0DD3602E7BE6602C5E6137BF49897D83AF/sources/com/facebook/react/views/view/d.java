package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.ae;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: ReactViewBackgroundDrawable.java */
/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private ae f4176a;

    /* renamed from: b  reason: collision with root package name */
    private ae f4177b;

    /* renamed from: c  reason: collision with root package name */
    private ae f4178c;

    /* renamed from: d  reason: collision with root package name */
    private b f4179d;
    private PathEffect e;
    private Path f;
    private Path g;
    private Path h;
    private Path i;
    private RectF j;
    private RectF k;
    private RectF l;
    private PointF m;
    private PointF n;
    private PointF o;
    private PointF p;
    private boolean q = false;
    private float r = Float.NaN;
    private final Paint s = new Paint(1);
    private int t = 0;
    private int u = 255;
    private float[] v;
    private final Context w;
    private int x;

    /* compiled from: ReactViewBackgroundDrawable.java */
    /* loaded from: classes.dex */
    public enum a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    private static int a(float f, float f2) {
        return ((((int) f) << 24) & (-16777216)) | (((int) f2) & 16777215);
    }

    private static int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        int i11 = i9 & i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i12 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i12 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i13 | i8)) {
            return i11;
        }
        return 0;
    }

    public boolean c(int i) {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactViewBackgroundDrawable.java */
    /* loaded from: classes.dex */
    public enum b {
        SOLID,
        DASHED,
        DOTTED;

        public PathEffect a(float f) {
            switch (this) {
                case SOLID:
                    return null;
                case DASHED:
                    float f2 = f * 3.0f;
                    return new DashPathEffect(new float[]{f2, f2, f2, f2}, BitmapDescriptorFactory.HUE_RED);
                case DOTTED:
                    return new DashPathEffect(new float[]{f, f, f, f}, BitmapDescriptorFactory.HUE_RED);
                default:
                    return null;
            }
        }
    }

    public d(Context context) {
        this.w = context;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h();
        if (!a()) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    public boolean a() {
        float[] fArr;
        if (com.facebook.yoga.a.a(this.r) || this.r <= BitmapDescriptorFactory.HUE_RED) {
            if (this.v != null) {
                for (float f : this.v) {
                    if (!com.facebook.yoga.a.a(f) && f > BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.q = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.u) {
            this.u = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return com.facebook.react.views.view.a.a(com.facebook.react.views.view.a.a(this.t, this.u));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((!com.facebook.yoga.a.a(this.r) && this.r > BitmapDescriptorFactory.HUE_RED) || this.v != null) {
            g();
            outline.setConvexPath(this.h);
        } else {
            outline.setRect(getBounds());
        }
    }

    public void a(int i, float f) {
        if (this.f4176a == null) {
            this.f4176a = new ae();
        }
        if (!com.facebook.react.uimanager.c.a(this.f4176a.b(i), f)) {
            this.f4176a.a(i, f);
            if (i != 8) {
                switch (i) {
                }
                invalidateSelf();
            }
            this.q = true;
            invalidateSelf();
        }
    }

    public void a(int i, float f, float f2) {
        b(i, f);
        c(i, f2);
    }

    private void b(int i, float f) {
        if (this.f4177b == null) {
            this.f4177b = new ae(BitmapDescriptorFactory.HUE_RED);
        }
        if (!com.facebook.react.uimanager.c.a(this.f4177b.b(i), f)) {
            this.f4177b.a(i, f);
            invalidateSelf();
        }
    }

    private void c(int i, float f) {
        if (this.f4178c == null) {
            this.f4178c = new ae(255.0f);
        }
        if (!com.facebook.react.uimanager.c.a(this.f4178c.b(i), f)) {
            this.f4178c.a(i, f);
            invalidateSelf();
        }
    }

    public void a(String str) {
        b valueOf = str == null ? null : b.valueOf(str.toUpperCase(Locale.US));
        if (this.f4179d != valueOf) {
            this.f4179d = valueOf;
            this.q = true;
            invalidateSelf();
        }
    }

    public void a(float f) {
        if (!com.facebook.react.uimanager.c.a(this.r, f)) {
            this.r = f;
            this.q = true;
            invalidateSelf();
        }
    }

    public void a(float f, int i) {
        if (this.v == null) {
            this.v = new float[8];
            Arrays.fill(this.v, Float.NaN);
        }
        if (!com.facebook.react.uimanager.c.a(this.v[i], f)) {
            this.v[i] = f;
            this.q = true;
            invalidateSelf();
        }
    }

    public float b() {
        return com.facebook.yoga.a.a(this.r) ? BitmapDescriptorFactory.HUE_RED : this.r;
    }

    public float a(a aVar) {
        return a(Float.NaN, aVar);
    }

    public float a(float f, a aVar) {
        if (this.v == null) {
            return f;
        }
        float f2 = this.v[aVar.ordinal()];
        return com.facebook.yoga.a.a(f2) ? f : f2;
    }

    public void a(int i) {
        this.t = i;
        invalidateSelf();
    }

    public int c() {
        return this.x;
    }

    public boolean b(int i) {
        if (this.x != i) {
            this.x = i;
            return c(i);
        }
        return false;
    }

    public int d() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.d.a(android.graphics.Canvas):void");
    }

    private void g() {
        float max;
        float max2;
        float max3;
        float max4;
        float max5;
        float max6;
        float max7;
        float max8;
        if (!this.q) {
            return;
        }
        this.q = false;
        if (this.f == null) {
            this.f = new Path();
        }
        if (this.g == null) {
            this.g = new Path();
        }
        if (this.h == null) {
            this.h = new Path();
        }
        if (this.j == null) {
            this.j = new RectF();
        }
        if (this.k == null) {
            this.k = new RectF();
        }
        if (this.l == null) {
            this.l = new RectF();
        }
        this.f.reset();
        this.g.reset();
        this.h.reset();
        this.j.set(getBounds());
        this.k.set(getBounds());
        this.l.set(getBounds());
        RectF f = f();
        this.j.top += f.top;
        this.j.bottom -= f.bottom;
        this.j.left += f.left;
        this.j.right -= f.right;
        float b2 = b();
        float a2 = a(b2, a.TOP_LEFT);
        float a3 = a(b2, a.TOP_RIGHT);
        float a4 = a(b2, a.BOTTOM_LEFT);
        float a5 = a(b2, a.BOTTOM_RIGHT);
        if (Build.VERSION.SDK_INT >= 17) {
            boolean z = c() == 1;
            float a6 = a(a.TOP_START);
            float a7 = a(a.TOP_END);
            float a8 = a(a.BOTTOM_START);
            float a9 = a(a.BOTTOM_END);
            if (com.facebook.react.modules.i18nmanager.a.a().b(this.w)) {
                if (!com.facebook.yoga.a.a(a6)) {
                    a2 = a6;
                }
                if (!com.facebook.yoga.a.a(a7)) {
                    a3 = a7;
                }
                if (!com.facebook.yoga.a.a(a8)) {
                    a4 = a8;
                }
                if (!com.facebook.yoga.a.a(a9)) {
                    a5 = a9;
                }
                float f2 = z ? a3 : a2;
                if (z) {
                    a3 = a2;
                }
                float f3 = z ? a5 : a4;
                if (z) {
                    a5 = a4;
                }
                a4 = f3;
                a2 = f2;
            } else {
                float f4 = z ? a7 : a6;
                if (!z) {
                    a6 = a7;
                }
                float f5 = z ? a9 : a8;
                if (!z) {
                    a8 = a9;
                }
                if (!com.facebook.yoga.a.a(f4)) {
                    a2 = f4;
                }
                if (!com.facebook.yoga.a.a(a6)) {
                    a3 = a6;
                }
                if (!com.facebook.yoga.a.a(f5)) {
                    a4 = f5;
                }
                if (!com.facebook.yoga.a.a(a8)) {
                    a5 = a8;
                }
            }
        }
        float f6 = a4;
        float f7 = a5;
        this.f.addRoundRect(this.j, new float[]{Math.max(a2 - f.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(a2 - f.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(a3 - f.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(a3 - f.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(a5 - f.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(a5 - f.bottom, (float) BitmapDescriptorFactory.HUE_RED), Math.max(a4 - f.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(a4 - f.bottom, (float) BitmapDescriptorFactory.HUE_RED)}, Path.Direction.CW);
        this.g.addRoundRect(this.k, new float[]{a2, a2, a3, a3, f7, f7, f6, f6}, Path.Direction.CW);
        float a10 = this.f4176a != null ? this.f4176a.a(8) / 2.0f : BitmapDescriptorFactory.HUE_RED;
        float f8 = a2 + a10;
        float f9 = a3 + a10;
        float f10 = f7 + a10;
        float f11 = f6 + a10;
        this.h.addRoundRect(this.l, new float[]{f8, f8, f9, f9, f10, f10, f11, f11}, Path.Direction.CW);
        if (this.m == null) {
            this.m = new PointF();
        }
        this.m.x = this.j.left;
        this.m.y = this.j.top;
        a(this.j.left, this.j.top, this.j.left + (max * 2.0f), this.j.top + (max2 * 2.0f), this.k.left, this.k.top, this.j.left, this.j.top, this.m);
        if (this.p == null) {
            this.p = new PointF();
        }
        this.p.x = this.j.left;
        this.p.y = this.j.bottom;
        a(this.j.left, this.j.bottom - (max8 * 2.0f), this.j.left + (max7 * 2.0f), this.j.bottom, this.k.left, this.k.bottom, this.j.left, this.j.bottom, this.p);
        if (this.n == null) {
            this.n = new PointF();
        }
        this.n.x = this.j.right;
        this.n.y = this.j.top;
        a(this.j.right - (max3 * 2.0f), this.j.top, this.j.right, this.j.top + (max4 * 2.0f), this.k.right, this.k.top, this.j.right, this.j.top, this.n);
        if (this.o == null) {
            this.o = new PointF();
        }
        this.o.x = this.j.right;
        this.o.y = this.j.bottom;
        a(this.j.right - (max5 * 2.0f), this.j.bottom - (max6 * 2.0f), this.j.right, this.j.bottom, this.k.right, this.k.bottom, this.j.right, this.j.bottom, this.o);
    }

    private static void a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, PointF pointF) {
        double d10 = (d2 + d4) / 2.0d;
        double d11 = (d3 + d5) / 2.0d;
        double d12 = d6 - d10;
        double d13 = d7 - d11;
        double abs = Math.abs(d4 - d2) / 2.0d;
        double abs2 = Math.abs(d5 - d3) / 2.0d;
        double d14 = ((d9 - d11) - d13) / ((d8 - d10) - d12);
        double d15 = d13 - (d12 * d14);
        double d16 = abs2 * abs2;
        double d17 = abs * abs;
        double d18 = (d17 * d14 * d14) + d16;
        double d19 = abs * 2.0d * abs * d15 * d14;
        double d20 = (-(d17 * ((d15 * d15) - d16))) / d18;
        double d21 = d18 * 2.0d;
        double sqrt = ((-d19) / d21) - Math.sqrt(d20 + Math.pow(d19 / d21, 2.0d));
        double d22 = sqrt + d10;
        double d23 = (d14 * sqrt) + d15 + d11;
        if (Double.isNaN(d22) || Double.isNaN(d23)) {
            return;
        }
        pointF.x = (float) d22;
        pointF.y = (float) d23;
    }

    public float b(float f, int i) {
        if (this.f4176a == null) {
            return f;
        }
        float b2 = this.f4176a.b(i);
        return com.facebook.yoga.a.a(b2) ? f : b2;
    }

    private void h() {
        this.e = this.f4179d != null ? this.f4179d.a(e()) : null;
        this.s.setPathEffect(this.e);
    }

    public float e() {
        return (this.f4176a == null || com.facebook.yoga.a.a(this.f4176a.b(8))) ? BitmapDescriptorFactory.HUE_RED : this.f4176a.b(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(android.graphics.Canvas r26) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.d.b(android.graphics.Canvas):void");
    }

    private void a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.i == null) {
            this.i = new Path();
        }
        this.s.setColor(i);
        this.i.reset();
        this.i.moveTo(f, f2);
        this.i.lineTo(f3, f4);
        this.i.lineTo(f5, f6);
        this.i.lineTo(f7, f8);
        this.i.lineTo(f, f2);
        canvas.drawPath(this.i, this.s);
    }

    private boolean d(int i) {
        float f = Float.NaN;
        float a2 = this.f4177b != null ? this.f4177b.a(i) : Float.NaN;
        if (this.f4178c != null) {
            f = this.f4178c.a(i);
        }
        return !com.facebook.yoga.a.a(a2) && !com.facebook.yoga.a.a(f);
    }

    private int e(int i) {
        return a(this.f4178c != null ? this.f4178c.a(i) : 255.0f, this.f4177b != null ? this.f4177b.a(i) : BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (com.facebook.yoga.a.a(r4) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        r0 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF f() {
        /*
            r9 = this;
            r0 = 0
            r1 = 8
            float r0 = r9.b(r0, r1)
            r1 = 1
            float r2 = r9.b(r0, r1)
            r3 = 3
            float r3 = r9.b(r0, r3)
            r4 = 0
            float r5 = r9.b(r0, r4)
            r6 = 2
            float r0 = r9.b(r0, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 < r7) goto L75
            com.facebook.react.uimanager.ae r6 = r9.f4176a
            if (r6 == 0) goto L75
            int r6 = r9.c()
            if (r6 != r1) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            com.facebook.react.uimanager.ae r4 = r9.f4176a
            r6 = 4
            float r4 = r4.b(r6)
            com.facebook.react.uimanager.ae r6 = r9.f4176a
            r7 = 5
            float r6 = r6.b(r7)
            com.facebook.react.modules.i18nmanager.a r7 = com.facebook.react.modules.i18nmanager.a.a()
            android.content.Context r8 = r9.w
            boolean r7 = r7.b(r8)
            if (r7 == 0) goto L5e
            boolean r7 = com.facebook.yoga.a.a(r4)
            if (r7 == 0) goto L4e
            r4 = r5
        L4e:
            boolean r5 = com.facebook.yoga.a.a(r6)
            if (r5 == 0) goto L55
            goto L56
        L55:
            r0 = r6
        L56:
            if (r1 == 0) goto L5a
            r5 = r0
            goto L5b
        L5a:
            r5 = r4
        L5b:
            if (r1 == 0) goto L75
            goto L74
        L5e:
            if (r1 == 0) goto L62
            r7 = r6
            goto L63
        L62:
            r7 = r4
        L63:
            if (r1 == 0) goto L66
            goto L67
        L66:
            r4 = r6
        L67:
            boolean r1 = com.facebook.yoga.a.a(r7)
            if (r1 != 0) goto L6e
            r5 = r7
        L6e:
            boolean r1 = com.facebook.yoga.a.a(r4)
            if (r1 != 0) goto L75
        L74:
            r0 = r4
        L75:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.d.f():android.graphics.RectF");
    }
}
