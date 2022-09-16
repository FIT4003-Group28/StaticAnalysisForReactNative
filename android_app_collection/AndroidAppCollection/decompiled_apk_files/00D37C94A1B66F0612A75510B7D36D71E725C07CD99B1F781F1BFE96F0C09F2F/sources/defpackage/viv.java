package defpackage;

import android.util.Log;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: viv  reason: default package */
/* loaded from: classes4.dex */
public final class viv {
    private static final Method a;

    static {
        Method method = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
            cls.getMethod("getInt", String.class, Integer.TYPE);
            cls.getMethod("getLong", String.class, Long.TYPE);
            cls.getMethod("getBoolean", String.class, Boolean.TYPE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a = method;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) a.invoke(null, str, str2);
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
            return str2;
        }
    }
}
