package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* compiled from: PG */
/* renamed from: bxno  reason: default package */
/* loaded from: classes4.dex */
public final class bxno extends ReplacementSpan {
    private final CharSequence a;
    private final int b;

    public bxno(CharSequence charSequence, int i) {
        this.a = charSequence;
        this.b = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color = paint.getColor();
        paint.setColor(this.b);
        CharSequence charSequence2 = this.a;
        canvas.drawText(charSequence2, 0, charSequence2.length(), f, i4, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        CharSequence charSequence2 = this.a;
        return (int) paint.measureText(charSequence2, 0, charSequence2.length());
    }
}
