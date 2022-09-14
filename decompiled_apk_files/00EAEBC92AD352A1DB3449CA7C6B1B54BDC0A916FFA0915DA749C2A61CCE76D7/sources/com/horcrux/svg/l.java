package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class l extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    ReadableMap f9639b;

    /* renamed from: c  reason: collision with root package name */
    private j f9640c;

    public l(ReactContext reactContext) {
        super(reactContext);
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path a(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            Path.Op valueOf = Path.Op.valueOf(op.name());
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof q) && (childAt instanceof VirtualView)) {
                    VirtualView virtualView = (VirtualView) childAt;
                    Matrix matrix = virtualView.mMatrix;
                    Path a2 = virtualView instanceof l ? ((l) virtualView).a(canvas, paint, op) : virtualView.getPath(canvas, paint);
                    a2.transform(matrix);
                    path.op(a2, valueOf);
                }
                i++;
            }
        } else {
            Region region = new Region(canvas.getClipBounds());
            Region region2 = new Region();
            while (i < getChildCount()) {
                View childAt2 = getChildAt(i);
                if (!(childAt2 instanceof q) && (childAt2 instanceof VirtualView)) {
                    VirtualView virtualView2 = (VirtualView) childAt2;
                    Matrix matrix2 = virtualView2.mMatrix;
                    Path a3 = virtualView2 instanceof l ? ((l) virtualView2).a(canvas, paint, op) : virtualView2.getPath(canvas, paint);
                    if (matrix2 != null) {
                        a3.transform(matrix2);
                    }
                    Region region3 = new Region();
                    region3.setPath(a3, region);
                    region2.op(region3, op);
                }
                i++;
            }
            path.addPath(region2.getBoundaryPath());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j a() {
        return this.f9640c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f9640c = new j(this.mScale, rectF.width(), rectF.height());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
                }
            }
        }
        setClientRect(rectF);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j b() {
        l textRoot = getTextRoot();
        a(textRoot);
        return textRoot.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Canvas canvas, Paint paint, float f2) {
        super.draw(canvas, paint, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        b().i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        b().a(this, this.f9639b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        a(canvas);
        clip(canvas, paint);
        a(canvas, paint, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        ((VirtualView) this).mPath = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof q) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                ((VirtualView) this).mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return ((VirtualView) this).mPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int reactTagForTouch;
        VirtualView virtualView;
        int hitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    this.mClipBounds = new RectF();
                    clipPath.computeBounds(this.mClipBounds, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof q) && (hitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || hitTest != childAt.getId()) ? hitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (reactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return reactTagForTouch;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "font")
    public void setFont(ReadableMap readableMap) {
        this.f9639b = readableMap;
        invalidate();
    }
}
