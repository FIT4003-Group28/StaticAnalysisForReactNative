package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: SymbolShadowNode.java */
/* loaded from: classes.dex */
class z extends o {

    /* renamed from: b  reason: collision with root package name */
    private float f4931b;

    /* renamed from: c  reason: collision with root package name */
    private float f4932c;

    /* renamed from: d  reason: collision with root package name */
    private float f4933d;
    private float e;
    private String f;
    private int g;

    @com.facebook.react.uimanager.a.a(a = "minX")
    public void setMinX(float f) {
        this.f4931b = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "minY")
    public void setMinY(float f) {
        this.f4932c = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "vbWidth")
    public void setVbWidth(float f) {
        this.f4933d = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "vbHeight")
    public void setVbHeight(float f) {
        this.e = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "align")
    public void setAlign(String str) {
        this.f = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.g = i;
        markUpdated();
    }

    @Override // com.horcrux.svg.o, com.horcrux.svg.RenderableShadowNode, com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.f != null) {
            canvas.concat(al.a(new RectF(this.f4931b * this.mScale, this.f4932c * this.mScale, (this.f4931b + this.f4933d) * this.mScale, (this.f4932c + this.e) * this.mScale), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f3), this.f, this.g));
            super.draw(canvas, paint, f);
        }
    }
}
