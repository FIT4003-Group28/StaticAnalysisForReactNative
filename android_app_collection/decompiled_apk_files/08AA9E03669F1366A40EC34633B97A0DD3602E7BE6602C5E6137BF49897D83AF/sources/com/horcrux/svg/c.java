package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
/* compiled from: CircleShadowNode.java */
/* loaded from: classes.dex */
class c extends RenderableShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private String f4852a;

    /* renamed from: b  reason: collision with root package name */
    private String f4853b;

    /* renamed from: c  reason: collision with root package name */
    private String f4854c;

    @com.facebook.react.uimanager.a.a(a = "cx")
    public void setCx(String str) {
        this.f4852a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "cy")
    public void setCy(String str) {
        this.f4853b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "r")
    public void setR(String str) {
        this.f4854c = str;
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        double parseDouble;
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f4852a);
        double relativeOnHeight = relativeOnHeight(this.f4853b);
        if (w.a(this.f4854c)) {
            parseDouble = relativeOnOther(this.f4854c);
        } else {
            parseDouble = Double.parseDouble(this.f4854c) * this.mScale;
        }
        path.addCircle((float) relativeOnWidth, (float) relativeOnHeight, (float) parseDouble, Path.Direction.CW);
        return path;
    }
}
