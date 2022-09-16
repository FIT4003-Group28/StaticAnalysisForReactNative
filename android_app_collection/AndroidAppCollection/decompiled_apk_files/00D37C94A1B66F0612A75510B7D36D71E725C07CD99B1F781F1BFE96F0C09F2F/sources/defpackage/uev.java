package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: uev  reason: default package */
/* loaded from: classes4.dex */
public final class uev {
    public static boolean a = false;
    public static final uew b = new uew();

    public static void a(String str, String str2, Object... objArr) {
        if (b.b(3)) {
            uew.a(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (b.b(6)) {
            Log.e("Notifications", uew.a(str, str2, objArr));
        }
    }

    public static void c(String str, Throwable th, String str2, Object... objArr) {
        if (b.b(6)) {
            Log.e("Notifications", uew.a(str, str2, objArr), th);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (b.b(4)) {
            uew.a(str, str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (b.b(2)) {
            uew.a(str, str2, objArr);
        }
    }

    public static void f(String str, Throwable th, String str2, Object... objArr) {
        if (b.b(5)) {
            Log.w("Notifications", uew.a(str, str2, objArr), th);
        }
    }

    public static void g(String str, String str2, Object... objArr) {
        if (b.b(2)) {
            uew.a(str, str2, objArr);
        }
    }
}
