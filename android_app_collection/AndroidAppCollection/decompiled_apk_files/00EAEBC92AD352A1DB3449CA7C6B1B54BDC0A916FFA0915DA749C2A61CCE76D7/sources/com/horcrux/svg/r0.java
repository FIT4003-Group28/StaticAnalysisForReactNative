package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class r0 extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    private String f9692b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f9693c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f9694d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f9695e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f9696f;

    public r0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f9692b);
        if (definedTemplate == null) {
            c.d.d.e.a.d("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f9692b + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f9693c), (float) relativeOnHeight(this.f9694d));
        boolean z = definedTemplate instanceof RenderableView;
        if (z) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof c0) {
            ((c0) definedTemplate).a(canvas, paint, f2, (float) relativeOnWidth(this.f9695e), (float) relativeOnHeight(this.f9696f));
        } else {
            definedTemplate.draw(canvas, paint, f2 * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
        if (!z) {
            return;
        }
        ((RenderableView) definedTemplate).resetProperties();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f9692b);
        if (definedTemplate == null) {
            c.d.d.e.a.d("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f9692b + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f9693c), (float) relativeOnHeight(this.f9694d));
        path.transform(matrix, path2);
        return path2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f9692b);
            if (definedTemplate == null) {
                c.d.d.e.a.d("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f9692b + " is not defined.");
                return -1;
            }
            int hitTest = definedTemplate.hitTest(fArr2);
            if (hitTest != -1) {
                return (definedTemplate.isResponsible() || hitTest != definedTemplate.getId()) ? hitTest : getId();
            }
        }
        return -1;
    }

    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f9696f = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "href")
    public void setHref(String str) {
        this.f9692b = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f9695e = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f9693c = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f9694d = SVGLength.b(dynamic);
        invalidate();
    }
}
