package com.baidu.mapapi.utils;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.model.inner.Point;
import com.baidu.platform.comapi.location.CoordinateType;
/* loaded from: classes.dex */
public class CoordinateConverter {

    /* renamed from: a  reason: collision with root package name */
    private LatLng f1945a;

    /* renamed from: b  reason: collision with root package name */
    private CoordType f1946b;

    /* loaded from: classes.dex */
    public enum CoordType {
        GPS,
        COMMON
    }

    private static LatLng a(LatLng latLng) {
        return a(latLng, CoordinateType.WGS84);
    }

    private static LatLng a(LatLng latLng, String str) {
        Point Coordinate_encryptEx;
        if (latLng == null || (Coordinate_encryptEx = CoordUtil.Coordinate_encryptEx((float) latLng.longitude, (float) latLng.latitude, str)) == null) {
            return null;
        }
        return CoordUtil.mc2ll(new GeoPoint(Coordinate_encryptEx.getmPty(), Coordinate_encryptEx.getmPtx()));
    }

    private static LatLng b(LatLng latLng) {
        return a(latLng, CoordinateType.GCJ02);
    }

    public LatLng convert() {
        if (this.f1945a == null) {
            return null;
        }
        if (this.f1946b == null) {
            this.f1946b = CoordType.GPS;
        }
        switch (this.f1946b) {
            case COMMON:
                return b(this.f1945a);
            case GPS:
                return a(this.f1945a);
            default:
                return null;
        }
    }

    public CoordinateConverter coord(LatLng latLng) {
        this.f1945a = latLng;
        return this;
    }

    public CoordinateConverter from(CoordType coordType) {
        this.f1946b = coordType;
        return this;
    }
}
