package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class o extends d {
    private static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f9662b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9663c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9664d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9665e;

    /* renamed from: f  reason: collision with root package name */
    private ReadableArray f9666f;

    /* renamed from: g  reason: collision with root package name */
    private a.b f9667g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f9668h;

    public o(ReactContext reactContext) {
        super(reactContext);
        this.f9668h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0193a.LINEAR_GRADIENT, new SVGLength[]{this.f9662b, this.f9663c, this.f9664d, this.f9665e}, this.f9667g);
            aVar.a(this.f9666f);
            Matrix matrix = this.f9668h;
            if (matrix != null) {
                aVar.a(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f9667g == a.b.USER_SPACE_ON_USE) {
                aVar.a(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.f9666f = readableArray;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int a2 = w.a(readableArray, i, this.mScale);
            if (a2 == 6) {
                if (this.f9668h == null) {
                    this.f9668h = new Matrix();
                }
                this.f9668h.setValues(i);
            } else if (a2 != -1) {
                c.d.d.e.a.d("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f9668h = null;
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "gradientUnits")
    public void setGradientUnits(int i2) {
        a.b bVar;
        if (i2 != 0) {
            if (i2 == 1) {
                bVar = a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = a.b.OBJECT_BOUNDING_BOX;
        this.f9667g = bVar;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.f9662b = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.f9664d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.f9663c = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.f9665e = SVGLength.b(dynamic);
        invalidate();
    }
}
