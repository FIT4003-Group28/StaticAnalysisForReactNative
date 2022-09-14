package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public final class CircleOptions extends OverlayOptions {

    /* renamed from: d  reason: collision with root package name */
    private static final String f1567d = "CircleOptions";

    /* renamed from: a  reason: collision with root package name */
    int f1568a;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1570c;
    private LatLng e;
    private int g;
    private Stroke h;
    private int f = -16777216;

    /* renamed from: b  reason: collision with root package name */
    boolean f1569b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
        Circle circle = new Circle();
        circle.s = this.f1569b;
        circle.r = this.f1568a;
        circle.t = this.f1570c;
        circle.f1564b = this.f;
        circle.f1563a = this.e;
        circle.f1565c = this.g;
        circle.f1566d = this.h;
        return circle;
    }

    public CircleOptions center(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("circle center can not be null");
        }
        this.e = latLng;
        return this;
    }

    public CircleOptions extraInfo(Bundle bundle) {
        this.f1570c = bundle;
        return this;
    }

    public CircleOptions fillColor(int i) {
        this.f = i;
        return this;
    }

    public LatLng getCenter() {
        return this.e;
    }

    public Bundle getExtraInfo() {
        return this.f1570c;
    }

    public int getFillColor() {
        return this.f;
    }

    public int getRadius() {
        return this.g;
    }

    public Stroke getStroke() {
        return this.h;
    }

    public int getZIndex() {
        return this.f1568a;
    }

    public boolean isVisible() {
        return this.f1569b;
    }

    public CircleOptions radius(int i) {
        this.g = i;
        return this;
    }

    public CircleOptions stroke(Stroke stroke) {
        this.h = stroke;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.f1569b = z;
        return this;
    }

    public CircleOptions zIndex(int i) {
        this.f1568a = i;
        return this;
    }
}
