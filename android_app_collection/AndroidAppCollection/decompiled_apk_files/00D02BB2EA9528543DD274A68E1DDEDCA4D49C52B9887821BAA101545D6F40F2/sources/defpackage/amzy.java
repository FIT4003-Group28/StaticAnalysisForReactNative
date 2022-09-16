package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* compiled from: PG */
/* renamed from: amzy  reason: default package */
/* loaded from: classes2.dex */
public final class amzy extends ReplacementSpan {
    private final int a;
    private final float b;
    private final Paint c;

    public amzy(int i, float f, Paint paint) {
        this.a = i;
        this.b = f;
        this.c = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color = this.c.getColor();
        this.c.setColor(this.a);
        this.c.setStrokeWidth(this.b);
        this.c.setStyle(Paint.Style.STROKE);
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, this.c);
        this.c.setColor(color);
        this.c.setStrokeWidth(0.0f);
        this.c.setStyle(Paint.Style.FILL);
        canvas.drawText(charSequence, i, i2, f, f2, this.c);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.c.getFontMetricsInt();
        if (fontMetricsInt2 != null && fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
            fontMetricsInt.top = fontMetricsInt2.top;
        }
        return (int) this.c.measureText(charSequence, i, i2);
    }
}
