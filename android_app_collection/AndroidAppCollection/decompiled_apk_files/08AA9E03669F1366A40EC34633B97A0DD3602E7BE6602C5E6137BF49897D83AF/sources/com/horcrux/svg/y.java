package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: RectShadowNode.java */
/* loaded from: classes.dex */
class y extends RenderableShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private String f4927a;

    /* renamed from: b  reason: collision with root package name */
    private String f4928b;

    /* renamed from: c  reason: collision with root package name */
    private String f4929c;

    /* renamed from: d  reason: collision with root package name */
    private String f4930d;
    private String e;
    private String f;

    @com.facebook.react.uimanager.a.a(a = "x")
    public void setX(String str) {
        this.f4927a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "y")
    public void setY(String str) {
        this.f4928b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "width")
    public void setWidth(String str) {
        this.f4929c = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "height")
    public void setHeight(String str) {
        this.f4930d = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "rx")
    public void setRx(String str) {
        this.e = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "ry")
    public void setRy(String str) {
        this.f = str;
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f4927a);
        double relativeOnHeight = relativeOnHeight(this.f4928b);
        double relativeOnWidth2 = relativeOnWidth(this.f4929c);
        double relativeOnHeight2 = relativeOnHeight(this.f4930d);
        double relativeOnWidth3 = relativeOnWidth(this.e);
        double relativeOnHeight3 = relativeOnHeight(this.f);
        int i = (relativeOnWidth3 > 0.0d ? 1 : (relativeOnWidth3 == 0.0d ? 0 : -1));
        if (i != 0 || relativeOnHeight3 != 0.0d) {
            if (i == 0) {
                relativeOnWidth3 = relativeOnHeight3;
            } else if (relativeOnHeight3 == 0.0d) {
                relativeOnHeight3 = relativeOnWidth3;
            }
            double d2 = relativeOnWidth2 / 2.0d;
            if (relativeOnWidth3 > d2) {
                relativeOnWidth3 = d2;
            }
            double d3 = relativeOnHeight2 / 2.0d;
            if (relativeOnHeight3 > d3) {
                relativeOnHeight3 = d3;
            }
            path.addRoundRect(new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2)), (float) relativeOnWidth3, (float) relativeOnHeight3, Path.Direction.CW);
        } else {
            path.addRect((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2), Path.Direction.CW);
        }
        return path;
    }
}
