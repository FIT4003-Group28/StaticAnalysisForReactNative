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
import com.facebook.react.uimanager.i0;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private i0 f6381a;

    /* renamed from: b  reason: collision with root package name */
    private i0 f6382b;

    /* renamed from: c  reason: collision with root package name */
    private i0 f6383c;

    /* renamed from: d  reason: collision with root package name */
    private c f6384d;

    /* renamed from: e  reason: collision with root package name */
    private PathEffect f6385e;

    /* renamed from: f  reason: collision with root package name */
    private Path f6386f;

    /* renamed from: g  reason: collision with root package name */
    private Path f6387g;

    /* renamed from: h  reason: collision with root package name */
    private Path f6388h;
    private Path i;
    private Path j;
    private RectF k;
    private RectF l;
    private RectF m;
    private RectF n;
    private PointF o;
    private PointF p;
    private PointF q;
    private PointF r;
    private boolean s = false;
    private float t = Float.NaN;
    private final Paint u = new Paint(1);
    private int v = 0;
    private int w = 255;
    private float[] x;
    private final Context y;
    private int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6389a = new int[c.values().length];

        static {
            try {
                f6389a[c.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6389a[c.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6389a[c.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect a(c cVar, float f2) {
            int i = a.f6389a[cVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    float f3 = f2 * 3.0f;
                    return new DashPathEffect(new float[]{f3, f3, f3, f3}, 0.0f);
                } else if (i == 3) {
                    return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
                } else {
                    return null;
                }
            }
            return null;
        }
    }

    public d(Context context) {
        this.y = context;
    }

    private static int a(float f2, float f3) {
        return ((((int) f2) << 24) & (-16777216)) | (((int) f3) & 16777215);
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
        double d18 = d16 + (d17 * d14 * d14);
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

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.d.a(android.graphics.Canvas):void");
    }

    private void a(Canvas canvas, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (i == 0) {
            return;
        }
        if (this.i == null) {
            this.i = new Path();
        }
        this.u.setColor(i);
        this.i.reset();
        this.i.moveTo(f2, f3);
        this.i.lineTo(f4, f5);
        this.i.lineTo(f6, f7);
        this.i.lineTo(f8, f9);
        this.i.lineTo(f2, f3);
        canvas.drawPath(this.i, this.u);
    }

    private void b(int i, float f2) {
        if (this.f6383c == null) {
            this.f6383c = new i0(255.0f);
        }
        if (!com.facebook.react.uimanager.d.a(this.f6383c.b(i), f2)) {
            this.f6383c.a(i, f2);
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.d.b(android.graphics.Canvas):void");
    }

    private void c(int i, float f2) {
        if (this.f6382b == null) {
            this.f6382b = new i0(0.0f);
        }
        if (!com.facebook.react.uimanager.d.a(this.f6382b.b(i), f2)) {
            this.f6382b.a(i, f2);
            invalidateSelf();
        }
    }

    private int d(int i) {
        i0 i0Var = this.f6382b;
        float a2 = i0Var != null ? i0Var.a(i) : 0.0f;
        i0 i0Var2 = this.f6383c;
        return a(i0Var2 != null ? i0Var2.a(i) : 255.0f, a2);
    }

    private boolean e(int i) {
        i0 i0Var = this.f6382b;
        float f2 = Float.NaN;
        float a2 = i0Var != null ? i0Var.a(i) : Float.NaN;
        i0 i0Var2 = this.f6383c;
        if (i0Var2 != null) {
            f2 = i0Var2.a(i);
        }
        return !com.facebook.yoga.g.a(a2) && !com.facebook.yoga.g.a(f2);
    }

    private void g() {
        if (!this.s) {
            return;
        }
        this.s = false;
        if (this.f6386f == null) {
            this.f6386f = new Path();
        }
        if (this.f6387g == null) {
            this.f6387g = new Path();
        }
        if (this.f6388h == null) {
            this.f6388h = new Path();
        }
        if (this.j == null) {
            this.j = new Path();
        }
        if (this.k == null) {
            this.k = new RectF();
        }
        if (this.l == null) {
            this.l = new RectF();
        }
        if (this.m == null) {
            this.m = new RectF();
        }
        if (this.n == null) {
            this.n = new RectF();
        }
        this.f6386f.reset();
        this.f6387g.reset();
        this.f6388h.reset();
        this.j.reset();
        this.k.set(getBounds());
        this.l.set(getBounds());
        this.m.set(getBounds());
        this.n.set(getBounds());
        float d2 = d();
        if (d2 > 0.0f) {
            float f2 = d2 * 0.5f;
            this.n.inset(f2, f2);
        }
        RectF b2 = b();
        RectF rectF = this.k;
        rectF.top += b2.top;
        rectF.bottom -= b2.bottom;
        rectF.left += b2.left;
        rectF.right -= b2.right;
        float c2 = c();
        float a2 = a(c2, b.TOP_LEFT);
        float a3 = a(c2, b.TOP_RIGHT);
        float a4 = a(c2, b.BOTTOM_LEFT);
        float a5 = a(c2, b.BOTTOM_RIGHT);
        if (Build.VERSION.SDK_INT >= 17) {
            boolean z = e() == 1;
            float a6 = a(b.TOP_START);
            float a7 = a(b.TOP_END);
            float a8 = a(b.BOTTOM_START);
            float a9 = a(b.BOTTOM_END);
            if (com.facebook.react.modules.i18nmanager.a.a().a(this.y)) {
                if (!com.facebook.yoga.g.a(a6)) {
                    a2 = a6;
                }
                if (!com.facebook.yoga.g.a(a7)) {
                    a3 = a7;
                }
                if (!com.facebook.yoga.g.a(a8)) {
                    a4 = a8;
                }
                if (!com.facebook.yoga.g.a(a9)) {
                    a5 = a9;
                }
                float f3 = z ? a3 : a2;
                if (z) {
                    a3 = a2;
                }
                float f4 = z ? a5 : a4;
                if (z) {
                    a5 = a4;
                }
                a4 = f4;
                a2 = f3;
            } else {
                float f5 = z ? a7 : a6;
                if (!z) {
                    a6 = a7;
                }
                float f6 = z ? a9 : a8;
                if (!z) {
                    a8 = a9;
                }
                if (!com.facebook.yoga.g.a(f5)) {
                    a2 = f5;
                }
                if (!com.facebook.yoga.g.a(a6)) {
                    a3 = a6;
                }
                if (!com.facebook.yoga.g.a(f6)) {
                    a4 = f6;
                }
                if (!com.facebook.yoga.g.a(a8)) {
                    a5 = a8;
                }
            }
        }
        float max = Math.max(a2 - b2.left, 0.0f);
        float max2 = Math.max(a2 - b2.top, 0.0f);
        float max3 = Math.max(a3 - b2.right, 0.0f);
        float max4 = Math.max(a3 - b2.top, 0.0f);
        float max5 = Math.max(a5 - b2.right, 0.0f);
        float max6 = Math.max(a5 - b2.bottom, 0.0f);
        float max7 = Math.max(a4 - b2.left, 0.0f);
        float max8 = Math.max(a4 - b2.bottom, 0.0f);
        float f7 = a4;
        float f8 = a5;
        this.f6386f.addRoundRect(this.k, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
        this.f6387g.addRoundRect(this.l, new float[]{a2, a2, a3, a3, f8, f8, f7, f7}, Path.Direction.CW);
        i0 i0Var = this.f6381a;
        float a10 = i0Var != null ? i0Var.a(8) / 2.0f : 0.0f;
        float f9 = a2 + a10;
        float f10 = a3 + a10;
        float f11 = f8 + a10;
        float f12 = f7 + a10;
        this.f6388h.addRoundRect(this.m, new float[]{f9, f9, f10, f10, f11, f11, f12, f12}, Path.Direction.CW);
        Path path = this.j;
        RectF rectF2 = this.n;
        float[] fArr = new float[8];
        int i = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
        fArr[0] = max + (i > 0 ? a10 : 0.0f);
        fArr[1] = (i > 0 ? a10 : 0.0f) + max2;
        int i2 = (a3 > 0.0f ? 1 : (a3 == 0.0f ? 0 : -1));
        fArr[2] = (i2 > 0 ? a10 : 0.0f) + max3;
        fArr[3] = (i2 > 0 ? a10 : 0.0f) + max4;
        int i3 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
        fArr[4] = (i3 > 0 ? a10 : 0.0f) + max5;
        fArr[5] = (i3 > 0 ? a10 : 0.0f) + max6;
        int i4 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        fArr[6] = (i4 > 0 ? a10 : 0.0f) + max7;
        if (i4 <= 0) {
            a10 = 0.0f;
        }
        fArr[7] = a10 + max8;
        path.addRoundRect(rectF2, fArr, Path.Direction.CW);
        if (this.o == null) {
            this.o = new PointF();
        }
        PointF pointF = this.o;
        RectF rectF3 = this.k;
        float f13 = rectF3.left;
        pointF.x = f13;
        float f14 = rectF3.top;
        pointF.y = f14;
        RectF rectF4 = this.l;
        a(f13, f14, (max * 2.0f) + f13, (max2 * 2.0f) + f14, rectF4.left, rectF4.top, f13, f14, pointF);
        if (this.r == null) {
            this.r = new PointF();
        }
        PointF pointF2 = this.r;
        RectF rectF5 = this.k;
        float f15 = rectF5.left;
        pointF2.x = f15;
        float f16 = rectF5.bottom;
        pointF2.y = f16;
        RectF rectF6 = this.l;
        a(f15, f16 - (max8 * 2.0f), (max7 * 2.0f) + f15, f16, rectF6.left, rectF6.bottom, f15, f16, pointF2);
        if (this.p == null) {
            this.p = new PointF();
        }
        PointF pointF3 = this.p;
        RectF rectF7 = this.k;
        float f17 = rectF7.right;
        pointF3.x = f17;
        float f18 = rectF7.top;
        pointF3.y = f18;
        RectF rectF8 = this.l;
        a(f17 - (max3 * 2.0f), f18, f17, (max4 * 2.0f) + f18, rectF8.right, rectF8.top, f17, f18, pointF3);
        if (this.q == null) {
            this.q = new PointF();
        }
        PointF pointF4 = this.q;
        RectF rectF9 = this.k;
        float f19 = rectF9.right;
        pointF4.x = f19;
        float f20 = rectF9.bottom;
        pointF4.y = f20;
        RectF rectF10 = this.l;
        a(f19 - (max5 * 2.0f), f20 - (max6 * 2.0f), f19, f20, rectF10.right, rectF10.bottom, f19, f20, pointF4);
    }

    private void h() {
        c cVar = this.f6384d;
        this.f6385e = cVar != null ? c.a(cVar, d()) : null;
        this.u.setPathEffect(this.f6385e);
    }

    public float a(float f2, int i) {
        i0 i0Var = this.f6381a;
        if (i0Var == null) {
            return f2;
        }
        float b2 = i0Var.b(i);
        return com.facebook.yoga.g.a(b2) ? f2 : b2;
    }

    public float a(float f2, b bVar) {
        float[] fArr = this.x;
        if (fArr == null) {
            return f2;
        }
        float f3 = fArr[bVar.ordinal()];
        return com.facebook.yoga.g.a(f3) ? f2 : f3;
    }

    public float a(b bVar) {
        return a(Float.NaN, bVar);
    }

    public int a() {
        return this.v;
    }

    public void a(float f2) {
        if (!com.facebook.react.uimanager.d.a(this.t, f2)) {
            this.t = f2;
            this.s = true;
            invalidateSelf();
        }
    }

    public void a(int i, float f2) {
        if (this.f6381a == null) {
            this.f6381a = new i0();
        }
        if (!com.facebook.react.uimanager.d.a(this.f6381a.b(i), f2)) {
            this.f6381a.a(i, f2);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.s = true;
            }
            invalidateSelf();
        }
    }

    public void a(int i, float f2, float f3) {
        c(i, f2);
        b(i, f3);
    }

    public void a(String str) {
        c valueOf = str == null ? null : c.valueOf(str.toUpperCase(Locale.US));
        if (this.f6384d != valueOf) {
            this.f6384d = valueOf;
            this.s = true;
            invalidateSelf();
        }
    }

    public boolean a(int i) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (com.facebook.yoga.g.a(r4) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        r0 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 8
            float r0 = r9.a(r0, r1)
            r1 = 1
            float r2 = r9.a(r0, r1)
            r3 = 3
            float r3 = r9.a(r0, r3)
            r4 = 0
            float r5 = r9.a(r0, r4)
            r6 = 2
            float r0 = r9.a(r0, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 < r7) goto L75
            com.facebook.react.uimanager.i0 r6 = r9.f6381a
            if (r6 == 0) goto L75
            int r6 = r9.e()
            if (r6 != r1) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            com.facebook.react.uimanager.i0 r4 = r9.f6381a
            r6 = 4
            float r4 = r4.b(r6)
            com.facebook.react.uimanager.i0 r6 = r9.f6381a
            r7 = 5
            float r6 = r6.b(r7)
            com.facebook.react.modules.i18nmanager.a r7 = com.facebook.react.modules.i18nmanager.a.a()
            android.content.Context r8 = r9.y
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L5e
            boolean r7 = com.facebook.yoga.g.a(r4)
            if (r7 == 0) goto L4e
            r4 = r5
        L4e:
            boolean r5 = com.facebook.yoga.g.a(r6)
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
            boolean r1 = com.facebook.yoga.g.a(r7)
            if (r1 != 0) goto L6e
            r5 = r7
        L6e:
            boolean r1 = com.facebook.yoga.g.a(r4)
            if (r1 != 0) goto L75
        L74:
            r0 = r4
        L75:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.d.b():android.graphics.RectF");
    }

    public void b(float f2, int i) {
        if (this.x == null) {
            this.x = new float[8];
            Arrays.fill(this.x, Float.NaN);
        }
        if (!com.facebook.react.uimanager.d.a(this.x[i], f2)) {
            this.x[i] = f2;
            this.s = true;
            invalidateSelf();
        }
    }

    public void b(int i) {
        this.v = i;
        invalidateSelf();
    }

    public float c() {
        if (com.facebook.yoga.g.a(this.t)) {
            return 0.0f;
        }
        return this.t;
    }

    public boolean c(int i) {
        if (this.z != i) {
            this.z = i;
            return a(i);
        }
        return false;
    }

    public float d() {
        i0 i0Var = this.f6381a;
        if (i0Var == null || com.facebook.yoga.g.a(i0Var.b(8))) {
            return 0.0f;
        }
        return this.f6381a.b(8);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h();
        if (!f()) {
            a(canvas);
        } else {
            b(canvas);
        }
    }

    public int e() {
        return this.z;
    }

    public boolean f() {
        if (com.facebook.yoga.g.a(this.t) || this.t <= 0.0f) {
            float[] fArr = this.x;
            if (fArr != null) {
                for (float f2 : fArr) {
                    if (!com.facebook.yoga.g.a(f2) && f2 > 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return com.facebook.react.views.view.a.a(com.facebook.react.views.view.a.a(this.v, this.w));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((com.facebook.yoga.g.a(this.t) || this.t <= 0.0f) && this.x == null) {
            outline.setRect(getBounds());
        } else {
            g();
            outline.setConvexPath(this.f6388h);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.w) {
            this.w = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
