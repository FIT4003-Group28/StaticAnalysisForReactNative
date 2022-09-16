package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
/* compiled from: PG */
/* renamed from: anu  reason: default package */
/* loaded from: classes.dex */
public final class anu extends ReplacementSpan {
    public final anq a;
    private final Paint.FontMetricsInt b = new Paint.FontMetricsInt();
    private short c = -1;
    private float d = 1.0f;

    public anu(anq anqVar) {
        hz.h(anqVar, "metadata cannot be null");
        this.a = anqVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        anp.b();
        anq anqVar = this.a;
        Typeface typeface = anqVar.b.c;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = anqVar.a;
        canvas.drawText(anqVar.b.a, i6 + i6, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.b);
        this.d = Math.abs(this.b.descent - this.b.ascent) / this.a.d();
        this.a.d();
        bmq e = this.a.e();
        int a = e.a(12);
        this.c = (short) ((a != 0 ? e.b.getShort(a + e.a) : (short) 0) * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.b.ascent;
            fontMetricsInt.descent = this.b.descent;
            fontMetricsInt.top = this.b.top;
            fontMetricsInt.bottom = this.b.bottom;
        }
        return this.c;
    }
}
