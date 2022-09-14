package com.baidu.mapapi.navi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.baidu.mapapi.VersionInfo;
import com.baidu.mapapi.a.a.a;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.utils.OpenClientUtil;
import com.google.android.gms.common.util.CrashUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class BaiduMapNavigation extends a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1772a = true;

    private static String a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        try {
            packageManager = context.getApplicationContext().getPackageManager();
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

    private static void a(NaviParaOption naviParaOption, Context context) {
        String str;
        String str2;
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("para or context can not be null.");
        }
        if (naviParaOption.f1773a == null || naviParaOption.f1775c == null) {
            throw new IllegalNaviArgumentException("you must set start and end point.");
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(naviParaOption.f1773a);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(naviParaOption.f1775c);
        StringBuilder sb = new StringBuilder();
        sb.append("http://app.navi.baidu.com/mobile/#navi/naving/");
        sb.append("&sy=0");
        sb.append("&endp=");
        sb.append("&start=");
        sb.append("&startwd=");
        sb.append("&endwd=");
        sb.append("&fromprod=map_sdk");
        sb.append("&app_version=");
        sb.append(VersionInfo.VERSION_INFO);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("type", "1");
            if (naviParaOption.f1774b == null || naviParaOption.f1774b.equals("")) {
                str = "keyword";
                str2 = "";
            } else {
                str = "keyword";
                str2 = naviParaOption.f1774b;
            }
            jSONObject.put(str, str2);
            jSONObject.put("xy", String.valueOf(ll2mc.getLongitudeE6()) + "," + String.valueOf(ll2mc.getLatitudeE6()));
            jSONArray.put(jSONObject);
            jSONObject2.put("type", "1");
            if (naviParaOption.f1776d == null || naviParaOption.f1776d.equals("")) {
                jSONObject.put("keyword", "");
            } else {
                jSONObject.put("keyword", naviParaOption.f1776d);
            }
            jSONObject2.put("xy", String.valueOf(ll2mc2.getLongitudeE6()) + "," + String.valueOf(ll2mc2.getLatitudeE6()));
            jSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (jSONArray.length() > 0) {
            sb.append("&positions=");
            sb.append(jSONArray.toString());
        }
        sb.append("&ctrl_type=");
        sb.append("&mrsl=");
        sb.append("/vt=map&state=entry");
        Uri parse = Uri.parse(sb.toString());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        intent.setData(parse);
        context.startActivity(intent);
    }

    public static void finish(Context context) {
        if (context != null) {
            com.baidu.mapapi.utils.a.a(context);
        }
    }

    public static boolean openBaiduMapBikeNavi(NaviParaOption naviParaOption, Context context) {
        String str;
        String str2;
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("para or context can not be null.");
        }
        if (naviParaOption.f1775c == null || naviParaOption.f1773a == null) {
            throw new IllegalNaviArgumentException("start point or end point can not be null.");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            str = "baidumapsdk";
            str2 = "BaiduMap app is not installed.";
        } else if (baiduMapVersion >= 869) {
            return com.baidu.mapapi.utils.a.a(naviParaOption, context, 8);
        } else {
            str = "baidumapsdk";
            str2 = "Baidumap app version is too lowl.Version is greater than 8.6.6";
        }
        Log.e(str, str2);
        return false;
    }

    public static boolean openBaiduMapNavi(NaviParaOption naviParaOption, Context context) {
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("para or context can not be null.");
        }
        if (naviParaOption.f1775c == null || naviParaOption.f1773a == null) {
            throw new IllegalNaviArgumentException("start point or end point can not be null.");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f1772a) {
                throw new BaiduMapAppNotSupportNaviException("BaiduMap app is not installed.");
            }
            a(naviParaOption, context);
            return true;
        } else if (baiduMapVersion >= 830) {
            return com.baidu.mapapi.utils.a.a(naviParaOption, context, 5);
        } else {
            Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.2");
            if (!f1772a) {
                throw new BaiduMapAppNotSupportNaviException("Baidumap app version is too lowl.Version is greater than 8.2");
            }
            a(naviParaOption, context);
            return true;
        }
    }

    public static boolean openBaiduMapWalkNavi(NaviParaOption naviParaOption, Context context) {
        String str;
        String str2;
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("para or context can not be null.");
        }
        if (naviParaOption.f1775c == null || naviParaOption.f1773a == null) {
            throw new IllegalNaviArgumentException("start point or end point can not be null.");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            str = "baidumapsdk";
            str2 = "BaiduMap app is not installed.";
        } else if (baiduMapVersion >= 869) {
            return com.baidu.mapapi.utils.a.a(naviParaOption, context, 7);
        } else {
            str = "baidumapsdk";
            str2 = "Baidumap app version is too lowl.Version is greater than 8.6.6";
        }
        Log.e(str, str2);
        return false;
    }

    @Deprecated
    public static void openWebBaiduMapNavi(NaviParaOption naviParaOption, Context context) {
        Uri parse;
        Intent intent;
        if (naviParaOption == null || context == null) {
            throw new IllegalNaviArgumentException("para or context can not be null.");
        }
        if (naviParaOption.f1773a != null && naviParaOption.f1775c != null) {
            GeoPoint ll2mc = CoordUtil.ll2mc(naviParaOption.f1773a);
            GeoPoint ll2mc2 = CoordUtil.ll2mc(naviParaOption.f1775c);
            parse = Uri.parse("http://daohang.map.baidu.com/mobile/#navi/naving/start=" + ll2mc.getLongitudeE6() + "," + ll2mc.getLatitudeE6() + "&endp=" + ll2mc2.getLongitudeE6() + "," + ll2mc2.getLatitudeE6() + "&fromprod=" + a(context) + "/vt=map&state=entry");
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        } else if (naviParaOption.f1774b == null || naviParaOption.f1774b.equals("") || naviParaOption.f1776d == null || naviParaOption.f1776d.equals("")) {
            throw new IllegalNaviArgumentException("you must set start and end point or set the start and end name.");
        } else {
            parse = Uri.parse("http://daohang.map.baidu.com/mobile/#search/search/qt=nav&sn=2$$$$$$" + naviParaOption.f1774b + "$$$$$$&en=2$$$$$$" + naviParaOption.f1776d + "$$$$$$&fromprod=" + a(context));
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
        }
        intent.setData(parse);
        context.startActivity(intent);
    }

    public static void setSupportWebNavi(boolean z) {
        f1772a = z;
    }
}
