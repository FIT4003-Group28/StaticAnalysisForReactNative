package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.map.l;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
/* loaded from: classes.dex */
public class WeightedLatLng extends l.a {
    public static final double DEFAULT_INTENSITY = 1.0d;

    /* renamed from: a  reason: collision with root package name */
    private Point f1717a;
    public final double intensity;
    public final LatLng latLng;

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
    }

    public WeightedLatLng(LatLng latLng, double d2) {
        if (latLng == null) {
            throw new IllegalArgumentException("latLng can not be null");
        }
        this.latLng = latLng;
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        this.f1717a = new Point((int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6());
        if (d2 > 0.0d) {
            this.intensity = d2;
        } else {
            this.intensity = 1.0d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.l.a
    public Point a() {
        return this.f1717a;
    }
}
