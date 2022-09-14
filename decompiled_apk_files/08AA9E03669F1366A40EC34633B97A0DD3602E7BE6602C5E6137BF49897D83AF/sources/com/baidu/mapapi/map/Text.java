package com.baidu.mapapi.map;

import android.graphics.Typeface;
import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.map.EnumC0135h;
import vi.com.gdi.bgl.android.java.EnvDrawText;
/* loaded from: classes.dex */
public final class Text extends Overlay {
    private static final String k = "Text";

    /* renamed from: a  reason: collision with root package name */
    String f1679a;

    /* renamed from: b  reason: collision with root package name */
    LatLng f1680b;

    /* renamed from: c  reason: collision with root package name */
    int f1681c;

    /* renamed from: d  reason: collision with root package name */
    int f1682d;
    int e;
    Typeface f;
    int g;
    int h;
    float i;
    int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Text() {
        this.q = EnumC0135h.text;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.Overlay
    public Bundle a() {
        if (this.f != null) {
            EnvDrawText.removeFontCache(this.f.hashCode());
        }
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    @Override // com.baidu.mapapi.map.Overlay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle a(android.os.Bundle r8) {
        /*
            r7 = this;
            super.a(r8)
            com.baidu.mapapi.model.LatLng r0 = r7.f1680b
            if (r0 != 0) goto Lf
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "when you add a text overlay, you must provide text and the position info."
            r8.<init>(r0)
            throw r8
        Lf:
            java.lang.String r0 = "text"
            java.lang.String r1 = r7.f1679a
            r8.putString(r0, r1)
            com.baidu.mapapi.model.LatLng r0 = r7.f1680b
            com.baidu.mapapi.model.inner.GeoPoint r0 = com.baidu.mapapi.model.CoordUtil.ll2mc(r0)
            java.lang.String r1 = "location_x"
            double r2 = r0.getLongitudeE6()
            r8.putDouble(r1, r2)
            java.lang.String r1 = "location_y"
            double r2 = r0.getLatitudeE6()
            r8.putDouble(r1, r2)
            int r0 = r7.f1682d
            int r0 = r0 >>> 24
            int r1 = r7.f1682d
            r2 = 16
            int r1 = r1 >> r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r7.f1682d
            r4 = 8
            int r3 = r3 >> r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r7.f1682d
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r5, r3, r1)
            java.lang.String r1 = "font_color"
            r8.putInt(r1, r0)
            int r0 = r7.f1681c
            int r0 = r0 >>> 24
            int r1 = r7.f1681c
            int r1 = r1 >> r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r7.f1681c
            int r3 = r3 >> r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r7.f1681c
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r5, r3, r1)
            java.lang.String r1 = "bg_color"
            r8.putInt(r1, r0)
            java.lang.String r0 = "font_size"
            int r1 = r7.e
            r8.putInt(r0, r1)
            android.graphics.Typeface r0 = r7.f
            if (r0 == 0) goto L89
            android.graphics.Typeface r0 = r7.f
            int r0 = r0.hashCode()
            android.graphics.Typeface r1 = r7.f
            vi.com.gdi.bgl.android.java.EnvDrawText.registFontCache(r0, r1)
            java.lang.String r0 = "type_face"
            android.graphics.Typeface r1 = r7.f
            int r1 = r1.hashCode()
            r8.putInt(r0, r1)
        L89:
            int r0 = r7.g
            r1 = 4
            r3 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r0 == r1) goto L96
            switch(r0) {
                case 1: goto L9c;
                case 2: goto L99;
                default: goto L96;
            }
        L96:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L9d
        L99:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L9d
        L9c:
            r0 = 0
        L9d:
            java.lang.String r1 = "align_x"
            r8.putFloat(r1, r0)
            int r0 = r7.h
            if (r0 == r4) goto Lae
            if (r0 == r2) goto Lab
            r1 = 32
            goto Laf
        Lab:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto Laf
        Lae:
            r6 = 0
        Laf:
            java.lang.String r0 = "align_y"
            r8.putFloat(r0, r6)
            java.lang.String r0 = "rotate"
            float r1 = r7.i
            r8.putFloat(r0, r1)
            java.lang.String r0 = "update"
            int r1 = r7.j
            r8.putInt(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.Text.a(android.os.Bundle):android.os.Bundle");
    }

    public float getAlignX() {
        return this.g;
    }

    public float getAlignY() {
        return this.h;
    }

    public int getBgColor() {
        return this.f1681c;
    }

    public int getFontColor() {
        return this.f1682d;
    }

    public int getFontSize() {
        return this.e;
    }

    public LatLng getPosition() {
        return this.f1680b;
    }

    public float getRotate() {
        return this.i;
    }

    public String getText() {
        return this.f1679a;
    }

    public Typeface getTypeface() {
        return this.f;
    }

    public void setAlign(int i, int i2) {
        this.g = i;
        this.h = i2;
        this.j = 1;
        this.listener.b(this);
    }

    public void setBgColor(int i) {
        this.f1681c = i;
        this.j = 1;
        this.listener.b(this);
    }

    public void setFontColor(int i) {
        this.f1682d = i;
        this.j = 1;
        this.listener.b(this);
    }

    public void setFontSize(int i) {
        this.e = i;
        this.j = 1;
        this.listener.b(this);
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("position can not be null");
        }
        this.f1680b = latLng;
        this.j = 1;
        this.listener.b(this);
    }

    public void setRotate(float f) {
        this.i = f;
        this.j = 1;
        this.listener.b(this);
    }

    public void setText(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("text can not be null or empty");
        }
        this.f1679a = str;
        this.j = 1;
        this.listener.b(this);
    }

    public void setTypeface(Typeface typeface) {
        this.f = typeface;
        this.j = 1;
        this.listener.b(this);
    }
}
