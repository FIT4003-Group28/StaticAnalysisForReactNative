package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwuu  reason: default package */
/* loaded from: classes.dex */
public final class cwuu {
    static volatile boolean a;
    public static final /* synthetic */ int b = 0;
    private static volatile ActivityManager c;

    private cwuu() {
    }

    public static ActivityManager a(Context context) {
        if (c == null) {
            synchronized (cwuu.class) {
                if (c == null) {
                    c = (ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return c;
    }

    public static boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.contains(context.getPackageName()) && (Build.VERSION.SDK_INT >= 23 || c(context))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r2 == null) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d() {
        /*
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 > 0) goto L8
            goto L46
        L8:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            r5 = 25
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            r4.append(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            java.lang.String r0 = "/cmdline"
            r4.append(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L42
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
        L32:
            r2.close()     // Catch: java.io.IOException -> L46
            goto L46
        L36:
            r0 = move-exception
            r1 = r2
            goto L3c
        L39:
            goto L43
        L3b:
            r0 = move-exception
        L3c:
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.io.IOException -> L41
        L41:
            throw r0
        L42:
            r2 = r1
        L43:
            if (r2 == 0) goto L46
            goto L32
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwuu.d():java.lang.String");
    }
}
