package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.aq;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.b;
/* compiled from: LinearGradientShadowNode.java */
/* loaded from: classes.dex */
class s extends e {
    private static final float[] g = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private String f4910a;

    /* renamed from: b  reason: collision with root package name */
    private String f4911b;

    /* renamed from: c  reason: collision with root package name */
    private String f4912c;

    /* renamed from: d  reason: collision with root package name */
    private String f4913d;
    private com.facebook.react.bridge.am e;
    private b.EnumC0090b f;
    private Matrix h = null;

    @com.facebook.react.uimanager.a.a(a = "x1")
    public void setX1(String str) {
        this.f4910a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "y1")
    public void setY1(String str) {
        this.f4911b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "x2")
    public void setX2(String str) {
        this.f4912c = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "y2")
    public void setY2(String str) {
        this.f4913d = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "gradient")
    public void setGradient(com.facebook.react.bridge.am amVar) {
        this.e = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "gradientUnits")
    public void setGradientUnits(int i) {
        switch (i) {
            case 0:
                this.f = b.EnumC0090b.OBJECT_BOUNDING_BOX;
                break;
            case 1:
                this.f = b.EnumC0090b.USER_SPACE_ON_USE;
                break;
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "gradientTransform")
    public void setGradientTransform(com.facebook.react.bridge.am amVar) {
        if (amVar != null) {
            int a2 = w.a(amVar, g, this.mScale);
            if (a2 == 6) {
                if (this.h == null) {
                    this.h = new Matrix();
                }
                this.h.setValues(g);
            } else if (a2 != -1) {
                com.facebook.common.e.a.c("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.h = null;
        }
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.am
    public void saveDefinition() {
        if (this.mName != null) {
            aq a2 = com.facebook.react.bridge.b.a();
            a2.pushString(this.f4910a);
            a2.pushString(this.f4911b);
            a2.pushString(this.f4912c);
            a2.pushString(this.f4913d);
            b bVar = new b(b.a.LINEAR_GRADIENT, a2, this.f);
            bVar.a(this.e);
            if (this.h != null) {
                bVar.a(this.h);
            }
            SvgViewShadowNode svgShadowNode = getSvgShadowNode();
            if (this.f == b.EnumC0090b.USER_SPACE_ON_USE) {
                bVar.a(svgShadowNode.getCanvasBounds());
            }
            svgShadowNode.defineBrush(bVar, this.mName);
        }
    }
}
