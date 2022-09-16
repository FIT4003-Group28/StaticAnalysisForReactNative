package com.baidu.mapapi.utils.route;

import android.content.Context;
import android.util.Log;
import com.baidu.mapapi.navi.IllegalNaviArgumentException;
import com.baidu.mapapi.utils.OpenClientUtil;
import com.baidu.mapapi.utils.a;
import com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException;
import com.baidu.mapapi.utils.route.RouteParaOption;
/* loaded from: classes.dex */
public class BaiduMapRoutePlan {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1964a = true;

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.baidu.mapapi.utils.route.RouteParaOption r3, android.content.Context r4, int r5) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.utils.route.BaiduMapRoutePlan.a(com.baidu.mapapi.utils.route.RouteParaOption, android.content.Context, int):void");
    }

    public static void finish(Context context) {
        if (context != null) {
            a.a(context);
        }
    }

    public static boolean openBaiduMapDrivingRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (routeParaOption.f1966b == null && routeParaOption.f1965a == null && routeParaOption.f1968d == null && routeParaOption.f1967c == null) {
            throw new IllegalNaviArgumentException("startPoint and endPoint and endName and startName not all null.");
        }
        if (routeParaOption.f1967c == null && routeParaOption.f1965a == null) {
            throw new IllegalNaviArgumentException("startPoint and startName not all null.");
        }
        if (routeParaOption.f1968d == null && routeParaOption.f1966b == null) {
            throw new IllegalNaviArgumentException("endPoint and endName not all null.");
        }
        if (((routeParaOption.f1967c == null || routeParaOption.f1967c.equals("")) && routeParaOption.f1965a == null) || ((routeParaOption.f1968d == null || routeParaOption.f1968d.equals("")) && routeParaOption.f1966b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f == null) {
            routeParaOption.f = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f1964a) {
                throw new IllegalPoiSearchArgumentException("BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 0);
            return true;
        } else if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 0);
        } else {
            Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
            if (!f1964a) {
                throw new IllegalPoiSearchArgumentException("Baidumap app version is too lowl.Version is greater than 8.1");
            }
            a(routeParaOption, context, 0);
            return true;
        }
    }

    public static boolean openBaiduMapTransitRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (routeParaOption.f1966b == null && routeParaOption.f1965a == null && routeParaOption.f1968d == null && routeParaOption.f1967c == null) {
            throw new IllegalNaviArgumentException("startPoint and endPoint and endName and startName not all null.");
        }
        if (routeParaOption.f1967c == null && routeParaOption.f1965a == null) {
            throw new IllegalNaviArgumentException("startPoint and startName not all null.");
        }
        if (routeParaOption.f1968d == null && routeParaOption.f1966b == null) {
            throw new IllegalNaviArgumentException("endPoint and endName not all null.");
        }
        if (((routeParaOption.f1967c == null || routeParaOption.f1967c.equals("")) && routeParaOption.f1965a == null) || ((routeParaOption.f1968d == null || routeParaOption.f1968d.equals("")) && routeParaOption.f1966b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f == null) {
            routeParaOption.f = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f1964a) {
                throw new IllegalPoiSearchArgumentException("BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 1);
            return true;
        } else if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 1);
        } else {
            Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
            if (!f1964a) {
                throw new IllegalPoiSearchArgumentException("Baidumap app version is too lowl.Version is greater than 8.1");
            }
            a(routeParaOption, context, 1);
            return true;
        }
    }

    public static boolean openBaiduMapWalkingRoute(RouteParaOption routeParaOption, Context context) {
        if (routeParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (routeParaOption.f1966b == null && routeParaOption.f1965a == null && routeParaOption.f1968d == null && routeParaOption.f1967c == null) {
            throw new IllegalNaviArgumentException("startPoint and endPoint and endName and startName not all null.");
        }
        if (routeParaOption.f1967c == null && routeParaOption.f1965a == null) {
            throw new IllegalNaviArgumentException("startPoint and startName not all null.");
        }
        if (routeParaOption.f1968d == null && routeParaOption.f1966b == null) {
            throw new IllegalNaviArgumentException("endPoint and endName not all null.");
        }
        if (((routeParaOption.f1967c == null || routeParaOption.f1967c.equals("")) && routeParaOption.f1965a == null) || ((routeParaOption.f1968d == null || routeParaOption.f1968d.equals("")) && routeParaOption.f1966b == null)) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f == null) {
            routeParaOption.f = RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f1964a) {
                throw new IllegalPoiSearchArgumentException("BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 2);
            return true;
        } else if (baiduMapVersion >= 810) {
            return a.a(routeParaOption, context, 2);
        } else {
            Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
            if (!f1964a) {
                throw new IllegalPoiSearchArgumentException("Baidumap app version is too lowl.Version is greater than 8.1");
            }
            a(routeParaOption, context, 2);
            return true;
        }
    }

    public static void setSupportWebRoute(boolean z) {
        f1964a = z;
    }
}
