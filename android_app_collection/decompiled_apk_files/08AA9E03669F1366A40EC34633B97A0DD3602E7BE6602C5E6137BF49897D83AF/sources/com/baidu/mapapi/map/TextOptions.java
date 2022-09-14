package com.baidu.mapapi.map;

import android.graphics.Typeface;
import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public final class TextOptions extends OverlayOptions {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;

    /* renamed from: a  reason: collision with root package name */
    int f1683a;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1685c;

    /* renamed from: d  reason: collision with root package name */
    private String f1686d;
    private LatLng e;
    private int f;
    private Typeface i;
    private float l;
    private int g = -16777216;
    private int h = 12;
    private int j = 4;
    private int k = 32;

    /* renamed from: b  reason: collision with root package name */
    boolean f1684b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
        Text text = new Text();
        text.s = this.f1684b;
        text.r = this.f1683a;
        text.t = this.f1685c;
        text.f1679a = this.f1686d;
        text.f1680b = this.e;
        text.f1681c = this.f;
        text.f1682d = this.g;
        text.e = this.h;
        text.f = this.i;
        text.g = this.j;
        text.h = this.k;
        text.i = this.l;
        return text;
    }

    public TextOptions align(int i, int i2) {
        this.j = i;
        this.k = i2;
        return this;
    }

    public TextOptions bgColor(int i) {
        this.f = i;
        return this;
    }

    public TextOptions extraInfo(Bundle bundle) {
        this.f1685c = bundle;
        return this;
    }

    public TextOptions fontColor(int i) {
        this.g = i;
        return this;
    }

    public TextOptions fontSize(int i) {
        this.h = i;
        return this;
    }

    public float getAlignX() {
        return this.j;
    }

    public float getAlignY() {
        return this.k;
    }

    public int getBgColor() {
        return this.f;
    }

    public Bundle getExtraInfo() {
        return this.f1685c;
    }

    public int getFontColor() {
        return this.g;
    }

    public int getFontSize() {
        return this.h;
    }

    public LatLng getPosition() {
        return this.e;
    }

    public float getRotate() {
        return this.l;
    }

    public String getText() {
        return this.f1686d;
    }

    public Typeface getTypeface() {
        return this.i;
    }

    public int getZIndex() {
        return this.f1683a;
    }

    public boolean isVisible() {
        return this.f1684b;
    }

    public TextOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("position can not be null");
        }
        this.e = latLng;
        return this;
    }

    public TextOptions rotate(float f) {
        this.l = f;
        return this;
    }

    public TextOptions text(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("text can not be null or empty");
        }
        this.f1686d = str;
        return this;
    }

    public TextOptions typeface(Typeface typeface) {
        this.i = typeface;
        return this;
    }

    public TextOptions visible(boolean z) {
        this.f1684b = z;
        return this;
    }

    public TextOptions zIndex(int i) {
        this.f1683a = i;
        return this;
    }
}
