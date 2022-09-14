package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: EllipseShadowNode.java */
/* loaded from: classes.dex */
class h extends RenderableShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private String f4860a;

    /* renamed from: b  reason: collision with root package name */
    private String f4861b;

    /* renamed from: c  reason: collision with root package name */
    private String f4862c;

    /* renamed from: d  reason: collision with root package name */
    private String f4863d;

    @com.facebook.react.uimanager.a.a(a = "cx")
    public void setCx(String str) {
        this.f4860a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "cy")
    public void setCy(String str) {
        this.f4861b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "rx")
    public void setRx(String str) {
        this.f4862c = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "ry")
    public void setRy(String str) {
        this.f4863d = str;
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f4860a);
        double relativeOnHeight = relativeOnHeight(this.f4861b);
        double relativeOnWidth2 = relativeOnWidth(this.f4862c);
        double relativeOnHeight2 = relativeOnHeight(this.f4863d);
        path.addOval(new RectF((float) (relativeOnWidth - relativeOnWidth2), (float) (relativeOnHeight - relativeOnHeight2), (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2)), Path.Direction.CW);
        return path;
    }
}
