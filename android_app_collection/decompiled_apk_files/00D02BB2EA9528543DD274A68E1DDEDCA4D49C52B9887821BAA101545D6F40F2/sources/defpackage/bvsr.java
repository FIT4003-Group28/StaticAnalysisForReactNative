package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
/* compiled from: PG */
/* renamed from: bvsr  reason: default package */
/* loaded from: classes4.dex */
public class bvsr extends ReplacementSpan implements LineHeightSpan {
    private final Drawable a;
    private final float b;
    private float c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public bvsr(Drawable drawable, float f) {
        if (drawable instanceof BitmapDrawable) {
            drawable.setFilterBitmap(true);
        }
        this.a = drawable;
        this.b = f;
    }

    private final void a(Paint paint) {
        if (paint.getTextSize() == this.c && paint.getTextScaleX() == this.d) {
            return;
        }
        this.c = paint.getTextSize();
        this.d = paint.getTextScaleX();
        float f = this.b;
        if (f > 0.0f) {
            int ceil = (int) Math.ceil(this.c * f);
            this.e = ceil;
            this.f = (int) Math.ceil(((ceil * this.a.getIntrinsicWidth()) / this.a.getIntrinsicHeight()) * this.d);
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i = fontMetricsInt.ascent;
        int i2 = fontMetricsInt.descent;
        int i3 = this.e;
        int i4 = ((i + i2) + i3) / 2;
        this.g = i4;
        int i5 = i4 - i3;
        this.h = i5;
        this.i = (i5 + fontMetricsInt.top) - fontMetricsInt.ascent;
        this.j = (this.g + fontMetricsInt.bottom) - fontMetricsInt.descent;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.ascent;
        int i6 = this.h;
        if (i5 > i6) {
            fontMetricsInt.ascent = i6;
        }
        int i7 = fontMetricsInt.descent;
        int i8 = this.g;
        if (i7 < i8) {
            fontMetricsInt.descent = i8;
        }
        int i9 = fontMetricsInt.top;
        int i10 = this.i;
        if (i9 > i10) {
            fontMetricsInt.top = i10;
        }
        int i11 = fontMetricsInt.bottom;
        int i12 = this.j;
        if (i11 < i12) {
            fontMetricsInt.bottom = i12;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        a(paint);
        this.a.setBounds(0, 0, this.f, this.e);
        canvas.translate(f, i4 + this.h);
        this.a.draw(canvas);
        canvas.restore();
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof bvsr) {
            bvsr bvsrVar = (bvsr) obj;
            if (bvsrVar.a.equals(this.a) && bvsrVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        a(paint);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.h;
            fontMetricsInt.descent = this.g;
            fontMetricsInt.top = this.i;
            fontMetricsInt.bottom = this.j;
        }
        return this.f;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public bvsr(Drawable drawable, float f, float f2) {
        if (drawable instanceof BitmapDrawable) {
            drawable.setFilterBitmap(true);
        }
        this.a = drawable;
        this.b = -1.0f;
        this.f = (int) Math.ceil(f);
        this.e = (int) Math.ceil(f2);
    }
}
