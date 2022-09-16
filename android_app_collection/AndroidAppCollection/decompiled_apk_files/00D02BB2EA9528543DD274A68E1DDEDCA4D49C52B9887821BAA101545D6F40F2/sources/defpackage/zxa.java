package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: PG */
/* renamed from: zxa  reason: default package */
/* loaded from: classes7.dex */
final class zxa extends MetricAffectingSpan {
    private static void a(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.descent() * 0.7f);
        textPaint.setTextSize(textPaint.getTextSize() * 0.7f);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
