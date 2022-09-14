package com.facebook.react.views.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: CustomLineHeightSpan.java */
/* loaded from: classes.dex */
public class a implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f4067a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(float f) {
        this.f4067a = (int) Math.ceil(f);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent > this.f4067a) {
            int min = Math.min(this.f4067a, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f4067a) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i5 = (-this.f4067a) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f4067a) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f4067a;
        } else if ((-fontMetricsInt.top) + fontMetricsInt.bottom > this.f4067a) {
            fontMetricsInt.top = fontMetricsInt.bottom - this.f4067a;
        } else {
            int i6 = (this.f4067a - ((-fontMetricsInt.top) + fontMetricsInt.bottom)) / 2;
            fontMetricsInt.top -= i6;
            fontMetricsInt.ascent -= i6;
            fontMetricsInt.descent += i6;
            fontMetricsInt.bottom += i6;
        }
    }
}
