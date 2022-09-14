package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
/* compiled from: ClipPathShadowNode.java */
/* loaded from: classes.dex */
class d extends o {
    @Override // com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public int hitTest(Point point, Matrix matrix) {
        return -1;
    }

    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableShadowNode
    public void mergeProperties(RenderableShadowNode renderableShadowNode) {
    }

    @Override // com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode
    public void resetProperties() {
    }

    @Override // com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        com.facebook.common.e.a.c("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.o, com.horcrux.svg.am
    public void saveDefinition() {
        getSvgShadowNode().defineClipPath(this, this.mName);
    }
}
