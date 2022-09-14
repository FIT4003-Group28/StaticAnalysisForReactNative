package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class c0 extends l {

    /* renamed from: d  reason: collision with root package name */
    private float f9563d;

    /* renamed from: e  reason: collision with root package name */
    private float f9564e;

    /* renamed from: f  reason: collision with root package name */
    private float f9565f;

    /* renamed from: g  reason: collision with root package name */
    private float f9566g;

    /* renamed from: h  reason: collision with root package name */
    private String f9567h;
    private int i;

    public c0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas, Paint paint, float f2, float f3, float f4) {
        if (this.f9567h != null) {
            float f5 = this.f9563d;
            float f6 = this.mScale;
            float f7 = this.f9564e;
            canvas.concat(s0.a(new RectF(f5 * f6, f7 * f6, (f5 + this.f9565f) * f6, (f7 + this.f9566g) * f6), new RectF(0.0f, 0.0f, f3, f4), this.f9567h, this.i));
            super.draw(canvas, paint, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        saveDefinition();
    }

    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(String str) {
        this.f9567h = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.i = i;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "minX")
    public void setMinX(float f2) {
        this.f9563d = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "minY")
    public void setMinY(float f2) {
        this.f9564e = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "vbHeight")
    public void setVbHeight(float f2) {
        this.f9566g = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "vbWidth")
    public void setVbWidth(float f2) {
        this.f9565f = f2;
        invalidate();
    }
}
