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
public class z extends d {
    private static final float[] k = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f9728b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9729c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9730d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9731e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f9732f;

    /* renamed from: g  reason: collision with root package name */
    private SVGLength f9733g;

    /* renamed from: h  reason: collision with root package name */
    private ReadableArray f9734h;
    private a.b i;
    private Matrix j;

    public z(ReactContext reactContext) {
        super(reactContext);
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0193a.RADIAL_GRADIENT, new SVGLength[]{this.f9728b, this.f9729c, this.f9730d, this.f9731e, this.f9732f, this.f9733g}, this.i);
            aVar.a(this.f9734h);
            Matrix matrix = this.j;
            if (matrix != null) {
                aVar.a(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.i == a.b.USER_SPACE_ON_USE) {
                aVar.a(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f9732f = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f9733g = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "fx")
    public void setFx(Dynamic dynamic) {
        this.f9728b = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "fy")
    public void setFy(Dynamic dynamic) {
        this.f9729c = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.f9734h = readableArray;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "gradientTransform")
    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int a2 = w.a(readableArray, k, this.mScale);
            if (a2 == 6) {
                if (this.j == null) {
                    this.j = new Matrix();
                }
                this.j.setValues(k);
            } else if (a2 != -1) {
                c.d.d.e.a.d("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.j = null;
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "gradientUnits")
    public void setGradientUnits(int i) {
        a.b bVar;
        if (i != 0) {
            if (i == 1) {
                bVar = a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = a.b.OBJECT_BOUNDING_BOX;
        this.i = bVar;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f9730d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f9731e = SVGLength.b(dynamic);
        invalidate();
    }
}
