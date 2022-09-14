package defpackage;

import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: czhy  reason: default package */
/* loaded from: classes.dex */
public final class czhy {
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
            deki.b(e);
        } finally {
            a = method;
        }
    }

    public static String a(String str, @dzsi String str2) {
        try {
            return (String) a.invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
