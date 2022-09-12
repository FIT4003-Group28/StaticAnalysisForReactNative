package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
/* compiled from: PG */
/* renamed from: jfe  reason: default package */
/* loaded from: classes7.dex */
public final class jfe extends ImageSpan {
    public jfe(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (paint.getFontSpacing() * 0.228f) - 0.128f);
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
