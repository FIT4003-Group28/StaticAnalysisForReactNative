package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class i extends l {

    /* renamed from: d  reason: collision with root package name */
    SVGLength f9605d;

    /* renamed from: e  reason: collision with root package name */
    SVGLength f9606e;

    /* renamed from: f  reason: collision with root package name */
    SVGLength f9607f;

    /* renamed from: g  reason: collision with root package name */
    SVGLength f9608g;

    /* renamed from: h  reason: collision with root package name */
    Bitmap f9609h;
    Canvas i;

    public i(ReactContext reactContext) {
        super(reactContext);
        this.f9609h = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.i = new Canvas(this.f9609h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public void a(Canvas canvas, Paint paint, float f2) {
        d();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof q)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f2);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (!virtualView.isResponsible()) {
                        }
                        svgView.enableTouchEvents();
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (!svgView2.isResponsible()) {
                    }
                    svgView.enableTouchEvents();
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        canvas.translate((float) relativeOnWidth(this.f9605d), (float) relativeOnHeight(this.f9606e));
        canvas.clipRect(0.0f, 0.0f, (float) relativeOnWidth(this.f9607f), (float) relativeOnHeight(this.f9608g));
        super.draw(canvas, paint, f2);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(this.i, view, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.f9608g = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.f9607f = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f9605d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f9606e = SVGLength.b(dynamic);
        invalidate();
    }
}
