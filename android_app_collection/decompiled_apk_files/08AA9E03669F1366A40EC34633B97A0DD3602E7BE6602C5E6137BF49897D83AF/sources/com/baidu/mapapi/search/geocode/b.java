package com.baidu.mapapi.search.geocode;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private static ReverseGeoCodeResult.AddressComponent a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        ReverseGeoCodeResult.AddressComponent addressComponent = new ReverseGeoCodeResult.AddressComponent();
        addressComponent.city = optJSONObject.optString("city");
        addressComponent.district = optJSONObject.optString("district");
        addressComponent.province = optJSONObject.optString("province");
        addressComponent.street = optJSONObject.optString("street");
        addressComponent.streetNumber = optJSONObject.optString("street_number");
        return addressComponent;
    }

    public static ReverseGeoCodeResult a(String str) {
        ReverseGeoCodeResult reverseGeoCodeResult = new ReverseGeoCodeResult();
        if (str == null || "".equals(str)) {
            reverseGeoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return reverseGeoCodeResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            reverseGeoCodeResult.b(jSONObject.optString("address"));
            reverseGeoCodeResult.a(jSONObject.optString("business"));
            reverseGeoCodeResult.a(a(jSONObject, "addr_detail"));
            reverseGeoCodeResult.a(b(jSONObject, "point"));
            reverseGeoCodeResult.a(c(jSONObject, "surround_poi"));
            return reverseGeoCodeResult;
        } catch (JSONException e) {
            e.printStackTrace();
            reverseGeoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return reverseGeoCodeResult;
        }
    }

    private static LatLng b(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return CoordUtil.mc2ll(new GeoPoint(optJSONObject.optInt("y"), optJSONObject.optInt("x")));
    }

    public static GeoCodeResult b(String str) {
        GeoCodeResult geoCodeResult = new GeoCodeResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("error") != 0) {
                geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return geoCodeResult;
            }
            geoCodeResult.a(CoordUtil.mc2ll(new GeoPoint(jSONObject.optInt("y"), jSONObject.optInt("x"))));
            geoCodeResult.setAddress(jSONObject.optString("addr"));
            return geoCodeResult;
        } catch (JSONException e) {
            geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            e.printStackTrace();
            return geoCodeResult;
        }
    }

    private static List<PoiInfo> c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                PoiInfo poiInfo = new PoiInfo();
                poiInfo.address = optJSONObject.optString("addr");
                poiInfo.phoneNum = optJSONObject.optString("tel");
                poiInfo.uid = optJSONObject.optString("uid");
                poiInfo.postCode = optJSONObject.optString("zip");
                poiInfo.name = optJSONObject.optString("name");
                poiInfo.location = b(optJSONObject, "point");
                arrayList.add(poiInfo);
            }
        }
        return arrayList;
    }
}
