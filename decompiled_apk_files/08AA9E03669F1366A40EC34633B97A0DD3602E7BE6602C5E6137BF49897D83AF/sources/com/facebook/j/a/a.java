package com.facebook.j.a;
/* compiled from: Assertions.java */
/* loaded from: classes.dex */
public class a {
    public static <T> T a(T t) {
        return t;
    }

    public static <T> T b(T t) {
        if (t == null) {
            throw new AssertionError();
        }
        return t;
    }

    public static <T> T a(T t, String str) {
        if (t == null) {
            throw new AssertionError(str);
        }
        return t;
    }

    public static void a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
