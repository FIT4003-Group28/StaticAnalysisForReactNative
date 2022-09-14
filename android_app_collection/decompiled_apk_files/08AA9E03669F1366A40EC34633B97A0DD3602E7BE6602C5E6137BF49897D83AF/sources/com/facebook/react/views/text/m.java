package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: ShadowStyleSpan.java */
/* loaded from: classes.dex */
public class m extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final float f4103a;

    /* renamed from: b  reason: collision with root package name */
    private final float f4104b;

    /* renamed from: c  reason: collision with root package name */
    private final float f4105c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4106d;

    public m(float f, float f2, float f3, int i) {
        this.f4103a = f;
        this.f4104b = f2;
        this.f4105c = f3;
        this.f4106d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f4105c, this.f4103a, this.f4104b, this.f4106d);
    }
}
