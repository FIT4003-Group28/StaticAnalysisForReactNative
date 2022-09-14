package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class d {
    public static PoiResult a(String str) {
        SearchResult.ERRORNO errorno;
        JSONArray optJSONArray;
        PoiResult poiResult = new PoiResult();
        if (str != null && !"".equals(str)) {
            try {
                optJSONArray = new JSONObject(str).optJSONArray("citys");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) optJSONArray.opt(i);
                    if (jSONObject != null) {
                        CityInfo cityInfo = new CityInfo();
                        cityInfo.num = jSONObject.optInt("num");
                        cityInfo.city = jSONObject.optString("name");
                        arrayList.add(cityInfo);
                    }
                }
                if (arrayList.size() > 0) {
                    poiResult.c(arrayList);
                }
                errorno = SearchResult.ERRORNO.AMBIGUOUS_KEYWORD;
                poiResult.error = errorno;
                return poiResult;
            }
        }
        errorno = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        poiResult.error = errorno;
        return poiResult;
    }

    public static PoiResult a(String str, int i, int i2) {
        PoiResult poiResult = new PoiResult();
        if (str != null && !str.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("total");
                int optInt2 = jSONObject.optInt("count");
                if (optInt2 != 0) {
                    poiResult.b(optInt);
                    poiResult.d(optInt);
                    poiResult.c(optInt2);
                    poiResult.a(i);
                    if (optInt2 != 0) {
                        poiResult.b((optInt / i2) + (optInt % i2 > 0 ? 1 : 0));
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("current_city");
                    String str2 = null;
                    if (optJSONObject != null) {
                        str2 = optJSONObject.optString("name");
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("pois");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                            PoiInfo poiInfo = new PoiInfo();
                            if (optJSONObject2 != null) {
                                poiInfo.name = optJSONObject2.optString("name");
                                poiInfo.address = optJSONObject2.optString("addr");
                                poiInfo.uid = optJSONObject2.optString("uid");
                                poiInfo.phoneNum = optJSONObject2.optString("tel");
                                poiInfo.type = PoiInfo.POITYPE.fromInt(optJSONObject2.optInt("type"));
                                poiInfo.isPano = optJSONObject2.optInt("pano") == 1;
                                if (poiInfo.type != PoiInfo.POITYPE.BUS_LINE && poiInfo.type != PoiInfo.POITYPE.SUBWAY_LINE) {
                                    poiInfo.location = CoordUtil.decodeLocation(optJSONObject2.optString("geo"));
                                }
                                poiInfo.city = str2;
                                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("place");
                                if (optJSONObject3 != null && "cater".equals(optJSONObject3.optString("src_name")) && optJSONObject2.optBoolean(ProductAction.ACTION_DETAIL)) {
                                    poiInfo.hasCaterDetails = true;
                                }
                                arrayList.add(poiInfo);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        poiResult.a(arrayList);
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("addrs");
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray2 != null) {
                        for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                            JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i4);
                            PoiAddrInfo poiAddrInfo = new PoiAddrInfo();
                            if (optJSONObject4 != null) {
                                poiAddrInfo.name = optJSONObject4.optString("name");
                                poiAddrInfo.address = optJSONObject4.optString("addr");
                                poiAddrInfo.location = CoordUtil.decodeLocation(optJSONObject4.optString("geo"));
                                arrayList2.add(poiAddrInfo);
                            }
                        }
                    }
                    if (arrayList2.size() > 0) {
                        poiResult.b(arrayList2);
                        poiResult.a(true);
                    }
                    return poiResult;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        poiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return poiResult;
    }

    public static PoiIndoorResult b(String str) {
        PoiIndoorResult poiIndoorResult = new PoiIndoorResult();
        if (str == null || "".equals(str)) {
            poiIndoorResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiIndoorResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("poi_list");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                poiIndoorResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i);
                    if (jSONObject2 != null) {
                        PoiIndoorInfo poiIndoorInfo = new PoiIndoorInfo();
                        poiIndoorInfo.address = jSONObject2.optString("address");
                        poiIndoorInfo.bid = jSONObject2.optString("bd_id");
                        poiIndoorInfo.cid = jSONObject2.optInt("cid");
                        poiIndoorInfo.discount = jSONObject2.optInt("discount");
                        poiIndoorInfo.floor = jSONObject2.optString("floor");
                        poiIndoorInfo.name = jSONObject2.optString("name");
                        poiIndoorInfo.phone = jSONObject2.optString("phone");
                        poiIndoorInfo.price = jSONObject2.optInt("price");
                        poiIndoorInfo.starLevel = jSONObject2.optInt("star_level");
                        poiIndoorInfo.tag = jSONObject2.optString("tag");
                        poiIndoorInfo.uid = jSONObject2.optString("uid");
                        poiIndoorInfo.groupNum = jSONObject2.optInt("tuan_nums");
                        poiIndoorInfo.isGroup = jSONObject2.optBoolean("t_flag");
                        poiIndoorInfo.isTakeOut = jSONObject2.optBoolean("w_flag");
                        poiIndoorInfo.isWaited = jSONObject2.optBoolean("p_flag");
                        poiIndoorInfo.latLng = CoordUtil.mc2ll(new GeoPoint(jSONObject2.optDouble("pt_y"), jSONObject2.optDouble("pt_x")));
                        arrayList.add(poiIndoorInfo);
                    }
                }
                poiIndoorResult.error = SearchResult.ERRORNO.NO_ERROR;
                poiIndoorResult.setmArrayPoiInfo(arrayList);
            }
            poiIndoorResult.f1850b = jSONObject.optInt("page_num");
            poiIndoorResult.f1849a = jSONObject.optInt("poi_num");
            return poiIndoorResult;
        } catch (JSONException e) {
            e.printStackTrace();
            poiIndoorResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiIndoorResult;
        }
    }
}
