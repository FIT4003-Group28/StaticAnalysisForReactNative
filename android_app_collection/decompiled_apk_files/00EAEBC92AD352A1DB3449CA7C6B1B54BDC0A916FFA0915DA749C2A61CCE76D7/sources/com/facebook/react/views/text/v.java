package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* loaded from: classes.dex */
public class v extends CharacterStyle implements l {

    /* renamed from: b  reason: collision with root package name */
    private final float f6303b;

    /* renamed from: c  reason: collision with root package name */
    private final float f6304c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6305d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6306e;

    public v(float f2, float f3, float f4, int i) {
        this.f6303b = f2;
        this.f6304c = f3;
        this.f6305d = f4;
        this.f6306e = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f6305d, this.f6303b, this.f6304c, this.f6306e);
    }
}
