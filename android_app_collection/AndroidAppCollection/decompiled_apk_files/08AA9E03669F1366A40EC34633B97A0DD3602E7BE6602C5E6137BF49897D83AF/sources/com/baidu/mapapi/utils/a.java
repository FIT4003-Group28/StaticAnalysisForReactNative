package com.baidu.mapapi.utils;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.baidu.mapapi.common.AppTools;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.navi.NaviParaOption;
import com.baidu.mapapi.utils.poi.DispathcPoiData;
import com.baidu.mapapi.utils.poi.PoiParaOption;
import com.baidu.mapapi.utils.route.BaiduMapRoutePlan;
import com.baidu.mapapi.utils.route.RouteParaOption;
import com.baidu.platform.comapi.location.CoordinateType;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f1948a = -1;

    /* renamed from: d  reason: collision with root package name */
    private static com.baidu.a.a.a.b f1951d = null;
    private static com.baidu.a.a.a.a e = null;
    private static int f = 0;
    private static String g = null;
    private static String h = null;
    private static String i = null;
    private static LatLng k = null;
    private static LatLng l = null;
    private static String m = null;
    private static String n = null;
    private static RouteParaOption.EBusStrategyType o = null;
    private static String p = null;
    private static String q = null;
    private static LatLng r = null;
    private static int s = 0;
    private static boolean t = false;
    private static boolean u = false;
    private static Thread v;

    /* renamed from: c  reason: collision with root package name */
    private static final String f1950c = BaiduMapRoutePlan.class.getName();
    private static List<DispathcPoiData> j = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    static ServiceConnection f1949b = new c();

    public static String a() {
        return AppTools.getBaiduMapToken();
    }

    public static void a(int i2, Context context) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
                c(context, i2);
                return;
            case 3:
                c(context);
                return;
            case 4:
                d(context);
                return;
            case 5:
                e(context);
                return;
            case 6:
                return;
            case 7:
                f(context);
                return;
            case 8:
                g(context);
                return;
            default:
                return;
        }
    }

    public static void a(Context context) {
        if (u) {
            context.unbindService(f1949b);
            u = false;
        }
    }

    private static void a(List<DispathcPoiData> list, Context context) {
        g = context.getPackageName();
        h = b(context);
        i = "";
        if (j != null) {
            j.clear();
        }
        for (DispathcPoiData dispathcPoiData : list) {
            j.add(dispathcPoiData);
        }
    }

    public static boolean a(int i2) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
                return g();
            case 3:
                return h();
            case 4:
                return m();
            case 5:
                return j();
            case 6:
                return i();
            case 7:
                return k();
            case 8:
                return l();
            default:
                return false;
        }
    }

    public static boolean a(Context context, int i2) {
        try {
            t = false;
            switch (i2) {
                case 0:
                    f1948a = 0;
                    break;
                case 1:
                    f1948a = 1;
                    break;
                case 2:
                    f1948a = 2;
                    break;
                case 3:
                    f1948a = 3;
                    break;
                case 4:
                    f1948a = 4;
                    break;
                case 5:
                    f1948a = 5;
                    break;
                case 6:
                    f1948a = 6;
                    break;
                case 7:
                    f1948a = 7;
                    break;
                case 8:
                    f1948a = 8;
                    break;
            }
            if (f1951d == null || !u) {
                b(context, i2);
                return true;
            } else if (e != null) {
                t = true;
                return a(i2);
            } else {
                f1951d.a(new b(i2));
                return true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public static boolean a(NaviParaOption naviParaOption, Context context, int i2) {
        b(naviParaOption, context, i2);
        return a(context, i2);
    }

    public static boolean a(PoiParaOption poiParaOption, Context context, int i2) {
        b(poiParaOption, context, i2);
        return a(context, i2);
    }

    public static boolean a(RouteParaOption routeParaOption, Context context, int i2) {
        b(routeParaOption, context, i2);
        return a(context, i2);
    }

    public static boolean a(List<DispathcPoiData> list, Context context, int i2) {
        a(list, context);
        return a(context, i2);
    }

    public static String b(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        try {
            packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
                return (String) packageManager.getApplicationLabel(applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }

    private static void b(Context context, int i2) {
        Intent intent = new Intent();
        String a2 = a();
        if (a2 == null) {
            return;
        }
        intent.putExtra("api_token", a2);
        intent.setAction("com.baidu.map.action.OPEN_SERVICE");
        intent.setPackage("com.baidu.BaiduMap");
        u = context.bindService(intent, f1949b, 1);
        if (!u) {
            return;
        }
        v = new Thread(new e(context, i2));
        v.setDaemon(true);
        v.start();
    }

    private static void b(NaviParaOption naviParaOption, Context context, int i2) {
        g = context.getPackageName();
        if (naviParaOption.getStartPoint() != null) {
            k = naviParaOption.getStartPoint();
        }
        if (naviParaOption.getEndPoint() != null) {
            l = naviParaOption.getEndPoint();
        }
        if (naviParaOption.getStartName() != null) {
            m = naviParaOption.getStartName();
        }
        if (naviParaOption.getEndName() != null) {
            n = naviParaOption.getEndName();
        }
    }

    private static void b(PoiParaOption poiParaOption, Context context, int i2) {
        g = context.getPackageName();
        if (poiParaOption.getUid() != null) {
            p = poiParaOption.getUid();
        }
        if (poiParaOption.getKey() != null) {
            q = poiParaOption.getKey();
        }
        if (poiParaOption.getCenter() != null) {
            r = poiParaOption.getCenter();
        }
        if (poiParaOption.getRadius() != 0) {
            s = poiParaOption.getRadius();
        }
    }

    private static void b(RouteParaOption routeParaOption, Context context, int i2) {
        int i3;
        g = context.getPackageName();
        if (routeParaOption.getStartPoint() != null) {
            k = routeParaOption.getStartPoint();
        }
        if (routeParaOption.getEndPoint() != null) {
            l = routeParaOption.getEndPoint();
        }
        if (routeParaOption.getStartName() != null) {
            m = routeParaOption.getStartName();
        }
        if (routeParaOption.getEndName() != null) {
            n = routeParaOption.getEndName();
        }
        if (routeParaOption.getBusStrategyType() != null) {
            o = routeParaOption.getBusStrategyType();
        }
        switch (i2) {
            case 0:
                i3 = 0;
                break;
            case 1:
                i3 = 1;
                break;
            case 2:
                i3 = 2;
                break;
            default:
                return;
        }
        f = i3;
    }

    private static void c(Context context) {
        v.interrupt();
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/place/detail?");
        sb.append("uid=");
        sb.append(p);
        sb.append("&show_type=");
        sb.append("detail_page");
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        context.startActivity(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (com.baidu.mapapi.utils.a.k != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
        if (com.baidu.mapapi.utils.a.l != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(android.content.Context r4, int r5) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.utils.a.c(android.content.Context, int):void");
    }

    private static void d(Context context) {
        v.interrupt();
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/nearbysearch?");
        sb.append("center=");
        sb.append(r.latitude);
        sb.append(",");
        sb.append(r.longitude);
        sb.append("&query=");
        sb.append(q);
        sb.append("&radius=");
        sb.append(s);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        context.startActivity(intent);
    }

    private static void e(Context context) {
        v.interrupt();
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/navi?");
        sb.append("origin=");
        sb.append(k.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&location=");
        sb.append(l.latitude);
        sb.append(",");
        sb.append(l.longitude);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        context.startActivity(intent);
    }

    private static void f(Context context) {
        v.interrupt();
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/walknavi?");
        sb.append("origin=");
        sb.append(k.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&destination=");
        sb.append(l.latitude);
        sb.append(",");
        sb.append(l.longitude);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        context.startActivity(intent);
    }

    private static void g(Context context) {
        v.interrupt();
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/bikenavi?");
        sb.append("origin=");
        sb.append(k.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&destination=");
        sb.append(l.latitude);
        sb.append(",");
        sb.append(l.longitude);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        context.startActivity(intent);
    }

    private static boolean g() {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            Log.d(f1950c, "callDispatchTakeOutRoute");
            String a2 = e.a("map.android.baidu.mainmap");
            if (a2 == null) {
                Log.d(f1950c, "callDispatchTakeOut com not found");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("target", "route_search_page");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("route_type", f);
            bundle2.putInt("bus_strategy", o.ordinal());
            bundle2.putInt("cross_city_bus_strategy", 5);
            if (k != null) {
                bundle2.putInt("start_type", 1);
                bundle2.putInt("start_longitude", (int) CoordUtil.ll2mc(k).getLongitudeE6());
                bundle2.putInt("start_latitude", (int) CoordUtil.ll2mc(k).getLatitudeE6());
            } else {
                bundle2.putInt("start_type", 2);
                bundle2.putInt("start_longitude", 0);
                bundle2.putInt("start_latitude", 0);
            }
            if (m != null) {
                str = "start_keyword";
                str2 = m;
            } else {
                str = "start_keyword";
                str2 = "地图上的点";
            }
            bundle2.putString(str, str2);
            bundle2.putString("start_uid", "");
            if (l != null) {
                bundle2.putInt("end_type", 1);
                bundle2.putInt("end_longitude", (int) CoordUtil.ll2mc(l).getLongitudeE6());
                bundle2.putInt("end_latitude", (int) CoordUtil.ll2mc(l).getLatitudeE6());
            } else {
                bundle2.putInt("end_type", 2);
                bundle2.putInt("end_longitude", 0);
                bundle2.putInt("end_latitude", 0);
            }
            if (n != null) {
                str3 = "end_keyword";
                str4 = n;
            } else {
                str3 = "end_keyword";
                str4 = "地图上的点";
            }
            bundle2.putString(str3, str4);
            bundle2.putString("end_uid", "");
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", a2, bundle);
        } catch (RemoteException e2) {
            Log.d(f1950c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }

    private static boolean h() {
        String str;
        String str2;
        try {
            Log.d(f1950c, "callDispatchTakeOutPoiDetials");
            String a2 = e.a("map.android.baidu.mainmap");
            if (a2 == null) {
                Log.d(f1950c, "callDispatchTakeOut com not found");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("target", "request_poi_detail_page");
            Bundle bundle2 = new Bundle();
            if (p != null) {
                str = "uid";
                str2 = p;
            } else {
                str = "uid";
                str2 = "";
            }
            bundle2.putString(str, str2);
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", a2, bundle);
        } catch (RemoteException e2) {
            Log.d(f1950c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }

    private static boolean i() {
        if (j == null || j.size() <= 0) {
            return false;
        }
        try {
            Log.d(f1950c, "callDispatchPoiToBaiduMap");
            String a2 = e.a("map.android.baidu.mainmap");
            if (a2 == null) {
                Log.d(f1950c, "callDispatchPoiToBaiduMap com not found");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("target", "favorite_page");
            Bundle bundle2 = new Bundle();
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            for (int i3 = 0; i3 < j.size(); i3++) {
                if (j.get(i3).name != null && !j.get(i3).name.equals("") && j.get(i3).pt != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", j.get(i3).name);
                        GeoPoint ll2mc = CoordUtil.ll2mc(j.get(i3).pt);
                        jSONObject.put("ptx", ll2mc.getLongitudeE6());
                        jSONObject.put("pty", ll2mc.getLatitudeE6());
                        jSONObject.put("addr", j.get(i3).addr);
                        jSONObject.put("uid", j.get(i3).uid);
                        i2++;
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (i2 == 0) {
                return false;
            }
            bundle2.putString(DataBufferSafeParcelable.DATA_FIELD, jSONArray.toString());
            bundle2.putString("from", h);
            bundle2.putString("pkg", g);
            bundle2.putString("cls", i);
            bundle2.putInt("count", i2);
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", a2, bundle);
        } catch (RemoteException e3) {
            Log.d(f1950c, "callDispatchPoiToBaiduMap exception", e3);
            return false;
        }
    }

    private static boolean j() {
        try {
            Log.d(f1950c, "callDispatchTakeOutRouteNavi");
            String a2 = e.a("map.android.baidu.mainmap");
            if (a2 == null) {
                Log.d(f1950c, "callDispatchTakeOut com not found");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("target", "navigation_page");
            Bundle bundle2 = new Bundle();
            bundle2.putString("coord_type", CoordinateType.BD09LL);
            bundle2.putString("type", "DIS");
            StringBuffer stringBuffer = new StringBuffer();
            if (m != null) {
                stringBuffer.append("name:" + m + "|");
            }
            stringBuffer.append(String.format("latlng:%f,%f", Double.valueOf(k.latitude), Double.valueOf(k.longitude)));
            StringBuffer stringBuffer2 = new StringBuffer();
            if (n != null) {
                stringBuffer2.append("name:" + n + "|");
            }
            stringBuffer2.append(String.format("latlng:%f,%f", Double.valueOf(l.latitude), Double.valueOf(l.longitude)));
            bundle2.putString("origin", stringBuffer.toString());
            bundle2.putString("destination", stringBuffer2.toString());
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", a2, bundle);
        } catch (RemoteException e2) {
            Log.d(f1950c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }

    private static boolean k() {
        try {
            Log.d(f1950c, "callDispatchTakeOutRouteNavi");
            String a2 = e.a("map.android.baidu.mainmap");
            if (a2 == null) {
                Log.d(f1950c, "callDispatchTakeOut com not found");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("target", "walknavi_page");
            Bundle bundle2 = new Bundle();
            bundle2.putString("coord_type", CoordinateType.BD09LL);
            StringBuffer stringBuffer = new StringBuffer();
            if (m != null) {
                stringBuffer.append("name:" + m + "|");
            }
            stringBuffer.append(String.format("latlng:%f,%f", Double.valueOf(k.latitude), Double.valueOf(k.longitude)));
            StringBuffer stringBuffer2 = new StringBuffer();
            if (n != null) {
                stringBuffer2.append("name:" + n + "|");
            }
            stringBuffer2.append(String.format("latlng:%f,%f", Double.valueOf(l.latitude), Double.valueOf(l.longitude)));
            bundle2.putString("origin", stringBuffer.toString());
            bundle2.putString("destination", stringBuffer2.toString());
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", a2, bundle);
        } catch (Exception e2) {
            Log.d(f1950c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }

    private static boolean l() {
        try {
            Log.d(f1950c, "callDispatchTakeOutRouteRidingNavi");
            String a2 = e.a("map.android.baidu.mainmap");
            if (a2 == null) {
                Log.d(f1950c, "callDispatchTakeOut com not found");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("target", "bikenavi_page");
            Bundle bundle2 = new Bundle();
            bundle2.putString("coord_type", CoordinateType.BD09LL);
            StringBuffer stringBuffer = new StringBuffer();
            if (m != null) {
                stringBuffer.append("name:" + m + "|");
            }
            stringBuffer.append(String.format("latlng:%f,%f", Double.valueOf(k.latitude), Double.valueOf(k.longitude)));
            StringBuffer stringBuffer2 = new StringBuffer();
            if (n != null) {
                stringBuffer2.append("name:" + n + "|");
            }
            stringBuffer2.append(String.format("latlng:%f,%f", Double.valueOf(l.latitude), Double.valueOf(l.longitude)));
            bundle2.putString("origin", stringBuffer.toString());
            bundle2.putString("destination", stringBuffer2.toString());
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", a2, bundle);
        } catch (RemoteException e2) {
            Log.d(f1950c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }

    private static boolean m() {
        String str;
        String str2;
        try {
            Log.d(f1950c, "callDispatchTakeOutPoiNearbySearch");
            String a2 = e.a("map.android.baidu.mainmap");
            if (a2 == null) {
                Log.d(f1950c, "callDispatchTakeOut com not found");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("target", "poi_search_page");
            Bundle bundle2 = new Bundle();
            if (q != null) {
                str = "search_key";
                str2 = q;
            } else {
                str = "search_key";
                str2 = "";
            }
            bundle2.putString(str, str2);
            if (r != null) {
                bundle2.putInt("center_pt_x", (int) CoordUtil.ll2mc(r).getLongitudeE6());
                bundle2.putInt("center_pt_y", (int) CoordUtil.ll2mc(r).getLatitudeE6());
            } else {
                bundle2.putString("search_key", "");
            }
            if (s != 0) {
                bundle2.putInt("search_radius", s);
            } else {
                bundle2.putInt("search_radius", NetstatsParserPatterns.NEW_TS_TO_MILLIS);
            }
            bundle2.putBoolean("is_direct_search", true);
            bundle2.putBoolean("is_direct_area_search", true);
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", a2, bundle);
        } catch (RemoteException e2) {
            Log.d(f1950c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }
}
