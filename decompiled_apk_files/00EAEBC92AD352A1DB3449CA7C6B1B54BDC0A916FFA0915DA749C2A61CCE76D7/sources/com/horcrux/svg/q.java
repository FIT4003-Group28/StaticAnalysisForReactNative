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
public class q extends l {
    private static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: d  reason: collision with root package name */
    SVGLength f9680d;

    /* renamed from: e  reason: collision with root package name */
    SVGLength f9681e;

    /* renamed from: f  reason: collision with root package name */
    SVGLength f9682f;

    /* renamed from: g  reason: collision with root package name */
    SVGLength f9683g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f9684h;

    public q(ReactContext reactContext) {
        super(reactContext);
        this.f9684h = null;
    }

    @Override // com.horcrux.svg.l, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f9683g = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "maskContentUnits")
    public void setMaskContentUnits(int i2) {
        if (i2 == 0) {
            a.b bVar = a.b.OBJECT_BOUNDING_BOX;
        } else if (i2 == 1) {
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "maskTransform")
    public void setMaskTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int a2 = w.a(readableArray, i, this.mScale);
            if (a2 == 6) {
                if (this.f9684h == null) {
                    this.f9684h = new Matrix();
                }
                this.f9684h.setValues(i);
            } else if (a2 != -1) {
                c.d.d.e.a.d("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f9684h = null;
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "maskUnits")
    public void setMaskUnits(int i2) {
        if (i2 == 0) {
            a.b bVar = a.b.OBJECT_BOUNDING_BOX;
        } else if (i2 == 1) {
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f9682f = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f9680d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f9681e = SVGLength.b(dynamic);
        invalidate();
    }
}
