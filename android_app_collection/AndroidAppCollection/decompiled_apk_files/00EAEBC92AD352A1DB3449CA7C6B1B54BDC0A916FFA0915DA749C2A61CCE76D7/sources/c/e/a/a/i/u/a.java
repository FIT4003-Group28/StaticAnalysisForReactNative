package c.e.a.a.i.u;

import android.util.Log;
/* loaded from: classes.dex */
public final class a {
    private static String a(String str) {
        return "TransportRuntime." + str;
    }

    public static void a(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void a(String str, String str2, Object obj) {
        Log.d(a(str), String.format(str2, obj));
    }

    public static void a(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void a(String str, String str2, Object... objArr) {
        Log.d(a(str), String.format(str2, objArr));
    }

    public static void b(String str, String str2, Object obj) {
        Log.w(a(str), String.format(str2, obj));
    }
}
