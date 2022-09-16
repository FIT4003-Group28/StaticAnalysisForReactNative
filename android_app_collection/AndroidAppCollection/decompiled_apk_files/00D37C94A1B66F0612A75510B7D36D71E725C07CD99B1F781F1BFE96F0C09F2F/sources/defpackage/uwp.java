package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: uwp  reason: default package */
/* loaded from: classes4.dex */
public class uwp {
    private static Thread a;
    private static volatile Handler b;

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static Handler c() {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return b;
    }

    public static void e() {
        if (!j()) {
            return;
        }
        throw new RuntimeException("Must be called on a background thread");
    }

    public static void f() {
        if (j()) {
            return;
        }
        throw new RuntimeException("Must be called on the UI thread");
    }

    public static void g(Runnable runnable, long j) {
        c().postDelayed(runnable, j);
    }

    public static void h(Runnable runnable) {
        c().post(runnable);
    }

    public static void i(Runnable runnable) {
        c().removeCallbacks(runnable);
    }

    public static boolean j() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static String k(String str, Object... objArr) {
        return str + '(' + TextUtils.join(",", objArr) + ')';
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
