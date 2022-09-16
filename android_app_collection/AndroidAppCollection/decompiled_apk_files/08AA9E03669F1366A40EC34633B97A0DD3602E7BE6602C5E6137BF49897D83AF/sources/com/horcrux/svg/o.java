package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import com.facebook.react.bridge.an;
import com.horcrux.svg.am;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupShadowNode.java */
/* loaded from: classes.dex */
public class o extends RenderableShadowNode {

    /* renamed from: a  reason: collision with root package name */
    an f4886a;

    /* renamed from: b  reason: collision with root package name */
    private m f4887b;

    @com.facebook.react.uimanager.a.a(a = "font")
    public void setFont(an anVar) {
        this.f4886a = anVar;
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        this.mMatrix.mapRect(rectF);
        this.f4887b = new m(this.mScale, rectF.width(), rectF.height());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m a() {
        return this.f4887b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m b() {
        return getTextRoot().a();
    }

    void c() {
        b().a(this, this.f4886a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        b().b();
    }

    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        a(canvas);
        if (f > 0.01f) {
            clip(canvas, paint);
            a(canvas, paint, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final Canvas canvas, final Paint paint, final float f) {
        c();
        final SvgViewShadowNode svgShadowNode = getSvgShadowNode();
        traverseChildren(new am.a() { // from class: com.horcrux.svg.o.1
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                boolean z = amVar instanceof RenderableShadowNode;
                if (z) {
                    ((RenderableShadowNode) amVar).mergeProperties(this);
                }
                int saveAndSetupCanvas = amVar.saveAndSetupCanvas(canvas);
                amVar.draw(canvas, paint, f * o.this.mOpacity);
                amVar.restoreCanvas(canvas, saveAndSetupCanvas);
                if (z) {
                    ((RenderableShadowNode) amVar).resetProperties();
                }
                amVar.markUpdateSeen();
                if (amVar.isResponsible()) {
                    svgShadowNode.enableTouchEvents();
                }
            }
        });
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(final Canvas canvas, final Paint paint) {
        final Path path = new Path();
        traverseChildren(new am.a() { // from class: com.horcrux.svg.o.2
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                path.addPath(amVar.getPath(canvas, paint));
            }
        });
        return path;
    }

    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public int hitTest(Point point, Matrix matrix) {
        am amVar;
        int hitTest;
        int hitTest2 = super.hitTest(point, matrix);
        if (hitTest2 != -1) {
            return hitTest2;
        }
        Matrix matrix2 = new Matrix(this.mMatrix);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        Path clipPath = getClipPath();
        if (clipPath != null && !pathContainsPoint(clipPath, matrix2, point)) {
            return -1;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            com.facebook.react.uimanager.x childAt = getChildAt(childCount);
            if ((childAt instanceof am) && (hitTest = (amVar = (am) childAt).hitTest(point, matrix2)) != -1) {
                return (amVar.isResponsible() || hitTest != childAt.getReactTag()) ? hitTest : getReactTag();
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.am
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgShadowNode().defineTemplate(this, this.mName);
        }
        traverseChildren(new am.a() { // from class: com.horcrux.svg.o.3
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                amVar.saveDefinition();
            }
        });
    }

    @Override // com.horcrux.svg.RenderableShadowNode
    public void resetProperties() {
        traverseChildren(new am.a() { // from class: com.horcrux.svg.o.4
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                if (amVar instanceof RenderableShadowNode) {
                    ((RenderableShadowNode) amVar).resetProperties();
                }
            }
        });
    }
}
