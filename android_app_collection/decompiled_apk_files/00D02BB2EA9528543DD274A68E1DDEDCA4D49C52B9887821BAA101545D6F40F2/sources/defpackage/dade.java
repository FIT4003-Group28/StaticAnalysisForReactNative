package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: dade  reason: default package */
/* loaded from: classes.dex */
public final class dade {
    public final ColorStateList a;
    public final ColorStateList b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public float k;
    public Typeface l;
    private final int m;
    private boolean n = false;

    public dade(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, dadb.b);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.a = dada.a(context, obtainStyledAttributes, 3);
        dada.a(context, obtainStyledAttributes, 4);
        dada.a(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int i2 = true != obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.m = obtainStyledAttributes.getResourceId(i2, 0);
        this.c = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.b = dada.a(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, dadb.a);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private final void h() {
        Typeface typeface;
        String str;
        if (this.l == null && (str = this.c) != null) {
            this.l = Typeface.create(str, this.d);
        }
        if (this.l == null) {
            int i = this.e;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else if (i != 3) {
                this.l = Typeface.DEFAULT;
                this.l = Typeface.create(this.l, this.d);
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.l = typeface;
            this.l = Typeface.create(this.l, this.d);
        }
    }

    private final boolean i(Context context) {
        int i = this.m;
        Typeface typeface = null;
        if (i != 0 && !context.isRestricted()) {
            typeface = ka.c(context, i, new TypedValue(), 0, null, false, true);
        }
        return typeface != null;
    }

    public final Typeface a(Context context) {
        if (this.n) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a = ka.a(context, this.m);
                this.l = a;
                if (a != null) {
                    this.l = Typeface.create(a, this.d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                if (String.valueOf(this.c).length() == 0) {
                    new String("Error loading font ");
                }
            }
        }
        h();
        this.n = true;
        return this.l;
    }

    public final void b(Context context, dadf dadfVar) {
        int i;
        if (i(context)) {
            a(context);
        } else {
            h();
        }
        int i2 = this.m;
        if (i2 == 0) {
            this.n = true;
            i = 0;
        } else {
            i = i2;
        }
        if (!this.n) {
            try {
                dadc dadcVar = new dadc(this, dadfVar);
                if (context.isRestricted()) {
                    dadcVar.c(-4);
                    return;
                } else {
                    ka.c(context, i, new TypedValue(), 0, dadcVar, false, false);
                    return;
                }
            } catch (Resources.NotFoundException unused) {
                this.n = true;
                dadfVar.b(1);
                return;
            } catch (Exception unused2) {
                if (String.valueOf(this.c).length() == 0) {
                    new String("Error loading font ");
                }
                this.n = true;
                dadfVar.b(-3);
                return;
            }
        }
        dadfVar.a(this.l, true);
    }

    public final Typeface c() {
        h();
        return this.l;
    }

    public final void d(Context context, TextPaint textPaint, dadf dadfVar) {
        e(context, textPaint, dadfVar);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.a.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.b;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.b.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, dadf dadfVar) {
        if (!i(context)) {
            f(textPaint, c());
            b(context, new dadd(this, textPaint, dadfVar));
            return;
        }
        f(textPaint, a(context));
    }

    public final void f(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.d;
        boolean z = true;
        if (1 != (style & 1)) {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
