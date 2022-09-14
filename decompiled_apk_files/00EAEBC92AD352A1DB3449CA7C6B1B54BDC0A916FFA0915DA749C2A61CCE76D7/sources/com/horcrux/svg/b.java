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
public class b extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f9557b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9558c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9559d;

    public b(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addCircle((float) relativeOnWidth(this.f9557b), (float) relativeOnHeight(this.f9558c), (float) relativeOnOther(this.f9559d), Path.Direction.CW);
        return path;
    }

    @com.facebook.react.uimanager.e1.a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f9557b = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f9558c = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "r")
    public void setR(Dynamic dynamic) {
        this.f9559d = SVGLength.b(dynamic);
        invalidate();
    }
}
