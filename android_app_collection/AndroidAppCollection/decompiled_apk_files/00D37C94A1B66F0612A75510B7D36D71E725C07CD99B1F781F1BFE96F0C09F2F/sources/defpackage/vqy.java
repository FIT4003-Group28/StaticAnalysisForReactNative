package defpackage;

import android.util.Log;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: vqy  reason: default package */
/* loaded from: classes4.dex */
public final class vqy {
    private static final String a = "L";
    private static final String b = "vqy";

    private vqy() {
    }

    public static void a(String str) {
        f(4, str, null);
    }

    public static void b(String str) {
        f(1, str, null);
    }

    public static void c(String str, Throwable th) {
        f(1, str, th);
    }

    public static void d(String str) {
        f(2, str, null);
    }

    public static void e(String str, Throwable th) {
        f(2, str, th);
    }

    public static void f(int i, String str, Throwable th) {
        String str2;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str2 = "(unknown)";
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            String className = stackTraceElement.getClassName();
            if (!className.equals(b) && className.startsWith("com.google.android.")) {
                String substring = className.substring(19);
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 13 + String.valueOf(methodName).length());
                sb.append(substring);
                sb.append(".");
                sb.append(methodName);
                sb.append(":");
                sb.append(lineNumber);
                str2 = sb.toString();
                break;
            }
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(str);
        String sb3 = sb2.toString();
        int i3 = i - 1;
        if (i3 == 0) {
            Log.e(a, sb3, th);
        } else if (i3 != 1) {
        } else {
            Log.w(a, sb3, th);
        }
    }

    static {
        Pattern.compile("");
    }
}
