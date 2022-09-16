package com.baidu.mapapi.search.route;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.core.VehicleInfo;
import com.baidu.mapapi.search.route.BikingRouteLine;
import com.baidu.mapapi.search.route.DrivingRouteLine;
import com.baidu.mapapi.search.route.TransitRouteLine;
import com.baidu.mapapi.search.route.WalkingRouteLine;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h {
    private static SuggestAddrInfo a(JSONObject jSONObject) {
        SuggestAddrInfo suggestAddrInfo = new SuggestAddrInfo();
        JSONObject optJSONObject = jSONObject.optJSONObject("start_sug");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("end_sug");
        if (optJSONObject != null) {
            int optInt = optJSONObject.optInt("listType");
            String optString = optJSONObject.optString("cityName");
            if (optInt == 1) {
                suggestAddrInfo.d(b(optJSONObject, "list"));
            } else if (optInt == 0) {
                suggestAddrInfo.a(b(optJSONObject, "list", optString));
            }
        }
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("listType");
            String optString2 = optJSONObject2.optString("cityName");
            if (optInt2 == 1) {
                suggestAddrInfo.e(b(optJSONObject2, "list"));
                return suggestAddrInfo;
            } else if (optInt2 == 0) {
                suggestAddrInfo.b(b(optJSONObject2, "list", optString2));
            }
        }
        return suggestAddrInfo;
    }

    public static TransitRouteResult a(String str) {
        TransitRouteResult transitRouteResult = new TransitRouteResult();
        if (str == null || str.length() <= 0) {
            transitRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return transitRouteResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("taxi") != null) {
                transitRouteResult.a(f(jSONObject.optString("taxi")));
            }
            RouteNode c2 = c(jSONObject, "start_point");
            RouteNode c3 = c(jSONObject, "end_point");
            JSONArray optJSONArray = jSONObject.optJSONArray("routes");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                transitRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return transitRouteResult;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = ((JSONObject) optJSONArray.opt(i)).optJSONObject("legs");
                if (optJSONObject != null) {
                    TransitRouteLine transitRouteLine = new TransitRouteLine();
                    transitRouteLine.setDistance(optJSONObject.optInt("distance"));
                    transitRouteLine.setDuration(optJSONObject.optInt("time"));
                    transitRouteLine.setStarting(c2);
                    transitRouteLine.setTerminal(c3);
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("steps");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            JSONArray optJSONArray3 = optJSONArray2.optJSONObject(i2).optJSONArray("busline");
                            if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                                JSONObject optJSONObject2 = optJSONArray3.optJSONObject(0);
                                TransitRouteLine.TransitStep transitStep = new TransitRouteLine.TransitStep();
                                transitStep.a(RouteNode.location(CoordUtil.decodeLocation(optJSONObject2.optString("start_location"))));
                                transitStep.b(RouteNode.location(CoordUtil.decodeLocation(optJSONObject2.optString("end_location"))));
                                optJSONObject2.optInt("type");
                                transitStep.a(TransitRouteLine.TransitStep.TransitRouteStepType.WAKLING);
                                transitStep.a(i(optJSONObject2.optString("instructions")));
                                transitStep.setDistance(optJSONObject2.optInt("distance"));
                                transitStep.setDuration(optJSONObject2.optInt("duration"));
                                transitStep.b(optJSONObject2.optString("path_geo"));
                                if (optJSONObject2.has("vehicle")) {
                                    transitStep.a(g(optJSONObject2.optString("vehicle")));
                                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("vehicle");
                                    transitStep.getEntrance().setUid(optJSONObject3.optString("start_uid"));
                                    transitStep.getEntrance().setTitle(optJSONObject3.optString("start_name"));
                                    transitStep.getExit().setUid(optJSONObject3.optString("end_uid"));
                                    transitStep.getExit().setTitle(optJSONObject3.optString("end_name"));
                                    Integer valueOf = Integer.valueOf(optJSONObject3.optInt("type"));
                                    transitStep.a((valueOf == null || valueOf.intValue() != 1) ? TransitRouteLine.TransitStep.TransitRouteStepType.BUSLINE : TransitRouteLine.TransitStep.TransitRouteStepType.SUBWAY);
                                }
                                arrayList2.add(transitStep);
                            }
                        }
                        transitRouteLine.setSteps(arrayList2);
                        arrayList.add(transitRouteLine);
                    }
                }
            }
            transitRouteResult.a(arrayList);
            return transitRouteResult;
        } catch (JSONException e) {
            transitRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            e.printStackTrace();
            return transitRouteResult;
        }
    }

    public static List<CityInfo> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        if (jSONObject == null || str == null || str.equals("") || (optJSONArray = jSONObject.optJSONArray(str)) == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i);
            if (jSONObject2 != null) {
                CityInfo cityInfo = new CityInfo();
                cityInfo.num = jSONObject2.optInt("num");
                cityInfo.city = jSONObject2.optString("name");
                arrayList.add(cityInfo);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    private static List<PoiInfo> a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && str != null && !"".equals(str) && (optJSONArray = jSONObject.optJSONArray(str)) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i);
                if (jSONObject2 != null) {
                    PoiInfo poiInfo = new PoiInfo();
                    PlanNode.withCityNameAndPlaceName(str2, jSONObject2.optString("name"));
                    poiInfo.address = jSONObject2.optString("addr");
                    poiInfo.uid = jSONObject2.optString("uid");
                    poiInfo.name = jSONObject2.optString("name");
                    poiInfo.location = CoordUtil.decodeLocation(jSONObject2.optString("geo"));
                    poiInfo.city = str2;
                    arrayList.add(poiInfo);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return null;
    }

    public static DrivingRouteResult b(String str) {
        DrivingRouteResult drivingRouteResult;
        JSONObject jSONObject;
        JSONArray jSONArray;
        DrivingRouteResult drivingRouteResult2;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        DrivingRouteResult drivingRouteResult3 = new DrivingRouteResult();
        if (str == null || "".equals(str)) {
            drivingRouteResult3.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return drivingRouteResult3;
        }
        try {
            JSONObject jSONObject3 = new JSONObject(str);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject3.optJSONArray("routes");
            if (optJSONArray == null) {
                return drivingRouteResult3;
            }
            int i = 0;
            while (i < optJSONArray.length()) {
                DrivingRouteLine drivingRouteLine = new DrivingRouteLine();
                drivingRouteLine.setStarting(e(jSONObject3, "start_point"));
                drivingRouteLine.setTerminal(e(jSONObject3, "end_point"));
                drivingRouteLine.a(f(jSONObject3, "waypoints"));
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    drivingRouteResult = drivingRouteResult3;
                    jSONObject = jSONObject3;
                    jSONArray = optJSONArray;
                } else {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("legs");
                    if (optJSONObject2 == null) {
                        return drivingRouteResult3;
                    }
                    drivingRouteLine.setDistance(optJSONObject2.optInt("distance"));
                    drivingRouteLine.setDuration(optJSONObject2.optInt("duration"));
                    drivingRouteLine.setCongestionDistance(optJSONObject2.optInt("congestion_length"));
                    drivingRouteLine.setLightNum(optJSONObject2.optInt("light_num"));
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("steps");
                    if (optJSONArray2 == null) {
                        return drivingRouteResult3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    while (i2 < optJSONArray2.length()) {
                        DrivingRouteLine.DrivingStep drivingStep = new DrivingRouteLine.DrivingStep();
                        JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                        if (optJSONObject3 == null) {
                            drivingRouteResult2 = drivingRouteResult3;
                            jSONObject2 = jSONObject3;
                            jSONArray2 = optJSONArray;
                        } else {
                            JSONArray optJSONArray3 = optJSONObject3.optJSONArray("paths");
                            if (optJSONArray3 == null) {
                                return drivingRouteResult3;
                            }
                            if (optJSONArray3.length() >= 2) {
                                ArrayList arrayList3 = new ArrayList();
                                int i3 = 0;
                                while (i3 < optJSONArray3.length()) {
                                    JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i3);
                                    JSONArray jSONArray3 = optJSONArray;
                                    DrivingRouteResult drivingRouteResult4 = drivingRouteResult3;
                                    JSONObject jSONObject4 = jSONObject3;
                                    GeoPoint geoPoint = new GeoPoint(0.0d, 0.0d);
                                    geoPoint.setLongitudeE6(optJSONObject4.optInt("loc_x"));
                                    geoPoint.setLatitudeE6(optJSONObject4.optInt("loc_y"));
                                    if (i3 == 0) {
                                        drivingStep.a(RouteNode.location(CoordUtil.mc2ll(geoPoint)));
                                    } else if (i3 == optJSONArray3.length() - 1) {
                                        drivingStep.b(RouteNode.location(CoordUtil.mc2ll(geoPoint)));
                                    }
                                    arrayList3.add(CoordUtil.mc2ll(geoPoint));
                                    i3++;
                                    optJSONArray = jSONArray3;
                                    drivingRouteResult3 = drivingRouteResult4;
                                    jSONObject3 = jSONObject4;
                                }
                                drivingRouteResult2 = drivingRouteResult3;
                                jSONObject2 = jSONObject3;
                                jSONArray2 = optJSONArray;
                                drivingStep.a(arrayList3);
                            } else {
                                drivingRouteResult2 = drivingRouteResult3;
                                jSONObject2 = jSONObject3;
                                jSONArray2 = optJSONArray;
                            }
                            JSONArray optJSONArray4 = optJSONObject3.optJSONArray("traffics");
                            if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                                int length = optJSONArray4.length();
                                int[] iArr = new int[length];
                                for (int i4 = 0; i4 < length; i4++) {
                                    iArr[i4] = Integer.parseInt((String) optJSONArray4.opt(i4));
                                }
                                drivingStep.a(iArr);
                            }
                            drivingStep.a(optJSONObject3.optInt("direction") * 30);
                            drivingStep.setDistance(optJSONObject3.optInt("distance"));
                            drivingStep.setDuration(optJSONObject3.optInt("duration"));
                            drivingStep.c(optJSONObject3.optString("description"));
                            drivingStep.a(optJSONObject3.optString("start_desc"));
                            drivingStep.b(optJSONObject3.optString("end_desc"));
                            drivingStep.b(optJSONObject3.optInt("turn"));
                            arrayList2.add(drivingStep);
                        }
                        i2++;
                        optJSONArray = jSONArray2;
                        drivingRouteResult3 = drivingRouteResult2;
                        jSONObject3 = jSONObject2;
                    }
                    drivingRouteResult = drivingRouteResult3;
                    jSONObject = jSONObject3;
                    jSONArray = optJSONArray;
                    drivingRouteLine.setSteps(arrayList2);
                    arrayList.add(drivingRouteLine);
                }
                i++;
                optJSONArray = jSONArray;
                drivingRouteResult3 = drivingRouteResult;
                jSONObject3 = jSONObject;
            }
            drivingRouteResult3.a(arrayList);
            drivingRouteResult3.setTaxiInfos(e(jSONObject3.optString("taxis")));
            return drivingRouteResult3;
        } catch (JSONException e) {
            e.printStackTrace();
            drivingRouteResult3.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return drivingRouteResult3;
        }
    }

    public static List<CityInfo> b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        if (jSONObject == null || str == null || str.equals("") || (optJSONArray = jSONObject.optJSONArray(str)) == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i);
            if (jSONObject2 != null) {
                CityInfo cityInfo = new CityInfo();
                cityInfo.num = jSONObject2.optInt("number");
                cityInfo.city = jSONObject2.optString("name");
                arrayList.add(cityInfo);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    private static List<PoiInfo> b(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && str != null && !"".equals(str) && (optJSONArray = jSONObject.optJSONArray(str)) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i);
                if (jSONObject2 != null) {
                    PoiInfo poiInfo = new PoiInfo();
                    if (jSONObject2.has("address")) {
                        poiInfo.address = jSONObject2.optString("address");
                    }
                    poiInfo.uid = jSONObject2.optString("uid");
                    poiInfo.name = jSONObject2.optString("name");
                    poiInfo.location = new LatLng(jSONObject2.optDouble("lat"), jSONObject2.optDouble("lng"));
                    poiInfo.city = str2;
                    arrayList.add(poiInfo);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return null;
    }

    private static RouteNode c(JSONObject jSONObject, String str) {
        if (jSONObject == null || str == null || "".equals(str)) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(optJSONObject.optString("name"));
        routeNode.setUid(optJSONObject.optString("uid"));
        routeNode.setLocation(CoordUtil.decodeLocation(optJSONObject.optString("geo")));
        return routeNode;
    }

    public static WalkingRouteResult c(String str) {
        JSONObject optJSONObject;
        WalkingRouteResult walkingRouteResult = new WalkingRouteResult();
        if (str == null || "".equals(str)) {
            walkingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return walkingRouteResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("taxi")) {
                walkingRouteResult.a(f(jSONObject.optString("taxi")));
            }
            WalkingRouteLine walkingRouteLine = new WalkingRouteLine();
            walkingRouteLine.setStarting(c(jSONObject, "start_point"));
            walkingRouteLine.setTerminal(c(jSONObject, "end_point"));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("routes");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("legs")) == null) {
                return walkingRouteResult;
            }
            walkingRouteLine.setDistance(optJSONObject.optInt("distance"));
            walkingRouteLine.setDuration(optJSONObject.optInt("duration"));
            JSONArray optJSONArray = optJSONObject.optJSONArray("steps");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    WalkingRouteLine.WalkingStep walkingStep = new WalkingRouteLine.WalkingStep();
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                    if (optJSONObject3 != null) {
                        walkingStep.a(optJSONObject3.optInt("direction") * 30);
                        walkingStep.setDistance(optJSONObject3.optInt("distance"));
                        walkingStep.setDuration(optJSONObject3.optInt("duration"));
                        walkingStep.a(RouteNode.location(CoordUtil.decodeLocation(optJSONObject3.optString("start_loc"))));
                        walkingStep.b(RouteNode.location(CoordUtil.decodeLocation(optJSONObject3.optString("end_loc"))));
                        walkingStep.d(optJSONObject3.optString("description"));
                        walkingStep.b(optJSONObject3.optString("start_desc"));
                        walkingStep.c(optJSONObject3.optString("end_desc"));
                        walkingStep.a(optJSONObject3.optString("path"));
                        arrayList.add(walkingStep);
                    }
                }
                if (arrayList.size() > 0) {
                    walkingRouteLine.setSteps(arrayList);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(walkingRouteLine);
            walkingRouteResult.a(arrayList2);
            return walkingRouteResult;
        } catch (JSONException e) {
            e.printStackTrace();
            walkingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return walkingRouteResult;
        }
    }

    private static RouteNode d(JSONObject jSONObject, String str) {
        if (jSONObject == null || str == null || "".equals(str)) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(optJSONObject.optString("name"));
        routeNode.setUid(optJSONObject.optString("uid"));
        routeNode.setLocation(new LatLng(optJSONObject.optDouble("lat"), optJSONObject.optDouble("lng")));
        return routeNode;
    }

    public static BikingRouteResult d(String str) {
        JSONArray jSONArray;
        BikingRouteResult bikingRouteResult;
        int i;
        JSONObject optJSONObject;
        BikingRouteResult bikingRouteResult2 = new BikingRouteResult();
        if (str == null || "".equals(str)) {
            bikingRouteResult2.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return bikingRouteResult2;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            if (optInt == 1) {
                bikingRouteResult2.a(a(jSONObject));
                bikingRouteResult2.error = SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                return bikingRouteResult2;
            } else if (optInt != 2) {
                bikingRouteResult2.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return bikingRouteResult2;
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("routes");
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < optJSONArray.length()) {
                    BikingRouteLine bikingRouteLine = new BikingRouteLine();
                    try {
                        optJSONObject = optJSONArray.optJSONObject(i2);
                        bikingRouteLine.setStarting(d(jSONObject, "start"));
                        bikingRouteLine.setTerminal(d(jSONObject, "end"));
                    } catch (Exception unused) {
                        jSONArray = optJSONArray;
                        bikingRouteResult = bikingRouteResult2;
                    }
                    if (optJSONObject == null) {
                        return bikingRouteResult2;
                    }
                    bikingRouteLine.setDistance(optJSONObject.optInt("distance"));
                    bikingRouteLine.setDuration(optJSONObject.optInt("duration"));
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("steps");
                    if (optJSONArray2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = 0;
                        while (i3 < optJSONArray2.length()) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                            BikingRouteLine.BikingStep bikingStep = new BikingRouteLine.BikingStep();
                            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                                bikingStep.a(optJSONObject2.optInt("direction") * 30);
                                bikingStep.setDistance(optJSONObject2.optInt("distance"));
                                bikingStep.setDuration(optJSONObject2.optInt("duration"));
                                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("start_pt");
                                JSONObject optJSONObject4 = optJSONObject2.optJSONObject("end_pt");
                                jSONArray = optJSONArray;
                                bikingRouteResult = bikingRouteResult2;
                                try {
                                    i = i2;
                                    try {
                                        bikingStep.a(RouteNode.location(new LatLng(optJSONObject3.optDouble("lat"), optJSONObject3.optDouble("lng"))));
                                        bikingStep.b(RouteNode.location(new LatLng(optJSONObject4.optDouble("lat"), optJSONObject4.optDouble("lng"))));
                                        bikingStep.d(optJSONObject2.optString("instructions"));
                                        bikingStep.b(optJSONObject2.optString("start_instructions"));
                                        bikingStep.c(optJSONObject2.optString("end_instructions"));
                                        bikingStep.a(optJSONObject2.optString("path"));
                                        arrayList2.add(bikingStep);
                                        continue;
                                        i3++;
                                        bikingRouteResult2 = bikingRouteResult;
                                        optJSONArray = jSONArray;
                                        i2 = i;
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    i = i2;
                                    i2 = i + 1;
                                    bikingRouteResult2 = bikingRouteResult;
                                    optJSONArray = jSONArray;
                                }
                            }
                            jSONArray = optJSONArray;
                            bikingRouteResult = bikingRouteResult2;
                            i = i2;
                            i3++;
                            bikingRouteResult2 = bikingRouteResult;
                            optJSONArray = jSONArray;
                            i2 = i;
                        }
                        jSONArray = optJSONArray;
                        bikingRouteResult = bikingRouteResult2;
                        i = i2;
                        if (arrayList2.size() > 0) {
                            bikingRouteLine.setSteps(arrayList2);
                        }
                    } else {
                        jSONArray = optJSONArray;
                        bikingRouteResult = bikingRouteResult2;
                        i = i2;
                    }
                    arrayList.add(bikingRouteLine);
                    i2 = i + 1;
                    bikingRouteResult2 = bikingRouteResult;
                    optJSONArray = jSONArray;
                }
                BikingRouteResult bikingRouteResult3 = bikingRouteResult2;
                bikingRouteResult3.a(arrayList);
                return bikingRouteResult3;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            bikingRouteResult2.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return bikingRouteResult2;
        }
    }

    private static RouteNode e(JSONObject jSONObject, String str) {
        if (jSONObject == null || str == null || "".equals(str)) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(optJSONObject.optString("name"));
        GeoPoint geoPoint = new GeoPoint(0.0d, 0.0d);
        geoPoint.setLongitudeE6(optJSONObject.optInt("loc_x"));
        geoPoint.setLatitudeE6(optJSONObject.optInt("loc_y"));
        routeNode.setLocation(CoordUtil.mc2ll(geoPoint));
        return routeNode;
    }

    public static List<TaxiInfo> e(String str) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (jSONArray == null) {
            return null;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                TaxiInfo taxiInfo = new TaxiInfo();
                String optString = jSONObject.optString("total_price");
                if (optString != null && !optString.equals("")) {
                    taxiInfo.setTotalPrice(Float.parseFloat(optString));
                    arrayList.add(taxiInfo);
                }
                taxiInfo.setTotalPrice(BitmapDescriptorFactory.HUE_RED);
                arrayList.add(taxiInfo);
            }
        }
        return arrayList;
    }

    public static TaxiInfo f(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        TaxiInfo taxiInfo = new TaxiInfo();
        taxiInfo.setDesc(jSONObject.optString("remark"));
        taxiInfo.setDistance(jSONObject.optInt("distance"));
        taxiInfo.setDuration(jSONObject.optInt("duration"));
        String optString = jSONObject.optString("total_price");
        String optString2 = jSONObject.optString("start_price");
        String optString3 = jSONObject.optString("km_price");
        if (optString == null || optString.equals("")) {
            taxiInfo.setTotalPrice(BitmapDescriptorFactory.HUE_RED);
        } else {
            taxiInfo.setTotalPrice(Float.parseFloat(optString));
        }
        if (optString == null || optString2.equals("")) {
            taxiInfo.setStartPrice(BitmapDescriptorFactory.HUE_RED);
        } else {
            taxiInfo.setStartPrice(Float.parseFloat(optString2));
        }
        if (optString3 == null || optString3.equals("")) {
            taxiInfo.setPerKMPrice(BitmapDescriptorFactory.HUE_RED);
            return taxiInfo;
        }
        taxiInfo.setPerKMPrice(Float.parseFloat(optString3));
        return taxiInfo;
    }

    private static List<RouteNode> f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            RouteNode routeNode = new RouteNode();
            try {
                routeNode.setTitle(optJSONArray.getJSONObject(i).optString("name"));
                routeNode.setUid(optJSONArray.getJSONObject(i).optString("uid"));
                GeoPoint geoPoint = new GeoPoint(0.0d, 0.0d);
                geoPoint.setLongitudeE6(optJSONArray.getJSONObject(i).optInt("loc_x"));
                geoPoint.setLatitudeE6(optJSONArray.getJSONObject(i).optInt("loc_y"));
                routeNode.setLocation(CoordUtil.mc2ll(geoPoint));
                arrayList.add(routeNode);
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static VehicleInfo g(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        VehicleInfo vehicleInfo = new VehicleInfo();
        vehicleInfo.setZonePrice(jSONObject.optInt("zone_price"));
        vehicleInfo.setTotalPrice(jSONObject.optInt("total_price"));
        vehicleInfo.setTitle(jSONObject.optString("name"));
        vehicleInfo.setPassStationNum(jSONObject.optInt("stop_num"));
        vehicleInfo.setUid(jSONObject.optString("uid"));
        return vehicleInfo;
    }

    public static SuggestAddrInfo h(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("address_info");
            if (optJSONObject == null) {
                return null;
            }
            SuggestAddrInfo suggestAddrInfo = new SuggestAddrInfo();
            String optString = optJSONObject.optString("st_cityname");
            String optString2 = optJSONObject.optString("en_cityname");
            if (jSONObject.optBoolean("hasAddrList")) {
                suggestAddrInfo.d(a(jSONObject, "startcitys"));
                suggestAddrInfo.a(a(jSONObject, "startpoints", optString));
                suggestAddrInfo.e(a(jSONObject, "endcitys"));
                suggestAddrInfo.b(a(jSONObject, "endpoints", optString2));
                JSONArray optJSONArray = jSONObject.optJSONArray("waypoints_result");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    return suggestAddrInfo;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    List<CityInfo> a2 = a(jSONObject2, "waypointcitys");
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                    List<PoiInfo> a3 = a(jSONObject2, "waypoints", "");
                    if (a3 != null) {
                        arrayList2.add(a3);
                    }
                }
                if (arrayList.size() > 0) {
                    suggestAddrInfo.f(arrayList);
                }
                if (arrayList2.size() > 0) {
                    suggestAddrInfo.c(arrayList2);
                    return suggestAddrInfo;
                }
            }
            return suggestAddrInfo;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '<') {
                z = true;
            } else if (charArray[i] == '>') {
                z = false;
            } else if (!z) {
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }
}
