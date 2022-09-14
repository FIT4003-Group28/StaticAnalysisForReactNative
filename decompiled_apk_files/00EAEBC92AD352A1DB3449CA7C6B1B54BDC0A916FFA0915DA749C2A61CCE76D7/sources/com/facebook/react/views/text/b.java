package com.facebook.react.views.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* loaded from: classes.dex */
public class b implements LineHeightSpan, l {

    /* renamed from: b  reason: collision with root package name */
    private final int f6261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(float f2) {
        this.f6261b = (int) Math.ceil(f2);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = this.f6261b;
        if (i5 > i6) {
            int min = Math.min(i6, i5);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i7 = fontMetricsInt.ascent;
        if ((-i7) + i5 > i6) {
            fontMetricsInt.bottom = i5;
            int i8 = (-i6) + i5;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            return;
        }
        int i9 = fontMetricsInt.bottom;
        if ((-i7) + i9 > i6) {
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i7 + i6;
            return;
        }
        int i10 = fontMetricsInt.top;
        if ((-i10) + i9 > i6) {
            fontMetricsInt.top = i9 - i6;
            return;
        }
        double d2 = i10;
        double d3 = (i6 - ((-i10) + i9)) / 2.0f;
        fontMetricsInt.top = (int) (d2 - Math.ceil(d3));
        fontMetricsInt.bottom = (int) (fontMetricsInt.bottom + Math.floor(d3));
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = fontMetricsInt.bottom;
    }
}
