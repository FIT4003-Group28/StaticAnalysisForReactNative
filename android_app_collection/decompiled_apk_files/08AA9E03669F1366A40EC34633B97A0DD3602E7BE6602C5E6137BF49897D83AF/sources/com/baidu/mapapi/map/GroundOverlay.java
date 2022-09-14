package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.EnumC0135h;
/* loaded from: classes.dex */
public final class GroundOverlay extends Overlay {
    private static final String j = "GroundOverlay";

    /* renamed from: a  reason: collision with root package name */
    int f1585a;

    /* renamed from: b  reason: collision with root package name */
    BitmapDescriptor f1586b;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1587c;

    /* renamed from: d  reason: collision with root package name */
    double f1588d;
    double e;
    float f;
    float g;
    LatLngBounds h;
    float i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GroundOverlay() {
        this.q = EnumC0135h.ground;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.Overlay
    public Bundle a(Bundle bundle) {
        super.a(bundle);
        bundle.putBundle("image_info", this.f1586b.b());
        if (this.f1585a == 1) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.h.southwest);
            double longitudeE6 = ll2mc.getLongitudeE6();
            double latitudeE6 = ll2mc.getLatitudeE6();
            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.h.northeast);
            double longitudeE62 = ll2mc2.getLongitudeE6();
            double latitudeE62 = ll2mc2.getLatitudeE6();
            this.f1588d = longitudeE62 - longitudeE6;
            this.e = latitudeE62 - latitudeE6;
            this.f1587c = CoordUtil.mc2ll(new GeoPoint(latitudeE6 + (this.e / 2.0d), longitudeE6 + (this.f1588d / 2.0d)));
            this.f = 0.5f;
            this.g = 0.5f;
        }
        if (this.f1588d <= 0.0d || this.e <= 0.0d) {
            throw new IllegalStateException("when you add ground overlay, the width and height must greater than 0");
        }
        bundle.putDouble("x_distance", this.f1588d);
        if (this.e == 2.147483647E9d) {
            this.e = (int) ((this.f1588d * this.f1586b.f1560a.getHeight()) / this.f1586b.f1560a.getWidth());
        }
        bundle.putDouble("y_distance", this.e);
        GeoPoint ll2mc3 = CoordUtil.ll2mc(this.f1587c);
        bundle.putDouble("location_x", ll2mc3.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc3.getLatitudeE6());
        bundle.putFloat("anchor_x", this.f);
        bundle.putFloat("anchor_y", this.g);
        bundle.putFloat("transparency", this.i);
        return bundle;
    }

    public float getAnchorX() {
        return this.f;
    }

    public float getAnchorY() {
        return this.g;
    }

    public LatLngBounds getBounds() {
        return this.h;
    }

    public double getHeight() {
        return this.e;
    }

    public BitmapDescriptor getImage() {
        return this.f1586b;
    }

    public LatLng getPosition() {
        return this.f1587c;
    }

    public float getTransparency() {
        return this.i;
    }

    public double getWidth() {
        return this.f1588d;
    }

    public void setAnchor(float f, float f2) {
        if (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f > 1.0f || f2 < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f2 > 1.0f) {
            return;
        }
        this.f = f;
        this.g = f2;
        this.listener.b(this);
    }

    public void setDimensions(int i) {
        this.f1588d = i;
        this.e = 2.147483647E9d;
        this.listener.b(this);
    }

    public void setDimensions(int i, int i2) {
        this.f1588d = i;
        this.e = i2;
        this.listener.b(this);
    }

    public void setImage(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("image can not be null");
        }
        this.f1586b = bitmapDescriptor;
        this.listener.b(this);
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("position can not be null");
        }
        this.f1585a = 2;
        this.f1587c = latLng;
        this.listener.b(this);
    }

    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new IllegalArgumentException("bounds can not be null");
        }
        this.f1585a = 1;
        this.h = latLngBounds;
        this.listener.b(this);
    }

    public void setTransparency(float f) {
        if (f > 1.0f || f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.i = f;
        this.listener.b(this);
    }
}
