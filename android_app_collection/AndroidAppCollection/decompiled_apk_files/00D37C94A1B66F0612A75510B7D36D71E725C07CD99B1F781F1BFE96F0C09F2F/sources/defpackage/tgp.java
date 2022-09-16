package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: PG */
/* renamed from: tgp  reason: default package */
/* loaded from: classes4.dex */
public final class tgp extends MetricAffectingSpan {
    private final float a;

    public tgp(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }
}
