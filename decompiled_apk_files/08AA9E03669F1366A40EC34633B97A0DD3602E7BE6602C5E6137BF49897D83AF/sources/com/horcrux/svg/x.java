package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.aq;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.b;
/* compiled from: RadialGradientShadowNode.java */
/* loaded from: classes.dex */
class x extends e {
    private static final float[] i = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private String f4923a;

    /* renamed from: b  reason: collision with root package name */
    private String f4924b;

    /* renamed from: c  reason: collision with root package name */
    private String f4925c;

    /* renamed from: d  reason: collision with root package name */
    private String f4926d;
    private String e;
    private String f;
    private com.facebook.react.bridge.am g;
    private b.EnumC0090b h;
    private Matrix j = null;

    @com.facebook.react.uimanager.a.a(a = "fx")
    public void setFx(String str) {
        this.f4923a = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "fy")
    public void setFy(String str) {
        this.f4924b = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "rx")
    public void setRx(String str) {
        this.f4925c = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "ry")
    public void setRy(String str) {
        this.f4926d = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "cx")
    public void setCx(String str) {
        this.e = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "cy")
    public void setCy(String str) {
        this.f = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "gradient")
    public void setGradient(com.facebook.react.bridge.am amVar) {
        this.g = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "gradientUnits")
    public void setGradientUnits(int i2) {
        switch (i2) {
            case 0:
                this.h = b.EnumC0090b.OBJECT_BOUNDING_BOX;
                break;
            case 1:
                this.h = b.EnumC0090b.USER_SPACE_ON_USE;
                break;
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "gradientTransform")
    public void setGradientTransform(com.facebook.react.bridge.am amVar) {
        if (amVar != null) {
            int a2 = w.a(amVar, i, this.mScale);
            if (a2 == 6) {
                if (this.j == null) {
                    this.j = new Matrix();
                }
                this.j.setValues(i);
            } else if (a2 != -1) {
                com.facebook.common.e.a.c("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.j = null;
        }
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.horcrux.svg.am
    public void saveDefinition() {
        if (this.mName != null) {
            aq a2 = com.facebook.react.bridge.b.a();
            a2.pushString(this.f4923a);
            a2.pushString(this.f4924b);
            a2.pushString(this.f4925c);
            a2.pushString(this.f4926d);
            a2.pushString(this.e);
            a2.pushString(this.f);
            b bVar = new b(b.a.RADIAL_GRADIENT, a2, this.h);
            bVar.a(this.g);
            if (this.j != null) {
                bVar.a(this.j);
            }
            SvgViewShadowNode svgShadowNode = getSvgShadowNode();
            if (this.h == b.EnumC0090b.USER_SPACE_ON_USE) {
                bVar.a(svgShadowNode.getCanvasBounds());
            }
            svgShadowNode.defineBrush(bVar, this.mName);
        }
    }
}
