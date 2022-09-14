package com.facebook.react.views.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes.dex */
public class z extends ReplacementSpan implements l {

    /* renamed from: b  reason: collision with root package name */
    private int f6322b;

    /* renamed from: c  reason: collision with root package name */
    private int f6323c;

    /* renamed from: d  reason: collision with root package name */
    private int f6324d;

    public z(int i, int i2, int i3) {
        this.f6322b = i;
        this.f6323c = i2;
        this.f6324d = i3;
    }

    public int a() {
        return this.f6324d;
    }

    public int b() {
        return this.f6322b;
    }

    public int c() {
        return this.f6323c;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.f6324d;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.f6323c;
    }
}
