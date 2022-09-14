package a.g.l;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f290a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f291b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i >= 24) {
                return;
            }
            try {
                f291b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                return;
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls == null) {
                return;
            }
            f290a = cls.getMethod("getScript", String.class);
            f291b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e3) {
            f290a = null;
            f291b = null;
            Log.w("ICUCompat", e3);
        }
    }

    private static String a(String str) {
        try {
            if (f290a != null) {
                return (String) f290a.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f291b != null) {
                return (String) f291b.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    public static String b(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f291b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String a2 = a(locale);
        if (a2 == null) {
            return null;
        }
        return a(a2);
    }
}
