package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class p extends l {

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9672d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9673e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f9674f;

    /* renamed from: g  reason: collision with root package name */
    private SVGLength f9675g;

    /* renamed from: h  reason: collision with root package name */
    private String f9676h;
    private String i;
    private float j;
    private float k;
    private float l;
    private float m;
    String n;
    int o;
    Matrix p;

    public p(ReactContext reactContext) {
        super(reactContext);
        this.p = new Matrix();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas, Paint paint, float f2, x xVar, float f3) {
        int saveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.p.reset();
        v vVar = xVar.f9720b;
        Matrix matrix = this.p;
        float f4 = this.mScale;
        matrix.setTranslate(((float) vVar.f9711a) * f4, ((float) vVar.f9712b) * f4);
        double parseDouble = "auto".equals(this.i) ? -1.0d : Double.parseDouble(this.i);
        if (parseDouble == -1.0d) {
            parseDouble = xVar.f9721c;
        }
        this.p.preRotate(((float) parseDouble) + 180.0f);
        if ("strokeWidth".equals(this.f9676h)) {
            this.p.preScale(f3, f3);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.f9674f) / this.mScale), (float) (relativeOnHeight(this.f9675g) / this.mScale));
        if (this.n != null) {
            float f5 = this.j;
            float f6 = this.mScale;
            float f7 = this.k;
            Matrix a2 = s0.a(new RectF(f5 * f6, f7 * f6, (f5 + this.l) * f6, (f7 + this.m) * f6), rectF, this.n, this.o);
            float[] fArr = new float[9];
            a2.getValues(fArr);
            this.p.preScale(fArr[0], fArr[4]);
        }
        this.p.preTranslate((float) (-relativeOnWidth(this.f9672d)), (float) (-relativeOnHeight(this.f9673e)));
        canvas.concat(this.p);
        a(canvas, paint, f2);
        restoreCanvas(canvas, saveAndSetupCanvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(String str) {
        this.n = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "markerHeight")
    public void setMarkerHeight(Dynamic dynamic) {
        this.f9675g = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "markerUnits")
    public void setMarkerUnits(String str) {
        this.f9676h = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "markerWidth")
    public void setMarkerWidth(Dynamic dynamic) {
        this.f9674f = SVGLength.b(dynamic);
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

    @com.facebook.react.uimanager.e1.a(name = "orient")
    public void setOrient(String str) {
        this.i = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "refX")
    public void setRefX(Dynamic dynamic) {
        this.f9672d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "refY")
    public void setRefY(Dynamic dynamic) {
        this.f9673e = SVGLength.b(dynamic);
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
}
