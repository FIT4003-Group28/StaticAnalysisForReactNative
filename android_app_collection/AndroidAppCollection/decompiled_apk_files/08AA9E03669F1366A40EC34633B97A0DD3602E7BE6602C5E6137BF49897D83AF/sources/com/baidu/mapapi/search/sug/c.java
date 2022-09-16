package com.baidu.mapapi.search.sug;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.sug.SuggestionResult;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    public static SuggestionResult a(String str) {
        SuggestionResult suggestionResult = new SuggestionResult();
        if (str == null || str.equals("")) {
            suggestionResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return suggestionResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("cityname");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("poiname");
            JSONArray optJSONArray3 = jSONObject.optJSONArray("districtname");
            JSONArray optJSONArray4 = jSONObject.optJSONArray("pt");
            JSONArray optJSONArray5 = jSONObject.optJSONArray("poiid");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                ArrayList<SuggestionResult.SuggestionInfo> arrayList = new ArrayList<>();
                suggestionResult.a(arrayList);
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    SuggestionResult.SuggestionInfo suggestionInfo = new SuggestionResult.SuggestionInfo();
                    if (optJSONArray != null) {
                        suggestionInfo.city = optJSONArray.optString(i);
                    }
                    if (optJSONArray2 != null) {
                        suggestionInfo.key = optJSONArray2.optString(i);
                    }
                    if (optJSONArray3 != null) {
                        suggestionInfo.district = optJSONArray3.optString(i);
                    }
                    JSONObject optJSONObject = optJSONArray4.optJSONObject(i);
                    if (optJSONObject.has("x") && optJSONObject.has("y")) {
                        GeoPoint geoPoint = new GeoPoint(0.0d, 0.0d);
                        geoPoint.setLongitudeE6((int) optJSONObject.optDouble("x"));
                        geoPoint.setLatitudeE6((int) optJSONObject.optDouble("y"));
                        suggestionInfo.pt = CoordUtil.mc2ll(geoPoint);
                    }
                    if (optJSONArray5 != null) {
                        suggestionInfo.uid = optJSONArray5.optString(i);
                    }
                    arrayList.add(suggestionInfo);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            suggestionResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
        return suggestionResult;
    }
}
