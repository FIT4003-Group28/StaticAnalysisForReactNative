package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
/* compiled from: PG */
/* renamed from: cjxn  reason: default package */
/* loaded from: classes4.dex */
public final class cjxn extends ReplacementSpan {
    private static final Rect a = new Rect();
    private static final RectF b = new RectF();
    private final String c;
    private final int d;
    private final int e;
    private final int f;

    public cjxn(String str, int i, int i2, int i3) {
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    private static int a(float f) {
        return Math.round(f * 0.2f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color = paint.getColor();
        Paint.Style style = paint.getStyle();
        float textSize = paint.getTextSize();
        int a2 = a(textSize);
        float f2 = textSize * 0.2f;
        paint.setColor(this.d);
        paint.setStyle(Paint.Style.FILL);
        String str = this.c;
        int length = str.length();
        Rect rect = a;
        paint.getTextBounds(str, 0, length, rect);
        int i6 = -a2;
        rect.inset(i6, i6);
        rect.offset(((int) f) + a2, i4);
        RectF rectF = b;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setColor(this.f);
        paint.setStyle(Paint.Style.STROKE);
        paint.clearShadowLayer();
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setColor(this.e);
        paint.setStyle(style);
        paint.clearShadowLayer();
        canvas.drawText(this.c, f + a2, i4, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str = this.c;
        int length = str.length();
        Rect rect = a;
        paint.getTextBounds(str, 0, length, rect);
        int a2 = a(paint.getTextSize());
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.top = fontMetricsInt2.top - a2;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + a2;
            fontMetricsInt.ascent = fontMetricsInt2.ascent - a2;
            fontMetricsInt.descent = fontMetricsInt2.descent + a2;
            fontMetricsInt.leading = fontMetricsInt2.leading;
        }
        return rect.width() + a2 + a2;
    }
}
