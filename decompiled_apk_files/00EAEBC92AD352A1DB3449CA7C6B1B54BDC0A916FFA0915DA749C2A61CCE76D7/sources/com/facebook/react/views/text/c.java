package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public class c extends MetricAffectingSpan implements l {

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f6269b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6270c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6271d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6272e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6273f;

    public c(int i, int i2, String str, String str2, AssetManager assetManager) {
        this.f6270c = i;
        this.f6271d = i2;
        this.f6272e = str;
        this.f6273f = str2;
        this.f6269b = assetManager;
    }

    private static void a(Paint paint, int i, int i2, String str, String str2, AssetManager assetManager) {
        Typeface a2 = s.a(paint.getTypeface(), i, i2, str2, assetManager);
        if (Build.VERSION.SDK_INT >= 21) {
            paint.setFontFeatureSettings(str);
        }
        paint.setTypeface(a2);
        paint.setSubpixelText(true);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f6270c, this.f6271d, this.f6272e, this.f6273f, this.f6269b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f6270c, this.f6271d, this.f6272e, this.f6273f, this.f6269b);
    }
}
