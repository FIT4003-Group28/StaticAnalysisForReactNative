package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cmmn  reason: default package */
/* loaded from: classes5.dex */
public final class cmmn {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void d(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static <T> T e(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    public static <T> T f(T t) {
        t.getClass();
        return t;
    }

    public static void g(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T> void i(T t, Object obj) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }
}
