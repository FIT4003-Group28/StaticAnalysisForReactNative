package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: jfd  reason: default package */
/* loaded from: classes7.dex */
public final class jfd extends bvsr {
    private final int a;

    public jfd(Drawable drawable, int i) {
        super(drawable, 1.0f);
        this.a = i;
    }

    @Override // defpackage.bvsr, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        super.draw(canvas, charSequence, i, i2, f + this.a, i3, i4, i5, paint);
    }

    @Override // defpackage.bvsr, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        int i3 = this.a;
        return size + i3 + i3;
    }
}
