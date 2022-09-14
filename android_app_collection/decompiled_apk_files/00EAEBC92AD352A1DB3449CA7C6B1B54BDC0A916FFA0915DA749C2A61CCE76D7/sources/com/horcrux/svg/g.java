package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class g extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f9584b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9585c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9586d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9587e;

    public g(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f9584b);
        double relativeOnHeight = relativeOnHeight(this.f9585c);
        double relativeOnWidth2 = relativeOnWidth(this.f9586d);
        double relativeOnHeight2 = relativeOnHeight(this.f9587e);
        path.addOval(new RectF((float) (relativeOnWidth - relativeOnWidth2), (float) (relativeOnHeight - relativeOnHeight2), (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2)), Path.Direction.CW);
        return path;
    }

    @com.facebook.react.uimanager.e1.a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f9584b = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f9585c = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f9586d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f9587e = SVGLength.b(dynamic);
        invalidate();
    }
}
