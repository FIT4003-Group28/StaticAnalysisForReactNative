package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends MetricAffectingSpan implements l {

    /* renamed from: b  reason: collision with root package name */
    private final float f6254b;

    public a(float f2) {
        this.f6254b = f2;
    }

    private void a(TextPaint textPaint) {
        if (!Float.isNaN(this.f6254b)) {
            textPaint.setLetterSpacing(this.f6254b);
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
