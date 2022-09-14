package com.teslamotors.plugins.client.b;

import android.content.Context;
import com.teslamotors.plugins.client.d.d;
import java.util.Collections;
import java.util.Set;
/* compiled from: ConfigDataV3.java */
/* loaded from: classes.dex */
public class b {
    public static String a(Context context) {
        return d.a().b("OWNERAPI_AUTH_TOKEN", d.d(context));
    }

    public static String b(Context context) {
        return d.a().b("SELECTED_PRODUCT", d.d(context));
    }

    public static boolean c(Context context) {
        String b2 = d.a().b("CALENDAR_SYNC_ENABLED", d.e(context));
        if (b2 != null) {
            return Boolean.valueOf(b2).booleanValue();
        }
        return false;
    }

    public static String d(Context context) {
        return d.a().b("APP_PREVIOUSLY_LAUNCHED", d.e(context));
    }

    public static String e(Context context) {
        return d.a().b("APP_UUID", d.d(context));
    }

    public static String f(Context context) {
        return d.a().b("ACCOUNT_EMAIL", d.d(context));
    }

    public static String g(Context context) {
        return d.a().b("REMOTE_NOTIFICATION_TOKEN", d.d(context));
    }

    public static void a(Context context, String str) {
        d.a().a("REMOTE_NOTIFICATION_TOKEN", str, true, d.d(context));
    }

    public static String h(Context context) {
        return d.a().b("COLORIZED_IMAGE_DIRECTORY_HASH", d.e(context));
    }

    public static void b(Context context, String str) {
        d.a().a("COLORIZED_IMAGE_DIRECTORY_HASH", str, true, d.e(context));
    }

    public static void c(Context context, String str) {
        d.a().a("APP_GIT_HASH", str, true, d.e(context));
    }

    public static String i(Context context) {
        return d.a().b("APP_GIT_HASH", d.e(context));
    }

    public static void j(Context context) {
        d.a().a("REFER_FRIENDS_VERSION", true, d.e(context));
    }

    public static void k(Context context) {
        d.a().a("REFER_FRIENDS_HAS_SEEN_SPLASH", true, d.e(context));
    }

    public static void a(String str, Set<String> set, Context context) {
        d.a().a(str, set, d.f(context));
    }

    public static Set<String> a(String str, Context context) {
        return d.a().a(str, d.f(context), Collections.EMPTY_SET);
    }

    public static long a(long j, String str, Context context) {
        return d.a().a(str, j, d.f(context));
    }

    public static long b(String str, Context context) {
        return d.a().a(str, d.f(context));
    }

    public static void c(String str, Context context) {
        d.a().a("SELECTED_VIN", str, true, d.e(context));
    }

    public static String l(Context context) {
        return d.a().b("SELECTED_VIN", d.e(context));
    }

    public static void d(Context context, String str) {
        d.a().a("SHARED_SELECTED_PRODUCT_DATA", str, true, d.d(context));
    }

    public static String m(Context context) {
        return d.a().b("SHARED_SELECTED_PRODUCT_DATA", d.d(context));
    }

    public static void d(String str, Context context) {
        d.a().a("KEY_STORE_PASS", str, true, d.f(context));
    }

    public static String n(Context context) {
        return d.a().b("KEY_STORE_PASS", d.f(context));
    }

    public static long b(long j, String str, Context context) {
        return d.a().a(str, j, d.f(context));
    }

    public static long e(String str, Context context) {
        return d.a().a(str, d.f(context));
    }

    public static String f(String str, Context context) {
        return d.a().b(str, d.f(context));
    }

    public static void a(String str, String str2, Context context) {
        d.a().a(str, str2, true, d.f(context));
    }
}
