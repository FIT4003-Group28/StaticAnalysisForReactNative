package com.facebook.react.bridge;
/* compiled from: SoftAssertions.java */
/* loaded from: classes.dex */
public class ao {
    public static void a(String str) {
        throw new c(str);
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new c(str);
        }
    }

    public static <T> T a(T t) {
        if (t == null) {
            throw new c("Expected object to not be null!");
        }
        return t;
    }
}
