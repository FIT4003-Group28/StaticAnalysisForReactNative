package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ammu  reason: default package */
/* loaded from: classes.dex */
public final class ammu {
    public final Paint a;
    public final float b;
    public final float c;
    private final Paint d;
    private final Path e;
    @dzsi
    private final btmk f;
    private final bnvb g;

    public ammu(bnvb bnvbVar, float f, Paint paint, Paint paint2, @dzsi btmk btmkVar) {
        this.g = bnvbVar;
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        this.e = new Path();
        this.b = f;
        this.c = f < 1.001f ? 1.03f : 1.0f;
        this.f = btmkVar;
    }

    private static float d(alxo alxoVar) {
        if (alxoVar.c()) {
            alyd alydVar = alxoVar.r;
            if (Color.alpha(alydVar.b().a) == 0) {
                return 0.0f;
            }
            return alydVar.b().c;
        }
        return 0.0f;
    }

    public final float[] a(String str, alxo alxoVar, float f) {
        int ceil;
        c(alxoVar.q);
        this.a.setTextSize(f);
        float measureText = this.a.measureText(str);
        float b = amkw.b(alxoVar);
        float e = alxoVar.b() ? alxoVar.q.e() : 1.0f;
        float d = d(alxoVar);
        Paint.FontMetrics fontMetrics = this.a.getFontMetrics();
        float ceil2 = (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        float f2 = fontMetrics.ascent - fontMetrics.top;
        float f3 = fontMetrics.bottom - fontMetrics.descent;
        float f4 = (e - 1.0f) * ceil2;
        float f5 = 0.0f;
        if (b > 0.0f && measureText > 0.0f) {
            measureText += ceil + ceil;
            float ceil3 = (int) Math.ceil((b * this.b) / 2.0f);
            f2 += ceil3;
            f3 += ceil3;
        }
        float f6 = measureText * this.c;
        float f7 = ceil2 + f2 + f3;
        float f8 = f4 / 2.0f;
        float f9 = f2 - f8;
        float f10 = f3 - f8;
        if (d > 0.0f) {
            float f11 = d + d;
            f6 += f11;
            f7 += f11;
            f10 = 0.0f;
        } else {
            f5 = f9;
        }
        return new float[]{f6, f7, f5, f10};
    }

    @dzsi
    public final bnve b(String str, alxo alxoVar, float f) {
        int i;
        int i2;
        int d = amkw.d(alxoVar);
        int a = amkw.a(alxoVar);
        float b = amkw.b(alxoVar);
        float d2 = d(alxoVar);
        if (alxoVar.c()) {
            alyd alydVar = alxoVar.r;
            i2 = alydVar.a();
            i = alydVar.b().a;
            if (Color.alpha(i) != 0) {
                i2 |= -16777216;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        int hashCode = Arrays.hashCode(new Object[]{str, Float.valueOf(f), alxoVar});
        bnve f2 = this.g.f(hashCode);
        btmk btmkVar = this.f;
        if (btmkVar != null) {
            if (f2 != null) {
                btmkVar.a();
            } else {
                btmkVar.b();
            }
        }
        if (f2 == null) {
            if (a == 0) {
                if (i2 != 0) {
                    a = 0;
                } else {
                    a = 0;
                    b = 0.0f;
                    i2 = 0;
                }
            }
            float f3 = b * this.b;
            float[] a2 = a(str, alxoVar, f);
            float f4 = d2 + d2;
            int ceil = (int) Math.ceil(a2[0] + f4);
            int ceil2 = (int) Math.ceil(a2[1] + f4);
            if (ceil <= 0 || ceil2 <= 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c(alxoVar.q);
            this.a.setTextSize(f);
            if (i2 != 0) {
                if (i != 0) {
                    this.a.setColor(i);
                    canvas.drawRect(0.0f, 0.0f, ceil, ceil2, this.a);
                }
                this.a.setColor(i2);
                float f5 = d2 + 0.0f;
                canvas.drawRect(f5, f5, ceil - d2, ceil2 - d2, this.a);
            }
            Paint.FontMetrics fontMetrics = this.a.getFontMetrics();
            this.d.setColor(a);
            this.d.setStrokeWidth(f3);
            this.a.setColor(d);
            boolean z = a != 0 && f3 > 0.0f;
            float f6 = f3 / 2.0f;
            this.a.getTextPath(str, 0, str.length(), (int) Math.ceil(f6 + d2), (int) Math.ceil((-fontMetrics.top) + f6 + d2), this.e);
            if (z) {
                canvas.drawPath(this.e, this.d);
            }
            if (d != 0) {
                canvas.drawPath(this.e, this.a);
            }
            return this.g.j(createBitmap, hashCode, ceil, ceil2, 1.0f);
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@dzsi alyf alyfVar) {
        int i;
        Typeface typeface = null;
        if (alyfVar != null) {
            boolean m = alyf.m(alyfVar.g());
            i = m;
            if (alyf.n(alyfVar.g())) {
                i = (m ? 1 : 0) | 2;
            }
            if (alyf.q(alyfVar.g())) {
                typeface = Typeface.create("sans-serif-condensed", i);
            } else if (alyf.o(alyfVar.g())) {
                typeface = Typeface.create("sans-serif-light", i);
            } else if (alyf.p(alyfVar.g())) {
                try {
                    int i2 = i == 1 ? 1 : 0;
                    int i3 = i == 1 ? 1 : 0;
                    int i4 = i == 1 ? 1 : 0;
                    typeface = Typeface.create("sans-serif-medium", i2);
                } catch (Exception unused) {
                }
                if (typeface == null) {
                    int i5 = i == 1 ? 1 : 0;
                    boolean z = i == 1 ? 1 : 0;
                    boolean z2 = i == 1 ? 1 : 0;
                    boolean z3 = i == 1 ? 1 : 0;
                    i = i5 | 1;
                }
            }
        } else {
            i = 0;
        }
        if (typeface == null) {
            int i6 = i == 1 ? 1 : 0;
            int i7 = i == 1 ? 1 : 0;
            typeface = Typeface.defaultFromStyle(i6);
        }
        this.a.setTypeface(typeface);
    }
}
