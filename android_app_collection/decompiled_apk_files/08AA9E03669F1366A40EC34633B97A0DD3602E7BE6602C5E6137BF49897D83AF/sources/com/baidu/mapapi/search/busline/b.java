package com.baidu.mapapi.search.busline;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.busline.BusLineResult;
import com.baidu.mapapi.search.core.SearchResult;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.ErrorBundle;
/* loaded from: classes.dex */
public class b {
    public static BusLineResult a(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        BusLineResult busLineResult = new BusLineResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("count");
            JSONArray optJSONArray = jSONObject.optJSONArray(ErrorBundle.DETAIL_ENTRY);
            if (optJSONArray != null && optInt > 0) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                try {
                    busLineResult.a(simpleDateFormat.parse(optJSONObject.optString("starttime")));
                    busLineResult.b(simpleDateFormat.parse(optJSONObject.optString("endtime")));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                busLineResult.a(optJSONObject.optString("name"));
                boolean z = true;
                if (optJSONObject.optInt("ismonticket") != 1) {
                    z = false;
                }
                busLineResult.a(z);
                busLineResult.b(optJSONObject.optString("uid"));
                busLineResult.setBasePrice(optJSONObject.optInt("ticketPrice") / 100.0f);
                busLineResult.setLineDirection(optJSONObject.optString("lineDirection"));
                busLineResult.setMaxPrice(optJSONObject.optInt("maxprice") / 100.0f);
                ArrayList arrayList = new ArrayList();
                List<List<LatLng>> decodeLocationList2D = CoordUtil.decodeLocationList2D(optJSONObject.optString("geo"));
                if (decodeLocationList2D != null) {
                    for (List<LatLng> list : decodeLocationList2D) {
                        BusLineResult.BusStep busStep = new BusLineResult.BusStep();
                        busStep.setWayPoints(list);
                        arrayList.add(busStep);
                    }
                }
                if (arrayList.size() > 0) {
                    busLineResult.b(arrayList);
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("stations");
                if (optJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i);
                        if (optJSONObject2 != null) {
                            BusLineResult.BusStation busStation = new BusLineResult.BusStation();
                            busStation.setTitle(optJSONObject2.optString("name"));
                            busStation.setLocation(CoordUtil.decodeLocation(optJSONObject2.optString("geo")));
                            busStation.setUid(optJSONObject2.optString("uid"));
                            arrayList2.add(busStation);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        busLineResult.a(arrayList2);
                    }
                }
                return busLineResult;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        busLineResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return busLineResult;
    }
}
