package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
/* compiled from: PG */
@Deprecated
/* renamed from: dpc  reason: default package */
/* loaded from: classes3.dex */
public final class dpc {
    @Deprecated
    public static void a(Context context) {
        HashMap hashMap;
        if (!TextUtils.isEmpty("<Android_YT_Open_App>")) {
            hashMap = new HashMap();
            if (!TextUtils.isEmpty("<Android_YT_Open_App>")) {
                hashMap.put("screen_name", "<Android_YT_Open_App>");
            }
        } else {
            hashMap = null;
        }
        doh a = doh.a(context);
        synchronized (a.a) {
            if (!a.b.contains("1001680686") && !a.c.containsKey("1001680686")) {
                a.e.b("1001680686", a.d);
                a.c.put("1001680686", Long.valueOf(a.d));
            }
        }
        try {
            doo dooVar = new doo();
            dooVar.a = "1001680686";
            dooVar.c = true;
            dooVar.d = hashMap;
            dooVar.b = a.c.containsKey("1001680686");
            dod.a(context, dooVar);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }

    public static css b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                c(cls, e);
            } catch (InstantiationException e2) {
                c(cls, e2);
            } catch (NoSuchMethodException e3) {
                c(cls, e3);
            } catch (InvocationTargetException e4) {
                c(cls, e4);
            }
            if (!(obj instanceof css)) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Expected instanceof GlideModule, but found: ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
            return (css) obj;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void c(Class cls, Exception exc) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString(), exc);
    }
}
