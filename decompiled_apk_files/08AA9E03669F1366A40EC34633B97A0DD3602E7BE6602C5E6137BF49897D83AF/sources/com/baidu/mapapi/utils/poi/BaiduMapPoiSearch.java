package com.baidu.mapapi.utils.poi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.utils.OpenClientUtil;
import com.baidu.mapapi.utils.route.BaiduMapRoutePlan;
import com.baidu.platform.comapi.a.d;
import com.google.android.gms.common.util.CrashUtils;
import java.util.List;
/* loaded from: classes.dex */
public class BaiduMapPoiSearch {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1956a = true;

    /* renamed from: com.baidu.mapapi.utils.poi.BaiduMapPoiSearch$1  reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1957a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1958b = new int[HttpClient.HttpStateError.values().length];

        static {
            try {
                f1958b[HttpClient.HttpStateError.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1958b[HttpClient.HttpStateError.INNER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1957a = new int[d.values().length];
            try {
                f1957a[d.PANO_UID_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1957a[d.PANO_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1957a[d.PANO_NO_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1957a[d.PANO_NO_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static void a(PoiParaOption poiParaOption, Context context) {
        Uri parse = Uri.parse("http://api.map.baidu.com/place/detail?uid=" + poiParaOption.f1959a + "&output=html&src=" + context.getPackageName());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        intent.setData(parse);
        context.startActivity(intent);
    }

    private static void b(PoiParaOption poiParaOption, Context context) {
        Uri parse = Uri.parse("http://api.map.baidu.com/place/search?query=" + poiParaOption.f1960b + "&location=" + poiParaOption.f1961c.latitude + "," + poiParaOption.f1961c.longitude + "&radius=" + poiParaOption.f1962d + "&output=html&src=" + context.getPackageName());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        intent.setData(parse);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Context context) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("pano id can not be null.");
        }
        if (context == null) {
            throw new RuntimeException("context cannot be null.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/streetscape?");
        sb.append("panoid=");
        sb.append(str);
        sb.append("&pid=");
        sb.append(str);
        sb.append("&panotype=");
        sb.append("street");
        sb.append("&src=");
        sb.append("sdk_[" + context.getPackageName() + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
        context.startActivity(intent);
    }

    public static boolean dispatchPoiToBaiduMap(List<DispathcPoiData> list, Context context) {
        String str;
        String str2;
        if (list.isEmpty() || list.size() <= 0) {
            throw new NullPointerException("dispatch poidata is null");
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            str = "baidumapsdk";
            str2 = "BaiduMap app is not installed.";
        } else if (baiduMapVersion >= 840) {
            return com.baidu.mapapi.utils.a.a(list, context, 6);
        } else {
            str = "baidumapsdk";
            str2 = "Baidumap app version is too lowl.Version is greater than 8.4";
        }
        Log.e(str, str2);
        return false;
    }

    public static void finish(Context context) {
        if (context != null) {
            com.baidu.mapapi.utils.a.a(context);
        }
    }

    public static void openBaiduMapPanoShow(String str, Context context) {
        new com.baidu.platform.comapi.a.a(context).a(str, new a(context));
    }

    public static boolean openBaiduMapPoiDetialsPage(PoiParaOption poiParaOption, Context context) {
        if (poiParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (poiParaOption.f1959a == null) {
            throw new IllegalPoiSearchArgumentException("poi uid can not be null.");
        }
        if (poiParaOption.f1959a.equals("")) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi uid can not be empty string");
            return false;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f1956a) {
                throw new IllegalPoiSearchArgumentException("BaiduMap app is not installed.");
            }
            a(poiParaOption, context);
            return true;
        } else if (baiduMapVersion >= 810) {
            return com.baidu.mapapi.utils.a.a(poiParaOption, context, 3);
        } else {
            Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
            if (!f1956a) {
                throw new IllegalPoiSearchArgumentException("Baidumap app version is too lowl.Version is greater than 8.1");
            }
            a(poiParaOption, context);
            return true;
        }
    }

    public static boolean openBaiduMapPoiNearbySearch(PoiParaOption poiParaOption, Context context) {
        if (poiParaOption == null || context == null) {
            throw new IllegalPoiSearchArgumentException("para or context can not be null.");
        }
        if (poiParaOption.f1960b == null) {
            throw new IllegalPoiSearchArgumentException("poi search key can not be null.");
        }
        if (poiParaOption.f1961c == null) {
            throw new IllegalPoiSearchArgumentException("poi search center can not be null.");
        }
        if (poiParaOption.f1961c.longitude == 0.0d || poiParaOption.f1961c.latitude == 0.0d) {
            throw new IllegalPoiSearchArgumentException("poi search center longitude or latitude can not be 0.");
        }
        if (poiParaOption.f1962d == 0) {
            throw new IllegalPoiSearchArgumentException("poi search radius larger than 0.");
        }
        if (poiParaOption.f1960b.equals("")) {
            Log.e(BaiduMapRoutePlan.class.getName(), "poi key can not be empty string");
            return false;
        }
        int baiduMapVersion = OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!f1956a) {
                throw new IllegalPoiSearchArgumentException("BaiduMap app is not installed.");
            }
            b(poiParaOption, context);
            return true;
        } else if (baiduMapVersion >= 810) {
            return com.baidu.mapapi.utils.a.a(poiParaOption, context, 4);
        } else {
            Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
            if (!f1956a) {
                throw new IllegalPoiSearchArgumentException("Baidumap app version is too lowl.Version is greater than 8.1");
            }
            b(poiParaOption, context);
            return true;
        }
    }

    public static void setSupportWebPoi(boolean z) {
        f1956a = z;
    }
}
