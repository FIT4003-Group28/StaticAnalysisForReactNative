package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.util.Locale;
/* compiled from: AndroidInfoHelpers.java */
/* loaded from: classes.dex */
public class a {
    private static boolean c() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean d() {
        return Build.FINGERPRINT.contains("generic");
    }

    public static String a() {
        return a(8081);
    }

    public static String b() {
        if (c()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    private static String a(int i) {
        String str;
        if (c()) {
            str = "10.0.3.2";
        } else {
            str = d() ? "10.0.2.2" : "localhost";
        }
        return String.format(Locale.US, "%s:%d", str, Integer.valueOf(i));
    }
}
