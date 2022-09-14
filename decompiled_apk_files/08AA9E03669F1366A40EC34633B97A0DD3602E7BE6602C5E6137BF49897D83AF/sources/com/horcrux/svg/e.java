package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
/* compiled from: DefinitionShadowNode.java */
/* loaded from: classes.dex */
class e extends am {
    @Override // com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    @Override // com.horcrux.svg.am
    public int hitTest(Point point, Matrix matrix) {
        return -1;
    }

    @Override // com.horcrux.svg.am
    public boolean isResponsible() {
        return false;
    }
}
