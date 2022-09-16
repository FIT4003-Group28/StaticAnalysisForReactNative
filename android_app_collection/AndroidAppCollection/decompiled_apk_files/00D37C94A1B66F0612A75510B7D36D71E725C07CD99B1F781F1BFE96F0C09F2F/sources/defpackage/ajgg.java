package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: PG */
/* renamed from: ajgg  reason: default package */
/* loaded from: classes.dex */
public final class ajgg extends MetricAffectingSpan {
    private final Typeface a;

    public ajgg(Typeface typeface) {
        typeface.getClass();
        this.a = typeface;
    }

    private static void a(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & (typeface.getStyle() ^ (-1));
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.a);
    }
}
