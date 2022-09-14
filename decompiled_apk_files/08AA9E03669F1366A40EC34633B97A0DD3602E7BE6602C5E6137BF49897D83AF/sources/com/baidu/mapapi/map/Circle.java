package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.EnumC0135h;
/* loaded from: classes.dex */
public final class Circle extends Overlay {

    /* renamed from: a  reason: collision with root package name */
    LatLng f1563a;

    /* renamed from: b  reason: collision with root package name */
    int f1564b;

    /* renamed from: c  reason: collision with root package name */
    int f1565c;

    /* renamed from: d  reason: collision with root package name */
    Stroke f1566d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Circle() {
        this.q = EnumC0135h.circle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.Overlay
    public Bundle a(Bundle bundle) {
        super.a(bundle);
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f1563a);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("radius", CoordUtil.getMCDistanceByOneLatLngAndRadius(this.f1563a, this.f1565c));
        Overlay.a(this.f1564b, bundle);
        if (this.f1566d == null) {
            bundle.putInt("has_stroke", 0);
            return bundle;
        }
        bundle.putInt("has_stroke", 1);
        bundle.putBundle("stroke", this.f1566d.a(new Bundle()));
        return bundle;
    }

    public LatLng getCenter() {
        return this.f1563a;
    }

    public int getFillColor() {
        return this.f1564b;
    }

    public int getRadius() {
        return this.f1565c;
    }

    public Stroke getStroke() {
        return this.f1566d;
    }

    public void setCenter(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("circle center can not be null");
        }
        this.f1563a = latLng;
        this.listener.b(this);
    }

    public void setFillColor(int i) {
        this.f1564b = i;
        this.listener.b(this);
    }

    public void setRadius(int i) {
        this.f1565c = i;
        this.listener.b(this);
    }

    public void setStroke(Stroke stroke) {
        this.f1566d = stroke;
        this.listener.b(this);
    }
}
