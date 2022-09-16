package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class s {
    public static int a(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void a() {
        c("Must not be called on the main application thread");
    }

    public static void a(Handler handler) {
        a(handler, "Must be called on the handler thread");
    }

    public static void a(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void a(String str) {
        if (com.google.android.gms.common.util.t.a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void a(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void c(String str) {
        if (!com.google.android.gms.common.util.t.a()) {
            return;
        }
        throw new IllegalStateException(str);
    }
}
