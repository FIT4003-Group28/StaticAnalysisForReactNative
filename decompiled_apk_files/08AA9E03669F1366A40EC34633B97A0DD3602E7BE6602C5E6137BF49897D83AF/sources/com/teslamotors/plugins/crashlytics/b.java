package com.teslamotors.plugins.crashlytics;

import android.content.Context;
import b.a.a.a.c;
import com.crashlytics.android.Crashlytics;
import java.util.Map;
/* compiled from: TMCrashlyticsNative.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5377a = "b";

    public static void a(Context context) {
        if (context != null) {
            c.a(context, new Crashlytics());
        }
    }

    public static void a(String str) {
        Crashlytics.getInstance();
        if (str == null) {
            str = "NOT LOGGED IN";
        }
        Crashlytics.setUserName(str);
    }

    public static void a(Throwable th) {
        Crashlytics.logException(th);
    }

    public static void a(String str, Integer num, Map<String, Object> map) {
        Crashlytics.setString("nserror-domain", str);
        Crashlytics.setInt("nserror-code", num.intValue());
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof String) {
                    Crashlytics.setString(entry.getKey(), (String) entry.getValue());
                } else if (entry.getValue() instanceof Integer) {
                    Crashlytics.setInt(entry.getKey(), ((Integer) entry.getValue()).intValue());
                } else if (entry.getValue() instanceof Double) {
                    Crashlytics.setDouble(entry.getKey(), ((Double) entry.getValue()).doubleValue());
                } else if (entry.getValue() instanceof Boolean) {
                    Crashlytics.setBool(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }
        Crashlytics.logException(new RuntimeException(str));
    }
}
