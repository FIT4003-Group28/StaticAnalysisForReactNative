package com.baidu.platform.comapi.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.baidu.android.bbalbs.common.util.CommonParam;
import com.baidu.mapapi.VersionInfo;
import ezvcard.property.Kind;
import org.spongycastle.crypto.tls.CipherSuite;
/* loaded from: classes.dex */
public class f {
    public static String A = null;
    private static final String B = "f";
    private static boolean C = true;
    private static int D = 0;
    private static int E = 0;

    /* renamed from: b  reason: collision with root package name */
    static String f2134b = "02";

    /* renamed from: c  reason: collision with root package name */
    static String f2135c = null;

    /* renamed from: d  reason: collision with root package name */
    static String f2136d = null;
    static String e = null;
    static String f = null;
    static int g = 0;
    static int h = 0;
    static int i = 0;
    static int j = 0;
    static int k = 0;
    static int l = 0;
    static String m = null;
    static String n = null;
    static String o = "baidu";
    static String p = "baidu";
    static String q = "";
    static String r = "";
    static String s = "";
    static String t = null;
    static String u = null;
    static String v = "-1";
    static String w = "-1";
    public static Context x = null;
    public static float z = 1.0f;

    /* renamed from: a  reason: collision with root package name */
    static com.baidu.platform.comjni.map.commonmemcache.a f2133a = new com.baidu.platform.comjni.map.commonmemcache.a();
    public static final int y = Integer.parseInt(Build.VERSION.SDK);

    public static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("cpu", q);
        bundle.putString("resid", f2134b);
        bundle.putString("channel", o);
        bundle.putString("glr", r);
        bundle.putString("glv", s);
        bundle.putString("mb", f());
        bundle.putString("sv", h());
        bundle.putString("os", j());
        bundle.putInt("dpi_x", k());
        bundle.putInt("dpi_y", k());
        bundle.putString("net", m);
        bundle.putString("cuid", m());
        bundle.putByteArray("signature", a(x));
        bundle.putString("pcn", x.getPackageName());
        bundle.putInt("screen_x", g());
        bundle.putInt("screen_y", i());
        return bundle;
    }

    public static void a(String str) {
        m = str;
        e();
    }

    public static void a(String str, String str2) {
        v = str2;
        w = str;
        e();
    }

    public static byte[] a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void b() {
        if (f2133a != null) {
            f2133a.a();
        }
    }

    public static void b(Context context) {
        x = context;
        t = context.getFilesDir().getAbsolutePath();
        u = context.getCacheDir().getAbsolutePath();
        f2136d = Build.MODEL;
        e = "Android" + Build.VERSION.SDK;
        f2135c = context.getPackageName();
        c(context);
        d(context);
        e(context);
        f(context);
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(Kind.LOCATION);
            D = locationManager.isProviderEnabled("gps") ? 1 : 0;
            E = locationManager.isProviderEnabled("network") ? 1 : 0;
        } catch (Exception unused) {
            Log.w("baidumapsdk", "LocationManager error");
        }
    }

    public static String c() {
        if (f2133a != null) {
            return f2133a.b();
        }
        return null;
    }

    private static void c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            f = VersionInfo.getApiVersion();
            if (f != null && !f.equals("")) {
                f = f.replace('_', '.');
            }
            g = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            f = "1.0.0";
            g = 1;
        }
    }

    public static String d() {
        return m;
    }

    private static void d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        if (defaultDisplay != null) {
            h = defaultDisplay.getWidth();
            i = defaultDisplay.getHeight();
            defaultDisplay.getMetrics(displayMetrics);
        }
        z = displayMetrics.density;
        j = (int) displayMetrics.xdpi;
        k = (int) displayMetrics.ydpi;
        if (y > 3) {
            l = displayMetrics.densityDpi;
        } else {
            l = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
        }
        if (l == 0) {
            l = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
        }
    }

    public static void e() {
        Bundle bundle = new Bundle();
        bundle.putString("cpu", q);
        bundle.putString("resid", f2134b);
        bundle.putString("channel", o);
        bundle.putString("glr", r);
        bundle.putString("glv", s);
        bundle.putString("mb", f());
        bundle.putString("sv", h());
        bundle.putString("os", j());
        bundle.putInt("dpi_x", k());
        bundle.putInt("dpi_y", k());
        bundle.putString("net", m);
        bundle.putString("cuid", m());
        bundle.putString("pcn", x.getPackageName());
        bundle.putInt("screen_x", g());
        bundle.putInt("screen_y", i());
        bundle.putString("appid", v);
        bundle.putString("duid", w);
        if (!TextUtils.isEmpty(A)) {
            bundle.putString("token", A);
        }
        if (f2133a != null) {
            f2133a.a(bundle);
        }
    }

    private static void e(Context context) {
        n = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String f() {
        return f2136d;
    }

    private static void f(Context context) {
        m = "0";
    }

    public static int g() {
        return h;
    }

    public static String h() {
        return f;
    }

    public static int i() {
        return i;
    }

    public static String j() {
        return e;
    }

    public static int k() {
        return l;
    }

    public static String l() {
        return t;
    }

    public static String m() {
        String str;
        try {
            str = CommonParam.a(x);
        } catch (Exception unused) {
            str = "";
        }
        return str == null ? "" : str;
    }
}
