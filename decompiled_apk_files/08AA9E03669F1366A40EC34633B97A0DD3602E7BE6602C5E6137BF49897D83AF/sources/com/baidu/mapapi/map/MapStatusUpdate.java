package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.C0132e;
/* loaded from: classes.dex */
public final class MapStatusUpdate {
    private static final String l = "MapStatusUpdate";

    /* renamed from: a  reason: collision with root package name */
    int f1625a;

    /* renamed from: b  reason: collision with root package name */
    MapStatus f1626b;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1627c;

    /* renamed from: d  reason: collision with root package name */
    LatLngBounds f1628d;
    int e;
    int f;
    float g;
    int h;
    int i;
    float j;
    Point k;

    MapStatusUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapStatusUpdate(int i) {
        this.f1625a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapStatus a(C0132e c0132e, MapStatus mapStatus) {
        switch (this.f1625a) {
            case 1:
                return this.f1626b;
            case 2:
                return new MapStatus(mapStatus.rotate, this.f1627c, mapStatus.overlook, mapStatus.zoom, mapStatus.targetScreen, null);
            case 3:
                GeoPoint ll2mc = CoordUtil.ll2mc(this.f1628d.southwest);
                GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f1628d.northeast);
                float a2 = c0132e.a((int) ll2mc.getLongitudeE6(), (int) ll2mc2.getLatitudeE6(), (int) ll2mc2.getLongitudeE6(), (int) ll2mc.getLatitudeE6(), mapStatus.f1618a.j.f2035b - mapStatus.f1618a.j.f2034a, mapStatus.f1618a.j.f2037d - mapStatus.f1618a.j.f2036c);
                return new MapStatus(mapStatus.rotate, this.f1628d.getCenter(), mapStatus.overlook, a2, mapStatus.targetScreen, null);
            case 4:
                return new MapStatus(mapStatus.rotate, this.f1627c, mapStatus.overlook, this.g, mapStatus.targetScreen, null);
            case 5:
                c0132e.F();
                GeoPoint b2 = c0132e.b((c0132e.F() / 2) + this.h, (c0132e.G() / 2) + this.i);
                return new MapStatus(mapStatus.rotate, CoordUtil.mc2ll(b2), mapStatus.overlook, mapStatus.zoom, mapStatus.targetScreen, b2.getLongitudeE6(), b2.getLatitudeE6(), null);
            case 6:
                return new MapStatus(mapStatus.rotate, mapStatus.target, mapStatus.overlook, mapStatus.zoom + this.j, mapStatus.targetScreen, mapStatus.a(), mapStatus.b(), null);
            case 7:
                LatLng mc2ll = CoordUtil.mc2ll(c0132e.b(this.k.x, this.k.y));
                return new MapStatus(mapStatus.rotate, mc2ll, mapStatus.overlook, this.j + mapStatus.zoom, this.k, null);
            case 8:
                return new MapStatus(mapStatus.rotate, mapStatus.target, mapStatus.overlook, this.g, mapStatus.targetScreen, mapStatus.a(), mapStatus.b(), null);
            case 9:
                GeoPoint ll2mc3 = CoordUtil.ll2mc(this.f1628d.southwest);
                GeoPoint ll2mc4 = CoordUtil.ll2mc(this.f1628d.northeast);
                float a3 = c0132e.a((int) ll2mc3.getLongitudeE6(), (int) ll2mc4.getLatitudeE6(), (int) ll2mc4.getLongitudeE6(), (int) ll2mc3.getLatitudeE6(), this.e, this.f);
                return new MapStatus(mapStatus.rotate, this.f1628d.getCenter(), mapStatus.overlook, a3, mapStatus.targetScreen, null);
            default:
                return null;
        }
    }
}
