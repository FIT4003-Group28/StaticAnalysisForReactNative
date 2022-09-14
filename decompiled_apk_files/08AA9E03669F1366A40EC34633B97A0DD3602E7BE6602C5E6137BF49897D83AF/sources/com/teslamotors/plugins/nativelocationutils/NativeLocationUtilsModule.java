package com.teslamotors.plugins.nativelocationutils;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.navi.BaiduMapNavigation;
import com.baidu.mapapi.navi.NaviParaOption;
import com.baidu.mapapi.utils.CoordinateConverter;
import com.baidu.mapapi.utils.DistanceUtil;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
import com.teslamotors.plugins.client.a.d;
import com.teslamotors.plugins.client.d.c;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class NativeLocationUtilsModule extends ReactContextBaseJavaModule {
    private static final String COUNTRY_NAME = "country_name";
    private static final String DIRECTIONS_NO_ERROR = "DIRECTIONS_ERROR_NO_ERROR";
    private static final String DIRECTIONS_UNABLE_TO_LAUNCH = "DIRECTIONS_ERROR_UNABLE_TO_LAUNCH";
    private static final String GEOCODING_INVALID_COORDINATES = "GEOCODING_ERROR_INVALID_COORDINATES";
    private static final String GEOCODING_NO_ERROR = "GEOCODING_ERROR_NO_ERROR";
    private static final String LATITUDE = "latitude";
    private static final String LINE_1 = "line_1";
    private static final String LINE_2 = "line_2";
    private static final String LONGITUDE = "longitude";
    private static final String NO_PLACEMARKS_RETURNED = "GEOCODING_ERROR_NO_PLACEMARKS_RETURNED";
    private static final String REACT_CLASS = "TMNativeLocationUtils";
    private static final String REGION_NAME = "region_name";
    private static final String RESULT = "result";
    private static final String STREET_NAME = "street_name";
    private static final String STREET_PREFIX = "street_prefix";
    private static final String TAG = "NativeLocationUtilsModule";
    private static final String UNABLE_TO_REVERSE_GEOCODE = "GEOCODING_ERROR_UNABLE_TO_REVERSE_GEOCODE";
    private final c mGeocodingHelper;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public NativeLocationUtilsModule(ah ahVar) {
        super(ahVar);
        this.mGeocodingHelper = c.a(ahVar);
    }

    @al
    public void reverseGeocodeValueForCoordinate(double d2, double d3, boolean z, final af afVar) {
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (Math.abs(d2) > 90.0d || Math.abs(d3) > 180.0d) {
            writableNativeMap.putString("result", GEOCODING_INVALID_COORDINATES);
            afVar.a(writableNativeMap);
            return;
        }
        d dVar = new d() { // from class: com.teslamotors.plugins.nativelocationutils.NativeLocationUtilsModule.1
            @Override // com.teslamotors.plugins.client.a.d
            public void a(Map<String, String> map) {
                if (map.containsKey(NativeLocationUtilsModule.LINE_1) || map.containsKey(NativeLocationUtilsModule.STREET_NAME)) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        writableNativeMap.putString(entry.getKey(), entry.getValue());
                    }
                    writableNativeMap.putString("result", NativeLocationUtilsModule.GEOCODING_NO_ERROR);
                } else {
                    writableNativeMap.putString("result", NativeLocationUtilsModule.NO_PLACEMARKS_RETURNED);
                }
                afVar.a(writableNativeMap);
            }

            @Override // com.teslamotors.plugins.client.a.d
            public void a() {
                writableNativeMap.putString("result", NativeLocationUtilsModule.UNABLE_TO_REVERSE_GEOCODE);
                afVar.a(writableNativeMap);
            }
        };
        if (z) {
            this.mGeocodingHelper.a(d2, d3, dVar);
        } else {
            this.mGeocodingHelper.b(d2, d3, dVar);
        }
    }

    @al
    public void openMapsWithDirections(an anVar, an anVar2, boolean z, String str, af afVar) {
        if (z) {
            openBaiduMapsDirections(anVar, anVar2, str, afVar);
        } else {
            openGoogleMapsDirections(anVar, anVar2, str, afVar);
        }
    }

    private void openBaiduMapsDirections(an anVar, an anVar2, String str, af afVar) {
        double d2 = anVar.getDouble(LATITUDE);
        double d3 = anVar.getDouble(LONGITUDE);
        double d4 = anVar2.getDouble(LATITUDE);
        double d5 = anVar2.getDouble(LONGITUDE);
        LatLng convertToGCJ02 = convertToGCJ02(d2, d3);
        LatLng convertToGCJ022 = convertToGCJ02(d4, d5);
        String string = anVar.getString("name");
        String string2 = anVar2.getString("name");
        NaviParaOption naviParaOption = new NaviParaOption();
        naviParaOption.startPoint(convertToGCJ02);
        naviParaOption.startName(string);
        naviParaOption.endPoint(convertToGCJ022);
        naviParaOption.endName(string2);
        Double valueOf = Double.valueOf(DistanceUtil.getDistance(convertToGCJ02, convertToGCJ022));
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            try {
                if (valueOf.doubleValue() > 1000.0d) {
                    BaiduMapNavigation.openBaiduMapNavi(naviParaOption, getCurrentActivity());
                } else {
                    BaiduMapNavigation.openBaiduMapWalkNavi(naviParaOption, getCurrentActivity());
                }
                writableNativeMap.putString("result", DIRECTIONS_NO_ERROR);
            } catch (Exception unused) {
                BaiduMapNavigation.openBaiduMapNavi(naviParaOption, getCurrentActivity());
                writableNativeMap.putString("result", DIRECTIONS_UNABLE_TO_LAUNCH);
            }
        } finally {
            afVar.a(writableNativeMap);
        }
    }

    private void openGoogleMapsDirections(an anVar, an anVar2, String str, af afVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.ENGLISH, "https://maps.google.com/maps?daddr=%s@%f,%f", URLEncoder.encode(anVar2.getString("name"), StandardCharsets.UTF_8.name()), Double.valueOf(anVar2.getDouble(LATITUDE)), Double.valueOf(anVar2.getDouble(LONGITUDE)))));
                intent.setPackage("com.google.android.apps.maps");
                getCurrentActivity().startActivity(intent);
                writableNativeMap.putString("result", DIRECTIONS_NO_ERROR);
            } catch (Exception e) {
                Log.e(TAG, "Failed to launch directions", e);
                writableNativeMap.putString("result", DIRECTIONS_UNABLE_TO_LAUNCH);
            }
        } finally {
            afVar.a(writableNativeMap);
        }
    }

    private static LatLng convertToGCJ02(double d2, double d3) {
        CoordinateConverter coordinateConverter = new CoordinateConverter();
        coordinateConverter.coord(new LatLng(d2, d3));
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
        return coordinateConverter.convert();
    }
}
