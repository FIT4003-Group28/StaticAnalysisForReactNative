package android.support.v4.h;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* compiled from: ICUCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f425a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f426b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f426b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                return;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls == null) {
                return;
            }
            f425a = cls.getMethod("getScript", String.class);
            f426b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e2) {
            f425a = null;
            f426b = null;
            Log.w("ICUCompat", e2);
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f426b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String b2 = b(locale);
        if (b2 == null) {
            return null;
        }
        return a(b2);
    }

    private static String a(String str) {
        try {
            if (f425a != null) {
                return (String) f425a.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    private static String b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f426b != null) {
                return (String) f426b.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }
}
