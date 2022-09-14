package com.baidu.mapapi.common;

import android.content.Context;
import com.baidu.platform.comapi.util.e;
import java.io.File;
/* loaded from: classes.dex */
public class EnvironmentUtilities {

    /* renamed from: a  reason: collision with root package name */
    static String f1522a;

    /* renamed from: b  reason: collision with root package name */
    static String f1523b;

    /* renamed from: c  reason: collision with root package name */
    static String f1524c;

    /* renamed from: d  reason: collision with root package name */
    static int f1525d;
    static int e;
    static int f;
    private static e g;

    public static String getAppCachePath() {
        return f1523b;
    }

    public static String getAppSDCardPath() {
        String str = f1522a + "/BaiduMapSDKNew";
        if (str.length() != 0) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str;
    }

    public static String getAppSecondCachePath() {
        return f1524c;
    }

    public static int getDomTmpStgMax() {
        return e;
    }

    public static int getItsTmpStgMax() {
        return f;
    }

    public static int getMapTmpStgMax() {
        return f1525d;
    }

    public static String getSDCardPath() {
        return f1522a;
    }

    public static void initAppDirectory(Context context) {
        String c2;
        if (g == null) {
            g = e.a();
            g.a(context);
        }
        if (f1522a == null || f1522a.length() <= 0) {
            f1522a = g.b().a();
            c2 = g.b().c();
        } else {
            c2 = f1522a + File.separator + "BaiduMapSDKNew" + File.separator + "cache";
        }
        f1523b = c2;
        f1524c = g.b().d();
        f1525d = 20971520;
        e = 52428800;
        f = 5242880;
    }

    public static void setSDCardPath(String str) {
        f1522a = str;
    }
}
