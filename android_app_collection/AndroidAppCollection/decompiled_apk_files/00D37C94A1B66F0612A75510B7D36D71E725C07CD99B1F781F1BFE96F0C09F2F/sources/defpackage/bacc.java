package defpackage;

import android.util.Log;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bacc  reason: default package */
/* loaded from: classes2.dex */
public final class bacc {
    private bacc() {
    }

    public static String a(String str, Throwable th, Object... objArr) {
        return ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr);
    }

    public static String b(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = true != str.startsWith("cr.") ? 0 : 3;
        return "cr_" + str.substring(i, str.length());
    }

    public static Throwable c(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return null;
        }
        Object obj = objArr[length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static void d(String str, String str2, Object... objArr) {
        Throwable c = c(objArr);
        String a = a(str2, c, objArr);
        if (c != null) {
            Log.e(b(str), a, c);
        } else {
            Log.e(b(str), a);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        Throwable c = c(objArr);
        a(str2, c, objArr);
        if (c != null) {
            b(str);
        } else {
            b(str);
        }
    }

    public static void f(String str, String str2, Object... objArr) {
        Throwable c = c(objArr);
        String a = a(str2, c, objArr);
        if (c != null) {
            Log.w(b(str), a, c);
        } else {
            Log.w(b(str), a);
        }
    }
}
