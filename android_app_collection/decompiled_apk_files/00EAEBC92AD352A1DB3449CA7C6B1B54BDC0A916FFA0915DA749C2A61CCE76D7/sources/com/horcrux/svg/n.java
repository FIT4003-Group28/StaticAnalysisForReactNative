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
public class n extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f9655b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9656c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9657d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9658e;

    public n(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f9655b);
        double relativeOnHeight = relativeOnHeight(this.f9656c);
        double relativeOnWidth2 = relativeOnWidth(this.f9657d);
        double relativeOnHeight2 = relativeOnHeight(this.f9658e);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        return path;
    }

    @com.facebook.react.uimanager.e1.a(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.f9655b = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.f9657d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.f9656c = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.f9658e = SVGLength.b(dynamic);
        invalidate();
    }
}
