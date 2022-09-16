package com.google.android.material.internal;

import a.g.m.v;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import c.e.a.c.x.a;
/* loaded from: classes.dex */
public final class a {
    private static final boolean V;
    private static final Paint W;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;

    /* renamed from: a  reason: collision with root package name */
    private final View f8120a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8121b;

    /* renamed from: c  reason: collision with root package name */
    private float f8122c;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private c.e.a.c.x.a v;
    private c.e.a.c.x.a w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    /* renamed from: g  reason: collision with root package name */
    private int f8126g = 16;

    /* renamed from: h  reason: collision with root package name */
    private int f8127h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private final TextPaint J = new TextPaint(129);
    private final TextPaint K = new TextPaint(this.J);

    /* renamed from: e  reason: collision with root package name */
    private final Rect f8124e = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f8123d = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final RectF f8125f = new RectF();

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0158a implements a.InterfaceC0104a {
        C0158a() {
        }

        @Override // c.e.a.c.x.a.InterfaceC0104a
        public void a(Typeface typeface) {
            a.this.a(typeface);
        }
    }

    static {
        V = Build.VERSION.SDK_INT < 18;
        W = null;
        Paint paint = W;
        if (paint != null) {
            paint.setAntiAlias(true);
            W.setColor(-65281);
        }
    }

    public a(View view) {
        this.f8120a = view;
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return c.e.a.c.l.a.a(f2, f3, f4);
    }

    private static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i) * f3) + (Color.alpha(i2) * f2)), (int) ((Color.red(i) * f3) + (Color.red(i2) * f2)), (int) ((Color.green(i) * f3) + (Color.green(i2) * f2)), (int) ((Color.blue(i) * f3) + (Color.blue(i2) * f2)));
    }

    private void a(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void b(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    private boolean b(CharSequence charSequence) {
        boolean z = true;
        if (v.p(this.f8120a) != 1) {
            z = false;
        }
        return (z ? a.g.l.e.f306d : a.g.l.e.f305c).a(charSequence, 0, charSequence.length());
    }

    private int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private void c(float f2) {
        TextPaint textPaint;
        int d2;
        e(f2);
        this.q = a(this.o, this.p, f2, this.L);
        this.r = a(this.m, this.n, f2, this.L);
        f(a(this.i, this.j, f2, this.M));
        if (this.l != this.k) {
            textPaint = this.J;
            d2 = a(n(), d(), f2);
        } else {
            textPaint = this.J;
            d2 = d();
        }
        textPaint.setColor(d2);
        this.J.setShadowLayer(a(this.R, this.N, f2, (TimeInterpolator) null), a(this.S, this.O, f2, (TimeInterpolator) null), a(this.T, this.P, f2, (TimeInterpolator) null), a(c(this.U), c(this.Q), f2));
        v.M(this.f8120a);
    }

    private boolean c(Typeface typeface) {
        c.e.a.c.x.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.s != typeface) {
            this.s = typeface;
            return true;
        }
        return false;
    }

    private void d(float f2) {
        float f3;
        boolean z;
        boolean z2;
        if (this.x == null) {
            return;
        }
        float width = this.f8124e.width();
        float width2 = this.f8123d.width();
        boolean z3 = true;
        if (a(f2, this.j)) {
            float f4 = this.j;
            this.F = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
            f3 = f4;
            z = z2;
        } else {
            f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (a(f2, this.i)) {
                this.F = 1.0f;
            } else {
                this.F = f2 / this.i;
            }
            float f5 = this.j / this.i;
            width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
        }
        if (width > 0.0f) {
            z = this.G != f3 || this.I || z;
            this.G = f3;
            this.I = false;
        }
        if (this.y != null && !z) {
            return;
        }
        this.J.setTextSize(this.G);
        this.J.setTypeface(this.u);
        TextPaint textPaint = this.J;
        if (this.F == 1.0f) {
            z3 = false;
        }
        textPaint.setLinearText(z3);
        CharSequence ellipsize = TextUtils.ellipsize(this.x, this.J, width, TextUtils.TruncateAt.END);
        if (TextUtils.equals(ellipsize, this.y)) {
            return;
        }
        this.y = ellipsize;
        this.z = b(this.y);
    }

    private boolean d(Typeface typeface) {
        c.e.a.c.x.a aVar = this.v;
        if (aVar != null) {
            aVar.a();
        }
        if (this.t != typeface) {
            this.t = typeface;
            return true;
        }
        return false;
    }

    private void e(float f2) {
        this.f8125f.left = a(this.f8123d.left, this.f8124e.left, f2, this.L);
        this.f8125f.top = a(this.m, this.n, f2, this.L);
        this.f8125f.right = a(this.f8123d.right, this.f8124e.right, f2, this.L);
        this.f8125f.bottom = a(this.f8123d.bottom, this.f8124e.bottom, f2, this.L);
    }

    private void f(float f2) {
        d(f2);
        this.A = V && this.F != 1.0f;
        if (this.A) {
            m();
        }
        v.M(this.f8120a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.j():void");
    }

    private void k() {
        c(this.f8122c);
    }

    private void l() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private void m() {
        if (this.B != null || this.f8123d.isEmpty() || TextUtils.isEmpty(this.y)) {
            return;
        }
        c(0.0f);
        this.D = this.J.ascent();
        this.E = this.J.descent();
        TextPaint textPaint = this.J;
        CharSequence charSequence = this.y;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.E - this.D);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.B);
        CharSequence charSequence2 = this.y;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.J.descent(), this.J);
        if (this.C != null) {
            return;
        }
        this.C = new Paint(3);
    }

    private int n() {
        return c(this.k);
    }

    public float a() {
        if (this.x == null) {
            return 0.0f;
        }
        a(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void a(float f2) {
        if (this.i != f2) {
            this.i = f2;
            i();
        }
    }

    public void a(int i) {
        c.e.a.c.x.d dVar = new c.e.a.c.x.d(this.f8120a.getContext(), i);
        ColorStateList colorStateList = dVar.f4788b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f2 = dVar.f4787a;
        if (f2 != 0.0f) {
            this.j = f2;
        }
        ColorStateList colorStateList2 = dVar.f4792f;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.f4793g;
        this.P = dVar.f4794h;
        this.N = dVar.i;
        c.e.a.c.x.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        this.w = new c.e.a.c.x.a(new C0158a(), dVar.a());
        dVar.a(this.f8120a.getContext(), this.w);
        i();
    }

    public void a(int i, int i2, int i3, int i4) {
        if (!a(this.f8124e, i, i2, i3, i4)) {
            this.f8124e.set(i, i2, i3, i4);
            this.I = true;
            h();
        }
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        i();
    }

    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            i();
        }
    }

    public void a(Canvas canvas) {
        float ascent;
        int save = canvas.save();
        if (this.y != null && this.f8121b) {
            float f2 = this.q;
            float f3 = this.r;
            boolean z = this.A && this.B != null;
            if (z) {
                ascent = this.D * this.F;
            } else {
                ascent = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z) {
                f3 += ascent;
            }
            float f4 = f3;
            float f5 = this.F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.B, f2, f4, this.C);
            } else {
                CharSequence charSequence = this.y;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    public void a(Rect rect) {
        a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a(RectF rectF) {
        boolean b2 = b(this.x);
        Rect rect = this.f8124e;
        rectF.left = !b2 ? rect.left : rect.right - a();
        Rect rect2 = this.f8124e;
        rectF.top = rect2.top;
        rectF.right = !b2 ? rectF.left + a() : rect2.right;
        rectF.bottom = this.f8124e.top + c();
    }

    public void a(Typeface typeface) {
        if (c(typeface)) {
            i();
        }
    }

    public void a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            l();
            i();
        }
    }

    public final boolean a(int[] iArr) {
        this.H = iArr;
        if (g()) {
            i();
            return true;
        }
        return false;
    }

    public ColorStateList b() {
        return this.l;
    }

    public void b(float f2) {
        float a2 = a.g.h.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.f8122c) {
            this.f8122c = a2;
            k();
        }
    }

    public void b(int i) {
        if (this.f8127h != i) {
            this.f8127h = i;
            i();
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        if (!a(this.f8123d, i, i2, i3, i4)) {
            this.f8123d.set(i, i2, i3, i4);
            this.I = true;
            h();
        }
    }

    public void b(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        i();
    }

    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            i();
        }
    }

    public void b(Rect rect) {
        b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void b(Typeface typeface) {
        boolean c2 = c(typeface);
        boolean d2 = d(typeface);
        if (c2 || d2) {
            i();
        }
    }

    public float c() {
        a(this.K);
        return -this.K.ascent();
    }

    public void c(int i) {
        if (this.f8126g != i) {
            this.f8126g = i;
            i();
        }
    }

    public int d() {
        return c(this.l);
    }

    public float e() {
        b(this.K);
        return -this.K.ascent();
    }

    public float f() {
        return this.f8122c;
    }

    public final boolean g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    void h() {
        this.f8121b = this.f8124e.width() > 0 && this.f8124e.height() > 0 && this.f8123d.width() > 0 && this.f8123d.height() > 0;
    }

    public void i() {
        if (this.f8120a.getHeight() <= 0 || this.f8120a.getWidth() <= 0) {
            return;
        }
        j();
        k();
    }
}
