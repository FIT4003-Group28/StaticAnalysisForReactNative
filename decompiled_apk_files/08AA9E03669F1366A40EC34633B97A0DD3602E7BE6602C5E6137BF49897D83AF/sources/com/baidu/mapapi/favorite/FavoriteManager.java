package com.baidu.mapapi.favorite;

import android.util.Log;
import com.baidu.mapapi.BMapManager;
import com.baidu.platform.comapi.favrite.FavSyncPoi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class FavoriteManager extends com.baidu.mapapi.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    private static FavoriteManager f1526a;

    /* renamed from: b  reason: collision with root package name */
    private static com.baidu.platform.comapi.favrite.a f1527b;

    private FavoriteManager() {
    }

    public static FavoriteManager getInstance() {
        if (f1526a == null) {
            f1526a = new FavoriteManager();
        }
        return f1526a;
    }

    public int add(FavoritePoiInfo favoritePoiInfo) {
        String str;
        String str2;
        if (f1527b == null) {
            str = "baidumapsdk";
            str2 = "you may have not call init method!";
        } else if (favoritePoiInfo != null && favoritePoiInfo.f1530c != null) {
            if (favoritePoiInfo.f1529b == null || favoritePoiInfo.f1529b.equals("")) {
                Log.e("baidumapsdk", "poiName can not be null or empty!");
                return -1;
            }
            FavSyncPoi a2 = a.a(favoritePoiInfo);
            int a3 = f1527b.a(a2.f1999b, a2);
            if (a3 == 1) {
                favoritePoiInfo.f1528a = a2.f1998a;
                favoritePoiInfo.g = Long.parseLong(a2.h);
            }
            return a3;
        } else {
            str = "baidumapsdk";
            str2 = "object or pt can not be null!";
        }
        Log.e(str, str2);
        return 0;
    }

    public boolean clearAllFavPois() {
        if (f1527b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return false;
        }
        return f1527b.c();
    }

    public boolean deleteFavPoi(String str) {
        if (f1527b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return false;
        } else if (str != null && !str.equals("")) {
            return f1527b.a(str);
        } else {
            return false;
        }
    }

    public void destroy() {
        if (f1527b != null) {
            f1527b.b();
            f1527b = null;
            BMapManager.destroy();
        }
    }

    public List<FavoritePoiInfo> getAllFavPois() {
        JSONArray optJSONArray;
        if (f1527b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return null;
        }
        String f = f1527b.f();
        if (f == null || f.equals("")) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(f);
            if (jSONObject.optInt("favpoinum") != 0 && (optJSONArray = jSONObject.optJSONArray("favcontents")) != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        arrayList.add(a.a(jSONObject2));
                    }
                }
                return arrayList;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public FavoritePoiInfo getFavPoi(String str) {
        FavSyncPoi b2;
        if (f1527b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return null;
        } else if (str != null && !str.equals("") && (b2 = f1527b.b(str)) != null) {
            return a.a(b2);
        } else {
            return null;
        }
    }

    public void init() {
        if (f1527b == null) {
            f1527b = com.baidu.platform.comapi.favrite.a.a();
            BMapManager.init();
        }
    }

    public boolean updateFavPoi(String str, FavoritePoiInfo favoritePoiInfo) {
        String str2;
        String str3;
        if (f1527b == null) {
            str2 = "baidumapsdk";
            str3 = "you may have not call init method!";
        } else if (str == null || str.equals("") || favoritePoiInfo == null) {
            return false;
        } else {
            if (favoritePoiInfo == null || favoritePoiInfo.f1530c == null) {
                str2 = "baidumapsdk";
                str3 = "object or pt can not be null!";
            } else if (favoritePoiInfo.f1529b != null && !favoritePoiInfo.f1529b.equals("")) {
                favoritePoiInfo.f1528a = str;
                return f1527b.b(str, a.a(favoritePoiInfo));
            } else {
                str2 = "baidumapsdk";
                str3 = "poiName can not be null or empty!";
            }
        }
        Log.e(str2, str3);
        return false;
    }
}
