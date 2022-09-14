package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class u extends l {
    private static final float[] q = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9706d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9707e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f9708f;

    /* renamed from: g  reason: collision with root package name */
    private SVGLength f9709g;

    /* renamed from: h  reason: collision with root package name */
    private a.b f9710h;
    private a.b i;
    private float j;
    private float k;
    private float l;
    private float m;
    String n;
    int o;
    private Matrix p;

    public u(ReactContext reactContext) {
        super(reactContext);
        this.p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getViewBox() {
        float f2 = this.j;
        float f3 = this.mScale;
        float f4 = this.k;
        return new RectF(f2 * f3, f4 * f3, (f2 + this.l) * f3, (f4 + this.m) * f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0193a.PATTERN, new SVGLength[]{this.f9706d, this.f9707e, this.f9708f, this.f9709g}, this.f9710h);
            aVar.a(this.i);
            aVar.a(this);
            Matrix matrix = this.p;
            if (matrix != null) {
                aVar.a(matrix);
            }
            SvgView svgView = getSvgView();
            a.b bVar = this.f9710h;
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.i == bVar2) {
                aVar.a(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(String str) {
        this.n = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f9709g = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.o = i;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "minX")
    public void setMinX(float f2) {
        this.j = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "minY")
    public void setMinY(float f2) {
        this.k = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "patternContentUnits")
    public void setPatternContentUnits(int i) {
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

    @com.facebook.react.uimanager.e1.a(name = "patternTransform")
    public void setPatternTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int a2 = w.a(readableArray, q, this.mScale);
            if (a2 == 6) {
                if (this.p == null) {
                    this.p = new Matrix();
                }
                this.p.setValues(q);
            } else if (a2 != -1) {
                c.d.d.e.a.d("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.p = null;
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "patternUnits")
    public void setPatternUnits(int i) {
        a.b bVar;
        if (i != 0) {
            if (i == 1) {
                bVar = a.b.USER_SPACE_ON_USE;
            }
            invalidate();
        }
        bVar = a.b.OBJECT_BOUNDING_BOX;
        this.f9710h = bVar;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "vbHeight")
    public void setVbHeight(float f2) {
        this.m = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "vbWidth")
    public void setVbWidth(float f2) {
        this.l = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f9708f = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f9706d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f9707e = SVGLength.b(dynamic);
        invalidate();
    }
}
