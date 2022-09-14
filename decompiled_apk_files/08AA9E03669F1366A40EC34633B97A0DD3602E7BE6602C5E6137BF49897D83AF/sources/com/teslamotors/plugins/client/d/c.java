package com.teslamotors.plugins.client.d;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
import com.baidu.mapapi.utils.CoordinateConverter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: LocationServicesHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f5334b = "c";

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f5335c = Pattern.compile("(市|区|县|省|市|区|自治州|自治区|自治州|市|区|盟)");

    /* renamed from: d  reason: collision with root package name */
    private static c f5336d;

    /* renamed from: a  reason: collision with root package name */
    private final Geocoder f5337a;

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (f5336d == null) {
                f5336d = new c(context);
            }
            cVar = f5336d;
        }
        return cVar;
    }

    private c(Context context) {
        this.f5337a = new Geocoder(context);
    }

    public void a(double d2, double d3, final com.teslamotors.plugins.client.a.d dVar) {
        GeoCoder newInstance = GeoCoder.newInstance();
        newInstance.setOnGetGeoCodeResultListener(new OnGetGeoCoderResultListener() { // from class: com.teslamotors.plugins.client.d.c.1
            @Override // com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener
            public void onGetGeoCodeResult(GeoCodeResult geoCodeResult) {
            }

            @Override // com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener
            public void onGetReverseGeoCodeResult(ReverseGeoCodeResult reverseGeoCodeResult) {
                HashMap hashMap = new HashMap();
                if (reverseGeoCodeResult == null) {
                    dVar.a(hashMap);
                    return;
                }
                ReverseGeoCodeResult.AddressComponent addressDetail = reverseGeoCodeResult.getAddressDetail();
                if (addressDetail != null) {
                    hashMap.put("street_prefix", addressDetail.streetNumber);
                    hashMap.put("street_name", addressDetail.street);
                    hashMap.put("city_name", addressDetail.city);
                    hashMap.put("region_name", addressDetail.province);
                }
                dVar.a(hashMap);
            }
        });
        ReverseGeoCodeOption reverseGeoCodeOption = new ReverseGeoCodeOption();
        reverseGeoCodeOption.location(a(Float.valueOf((float) d2), Float.valueOf((float) d3)));
        newInstance.reverseGeoCode(reverseGeoCodeOption);
    }

    public void b(double d2, double d3, com.teslamotors.plugins.client.a.d dVar) {
        List<Address> list;
        HashMap hashMap = new HashMap();
        if (!Geocoder.isPresent()) {
            dVar.a();
            return;
        }
        try {
            list = this.f5337a.getFromLocation(d2, d3, 1);
        } catch (IOException e) {
            Log.e(f5334b, "Failed to get address from location", e);
            list = null;
        }
        if (list == null) {
            dVar.a();
        } else if (list.size() == 0 || list.get(0).getMaxAddressLineIndex() < 0) {
            dVar.a(hashMap);
        } else {
            Address address = list.get(0);
            hashMap.put("street_prefix", address.getSubThoroughfare());
            hashMap.put("street_name", address.getThoroughfare());
            hashMap.put("city_name", address.getLocality());
            hashMap.put("region_name", address.getAdminArea());
            hashMap.put("country_name", address.getCountryName());
            dVar.a(hashMap);
        }
    }

    private LatLng a(Float f, Float f2) {
        CoordinateConverter coordinateConverter = new CoordinateConverter();
        if (f != null && f2 != null) {
            coordinateConverter.coord(new LatLng(f.floatValue(), f2.floatValue()));
        }
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
        return coordinateConverter.convert();
    }
}
