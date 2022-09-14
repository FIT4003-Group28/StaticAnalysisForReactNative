package com.google.android.libraries.messaging.lighter.ui.common;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CustomTypefaceSpan extends TypefaceSpan {
    private final Typeface a;

    public CustomTypefaceSpan(Typeface typeface) {
        super((String) null);
        this.a = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.a);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
