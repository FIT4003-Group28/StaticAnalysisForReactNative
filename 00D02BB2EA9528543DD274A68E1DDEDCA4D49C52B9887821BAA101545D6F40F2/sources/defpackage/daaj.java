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
import android.view.Gravity;
import android.view.View;
import com.google.android.filament.R;
import java.lang.reflect.Constructor;
/* compiled from: PG */
/* renamed from: daaj  reason: default package */
/* loaded from: classes5.dex */
public final class daaj {
    private dacy A;
    private dacy B;
    private CharSequence C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private TimeInterpolator I;
    private float J;
    private float K;
    private float L;
    private ColorStateList M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private StaticLayout S;
    private float T;
    private float U;
    private float V;
    private CharSequence W;
    public float a;
    public final Rect b;
    public ColorStateList d;
    public Typeface e;
    public CharSequence f;
    public boolean g;
    public final TextPaint h;
    public TimeInterpolator i;
    public float j;
    private final View k;
    private boolean l;
    private final Rect m;
    private final RectF n;
    private ColorStateList r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private Typeface y;
    private Typeface z;
    private int o = 16;
    private int p = 16;
    public float c = 15.0f;
    private float q = 15.0f;
    private int X = 1;

    public daaj(View view) {
        this.k = view;
        TextPaint textPaint = new TextPaint(129);
        this.H = textPaint;
        this.h = new TextPaint(textPaint);
        this.b = new Rect();
        this.m = new Rect();
        this.n = new RectF();
    }

    private final boolean A(Typeface typeface) {
        dacy dacyVar = this.A;
        if (dacyVar != null) {
            dacyVar.c();
        }
        if (this.e != typeface) {
            this.e = typeface;
            return true;
        }
        return false;
    }

    private final void B() {
        float f = this.a;
        this.n.left = I(this.m.left, this.b.left, f, this.i);
        this.n.top = I(this.s, this.t, f, this.i);
        this.n.right = I(this.m.right, this.b.right, f, this.i);
        this.n.bottom = I(this.m.bottom, this.b.bottom, f, this.i);
        this.w = I(this.u, this.v, f, this.i);
        this.x = I(this.s, this.t, f, this.i);
        E(I(this.c, this.q, f, this.I));
        this.T = 1.0f - I(0.0f, 1.0f, 1.0f - f, czum.b);
        od.i(this.k);
        this.U = I(1.0f, 0.0f, f, czum.b);
        od.i(this.k);
        ColorStateList colorStateList = this.d;
        ColorStateList colorStateList2 = this.r;
        if (colorStateList != colorStateList2) {
            this.H.setColor(H(C(colorStateList2), s(), f));
        } else {
            this.H.setColor(s());
        }
        float f2 = this.R;
        float f3 = this.j;
        if (f2 != f3) {
            this.H.setLetterSpacing(I(f3, f2, f, czum.b));
        } else {
            this.H.setLetterSpacing(f2);
        }
        this.H.setShadowLayer(I(this.N, this.J, f, null), I(this.O, this.K, f, null), I(this.P, this.L, f, null), H(C(this.Q), C(this.M), f));
        od.i(this.k);
    }

    private final int C(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private final boolean D() {
        return this.X > 1 && !this.g;
    }

    private final void E(float f) {
        F(f);
        od.i(this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(float f) {
        boolean z;
        float f2;
        boolean z2;
        CharSequence charSequence;
        StaticLayout staticLayout;
        Constructor<StaticLayout> constructor;
        Object[] objArr;
        Integer valueOf;
        if (this.f == null) {
            return;
        }
        float width = this.b.width();
        float width2 = this.m.width();
        if (G(f, this.q)) {
            f2 = this.q;
            this.D = 1.0f;
            Typeface typeface = this.z;
            Typeface typeface2 = this.y;
            if (typeface != typeface2) {
                this.z = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.c;
            Typeface typeface3 = this.z;
            Typeface typeface4 = this.e;
            if (typeface3 != typeface4) {
                this.z = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (G(f, f3)) {
                this.D = 1.0f;
            } else {
                this.D = f / this.c;
            }
            float f4 = this.q / this.c;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.E != f2 || this.G || z2;
            this.E = f2;
            this.G = false;
        }
        if (this.C != null && !z2) {
            return;
        }
        this.H.setTextSize(this.E);
        this.H.setTypeface(this.z);
        this.H.setLinearText(this.D != 1.0f);
        this.g = u(this.f);
        int i = D() ? this.X : 1;
        boolean z3 = this.g;
        try {
            daau daauVar = new daau(this.f, this.H, (int) width);
            daauVar.l = TextUtils.TruncateAt.END;
            daauVar.k = z3;
            daauVar.h = Layout.Alignment.ALIGN_NORMAL;
            daauVar.j = false;
            daauVar.i = i;
            if (daauVar.d == null) {
                daauVar.d = "";
            }
            int max = Math.max(0, daauVar.f);
            charSequence = daauVar.d;
            if (daauVar.i == 1) {
                charSequence = TextUtils.ellipsize(charSequence, daauVar.e, max, daauVar.l);
            }
            daauVar.g = Math.min(charSequence.length(), daauVar.g);
            if (Build.VERSION.SDK_INT >= 23) {
                if (daauVar.k) {
                    daauVar.h = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, daauVar.g, daauVar.e, max);
                obtain.setAlignment(daauVar.h);
                obtain.setIncludePad(daauVar.j);
                obtain.setTextDirection(daauVar.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                TextUtils.TruncateAt truncateAt = daauVar.l;
                if (truncateAt != null) {
                    obtain.setEllipsize(truncateAt);
                }
                obtain.setMaxLines(daauVar.i);
                staticLayout = obtain.build();
            } else {
                try {
                    if (!daau.a) {
                        try {
                            daau.c = daauVar.k && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                            daau.b = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                            daau.b.setAccessible(true);
                            daau.a = true;
                        } catch (Exception e) {
                            throw new daat(e);
                        }
                    }
                    try {
                        constructor = daau.b;
                        nb.b(constructor);
                        objArr = new Object[13];
                        objArr[0] = charSequence;
                        objArr[1] = 0;
                        objArr[2] = Integer.valueOf(daauVar.g);
                        objArr[3] = daauVar.e;
                        valueOf = Integer.valueOf(max);
                        objArr[4] = valueOf;
                        objArr[5] = daauVar.h;
                        Object obj = daau.c;
                        nb.b(obj);
                        objArr[6] = obj;
                        objArr[7] = Float.valueOf(1.0f);
                        objArr[8] = Float.valueOf(0.0f);
                        objArr[9] = Boolean.valueOf(daauVar.j);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        objArr[10] = null;
                        objArr[11] = valueOf;
                        objArr[12] = Integer.valueOf(daauVar.i);
                        staticLayout = constructor.newInstance(objArr);
                    } catch (Exception e3) {
                        e = e3;
                        throw new daat(e);
                    }
                } catch (daat e4) {
                    e = e4;
                    e.getCause().getMessage();
                    staticLayout = charSequence;
                    nb.b(staticLayout);
                    this.S = staticLayout;
                    this.C = staticLayout.getText();
                }
            }
        } catch (daat e5) {
            e = e5;
            charSequence = null;
        }
        nb.b(staticLayout);
        this.S = staticLayout;
        this.C = staticLayout.getText();
    }

    private static boolean G(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static int H(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static float I(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return czum.a(f, f2, f3);
    }

    private static boolean J(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final void y(TextPaint textPaint) {
        textPaint.setTextSize(this.q);
        textPaint.setTypeface(this.y);
        textPaint.setLetterSpacing(this.R);
    }

    private final boolean z(Typeface typeface) {
        dacy dacyVar = this.B;
        if (dacyVar != null) {
            dacyVar.c();
        }
        if (this.y != typeface) {
            this.y = typeface;
            return true;
        }
        return false;
    }

    public final void a(TimeInterpolator timeInterpolator) {
        this.I = timeInterpolator;
        v();
    }

    public final void b(float f) {
        if (this.c != f) {
            this.c = f;
            v();
        }
    }

    public final void c(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            v();
        }
    }

    public final void d(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            v();
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        if (!J(this.m, i, i2, i3, i4)) {
            this.m.set(i, i2, i3, i4);
            this.G = true;
            i();
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        if (!J(this.b, i, i2, i3, i4)) {
            this.b.set(i, i2, i3, i4);
            this.G = true;
            i();
        }
    }

    public final float g() {
        if (this.f == null) {
            return 0.0f;
        }
        y(this.h);
        TextPaint textPaint = this.h;
        CharSequence charSequence = this.f;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float h() {
        y(this.h);
        return -this.h.ascent();
    }

    final void i() {
        boolean z = false;
        if (this.b.width() > 0 && this.b.height() > 0 && this.m.width() > 0 && this.m.height() > 0) {
            z = true;
        }
        this.l = z;
    }

    public final void j(int i) {
        if (this.o != i) {
            this.o = i;
            v();
        }
    }

    public final void k(int i) {
        if (this.p != i) {
            this.p = i;
            v();
        }
    }

    public final void l(int i) {
        dade dadeVar = new dade(this.k.getContext(), i);
        ColorStateList colorStateList = dadeVar.a;
        if (colorStateList != null) {
            this.d = colorStateList;
        }
        float f = dadeVar.k;
        if (f != 0.0f) {
            this.q = f;
        }
        ColorStateList colorStateList2 = dadeVar.b;
        if (colorStateList2 != null) {
            this.M = colorStateList2;
        }
        this.K = dadeVar.f;
        this.L = dadeVar.g;
        this.J = dadeVar.h;
        this.R = dadeVar.j;
        dacy dacyVar = this.B;
        if (dacyVar != null) {
            dacyVar.c();
        }
        this.B = new dacy(new daah(this), dadeVar.c());
        dadeVar.b(this.k.getContext(), this.B);
        v();
    }

    public final void m(int i) {
        dade dadeVar = new dade(this.k.getContext(), i);
        ColorStateList colorStateList = dadeVar.a;
        if (colorStateList != null) {
            this.r = colorStateList;
        }
        float f = dadeVar.k;
        if (f != 0.0f) {
            this.c = f;
        }
        ColorStateList colorStateList2 = dadeVar.b;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dadeVar.f;
        this.P = dadeVar.g;
        this.N = dadeVar.h;
        this.j = dadeVar.j;
        dacy dacyVar = this.A;
        if (dacyVar != null) {
            dacyVar.c();
        }
        this.A = new dacy(new daai(this), dadeVar.c());
        dadeVar.b(this.k.getContext(), this.A);
        v();
    }

    public final void n(Typeface typeface) {
        if (z(typeface)) {
            v();
        }
    }

    public final void o(Typeface typeface) {
        if (A(typeface)) {
            v();
        }
    }

    public final void p(Typeface typeface) {
        boolean z = z(typeface);
        boolean A = A(typeface);
        if (z || A) {
            v();
        }
    }

    public final void q(float f) {
        float a = akn.a(f, 0.0f, 1.0f);
        if (a != this.a) {
            this.a = a;
            B();
        }
    }

    public final boolean r(int[] iArr) {
        ColorStateList colorStateList;
        this.F = iArr;
        ColorStateList colorStateList2 = this.d;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.r) == null || !colorStateList.isStateful())) {
            return false;
        }
        v();
        return true;
    }

    public final int s() {
        return C(this.d);
    }

    public final void t(Canvas canvas) {
        int save = canvas.save();
        if (this.C == null || !this.l) {
            return;
        }
        float f = this.w;
        float lineLeft = this.S.getLineLeft(0);
        float f2 = this.V;
        float f3 = (f + lineLeft) - (f2 + f2);
        this.H.setTextSize(this.E);
        float f4 = this.w;
        float f5 = this.x;
        float f6 = this.D;
        if (f6 != 1.0f) {
            canvas.scale(f6, f6, f4, f5);
        }
        if (D()) {
            int alpha = this.H.getAlpha();
            canvas.translate(f3, f5);
            float f7 = alpha;
            this.H.setAlpha((int) (this.U * f7));
            this.S.draw(canvas);
            this.H.setAlpha((int) (this.T * f7));
            int lineBaseline = this.S.getLineBaseline(0);
            CharSequence charSequence = this.W;
            float f8 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f8, this.H);
            String trim = this.W.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.H.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.S.getLineEnd(0), str.length()), 0.0f, f8, (Paint) this.H);
        } else {
            canvas.translate(f4, f5);
            this.S.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public final boolean u(CharSequence charSequence) {
        return (od.s(this.k) == 1 ? ama.d : ama.c).a(charSequence, charSequence.length());
    }

    public final void v() {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (this.k.getHeight() <= 0 || this.k.getWidth() <= 0) {
            return;
        }
        float f = this.E;
        F(this.q);
        CharSequence charSequence = this.C;
        if (charSequence != null && (staticLayout2 = this.S) != null) {
            this.W = TextUtils.ellipsize(charSequence, this.H, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.W;
        float f2 = 0.0f;
        float measureText = charSequence2 != null ? this.H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.p, this.g ? 1 : 0);
        int i = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i == 48) {
            this.t = this.b.top;
        } else if (i == 80) {
            this.t = this.b.bottom + this.H.ascent();
        } else {
            this.t = this.b.centerY() - ((this.H.descent() - this.H.ascent()) / 2.0f);
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.v = this.b.centerX() - (measureText / 2.0f);
        } else if (i2 == 5) {
            this.v = this.b.right - measureText;
        } else {
            this.v = this.b.left;
        }
        F(this.c);
        float height = this.S != null ? staticLayout.getHeight() : 0.0f;
        CharSequence charSequence3 = this.C;
        float measureText2 = charSequence3 != null ? this.H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.S;
        if (staticLayout3 != null && this.X > 1 && !this.g) {
            measureText2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.S;
        if (staticLayout4 != null) {
            f2 = staticLayout4.getLineLeft(0);
        }
        this.V = f2;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.o, this.g ? 1 : 0);
        int i3 = absoluteGravity2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i3 == 48) {
            this.s = this.m.top;
        } else if (i3 == 80) {
            this.s = (this.m.bottom - height) + this.H.descent();
        } else {
            this.s = this.m.centerY() - (height / 2.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.u = this.m.centerX() - (measureText2 / 2.0f);
        } else if (i4 == 5) {
            this.u = this.m.right - measureText2;
        } else {
            this.u = this.m.left;
        }
        E(f);
        B();
    }

    public final void w(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f, charSequence)) {
            this.f = charSequence;
            this.C = null;
            v();
        }
    }

    public final void x(int i) {
        if (i != this.X) {
            this.X = i;
            v();
        }
    }
}
