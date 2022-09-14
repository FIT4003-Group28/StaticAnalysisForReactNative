package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
/* compiled from: LineShadowNode.java */
/* loaded from: classes.dex */
class q extends RenderableShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private String f4906a;

    /* renamed from: b  reason: collision with root package name */
    private String f4907b;

    /* renamed from: c  reason: collision with root package name */
    private String f4908c;

    /* renamed from: d  reason: collision with root package name */
    private String f4909d;

    @com.facebook.react.uimanager.a.a(a = "x1")
    public void setX1(String str) {
        this.f4906a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "y1")
    public void setY1(String str) {
        this.f4907b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "x2")
    public void setX2(String str) {
        this.f4908c = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "y2")
    public void setY2(String str) {
        this.f4909d = str;
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f4906a);
        double relativeOnHeight = relativeOnHeight(this.f4907b);
        double relativeOnWidth2 = relativeOnWidth(this.f4908c);
        double relativeOnHeight2 = relativeOnHeight(this.f4909d);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        return path;
    }
}
