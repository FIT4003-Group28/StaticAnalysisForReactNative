package defpackage;

import android.content.Context;
import android.util.Log;
/* compiled from: PG */
/* renamed from: qfl  reason: default package */
/* loaded from: classes4.dex */
public final class qfl {
    static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            StringBuilder sb = new StringBuilder(str.length() + 13);
            sb.append(str);
            sb.append(" @");
            sb.append(lineNumber);
            return sb.toString();
        }
        return str;
    }

    public static void b(String str) {
        Log.e("Ads", str);
    }

    public static void c(Throwable th) {
        d("", th);
    }

    public static void d(String str, Throwable th) {
        Log.e("Ads", str, th);
    }

    public static void e(String str) {
        Log.w("Ads", str);
    }

    public static void f(String str, Throwable th) {
        Log.w("Ads", str, th);
    }

    public static void g(String str) {
        h(str, null);
    }

    public static void h(String str, Throwable th) {
        if (th != null) {
            f(a(str), th);
        } else {
            e(a(str));
        }
    }

    public static int i(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static qie j(Context context) {
        return new qiq(context);
    }
}
