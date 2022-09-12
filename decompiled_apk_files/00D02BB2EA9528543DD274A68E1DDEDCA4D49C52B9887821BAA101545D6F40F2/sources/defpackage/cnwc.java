package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cnwc  reason: default package */
/* loaded from: classes.dex */
public final class cnwc {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void c(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static void e(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void f(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void g(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void h() {
        i("Must not be called on the main application thread");
    }

    public static void i(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void j(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void k(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void l(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void m(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static <T> void n(T t, Object obj) {
        if (t != null) {
            return;
        }
        throw new NullPointerException((String) obj);
    }
}
