package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import java.lang.reflect.Constructor;
/* compiled from: PG */
/* renamed from: alky  reason: default package */
/* loaded from: classes.dex */
public final class alky {
    private float A;
    private float B;
    private float C;
    private Typeface D;
    private Typeface E;
    private Typeface F;
    private CharSequence G;
    private float H;
    private float I;

    /* renamed from: J  reason: collision with root package name */
    private int[] f63J;
    private boolean K;
    private final TextPaint L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private float Z;
    public float a;
    private CharSequence aa;
    private almn ac;
    private almn ad;
    public boolean b;
    public float c;
    public float d;
    public int e;
    public final Rect f;
    public ColorStateList g;
    public CharSequence h;
    public boolean i;
    public final TextPaint k;
    public TimeInterpolator l;
    public StaticLayout m;
    private final View o;
    private boolean p;
    private final Rect q;
    private final RectF r;
    private ColorStateList w;
    private float x;
    private float y;
    private float z;
    private int s = 16;
    private int t = 16;
    private float u = 15.0f;
    private float v = 15.0f;
    public boolean j = true;
    public int n = 1;
    private final int ab = allg.a;

    public alky(View view) {
        this.o = view;
        TextPaint textPaint = new TextPaint(129);
        this.L = textPaint;
        this.k = new TextPaint(textPaint);
        this.f = new Rect();
        this.q = new Rect();
        this.r = new RectF();
        this.d = b();
    }

    private static int A(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int B(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f63J;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void D(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        CharSequence charSequence;
        StaticLayout staticLayout;
        Constructor constructor;
        Object[] objArr;
        Integer valueOf;
        if (this.h == null) {
            return;
        }
        float width = this.f.width();
        float width2 = this.q.width();
        if (G(f, this.v)) {
            f2 = this.v;
            this.H = 1.0f;
            Typeface typeface = this.F;
            Typeface typeface2 = this.D;
            if (typeface != typeface2) {
                this.F = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f3 = this.u;
            Typeface typeface3 = this.F;
            Typeface typeface4 = this.E;
            if (typeface3 != typeface4) {
                this.F = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (G(f, f3)) {
                this.H = 1.0f;
            } else {
                this.H = f / this.u;
            }
            float f4 = this.v / this.u;
            width = (!z && width2 * f4 > width) ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z3 = z2;
        }
        if (width > 0.0f) {
            z3 = this.I != f2 || this.K || z3;
            this.I = f2;
            this.K = false;
        }
        if (this.G != null && !z3) {
            return;
        }
        this.L.setTextSize(this.I);
        this.L.setTypeface(this.F);
        this.L.setLinearText(this.H != 1.0f);
        this.i = v(this.h);
        int i = I() ? this.n : 1;
        boolean z4 = this.i;
        try {
            allg allgVar = new allg(this.h, this.L, (int) width);
            allgVar.o = TextUtils.TruncateAt.END;
            allgVar.n = z4;
            allgVar.i = Layout.Alignment.ALIGN_NORMAL;
            allgVar.m = false;
            allgVar.j = i;
            allgVar.k = 1.0f;
            allgVar.l = this.ab;
            if (allgVar.e == null) {
                allgVar.e = "";
            }
            int max = Math.max(0, allgVar.g);
            charSequence = allgVar.e;
            if (allgVar.j == 1) {
                charSequence = TextUtils.ellipsize(charSequence, allgVar.f, max, allgVar.o);
            }
            allgVar.h = Math.min(charSequence.length(), allgVar.h);
            if (Build.VERSION.SDK_INT >= 23) {
                if (allgVar.n && allgVar.j == 1) {
                    allgVar.i = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, allgVar.h, allgVar.f, max);
                obtain.setAlignment(allgVar.i);
                obtain.setIncludePad(allgVar.m);
                obtain.setTextDirection(allgVar.n ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                TextUtils.TruncateAt truncateAt = allgVar.o;
                if (truncateAt != null) {
                    obtain.setEllipsize(truncateAt);
                }
                obtain.setMaxLines(allgVar.j);
                float f5 = allgVar.k;
                if (f5 != 1.0f) {
                    obtain.setLineSpacing(0.0f, f5);
                }
                if (allgVar.j > 1) {
                    obtain.setHyphenationFrequency(allgVar.l);
                }
                staticLayout = obtain.build();
            } else {
                if (!allg.b) {
                    try {
                        try {
                            allg.d = allgVar.n && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                            allg.c = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                            allg.c.setAccessible(true);
                            allg.b = true;
                        } catch (Exception e) {
                            throw new allf(e);
                        }
                    } catch (allf e2) {
                        e = e2;
                        Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                        staticLayout = charSequence;
                        hz.g(staticLayout);
                        this.m = staticLayout;
                        this.G = staticLayout.getText();
                    }
                }
                try {
                    constructor = allg.c;
                    hz.g(constructor);
                    objArr = new Object[13];
                    objArr[0] = charSequence;
                    objArr[1] = 0;
                    objArr[2] = Integer.valueOf(allgVar.h);
                    objArr[3] = allgVar.f;
                    valueOf = Integer.valueOf(max);
                    objArr[4] = valueOf;
                    objArr[5] = allgVar.i;
                    Object obj = allg.d;
                    hz.g(obj);
                    objArr[6] = obj;
                    objArr[7] = Float.valueOf(1.0f);
                    objArr[8] = Float.valueOf(0.0f);
                    objArr[9] = Boolean.valueOf(allgVar.m);
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    objArr[10] = null;
                    objArr[11] = valueOf;
                    objArr[12] = Integer.valueOf(allgVar.j);
                    staticLayout = (StaticLayout) constructor.newInstance(objArr);
                } catch (Exception e4) {
                    e = e4;
                    throw new allf(e);
                }
            }
        } catch (allf e5) {
            e = e5;
            charSequence = null;
        }
        hz.g(staticLayout);
        this.m = staticLayout;
        this.G = staticLayout.getText();
    }

    private final void E(TextPaint textPaint) {
        textPaint.setTextSize(this.v);
        textPaint.setTypeface(this.D);
        textPaint.setLetterSpacing(this.V);
    }

    private final void F(float f) {
        D(f, false);
        lj.G(this.o);
    }

    private static boolean G(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static boolean H(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final boolean I() {
        if (this.n > 1) {
            return !this.i || this.b;
        }
        return false;
    }

    private static float z(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return alhv.a(f, f2, f3);
    }

    public final float a() {
        if (this.h == null) {
            return 0.0f;
        }
        E(this.k);
        TextPaint textPaint = this.k;
        CharSequence charSequence = this.h;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float b() {
        float f = this.c;
        return f + ((1.0f - f) * 0.5f);
    }

    public final float c() {
        E(this.k);
        return -this.k.ascent();
    }

    public final int d() {
        return B(this.g);
    }

    public final void e(Canvas canvas) {
        int save = canvas.save();
        if (this.G == null || !this.p) {
            return;
        }
        float lineStart = this.n > 1 ? this.m.getLineStart(0) : this.m.getLineLeft(0);
        float f = this.B;
        float f2 = this.Z;
        float f3 = (f + lineStart) - (f2 + f2);
        this.L.setTextSize(this.I);
        float f4 = this.B;
        float f5 = this.C;
        float f6 = this.H;
        if (f6 != 1.0f && !this.b) {
            canvas.scale(f6, f6, f4, f5);
        }
        if (!I() || (this.b && this.a <= this.d)) {
            canvas.translate(f4, f5);
            this.m.draw(canvas);
        } else {
            int alpha = this.L.getAlpha();
            canvas.translate(f3, f5);
            float f7 = alpha;
            this.L.setAlpha((int) (this.Y * f7));
            this.m.draw(canvas);
            this.L.setAlpha((int) (this.X * f7));
            int lineBaseline = this.m.getLineBaseline(0);
            CharSequence charSequence = this.aa;
            float f8 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f8, this.L);
            if (!this.b) {
                String trim = this.aa.toString().trim();
                if (trim.endsWith("…")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                String str = trim;
                this.L.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.m.getLineEnd(0), str.length()), 0.0f, f8, (Paint) this.L);
            }
        }
        canvas.restoreToCount(save);
    }

    public final void f(TextPaint textPaint) {
        textPaint.setTextSize(this.u);
        textPaint.setTypeface(this.E);
        textPaint.setLetterSpacing(this.W);
    }

    final void g() {
        boolean z = false;
        if (this.f.width() > 0 && this.f.height() > 0 && this.q.width() > 0 && this.q.height() > 0) {
            z = true;
        }
        this.p = z;
    }

    public final void h() {
        i(false);
    }

    public final void i(boolean z) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (this.o.getHeight() <= 0 || this.o.getWidth() <= 0) {
            if (!z) {
                return;
            }
            z = true;
        }
        float f = this.I;
        D(this.v, z);
        CharSequence charSequence = this.G;
        if (charSequence != null && (staticLayout2 = this.m) != null) {
            this.aa = TextUtils.ellipsize(charSequence, this.L, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.aa;
        float f2 = 0.0f;
        float measureText = charSequence2 != null ? this.L.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.t, this.i ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.y = this.f.top;
        } else if (i == 80) {
            this.y = this.f.bottom + this.L.ascent();
        } else {
            this.y = this.f.centerY() - ((this.L.descent() - this.L.ascent()) / 2.0f);
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.A = this.f.centerX() - (measureText / 2.0f);
        } else if (i2 == 5) {
            this.A = this.f.right - measureText;
        } else {
            this.A = this.f.left;
        }
        D(this.u, z);
        float height = this.m != null ? staticLayout.getHeight() : 0.0f;
        CharSequence charSequence3 = this.G;
        float measureText2 = charSequence3 != null ? this.L.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.m;
        if (staticLayout3 != null && this.n > 1) {
            measureText2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.m;
        if (staticLayout4 != null) {
            f2 = this.n > 1 ? staticLayout4.getLineStart(0) : staticLayout4.getLineLeft(0);
        }
        this.Z = f2;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.s, this.i ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.x = this.q.top;
        } else if (i3 == 80) {
            this.x = (this.q.bottom - height) + this.L.descent();
        } else {
            this.x = this.q.centerY() - (height / 2.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.z = this.q.centerX() - (measureText2 / 2.0f);
        } else if (i4 == 5) {
            this.z = this.q.right - measureText2;
        } else {
            this.z = this.q.left;
        }
        F(f);
        C();
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (!H(this.f, i, i2, i3, i4)) {
            this.f.set(i, i2, i3, i4);
            this.K = true;
            g();
        }
    }

    public final void k(int i) {
        almm almmVar = new almm(this.o.getContext(), i);
        ColorStateList colorStateList = almmVar.i;
        if (colorStateList != null) {
            this.g = colorStateList;
        }
        float f = almmVar.j;
        if (f != 0.0f) {
            this.v = f;
        }
        ColorStateList colorStateList2 = almmVar.a;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = almmVar.e;
        this.P = almmVar.f;
        this.N = almmVar.g;
        this.V = almmVar.h;
        almn almnVar = this.ad;
        if (almnVar != null) {
            almnVar.a();
        }
        this.ad = new almn(new alkx(this, 1), almmVar.a());
        almmVar.b(this.o.getContext(), this.ad);
        h();
    }

    public final void l(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            h();
        }
    }

    public final void m(int i) {
        if (this.t != i) {
            this.t = i;
            h();
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        if (!H(this.q, i, i2, i3, i4)) {
            this.q.set(i, i2, i3, i4);
            this.K = true;
            g();
        }
    }

    public final void o(int i) {
        almm almmVar = new almm(this.o.getContext(), i);
        ColorStateList colorStateList = almmVar.i;
        if (colorStateList != null) {
            this.w = colorStateList;
        }
        float f = almmVar.j;
        if (f != 0.0f) {
            this.u = f;
        }
        ColorStateList colorStateList2 = almmVar.a;
        if (colorStateList2 != null) {
            this.U = colorStateList2;
        }
        this.S = almmVar.e;
        this.T = almmVar.f;
        this.R = almmVar.g;
        this.W = almmVar.h;
        almn almnVar = this.ac;
        if (almnVar != null) {
            almnVar.a();
        }
        this.ac = new almn(new alkx(this), almmVar.a());
        almmVar.b(this.o.getContext(), this.ac);
        h();
    }

    public final void p(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            h();
        }
    }

    public final void q(int i) {
        if (this.s != i) {
            this.s = i;
            h();
        }
    }

    public final void r(float f) {
        if (this.u != f) {
            this.u = f;
            h();
        }
    }

    public final void s(float f) {
        float d = akf.d(f);
        if (d != this.a) {
            this.a = d;
            C();
        }
    }

    public final void t(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.h, charSequence)) {
            this.h = charSequence;
            this.G = null;
            h();
        }
    }

    public final void u(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        h();
    }

    public final boolean v(CharSequence charSequence) {
        boolean z = true;
        if (lj.e(this.o) != 1) {
            z = false;
        }
        if (this.j) {
            return (z ? alq.d : alq.c).a(charSequence, charSequence.length());
        }
        return z;
    }

    public final boolean w(Typeface typeface) {
        almn almnVar = this.ad;
        if (almnVar != null) {
            almnVar.a();
        }
        if (this.D != typeface) {
            this.D = typeface;
            return true;
        }
        return false;
    }

    public final boolean x(Typeface typeface) {
        almn almnVar = this.ac;
        if (almnVar != null) {
            almnVar.a();
        }
        if (this.E != typeface) {
            this.E = typeface;
            return true;
        }
        return false;
    }

    public final boolean y(int[] iArr) {
        ColorStateList colorStateList;
        this.f63J = iArr;
        ColorStateList colorStateList2 = this.g;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.w) == null || !colorStateList.isStateful())) {
            return false;
        }
        h();
        return true;
    }

    private final void C() {
        float f;
        float f2 = this.a;
        if (this.b) {
            this.r.set(f2 < this.d ? this.q : this.f);
        } else {
            this.r.left = z(this.q.left, this.f.left, f2, this.l);
            this.r.top = z(this.x, this.y, f2, this.l);
            this.r.right = z(this.q.right, this.f.right, f2, this.l);
            this.r.bottom = z(this.q.bottom, this.f.bottom, f2, this.l);
        }
        if (!this.b) {
            this.B = z(this.z, this.A, f2, this.l);
            this.C = z(this.x, this.y, f2, this.l);
            F(z(this.u, this.v, f2, this.M));
            f = f2;
        } else if (f2 < this.d) {
            this.B = this.z;
            this.C = this.x;
            F(this.u);
            f = 0.0f;
        } else {
            this.B = this.A;
            this.C = this.y - Math.max(0, this.e);
            F(this.v);
            f = 1.0f;
        }
        this.X = 1.0f - z(0.0f, 1.0f, 1.0f - f2, alhv.b);
        lj.G(this.o);
        this.Y = z(1.0f, 0.0f, f2, alhv.b);
        lj.G(this.o);
        ColorStateList colorStateList = this.g;
        ColorStateList colorStateList2 = this.w;
        if (colorStateList != colorStateList2) {
            this.L.setColor(A(B(colorStateList2), d(), f));
        } else {
            this.L.setColor(d());
        }
        float f3 = this.V;
        float f4 = this.W;
        if (f3 != f4) {
            this.L.setLetterSpacing(z(f4, f3, f2, alhv.b));
        } else {
            this.L.setLetterSpacing(f3);
        }
        this.L.setShadowLayer(z(this.R, this.N, f2, null), z(this.S, this.O, f2, null), z(this.T, this.P, f2, null), A(B(this.U), B(this.Q), f2));
        if (this.b) {
            float f5 = this.d;
            this.L.setAlpha((int) ((f2 <= f5 ? alhv.b(1.0f, 0.0f, this.c, f5, f2) : alhv.b(0.0f, 1.0f, f5, 1.0f, f2)) * 255.0f));
        }
        lj.G(this.o);
    }
}
