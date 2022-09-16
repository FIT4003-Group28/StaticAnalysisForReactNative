package com.baidu.mapapi.map;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class MapPoi {

    /* renamed from: d  reason: collision with root package name */
    private static final String f1614d = "MapPoi";

    /* renamed from: a  reason: collision with root package name */
    String f1615a;

    /* renamed from: b  reason: collision with root package name */
    LatLng f1616b;

    /* renamed from: c  reason: collision with root package name */
    String f1617c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        this.f1615a = jSONObject.optString("tx");
        this.f1616b = CoordUtil.decodeNodeLocation(jSONObject.optString("geo"));
        this.f1617c = jSONObject.optString("ud");
    }

    public String getName() {
        return this.f1615a;
    }

    public LatLng getPosition() {
        return this.f1616b;
    }

    public String getUid() {
        return this.f1617c;
    }
}
