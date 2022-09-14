package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class e0 extends q0 {
    private String o;
    private o0 p;
    private n0 q;
    private SVGLength r;

    public e0(ReactContext reactContext) {
        super(reactContext);
        m0 m0Var = m0.align;
        p0 p0Var = p0.exact;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path b(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.o);
        if (!(definedTemplate instanceof RenderableView)) {
            return null;
        }
        return ((RenderableView) definedTemplate).getPath(canvas, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public void c() {
    }

    @Override // com.horcrux.svg.q0, com.horcrux.svg.l
    void d() {
    }

    @Override // com.horcrux.svg.q0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f2) {
        a(canvas, paint, f2);
    }

    @Override // com.horcrux.svg.q0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return a(canvas, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0 i() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0 j() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGLength k() {
        return this.r;
    }

    @com.facebook.react.uimanager.e1.a(name = "href")
    public void setHref(String str) {
        this.o = str;
        invalidate();
    }

    @Override // com.horcrux.svg.q0
    @com.facebook.react.uimanager.e1.a(name = "method")
    public void setMethod(String str) {
        m0.valueOf(str);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "midLine")
    public void setSharp(String str) {
        this.q = n0.valueOf(str);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "side")
    public void setSide(String str) {
        this.p = o0.valueOf(str);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "spacing")
    public void setSpacing(String str) {
        p0.valueOf(str);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "startOffset")
    public void setStartOffset(Dynamic dynamic) {
        this.r = SVGLength.b(dynamic);
        invalidate();
    }
}
