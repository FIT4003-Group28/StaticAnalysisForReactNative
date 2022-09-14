package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.EnumC0135h;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class Arc extends Overlay {
    private static final String f = "Arc";

    /* renamed from: a  reason: collision with root package name */
    int f1542a;

    /* renamed from: b  reason: collision with root package name */
    int f1543b;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1544c;

    /* renamed from: d  reason: collision with root package name */
    LatLng f1545d;
    LatLng e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Arc() {
        this.q = EnumC0135h.arc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.Overlay
    public Bundle a(Bundle bundle) {
        super.a(bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(this.f1544c);
        arrayList.add(this.f1545d);
        arrayList.add(this.e);
        GeoPoint ll2mc = CoordUtil.ll2mc((LatLng) arrayList.get(0));
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("width", this.f1543b);
        Overlay.a(arrayList, bundle);
        Overlay.a(this.f1542a, bundle);
        return bundle;
    }

    public int getColor() {
        return this.f1542a;
    }

    public LatLng getEndPoint() {
        return this.e;
    }

    public LatLng getMiddlePoint() {
        return this.f1545d;
    }

    public LatLng getStartPoint() {
        return this.f1544c;
    }

    public int getWidth() {
        return this.f1543b;
    }

    public void setColor(int i) {
        this.f1542a = i;
        this.listener.b(this);
    }

    public void setPoints(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng == null || latLng2 == null || latLng3 == null) {
            throw new IllegalArgumentException("start and middle and end points can not be null");
        }
        if (latLng == latLng2 || latLng == latLng3 || latLng2 == latLng3) {
            throw new IllegalArgumentException("start and middle and end points can not be same");
        }
        this.f1544c = latLng;
        this.f1545d = latLng2;
        this.e = latLng3;
        this.listener.b(this);
    }

    public void setWidth(int i) {
        if (i > 0) {
            this.f1543b = i;
            this.listener.b(this);
        }
    }
}
