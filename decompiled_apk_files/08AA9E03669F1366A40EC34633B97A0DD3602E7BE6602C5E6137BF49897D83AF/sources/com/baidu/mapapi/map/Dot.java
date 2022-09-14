package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.EnumC0135h;
/* loaded from: classes.dex */
public final class Dot extends Overlay {

    /* renamed from: a  reason: collision with root package name */
    LatLng f1571a;

    /* renamed from: b  reason: collision with root package name */
    int f1572b;

    /* renamed from: c  reason: collision with root package name */
    int f1573c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Dot() {
        this.q = EnumC0135h.dot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.Overlay
    public Bundle a(Bundle bundle) {
        super.a(bundle);
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f1571a);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("radius", this.f1573c);
        Overlay.a(this.f1572b, bundle);
        return bundle;
    }

    public LatLng getCenter() {
        return this.f1571a;
    }

    public int getColor() {
        return this.f1572b;
    }

    public int getRadius() {
        return this.f1573c;
    }

    public void setCenter(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("dot center can not be null");
        }
        this.f1571a = latLng;
        this.listener.b(this);
    }

    public void setColor(int i) {
        this.f1572b = i;
        this.listener.b(this);
    }

    public void setRadius(int i) {
        if (i > 0) {
            this.f1573c = i;
            this.listener.b(this);
        }
    }
}
