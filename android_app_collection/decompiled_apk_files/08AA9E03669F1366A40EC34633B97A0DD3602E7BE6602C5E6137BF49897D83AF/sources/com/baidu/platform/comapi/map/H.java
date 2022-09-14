package com.baidu.platform.comapi.map;

import android.graphics.Point;
import com.baidu.mapapi.model.inner.GeoPoint;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class H {

    /* renamed from: a  reason: collision with root package name */
    private com.baidu.platform.comjni.map.basemap.a f2043a;

    public H(com.baidu.platform.comjni.map.basemap.a aVar) {
        this.f2043a = aVar;
    }

    public Point a(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        Point point = new Point(0, 0);
        String b2 = this.f2043a.b((int) geoPoint.getLongitudeE6(), (int) geoPoint.getLatitudeE6());
        if (b2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(b2);
                point.x = jSONObject.getInt("scrx");
                point.y = jSONObject.getInt("scry");
                return point;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return point;
    }

    public GeoPoint a(int i, int i2) {
        String a2 = this.f2043a.a(i, i2);
        GeoPoint geoPoint = new GeoPoint(0.0d, 0.0d);
        if (a2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                geoPoint.setLongitudeE6(jSONObject.getInt("geox"));
                geoPoint.setLatitudeE6(jSONObject.getInt("geoy"));
                return geoPoint;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
