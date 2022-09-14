package com.baidu.mapapi.favorite;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.Point;
import com.baidu.platform.comapi.favrite.FavSyncPoi;
import org.json.JSONObject;
/* loaded from: classes.dex */
class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static FavoritePoiInfo a(FavSyncPoi favSyncPoi) {
        if (favSyncPoi == null || favSyncPoi.f2000c == null || favSyncPoi.f1999b.equals("")) {
            return null;
        }
        FavoritePoiInfo favoritePoiInfo = new FavoritePoiInfo();
        favoritePoiInfo.f1528a = favSyncPoi.f1998a;
        favoritePoiInfo.f1529b = favSyncPoi.f1999b;
        favoritePoiInfo.f1530c = new LatLng(favSyncPoi.f2000c.y / 1000000.0d, favSyncPoi.f2000c.x / 1000000.0d);
        favoritePoiInfo.e = favSyncPoi.e;
        favoritePoiInfo.f = favSyncPoi.f;
        favoritePoiInfo.f1531d = favSyncPoi.f2001d;
        favoritePoiInfo.g = Long.parseLong(favSyncPoi.h);
        return favoritePoiInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FavoritePoiInfo a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        FavoritePoiInfo favoritePoiInfo = new FavoritePoiInfo();
        JSONObject optJSONObject = jSONObject.optJSONObject("pt");
        if (optJSONObject != null) {
            favoritePoiInfo.f1530c = new LatLng(optJSONObject.optInt("y") / 1000000.0d, optJSONObject.optInt("x") / 1000000.0d);
        }
        favoritePoiInfo.f1529b = jSONObject.optString("uspoiname");
        favoritePoiInfo.g = Long.parseLong(jSONObject.optString("addtimesec"));
        favoritePoiInfo.f1531d = jSONObject.optString("addr");
        favoritePoiInfo.f = jSONObject.optString("uspoiuid");
        favoritePoiInfo.e = jSONObject.optString("ncityid");
        favoritePoiInfo.f1528a = jSONObject.optString("key");
        return favoritePoiInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FavSyncPoi a(FavoritePoiInfo favoritePoiInfo) {
        if (favoritePoiInfo == null || favoritePoiInfo.f1530c == null || favoritePoiInfo.f1529b == null || favoritePoiInfo.f1529b.equals("")) {
            return null;
        }
        FavSyncPoi favSyncPoi = new FavSyncPoi();
        favSyncPoi.f1999b = favoritePoiInfo.f1529b;
        favSyncPoi.f2000c = new Point((int) (favoritePoiInfo.f1530c.longitude * 1000000.0d), (int) (favoritePoiInfo.f1530c.latitude * 1000000.0d));
        favSyncPoi.f2001d = favoritePoiInfo.f1531d;
        favSyncPoi.e = favoritePoiInfo.e;
        favSyncPoi.f = favoritePoiInfo.f;
        favSyncPoi.i = false;
        return favSyncPoi;
    }
}
