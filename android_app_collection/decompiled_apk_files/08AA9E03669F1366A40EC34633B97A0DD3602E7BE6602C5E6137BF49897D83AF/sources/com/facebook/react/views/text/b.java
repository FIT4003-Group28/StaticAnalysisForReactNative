package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: CustomStyleSpan.java */
/* loaded from: classes.dex */
public class b extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f4068a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4069b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4070c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4071d;

    public b(int i, int i2, String str, AssetManager assetManager) {
        this.f4069b = i;
        this.f4070c = i2;
        this.f4071d = str;
        this.f4068a = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f4069b, this.f4070c, this.f4071d, this.f4068a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f4069b, this.f4070c, this.f4071d, this.f4068a);
    }

    private static void a(Paint paint, int i, int i2, String str, AssetManager assetManager) {
        Typeface typeface = paint.getTypeface();
        int i3 = 0;
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 1;
        }
        if (i == 2 || ((2 & style) != 0 && i == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = e.a().a(str, i3, assetManager);
        } else if (typeface != null) {
            typeface = Typeface.create(typeface, i3);
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
        } else {
            paint.setTypeface(Typeface.defaultFromStyle(i3));
        }
    }
}
