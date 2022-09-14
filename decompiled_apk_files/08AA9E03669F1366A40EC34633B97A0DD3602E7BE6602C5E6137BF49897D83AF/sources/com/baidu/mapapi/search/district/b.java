package com.baidu.mapapi.search.district;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    public static DistrictResult a(String str) {
        JSONObject jSONObject;
        String optString;
        int optInt;
        ArrayList arrayList;
        List<List<LatLng>> list = null;
        if (str == null || "".equals(str)) {
            return null;
        }
        DistrictResult districtResult = new DistrictResult();
        try {
            jSONObject = new JSONObject(str);
            districtResult.a(jSONObject.optInt("city_code"));
            optString = jSONObject.optString("city_name");
            districtResult.a(optString);
            districtResult.a(CoordUtil.decodeLocation(jSONObject.optString("center")));
            optInt = jSONObject.optInt("polylines_isgeo");
            arrayList = new ArrayList();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (optInt == 0) {
            JSONArray optJSONArray = jSONObject.optJSONArray("polylines");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    ArrayList arrayList2 = new ArrayList();
                    String optString2 = optJSONArray.optString(i);
                    if (optString2 != null && optString2.length() != 0) {
                        String[] split = optString2.split("\\,");
                        for (int i2 = 0; i2 < split.length; i2 += 2) {
                            try {
                                arrayList2.add(CoordUtil.mc2ll(new GeoPoint(Double.valueOf(split[i2 + 1]).doubleValue(), Double.valueOf(split[i2]).doubleValue())));
                            } catch (Exception unused) {
                            }
                        }
                        arrayList.add(arrayList2);
                    }
                }
            }
            districtResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return districtResult;
        } else if (optInt == 1) {
            if (optString != null) {
                if ((optString.indexOf("福建") > -1 || optString.indexOf("浙江") > -1) && optString.length() <= 3) {
                    list = b(jSONObject.optString("polylines"));
                } else {
                    try {
                        list = CoordUtil.decodeLocationList2D(jSONObject.optString("polylines"));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (list != null) {
                for (List<LatLng> list2 : list) {
                    ArrayList arrayList3 = new ArrayList();
                    for (LatLng latLng : list2) {
                        arrayList3.add(latLng);
                    }
                    arrayList.add(arrayList3);
                }
            }
        }
        if (arrayList.size() > 0) {
            districtResult.a(arrayList);
        }
        return districtResult;
    }

    private static List<List<LatLng>> b(String str) {
        ArrayList arrayList = null;
        if (str != null) {
            if (str.length() == 0) {
                return null;
            }
            String[] split = str.split("\\|");
            if (split.length < 3) {
                return null;
            }
            String[] split2 = split[2].split("\\;");
            if (split2 != null) {
                if (split2.length == 0) {
                    return null;
                }
                arrayList = new ArrayList();
                for (String str2 : split2) {
                    String[] split3 = str2.split("\\,");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < split3.length; i += 2) {
                        try {
                            arrayList2.add(CoordUtil.mc2ll(new GeoPoint(Double.valueOf(split3[i + 1]).doubleValue(), Double.valueOf(split3[i]).doubleValue())));
                        } catch (Exception unused) {
                        }
                    }
                    arrayList.add(arrayList2);
                }
            }
        }
        return arrayList;
    }
}
