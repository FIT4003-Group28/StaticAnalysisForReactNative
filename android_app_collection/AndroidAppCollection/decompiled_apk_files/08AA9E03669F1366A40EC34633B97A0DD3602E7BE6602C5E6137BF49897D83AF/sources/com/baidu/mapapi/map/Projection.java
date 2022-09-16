package com.baidu.mapapi.map;

import android.graphics.Point;
import android.graphics.PointF;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.C0132e;
import com.baidu.platform.comapi.map.D;
/* loaded from: classes.dex */
public final class Projection {

    /* renamed from: a  reason: collision with root package name */
    private C0132e f1670a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Projection(C0132e c0132e) {
        this.f1670a = c0132e;
    }

    public LatLng fromScreenLocation(Point point) {
        if (point == null || this.f1670a == null) {
            return null;
        }
        return CoordUtil.mc2ll(this.f1670a.b(point.x, point.y));
    }

    public float metersToEquatorPixels(float f) {
        return f <= com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED : (float) (f / this.f1670a.I());
    }

    public PointF toOpenGLLocation(LatLng latLng, MapStatus mapStatus) {
        if (latLng == null || mapStatus == null) {
            return null;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        D d2 = mapStatus.f1618a;
        return new PointF((float) ((ll2mc.getLongitudeE6() - d2.f2029d) / d2.n), (float) ((ll2mc.getLatitudeE6() - d2.e) / d2.n));
    }

    public Point toScreenLocation(LatLng latLng) {
        if (latLng == null || this.f1670a == null) {
            return null;
        }
        return this.f1670a.a(CoordUtil.ll2mc(latLng));
    }
}
